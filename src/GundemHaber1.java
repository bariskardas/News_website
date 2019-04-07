
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


public class GundemHaber1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GundemHaber1 frame = new GundemHaber1();
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
	public GundemHaber1() {
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
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\FaciaBigImg.jpg"));
		label.setBounds(158, 292, 792, 387);
		contentPane.add(label);
		
		JLabel lblKlaYolundaFacia = new JLabel("K\u0131\u015Fla yolunda facia! Bedelli i\u00E7in birliklerine gidiyorlard\u0131");
		lblKlaYolundaFacia.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblKlaYolundaFacia.setBounds(147, 163, 832, 53);
		contentPane.add(lblKlaYolundaFacia);
		
		JTextArea txtrManisannehzadelerIlesinde = new JTextArea();
		txtrManisannehzadelerIlesinde.setEditable(false);
		txtrManisannehzadelerIlesinde.setText("Manisa'n\u0131n \u015Eehzadeler il\u00E7esinde askerlerin bulundu\u011Fu otomobilin park halindeki kamyona \u00E7arpt\u0131. Feci kazada otomobilde bulunan\r\nbedelli askerler Orhun Furkan Baykan (31) ile \u0130brahim T\u00FCfekli'nin (29) hayat\u0131n\u0131 kaybederken, biri kad\u0131n 2 ki\u015Fi yaraland\u0131. S\u00FCr\u00FCc\u00FCn\u00FCn \r\nhayati tehlikesinin bulundu\u011Fu \u00F6\u011Frenildi.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nManisa'n\u0131n \u015Eehzadeler il\u00E7esinde askerlerin bulundu\u011Fu otomobilin park halindeki kamyona \u00E7arpmas\u0131 sonucu 2 ki\u015Fi \u00F6ld\u00FC, biri a\u011F\u0131r \r\n2 ki\u015Fi yaraland\u0131.\r\n\r\nFeci kaza, \u0130stanbul-\u0130zmir karayolunun Yenik\u00F6y Mahallesi yak\u0131nlar\u0131nda meydana geldi. Bedelli askerlik yapacak arkada\u015Flar\u0131n\u0131\r\nbirliklerine g\u00F6t\u00FCren Enis Karada\u011F'\u0131n (29) kulland\u0131\u011F\u0131 otomobil, yol kenar\u0131nda park halindeki kamyona \u00E7arpt\u0131.\r\n\r\n\u00C7evredekilerin ihbar\u0131 \u00FCzerine kaza yerine gelen jandarma ve sa\u011Fl\u0131k ekipleri, otomobilde bulunan bedelli askerler Orhun Furkan\r\nBaykan (31) ile \u0130brahim T\u00FCfekli'nin (29) hayat\u0131n\u0131 kaybetti\u011Fini belirledi. Kazada yaralanan s\u00FCr\u00FCc\u00FC Manisa \u015Eehir Hastanesine, \r\nGamze Tercan (31) ise Merkezefendi Devlet Hastanesine kald\u0131r\u0131ld\u0131. S\u00FCr\u00FCc\u00FCn\u00FCn hayati tehlikesinin bulundu\u011Fu \u00F6\u011Frenildi.");
		txtrManisannehzadelerIlesinde.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtrManisannehzadelerIlesinde.setBounds(147, 217, 843, 746);
		contentPane.add(txtrManisannehzadelerIlesinde);
		
		
	}
}
