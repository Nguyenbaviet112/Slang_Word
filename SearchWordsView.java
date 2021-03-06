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
import java.io.BufferedWriter;
import java.io.File;
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

	private BufferedWriter  bufferedWriter;
	private JPanel contentPane;
	private JTextField textField_search;
	private DefaultTableModel defaultTableModel;
	private JTable table;
	private MenuView menuView;
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public SearchWordsView(MenuView menuView) {
		
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE );
		setBounds(100, 100, 928, 653);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		SearchWordsListener ac = new SearchWordsListener(this);
		this.menuView = menuView;
		
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
		
		table = new JTable(defaultTableModel) {
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
	            return false;}
		};
		scrollPane.setViewportView(table);
		
		File file = new File("historysearch.txt");
		this.bufferedWriter = null;
		
		try {
			this.bufferedWriter = new BufferedWriter(new FileWriter(file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		
		this.addWindowListener(ac);
		
		
	}
	
	this.setVisible(true);

}
	
	public void writeHistorySearchInFIle(String text)
	{
		try {
			
			bufferedWriter.write(text);
			bufferedWriter.newLine();
			bufferedWriter.flush();
		    System.out.println("Successfully wrote to the file.");
		}
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	public void closeFile()
	{
		try {
			  
            // always close the writer
        	bufferedWriter.close();
        }
        catch (Exception e) {
        	
        }
	}
	

	
	public void loadSlangWord()
	{
		
		
		String text = textField_search.getText();
		
		this.writeHistorySearchInFIle(text);
		
		if (text.equals(""))
		{
			this.defaultTableModel.setRowCount(0);
			return;
		}
		
		
		this.defaultTableModel.setRowCount(0);

		for (Map.Entry<String, List<String>> entry : this.menuView.getSlangWordList().entrySet()) {
			
			if (entry.getKey().toLowerCase().equals(text.toLowerCase()))
			{
				defaultTableModel.addRow(
		                new Object[]{
		                      entry.getKey(), 
		                      entry.getValue(),                   
		                });
			}
			
			
		}
		
		for (Map.Entry<String, List<String>> entry : this.menuView.getSlangWordList_1().entrySet()) {
			
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
	                      "Kh??ng t??m th???y SLangWord", 
	                      "",                   
	                });
		}
		
		System.out.println();
		table.repaint();
		
	}
}
