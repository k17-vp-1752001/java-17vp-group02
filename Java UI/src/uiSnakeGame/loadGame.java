package uiSnakeGame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loadGame extends JPanel {
	Component component = new Component();
	
	public JPanel contentPane;
	JLabel lb_title_game;
	JList l_saved;
	JButton btn_choose;
	public JButton btn_return;
	
	/*
	 * create methods
	 * Resize(int width, int height) to change size of the panel
	 */
	public void Resize(int width, int height) {
		component.resizeLabel(lb_title_game, 34, 84, 11, 223, 54,width, height);
		component.resizeList(l_saved, 73, 67, 223, 191, width, height);
		component.resizeButton(btn_choose, 15, 121, 277, 128, 23,width, height);
		component.resizeButton(btn_return, 15, 121, 314, 128, 23,width, height);
	}
	
	/**
	 * Create the frame.
	 */
	public loadGame() {
		//setTitle("Load Game");
		//setBackground(new Color(240, 240, 240));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*
		JLabel lb_game_title = new JLabel("SNAKE GAME");
		lb_game_title.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 34));
		lb_game_title.setBounds(73, 11, 223, 54);
		contentPane.add(lb_game_title);
		*/
		lb_title_game = component.createLabelgameTitile();
		contentPane.add(lb_title_game);
		
		l_saved = new JList();
		l_saved.setBounds(73, 67, 223, 191);
		contentPane.add(l_saved);
		
		/*
		JButton btn_choose = new JButton("Choose");
		btn_choose.setBackground(new Color(255, 255, 255));
		btn_choose.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btn_choose.setBounds(121, 277, 128, 23);
		contentPane.add(btn_choose);
		*/
		btn_choose = component.createButton("Choose", 121, 277, 128, 23, 15);
		contentPane.add(btn_choose);
		
		/*
		JButton btn_return = new JButton("Return");
		btn_return.setBackground(Color.RED);
		btn_return.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btn_return.setBounds(121, 314, 128, 23);
		contentPane.add(btn_return);
		*/
		btn_return = component.createButton("Return", 121, 314, 128, 23, 15);
		btn_return.setBackground(Color.RED);
		contentPane.add(btn_return);
		
	 	//Event of components:
		/* 
			Event of return button
			use to return main menu
		 */
		btn_return.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				
			}
		});
	}
}

