package usecases;

import java.util.Scanner;

import dao.TicketDao;
import dao.TicketDaoImpl;

public class adminLogin {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username: ");
		String username = sc.next();
		
		System.out.println("Enter Password: ");
		String password = sc.next();
		
		TicketDao dao = new TicketDaoImpl();
		
		String result = dao.adminLogin(username, password);
		
		System.out.println();
		System.out.println(result);
		sc.close();
	}
}