package UpGrad;

import java.util.LinkedList;

public class StudentPriorityQueue {

	private LinkedList<Student> studentQueue;

	public StudentPriorityQueue() {
		this.studentQueue = new LinkedList<Student>();
	}

	public void enterStudent(String name, float CGPA, int token) {
		
		int idx = 0;
		for (idx = 0; idx < this.studentQueue.size(); idx++) {

			Student student = studentQueue.get(idx);

			if (student.CGPA < CGPA)
				break;
			else if (student.CGPA == CGPA) {
				if (student.name.compareTo(name) > 0)
					break;
				else if (student.name.compareTo(name) == 0) {
					if (student.token > token)
						break;
				}
			}
		}
		studentQueue.add(idx, new Student(name, CGPA, token));
	}

	public void serveStudent() {
		if (!this.studentQueue.isEmpty())
			this.studentQueue.remove();
	}

	public void displayQueue() {

		if (studentQueue.isEmpty()) {
			System.out.println("EMPTY");
			return;
		}
		for (int i = 0; i < this.studentQueue.size(); i++)
			System.out.println(studentQueue.get(i).name);
	}
}
