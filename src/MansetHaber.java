
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


public class MansetHaber extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MansetHaber frame = new MansetHaber();
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
	public MansetHaber() {
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
		resim.setBounds(247, 144, 687, 348);
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
		
		JTextArea txtrYskKrklareliMerkezde = new JTextArea();
		txtrYskKrklareliMerkezde.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrYskKrklareliMerkezde.setEditable(false);
		txtrYskKrklareliMerkezde.setText("YSK, K\u0131rklareli Merkezde Oylar\u0131n Yeniden Say\u0131lmas\u0131na Karar Verdi !\r\nYSK, K\u0131rklareli Merkez'de, ba\u011F\u0131ms\u0131z adaya pusulada belirtilen yer d\u0131\u015F\u0131nda tercih m\u00FChr\u00FC bas\u0131lmas\u0131 sebebiyle yap\u0131lan itirazlar\u0131 ve oylar\u0131n yeniden\r\nsay\u0131lmas\u0131na y\u00F6nelik ba\u015Fvuruyu kabul etti.\r\nYSK, ba\u011F\u0131ms\u0131z adaya pusulada belirtilen yer d\u0131\u015F\u0131nda tercih m\u00FChr\u00FC bas\u0131lmas\u0131 sebebiyle sand\u0131k kurullar\u0131nca oylar\u0131n ge\u00E7erli say\u0131lmas\u0131na yap\u0131lan\r\nitirazlar\u0131 ve oylar\u0131n yeniden say\u0131lmas\u0131 ile bu hatalar\u0131n iptal edilmesine y\u00F6nelik ba\u015Fvuruyu kabul etti. K\u0131rklareli Merkez'de oylar\u0131n say\u0131m d\u00F6k\u00FCm\r\ni\u015Flemlerine devam edilmesi kararla\u015Ft\u0131r\u0131ld\u0131.\r\n\r\nYSK, BA\u015EVURUYU KABUL ETT\u0130\r\nY\u00FCksek Se\u00E7im Kurulu (YSK) 31 Mart Mahalli \u0130dareler Genel Se\u00E7imlerine ili\u015Fkin, K\u0131rklareli Merkez'de ba\u011F\u0131ms\u0131z adaya pusulada belirtilen yer\r\nd\u0131\u015F\u0131nda tercih m\u00FChr\u00FC bas\u0131lmas\u0131 sebebiyle sand\u0131k kurullar\u0131nca oylar\u0131n ge\u00E7erli kabul edilmesine yap\u0131lan itirazlar\u0131 ve oylar\u0131n yeniden say\u0131lmas\u0131\r\nile bu hatalar\u0131n iptal edilmesine y\u00F6nelik ba\u015Fvuruyu kabul etti.K\u0131rklareli'nde sand\u0131k kurulu ba\u011F\u0131ms\u0131z adaya pusulada belirtilen yer d\u0131\u015F\u0131nda\r\nm\u00FCh\u00FCr bas\u0131lan pusulalar\u0131 da ge\u00E7erli sayd\u0131.\r\n\r\nOYLAR YEN\u0130DEN SAYILMASINA KARAR VER\u0130LD\u0130\r\nK\u0131rklareli Merkez \u0130l\u00E7e Se\u00E7im Kuruluna bu \u015Fekildeki pusulalar\u0131n ge\u00E7erli say\u0131lmas\u0131na itiraz edildi. \u0130tirazda oylar\u0131n yeniden say\u0131lmas\u0131 ve bu\r\nhatalar\u0131n iptal edilmesi istendi. \u0130l\u00E7e se\u00E7im kurulu ba\u015Fvuruyu kabul ederek, K\u0131rklareli Merkez'de oylar\u0131n yeniden say\u0131lmas\u0131na karar verdi.\r\n\r\nSAYIM DURDURULDU\r\nBu karara da itiraz edilmesi \u00FCzerine K\u0131rklareli \u0130l Se\u00E7im Kurulu, \u0130l\u00E7e Se\u00E7im Kurulunun karar\u0131n\u0131 kald\u0131rd\u0131 ve say\u0131m\u0131 durdurdu.Bunun \u00FCzerine\r\nMHP, K\u0131rklareli \u0130l Se\u00E7im Kurulu'nun karar\u0131n\u0131n kald\u0131r\u0131lmas\u0131, il\u00E7e se\u00E7im kurulu karar\u0131 uyar\u0131nca say\u0131m ve d\u00F6k\u00FCm i\u015Fleminin ger\u00E7ekle\u015Ftirilmesi\r\ntalebiyle YSK'ya ba\u015Fvuruldu.\r\n\r\nKIRKLAREL\u0130 MERKEZ'DE OYLAR YEN\u0130DEN SAYILACAK\r\nYSK, K\u0131rklareli \u0130l Se\u00E7im Kurulu'nun karar\u0131n\u0131n kald\u0131r\u0131larak, K\u0131rklareli Merkez Se\u00E7im Kurulu karar\u0131 uyar\u0131nca i\u015Flem yap\u0131lmas\u0131na, say\u0131m ve d\u00F6k\u00FCm\r\n i\u015Fleminin devam etmesine karar verdi.\r\n\r\nBA\u011EIMSIZ ADAY SE\u00C7\u0130M\u0130 \u00D6NDE TAMAMLADI\r\nResmi olmayan sonu\u00E7lara g\u00F6re K\u0131rklareli'de se\u00E7imlere Ba\u011F\u0131ms\u0131z olarak giren Mehmet Siyam Kesimo\u011Flu 17 bin 176 oyla (Y\u00FCzde 37.48)\r\nse\u00E7imi \u00F6nde tamamlad\u0131.");
		txtrYskKrklareliMerkezde.setBounds(76, 503, 997, 539);
		contentPane.add(txtrYskKrklareliMerkezde);
		
		
	}
}
