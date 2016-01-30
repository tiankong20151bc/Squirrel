package cn.fengshuye.login;

import java.util.Scanner;

import cn.fengshuye.user.User;

public class Login {

	/**
	 * @param args
	 * @author TK v1.0
	 */
	public static void main(String[] args) {
		//服务器数据库账号信息
		String ID = "1";
		String userName = "admin";
		String userPassword = "admin";
		
		//User类
		User user = new User();
		
		// 键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("---------一句话记录---------");
		while (true) {
			//提示账号输入
			System.out.print("账号:");
			user.setName(sc.nextLine());
		//提示密码输入
			System.out.print("密码:");
			user.setPassword(sc.nextLine());
		//校验账号信息
			if (userName.equals(user.getName()) && userPassword.equals(user.getPassword())) {
				//校验成功
				System.out.println("登录成功,添加日记.");
				break;
			} else {
				System.out.println("账号密码错误");
			}
		}
		/*//校验5次
		for (int i = 4; i >= 0; i--) {
		//提示账号输入
			System.out.print("账号:");
			user.setName(sc.nextLine());
		//提示密码输入
			System.out.print("密码:");
			user.setPassword(sc.nextLine());
		//校验账号信息
			if (user.getName().equals(userName) && user.getPassword().equals(userPassword)) {
				//校验成功
				System.out.println("登录成功,添加日记.");
				break;
			} else if (i == 0) {
				//校验失败
				System.out.println("账号密码输入错误5次,账号锁定15分钟.");
			} else {
				System.out.println("账号密码错误,还有"+i+"次机会.");
			}
		}*/
	}

}
