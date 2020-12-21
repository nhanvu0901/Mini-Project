
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EtchedBorder;

public class Login {

    static JFrame frame = new JFrame("Login");
    static JPasswordField passwordField = new JPasswordField();
    static JButton btnNewButton = new JButton("Sumit");
    static JLabel lblNewLabel = new JLabel("T\u00EAn \u0110\u0103ng Nh\u1EADp\r\n\t\t");
    JLabel lblNewLabel_1 = new JLabel("M\u1EADt kh\u1EA9u");
    JLabel lblNewLabel_3 = new JLabel("\u0110\u0103ng Nh\u1EADp");
    JPanel panel =  new JPanel(new FlowLayout(FlowLayout.CENTER));
    JTextArea textArea = new JTextArea();
    static ImageIcon image = new ImageIcon("anh.jpg");
    JCheckBox chckbxNewCheckBox = new JCheckBox("ghi nh\u1EDB t\u00EAn \u0111\u0103ng nh\u1EADp");
    private final JButton btnNewButton_1 = new JButton("Cancel\r\n");
    private final JLabel lblNewLabel_2 = new JLabel("*");


    public Login(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(787,385);
        frame.getContentPane().setBackground(new Color(128, 128, 128));
        frame.getContentPane().setForeground(new Color(100, 149, 237));
        frame.setIconImage(image.getImage());
        frame.getContentPane().setLayout(null);

        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(192, 78, 129, 59);
        frame.getContentPane().add(lblNewLabel);

        textArea.setBackground(Color.WHITE);
        textArea.setForeground(Color.GRAY);
        textArea.setBounds(404, 97, 121, 22);
        frame.getContentPane().add(textArea);

        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setBackground(Color.WHITE);
        lblNewLabel_1.setBounds(192, 148, 90, 22);
        frame.getContentPane().add(lblNewLabel_1);

        lblNewLabel_3.setBounds(317, 53, 71, 17);
        frame.getContentPane().add(lblNewLabel_3);
        lblNewLabel_3.setForeground(Color.WHITE);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);

        passwordField.setBounds(405, 148, 120, 20);
        frame.getContentPane().add(passwordField);
        
        
        lblNewLabel_2.setForeground(Color.RED);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblNewLabel_2.setBounds(535, 102, 49, 14);
        lblNewLabel_2.setVisible(false);
        

        btnNewButton.setForeground(new Color(0, 0, 255));
        btnNewButton.setBorder(BorderFactory.createEtchedBorder());
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btnNewButton.setBackground(new Color(30, 144, 255));
        btnNewButton.setBounds(404, 209, 121, 23);
        btnNewButton.setFocusable(true);
        btnNewButton.addActionListener(new ActionListener() {
        	
        	@Override
            public void actionPerformed(ActionEvent arg0) {
        		try {
        			Class.forName("com.mysql.jdbc.Driver");
        			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/idlogin", "root","");
        			 Statement stmt = con.createStatement();
        			 String sql = "Select * from tblogin where UserName ='"+ textArea.getText()+"'and Password = '"+   passwordField.getText().toString()+"'";
        			 ResultSet rs = stmt.executeQuery(sql);
        			 if(rs.next()) {
        				 JOptionPane.showMessageDialog(null,"Đăng nhập thành công");
        					frame.dispose();
                        	QuanLy store = new QuanLy();
               	            store.NewScreen();
        			 }
        			
        			 else
        				JOptionPane.showMessageDialog(null,"Mật khẩu hoặc tên đăng nhập không đúng");
        			 con.close();
        		} catch(Exception e ) { System.out.print(e);}       	        		       		                                  	        
        	}
        });
        frame.getContentPane().add(btnNewButton);
       
            
        chckbxNewCheckBox.setBackground(new Color(138, 43, 226));
        chckbxNewCheckBox.setForeground(Color.WHITE);
        chckbxNewCheckBox.setBounds(404, 179, 200, 23);
        frame.getContentPane().add(chckbxNewCheckBox);
        btnNewButton_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        btnNewButton_1.setBackground(new Color(255, 0, 0));
        btnNewButton_1.setForeground(new Color(0, 0, 0));
        btnNewButton_1.setBounds(267, 209, 108, 23);
        btnNewButton_1.setFocusable(true);
        btnNewButton_1.addActionListener(new ActionListener() {
        	
        	@Override
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
            }
        });
           
        frame.getContentPane().add(btnNewButton_1);
       
        
        frame.getContentPane().add(lblNewLabel_2);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(138, 43, 226));
        panel.setBounds(29, 25, 671, 294);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
      
        
       
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
