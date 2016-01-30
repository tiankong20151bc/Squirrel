package cn.fengshuye.user;
/**
 用户信息类:
 	ID:唯一
 	账号:
 	密码:
 @author TK
 @version v1.0
 */
public class User {
	//ID:唯一
	private String ID;
	//账号:
	private String name;
	//密码:
	private String password;

	public User() {
		super();
	}

	public User(String iD, String name, String password) {
		super();
		ID = iD;
		this.name = name;
		this.password = password;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
