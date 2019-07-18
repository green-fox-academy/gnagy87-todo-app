import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListTasks {
  public static void listTasks(){
    List<String> listOfTasks = new ArrayList<>();
   try {
     Path filePath = Paths.get("C:\\greenfox\\gnagy87-todo-app\\TODO_Application\\src\\ListOfTasks");
     listOfTasks = Files.readAllLines(filePath);
   }
   catch (Exception e){
     System.out.println("Unable to read file: my-file.txt");
   }
   if(listOfTasks.size()==0){
     emptyList();
   }
   else {
     for (int i = 0; i < listOfTasks.size(); i++) {
       System.out.println(i+1 + " - " + listOfTasks.get(i));
     }
   }
  }

  public static void emptyList(){
    System.out.println("No todos for today! :)");
  }
}
