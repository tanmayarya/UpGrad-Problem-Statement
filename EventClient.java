package UpGrad;

import java.util.Scanner;

public class EventClient {

	public static void main(String[] args) {

		StudentPriorityQueue studentQueue = new StudentPriorityQueue();

		Scanner scn = new Scanner(System.in);
		int total_events = scn.nextInt();

		for (int i = 0; i < total_events; i++) {
			String event = scn.next();

			if (event.equals("ENTER")) {
				String name = scn.next();
				float CGPA = scn.nextFloat();
				int token = scn.nextInt();

				studentQueue.enterStudent(name, CGPA, token);
			} else if (event.equals("SERVED")) {
				studentQueue.serveStudent();
			}
		}
		studentQueue.displayQueue();
	}

}
