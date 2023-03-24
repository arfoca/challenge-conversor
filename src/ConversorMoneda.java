import javax.swing.JOptionPane;

public class ConversorMoneda {

	public static void convertirMoneda(double cantidadDinero, String moneda) {

		int resultadoConversion = 0;

		switch (moneda) {

		case "De soles a dólares":
			resultadoConversion = (int) (cantidadDinero * 0.26);
			JOptionPane.showMessageDialog(null, "Tienes " + resultadoConversion + " dólares", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;

		case "De soles a euros":
			resultadoConversion = (int) (cantidadDinero * 0.24);
			JOptionPane.showMessageDialog(null, "Tienes " + resultadoConversion + " euros", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;

		case "De dólares a soles":
			resultadoConversion = (int) (cantidadDinero * 3.78);
			JOptionPane.showMessageDialog(null, "Tienes " + resultadoConversion + " soles", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;

		case "De dólares a euros":
			resultadoConversion = (int) (cantidadDinero * 0.92);
			JOptionPane.showMessageDialog(null, "Tienes " + resultadoConversion + " euros", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;

		case "De euros a soles":
			resultadoConversion = (int) (cantidadDinero * 4.10);
			JOptionPane.showMessageDialog(null, "Tienes " + resultadoConversion + " soles", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;

		case "De euros a dólares":
			resultadoConversion = (int) (cantidadDinero * 1.08);
			JOptionPane.showMessageDialog(null, "Tienes " + resultadoConversion + " dólares", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;

		}

	}

}

