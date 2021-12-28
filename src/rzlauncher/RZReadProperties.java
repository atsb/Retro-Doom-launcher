package rzlauncher;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static rzlauncher.RZObjectDeclarations.commandLineArguments;
import static rzlauncher.RZObjectDeclarations.otherExecutable;

public class RZReadProperties {
    public static void RZPropertyReading() {
        try {
            File configFile = new File("rzlauncher.properties");
            FileReader reader = new FileReader(configFile);
            Properties props = new Properties();
            props.load(reader);

            String cla = props.getProperty("command-line-options");
            String oe = props.getProperty("other-executable");

            System.out.print("Property File Contents Read");
            System.out.print("\nCommand Line Options: " + cla);
            System.out.print("\nOther Executable: " + oe);

            commandLineArguments.setText(cla);
            otherExecutable.setText(oe);

            reader.close();
        } catch (IOException e) {
            System.out.println("ERROR: Cannot read Property file!  Writing new file.");
            new RZWriteProperties().RZPropertyWriting();

            e.printStackTrace();
        }
    }
}