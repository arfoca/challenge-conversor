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
			
		case "De soles a libras esterlinas":
			resultadoConversion = (int) (cantidadDinero * 0.22);
			JOptionPane.showMessageDialog(null, "Tienes " + resultadoConversion + " libras esterlinas", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case "De soles a yen japonés":
			resultadoConversion = (int) (cantidadDinero * 34.66);
			JOptionPane.showMessageDialog(null, "Tienes " + resultadoConversion + " yenes", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case "De soles a won sur-coreano":
			resultadoConversion = (int) (cantidadDinero * 343.51);
			JOptionPane.showMessageDialog(null, "Tienes " + resultadoConversion + " wones", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;

		case "De dólares a soles":
			resultadoConversion = (int) (cantidadDinero * 3.78);
			JOptionPane.showMessageDialog(null, "Tienes " + resultadoConversion + " soles", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;

		case "De euros a soles":
			resultadoConversion = (int) (cantidadDinero * 4.10);
			JOptionPane.showMessageDialog(null, "Tienes " + resultadoConversion + " soles", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case "De libras esterlinas a soles":
			resultadoConversion = (int) (cantidadDinero * 4.61);
			JOptionPane.showMessageDialog(null, "Tienes " + resultadoConversion + " soles", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case "De yen japonés a soles":
			resultadoConversion = (int) (cantidadDinero * 0.029);
			JOptionPane.showMessageDialog(null, "Tienes " + resultadoConversion + " soles", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case "won sur-coreano a soles":
			resultadoConversion = (int) (cantidadDinero * 0.0029);
			JOptionPane.showMessageDialog(null, "Tienes " + resultadoConversion + " soles", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;

		}

	}

}

