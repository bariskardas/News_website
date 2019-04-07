
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


public class AnaHaber3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnaHaber3 frame = new AnaHaber3();
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
	public AnaHaber3() {
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
		
		JLabel lblAliKounAklamalar = new JLabel("AL\u0130 KO\u00C7'UN A\u00C7IKLAMALARI");
		lblAliKounAklamalar.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAliKounAklamalar.setBounds(192, 758, 664, 53);
		contentPane.add(lblAliKounAklamalar);
		
		JLabel lblfenerOlKampanyas = new JLabel("\"Fener Ol\" Kampanyas\u0131 5 Milyon TL'yi Ge\u00E7ti");
		lblfenerOlKampanyas.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblfenerOlKampanyas.setBounds(192, 154, 964, 53);
		contentPane.add(lblfenerOlKampanyas);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\fenerBigImg.jpg"));
		label.setBounds(192, 258, 752, 386);
		contentPane.add(label);
		
		JTextArea txtrFenerbaheninNisan = new JTextArea();
		txtrFenerbaheninNisan.setEditable(false);
		txtrFenerbaheninNisan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtrFenerbaheninNisan.setText("Fenerbah\u00E7e'nin 4 Nisan tarihinde ba\u015Flatt\u0131\u011F\u0131 \"Fener Ol\" kampanyas\u0131n\u0131n 5 milyon TL'nin \u00FCzerinde bir rakama ula\u015Ft\u0131\u011F\u0131 belirtildi.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nFenerbah\u00E7e'de \"Fener Ol\" kampanyas\u0131 19.07 itibariyle ba\u015Flad\u0131. Ba\u015Fkan Ali Ko\u00E7'un ba\u015Flatt\u0131\u011F\u0131 Fener Ol kampanyas\u0131, h\u0131zl\u0131 bir\r\nba\u015Flang\u0131\u00E7 yapt\u0131.\r\n\r\nAli Ko\u00E7'un FB TV'deki konu\u015Fmas\u0131n\u0131n ard\u0131ndan yakla\u015F\u0131k 2 saatlik s\u00FCre i\u00E7erisinde 2 milyon TL civar\u0131nda bir rakama ula\u015Fm\u0131\u015Ft\u0131.\r\nToplam rakam\u0131n ise 5 milyonu ge\u00E7ti\u011Fi ifade edildi.\r\n\r\n\r\n\r\nAli Ko\u00E7, \"Nisan ay\u0131 itibariyle Fener Ol kampanyas\u0131 olmadan \u00F6n\u00FCm\u00FCz\u00FC g\u00F6remiyoruz. En az 3 defa \u015Eampiyonlar Ligine\r\nkat\u0131lmal\u0131y\u0131z. Bu sezon zarardaki 60 milyon euro fark\u0131 kapatamazsak Avrupa kupalar\u0131na kat\u0131lamayaca\u011F\u0131z. Gelin hep birlikte\r\nFenerbah\u00E7eli olmay\u0131 dosta d\u00FC\u015Fmana g\u00F6sterelim. Ya\u015Fa Fenerbah\u00E7e.\" dedi.");
		txtrFenerbaheninNisan.setBounds(192, 218, 786, 718);
		contentPane.add(txtrFenerbaheninNisan);
		
		
		
		
	}
}
