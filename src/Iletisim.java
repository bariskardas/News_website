


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
import javax.swing.SwingConstants;


public class Iletisim extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Iletisim frame = new Iletisim();
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
	public Iletisim() {
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
		
		
		JButton btnGirisYap = new JButton("Giriþ Yap");
		btnGirisYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				KullanýcýGiris a= new KullanýcýGiris();  	// kullanýcýGiris classýndan nesne oluþturup kullanýcý giriþi formuna geçiþ saðladýk
				a.setVisible(true);							// formun görünür olmasýný saðlar.
				dispose();     							//diðer formu kapatýr.
				
			}
		});
		btnGirisYap.setForeground(Color.BLUE);
		btnGirisYap.setBackground(Color.WHITE);
		btnGirisYap.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGirisYap.setBounds(1061, 22, 113, 27);
		contentPane.add(btnGirisYap);
		
		
		JLabel lblAnasayfa = new JLabel("Anasayfa");
		lblAnasayfa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Anasayfa e1 = new Anasayfa();
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
		lblAnasayfa.setBounds(435, 100, 106, 33);
		contentPane.add(lblAnasayfa);
		
		JLabel lbliletisim = new JLabel("Ýletiþim");
		lbliletisim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Iletisim e1 = new Iletisim();
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
		lbliletisim.setBounds(574, 100, 106, 33);
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
