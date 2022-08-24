<<<<<<< HEAD
package DAO;

import java.util.Set;

import Models.User;

public interface InterfaceDao {
	
	public boolean insert(User user);
	
	public Set<User> select();
	
	public boolean update(int id,User user);
	
	public void delete(int id); 
	

}
=======
package DAO;

import java.util.Set;

import Models.User;

public interface InterfaceDao {
	
	public boolean insert(User user);
	
	public Set<User> select();
	
	public boolean update(int id,User user);
	
	public void delete(int id); 
	

}
>>>>>>> fbf558e1d5a02f2cb34c27c924b1e54a4f44962a
