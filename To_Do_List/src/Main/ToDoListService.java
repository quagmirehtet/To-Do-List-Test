package Main;

import java.util.*;

public class ToDoListService {

	static Scanner scanner = new Scanner(System.in);

	private List<ToDoListModel> list = new ArrayList<>();

	public void addTask(String newTask) {

		ToDoListModel addTask = new ToDoListModel(newTask);

		list.add(addTask);

	}

	public void viewTask() {

		if (list.isEmpty()) {

			System.out.println("Nothing Task Found");

		} else {

			System.out.println("Your tasks:");

			for (int i = 0; i < list.size(); i++) {

				System.out.println();

				System.out.println(i + 1 + "." + list.get(i).getTasks());

			}
		}

	}

	public void removeTask(int removeNum) {

		if (list.isEmpty()) {

			System.out.println("There are no tasks to remove.");

		}

		else if (removeNum >= 1 && removeNum <= list.size()) {

			list.remove(removeNum - 1);

			System.out.println("Task removed.");

		} else {

			System.out.println("Task number " + removeNum + " was not found.");

		}

	}

}
