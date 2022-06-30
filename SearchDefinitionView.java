package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.List;
import java.util.Map;

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
import controller.SearchWordsListener;
import model.SlangWordModel;

public class SearchDefinitionView extends JFrame {

	private SearchWordsView searchWordsView;
	
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
	public SearchDefinitionView() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE );
		setBounds(100, 100, 928, 653);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		
		
		this.slangWordModel = new SlangWordModel();
		this.slangWordModel.get_SlangWord_Definition();
		
		
		
		SearchDefinitionListener dc = new SearchDefinitionListener(this);
		
		
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
		
		
	
		this.setVisible(true);
	}
	
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
			
			for (int i = 0; i < entry.getValue().size(); ++i)
			{
				if (entry.getValue().get(i).toLowerCase().contains(text.toLowerCase()))
				{
					defaultTableModel.addRow(
			                new Object[]{
			                      entry.getKey(), 
			                      entry.getValue(),                   
			                });
				}
			}
			
			
			
			
		}
		
		for (Map.Entry<String, List<String>> entry : this.slangWordModel.getWordList_1().entrySet()) {
			
			for (int i = 0; i < entry.getValue().size(); ++i)
			{
				if (entry.getValue().get(i).toLowerCase().contains(text.toLowerCase()))
				{
					defaultTableModel.addRow(
			                new Object[]{
			                      entry.getKey(), 
			                      entry.getValue(),                   
			                });
				}
			}
			
			
		}
		
		table.repaint();
		
	}

}
