// This is a simple Java program.
// FileName : "HelloWorld.java".

class HelloWorld
{
    // Your program begins with a call to main().
    // Prints "Hello, World" to the terminal window.
 public static void main(String... args) {
    Main main = new Main();
 
    //test command in linux
    main.runCommand("pwd");
    main.runCommand("dnf", "update", "-y");
}
