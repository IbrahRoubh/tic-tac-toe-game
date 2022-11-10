package maltepe.edu;

import javax.swing.*;
import java.util.ArrayList;

public class One_vs_computer extends XO_game{
    public One_vs_computer()
    {

    }

    public int Computer_play(ArrayList<JButton> buttons)
    {
        int check;

        check=Check_wining(buttons);
        if(check==10)
        {
            check=Block(buttons);
            if(check==10)
            {
                check = Center(buttons);
                if (check==10)
                {
                    check=Corner(buttons);
                    if(check==10)
                    {
                        check=Any_space(buttons);
                    }

                }
            }
        }
        return  check;
    }
    private  int Check_wining(ArrayList<JButton> buttons)
    {
        if((buttons.get(0).getText()=="O")&&(buttons.get(1).getText()=="O")&&(buttons.get(2).isEnabled()))
            return 2;
        if((buttons.get(0).getText()=="O")&&(buttons.get(2).getText()=="O")&&(buttons.get(1).isEnabled()))
            return 1;
        if((buttons.get(1).getText()=="O")&&(buttons.get(2).getText()=="O")&&(buttons.get(0).isEnabled()))
            return 0;
        if((buttons.get(0).getText()=="O")&&(buttons.get(4).getText()=="O")&&(buttons.get(8).isEnabled()))
            return 8;
        if((buttons.get(0).getText()=="O")&&(buttons.get(8).getText()=="O")&&(buttons.get(4).isEnabled()))
            return 4;
        if((buttons.get(4).getText()=="O")&&(buttons.get(8).getText()=="O")&&(buttons.get(0).isEnabled()))
            return 0;
        if((buttons.get(0).getText()=="O")&&(buttons.get(3).getText()=="O")&&(buttons.get(6).isEnabled()))
            return 6;
        if((buttons.get(0).getText()=="O")&&(buttons.get(6).getText()=="O")&&(buttons.get(3).isEnabled()))
            return 3;
        if((buttons.get(6).getText()=="O")&&(buttons.get(3).getText()=="O")&&(buttons.get(0).isEnabled()))
            return 0;
        if((buttons.get(3).getText()=="O")&&(buttons.get(4).getText()=="O")&&(buttons.get(5).isEnabled()))
            return 5;
        if((buttons.get(3).getText()=="O")&&(buttons.get(5).getText()=="O")&&(buttons.get(4).isEnabled()))
            return 4;
        if((buttons.get(5).getText()=="O")&&(buttons.get(4).getText()=="O")&&(buttons.get(3).isEnabled()))
            return 3;
        if((buttons.get(8).getText()=="O")&&(buttons.get(7).getText()=="O")&&(buttons.get(6).isEnabled()))
            return 6;
        if((buttons.get(8).getText()=="O")&&(buttons.get(6).getText()=="O")&&(buttons.get(7).isEnabled()))
            return 7;
        if((buttons.get(7).getText()=="O")&&(buttons.get(6).getText()=="O")&&(buttons.get(8).isEnabled()))
            return 8;
        if((buttons.get(6).getText()=="O")&&(buttons.get(4).getText()=="O")&&(buttons.get(2).isEnabled()))
            return 2;
        if((buttons.get(6).getText()=="O")&&(buttons.get(2).getText()=="O")&&(buttons.get(4).isEnabled()))
            return 4;
        if((buttons.get(4).getText()=="O")&&(buttons.get(2).getText()=="O")&&(buttons.get(6).isEnabled()))
            return 6;
        if((buttons.get(7).getText()=="O")&&(buttons.get(4).getText()=="O")&&(buttons.get(1).isEnabled()))
            return 1;
        if((buttons.get(7).getText()=="O")&&(buttons.get(1).getText()=="O")&&(buttons.get(4).isEnabled()))
            return 4;
        if((buttons.get(4).getText()=="O")&&(buttons.get(1).getText()=="O")&&(buttons.get(7).isEnabled()))
            return 7;
        if((buttons.get(5).getText()=="O")&&(buttons.get(8).getText()=="O")&&(buttons.get(2).isEnabled()))
            return 2;
        if((buttons.get(2).getText()=="O")&&(buttons.get(5).getText()=="O")&&(buttons.get(8).isEnabled()))
            return 8;
        if((buttons.get(2).getText()=="O")&&(buttons.get(8).getText()=="O")&&(buttons.get(5).isEnabled()))
            return 5;

        return  10;
    }
    private int Block(ArrayList<JButton> buttons)
    {
        if((buttons.get(0).getText()=="X")&&(buttons.get(1).getText()=="X")&&(buttons.get(2).isEnabled()))
            return 2;
        if((buttons.get(0).getText()=="X")&&(buttons.get(2).getText()=="X")&&(buttons.get(1).isEnabled()))
            return 1;
        if((buttons.get(1).getText()=="X")&&(buttons.get(2).getText()=="X")&&(buttons.get(0).isEnabled()))
            return 0;
        if((buttons.get(0).getText()=="X")&&(buttons.get(4).getText()=="X")&&(buttons.get(8).isEnabled()))
            return 8;
        if((buttons.get(0).getText()=="X")&&(buttons.get(8).getText()=="X")&&(buttons.get(4).isEnabled()))
            return 4;
        if((buttons.get(4).getText()=="X")&&(buttons.get(8).getText()=="X")&&(buttons.get(0).isEnabled()))
            return 0;
        if((buttons.get(0).getText()=="X")&&(buttons.get(3).getText()=="X")&&(buttons.get(6).isEnabled()))
            return 6;
        if((buttons.get(0).getText()=="X")&&(buttons.get(6).getText()=="X")&&(buttons.get(3).isEnabled()))
            return 3;
        if((buttons.get(6).getText()=="X")&&(buttons.get(3).getText()=="X")&&(buttons.get(0).isEnabled()))
            return 0;
        if((buttons.get(3).getText()=="X")&&(buttons.get(4).getText()=="X")&&(buttons.get(5).isEnabled()))
            return 5;
        if((buttons.get(3).getText()=="X")&&(buttons.get(5).getText()=="X")&&(buttons.get(4).isEnabled()))
            return 4;
        if((buttons.get(5).getText()=="X")&&(buttons.get(4).getText()=="X")&&(buttons.get(3).isEnabled()))
            return 3;
        if((buttons.get(8).getText()=="X")&&(buttons.get(7).getText()=="X")&&(buttons.get(6).isEnabled()))
            return 6;
        if((buttons.get(8).getText()=="X")&&(buttons.get(6).getText()=="X")&&(buttons.get(7).isEnabled()))
            return 7;
        if((buttons.get(7).getText()=="X")&&(buttons.get(6).getText()=="X")&&(buttons.get(8).isEnabled()))
            return 8;
        if((buttons.get(6).getText()=="X")&&(buttons.get(4).getText()=="X")&&(buttons.get(2).isEnabled()))
            return 2;
        if((buttons.get(6).getText()=="X")&&(buttons.get(2).getText()=="X")&&(buttons.get(4).isEnabled()))
            return 4;
        if((buttons.get(4).getText()=="X")&&(buttons.get(2).getText()=="X")&&(buttons.get(6).isEnabled()))
            return 6;
        if((buttons.get(7).getText()=="X")&&(buttons.get(4).getText()=="X")&&(buttons.get(1).isEnabled()))
            return 1;
        if((buttons.get(7).getText()=="X")&&(buttons.get(1).getText()=="X")&&(buttons.get(4).isEnabled()))
            return 4;
        if((buttons.get(4).getText()=="X")&&(buttons.get(1).getText()=="X")&&(buttons.get(7).isEnabled()))
            return 7;
        if((buttons.get(5).getText()=="X")&&(buttons.get(8).getText()=="X")&&(buttons.get(2).isEnabled()))
            return 2;
        if((buttons.get(2).getText()=="X")&&(buttons.get(5).getText()=="X")&&(buttons.get(8).isEnabled()))
            return 8;
        if((buttons.get(2).getText()=="X")&&(buttons.get(8).getText()=="X")&&(buttons.get(5).isEnabled()))
            return 5;

        return  10;
    }
    private int Center(ArrayList<JButton> buttons)
    {
        if(buttons.get(4).isEnabled())
            return 4;
        return  10;
    }
    private int Corner(ArrayList<JButton> buttons)
    {
        if(buttons.get(0).isEnabled())
        {
            if(buttons.get(2).isEnabled())
                return 2;
            if(buttons.get(6).isEnabled())
                return 6;
            if(buttons.get(8).isEnabled())
                return 8;
        }
        if(buttons.get(2).isEnabled())
        {
            if(buttons.get(0).isEnabled())
                return 0;
            if(buttons.get(6).isEnabled())
                return 6;
            if(buttons.get(8).isEnabled())
                return 8;
        }
        if(buttons.get(6).isEnabled())
        {
            if(buttons.get(2).isEnabled())
                return 2;
            if(buttons.get(0).isEnabled())
                return 0;
            if(buttons.get(8).isEnabled())
                return 8;
        }
        if(buttons.get(8).isEnabled())
        {
            if(buttons.get(2).isEnabled())
                return 2;
            if(buttons.get(6).isEnabled())
                return 6;
            if(buttons.get(0).isEnabled())
                return 0;
        }
        if(buttons.get(0).isEnabled())
            return 0;
        if(buttons.get(2).isEnabled())
            return 2;
        if(buttons.get(6).isEnabled())
            return 6;
        if(buttons.get(8).isEnabled())
            return 8;

        return 10;
    }
    private int Any_space(ArrayList<JButton> buttons)
    {
        if(buttons.get(1).isEnabled())
            return  1;
        if(buttons.get(7).isEnabled())
            return  7;
        if(buttons.get(5).isEnabled())
            return  5;
        if(buttons.get(3).isEnabled())
            return  3;
        return 10;
    }


}
