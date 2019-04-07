
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


public class EkonomiHaber1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EkonomiHaber1 frame = new EkonomiHaber1();
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
	public EkonomiHaber1() {
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
		label.setIcon(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\devprojeBigImg.jpg"));
		label.setBounds(221, 302, 640, 387);
		contentPane.add(label);
		
		JTextArea txtrManisannehzadelerIlesinde = new JTextArea();
		txtrManisannehzadelerIlesinde.setEditable(false);
		txtrManisannehzadelerIlesinde.setText("Samsun'da yap\u0131m\u0131 devam eden 19 May\u0131s Da\u011Fk\u00F6y Baraj\u0131'n\u0131n y\u00FCzde 99'u tamamland\u0131. 139 milyon 940 bin TL maliyeti bulunan baraj,\r\n\u00FClke ekonomisine y\u0131ll\u0131k 41 milyon 205 bin TL'lik katk\u0131 sa\u011Flayacak.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nY\u00FCzde 99'u tamamlanan 19 May\u0131s Da\u011Fk\u00F6y Baraj\u0131 ile y\u0131lda 22,27 milyon metrek\u00FCp i\u00E7me suyu ve \u00FClke ekonomisine y\u0131ll\u0131k 41 milyon 205 \r\nbin TL'lik katk\u0131 sa\u011Flanacak.\r\n\r\nDevlet Su \u0130\u015Fleri 7. B\u00F6lge M\u00FCd\u00FCrl\u00FC\u011F\u00FCn\u00FCn 2019 y\u0131l\u0131 yat\u0131r\u0131m program\u0131 kapsam\u0131nda Samsun'da devam eden 48 adet projesi bulunuyor. \r\nProjelerin toplam tutar\u0131 1 milyar 360 milyon 292 bin TL. Projelerden 25'inin yap\u0131m\u0131na devam ediliyor. 10 proje ihale a\u015Famas\u0131nda. 13\r\nprojeye ise \u00E7e\u015Fitli nedenlerden dolay\u0131 ba\u015Flan\u0131lamad\u0131.\r\n\r\n7. B\u00F6lge M\u00FCd\u00FCrl\u00FC\u011F\u00FC'n\u00FCn Samsun'daki mega projelerinden biri olan 19 May\u0131s Da\u011Fk\u00F6y Baraj\u0131 in\u015Faat\u0131n\u0131n sonuna gelindi. Baraj\u0131n faaliyete\r\ngirmesinin ard\u0131ndan y\u0131lda 22,27 milyon metrek\u00FCp i\u00E7me suyu, 41 milyon 205 bin TL'lik tasarruf ve 3 bin 800 ki\u015Fiye istihdam sa\u011Flamas\u0131 \r\nbekleniyor.");
		txtrManisannehzadelerIlesinde.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtrManisannehzadelerIlesinde.setBounds(148, 244, 855, 746);
		contentPane.add(txtrManisannehzadelerIlesinde);
		
		JTextArea txtrYzdeuTamamlanan = new JTextArea();
		txtrYzdeuTamamlanan.setText("Y\u00FCzde 99'u Tamamlanan 19 May\u0131s Da\u011Fk\u00F6y Baraj\u0131,\r\nEkonomiye Y\u0131lda 41,2 Milyon Lira Katk\u0131 Sa\u011Flayacak");
		txtrYzdeuTamamlanan.setFont(new Font("Tahoma", Font.BOLD, 32));
		txtrYzdeuTamamlanan.setEditable(false);
		txtrYzdeuTamamlanan.setBounds(158, 152, 833, 81);
		contentPane.add(txtrYzdeuTamamlanan);
		
		
	}
}
