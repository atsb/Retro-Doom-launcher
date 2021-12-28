package rzlauncher;

import javax.swing.*;

public class RZLauncherMain {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, UnsupportedLookAndFeelException {
        try {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                System.out.println("ERROR: Creating System UI");
                e.printStackTrace();
                System.exit(1);
            }
        } catch (UnsupportedLookAndFeelException e) {
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                    | UnsupportedLookAndFeelException e1) {
                System.out.println("ERROR: Falling back to cross platform UI");
                e1.printStackTrace();
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }
            e.printStackTrace();
        }
        new RZStartGUI().BeginRZGUI();
    }
}
