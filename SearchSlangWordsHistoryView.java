package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.SearchDefinitionListener;
import model.SlangWordModel;

public class SearchSlangWordsHistoryView extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel defaultTableModel;
	private JTable table;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public SearchSlangWordsHistoryView() {
		
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
		
		JLabel lblNewLabel = new JLabel("History Search SlangWord");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(156, 24, 512, 99);
		panel_top.add(lblNewLabel);
		
		JPanel panel_center = new JPanel();
		panel_center.setBounds(10, 211, 894, 395);
		contentPane.add(panel_center);
		
		
		defaultTableModel = new DefaultTableModel(
				new Object[][] {},
				new String[] {
					"SlangWord"
				}
			);
		panel_center.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 874, 278);
		panel_center.add(scrollPane);
		
		table = new JTable(defaultTableModel);
		scrollPane.setViewportView(table);
		
		
	
		this.setVisible(true);
	}
}
