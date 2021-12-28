package rzlauncher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import static java.lang.System.exit;
import static rzlauncher.RZObjectDeclarations.commandLineArguments;
import static rzlauncher.RZObjectDeclarations.otherExecutable;

public class RZWriteProperties {
    public void RZPropertyWriting() {
        File configFile = new File("rzlauncher.properties");
        try {
            Properties props = new Properties();
            props.setProperty("command-line-options", commandLineArguments.getText());
            props.setProperty("other-executable", otherExecutable.getText());

            FileWriter writer = new FileWriter(configFile);
            props.store(writer, "RZLauncher Properties File");
            writer.close();
            if (configFile.exists()) {
                System.out.println("\nProperty file written");
                System.out.println("\nCommand Line Options: " + props.getProperty("command-line-options"));
                System.out.println("\nOther Executable: " + props.getProperty("other-executable"));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR: Property file does not exist!");
            ex.printStackTrace();
            exit(1);
        } catch (IOException ex) {
            System.out.println("ERROR: Cannot write to Property file!");
            ex.printStackTrace();
            exit(1);
        }
    }
}
