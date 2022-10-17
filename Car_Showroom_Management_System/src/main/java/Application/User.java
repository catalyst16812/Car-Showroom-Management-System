package Application;

public class User {
	private String userName;
	private int userId;
	private String email;
	private double phoneNo;
	private String homeAdd;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getHomeAdd() {
		return homeAdd;
	}
	public void setHomeAdd(String homeAdd) {
		this.homeAdd = homeAdd;
	}
	@Override
	public String toString() {
		return "user [userName=" + userName + ", userId=" + userId + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", homeAdd=" + homeAdd + "]";
	}
}