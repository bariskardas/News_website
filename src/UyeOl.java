import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.TextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UyeOl extends JFrame {

	private JPanel contentPane;
	private JTextField txtAdi1;
	private JTextField txtSoyadi1;
	private JTextField txtKullaniciadi1;
	private JPasswordField Sifre1;
	private JPasswordField SifreTekrar1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UyeOl frame = new UyeOl();
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
	public UyeOl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 1200, 1100);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdi1 = new JLabel("Adý:");
		lblAdi1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAdi1.setForeground(Color.BLACK);
		lblAdi1.setBounds(452, 152, 86, 19);
		contentPane.add(lblAdi1);
		
		txtAdi1 = new JTextField();
		txtAdi1.setBounds(564, 153, 99, 20);
		contentPane.add(txtAdi1);
		txtAdi1.setColumns(10);
		
		JLabel lblSoyadi1 = new JLabel("Soyadý:");
		lblSoyadi1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSoyadi1.setForeground(Color.BLACK);
		lblSoyadi1.setBounds(452, 198, 57, 19);
		contentPane.add(lblSoyadi1);
		
		txtSoyadi1 = new JTextField();
		txtSoyadi1.setBounds(564, 199, 99, 20);
		contentPane.add(txtSoyadi1);
		txtSoyadi1.setColumns(10);
		
		JLabel lblKullaniciadi1 = new JLabel("Kullanýcý adý:");
		lblKullaniciadi1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKullaniciadi1.setForeground(Color.BLACK);
		lblKullaniciadi1.setBounds(452, 279, 86, 20);
		contentPane.add(lblKullaniciadi1);
		
		txtKullaniciadi1 = new JTextField();
		txtKullaniciadi1.setBounds(564, 279, 99, 20);
		contentPane.add(txtKullaniciadi1);
		txtKullaniciadi1.setColumns(10);
		
		JLabel lblSifre1 = new JLabel("Þifre:");
		lblSifre1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSifre1.setForeground(Color.BLACK);
		lblSifre1.setBounds(452, 326, 86, 20);
		contentPane.add(lblSifre1);
		
		Sifre1 = new JPasswordField();
		Sifre1.setBounds(564, 328, 99, 20);
		contentPane.add(Sifre1);
		
		JLabel lblSifreTekrar1 = new JLabel("Þifre (Tekrar):");
		lblSifreTekrar1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSifreTekrar1.setForeground(Color.BLACK);
		lblSifreTekrar1.setBounds(451, 371, 99, 17);
		contentPane.add(lblSifreTekrar1);
		
		SifreTekrar1 = new JPasswordField();
		SifreTekrar1.setBounds(564, 371, 99, 20);
		contentPane.add(SifreTekrar1);
		
		JLabel lblDogumTarihi1 = new JLabel("Doðum tarihi : ");
		lblDogumTarihi1.setForeground(Color.BLACK);
		lblDogumTarihi1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDogumTarihi1.setBounds(452, 242, 112, 17);
		contentPane.add(lblDogumTarihi1);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
		comboBox.addItem("4");
		comboBox.addItem("5");
		comboBox.addItem("6");
		comboBox.addItem("7");
		comboBox.addItem("8");
		comboBox.addItem("9");
		comboBox.addItem("10");
		comboBox.addItem("11");
		comboBox.addItem("12");
		comboBox.addItem("13");
		comboBox.addItem("14");
		comboBox.addItem("15");
		comboBox.addItem("16");
		comboBox.addItem("17");
		comboBox.addItem("18");
		comboBox.addItem("19");
		comboBox.addItem("20");
		comboBox.addItem("21");
		comboBox.addItem("22");
		comboBox.addItem("23");
		comboBox.addItem("24");
		comboBox.addItem("25");
		comboBox.addItem("26");
		comboBox.addItem("27");
		comboBox.addItem("28");
		comboBox.addItem("29");
		comboBox.addItem("30");
		comboBox.addItem("31");
		comboBox.setSelectedItem(null);
		comboBox.setBounds(576, 242, 45, 20);
		contentPane.add(comboBox);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.addItem("1");
		comboBox_1.addItem("2");
		comboBox_1.addItem("3");
		comboBox_1.addItem("4");
		comboBox_1.addItem("5");
		comboBox_1.addItem("6");
		comboBox_1.addItem("7");
		comboBox_1.addItem("8");
		comboBox_1.addItem("9");
		comboBox_1.addItem("10");
		comboBox_1.addItem("11");
		comboBox_1.addItem("12");
		comboBox_1.setSelectedItem(null);
		comboBox_1.setBounds(629, 242, 45, 20);
		contentPane.add(comboBox_1);
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.addItem("1980");
		comboBox_2.addItem("1981");
		comboBox_2.addItem("1982");
		comboBox_2.addItem("1983");
		comboBox_2.addItem("1984");
		comboBox_2.addItem("1985");
		comboBox_2.addItem("1986");
		comboBox_2.addItem("1987");
		comboBox_2.addItem("1988");
		comboBox_2.addItem("1989");
		comboBox_2.addItem("1990");
		comboBox_2.addItem("1991");
		comboBox_2.addItem("1992");
		comboBox_2.addItem("1993");
		comboBox_2.addItem("1994");
		comboBox_2.addItem("1995");
		comboBox_2.addItem("1996");
		comboBox_2.addItem("1997");
		comboBox_2.addItem("1998");
		comboBox_2.addItem("1999");
		comboBox_2.addItem("2000");
		comboBox_2.setSelectedItem(null);
		comboBox_2.setBounds(692, 242, 68, 20);
		contentPane.add(comboBox_2);
		
		JButton btnKaytOl = new JButton("Kayýt Ol");
		btnKaytOl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a = txtAdi1.getText();
				String b = txtSoyadi1.getText();
				String c = txtKullaniciadi1.getText();
				String d = Sifre1.getText();
				String e = SifreTekrar1.getText();
				
                if(d.equals(e))
                {
                	
                }    
				
                else{
                	
                	JOptionPane.showMessageDialog(null, "Þifreniz eþleþmiyor !!!",null ,JOptionPane.ERROR_MESSAGE);
                }
                
				
				 if(a.length()!=0 && b.length()!=0 && c.length()!=0 && d.length()!=0 && e.length()!=0  && (d.equals(e)) )
				{
					JOptionPane.showMessageDialog(null, "Baþarýyla Kayýt Olundu ! !",null ,JOptionPane.INFORMATION_MESSAGE);	
				}
				
				 else {
						JOptionPane.showMessageDialog(null, "Lütfen bilgilerinizi eksiksiz giriniz !!!",null,JOptionPane.ERROR_MESSAGE);
					}
				 
					
				    txtAdi1.setText(null);
			        txtSoyadi1.setText(null);
			        txtKullaniciadi1.setText(null);
			        Sifre1.setText(null);
			        SifreTekrar1.setText(null);
				 
				 
				
			}
		});
		btnKaytOl.setFont(new Font("Arial", Font.BOLD, 14));
		btnKaytOl.setBounds(574, 462, 89, 23);
		contentPane.add(btnKaytOl);
		
		JButton btnCikis = new JButton("Çýkýþ");
		btnCikis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			System.exit(0);
			}
		});
		btnCikis.setFont(new Font("Arial", Font.BOLD, 14));
		btnCikis.setBounds(440, 461, 89, 25);
		contentPane.add(btnCikis);
		
		JLabel lblTelNo = new JLabel("Tel No:");
		lblTelNo.setForeground(Color.BLACK);
		lblTelNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTelNo.setBounds(452, 411, 86, 20);
		contentPane.add(lblTelNo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(564, 411, 99, 20);
		contentPane.add(textField);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(new Color(255, 204, 51));
		panel.setBounds(381, 111, 395, 447);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblKaytOl = new JLabel("KAYIT  OL");
		lblKaytOl.setBounds(154, 0, 106, 36);
		panel.add(lblKaytOl);
		lblKaytOl.setForeground(Color.BLACK);
		lblKaytOl.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblGeriDnmekIin = new JLabel("Ana sayfaya geri dön");
		lblGeriDnmekIin.setBounds(97, 396, 191, 23);
		panel.add(lblGeriDnmekIin);
		lblGeriDnmekIin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Anasayfa c = new Anasayfa();
				c.setVisible(true);
				 dispose(); // diðer formun kapanmasýný saðlar.
				
			}
		});
		lblGeriDnmekIin.setForeground(Color.WHITE);
		lblGeriDnmekIin.setFont(new Font("Tahoma", Font.PLAIN, 18));
	}
}

