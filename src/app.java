
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class app {

	public static void main(String[] args) throws Exception {

		String[] options = { "Convertir Divisas", "Convertir Temperatura", "Salir" };
		var selection = JOptionPane.showOptionDialog(null, "Elige una opción:", "Conversor!",
				0,3, null, options, options[0]);
		if (selection == 0) {
			DecimalFormat formatearDivisa = new DecimalFormat("$#.##");
			boolean ContinuarPrograma = true;
			while (ContinuarPrograma) {
	 			String[] opciones = { "COP a USD", "COP a EUR", "COP a GBP", "COP a JPY", "COP a KRW",
						              "USD a COP", "EUR a COP", "GBP a COP", "JPY a COP", "KRW a COP"};
				String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:", "Conversor de monedas",
						JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				
				if (cambio == null) {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					System.exit(0);
				}
				String input = JOptionPane.showInputDialog(null, "Ingrese cantidad a convertir");
				
				
				double pesos = 0;
			
				try {
					pesos = Double.parseDouble(input);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor no valido");
					System.exit(0);
				}catch (NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					System.exit(0);
				}
				
				if (cambio.equals("COP a USD")) {
					double dolares = pesos / 4857.15;
					JOptionPane.showMessageDialog(null,
							pesos + " Pesos colombianos son: " + formatearDivisa.format(dolares) + " Dolares");
				} else if (cambio.equals("COP a EUR")) {
					double euros = pesos / 5144.89;
					JOptionPane.showMessageDialog(null,
							pesos + " Pesos colombianos son: " + formatearDivisa.format(euros) + " Euros");
				} else if (cambio.equals("COP a GBP")) {
					double libras = pesos / 5876.66;
					JOptionPane.showMessageDialog(null,
							pesos + " Pesos colombianos son: " + formatearDivisa.format(libras) + " Libras Esterlinas");
				} else if (cambio.equals("COP a JPY")) {
					double yen = pesos / 36.32;
					JOptionPane.showMessageDialog(null,
							pesos + " Pesos colombianos son: " + formatearDivisa.format(yen) + " Yenes Japoneses");
				} else if (cambio.equals("COP a KRW")) {
					double won = pesos / 3.72;
					JOptionPane.showMessageDialog(null,
							pesos + " Pesos colombianos son: " + formatearDivisa.format(won) + " Won surcoreanos");
					
					/* cambio de otra moneda a Peso Colombiano*/
				}else if (cambio.equals("USD a COP")) {
					double dolares = pesos *4857.15;
					JOptionPane.showMessageDialog(null,
							pesos + " Dolares: " + formatearDivisa.format(dolares) + " Pesos Colobianos");
				}else if (cambio.equals("EUR a COP")) {
					double euros = pesos *5144.89;
					JOptionPane.showMessageDialog(null,
							pesos + " Euros: " + formatearDivisa.format(euros) + " Pesos Colobianos");
				}else if (cambio.equals("GBP a COP")) {
					double libras = pesos *5876.66;
					JOptionPane.showMessageDialog(null,
							pesos + " Libras Esterlinas: " + formatearDivisa.format(libras) + " Pesos Colobianos");
				}else if (cambio.equals("JPY a COP")) {
					double yen = pesos *36.32;
					JOptionPane.showMessageDialog(null,
							pesos + " Yen Japones: " + formatearDivisa.format(yen) + " Pesos Colobianos");
				}else if (cambio.equals("KRW a COP")) {
					double won = pesos *3.72;
					JOptionPane.showMessageDialog(null,
							pesos + " Won Surcoreano: " + formatearDivisa.format(won) + " Pesos Colobianos");
				}

				int confirma = JOptionPane.showConfirmDialog(null, "Desea continuar usando " + "el programa",
						"confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
				if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
					ContinuarPrograma = false;
					JOptionPane.showMessageDialog(null, "Programa finalizado ");
				}
			}

		}
		if (selection == 1) {

			boolean seguirPrograma = true;

			while (seguirPrograma) {
				String[] opciones = { "Celsius a Fahrenheit", "Fahrenheit a Celsius",
				"Celsius a Kevin", "Kelvin a Celsius", "Fahrenheit a kelvin","kelvin a Fahrenheit"};
				int opcion = JOptionPane.showOptionDialog(null, "Elija una opción:", "Conversor de Temperaturas",
						JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

				String valorNominal = JOptionPane.showInputDialog(null, "Ingrese valor a converir");
				
				double valor = 0.0;

				try {
					valor = Double.parseDouble(valorNominal);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor no valido");
					System.exit(0);
				}catch (NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					System.exit(0);
				}

				double resultado = 0;
				if (opcion == 0) {
					resultado = (valor * 1.8) + 32;
					JOptionPane.showMessageDialog(null,
							valor + " grados celsius: " + Math.round(resultado*100.0)/100.0 + " grados Fahrenheit : ");
				} else if (opcion == 1) {
					resultado = (valor-32)/ 1.8;
					JOptionPane.showMessageDialog(null,
							valor + " grados Fahrenheit: " + Math.round(resultado*100.0)/100.0 + " grados celsius : ");
				}else if (opcion == 2) {
					resultado = (valor+273.15);
					JOptionPane.showMessageDialog(null,
							valor + " grados Celsius: " + Math.round(resultado*100.0)/100.0 + " grados Kelvin : ");
				}else if (opcion == 3) {
					resultado = (valor-273.15);
					JOptionPane.showMessageDialog(null,
							valor + " grados Kelvin: " + Math.round(resultado*100.0)/100.0 + " grados celsius : ");
				}else if (opcion == 4) {
					resultado = (valor+459.67)*5/9;
					JOptionPane.showMessageDialog(null,
							valor + " grados Fahrenheit: " + Math.round(resultado*100.0)/100.0+ " grados Kelvin : ");
				}else if (opcion == 5) {
					resultado = 1.8*valor-459.67;
					JOptionPane.showMessageDialog(null,
							valor + " grados Kelvin: " + Math.round(resultado*100.0)/100.0+ " grados Fahrenheit : ");
				}
				int confirma = JOptionPane.showConfirmDialog(null, "Desea continuar usando " + "el programa",
						"confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
				if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
					seguirPrograma = false;
					JOptionPane.showMessageDialog(null, "Programa finalizado ");
				}

			}

		}
		if (selection == 2) {
			JOptionPane.showMessageDialog(null, "Programa cerrado!");
			System.exit(0);
		}

	}
}
