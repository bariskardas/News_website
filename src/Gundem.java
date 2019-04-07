


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


public class Gundem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gundem frame = new Gundem();
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
	public Gundem() {
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
		
		
		
		JLabel resim2 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\facia.jpg"));
		resim2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GundemHaber1 e1 = new GundemHaber1();
				e1.setVisible(true);
				 dispose();
			}
		});
		resim2.setBounds(178, 196, 244, 137);
		contentPane.add(resim2);
		
		JTextArea facia = new JTextArea();
		facia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GundemHaber1 e1 = new GundemHaber1();
				e1.setVisible(true);
				 dispose();
			}
		});
		facia.setEditable(false);
		facia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		facia.setForeground(UIManager.getColor("CheckBox.foreground"));
		facia.setBackground(Color.WHITE);
		facia.setText("K\u0131\u015Fla yolunda facia ! ");
		facia.setBounds(178, 344, 244, 48);
		contentPane.add(facia);
		
		JLabel label = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\gozalti.jpg"));
		label.setBounds(776, 196, 244, 137);
		contentPane.add(label);
		
		JTextArea txtrIldeFet = new JTextArea();
		txtrIldeFet.setEditable(false);
		txtrIldeFet.setText("22 ilde Fet\u00F6 Operasyonu ! \r\n40 g\u00F6zalt\u0131 karar\u0131...");
		txtrIldeFet.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrIldeFet.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrIldeFet.setBackground(Color.WHITE);
		txtrIldeFet.setBounds(776, 344, 244, 48);
		contentPane.add(txtrIldeFet);
		
		JLabel label_1 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\kandil.jpg"));
		label_1.setBounds(488, 196, 244, 137);
		contentPane.add(label_1);
		
		JTextArea txtrKlaYolundaFacia = new JTextArea();
		txtrKlaYolundaFacia.setEditable(false);
		txtrKlaYolundaFacia.setText("Kandil'e hava harekat\u0131");
		txtrKlaYolundaFacia.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrKlaYolundaFacia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrKlaYolundaFacia.setBackground(Color.WHITE);
		txtrKlaYolundaFacia.setBounds(488, 344, 244, 48);
		contentPane.add(txtrKlaYolundaFacia);
		
		JLabel label_2 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\kaza.jpg"));
		label_2.setBounds(178, 468, 244, 137);
		contentPane.add(label_2);
		
		JTextArea txtrRayaLastiiTakld = new JTextArea();
		txtrRayaLastiiTakld.setEditable(false);
		txtrRayaLastiiTakld.setText("Raya lasti\u011Fi tak\u0131ld\u0131...\r\n\u0130\u015Fte o korkun\u00E7 an !");
		txtrRayaLastiiTakld.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrRayaLastiiTakld.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrRayaLastiiTakld.setBackground(Color.WHITE);
		txtrRayaLastiiTakld.setBounds(178, 616, 244, 48);
		contentPane.add(txtrRayaLastiiTakld);
		
		JLabel label_3 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\defne.jpg"));
		label_3.setBounds(776, 468, 244, 137);
		contentPane.add(label_3);
		
		JTextArea txtrDefneJoyFoster = new JTextArea();
		txtrDefneJoyFoster.setEditable(false);
		txtrDefneJoyFoster.setText("Defne Joy Foster '\u0131n annesine \r\nk\u00F6t\u00FC haber");
		txtrDefneJoyFoster.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtrDefneJoyFoster.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrDefneJoyFoster.setBackground(Color.WHITE);
		txtrDefneJoyFoster.setBounds(776, 616, 244, 48);
		contentPane.add(txtrDefneJoyFoster);
		
		JLabel label_4 = new JLabel(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\h\u0131rs\u0131z.jpg"));
		label_4.setBounds(488, 468, 244, 137);
		contentPane.add(label_4);
		
		JTextArea txtralannIineYaramaz = new JTextArea();
		txtralannIineYaramaz.setEditable(false);
		txtralannIineYaramaz.setText("\u00C7alan\u0131n i\u015Fine yaramaz ama \r\nonun kolu kanad\u0131 k\u0131r\u0131ld\u0131.");
		txtralannIineYaramaz.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtralannIineYaramaz.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtralannIineYaramaz.setBackground(Color.WHITE);
		txtralannIineYaramaz.setBounds(488, 616, 244, 48);
		contentPane.add(txtralannIineYaramaz);
		
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
