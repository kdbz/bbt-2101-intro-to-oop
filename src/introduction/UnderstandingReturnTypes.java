public class UnderstandingReturnTypes{


    public static void main(String args []){
        /*
          Can you call the main function inside itself - like the way you call
          a recursive function?
          ====================================================================
            1. This is a bad programming construct since this is the entry point for our application
            ---- I noticed you were trying to repeatedly do what is in the main method.
                  * Rather than calling the main method, which is something that is regarded as a bad design decision, you can call another method repetitively.

          See a further explanation from : http://stackoverflow.com/questions/540396/why-is-main-in-java-void
         /-------------------------------------------------------------------------------------------------------------------------------------/
         |
         |  The main() method must indeed have a void return type. From the Java Language Specification on "Execution - Virtual Machine Start-Up" (§12.1.4):
         |
         |  The method main must be declared  public, static, and void. It must accept a single argument that is an array of strings.
         |  It goes on to describe when a program exits in "Execution - Program Exit" (§12.8):
         |
         |  A program terminates all its activity and exits when one of two things happens:
         |
         |  All the threads that are not daemon threads terminate.
         |  Some thread invokes the exit method of class  Runtime or class System and the exit operation is not forbidden by the security manager.
         |  In other words, the program may exit before or after the main method finishes; a return value from  main would therefore be meaningless. If you want the program to return a status code, call one of the following methods (note that all three methods never return normally):
         |
         |    *System.exit(int status) - Equivalent to Runtime.getRuntime().exit(status)
         |    *Runtime.exit(int status) - Terminates the currently running JVM by initiating its shutdown sequence (run all registered shutdown hooks, and uninvoked finalizers, if necessary). Once this is done the JVM halts.
         |    *Runtime.halt(int status) - Forcibly terminates the currently running JVM.
         |
         |    Of the three, System.exit() is the conventional and most convenient way to terminate the JVM.
         /-------------------------------------------------------------------------------------------------------------------------------------/

        */

        IReturnNothing();


    }

    /**
      the static keyword allows you to use methods without initializing the class
    */
    public static String GetName(){
       return "CompSci";
    }
    /**
     A void method print things, start other and call other methods that have return values but they do not return a value themselves
    */
    public static void IReturnNothing(){
      //I can print
       System.out.println("I'm just printing out stuff but i hava a void return type :( )");
       //Yippeee - I have a name too
       String myName = GetName();
       System.out.println("My name is "+myName);
    }

}
