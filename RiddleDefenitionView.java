package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.RandomSlangWordListener;
import controller.RiddleDefenitionListener;
import controller.RiddleSlangWorldListener;

public class RiddleDefenitionView extends JFrame {

	private JPanel contentPane;
	private MenuView menuView;
	JLabel lbl_defeniton;
	JButton btn_lc1;
	JButton btn_lc2;
	JButton btn_lc3;
	JButton btn_lc4;
	private String randomKey;

	

	/**
	 * Create the frame.
	 */
	public RiddleDefenitionView(MenuView menuView) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 931, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		RiddleDefenitionListener ac = new RiddleDefenitionListener(this);
		this.menuView = menuView;
		
		
		
		lbl_defeniton = new JLabel("Label");
		lbl_defeniton.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_defeniton.setFont(new Font("Arial", Font.PLAIN, 20));
		lbl_defeniton.setBounds(108, 10, 676, 57);
		contentPane.add(lbl_defeniton);
		
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
        String value_key = "";
        
        // kết quả đúng.
        
        int randIdx_key = new Random().nextInt(size);
       

        this.randomKey = keyList.get(randIdx_key);
        value_key = this.getValue(this.randomKey);
		
        this.lbl_defeniton.setText("Hãy chọn slang words phù hợp cho từ '" + value_key +"':");
        
        // Kết quả 1.
        
        int randIdx_1 = 0;
        
        do 
        {
        	randIdx_1 = new Random().nextInt(size);
        	
        }while(randIdx_1 == randIdx_key);
        
        String randomKey_1 = keyList.get(randIdx_1);
		
		
		// Kết quả 2.
        
        int randIdx_2 = 0;
        
        do 
        {
        	randIdx_1 = new Random().nextInt(size);
        	
        }while(randIdx_2 == randIdx_key);
        
        String randomKey_2 = keyList.get(randIdx_2);
		
		
		
		// Kết quả 3.
        
        int randIdx_3 = 0;
        
        do 
        {
        	randIdx_3 = new Random().nextInt(size);
        	
        }while(randIdx_3 == randIdx_key);
        
        String randomKey_3 = keyList.get(randIdx_3);
		
		
		int randIdx_btn_value = new Random().nextInt(4);
		
		// gán giá trị đúng ngẫu nhiên cho 1 trong 4 button
		Random r = new Random();
		
		
		List<String> list_key = new ArrayList<String>();
		list_key.add(randomKey_1);
		list_key.add(randomKey_2);
		list_key.add(randomKey_3);
		
		
		List<JButton> list_button = new ArrayList<JButton>();
		list_button.add(btn_lc1);
		list_button.add(btn_lc2);
		list_button.add(btn_lc3);
		list_button.add(btn_lc4);
		
		r = new Random();
		int index_button = r.nextInt(list_button.size());
		JButton b = list_button.get(index_button);
		b.setText(this.randomKey);
		
		list_button.remove(index_button);
		
		for (int i = 0; i < list_button.size(); i++)
		{
			list_button.get(i).setText(list_key.get(i));
		}
		
	
	}
	
	
	public void checkResult(String key)
	{
		if (this.randomKey.equals(key))
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
		RiddleDefenitionView newRiddle = new RiddleDefenitionView(menuView);
		newRiddle.showInformation();
		this.dispose();
	}
	
	

}
