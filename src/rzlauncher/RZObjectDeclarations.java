package rzlauncher;

import javax.swing.*;

public class RZObjectDeclarations {
    static final JFrame rzDoomJFrame = new JFrame("Retro Doom Launcher - v1.0.1");
    static final JButton doomButton = new JButton("Launch Doom");
    static final JButton doomTwoButton = new JButton("Launch Doom II");
    static final JButton hereticButton = new JButton("Launch Heretic");
    static final JButton hexenButton = new JButton("Launch Hexen");
    static final JButton strifeButton = new JButton("Launch Strife");
    static final JButton otherExecutableButton = new JButton("Launch");
    static final JLabel commandLineArgLabel = new JLabel("Enter Command Line Options");
    static final JLabel otherExecutableLabel = new JLabel("Enter Name of other Executable that you wish to use");
    static final JTextField commandLineArguments = new JTextField();
    static final JTextField otherExecutable = new JTextField();
}
