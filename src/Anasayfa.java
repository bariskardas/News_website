
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.UIManager;

import java.awt.Font;

import java.awt.SystemColor;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Anasayfa extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Anasayfa frame = new Anasayfa();
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
	public Anasayfa() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // formun kapanmasýný saðlar
		setBounds(400, 100, 1200, 1100);					// formun x , y, geniþlik , yükseklik kordinatlarýný ayarlar.
		contentPane = new JPanel();							// form içerisine panel oluþturduk.
		contentPane.setBackground(Color.WHITE);				// arkaplan rengi
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));	// formun kenarlarýnýn kalýnlýðý
		setContentPane(contentPane);								
		contentPane.setLayout(null);						/* setlayout = label vb. araçlarýný istediðiniz herhangi
																						bir yere  koymanýzý saðlar    */
		JLabel Xhaber = new JLabel("");
		Xhaber.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Anasayfa b= new Anasayfa();  	
				b.setVisible(true);						
				dispose(); 
			
			}
		});
		Xhaber.setIcon(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\xhaber.png"));
		Xhaber.setBackground(SystemColor.text);
		Xhaber.setBounds(266, 0, 649, 81);
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
		
		
		
		
		
		JLabel mansetresim = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\ysksecim.jpg"));
		mansetresim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Manset a= new Manset();  	
				a.setVisible(true);						
				dispose(); 
			}
		});
		mansetresim.setBounds(245, 168, 687, 348);
		contentPane.add(mansetresim);
		
		
		
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
