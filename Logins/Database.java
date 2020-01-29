package Logins;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Database {
    private PasswordStorage passwordstorage = new PasswordStorage();

    public void addUser(String name, String password) {
        User user = null;
        try {
            user = new User(name, passwordstorage.createHash(password));
        } catch (PasswordStorage.CannotPerformOperationException e) {
            e.printStackTrace();
        }
        File dataFile = new File("C:\\Users\\Elija\\IdeaProjects\\Ap Comp Sci Workspace\\src\\Logins\\hashes.txt");
        FileWriter out;
        BufferedWriter writeFile;
        try {
            out = new FileWriter(dataFile);
            writeFile = new BufferedWriter(out);
            writeFile.write(user.toString());
            writeFile.newLine();
            writeFile.close();
            out.close();
            System.out.println("Data written to file.");
        } catch (IOException x) {
            System.out.println("Problem writing to file.");
            System.err.println("IOException: " + x.getMessage());
        }
    }

    public String hashString(String string) {
        
        return "";
    }
}
