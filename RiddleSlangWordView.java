package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.RiddleSlangWorldListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class RiddleSlangWordView extends JFrame {

	private JPanel contentPane;
	private MenuView menuView;
	JLabel lbl_SlangWord;
	JButton btn_lc1;
	JButton btn_lc2;
	JButton btn_lc3;
	JButton btn_lc4;
	private String value_key;
	
	

	/**
	 * Launch the application.
	 */


	public String getValue_key() {
		return value_key;
	}

	public void setValue_key(String value_key) {
		this.value_key = value_key;
	}

	/**
	 * Create the frame.
	 */
	public RiddleSlangWordView(MenuView menuView) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 931, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		RiddleSlangWorldListener ac = new RiddleSlangWorldListener(this);
		this.menuView = menuView;
		
		
		
		lbl_SlangWord = new JLabel("Label");
		lbl_SlangWord.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_SlangWord.setFont(new Font("Arial", Font.PLAIN, 20));
		lbl_SlangWord.setBounds(173, 10, 551, 57);
		contentPane.add(lbl_SlangWord);
		
		btn_lc1 = new JButton("New button");
		btn_lc1.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_lc1.setBounds(202, 134, 162, 76);
		btn_lc1.addMouseListener(ac);
		contentPane.add(btn_lc1);
		
		btn_lc2 = new JButton("New button");
		btn_lc2.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_lc2.setBounds(514, 134, 162, 76);
		btn_lc2.addMouseListener(ac);
		contentPane.add(btn_lc2);
		
		btn_lc3 = new JButton("New button");
		btn_lc3.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_lc3.setBounds(202, 266, 162, 76);
		btn_lc3.addMouseListener(ac);
		contentPane.add(btn_lc3);
		
		btn_lc4 = new JButton("New button");
		btn_lc4.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_lc4.setBounds(514, 266, 162, 76);
		btn_lc4.addMouseListener(ac);
		contentPane.add(btn_lc4);
		
		JButton btn_cancel = new JButton("Thoát");
		btn_cancel.setFont(new Font("Arial", Font.PLAIN, 20));
		btn_cancel.setBounds(26, 399, 162, 76);
		btn_cancel.addMouseListener(ac);
		contentPane.add(btn_cancel);
		
		JButton btn_continue = new JButton("Tiếp tục");
		btn_continue.setFont(new Font("Arial", Font.PLAIN, 20));
		btn_continue.setBounds(725, 399, 162, 76);
		btn_continue.addMouseListener(ac);
		contentPane.add(btn_continue);
		
		this.setVisible(true);
		
	}
	
	public String getValue(String randomKey)
	{
		boolean checkKey = this.menuView.getSlangWordList().containsKey(randomKey);
		boolean checkKey_1 = this.menuView.getSlangWordList_1().containsKey(randomKey);
		
		
        int randIdx_value = 0; 
        
        String value = "";
		
        
		if (checkKey == true)
		{	
			List<String> randomValue = this.menuView.getSlangWordList().get(randomKey);
			randIdx_value = new Random().nextInt(randomValue.size());
	        value = randomValue.get(randIdx_value);

		}
		else if (checkKey_1 == true)
		{
			List<String> randomValue_1 = this.menuView.getSlangWordList_1().get(randomKey);
			randIdx_value = new Random().nextInt(randomValue_1.size());
	        value = randomValue_1.get(randIdx_value);
		}
		
		return value;
	}
	
	public void showInformation()
	{
		Set<String> keySet = this.menuView.getSlangWordList().keySet();
	 	Set<String> keySet_1 = this.menuView.getSlangWordList_1().keySet();
	 	
	 	
        List<String> keyList = new ArrayList<>(keySet);
        keyList.addAll(keySet_1);
        
        int size = keyList.size();
        
        
        // kết quả đúng.
        
        int randIdx_key = new Random().nextInt(size);
        String randomKey = "";

        randomKey = keyList.get(randIdx_key);
        this.value_key = this.getValue(randomKey);
		
        this.lbl_SlangWord.setText("Hãy chọn nghĩa đúng cho từ '" + randomKey +"':");
        
        // Kết quả 1.
        
        int randIdx_1 = 0;
        
        do 
        {
        	randIdx_1 = new Random().nextInt(size);
        	
        }while(randIdx_1 == randIdx_key);
        
        randomKey = keyList.get(randIdx_1);
		String value_1 = this.getValue(randomKey);
		
		
		// Kết quả 2.
        
        int randIdx_2 = 0;
        
        do 
        {
        	randIdx_1 = new Random().nextInt(size);
        	
        }while(randIdx_2 == randIdx_key);
        
        randomKey = keyList.get(randIdx_2);
		String value_2 = this.getValue(randomKey);
		
		
		
		// Kết quả 3.
        
        int randIdx_3 = 0;
        
        do 
        {
        	randIdx_3 = new Random().nextInt(size);
        	
        }while(randIdx_3 == randIdx_key);
        
        randomKey = keyList.get(randIdx_3);
		String value_3 = this.getValue(randomKey);
		
		int randIdx_btn_value = new Random().nextInt(4);
		
		// gán giá trị đúng ngẫu nhiên cho 1 trong 4 button
		Random r = new Random();
		
		
		List<String> list_value = new ArrayList<String>();
		list_value.add(value_1);
		list_value.add(value_2);
		list_value.add(value_3);
		
		
		List<JButton> list_button = new ArrayList<JButton>();
		list_button.add(btn_lc1);
		list_button.add(btn_lc2);
		list_button.add(btn_lc3);
		list_button.add(btn_lc4);
		
		r = new Random();
		int index_button = r.nextInt(list_button.size());
		JButton b = list_button.get(index_button);
		b.setText(this.value_key);
		
		list_button.remove(index_button);
		
		for (int i = 0; i < list_button.size(); i++)
		{
			list_button.get(i).setText(list_value.get(i));
		}
		
	
	}
	
	
	public void checkResult(String value)
	{
		if (this.value_key.equals(value))
		{
			JOptionPane.showMessageDialog(contentPane, "Bạn đã chọn đúng đáp án.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		else 
		{
			JOptionPane.showMessageDialog(contentPane, "Bạn đã chọn sai đáp án.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
	}
	
	public void clickContinue()
	{
		RiddleSlangWordView newRiddle = new RiddleSlangWordView(menuView);
		newRiddle.showInformation();
		this.dispose();
	}

	
}
