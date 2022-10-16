package collectionofframework;

import java.util.ArrayList;
import java.util.Scanner;

public class studentmanagement {

	public static void main(String[] args) {

		ArrayList<student> al = new ArrayList<>();
		String name;
		String age;
		String salary;
		int ch;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to display student");
			System.out.println("Press 3 for search student by name");
			System.out.println("press 4 for delete user by name");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter name");
				name = sc.next();
				System.out.println("Enter age");
				age = sc.next();
				System.out.println("Enter salary");
				salary = sc.next();
				student s = new student();
				s.setAge(age);
				s.setName(name);
				s.setSal(salary);
				al.add(s);
				System.out.println("Student record added");
				break;
			case 2:
				for (int i = 0; i < al.size(); i++) {
					System.out.println("Student record" + (i + 1));
					System.out.println("Student name:" + al.get(i).getName());
					System.out.println("Student age:" + al.get(i).getAge());
					System.out.println("Student salary:" + al.get(i).getSal());
				}
				break;
			case 3:
				System.out.println("Enter name");
				name = sc.next();
				int ii = 0;
				if (al.get(ii).getName().contains(name)) {
					System.out.println("Student record:" + (++ii));
					System.out.println("Student name:" + al.get(ii).getName());
					System.out.println("Student age:" + al.get(ii).getAge());
					System.out.println("Student salary:" + al.get(ii).getSal());
				}

				if (ii == 0) {
					System.out.println("no record found for that search");
				}
				break;
				case 4:
					 System.out.println(" enter the student name for delete:");
				name = sc.next();
				int searchI = 0;
				for (int i = 0; i < al.size(); i++) {
					if (al.get(i).getName().contains(name)) {
						System.out.println("Student record:" + (++searchI));
						al.remove(i);
					}
				}
				if (searchI == 0) {
					System.out.println(" no Student record found for delete record");
				} else {
					System.out.println("  Student record has been deleted successfully");
				}

			}

		}
	}
}
