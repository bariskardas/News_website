


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


public class KapsamliIletisim extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KapsamliIletisim frame = new KapsamliIletisim();
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
	public KapsamliIletisim() {
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
			
		JLabel lblIletiim = new JLabel("ÝLETÝÞÝM");
		lblIletiim.setForeground(Color.RED);
		lblIletiim.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblIletiim.setBounds(122, 144, 212, 71);
		contentPane.add(lblIletiim);
		
		JTextArea txtrAsa = new JTextArea();
		txtrAsa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtrAsa.setText("L\u00FCtfen b\u00FClten g\u00F6nderimlerini bulten@haberler.com mail adresi \u00FCzerinden yap\u0131n\u0131z.\r\n\r\nYASAL B\u0130LD\u0130R\u0130MLER \u0130\u00C7\u0130N:\r\n\r\nMuhatap\t: Mesul M\u00FCd\u00FCr Turgay \u00C7akmak\u00E7\u0131\r\nAdres\t: Cenab \u015Eahabettin Sk. No:26 Ko\u015Fuyolu \u0130stanbul\r\n\r\n\r\nFaks Numaram\u0131z\r\n\r\n\u0130stanbul\t: +90 216 339 09 58");
		txtrAsa.setBounds(122, 222, 598, 365);
		contentPane.add(txtrAsa);
		
		
	}
}
