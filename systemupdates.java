String command = "ping www.codejava.net";
 
try {
    Process process = Runtime.getRuntime().exec(command);
 
    BufferedReader reader = new BufferedReader(
            new InputStreamReader(process.getInputStream()));
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
 
    reader.close();
 
} catch (IOException e) {
    e.printStackTrace();
}
