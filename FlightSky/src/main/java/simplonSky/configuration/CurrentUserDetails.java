package simplonSky.configuration;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;
import lombok.ToString;
import simplonSky.entity.Roles;
import simplonSky.entity.User;


@ToString
@Data
public class CurrentUserDetails implements UserDetails {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String email;
	@SuppressWarnings("unused")
	private String password;
	private Roles roles;
	
	public CurrentUserDetails(Long id, String email, String password, Roles roles) {
	    super();
	    this.id = id;
	    this.email = email;
	    this.password = password;
	    this.roles = roles;
	}
	
	@Override
	public String getPassword() {
		return null;
	}

	@Override
	public String getUsername() {
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	public static UserDetails create(User entity) {
	    System.out.println(entity.getId()+ entity.getEmail()+ entity.getPassword()+ entity.getRoles());
	    return new CurrentUserDetails(entity.getId(), entity.getEmail(), entity.getPassword(), entity.getRoles());
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	    return null;
	}


}