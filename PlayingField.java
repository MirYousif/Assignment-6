/**
 * INCOMPLETE
 * Assignment 6 -- Prisoner's Dilemma -- 2ip90
 * part PlayingField
 * 
 * @author FILL IN
 * @author FILL IN
 * assignment group FILL IN
 * 
 * assignment copyright Kees Huizing
 */

import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;


class PlayingField extends JPanel  implements ActionListener /* possible implements ... */ {

    private Patch[][] grid;
    
    private double alpha; // defection award factor
    
    private Timer timer;
    
    // random number genrator
    private static final long SEED = 37L; // seed for random number generator; any number goes
    public static final Random random = new Random( SEED );         
    
    //...

    public PlayingField() {

        setPreferredSize(new Dimension(500, 450));
        
    }
    
    /**
     * calculate and execute one step in the simulation 
     */
    public void step( ) {
        //...
    }
    
    public void setAlpha( double alpha ) {
        //...
    }
    
    public double getAlpha( ) {
        //...
        return 0.0; // CHANGE THIS
    }
    
    // return grid as 2D array of booleans
    // true for cooperators, false for defectors
    // precondition: grid is rectangular, has non-zero size and elements are non-null
    public boolean[][] getGrid() {
        boolean[][] resultGrid = new boolean[grid.length][grid[0].length];
        for (int x = 0; x < grid.length; x++ ) {
            for (int y = 0; y < grid[0].length; y++ ) {
                resultGrid[x][y] = grid[x][y].isCooperating();
            }
        }
        
        return resultGrid; 
    }
    
    // sets grid according to parameter inGrid
    // a patch should become cooperating if the corresponding
    // item in inGrid is true
    public void setGrid( boolean[][] inGrid) {
        // ...

    }   


    @Override
    public void actionPerformed(ActionEvent e) {  /// Fill in the functin of hte buttons here!!!!!
        // TODO Auto-generated method stub

        if ("GO".equals(e.getActionCommand())) {

            // start the simulation

        } else if ("Pause".equals(e.getActionCommand())) {

            //pause simulation

        } else if ( "Reset".equals(e.getActionCommand()) ) {

            // start the simulation again

        }
        
    }
}

