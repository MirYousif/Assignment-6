/**
 * INCOMPLETE
 * Assignment 6 -- Prisoner's Dilemma -- 2ip90
 * main class
 * 
 * @author FILL IN
 * @author FILL IN
 * assignment group FILL IN
 * 
 * assignment copyright Kees Huizing
 */

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//...

class PrisonersDilemma /* possible extends... */ {        //inherit the methods of action listner to this class!!!
    //...
    
    JFrame frame;
    PlayingField playingfield;
    JButton resetButton;
    JButton pause;
    JButton go;

    void buildGUI() {
        SwingUtilities.invokeLater( new Runnable() {
            //...

            public void run() {

                playingfield = new PlayingField();
                frame = new JFrame("Prisoners Dilemma");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(playingfield, BorderLayout.CENTER);
                go = new JButton("GO");
                go.addActionListener(playingfield);
                pause = new JButton("Pause");
                pause.addActionListener(playingfield);
                resetButton = new JButton("Reset");
                resetButton.addActionListener (playingfield);
                frame.add(go, BorderLayout.EAST);                                  //fix positioning of buttons // also creat constructor class in playing field setting the size of the panel
                frame.add(pause, BorderLayout.WEST);
                frame.add(resetButton, BorderLayout.SOUTH);
                // frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                frame.setSize(800, 800);
                frame.setVisible(true);


            }


        } );
    }
    
    //...
    
    public static void main( String[] a ) {
        (new PrisonersDilemma()).buildGUI();
    }
}
