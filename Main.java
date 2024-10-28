import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num= 0 ;
        ArrayList<String> tasks = new ArrayList<>();

        System.out.println(" this is todo list , please chose :");

        while (num!=4) {
            System.out.print(" 1-add task");
            System.out.print(" 2-remove task");
            System.out.print(" 3-display task");
            System.out.println(" 4-exit");
            num = input.nextInt();
input.nextLine();

            switch (num) {
                case 1:
                    System.out.println(" enter your task ");
                    String task = input.nextLine();
                    addTask(tasks, task);
                    break;
                case 2:
                    System.out.print(" enter the number of the task to remove ");
                    int index = input.nextInt();
                    removeTask(tasks, index);
                    break;
                case 3:
                   displayTask(tasks);
                    break;
                case 4:
                    break;
                default:
                    System.out.println(" you enterd wrong number ");

            }
        }




    }
    public static void addTask (ArrayList<String> tasks , String task) {
        tasks.add(task);
        System.out.println(" task added ");
    }
    public static void removeTask (ArrayList<String> tasks , int index){
if(index >= 0 && index<tasks.size()) {
    tasks.remove(index);
    System.out.println(" task removed ");}
    else
        System.out.println(" invalled index  ");

    }
    public static void displayTask (ArrayList<String> tasks ){
        if (tasks.isEmpty())
            System.out.println(" no entry");
        else
    System.out.println("your tasks");
   for (int i=0 ; i< tasks.size();i++)
            System.out.println(tasks.get(i));
    }


    }