


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


public class Dunya extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dunya frame = new Dunya();
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
	public Dunya() {
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
		
		
		
		JLabel resim2 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\basbakan.jpg"));
		resim2.setBounds(167, 182, 244, 137);
		contentPane.add(resim2);
		
		JTextArea toshiba = new JTextArea();
		toshiba.setEditable(false);
		toshiba.setFont(new Font("Tahoma", Font.PLAIN, 16));
		toshiba.setForeground(UIManager.getColor("CheckBox.foreground"));
		toshiba.setBackground(Color.WHITE);
		toshiba.setText("\u0130ngiltere Ba\u015Fbakan\u0131 May 'den\r\n\u015Fartl\u0131 istifa mesaj\u0131...");
		toshiba.setBounds(167, 330, 244, 48);
		contentPane.add(toshiba);
		
		JLabel label = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\tanker.jpg"));
		label.setBounds(765, 182, 244, 137);
		contentPane.add(label);
		
		JTextArea txtrIindeTrklerDe = new JTextArea();
		txtrIindeTrklerDe.setEditable(false);
		txtrIindeTrklerDe.setText("\u0130\u00E7inde T\u00FCrkler de vard\u0131.\r\nKa\u00E7\u0131r\u0131lan tanker ele ge\u00E7irildi.");
		txtrIindeTrklerDe.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrIindeTrklerDe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrIindeTrklerDe.setBackground(Color.WHITE);
		txtrIindeTrklerDe.setBounds(765, 330, 244, 48);
		contentPane.add(txtrIindeTrklerDe);
		
		JLabel label_1 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\israil.jpg"));
		label_1.setBounds(477, 182, 244, 137);
		contentPane.add(label_1);
		
		JTextArea txtrIsrailBombardmannnArdndan = new JTextArea();
		txtrIsrailBombardmannnArdndan.setEditable(false);
		txtrIsrailBombardmannnArdndan.setText("\u0130srail bombard\u0131man\u0131n\u0131n ard\u0131ndan\r\nGazze'de gece yar\u0131s\u0131 ate\u015Fkes !");
		txtrIsrailBombardmannnArdndan.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrIsrailBombardmannnArdndan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrIsrailBombardmannnArdndan.setBackground(Color.WHITE);
		txtrIsrailBombardmannnArdndan.setBounds(477, 330, 244, 48);
		contentPane.add(txtrIsrailBombardmannnArdndan);
		
		JLabel label_2 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\yenizellanda.jpg"));
		label_2.setBounds(167, 454, 244, 137);
		contentPane.add(label_2);
		
		JTextArea txtrAbdyiKartranCami = new JTextArea();
		txtrAbdyiKartranCami.setEditable(false);
		txtrAbdyiKartranCami.setText("ABD'yi kar\u0131\u015Ft\u0131ran cami yang\u0131n\u0131!\r\nYeni Zellanda'ya ili\u015Fkin not bulundu.");
		txtrAbdyiKartranCami.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrAbdyiKartranCami.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrAbdyiKartranCami.setBackground(Color.WHITE);
		txtrAbdyiKartranCami.setBounds(167, 602, 259, 48);
		contentPane.add(txtrAbdyiKartranCami);
		
		JLabel label_3 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\trump.jpg"));
		label_3.setBounds(765, 454, 244, 137);
		contentPane.add(label_3);
		
		JTextArea txtrTrumpTmDnyann = new JTextArea();
		txtrTrumpTmDnyann.setEditable(false);
		txtrTrumpTmDnyann.setText("Trump, t\u00FCm d\u00FCnyan\u0131n tepkisine\r\n ra\u011Fmen tarihi imzay\u0131 att\u0131.");
		txtrTrumpTmDnyann.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrTrumpTmDnyann.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrTrumpTmDnyann.setBackground(Color.WHITE);
		txtrTrumpTmDnyann.setBounds(765, 602, 244, 48);
		contentPane.add(txtrTrumpTmDnyann);
		
		JLabel label_4 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\ucak.jpg"));
		label_4.setBounds(477, 454, 244, 137);
		contentPane.add(label_4);
		
		JTextArea txtrBelikannAbdden = new JTextArea();
		txtrBelikannAbdden.setEditable(false);
		txtrBelikannAbdden.setText("Bel\u00E7ika'n\u0131n ABD'den 4 milyar\r\neuroya ald\u0131\u011F\u0131 F-35'ler \u00E7\u00FCr\u00FCk \u00E7\u0131kt\u0131 !");
		txtrBelikannAbdden.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrBelikannAbdden.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrBelikannAbdden.setBackground(Color.WHITE);
		txtrBelikannAbdden.setBounds(477, 602, 244, 48);
		contentPane.add(txtrBelikannAbdden);
		
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
