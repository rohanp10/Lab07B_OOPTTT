import javax.swing.JButton;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wulft
 */
public class TTTTileButton extends JButton
{
    private int row;
    private int col;
    public TTTTileButton(int row, int col) {
        super();
        this.row = row;
        this.col = col;
    }
    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }

}