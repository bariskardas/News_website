


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


public class Magazin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Magazin frame = new Magazin();
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
	public Magazin() {
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
		
		
		
		JLabel resim2 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\instagram.jpg"));
		resim2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MagazinHaber1 e1 = new MagazinHaber1();
				e1.setVisible(true);
				 dispose(); // diðer formun kapanmasýný saðlar.
			}
		});
		resim2.setBounds(150, 162, 244, 137);
		contentPane.add(resim2);
		
		JTextArea toshiba = new JTextArea();
		toshiba.setEditable(false);
		toshiba.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MagazinHaber1 e1 = new MagazinHaber1();
				e1.setVisible(true);
				 dispose(); // diðer formun kapanmasýný saðlar.
			}
		});
		toshiba.setFont(new Font("Tahoma", Font.PLAIN, 16));
		toshiba.setForeground(UIManager.getColor("CheckBox.foreground"));
		toshiba.setBackground(Color.WHITE);
		toshiba.setText("Instagram hesab\u0131 a\u00E7arak, 5 saat \r\ni\u00E7inde d\u00FCnya rekoru k\u0131rd\u0131lar!\r\n\r\n");
		toshiba.setBounds(150, 310, 244, 48);
		contentPane.add(toshiba);
		
		JLabel label = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\avlu.jpg"));
		label.setBounds(748, 162, 244, 137);
		contentPane.add(label);
		
		JTextArea txtrStarTvDe = new JTextArea();
		txtrStarTvDe.setEditable(false);
		txtrStarTvDe.setText("Star TV'de Avlu krizi! Sessiz \r\nsedas\u0131z yay\u0131n ak\u0131\u015F\u0131ndan kald\u0131r\u0131ld\u0131");
		txtrStarTvDe.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrStarTvDe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrStarTvDe.setBackground(Color.WHITE);
		txtrStarTvDe.setBounds(748, 310, 244, 48);
		contentPane.add(txtrStarTvDe);
		
		JLabel label_1 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\zerrin.jpg"));
		label_1.setBounds(460, 162, 244, 137);
		contentPane.add(label_1);
		
		JTextArea txtrYandakiZerrin = new JTextArea();
		txtrYandakiZerrin.setEditable(false);
		txtrYandakiZerrin.setText("61 ya\u015F\u0131ndaki Zerrin \u00D6zer evleniyor!\r\n\u0130\u015Fte d\u00FC\u011F\u00FCn detaylar\u0131");
		txtrYandakiZerrin.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrYandakiZerrin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrYandakiZerrin.setBackground(Color.WHITE);
		txtrYandakiZerrin.setBounds(460, 310, 250, 48);
		contentPane.add(txtrYandakiZerrin);
		
		JLabel label_2 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\serenay.jpg"));
		label_2.setBounds(150, 434, 244, 137);
		contentPane.add(label_2);
		
		JTextArea txtrSerenaySarkayaGzlkl = new JTextArea();
		txtrSerenaySarkayaGzlkl.setEditable(false);
		txtrSerenaySarkayaGzlkl.setText("Serenay Sar\u0131kaya, g\u00F6zl\u00FCkl\u00FC\r\nfoto\u011Fraf\u0131yla be\u011Feni rekoru k\u0131rd\u0131!");
		txtrSerenaySarkayaGzlkl.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrSerenaySarkayaGzlkl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrSerenaySarkayaGzlkl.setBackground(Color.WHITE);
		txtrSerenaySarkayaGzlkl.setBounds(150, 582, 244, 48);
		contentPane.add(txtrSerenaySarkayaGzlkl);
		
		JLabel label_3 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\fahriye.jpg"));
		label_3.setBounds(748, 434, 244, 137);
		contentPane.add(label_3);
		
		JTextArea txtrCemiIzlemeyeGiden = new JTextArea();
		txtrCemiIzlemeyeGiden.setEditable(false);
		txtrCemiIzlemeyeGiden.setText("Cem'i izlemeye giden 9 ayl\u0131k hamile \r\nFahriye'nin korku dolu anlar\u0131!");
		txtrCemiIzlemeyeGiden.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrCemiIzlemeyeGiden.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrCemiIzlemeyeGiden.setBackground(Color.WHITE);
		txtrCemiIzlemeyeGiden.setBounds(748, 582, 261, 48);
		contentPane.add(txtrCemiIzlemeyeGiden);
		
		JLabel label_4 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\berker.jpg"));
		label_4.setBounds(460, 434, 244, 137);
		contentPane.add(label_4);
		
		JTextArea txtrGenOyuncuBerker = new JTextArea();
		txtrGenOyuncuBerker.setEditable(false);
		txtrGenOyuncuBerker.setText("Gen\u00E7 oyuncu Berker G\u00FCven'in \r\nperformans\u0131 diziye damga vurdu!");
		txtrGenOyuncuBerker.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrGenOyuncuBerker.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrGenOyuncuBerker.setBackground(Color.WHITE);
		txtrGenOyuncuBerker.setBounds(460, 582, 244, 48);
		contentPane.add(txtrGenOyuncuBerker);
		
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
