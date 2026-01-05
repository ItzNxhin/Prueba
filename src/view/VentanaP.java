package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;

//Clase main
public class VentanaP extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaP frame = new VentanaP();
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
	public VentanaP() {
		//Ventana
		setBackground(new Color(64, 0, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 389);
		setTitle("CONDOR"); 

		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		//Decoracion
		JLabel lblNewLabel = new JLabel("Calculadora Financiera");
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 21)); 
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(186, 0, 348, 73);
		contentPane.add(lblNewLabel);
		
		JLabel lblImagen = new JLabel("");
		lblImagen.setBounds(186, 59, 477, 172);
		
        ImageIcon escudo = new ImageIcon("src/img/MatemFinanciera.png");
        Image gatoD = escudo.getImage();
        Image imageScaled = gatoD.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon finalGatoD = new ImageIcon(imageScaled);
        lblImagen.setIcon(finalGatoD);
		contentPane.add(lblImagen);

		//Radios
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Valor Presente");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ValorPresente vPresente = new ValorPresente();
				vPresente.setVisible(true);
			}
		});
		buttonGroup_1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(30, 76, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnValorFuturo = new JRadioButton("Valor Futuro");
		rdbtnValorFuturo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ValorFuturo vPresente = new ValorFuturo();
				vPresente.setVisible(true);
			}
		});
		buttonGroup_1.add(rdbtnValorFuturo);
		rdbtnValorFuturo.setBounds(30, 116, 109, 23);
		contentPane.add(rdbtnValorFuturo);
		
		JRadioButton rdbtnTasaDeInteres = new JRadioButton("Tasa de Interes");
		rdbtnTasaDeInteres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Tasa vPresente = new Tasa();
				vPresente.setVisible(true);
			}
		});
		buttonGroup_1.add(rdbtnTasaDeInteres);
		rdbtnTasaDeInteres.setBounds(30, 160, 109, 23);
		contentPane.add(rdbtnTasaDeInteres);
		
		JRadioButton rdbtnTiempo = new JRadioButton("Tiempo");
		rdbtnTiempo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Tiempo vPresente = new Tiempo();
				vPresente.setVisible(true);
			}
		});
		buttonGroup_1.add(rdbtnTiempo);
		rdbtnTiempo.setBounds(30, 204, 109, 23);
		contentPane.add(rdbtnTiempo);

		//Boton salir, no tiene mucha ciencia
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor = JOptionPane.showConfirmDialog(null, "Esta seguro que desea cerrar la ventana?", "Advertencia", JOptionPane.YES_NO_OPTION);
				
				if(valor == JOptionPane.YES_NO_OPTION) System.exit(0);
			}
		});
		btnSalir.setBounds(39, 240, 89, 23);
		contentPane.add(btnSalir);

		
		//Fondo de los botones
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(49, 280, 66, 59);
		ImageIcon base = new ImageIcon("src/img/icono.png");
        Image baseD = base.getImage();
        Image imageS= baseD.getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon finalBD = new ImageIcon(imageS);
        lblNewLabel_1.setIcon(finalBD);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Opciones");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Sitka Heading", Font.BOLD, 21));
		lblNewLabel_2.setBounds(10, 17, 155, 39);
		contentPane.add(lblNewLabel_2);	
		
		JLabel lblfondo = new JLabel("");
		lblfondo.setBackground(new Color(219, 219, 219));
		lblfondo.setOpaque(true);
		lblfondo.setBounds(10, 11, 155, 339);
		contentPane.add(lblfondo);
		
		JLabel lblNewLabel_3 = new JLabel("Bienvenidos a la calculadora Financiera, a tu izquiera estan los calculos posibles");
		lblNewLabel_3.setBounds(186, 242, 502, 108);
		contentPane.add(lblNewLabel_3);
		
		
		
	
		
		
		
		
		
	}
}
