
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


public class KapsamliAnasayfa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KapsamliAnasayfa frame = new KapsamliAnasayfa();
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
	public KapsamliAnasayfa() {
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
		
		JLabel resim = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\ysksecim.jpg"));
		resim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MansetHaber a= new MansetHaber();  	
				a.setVisible(true);						
				dispose(); 
			}
		});
		resim.setBounds(245, 168, 687, 348);
		contentPane.add(resim);
		
		JLabel lblAnasayfa = new JLabel("Anasayfa");
		lblAnasayfa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				KapsamliAnasayfa e1 = new KapsamliAnasayfa();
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
		lblAnasayfa.setBounds(227, 100, 106, 33);
		contentPane.add(lblAnasayfa);
		
		JLabel lblGundem = new JLabel("Gündem");
		lblGundem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblGundem.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblGundem.setForeground(Color.BLUE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Gundem e1 = new Gundem();
				e1.setVisible(true);
				 dispose();
			}
		});
		lblGundem.setForeground(Color.BLUE);
		lblGundem.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblGundem.setBounds(360, 107, 106, 19);
		contentPane.add(lblGundem);
		

		JLabel lblDnya = new JLabel("Dünya");
		lblDnya.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Dunya e1 = new Dunya();
				e1.setVisible(true);
				 dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblDnya.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblDnya.setForeground(Color.BLUE);
			}
		});
		lblDnya.setForeground(Color.BLUE);
		lblDnya.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblDnya.setBounds(476, 92, 79, 48);
		contentPane.add(lblDnya);
		
		JLabel lblEkonomi = new JLabel("Ekonomi");
		lblEkonomi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Ekonomi e1 = new Ekonomi();
				e1.setVisible(true);
				 dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblEkonomi.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblEkonomi.setForeground(Color.BLUE);
			}
		});
		lblEkonomi.setForeground(Color.BLUE);
		lblEkonomi.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblEkonomi.setBounds(565, 107, 106, 19);
		contentPane.add(lblEkonomi);
		
		
		JLabel lblMagazin = new JLabel("Magazin");
		lblMagazin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Magazin e1 = new Magazin();
				e1.setVisible(true);
				 dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblMagazin.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblMagazin.setForeground(Color.BLUE);
			}
		});
		lblMagazin.setForeground(Color.BLUE);
		lblMagazin.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblMagazin.setBounds(753, 103, 106, 26);
		contentPane.add(lblMagazin);
		
		JLabel lblSpor = new JLabel("Spor");
		lblSpor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Spor e1 = new Spor();
				e1.setVisible(true);
				 dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblSpor.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblSpor.setForeground(Color.BLUE);
			}
		});
		lblSpor.setForeground(Color.BLUE);
		lblSpor.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblSpor.setBounds(681, 103, 62, 26);
		contentPane.add(lblSpor);
		
		JLabel lbliletisim = new JLabel("Ýletiþim");
		lbliletisim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				KapsamliIletisim e1 = new KapsamliIletisim();
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
		lbliletisim.setBounds(869, 100, 106, 33);
		contentPane.add(lbliletisim);
		
		
		
		JLabel resim1 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\toshiba.jpg"));
		resim1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AnaHaber1 a= new AnaHaber1();  	
				a.setVisible(true);						
				dispose(); 
			}
		});
		resim1.setBounds(177, 550, 244, 137);
		contentPane.add(resim1);
		
		JTextArea toshiba = new JTextArea();
		toshiba.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AnaHaber1 a= new AnaHaber1();  	
				a.setVisible(true);						
				dispose();
			}
		});
		toshiba.setEditable(false);
		toshiba.setFont(new Font("Tahoma", Font.PLAIN, 16));
		toshiba.setForeground(UIManager.getColor("CheckBox.foreground"));
		toshiba.setBackground(Color.WHITE);
		toshiba.setText("D\u00FCnyaca \u00FCnl\u00FC marka tarih oluyor!\r\nArt\u0131k bu isimle piyasada olacak.");
		toshiba.setBounds(177, 698, 244, 48);
		contentPane.add(toshiba);
		
		
		JLabel resim2 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\otomobil.jpg"));
		resim2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AnaHaber2 a= new AnaHaber2();  	
				a.setVisible(true);						
				dispose();
			}
		});
		resim2.setBounds(487, 550, 244, 137);
		contentPane.add(resim2);
		
		JTextArea txtrOtomobilAlacaklarDikkat = new JTextArea();
		txtrOtomobilAlacaklarDikkat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AnaHaber2 a= new AnaHaber2();  	
				a.setVisible(true);						
				dispose();
			}
		});
		txtrOtomobilAlacaklarDikkat.setEditable(false);
		txtrOtomobilAlacaklarDikkat.setText("Otomobil alacaklar dikkat! Yar\u0131n\r\nba\u015Fl\u0131yor, sekt\u00F6r\u00FC canland\u0131racak.");
		txtrOtomobilAlacaklarDikkat.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrOtomobilAlacaklarDikkat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrOtomobilAlacaklarDikkat.setBackground(Color.WHITE);
		txtrOtomobilAlacaklarDikkat.setBounds(487, 698, 244, 48);
		contentPane.add(txtrOtomobilAlacaklarDikkat);
		
		
		JLabel resim3 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\fener.jpg"));
		resim3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AnaHaber3 a= new AnaHaber3();  	
				a.setVisible(true);						
				dispose();
				
			}
		});
		
		resim3.setBounds(775, 550, 244, 137);
		contentPane.add(resim3);
		
		JTextArea txtrfenerOlKampanyasna = new JTextArea();
		txtrfenerOlKampanyasna.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AnaHaber3 a= new AnaHaber3();  	
				a.setVisible(true);						
				dispose();
			}
		});
		txtrfenerOlKampanyasna.setEditable(false);
		txtrfenerOlKampanyasna.setText("\"Fener Ol\" kampanyas\u0131na dev \r\ndestek! \u0130\u015Fte g\u00FCncel tutar...");
		txtrfenerOlKampanyasna.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrfenerOlKampanyasna.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrfenerOlKampanyasna.setBackground(Color.WHITE);
		txtrfenerOlKampanyasna.setBounds(775, 698, 244, 48);
		contentPane.add(txtrfenerOlKampanyasna);
		
		JLabel label_2 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\kerem.jpg"));
		label_2.setBounds(177, 822, 244, 137);
		contentPane.add(label_2);
		
		JTextArea txtrAyrlkHaberlerineKerem = new JTextArea();
		txtrAyrlkHaberlerineKerem.setEditable(false);
		txtrAyrlkHaberlerineKerem.setText("Ayr\u0131l\u0131k haberlerine Kerem Bursin\r\nson noktay\u0131 koydu!");
		txtrAyrlkHaberlerineKerem.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrAyrlkHaberlerineKerem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrAyrlkHaberlerineKerem.setBackground(Color.WHITE);
		txtrAyrlkHaberlerineKerem.setBounds(177, 970, 244, 48);
		contentPane.add(txtrAyrlkHaberlerineKerem);
		
		JLabel label_3 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\siyaset.jpg"));
		label_3.setBounds(775, 822, 244, 137);
		contentPane.add(label_3);
		
		JTextArea txtrChpliMahmutTanal = new JTextArea();
		txtrChpliMahmutTanal.setEditable(false);
		txtrChpliMahmutTanal.setText("CHP' li Mahmut Tanal ve A haber\r\nmuhabiri canl\u0131 yay\u0131nda birbirine\r\ngirdi.");
		txtrChpliMahmutTanal.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrChpliMahmutTanal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrChpliMahmutTanal.setBackground(Color.WHITE);
		txtrChpliMahmutTanal.setBounds(775, 970, 244, 64);
		contentPane.add(txtrChpliMahmutTanal);
		
		JLabel label_4 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\alt\u0131n.jpg"));
		label_4.setBounds(487, 822, 244, 137);
		contentPane.add(label_4);
		
		JTextArea txtrAltnOlanlarDikkat = new JTextArea();
		txtrAltnOlanlarDikkat.setEditable(false);
		txtrAltnOlanlarDikkat.setText("Alt\u0131n\u0131 olanlar dikkat! \u0130\u015Fte gram,\r\n\u00E7eyrek ve cumhuriyet alt\u0131n\u0131\r\nfiyatlar\u0131");
		txtrAltnOlanlarDikkat.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrAltnOlanlarDikkat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrAltnOlanlarDikkat.setBackground(Color.WHITE);
		txtrAltnOlanlarDikkat.setBounds(487, 970, 244, 64);
		contentPane.add(txtrAltnOlanlarDikkat);
		
		
	}
}