package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;

public class SearchWordsView extends JFrame {

	private JPanel contentPane;
	private JTextField textField_search;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchWordsView frame = new SearchWordsView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SearchWordsView() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE );
		setBounds(100, 100, 928, 653);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel_top = new JPanel();
		panel_top.setBounds(10, 10, 894, 173);
		contentPane.add(panel_top);
		panel_top.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(42, 56, 123, 54);
		panel_top.add(lblNewLabel);
		
		textField_search = new JTextField();
		textField_search.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_search.setHorizontalAlignment(SwingConstants.LEFT);
		textField_search.setBounds(160, 56, 699, 54);
		panel_top.add(textField_search);
		textField_search.setColumns(10);
		
		JPanel panel_center = new JPanel();
		panel_center.setBounds(10, 211, 894, 395);
		contentPane.add(panel_center);
		panel_center.setLayout(null);
		
		JList list = new JList();
		list.setBounds(10, 27, 860, 358);
		list.setPreferredSize(new Dimension(200, 200));
		panel_center.add(list);
	}
}
