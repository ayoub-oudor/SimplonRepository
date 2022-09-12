package simplonSky.configuration;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import simplonSky.entity.JwtRequest;
import simplonSky.entity.JwtResponse;
import simplonSky.entity.User;
import simplonSky.repository.UserRepository;

public class JwtService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;
	 
	@Autowired
	private JwtTokenUtil jwtUtil;
	
	String role;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	public JwtResponse createJwtToken(JwtRequest jwtRequest) throws Exception{
		String username = jwtRequest.getUsername();
		String password = jwtRequest.getPassword();	
		authenticate(username, password);
		final UserDetails userDetails = loadUserByUsername(username);
		String newGeneratedToken = jwtUtil.generateToken(userDetails);
		User user = userRepository.findByEmail(username);
		return new JwtResponse(newGeneratedToken);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		  if ( username == null || username.isEmpty() ){
		        throw new UsernameNotFoundException("email is empty");
		    }

		    User foundUser = userRepository.findByEmail(username);
		    if( foundUser != null ){
		        System.out.println("FOUND");
		        return foundUser.toCurrentUserDetails();

		    }
		    throw new UsernameNotFoundException( username + "is not found");
		}

	
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();

        list.add(new SimpleGrantedAuthority("ROLE_" + role));

        return list;
    }
	
	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		}
		catch(DisabledException e){
			throw new Exception("USER_DISABLED", e);
		}catch(BadCredentialsException e){
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}

}
