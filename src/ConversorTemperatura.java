import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public static void convertirTemperatura(double temperatura, String escala) {

		int resultadoConversion = 0;

		switch (escala) {

		case "De celsius a farenheit":
			if (temperatura >= -273) {
				resultadoConversion = (int) ((temperatura * 1.8) + 32);
				JOptionPane.showMessageDialog(null, "La temperatura es " + resultadoConversion + " ºF",
						"Resultado conversión", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "La temperatura mínima posible es -273 ºC", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
			break;

		case "De celsius a kelvin":
			if (temperatura >= -273) {
				resultadoConversion = (int) (temperatura + 273);
				JOptionPane.showMessageDialog(null, "La temperatura es " + resultadoConversion + " K",
						"Resultado conversión", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "La temperatura mínima posible es -273 ºC", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
			break;

		case "De farenheit a celsius":
			if (temperatura >= -459) {
				resultadoConversion = (int) ((temperatura - 32) / 1.8);
				JOptionPane.showMessageDialog(null, "La temperatura es " + resultadoConversion + " ºC",
						"Resultado conversión", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "La temperatura mínima posible es -459 ºF", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
			break;

		case "De farenheit a kelvin":
			if (temperatura >= -459) {
				resultadoConversion = (int) (((temperatura - 32) / 1.8) + 273);
				JOptionPane.showMessageDialog(null, "La temperatura es " + resultadoConversion + " K",
						"Resultado conversión", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "La temperatura mínima posible es -459 ºF", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
			break;

		case "De kelvin a celsius":
			if (temperatura >= 0) {
				resultadoConversion = (int) (temperatura - 273);
				JOptionPane.showMessageDialog(null, "La temperatura es " + resultadoConversion + " ºC",
						"Resultado conversión", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "La temperatura mínima posible es 0 K", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
			break;

		case "De kelvin a farenheit":
			if (temperatura >= 0) {
				resultadoConversion = (int) ((temperatura - 273) * 1.8 + 32);
				JOptionPane.showMessageDialog(null, "La temperatura es " + resultadoConversion + " ºF",
						"Resultado conversión", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "La temperatura mínima posible es 0 K", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
			break;

		}

	}

}
