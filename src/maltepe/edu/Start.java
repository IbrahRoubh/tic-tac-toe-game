package maltepe.edu;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Start extends JFrame {
        public static void main(String[] args) {

                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        XO_game frame = new XO_game();
                                        frame.setVisible(true);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                });
        }
        private static boolean cu=true;
        private static int player1_win = 0;
        private static int player2_win = 0;
        private static int Draw = 0;
        private static int turn_count = 0;
        private static boolean turn = true;
        private static boolean computer_turn=false;
        private static String player1;
        private static String player2;

        public Start() {

                XO_game obj=new XO_game();
                One_vs_computer obj2=new One_vs_computer();

                ArrayList<JButton> buttons = new ArrayList<JButton>();
                int x[] = {20, 140, 260}, y[] = {150, 270, 390}, count1 = 0, count2 = 0;

                String win1 = "" + player1_win;
                String win2 = "" + player2_win;
                String draw = "" + Draw;
                JFrame frame = new JFrame("X0 GAME");
                JPanel panel = new JPanel();
                JPanel panel1 = new JPanel();
                JPanel panel2 = new JPanel();
                JLabel label1 = new JLabel("PLAYER 1");
                JLabel label2 = new JLabel("PLAYER 2");
                JLabel label3 = new JLabel();
                JLabel label4 = new JLabel();
                JLabel label5 = new JLabel();
                JLabel label6 = new JLabel();
                JToolBar toolBar = new JToolBar();
                JButton play_again = new JButton("Play again");
                JButton one_vs_one_mood = new JButton("  1 vs 1 ");
                JButton computer_mood = new JButton("computer mood");

                one_vs_one_mood.setEnabled(false);


                for (int i = 0; i < 9; i++) {
                        buttons.add(new JButton());
                        buttons.get(i).setBackground(Color.lightGray);
                        buttons.get(i).setBounds(x[count1], y[count2], 100, 100);
                        buttons.get(i).setFont(new Font("Arial", Font.PLAIN, 40));
                        buttons.get(i).setForeground(Color.lightGray);
                        buttons.get(i).setText("" + i);
                        frame.add(buttons.get(i));
                        count1++;
                        if (count1 % 3 == 0)
                                count1 = 0;
                        if ((i + 1) % 3 == 0)
                                count2++;
                }




                panel1.setBounds(50, 70, 100, 30);
                panel1.setBackground(Color.white);
                panel1.add(label1);
                panel2.setBounds(230, 70, 100, 30);
                panel2.setBackground(Color.WHITE);
                panel2.add(label2);

                label3.setText(win1);
                label3.setForeground(Color.WHITE);
                label3.setBounds(90, 90, 40, 40);

                label4.setText(win2);
                label4.setForeground(Color.WHITE);
                label4.setBounds(280, 90, 40, 40);

                label5.setText(draw);
                label5.setForeground(Color.WHITE);
                label5.setBounds(190, 90, 40, 40);

                label6.setText("draw");
                label6.setForeground(Color.WHITE);
                label6.setBounds(178, 70, 40, 40);

                panel.setBackground(Color.DARK_GRAY);


                toolBar.add(play_again);
                toolBar.add(one_vs_one_mood);
                toolBar.add(computer_mood);
                toolBar.setFloatable(false);
                toolBar.setBackground(Color.GRAY);

                frame.getContentPane().add(toolBar, BorderLayout.PAGE_START);
                frame.add(label6);
                frame.add(label5);
                frame.add(label4);
                frame.add(label3);
                frame.add(panel1);
                frame.add(panel2);

                frame.add(panel);
                frame.pack();
                frame.setLocation(500, 100);
                frame.setSize(400, 550);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setResizable(false);

                String name1 = JOptionPane.showInputDialog("Enter player 1 name:");
                String name2 = JOptionPane.showInputDialog("Enter player 2 name:");

                if (name1.strip().equalsIgnoreCase(""))
                {

                }else
                {
                        label1.setText(name1);
                }
                if (name2.strip().equalsIgnoreCase(""))
                {

                }else
                {
                        label2.setText(name2);
                }


                one_vs_one_mood.setBackground(Color.lightGray);
                play_again.setBackground(Color.lightGray);
                computer_mood.setBackground(Color.LIGHT_GRAY);

                computer_mood.addActionListener(
                        new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                        turn_count = 0;
                                        turn = true;
                                        label2.setText("COMPUTER");
                                        Draw = 0;
                                        player1_win = 0;
                                        player2_win = 0;
                                        label4.setText("0");
                                        label3.setText("0");
                                        label5.setText("0");
                                        obj.New_game(buttons);
                                        computer_mood.setEnabled(false);
                                        one_vs_one_mood.setEnabled(true);
                                        computer_turn=true;
                                        cu=true;

                                }
                        }
                );
                one_vs_one_mood.addActionListener(
                        new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                        computer_turn=false;
                                        computer_mood.setEnabled(true);
                                        one_vs_one_mood.setEnabled(false);
                                        Draw=0;
                                        player1_win=0;
                                        player2_win=0;
                                        turn_count=0;
                                        turn=true;
                                        label2.setText("PLAYER 2");
                                        label4.setText("0");
                                        label3.setText("0");
                                        label5.setText("0");
                                        obj.New_game(buttons);
                                        String name2 = JOptionPane.showInputDialog("Enter player 2 name:");
                                        label2.setText(name2);

                                }
                        }
                );

                play_again.addActionListener(
                        new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                        obj.New_game(buttons);
                                        turn_count = 0;
                                        turn = true;
                                        cu=true;
                                }
                        }
                );

                buttons.forEach((n) -> n.addActionListener(
                        new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                        turn_count++;
                                                if (turn) {
                                                        n.setText("X");
                                                        turn = !turn;

                                                } else if(!turn&&!computer_turn)
                                                {
                                                        n.setText("O");
                                                        turn = !turn;
                                                }
                                        n.setEnabled(false);

                                        if (obj.Chek_win(buttons))
                                        {
                                                String winner;
                                                if (turn) {
                                                        winner = label2.getText();
                                                        player2_win++;
                                                        String wincounter = "" + player2_win;
                                                        label4.setText(wincounter);
                                                } else {
                                                        winner =label1.getText();
                                                        player1_win++;
                                                        String wincounter = "" + player1_win;
                                                        label3.setText(wincounter);
                                                        cu=false;
                                                }
                                                String message = String.format(winner + " win");
                                                JOptionPane.showMessageDialog(null, message);
                                                buttons.forEach(n -> n.setEnabled(false));
                                        }else
                                        {
                                                if (turn_count==9) {
                                                        Draw++;
                                                        String drawcounter = "" + Draw;
                                                        label5.setText(drawcounter);
                                                        String message = String.format("draw");
                                                        JOptionPane.showMessageDialog(null, message);
                                                }
                                        }
                                        if(computer_turn&&!turn)
                                        {
                                                int place=obj2.Computer_play(buttons);
                                                try {
                                                        buttons.get(place).setForeground(Color.BLACK);
                                                        buttons.get(place).setText("O");
                                                        buttons.get(place).setEnabled(false);
                                                }catch (IndexOutOfBoundsException e1)
                                                {

                                                }
                                                turn_count++;
                                                turn=!turn;

                                                if (obj2.Chek_win(buttons)&&cu)
                                                {
                                                        String winner;
                                                                winner = label2.getText();
                                                                player2_win++;
                                                                String wincounter = "" + player2_win;
                                                                label4.setText(wincounter);

                                                        String message = String.format(winner + " win");
                                                        JOptionPane.showMessageDialog(null, message);
                                                        buttons.forEach(n -> n.setEnabled(false));
                                                }
                                        }
                                }
                        }
                ));


        }
}