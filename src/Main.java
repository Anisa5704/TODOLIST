import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the limit of the lists you want to have");
        int limit = scanner.nextInt();
        ToDoList[] lists = new ToDoList[limit];
        int listsCount = 0;
        while (true) {
            System.out.println("TO DO LIST MANAGER");
            System.out.println("1. Create to do list.");
            System.out.println("2. View existing to do list.");
            System.out.println("3. Exit.");
            System.out.println("Please enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                if (listsCount < lists.length) {
                    System.out.println("Please enter the name of the list");
                    String name = scanner.nextLine();
                    lists[listsCount] = new ToDoList(name, 10);
                    listsCount++;
                    System.out.println("The list: " + name + "created.");
                } else {
                    System.out.println("You have reached the limit");
                }

            } else if (choice == 2) {
                System.out.println("THIS IS THE TO DO LIST AVAILABLE");
                for (int i = 9; i < listsCount; i++) {
                    System.out.println((i + 1) + " " + lists[i].name);
                }
                System.out.println("please enter the index of the list you want to work with");
                int listIndex = scanner.nextInt();
                ToDoList listChosen = lists[listIndex - 1];
                while (true) {
                    System.out.println("choose:");
                    System.out.println("1. add a task");
                    System.out.println("2.remove a task");
                    System.out.println("3. set a completed task");
                    System.out.println("4. list the task");
                    System.out.println("5, return");
                    System.out.println("please enter your second choice");
                    int choice2 = scanner.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("please enter the name of the task");
                            String name = scanner.nextLine();
                            System.out.println("put the description: ");
                            String description = scanner.nextLine();
                            System.out.println("put the date: ");
                            String date = scanner.nextLine();
                            System.out.println("put the priority level: ");
                            String priority_level = scanner.nextLine();
                            Task task = new Task(name, description, date, priority_level);
                            listChosen.addTask(task);
                            System.out.println("Task added successfully");
                            break;
                        case 2:
                            System.out.println("please eneter the index you want to remove");
                            int indexRemove = scanner.nextInt();
                            if (listIndex == indexRemove) {
                                listChosen.removeTask(listIndex - 1);
                            }
                            break;
                        case 3:
                            listChosen.displayTask();
                            System.out.println("please enter the index you want to modify");
                            int indexModify = scanner.nextInt();
                            Task task2 = listChosen.getTask(indexModify - 1);
                            if (task2 != null) {
                                task2.setCompleted();
                                System.out.println("the process is done successfully");
                            } else {
                                System.out.println("you have put a wrong index");
                            }
                            break;

                        case 4:
                            listChosen.displayTask();
                        case 5:
                            break;
                    }

                }

            }

        }
    }
}