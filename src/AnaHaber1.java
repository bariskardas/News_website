
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


public class AnaHaber1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnaHaber1 frame = new AnaHaber1();
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
	public AnaHaber1() {
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
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\BARIS\\Documents\\eclipse - workspace\\HaberSitesi2\\images\\ToshibaBigImg.jpg"));
		label.setBounds(122, 283, 813, 391);
		contentPane.add(label);
		
		JLabel lblSadeceBilgisayarretmeyecek = new JLabel("SADECE B\u0130LG\u0130SAYAR \u00DCRETMEYECEK");
		lblSadeceBilgisayarretmeyecek.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSadeceBilgisayarretmeyecek.setBounds(90, 679, 664, 53);
		contentPane.add(lblSadeceBilgisayarretmeyecek);
		
		JTextArea txtrSdasdasda = new JTextArea();
		txtrSdasdasda.setEditable(false);
		txtrSdasdasda.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtrSdasdasda.setText("Bir zamanlar\u0131n \u00F6nde gelen teknoloji markalar\u0131ndan biri olan Toshiba, bilgisayar pazar\u0131ndan ad\u0131n\u0131 siliyor. Art\u0131k Toshiba ismi yerine Dynabook isimli\r\nbilgisayarlarla piyasada olacak.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nBilgisayar biriminin y\u00FCzde 80'ini Sharp'a satan Toshiba'n\u0131n ad\u0131 bilgisayar pazar\u0131ndan siliniyor. \u015Eirket bundan b\u00F6yle Dynabook isimli bilgisayarlarla\r\npiyasada olacak.Bir zamanlar\u0131n \u00F6nde gelen teknoloji markalar\u0131ndan biri olan Toshiba, bilgisayar pazar\u0131ndan ad\u0131n\u0131 siliyor. Art\u0131k Toshiba ismi yerine\r\nDynabook isimli bilgisayarlarla piyasada olacak.\r\n\r\nSon yollarda ciddi derecede mali s\u0131k\u0131nt\u0131lar ya\u015Fayan ve baz\u0131 faaliyetlerini durdurmak zorunda kalan Toshiba, son olarak bilgisayar biriminin y\u00FCzde\r\n80'ini Sharp'a yani Foxconn'a satm\u0131\u015Ft\u0131. Bu sat\u0131\u015F\u0131n ard\u0131ndan Toshiba isminin de de\u011Fi\u015Ftirilmesine karar verildi. Sharp ile yap\u0131lan anla\u015Fma neticesinde\r\nbilgisayarlarda kullan\u0131c\u0131lacak ismin Dynabook olaca\u011F\u0131 duyuruldu.\r\n\r\n\r\n\r\nSharp, Dynabook markas\u0131 alt\u0131nda sadece bilgisayar \u00FCretmekle kalmay\u0131p ayn\u0131 zamanda Nesnelerin \u0130nterneti ve ak\u0131ll\u0131 g\u00F6zl\u00FCk \u00FCr\u00FCnlerini de yine bu\r\nyeni marka alt\u0131nda toplamay\u0131 planl\u0131yor.\r\nDynabook ad\u0131 alt\u0131nda ilk \u00FCr\u00FCn de ortaya \u00E7\u0131kt\u0131. Dynabook G serisi olarak adland\u0131r\u0131lan yeni diz\u00FCst\u00FC bilgisayar, ultra ince tasar\u0131mla geliyor. \u015Eirket, \r\nsonras\u0131nda 10 model diz\u00FCst\u00FC bilgisayar, 3 adet mini PC ve art\u0131r\u0131lm\u0131\u015F ger\u00E7eklik g\u00F6zl\u00FC\u011F\u00FCyle Dynabook \u00FCzerinden sat\u0131\u015F\u0131n\u0131 s\u00FCrd\u00FCrmeyi planl\u0131yor.");
		txtrSdasdasda.setBounds(90, 230, 931, 651);
		contentPane.add(txtrSdasdasda);
		
		JLabel lblToshibannAdTarih = new JLabel("Toshiba'n\u0131n Ad\u0131 Tarih Oluyor");
		lblToshibannAdTarih.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblToshibannAdTarih.setBounds(90, 166, 434, 53);
		contentPane.add(lblToshibannAdTarih);
		
		
		
		
	}
}
