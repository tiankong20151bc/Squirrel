package cn.fengshuye.login;

import java.util.Scanner;

import cn.fengshuye.user.User;

public class Login {

	/**
	 * @param args
	 * @author TK v1.0
	 */
	public static void main(String[] args) {
		//���������ݿ��˺���Ϣ
		String ID = "1";
		String userName = "admin";
		String userPassword = "admin";
		
		//User��
		User user = new User();
		
		// ����¼��
		Scanner sc = new Scanner(System.in);
		System.out.println("---------һ�仰��¼---------");
		while (true) {
			//��ʾ�˺�����
			System.out.print("�˺�:");
			user.setName(sc.nextLine());
		//��ʾ��������
			System.out.print("����:");
			user.setPassword(sc.nextLine());
		//У���˺���Ϣ
			if (userName.equals(user.getName()) && userPassword.equals(user.getPassword())) {
				//У��ɹ�
				System.out.println("��¼�ɹ�,����ռ�.");
				break;
			} else {
				System.out.println("�˺��������");
			}
		}
		/*//У��5��
		for (int i = 4; i >= 0; i--) {
		//��ʾ�˺�����
			System.out.print("�˺�:");
			user.setName(sc.nextLine());
		//��ʾ��������
			System.out.print("����:");
			user.setPassword(sc.nextLine());
		//У���˺���Ϣ
			if (user.getName().equals(userName) && user.getPassword().equals(userPassword)) {
				//У��ɹ�
				System.out.println("��¼�ɹ�,����ռ�.");
				break;
			} else if (i == 0) {
				//У��ʧ��
				System.out.println("�˺������������5��,�˺�����15����.");
			} else {
				System.out.println("�˺��������,����"+i+"�λ���.");
			}
		}*/
	}

}
