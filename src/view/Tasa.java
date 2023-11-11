package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import logic.*;

public class Tasa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField interesCompuesto;
	private JTextField valorPresente;
	private JTextField Tiempo;

	public Tasa() {
		//Ventana
		setBackground(new Color(64, 0, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 267);
		setTitle("Tasa de Interes"); 

		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNombre_1_1 = new JLabel("Interes Compuesto(%):");
		lblNombre_1_1.setBounds(27, 52, 136, 24);
		contentPane.add(lblNombre_1_1);
		
		JLabel lblNombre_1_1_1 = new JLabel("Valor Presente($): ");
		lblNombre_1_1_1.setBounds(27, 87, 136, 24);
		contentPane.add(lblNombre_1_1_1);
		
		JLabel lblNombre_1_1_1_1 = new JLabel("Tiempo");
		lblNombre_1_1_1_1.setBounds(27, 122, 136, 24);
		contentPane.add(lblNombre_1_1_1_1);
		
		JLabel lblNotas = new JLabel("Datos");
		lblNotas.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotas.setBounds(27, 17, 185, 24);
		contentPane.add(lblNotas);

		interesCompuesto = new JTextField();
		interesCompuesto.setColumns(10);
		interesCompuesto.setBounds(173, 56, 73, 20);
		contentPane.add(interesCompuesto);
		
		valorPresente = new JTextField();
		valorPresente.setColumns(10);
		valorPresente.setBounds(173, 91, 73, 20);
		contentPane.add(valorPresente);
		
		Tiempo = new JTextField();
		Tiempo.setColumns(10);
		Tiempo.setBounds(173, 126, 73, 20);
		contentPane.add(Tiempo);
		

		JButton btnGuardar = new JButton("Calcular");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					if(		Double.parseDouble(interesCompuesto.getText())<0 || Double.parseDouble(interesCompuesto.getText())>100 ){
								JOptionPane.showMessageDialog(null,"Las tasas de interes deben ir entre 0 y 100","Error",JOptionPane.ERROR_MESSAGE);
								return;
					}
					else if(Double.parseDouble(valorPresente.getText())<0 || 
							Double.parseDouble(Tiempo.getText())<0 ){
						JOptionPane.showMessageDialog(null,"El valor presente o el tiempo no puede ser negativo","Error",JOptionPane.ERROR_MESSAGE);
							return;
						
					}
					else{
							TasaInteres cValorP = new TasaInteres();
							double resultado = cValorP.calcular(Double.parseDouble(Tiempo.getText()), Double.parseDouble(interesCompuesto.getText())/100, Double.parseDouble(valorPresente.getText()));
							JOptionPane.showMessageDialog(null, "La tasa de interes con los datos ingresados es: " + resultado*100+"%", getTitle(), JOptionPane.INFORMATION_MESSAGE);
						}
				}catch(NumberFormatException e1){
					JOptionPane.showMessageDialog(null,"No se pxuede calcular, verifique que los datos ingresados sean validos","ERROR",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnGuardar.setBounds(37, 167, 89, 23);
		contentPane.add(btnGuardar);

		//Boton cancelar, donde simplente no modifica al objeto, simplemente cierra la ventana
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				VentanaP frame = new VentanaP();
				frame.setVisible(true);
			}
		});

		btnNewButton.setBounds(136, 167, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(289, 21, 188, 169);
		contentPane.add(lblNewLabel);
		ImageIcon escudo = new ImageIcon("src/img/Tasa.png");
        Image gatoD = escudo.getImage();
        Image imageScaled = gatoD.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon finalGatoD = new ImageIcon(imageScaled);
        lblNewLabel.setIcon(finalGatoD);
		contentPane.add(lblNewLabel);
	}

}
