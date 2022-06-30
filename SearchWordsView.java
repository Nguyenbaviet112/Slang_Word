package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.SearchWordsListener;
import model.SlangWordModel;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.List;
import java.util.Map;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class SearchWordsView extends JFrame {

	private JPanel contentPane;
	private JTextField textField_search;
	private SlangWordModel slangWordModel;
	private DefaultTableModel defaultTableModel;
	private JTable table;
	

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
		
		
		
		this.slangWordModel = new SlangWordModel();
		this.slangWordModel.get_SlangWord_Definition();
		
		
		
		SearchWordsListener dc = new SearchWordsListener(this);
		
		
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
		
		textField_search.getDocument().addDocumentListener(dc);
		
		JPanel panel_center = new JPanel();
		panel_center.setBounds(10, 211, 894, 395);
		contentPane.add(panel_center);
		
		
		defaultTableModel = new DefaultTableModel(
				new Object[][] {
					{null, null},
				},
				new String[] {
					"SlangWord", "Definition"
				}
			);
		panel_center.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 874, 278);
		panel_center.add(scrollPane);
		
		table = new JTable(defaultTableModel);
		scrollPane.setViewportView(table);
		
		
	
		
	
		

	}
	

	
	public void loadSlangWord()
	{
		this.defaultTableModel.setRowCount(0);
		String text = textField_search.getText();
		

		for (Map.Entry<String, List<String>> entry : this.slangWordModel.getWordList().entrySet()) {
			
			if (entry.getKey().toLowerCase().contains(text.toLowerCase()))
			{
				defaultTableModel.addRow(
		                new Object[]{
		                      entry.getKey(), 
		                      entry.getValue(),                   
		                });
			}
			
			
		}
		
		for (Map.Entry<String, List<String>> entry : this.slangWordModel.getWordList_1().entrySet()) {
			
			if (entry.getKey().toLowerCase().contains(text.toLowerCase()))
			{
				defaultTableModel.addRow(
		                new Object[]{
		                      entry.getKey(), 
		                      entry.getValue(),                   
		                });
			}
			
			
		}
		
		table.repaint();
		
	}
}
