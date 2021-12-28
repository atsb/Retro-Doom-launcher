package rzlauncher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static rzlauncher.RZObjectDeclarations.commandLineArguments;

public class RZExecuteRZDoom2 implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        Runtime run = Runtime.getRuntime();
        String file = "rzdoom.exe -iwad DOOM2.WAD"
                + " "
                + commandLineArguments.getText();
        System.out.println("Executing " + file);
        try {
            run.exec(file);
            System.exit(0);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
