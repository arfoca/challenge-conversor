import javax.swing.JOptionPane;

public class VerificadorNumero {

	public static boolean verificarNumero(String input) {

		try {
			double dinero = Double.parseDouble(input);
			if (dinero >= 0);
			return true;
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Ingrese números", "Error", JOptionPane.ERROR_MESSAGE);
			return false;
		} catch (NullPointerException exception) {
			JOptionPane.showMessageDialog(null, "Conversión cancelada", "Cancelar", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}

	}

}
