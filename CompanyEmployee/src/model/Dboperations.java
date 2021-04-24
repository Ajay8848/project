package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.Admin;
import bean.Employee;

public class Dboperations {

	Connection con = null;
	ResultSet rs = null;
	public Connection getConnection() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public int addEmployee(Employee e) {
		con=getConnection();
		int i = 0;
		if(con!= null) {
			String sql = "insert into employee values (?,?,?,?,?,?,?,?,?)";
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setInt(1, e.getId());
				pst.setString(2, e.getName());
				pst.setString(3, e.getAddress());
				pst.setInt(4, e.getContact());
				pst.setString(5, e.getDepartment());
				pst.setInt(6, e.getSalary());
				pst.setString(7, e.getE_mail());
				pst.setString(8, e.getUsername());
				pst.setString(9, e.getPassword());
				
				 i = pst.executeUpdate();
				 con.close();
				
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
		}else {
			System.out.println("not Connected");
		}
		return i;
	}
	
	public ArrayList<Employee> getEmployeeList(){
		con = getConnection();
		ArrayList<Employee> emp_lst = new ArrayList<Employee>();
		if(con != null) {
			try {
				Statement st = con.createStatement();
				rs=st.executeQuery("select * from employee");
				while(rs.next()) {
					Employee e = new Employee();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setAddress(rs.getString(3));
					e.setContact(rs.getInt(4));
					e.setDepartment(rs.getString(5));
					e.setSalary(rs.getInt(6));
					e.setE_mail(rs.getString(7));
					e.setUsername(rs.getString(8));
					e.setPassword(rs.getString(9));
					
					emp_lst.add(e);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return emp_lst;
	}
	
	public int updateEmployeeById(Employee e) {
		con=getConnection();
		int i = 0;
		if(con!= null) {
			String sql = "update employee set emp_name=?,emp_address=?,emp_contact=?,emp_Dept=?,emp_salary=?,emp_email=?,emp_uname=?,emp_password=? where emp_id=?";
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				
				pst.setString(1, e.getName());
				pst.setString(2, e.getAddress());
				pst.setInt(3, e.getContact());
				pst.setString(4, e.getDepartment());
				pst.setInt(5, e.getSalary());
				pst.setString(6, e.getE_mail());
				pst.setString(7, e.getUsername());
				pst.setString(8, e.getPassword());
				pst.setInt(9, e.getId());
				 i = pst.executeUpdate();
				 con.close();
				
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
		}else {
			System.out.println("not Connected");
		}
		return i;
	}
	
	public Employee getEmployeeById(int emp_id) {

		con = getConnection();
		Employee e = new Employee();
		if(con!=null) {
			System.out.println(emp_id);
			String sql = "select * from employee where emp_id=?";
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setInt(1, emp_id);
				rs = pst.executeQuery();
				 while(rs.next()) {
						e.setId(rs.getInt(1));
						e.setName(rs.getString(2));
						e.setAddress(rs.getString(3));
						e.setContact(rs.getInt(4));
						e.setDepartment(rs.getString(5));
						e.setSalary(rs.getInt(6));
						e.setE_mail(rs.getString(7));  
						e.setUsername(rs.getString(8));
						e.setPassword(rs.getString(9));
						
					 }
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			
		}else {
			System.out.println("Not Connected");
		}
		return e;
		
	}

	public Employee getEmployee(String uname,String pass) {
		con = getConnection();
		Employee e = new Employee();
		//boolean isValid = false;
		if(con!=null) {
			System.out.println("connected");
			String sql = "select * from employee where emp_uname=? and emp_password=?";
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1,uname);
				pst.setString(2,pass);
				rs = pst.executeQuery();
				 while(rs.next()) {
						
					 	e.setId(rs.getInt(1));
						e.setName(rs.getString(2));
						e.setAddress(rs.getString(3));
						e.setContact(rs.getInt(4));
						e.setDepartment(rs.getString(5));
						e.setSalary(rs.getInt(6));
						e.setE_mail(rs.getString(7));  
						e.setUsername(rs.getString(8));
						e.setPassword(rs.getString(9));
						
					 }
				 //isValid=true;
				 con.close();
				
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			
		}else {
			System.out.println("Not Connected");
		}
		return e;
		
	}
	
	public int deleteEmpById(int emp_id) {
		con = getConnection();
		int i =0;
		if(con != null) {
			String sql="delete from employee where emp_id=?";
			
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setInt(1, emp_id);
				i = pst.executeUpdate();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
	}
	
	public boolean validate(String uname,String pass) {
		boolean status =false;
	
		con = getConnection();
		Employee e = new Employee();
		if(con != null) {
			String sql ="select * from employee where emp_uname=? and emp_password=?";
			
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, uname);
				pst.setString(2, pass);
				
				rs = pst.executeQuery();
				
				while(rs.next()) {
//					e.setId(rs.getInt(1));
//					e.setName(rs.getString(2));
//					e.setAddress(rs.getString(3));
//					e.setContact(rs.getInt(4));
//					e.setDepartment(rs.getString(5));
//					e.setSalary(rs.getInt(6));
//					e.setE_mail(rs.getString(7));  
//					e.setUsername(rs.getString(8));
//					e.setPassword(rs.getString(9));
					status =true;
				}
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			} 
		}
		
		return status;
	}
	
	public int addAdmin(Admin ad) {
		con=getConnection();
		int i = 0;
		if(con!= null) {
			String sql = "insert into admin values (?,?,?,?,?,?,?,?)";
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setInt(1, ad.getId());
				pst.setString(2, ad.getName());
				pst.setString(3, ad.getAddress());
				pst.setInt(4, ad.getContact());
				pst.setInt(5, ad.getSalary());
				pst.setString(6, ad.getEmail());
				pst.setString(7, ad.getUsername());
				pst.setString(8, ad.getPassword());
				
				 i = pst.executeUpdate();
				 con.close();
				
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
		}else {
			System.out.println("not Connected");
		}
		return i;

	}
	
	public boolean validateAdmin(String uname,String pass) {
		boolean status =false;
	
		con = getConnection();
		Admin a = new Admin();
		if(con != null) {
			String sql ="select * from admin where ad_uname=? and ad_password=?";
			
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, uname);
				pst.setString(2, pass);
				
				rs = pst.executeQuery();
				
				while(rs.next()) {

					status =true;
				}
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			} 
		}
		
		return status;
	}
	
	public ArrayList<Admin> getAdminList(){
		con = getConnection();
		ArrayList<Admin> adm_lst = new ArrayList<Admin>();
		if(con != null) {
			try {
				Statement st = con.createStatement();
				rs=st.executeQuery("select * from admin");
				while(rs.next()) {
					Admin a = new Admin();
					a.setId(rs.getInt(1));
					a.setName(rs.getString(2));
					a.setAddress(rs.getString(3));
					a.setContact(rs.getInt(4));
					a.setSalary(rs.getInt(5));
					a.setEmail(rs.getString(6));
					a.setUsername(rs.getString(7));
					a.setPassword(rs.getString(8));
					
					
					adm_lst.add(a);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return adm_lst;
	}
	
	public Admin getAdmin(String uname,String pass) {
		con = getConnection();
		Admin e = new Admin();
		//boolean isValid = false;
		if(con!=null) {
			System.out.println("connected");
			String sql = "select * from admin where ad_uname=? and ad_password=?";
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1,uname);
				pst.setString(2,pass);
				rs = pst.executeQuery();
				 while(rs.next()) {
						
					 	e.setId(rs.getInt(1));
						e.setName(rs.getString(2));
						e.setAddress(rs.getString(3));
						e.setContact(rs.getInt(4));
						e.setSalary(rs.getInt(5));
						e.setEmail(rs.getString(6));  
						e.setUsername(rs.getString(7));
						e.setPassword(rs.getString(8));
						
					 }
				 //isValid=true;
				 con.close();
				
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			
		}else {
			System.out.println("Not Connected");
		}
		return e;
		
	}
}
