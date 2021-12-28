package rzlauncher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static rzlauncher.RZObjectDeclarations.commandLineArguments;
import static rzlauncher.RZObjectDeclarations.otherExecutable;

public class RZExecuteOtherExecutable implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        new RZWriteProperties().RZPropertyWriting();
        Runtime run = Runtime.getRuntime();
        String file = otherExecutable.getText()
                + " "
                + commandLineArguments.getText();
        System.out.println("\nExecuting " + file);
        try {
            run.exec(file);
            System.exit(0);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
