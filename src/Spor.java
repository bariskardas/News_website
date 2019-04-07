


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


public class Spor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Spor frame = new Spor();
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
	public Spor() {
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
		
		
		
		JLabel resim2 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\ronaldinho.jpg"));
		resim2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SporHaber1 e1 = new SporHaber1();
				e1.setVisible(true);
				 dispose(); // diðer formun kapanmasýný saðlar.
			}
		});
		resim2.setBounds(159, 169, 244, 137);
		contentPane.add(resim2);
		
		JTextArea toshiba = new JTextArea();
		toshiba.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SporHaber1 e1 = new SporHaber1();
				e1.setVisible(true);
				 dispose(); // diðer formun kapanmasýný saðlar.
			}
		});
		toshiba.setEditable(false);
		toshiba.setFont(new Font("Tahoma", Font.PLAIN, 16));
		toshiba.setForeground(UIManager.getColor("CheckBox.foreground"));
		toshiba.setBackground(Color.WHITE);
		toshiba.setText("Ronaldinho'nun o\u011Flu imzay\u0131 att\u0131!\r\n\u0130\u015Fte yeni tak\u0131m\u0131");
		toshiba.setBounds(159, 317, 244, 48);
		contentPane.add(toshiba);
		
		JLabel label = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\fb.jpg"));
		label.setBounds(757, 169, 244, 137);
		contentPane.add(label);
		
		JTextArea txtrTransferBombasPatlyor = new JTextArea();
		txtrTransferBombasPatlyor.setEditable(false);
		txtrTransferBombasPatlyor.setText("Transfer bombas\u0131 patl\u0131yor!\r\nFenerbah\u00E7eli isim Ba\u015Fak\u015Fehir\r\nile anla\u015Ft\u0131");
		txtrTransferBombasPatlyor.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrTransferBombasPatlyor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrTransferBombasPatlyor.setBackground(Color.WHITE);
		txtrTransferBombasPatlyor.setBounds(757, 317, 244, 64);
		contentPane.add(txtrTransferBombasPatlyor);
		
		JLabel label_1 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\sow.jpg"));
		label_1.setBounds(469, 169, 244, 137);
		contentPane.add(label_1);
		
		JTextArea txtrGelecekSezonunPlanlar = new JTextArea();
		txtrGelecekSezonunPlanlar.setEditable(false);
		txtrGelecekSezonunPlanlar.setText("Gelecek sezonun planlar\u0131 yap\u0131ld\u0131!\r\nGalatasaray, Sow'u istiyor");
		txtrGelecekSezonunPlanlar.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrGelecekSezonunPlanlar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrGelecekSezonunPlanlar.setBackground(Color.WHITE);
		txtrGelecekSezonunPlanlar.setBounds(469, 317, 244, 48);
		contentPane.add(txtrGelecekSezonunPlanlar);
		
		JLabel label_2 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\pogba.jpg"));
		label_2.setBounds(159, 441, 244, 137);
		contentPane.add(label_2);
		
		JTextArea txtrPaulPogbaReal = new JTextArea();
		txtrPaulPogbaReal.setEditable(false);
		txtrPaulPogbaReal.setText("Paul Pogba, Real Madrid yolunda!");
		txtrPaulPogbaReal.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrPaulPogbaReal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrPaulPogbaReal.setBackground(Color.WHITE);
		txtrPaulPogbaReal.setBounds(159, 589, 244, 48);
		contentPane.add(txtrPaulPogbaReal);
		
		JLabel label_3 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\bjk.jpg"));
		label_3.setBounds(757, 441, 244, 137);
		contentPane.add(label_3);
		
		JTextArea txtrBeiktataKrizSryor = new JTextArea();
		txtrBeiktataKrizSryor.setEditable(false);
		txtrBeiktataKrizSryor.setText("Be\u015Fikta\u015F' ta kriz s\u00FCr\u00FCyor!\r\nS\u00F6zle\u015Fmesini tek tarafl\u0131 feshetti");
		txtrBeiktataKrizSryor.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrBeiktataKrizSryor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrBeiktataKrizSryor.setBackground(Color.WHITE);
		txtrBeiktataKrizSryor.setBounds(757, 589, 244, 48);
		contentPane.add(txtrBeiktataKrizSryor);
		
		JLabel label_4 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\ts.jpg"));
		label_4.setBounds(469, 441, 244, 137);
		contentPane.add(label_4);
		
		JTextArea txtrTrabzonsporSonradanAld = new JTextArea();
		txtrTrabzonsporSonradanAld.setEditable(false);
		txtrTrabzonsporSonradanAld.setText("Trabzonspor sonradan a\u00E7\u0131ld\u0131!\r\nAntalya'y\u0131 4 golle y\u0131kt\u0131lar");
		txtrTrabzonsporSonradanAld.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrTrabzonsporSonradanAld.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrTrabzonsporSonradanAld.setBackground(Color.WHITE);
		txtrTrabzonsporSonradanAld.setBounds(469, 589, 244, 48);
		contentPane.add(txtrTrabzonsporSonradanAld);
		
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
