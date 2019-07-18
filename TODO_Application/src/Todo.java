public class Todo {
  public static void main(String[] args) {

    PrintUsage start = new PrintUsage();
    ListTasks list = new ListTasks();
    FileAdder addFile = new FileAdder();
    FileRemover removeFile = new FileRemover();
    ArgumentError argError = new ArgumentError();
    CheckTask check = new CheckTask();

    if(args.length==1 && argError.errorMessage(args[0])==false){
      System.out.println("Unsupported argument");
      start.printUsage();
    }
    if(args.length == 0){
      start.printUsage();
    }
    else if(args[0].equals("-l")){
      System.out.println();
      list.listTasks();
    }
    else if(args[0].equals("-a") && args.length==2){
        addFile.fileAdder(args[1]);
    }
    else if(args[0].equals("-a") && args.length==1){
      System.out.println("Unable to add: no task provided");
    }
    else if(args[0].equals("-r") && args.length==2){
      removeFile.fileRemover(args[1]);
    }
    else if(args[0].equals("-r") && args.length==1){
      System.out.println("Unable to remove: no index provided");
    }
    else if(args[0].equals("-c") && args.length==2){
      check.checker(args[1]);
    }
    else if(args[0].equals("-c") && args.length==1){
      System.out.println("Unable to check: no index provided");
    }
  }
}