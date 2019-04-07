
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


public class MagazinHaber1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MagazinHaber1 frame = new MagazinHaber1();
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
	public MagazinHaber1() {
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
		label.setIcon(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\instagramBigImg.jpg"));
		label.setBounds(221, 326, 657, 387);
		contentPane.add(label);
		
		JTextArea txtrManisannehzadelerIlesinde = new JTextArea();
		txtrManisannehzadelerIlesinde.setEditable(false);
		txtrManisannehzadelerIlesinde.setText("\u0130ngiltere Prensi Harry ve e\u015Fi D\u00FC\u015Fes Meghan'\u0131n Instagram hesab\u0131, k\u0131sa s\u00FCrede 1 milyon takip\u00E7iye ula\u015Fma rekorunu k\u0131rarak \r\nGuinness Rekorlar Kitab\u0131'na girdi.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n5 SAAT \u0130\u00C7\u0130NDE 1 M\u0130LYONA ULA\u015ETI\r\n\r\n\u0130ngiltere Prensi Harry ve e\u015Fi D\u00FC\u015Fes Meghan, sosyal medya sitesi Instagram'da \"Sussex Royal\" isimli bir hesap a\u00E7t\u0131.Hesab\u0131n \r\ntakip\u00E7i say\u0131s\u0131, 5 saat 45 dakika i\u00E7inde 1 milyona ula\u015Ft\u0131. Guinness Rekorlar Kitab\u0131 yetkilileri, bunun bir rekor oldu\u011Funu duyurarak\r\n1 milyon takip\u00E7iye 11 saat 35 dakikada ula\u015Fan Kang Daniel'i ge\u00E7tiklerini ifade etti.\r\n\r\n\"M\u00DCH\u0130M MESELELER\u0130 AYDINLATMAK \u0130ST\u0130YORUZ\"\r\n\r\n\u00C7ift, Instagram'da payla\u015Ft\u0131klar\u0131 ilk g\u00F6rselde, \"Resmi Instagram hesab\u0131m\u0131za ho\u015F geldiniz; ne yapt\u0131\u011F\u0131m\u0131z\u0131 payla\u015Fmak, \u00F6nemli\r\nduyurularda bulunmak ve m\u00FChim meseleleri ayd\u0131nlatmak istiyoruz\" ifadesini kulland\u0131.");
		txtrManisannehzadelerIlesinde.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtrManisannehzadelerIlesinde.setBounds(147, 255, 809, 746);
		contentPane.add(txtrManisannehzadelerIlesinde);
		
		JTextArea txtrPrensHarryVe = new JTextArea();
		txtrPrensHarryVe.setText("Prens Harry ve D\u00FC\u015Fes Meghan'\u0131n Instagram Hesab\u0131\r\nD\u00FCnya Rekoru K\u0131rd\u0131");
		txtrPrensHarryVe.setFont(new Font("Tahoma", Font.BOLD, 32));
		txtrPrensHarryVe.setEditable(false);
		txtrPrensHarryVe.setBounds(147, 163, 833, 81);
		contentPane.add(txtrPrensHarryVe);
		
		
	}
}
