package Main;

public class Main {

	public static void main(String[] args) {

		ToDoListService toDoListService = new ToDoListService();

		boolean flag = true;

		while (flag) {

			System.out.println();

			System.out.println("--- To-Do List Menu ---");

			System.out.println();

			System.out.println("1.Add Task \n" + "2.View Task \n" + "3.Remove Task \n" + "4.Exit");

			System.out.println("Enter your choice ");
			String choiceNum = ToDoListService.scanner.nextLine().trim();

			switch (choiceNum) {

			case "1":

				System.out.println("Enter task description :");
				String addTask = ToDoListService.scanner.nextLine();

				toDoListService.addTask(addTask);

				System.out.println("Task added!");

				break;

			case "2":

				toDoListService.viewTask();

				break;

			case "3":

				try {

					System.out.println("Enter the task number to remove :");
					String removeNum = ToDoListService.scanner.nextLine().trim();

					int rmnum = Integer.parseInt(removeNum);

					toDoListService.removeTask(rmnum);
				} catch (NumberFormatException e) {

					System.out.println("Enter Task number Only.");

				}

				break;

			case "4":

				flag = false;
				System.out.println("Program closed");
				break;

			default:

				System.out.println("Invalid input. Please enter a number from 1 to 4.");

			}
		}

	}

}
