package btssioM2L.graphique;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class Inferface_AP_Valres extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inferface_AP_Valres frame = new Inferface_AP_Valres();
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
	public Inferface_AP_Valres() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_import = new JButton("Importer les fichiers");
		btn_import.setBounds(41, 110, 134, 23);
		contentPane.add(btn_import);
		
		JButton btn_export = new JButton("Télécharger le bordereau");
		btn_export.setBounds(232, 110, 167, 23);
		contentPane.add(btn_export);
	}
}
