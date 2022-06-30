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
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class SearchWordsView extends JFrame {

	private JPanel contentPane;
	private JTextField textField_search;
	private SlangWordModel slangWordModel;
	private DefaultTableModel defaultTableModel;
	private JTable table;
	

	/**
	 * Launch the application.
	 */
	

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
		
		
		
		SearchWordsListener ac = new SearchWordsListener(this);
		
		
		JPanel panel_top = new JPanel();
		panel_top.setBounds(10, 10, 894, 173);
		contentPane.add(panel_top);
		panel_top.setLayout(null);
		
		textField_search = new JTextField();
		textField_search.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_search.setHorizontalAlignment(SwingConstants.LEFT);
		textField_search.setBounds(50, 29, 812, 54);
		panel_top.add(textField_search);
		textField_search.setColumns(10);
		
		JButton btn_Search = new JButton("Search");
		btn_Search.setFont(new Font("Arial", Font.PLAIN, 20));
		btn_Search.setBounds(338, 101, 202, 51);
		panel_top.add(btn_Search);
		btn_Search.addActionListener(ac);
		
		JPanel panel_center = new JPanel();
		panel_center.setBounds(10, 211, 894, 395);
		contentPane.add(panel_center);
		
		
		defaultTableModel = new DefaultTableModel(
				new Object[][] {},
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
		
		
	
		this.setVisible(true);
	
		

	}
	
//	public void writeHistorySearchInFIle(String text)
//	{
//		try {
//		      FileWriter myWriter = new FileWriter("historysearch.txt");
//		      myWriter.write(text);
//		      myWriter.close();
//		      System.out.println("Successfully wrote to the file.");
//		    } catch (IOException e) {
//		      System.out.println("An error occurred.");
//		      e.printStackTrace();
//		    }
//	}
	

	
	public void loadSlangWord()
	{
		String text = textField_search.getText();
		
		if (text.equals(""))
		{
			this.defaultTableModel.setRowCount(0);
			return;
		}
		
		
		this.defaultTableModel.setRowCount(0);

		for (Map.Entry<String, List<String>> entry : this.slangWordModel.getWordList().entrySet()) {
			
			if (entry.getKey().toLowerCase().equals(text.toLowerCase()))
			{
				defaultTableModel.addRow(
		                new Object[]{
		                      entry.getKey(), 
		                      entry.getValue(),                   
		                });
			}
			
			
		}
		
		for (Map.Entry<String, List<String>> entry : this.slangWordModel.getWordList_1().entrySet()) {
			
			if (entry.getKey().toLowerCase().equals(text.toLowerCase()))
			{
				defaultTableModel.addRow(
		                new Object[]{
		                      entry.getKey(), 
		                      entry.getValue(),                   
		                });
			}
			
			
		}
		
		int rowncount = defaultTableModel.getRowCount();
		
		if (rowncount == 0)
		{
			defaultTableModel.addRow(
	                new Object[]{
	                      "Không tìm thấy SLangWord", 
	                      "",                   
	                });
		}
		
		table.repaint();
		
	}
}
