import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.text.ParseException;

import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;

public class QuanLy {

	static JFrame frame = new JFrame("Manager");
	private JTextField txMaSP;
	private JTextField txName;
	private JTextField txNumber;
	private JTextField txPrice;
	private JFormattedTextField txDateInput;
	private JFormattedTextField txDayMade;
	private JFormattedTextField  txExpired;
	private JTextField txOrigin;
	private JTable table;
	static MaskFormatter df;
	private JTextField textField;
	public void date() {
		try {
			df = new MaskFormatter("##/##/####");
			df.setPlaceholderCharacter('-');
		}catch(ParseException e) {
			e.printStackTrace();
		}
	}

	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLy window = new QuanLy();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
        public QuanLy() {
        date();
        
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 1300, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(561, 0, 738, 467);
		
		table = new JTable();
		table.setAutoCreateRowSorter(true);
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 s\u1EA3n ph\u1EA9m", "T\u00EAn s\u1EA3n ph\u1EA9m","S\u1ED1 l\u01B0\u1EE3ng", "Gi\u00E1 c\u1EA3",  "Ng\u00E0y nh\u1EADp", "Ng\u00E0y SX", "H\u1EA1n SD","Xu\u1EA5t x\u1EE9",  "Loai s\u1EA3n ph\u1EA9m"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(84);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		table.getColumnModel().getColumn(8).setPreferredWidth(90);
		scrollPane.setViewportView(table);
		frame.getContentPane().add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("QU\u1EA2N L\u00DD S\u1EA2N PH\u1EA8M C\u1EE6A C\u1EECA H\u00C0NG");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(157, 11, 233, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("M\u00E3 s\u1EA3n ph\u1EA9m");
		lblNewLabel_1.setBounds(10, 90, 78, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("T\u00EAn s\u1EA3n ph\u1EA9m");
		lblNewLabel_1_1.setBounds(10, 128, 88, 27);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("S\u1ED1 l\u01B0\u1EE3ng\r\n");
		lblNewLabel_1_2.setBounds(10, 166, 78, 27);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Gi\u00E1 c\u1EA3\r\n");
		lblNewLabel_1_3.setBounds(10, 204, 78, 27);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_5 = new JLabel("Ng\u00E0y nh\u1EADp");
		lblNewLabel_1_5.setBounds(277, 90, 78, 27);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Ng\u00E0y s\u1EA3n xu\u1EA5t\r\n");
		lblNewLabel_1_6.setBounds(277, 128, 92, 27);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("H\u1EA1n s\u1EED d\u1EE5ng");
		lblNewLabel_1_7.setBounds(277, 166, 78, 27);
		frame.getContentPane().add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Xu\u1EA5t x\u1EE9");
		lblNewLabel_1_8.setBounds(277, 204, 78, 27);
		frame.getContentPane().add(lblNewLabel_1_8);
		
		txMaSP = new JTextField();
		txMaSP.setBounds(108, 93, 96, 20);
		frame.getContentPane().add(txMaSP);
		txMaSP.setColumns(10);
		
		txName = new JTextField();
		txName.setColumns(10);
		txName.setBounds(108, 131, 96, 20);
		frame.getContentPane().add(txName);
		
		txNumber = new JTextField();
		txNumber.setColumns(10);
		txNumber.setBounds(108, 169, 96, 20);
		frame.getContentPane().add(txNumber);
		
		txPrice = new JTextField();
		txPrice.setColumns(10);
		txPrice.setBounds(108, 207, 96, 20);
		frame.getContentPane().add(txPrice);
		
		txDateInput = new JFormattedTextField(df);
		txDateInput.setColumns(10);
		txDateInput.setBounds(379, 93, 96, 20);
		frame.getContentPane().add(txDateInput);
		
		txDayMade = new JFormattedTextField(df);
		txDayMade.setColumns(10);
		txDayMade.setBounds(379, 131, 96, 20);
		frame.getContentPane().add(txDayMade);
		
		txExpired = new JFormattedTextField(df);
		txExpired.setColumns(10);
		txExpired.setBounds(379, 169, 96, 20);
		frame.getContentPane().add(txExpired);
		
		txOrigin = new JTextField();
		txOrigin.setColumns(10);
		txOrigin.setBounds(379, 207, 96, 20);
		frame.getContentPane().add(txOrigin);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Tráng miệng", "Thịt ", "Rau ", "Cá", "Hoa Quả"}));
		comboBox.setBounds(98, 259, 96, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Lo\u1EA1i th\u1EE9c \u0103n");
		lblNewLabel_1_3_1.setBounds(10, 257, 78, 27);
		frame.getContentPane().add(lblNewLabel_1_3_1);
		
		JButton btnNewButton = new JButton("Th\u00EAm s\u1EA3n ph\u1EA9m \r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 DefaultTableModel model = (DefaultTableModel) table.getModel();
				 model.addRow(new Object[] {
						txMaSP.getText(),
						txName.getText(),
						txNumber.getText(),
						txPrice.getText(),
						txDateInput.getText(),
						txDayMade .getText(),
						txExpired.getText(),
						txOrigin.getText(),
						comboBox.getSelectedItem(),
				 });
				 if(table.getSelectedRow() == -1) {
					 if(table.getRowCount() == 0) {
						 JOptionPane.showMessageDialog(null,"Bạn có chắc muốn thêm","Hệ thống quản lý cửa hàng",JOptionPane.OK_CANCEL_OPTION);
					 }
				 }
			}
		});
		        
				 
				
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 128, 128), null));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(46, 385, 126, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnXaSnPhm = new JButton("x\u00F3a s\u1EA3n ph\u1EA9m\r\n");
		btnXaSnPhm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow() == -1) {
					 if(table.getRowCount() == 0) {
						 JOptionPane.showMessageDialog(null,"Chưa có dữ liệu vào","Hệ thống quản lý cửa hàng",JOptionPane.OK_CANCEL_OPTION);
					 }else {
						 JOptionPane.showMessageDialog(null,"Chọn hàng để xóa","Hệ thống quản lý cửa hàng",JOptionPane.OK_CANCEL_OPTION);
					 }
					 }else {
						 model.removeRow(table.getSelectedRow());
					 
			       
				 }
			}
		});
		btnXaSnPhm.setForeground(UIManager.getColor("Button.focus"));
		btnXaSnPhm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnXaSnPhm.setBackground(Color.RED);
		btnXaSnPhm.setBounds(360, 385, 126, 32);
		frame.getContentPane().add(btnXaSnPhm);
		
		JButton btntLi = new JButton("\u0110\u1EB7t l\u1EA1i");
		btntLi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txMaSP.setText("");
				txName.setText("");
				txNumber.setText("");
				txPrice.setText("");
				txDateInput.setValue(null);
				txDayMade .setValue(null);
				txExpired.setValue(null);
				txOrigin.setText("");
				comboBox.setSelectedItem("Chọn");
			}
		});
		btntLi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btntLi.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 128, 128), null));
		btntLi.setBackground(new Color(0, 191, 255));
		btntLi.setBounds(202, 385, 126, 32);
		frame.getContentPane().add(btntLi);
		
		JButton btnNewButton_1 = new JButton("Exit\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame,"Bạn có muốn thoát" ,"Hệ thống quả lý cửa hàng" ,JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_NO_OPTION)
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(471, 436, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(144, 329, 331, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Tìm");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newFilter();
			}
		});
		btnNewButton_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.CYAN, Color.CYAN));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(46, 328, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		
		frame.setVisible(true);
		
		
		
		
		
	}
        private void newFilter() {
    		DefaultTableModel m = (DefaultTableModel) table.getModel();
    		m.fireTableDataChanged();
    		TableRowSorter trs =new TableRowSorter(m);
    		table.setRowSorter(trs);
    		trs.setRowFilter(RowFilter.regexFilter(textField.getText().toLowerCase()));
    	}
}
