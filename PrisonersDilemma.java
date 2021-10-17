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
                frame.add(playingfield, BorderLayout.CENTER);
                go = new JButton("GO");
                pause = new JButton("Pause");
                resetButton = new JButton("Reset");
                resetButton.addActionListener (setGrid);
                frame.add(resetButton, BorderLayout.SOUTH);


            }


        } );
    }
    
    //...
    
    public static void main( String[] a ) {
        (new PrisonersDilemma()).buildGUI();
    }
}
