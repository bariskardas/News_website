


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


public class Ekonomi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ekonomi frame = new Ekonomi();
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
	public Ekonomi() {
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
		
		
		
		JLabel resim2 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\devproje.jpg"));
		resim2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EkonomiHaber1 e1 = new EkonomiHaber1();
				e1.setVisible(true);
				 dispose(); // diðer formun kapanmasýný saðlar.
			}
		});
		resim2.setBounds(153, 167, 244, 137);
		contentPane.add(resim2);
		
		JTextArea toshiba = new JTextArea();
		toshiba.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EkonomiHaber1 e1 = new EkonomiHaber1();
				e1.setVisible(true);
				 dispose(); // diðer formun kapanmasýný saðlar.
			}
		});
		toshiba.setEditable(false);
		toshiba.setFont(new Font("Tahoma", Font.PLAIN, 16));
		toshiba.setForeground(UIManager.getColor("CheckBox.foreground"));
		toshiba.setBackground(Color.WHITE);
		toshiba.setText("Dev projede sona gelindi! Y\u0131ll\u0131k\r\n41,2 milyon lira katk\u0131 sa\u011Flayacak");
		toshiba.setBounds(153, 315, 244, 48);
		contentPane.add(toshiba);
		
		JLabel label = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\calisananne.jpg"));
		label.setBounds(751, 167, 244, 137);
		contentPane.add(label);
		
		JTextArea txtralanAnnelereMjde = new JTextArea();
		txtralanAnnelereMjde.setEditable(false);
		txtralanAnnelereMjde.setText("\u00C7al\u0131\u015Fan annelere m\u00FCjde! Yar\u0131m g\u00FCn \r\n\u00E7al\u0131\u015Fan anne tam g\u00FCn maa\u015F alacak");
		txtralanAnnelereMjde.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtralanAnnelereMjde.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtralanAnnelereMjde.setBackground(Color.WHITE);
		txtralanAnnelereMjde.setBounds(751, 315, 255, 48);
		contentPane.add(txtralanAnnelereMjde);
		
		JLabel label_1 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\tanzim.jpg"));
		label_1.setBounds(463, 167, 244, 137);
		contentPane.add(label_1);
		
		JTextArea txtrChpliBelediyelerdenTanzime = new JTextArea();
		txtrChpliBelediyelerdenTanzime.setEditable(false);
		txtrChpliBelediyelerdenTanzime.setText("Chp'li belediyelerden tanzime \r\nalternatif!Halk marketler kurulacak");
		txtrChpliBelediyelerdenTanzime.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrChpliBelediyelerdenTanzime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrChpliBelediyelerdenTanzime.setBackground(Color.WHITE);
		txtrChpliBelediyelerdenTanzime.setBounds(463, 315, 255, 48);
		contentPane.add(txtrChpliBelediyelerdenTanzime);
		
		JLabel label_2 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\devlet.jpg"));
		label_2.setBounds(153, 439, 244, 137);
		contentPane.add(label_2);
		
		JTextArea txtrDevletinVerdiiGarani = new JTextArea();
		txtrDevletinVerdiiGarani.setEditable(false);
		txtrDevletinVerdiiGarani.setText("Devletin verdi\u011Fi garani tutmad\u0131. \r\n2 milyar TL vatanda\u015F\u0131n cebinden \u00E7\u0131kt\u0131.");
		txtrDevletinVerdiiGarani.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrDevletinVerdiiGarani.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrDevletinVerdiiGarani.setBackground(Color.WHITE);
		txtrDevletinVerdiiGarani.setBounds(153, 587, 272, 48);
		contentPane.add(txtrDevletinVerdiiGarani);
		
		JLabel label_3 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\sehir.jpg"));
		label_3.setBounds(751, 439, 244, 137);
		contentPane.add(label_3);
		
		JTextArea txtrDnyannEnPahal = new JTextArea();
		txtrDnyannEnPahal.setEditable(false);
		txtrDnyannEnPahal.setText("D\u00FCnyan\u0131n en pahal\u0131 \u015Fehirleri a\u00E7\u0131kland\u0131! \r\n\u0130stanbulun s\u0131ralamas\u0131 \u015Fa\u015F\u0131rt\u0131yor");
		txtrDnyannEnPahal.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrDnyannEnPahal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrDnyannEnPahal.setBackground(Color.WHITE);
		txtrDnyannEnPahal.setBounds(751, 587, 276, 48);
		contentPane.add(txtrDnyannEnPahal);
		
		JLabel label_4 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\turist.jpg"));
		label_4.setBounds(463, 439, 244, 137);
		contentPane.add(label_4);
		
		JTextArea txtrAknAknGeliyorlar = new JTextArea();
		txtrAknAknGeliyorlar.setEditable(false);
		txtrAknAknGeliyorlar.setText("Ak\u0131n ak\u0131n geliyorlar, otellerde\r\nyer kalmad\u0131! Fiyatlar u\u00E7u\u015Fa ge\u00E7ti.");
		txtrAknAknGeliyorlar.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrAknAknGeliyorlar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrAknAknGeliyorlar.setBackground(Color.WHITE);
		txtrAknAknGeliyorlar.setBounds(463, 587, 244, 48);
		contentPane.add(txtrAknAknGeliyorlar);
		
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
		
		
	}
}
