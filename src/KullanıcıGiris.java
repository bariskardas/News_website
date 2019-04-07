import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class KullanýcýGiris extends JFrame {

	private JPanel contentPane;
	private JTextField txtkullaniciadi;
	private JPasswordField sifre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KullanýcýGiris frame = new KullanýcýGiris();
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
	public KullanýcýGiris() {
		
		setBounds(400, 100, 1200, 1100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblsifre = new JLabel("Þifre:");
		lblsifre.setForeground(Color.BLACK);
		lblsifre.setFont(new Font("Arial", Font.BOLD, 14));
		lblsifre.setBounds(517, 334, 50, 25);
		contentPane.add(lblsifre);
		
		JLabel lblkullaniciadi = new JLabel("Kullanýcý adý : ");
		lblkullaniciadi.setForeground(Color.BLACK);
		lblkullaniciadi.setFont(new Font("Arial", Font.BOLD, 14));
		lblkullaniciadi.setBounds(468, 268, 99, 31);
		contentPane.add(lblkullaniciadi);
		
		JButton btngiris = new JButton("Giriþ");
		btngiris.setForeground(new Color(0, 0, 0));
		btngiris.setFont(new Font("Arial", Font.BOLD, 14));
		btngiris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String a= txtkullaniciadi.getText();				
				String b = sifre.getText();
				if(a.equals("bariskardas") && b.equals("baris.146") || a.equals("rmzn.ylc") && b.equals("arsýzbela") ){
					
					JOptionPane.showMessageDialog(null, "Baþarýyla giriþ yapýldý !",null ,JOptionPane.INFORMATION_MESSAGE);
			        dispose();
					
			        
					KapsamliAnasayfa ka= new KapsamliAnasayfa();
					ka.setVisible(true);
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Yanlýþ girildi !!!",null,
							JOptionPane.ERROR_MESSAGE);
					
				}
				txtkullaniciadi.setText(null);
		        sifre.setText(null);
			}
		});
		btngiris.setBounds(611, 390, 89, 23);
		contentPane.add(btngiris);
		
		txtkullaniciadi = new JTextField();
		txtkullaniciadi.setBounds(592, 274, 108, 20);
		contentPane.add(txtkullaniciadi);
		txtkullaniciadi.setColumns(10);
		
		sifre = new JPasswordField();
		sifre.setBounds(592, 337, 108, 20);
		contentPane.add(sifre);
		
		
		
		JButton btnk = new JButton("Çýkýþ");
		btnk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			System.exit(0);	
			}
		});
		btnk.setFont(new Font("Arial", Font.BOLD, 14));
		btnk.setBounds(466, 390, 89, 23);
		contentPane.add(btnk);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(378, 226, 392, 273);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblKullancGirii = new JLabel("KULLANICI GÝRÝÞÝ");
		lblKullancGirii.setForeground(new Color(0, 0, 128));
		lblKullancGirii.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblKullancGirii.setBounds(114, 0, 191, 32);
		panel.add(lblKullancGirii);
		
		JLabel lblYeniKaytOlmak = new JLabel("Yeni Kayýt için Týkla");
		lblYeniKaytOlmak.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				UyeOl b= new UyeOl();  	// UyeOl classýndan nesne oluþturup UyeOl formuna geçiþ saðladýk
				b.setVisible(true);							// formun görünür olmasýný saðlar.
				dispose();     		
			}
		});
		lblYeniKaytOlmak.setForeground(Color.WHITE);
		lblYeniKaytOlmak.setFont(new Font("Arial", Font.BOLD, 17));
		lblYeniKaytOlmak.setBounds(125, 212, 168, 31);
		panel.add(lblYeniKaytOlmak);
		
	
	}
}
