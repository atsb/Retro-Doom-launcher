package rzlauncher;

import javax.swing.*;

import static rzlauncher.RZObjectDeclarations.*;

public class RZStartGUI {
    public void BeginRZGUI() {

        RZReadProperties.RZPropertyReading();

        /*
         * You're not allowed to remove this, or I'll chase you down and throw the GPL3 at you
         */

        System.out.println("\n----------------------------------------------------------------");
        System.out.println("""
                Retro Doom Launcher Copyright (C) 2021 - 2022 Adam Bilbrough
                This program comes with ABSOLUTELY NO WARRANTY;
                This is free software, and you are welcome to redistribute it
                under certain conditions and according to the GPL version 3""");
        System.out.println("----------------------------------------------------------------\n");

        commandLineArgLabel.setBounds(10, 10, 661, 20);
        rzDoomJFrame.add(commandLineArgLabel);

        commandLineArguments.setBounds(10, 30, 661, 20);
        rzDoomJFrame.add(commandLineArguments);

        otherExecutableLabel.setBounds(10, 50, 661, 20);
        rzDoomJFrame.add(otherExecutableLabel);

        otherExecutable.setBounds(10, 70, 272, 20);
        rzDoomJFrame.add(otherExecutable);

        otherExecutableButton.setBounds(290, 70, 120, 20);
        rzDoomJFrame.add(otherExecutableButton);
        otherExecutableButton.addActionListener(new RZExecuteOtherExecutable());

        doomButton.setBounds(10, 100, 120, 20);
        rzDoomJFrame.add(doomButton);
        doomButton.addActionListener(new RZExecuteRZDoom());

        doomTwoButton.setBounds(140, 100, 140, 20);
        rzDoomJFrame.add(doomTwoButton);
        doomTwoButton.addActionListener(new RZExecuteRZDoom2());

        hereticButton.setBounds(290, 100, 120, 20);
        rzDoomJFrame.add(hereticButton);
        hereticButton.addActionListener(new RZExecuteRZHeretic());

        hexenButton.setBounds(420, 100, 120, 20);
        rzDoomJFrame.add(hexenButton);
        hexenButton.addActionListener(new RZExecuteRZHexen());

        strifeButton.setBounds(550, 100, 120, 20);
        rzDoomJFrame.add(strifeButton);
        strifeButton.addActionListener(new RZExecuteRZStrife());

        rzDoomJFrame.setSize(695, 170);
        rzDoomJFrame.setLayout(null);
        rzDoomJFrame.setVisible(true);

        rzDoomJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
