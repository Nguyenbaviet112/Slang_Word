package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.MenuListener;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public MenuView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 929, 696);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel_Menu = new JPanel();
		panel_Menu.setBounds(315, 46, 300, 65);
		contentPane.add(panel_Menu);
		panel_Menu.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(103, 20, 93, 30);
		panel_Menu.add(lblNewLabel);
		
		JPanel panel_SelectMenu_1 = new JPanel();
		panel_SelectMenu_1.setBounds(10, 146, 440, 480);
		contentPane.add(panel_SelectMenu_1);
		panel_SelectMenu_1.setLayout(null);
		
		ActionListener ac = new MenuListener(this);
		JButton btn_searchSlangWord = new JButton("Tìm kiếm slag words");
		btn_searchSlangWord.addActionListener(ac);
		btn_searchSlangWord.setBounds(84, 51, 262, 41);
		panel_SelectMenu_1.add(btn_searchSlangWord);
		
		JLabel lblNewLabel_1 = new JLabel("1.");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 57, 64, 27);
		panel_SelectMenu_1.add(lblNewLabel_1);
		
		JButton btn_searchDefinition = new JButton("Tìm kiếm definition");
		btn_searchDefinition.addActionListener(ac);
		btn_searchDefinition.setBounds(84, 122, 262, 41);
		panel_SelectMenu_1.add(btn_searchDefinition);
		
		JLabel lblNewLabel_1_1 = new JLabel("2.");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 128, 64, 27);
		panel_SelectMenu_1.add(lblNewLabel_1_1);
		
		JButton btn_showHistory = new JButton("Hiển thị history");
		btn_showHistory.setBounds(84, 194, 262, 41);
		panel_SelectMenu_1.add(btn_showHistory);
		btn_showHistory.addActionListener(ac);
		
		JLabel lblNewLabel_1_2 = new JLabel("3.");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(10, 200, 64, 27);
		panel_SelectMenu_1.add(lblNewLabel_1_2);
		
		JButton btn_addSlangWord = new JButton("Add 1 slang word mới");
		btn_addSlangWord.setBounds(84, 260, 262, 41);
		panel_SelectMenu_1.add(btn_addSlangWord);
		btn_addSlangWord.addActionListener(ac);
		
		JLabel lblNewLabel_1_3 = new JLabel("4.");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(10, 266, 64, 27);
		panel_SelectMenu_1.add(lblNewLabel_1_3);
		
		JButton btn_editSlangWord = new JButton("Edit 1 slang word");
		btn_editSlangWord.setBounds(84, 328, 262, 41);
		panel_SelectMenu_1.add(btn_editSlangWord);
		btn_editSlangWord.addActionListener(ac);
		
		JLabel lblNewLabel_1_4 = new JLabel("5.");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(10, 334, 64, 27);
		panel_SelectMenu_1.add(lblNewLabel_1_4);
		
		JPanel panel_SelectMenu_1_1 = new JPanel();
		panel_SelectMenu_1_1.setLayout(null);
		panel_SelectMenu_1_1.setBounds(465, 146, 440, 480);
		contentPane.add(panel_SelectMenu_1_1);
		
		JButton btn_deleteSlangWord = new JButton("delete 1 slang word");
		btn_deleteSlangWord.setBounds(84, 51, 262, 41);
		panel_SelectMenu_1_1.add(btn_deleteSlangWord);
		btn_deleteSlangWord.addActionListener(ac);
		
		JLabel lblNewLabel_1_5 = new JLabel("6.");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_5.setBounds(10, 57, 64, 27);
		panel_SelectMenu_1_1.add(lblNewLabel_1_5);
		
		JButton btn_resetSlangWord = new JButton("Reset slang words");
		btn_resetSlangWord.setBounds(84, 122, 262, 41);
		panel_SelectMenu_1_1.add(btn_resetSlangWord);
		btn_resetSlangWord.addActionListener(ac);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("7.");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(10, 128, 64, 27);
		panel_SelectMenu_1_1.add(lblNewLabel_1_1_1);
		
		JButton btn_randomSlangWord = new JButton("Random 1 slang wrod");
		btn_randomSlangWord.setBounds(84, 194, 262, 41);
		panel_SelectMenu_1_1.add(btn_randomSlangWord);
		btn_randomSlangWord.addActionListener(ac);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("8.");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(10, 200, 64, 27);
		panel_SelectMenu_1_1.add(lblNewLabel_1_2_1);
		
		JButton btn_riddleSlangWord = new JButton("Đố vui slang words");
		btn_riddleSlangWord.setBounds(84, 260, 262, 41);
		panel_SelectMenu_1_1.add(btn_riddleSlangWord);
		btn_riddleSlangWord.addActionListener(ac);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("9.");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_3_1.setBounds(10, 266, 64, 27);
		panel_SelectMenu_1_1.add(lblNewLabel_1_3_1);
		
		JButton btn_riddleDefinition = new JButton("Đố vui defenition");
		btn_riddleDefinition.setBounds(84, 328, 262, 41);
		panel_SelectMenu_1_1.add(btn_riddleDefinition);
		btn_riddleDefinition.addActionListener(ac);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("10.");
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_4_1.setBounds(10, 334, 64, 27);
		panel_SelectMenu_1_1.add(lblNewLabel_1_4_1);
		
		this.setVisible(true);
	}
}
