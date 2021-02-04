package ca.mths.java.hello_world;

/**
* The Hello World! program implements an application that
* simply displays "Hello World!" to the standard output.
*
* @author  Mr Coxall
* @version 1.0
* @since   2020-01-01
*/

final class HelloWorld {
   /**
    * This method prints out "Hello, World!"
    */
    private HelloWorld() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
