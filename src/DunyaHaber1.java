
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


public class DunyaHaber1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DunyaHaber1 frame = new DunyaHaber1();
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
	public DunyaHaber1() {
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
		label.setIcon(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\basbakanBigImg.jpg"));
		label.setBounds(147, 287, 792, 395);
		contentPane.add(label);
		
		JTextArea txtrManisannehzadelerIlesinde = new JTextArea();
		txtrManisannehzadelerIlesinde.setEditable(false);
		txtrManisannehzadelerIlesinde.setText("\u0130ngiltere Ba\u015Fbakan\u0131 Theresa May, milletvekillerinin Brexit anla\u015Fmas\u0131na destek vermesi halinde planlanandan \u00F6nce istifaya haz\u0131r \r\noldu\u011Funu a\u00E7\u0131klad\u0131.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\u0130ngiltere Ba\u015Fbakan\u0131 Theresa May, \"\u0130ngiltere Avrupa Birli\u011Fi'nden ayr\u0131ld\u0131ktan sonra istifa edece\u011Fim\" dedi. Ancak May belirli bir \r\ntarih vermedi.\r\n\r\n\"ANLA\u015EMAYI YAPMALI VE BREX\u0130T'\u0130 GER\u00C7EKLE\u015ET\u0130RMEL\u0130Y\u0130Z\"\r\n\r\n\u0130ngiltere Ba\u015Fbakan\u0131 Theresa May, Brexit anla\u015Fmas\u0131n\u0131n parlamento taraf\u0131ndan onaylanmas\u0131 durumunda istifa edece\u011Fini a\u00E7\u0131klad\u0131.\r\n\r\nMay, Muhafazakar Partili milletvekillerine yapt\u0131\u011F\u0131 konu\u015Fmada, \"Anla\u015Fmay\u0131 yapmal\u0131 ve Brexit'i ger\u00E7ekle\u015Ftirmeliyiz. \u00DClkemiz ve \r\npartimiz ad\u0131na do\u011Fru olan\u0131 yapmak i\u00E7in bu i\u015Fi ama\u00E7lad\u0131\u011F\u0131mdan daha erken b\u0131rakmaya haz\u0131r\u0131m\" dedi.\r\n\r\nGeli\u015Fmeyi duyuran vekiller, May'in \"Brexit'in sonraki a\u015Famas\u0131nda olmayaca\u011F\u0131n\u0131\" kaydetti fakat istifaya ili\u015Fkin bir tarih vermedi.\r\n\r\n\u0130ngiltere Parlamentosu Brexit anla\u015Fmas\u0131n\u0131 ocak ay\u0131nda 230, mart ay\u0131nda da 149 oy farkla reddetmi\u015Fti.");
		txtrManisannehzadelerIlesinde.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtrManisannehzadelerIlesinde.setBounds(147, 239, 843, 746);
		contentPane.add(txtrManisannehzadelerIlesinde);
		
		JTextArea txtrIngiltereBabakanTheresa = new JTextArea();
		txtrIngiltereBabakanTheresa.setText("\u0130ngiltere Ba\u015Fbakan\u0131 Theresa May'den Brexit \u015Eartl\u0131 \r\n\u0130stifa Mesaj\u0131");
		txtrIngiltereBabakanTheresa.setFont(new Font("Tahoma", Font.BOLD, 32));
		txtrIngiltereBabakanTheresa.setEditable(false);
		txtrIngiltereBabakanTheresa.setBounds(147, 147, 833, 81);
		contentPane.add(txtrIngiltereBabakanTheresa);
		
		
	}
}
