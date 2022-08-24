package dao;

import java.sql.Statement; 
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Employee;
import util.HibernateUtil;
 
public class EmployeeDao implements InterfaceDao<Employee> {
	Statement statement;  

	public void saveUser(Employee emp) {
		Transaction transaction = null; 
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {   //getCurrentSession
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(emp);
            // commit transaction 
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }		
	}
	
	public void updateUser(Employee emp) {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(emp);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }		
	}

	public boolean  getUser(String username, String password) {
        Transaction transaction = null;
        Employee emp = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            emp = session.get(Employee.class, username);
            emp = session.get(Employee.class, password);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return false;
	}
	
	
    @SuppressWarnings("unchecked")
	public List<Employee> getAllUser() {
    	Transaction transaction = null;
        List < Employee > listOfUser = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object

            listOfUser = session.createQuery("from employee").getResultList();

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return listOfUser;
	}

	public void deleteUser(int id) {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // Delete a user object
            Employee emp = session.get(Employee.class, id);
            if (emp != null) {
                session.delete(emp);
                System.out.println("Employee is deleted");
            }

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }		
	}

	@Override
	public boolean getUser(int id) {
        Transaction transaction = null;
        Employee emp = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            emp = session.get(Employee.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return false;
	}


	

		
	

}
