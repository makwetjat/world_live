public static void main(String... args) {
    Main main = new Main();
 
    //test command in linux
    main.runCommand("pwd");
    main.runCommand("ifconfig", "-a");
}
