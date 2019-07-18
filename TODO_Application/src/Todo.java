public class Todo {
  public static void main(String[] args) {
    PrintUsage start = new PrintUsage();
    ListTasks list = new ListTasks();
    if(args.length == 0){
      start.printUsage();
    }
    else if(args[0].equals("-l")){
      System.out.println();
      list.listTasks();
    }
  }
}

