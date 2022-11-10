package maltepe.edu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class XO_game extends JFrame{

    public boolean Chek_win(ArrayList<JButton> buttons)
    {
        boolean winer_chek=false;

        if((buttons.get(0).getText()==buttons.get(3).getText())&&(buttons.get(3).getText()==buttons.get(6).getText())&&(!buttons.get(6).isEnabled()))
            winer_chek=true;
        else if((buttons.get(0).getText()==buttons.get(1).getText())&&(buttons.get(1).getText()==buttons.get(2).getText())&&(!buttons.get(2).isEnabled()))
            winer_chek=true;
        else if((buttons.get(0).getText()==buttons.get(4).getText())&&(buttons.get(4).getText()==buttons.get(8).getText())&&(!buttons.get(8).isEnabled()))
            winer_chek=true;
        else if((buttons.get(3).getText()==buttons.get(4).getText())&&(buttons.get(4).getText()==buttons.get(5).getText())&&(!buttons.get(5).isEnabled()))
            winer_chek=true;
        else if((buttons.get(6).getText()==buttons.get(7).getText())&&(buttons.get(7).getText()==buttons.get(8).getText())&&(!buttons.get(8).isEnabled()))
            winer_chek=true;
        else if((buttons.get(6).getText()==buttons.get(4).getText())&&(buttons.get(4).getText()==buttons.get(2).getText())&&(!buttons.get(2).isEnabled()))
            winer_chek=true;
        else if((buttons.get(1).getText()==buttons.get(4).getText())&&(buttons.get(4).getText()==buttons.get(7).getText())&&(!buttons.get(7).isEnabled()))
            winer_chek=true;
        else if((buttons.get(2).getText()==buttons.get(5).getText())&&(buttons.get(5).getText()==buttons.get(8).getText())&&(!buttons.get(8).isEnabled()))
            winer_chek=true;

        //Print_win(winer_chek,buttons);
        return  winer_chek;
    }
    public void New_game(ArrayList<JButton> buttons)
    {
        buttons.forEach(n->n.setEnabled(true));
        for(int i=0;i<9;i++)
        {
            buttons.get(i).setForeground(Color.lightGray);
            buttons.get(i).setText(""+i);
        }
    }

    }