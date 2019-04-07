

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.Icon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;


public class AnaHaber2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnaHaber2 frame = new AnaHaber2();
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
	public AnaHaber2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 1200, 1100);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel Xhaber = new JLabel("");
		Xhaber.setIcon(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\xhaber.png"));
		Xhaber.setBackground(SystemColor.text);
		Xhaber.setBounds(221, 0, 649, 81);
		contentPane.add(Xhaber);
		
		
		JButton btnGirisYap = new JButton("Giriþ Yap");
		btnGirisYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				KullanýcýGiris a= new KullanýcýGiris();  	// kullanýcýGiris classýndan nesne oluþturup kullanýcý giriþi formuna geçiþ saðladýk
				a.setVisible(true);							// formun görünür olmasýný saðlar.
				dispose();     							//diðer formu kapatýr.
				
			}
		});
		btnGirisYap.setForeground(Color.BLUE);
		btnGirisYap.setBackground(Color.WHITE);
		btnGirisYap.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGirisYap.setBounds(1061, 22, 113, 27);
		contentPane.add(btnGirisYap);
		
		
		JLabel lblAnasayfa = new JLabel("Anasayfa");
		lblAnasayfa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Anasayfa e1 = new Anasayfa();
				e1.setVisible(true);
				 dispose(); // diðer formun kapanmasýný saðlar.	
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblAnasayfa.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				lblAnasayfa.setForeground(Color.BLUE);
				
			}
		});
		lblAnasayfa.setForeground(Color.BLUE);
		lblAnasayfa.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblAnasayfa.setBounds(435, 100, 106, 33);
		contentPane.add(lblAnasayfa);
		
		JLabel lbliletisim = new JLabel("Ýletiþim");
		lbliletisim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Iletisim e1 = new Iletisim();
				e1.setVisible(true);
				 dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lbliletisim.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lbliletisim.setForeground(Color.BLUE);
			}
		});
		lbliletisim.setForeground(Color.BLUE);
		lbliletisim.setFont(new Font("Tahoma", Font.BOLD, 21));
		lbliletisim.setBounds(574, 100, 106, 33);
		contentPane.add(lbliletisim);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\otomobilBigImg.jpg"));
		lblNewLabel.setBounds(221, 275, 715, 387);
		contentPane.add(lblNewLabel);
		
		JLabel lblNbetiNoterUygulamas = new JLabel("N\u00F6bet\u00E7i Noter Uygulamas\u0131 Otomotiv Sekt\u00F6r\u00FCn\u00FC Canland\u0131racak");
		lblNbetiNoterUygulamas.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNbetiNoterUygulamas.setBounds(128, 153, 964, 53);
		contentPane.add(lblNbetiNoterUygulamas);
		
		JTextArea txtrMotorluAraSatclar = new JTextArea();
		txtrMotorluAraSatclar.setEditable(false);
		txtrMotorluAraSatclar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtrMotorluAraSatclar.setText("Motorlu Ara\u00E7 Sat\u0131c\u0131lar\u0131 Federasyonu Ba\u015Fkan\u0131 Ayd\u0131n Erko\u00E7, \"N\u00F6bet\u00E7i noterlik uygulamas\u0131 otomotiv sekt\u00F6r\u00FCnde \u00F6nemli rol oynayacak ve ekonominin \r\ncanlanmas\u0131na katk\u0131 sa\u011Flayacak\" dedi.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nMotorlu Ara\u00E7 Sat\u0131c\u0131lar\u0131 Federasyonu(MASFED) Ba\u015Fkan\u0131 Ayd\u0131n Erko\u00E7, \"n\u00F6bet\u00E7i noterlik\" uygulamas\u0131n\u0131n otomotiv sekt\u00F6r\u00FCne sa\u011Flayaca\u011F\u0131 katk\u0131lar\u0131 \r\nanlatt\u0131.Adalet Bakanl\u0131\u011F\u0131 ile T\u00FCrkiye Noterler Birli\u011Fi'nin n\u00F6bet\u00E7i noterli\u011Fe ili\u015Fkin \u00E7al\u0131\u015Fmalar\u0131 tamamlad\u0131\u011F\u0131n\u0131 hat\u0131rlatan Erko\u00E7, uygulaman\u0131n bu hafta\r\n sonu ba\u015Flayaca\u011F\u0131n\u0131 s\u00F6yledi. Erko\u00E7, 2'nci el ara\u00E7 al\u0131m sat\u0131mlar\u0131nda resmi devir i\u015Flemlerinin yap\u0131labildi\u011Fi tek kurumun noterler oldu\u011Funa i\u015Faret \r\nederek, buralar\u0131n otomotiv piyasas\u0131nda i\u015F hacminin en yo\u011Fun oldu\u011Fu cumartesi ve pazar da hizmet vermesini memnuniyetle kar\u015F\u0131lad\u0131klar\u0131n\u0131 \r\nbildirdi.\r\n\r\n\u0130nsanlar\u0131n hafta i\u00E7inde genelde yo\u011Fun olduklar\u0131na dikkati \u00E7eken Erko\u00E7,\u015F\u00F6yle devam etti:\r\n\r\n\"Bir\u00E7ok insan hafta sonu al\u0131\u015Fveri\u015F yapabiliyor. Otomobil almak i\u00E7in uzun bir zamana ihtiya\u00E7 olabiliyor. Bu anlamda insanlar hafta i\u00E7i vakit\r\n bulamad\u0131klar\u0131ndan hafta sonu ara\u00E7 bak\u0131yorlar. N\u00F6bet\u00E7i noterlik uygulamas\u0131 otomotiv sekt\u00F6r\u00FCnde \u00F6nemli bir rol oynayacak ve ekonominin\r\ncanlanmas\u0131na katk\u0131 sa\u011Flayacak.\"");
		txtrMotorluAraSatclar.setBounds(128, 220, 934, 746);
		contentPane.add(txtrMotorluAraSatclar);
		
		
		
		
	}
}
