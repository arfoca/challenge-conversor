import javax.swing.JOptionPane;

public class MenuPrincipal {

	public static void main(String[] args) {

		boolean continuar = true;

		while (continuar) {

			String[] opciones = { "Conversor de moneda", "Conversor de temperatura" };

			String seleccionInicial = (String) JOptionPane.showInputDialog(null, "Seleccione qué conversor desea",
					"Menú Inicial", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

			if (seleccionInicial == "Conversor de moneda") {

				String dinero = (String) JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero");

				if (VerificadorNumero.verificarNumero(dinero)) {

					double cantidadDinero = Double.parseDouble(dinero);

					if (cantidadDinero >= 0) {
						String[] monedas = { "De soles a dólares", "De soles a euros", "De soles a libras esterlinas",
								"De soles a yen japonés", "De soles a won sul-coreano", "De dólares a soles",
								"De euros a soles", "De libras esterlinas a soles", "De yen japonés a soles",
								"De won sul-coreano a soles" };

						String moneda = (String) JOptionPane.showInputDialog(null,
								"Seleccione qué moneda quiere convertir", "Moneda", JOptionPane.DEFAULT_OPTION, null,
								monedas, monedas[0]);

						if (moneda != null) {
							ConversorMoneda.convertirMoneda(cantidadDinero, moneda);
						}

					} else {
						JOptionPane.showMessageDialog(null, "Ingrese números positivos", "Error",
								JOptionPane.ERROR_MESSAGE);
					}

				}

			}

			if (seleccionInicial == "Conversor de temperatura") {

				String grados = JOptionPane.showInputDialog(null, "Ingrese la temperatura");

				if (VerificadorNumero.verificarNumero(grados)) {

					double temperatura = Double.parseDouble(grados);

					String[] escalas = { "De celsius a farenheit", "De celsius a kelvin", "De farenheit a celsius",
							"De farenheit a kelvin", "De kelvin a celsius", "De kelvin a farenheit" };

					String escala = (String) JOptionPane.showInputDialog(null,
							"Seleccione qué temperatura quiere convertir", "Escala", JOptionPane.DEFAULT_OPTION, null,
							escalas, escalas[0]);

					if (escala != null) {
						ConversorTemperatura.convertirTemperatura(temperatura, escala);
					}

				}

			}

			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?", "Confirmacion", 0,
					JOptionPane.OK_CANCEL_OPTION);
			if (JOptionPane.OK_OPTION == respuesta) {

			} else {
				continuar = false;
				JOptionPane.showMessageDialog(null, "Programa finalizado", "Finalizando", JOptionPane.DEFAULT_OPTION);
			}

		}

	}

}
