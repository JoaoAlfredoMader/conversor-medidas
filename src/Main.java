import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Escolha a categoria
        String categoriaInput = JOptionPane.showInputDialog("Escolha a categoria:\n" +
                "1. Comprimento\n" +
                "2. Peso\n" +
                "Opção:");
        int categoria = Integer.parseInt(categoriaInput);

        switch (categoria) {
            case 1: // Comprimento
                // Escolha a unidade de origem de comprimento
                String origemComprimentoInput = JOptionPane.showInputDialog("Escolha a unidade de origem:\n" +
                        "1. Metros\n" +
                        "2. Centímetros\n" +
                        "3. Polegadas\n" +
                        "Opção:");
                int origemComprimento = Integer.parseInt(origemComprimentoInput);

                // Escolha a unidade de destino de comprimento
                String destinoComprimentoInput = JOptionPane.showInputDialog("Escolha a unidade de destino:\n" +
                        "1. Metros\n" +
                        "2. Centímetros\n" +
                        "3. Polegadas\n" +
                        "Opção:");
                int destinoComprimento = Integer.parseInt(destinoComprimentoInput);

                // Digite o valor de comprimento
                String valorComprimentoInput = JOptionPane.showInputDialog("Digite o valor:");
                double valorComprimento = Double.parseDouble(valorComprimentoInput);

                double resultadoComprimento = 0;

                switch (origemComprimento) {
                    case 1: // Metros
                        switch (destinoComprimento) {
                            case 1: // Metros para Metros
                                resultadoComprimento = valorComprimento;
                                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + valorComprimento + " metros = " + resultadoComprimento + " metros");
                                break;
                            case 2: // Metros para Centímetros
                                resultadoComprimento = valorComprimento * 100;
                                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + valorComprimento + " metros = " + resultadoComprimento + " centímetros");
                                break;
                            case 3: // Metros para Polegadas
                                resultadoComprimento = valorComprimento * 39.3701;
                                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + valorComprimento + " metros = " + resultadoComprimento + " polegadas");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida.");
                        }
                        break;
                    case 2: // Centímetros
                        switch (destinoComprimento) {
                            case 1: // Centímetros para Metros
                                resultadoComprimento = valorComprimento / 100;
                                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + valorComprimento + " centímetros = " + resultadoComprimento + " metros");
                                break;
                            case 2: // Centímetros para Centímetros
                                resultadoComprimento = valorComprimento;
                                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + valorComprimento + " centímetros = " + resultadoComprimento + " centímetros");
                                break;
                            case 3: // Centímetros para Polegadas
                                resultadoComprimento = valorComprimento * 0.393701;
                                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + valorComprimento + " centímetros = " + resultadoComprimento + " polegadas");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida.");
                        }
                        break;
                    case 3: // Polegadas
                        switch (destinoComprimento) {
                            case 1: // Polegadas para Metros
                                resultadoComprimento = valorComprimento * 0.0254;
                                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + valorComprimento + " polegadas = " + resultadoComprimento + " metros");
                                break;
                            case 2: // Polegadas para Centímetros
                                resultadoComprimento = valorComprimento * 2.54;
                                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + valorComprimento + " polegadas = " + resultadoComprimento + " centímetros");
                                break;
                            case 3: // Polegadas para Polegadas
                                resultadoComprimento = valorComprimento;
                                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + valorComprimento + " polegadas = " + resultadoComprimento + " polegadas");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida.");
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                }
                break;
            case 2: // Peso
                // Escolha a unidade de origem
                String origemInput = JOptionPane.showInputDialog("Escolha a unidade de origem:\n" +
                        "1. Quilogramas\n" +
                        "2. Gramas\n" +
                        "3. Libras\n" +
                        "Opção:");
                int origem = Integer.parseInt(origemInput);

                // Escolha a unidade de destino
                String destinoInput = JOptionPane.showInputDialog("Escolha a unidade de destino:\n" +
                        "1. Quilogramas\n" +
                        "2. Gramas\n" +
                        "3. Libras\n" +
                        "Opção:");
                int destino = Integer.parseInt(destinoInput);

                // Digite o valor
                String valorInput = JOptionPane.showInputDialog("Digite o valor:");
                double valor = Double.parseDouble(valorInput);

                double resultado = 0;

                switch (origem) {
                    case 1: // Quilogramas
                        switch (destino) {
                            case 1: // Quilogramas para Quilogramas
                                resultado = valor;
                                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + valor + " quilogramas = " + resultado + " quilogramas");
                                break;
                            case 2: // Quilogramas para Gramas
                                resultado = valor * 1000;
                                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + valor + " quilogramas = " + resultado + " gramas");
                                break;
                            case 3: // Quilogramas para Libras
                                resultado = valor * 2.20462;
                                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + valor + " quilogramas = " + resultado + " libras");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida.");
                        }
                        break;
                    case 2: // Gramas
                        switch (destino) {
                            case 1: // Gramas para Quilogramas
                                resultado = valor / 1000;
                                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + valor + " gramas = " + resultado + " quilogramas");
                                break;
                            case 2: // Gramas para Gramas
                                resultado = valor;
                                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + valor + " gramas = " + resultado + " gramas");
                                break;
                            case 3: // Gramas para Libras
                                resultado = valor * 0.00220462;
                                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + valor + " gramas = " + resultado + " libras");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida.");
                        }
                        break;
                    case 3: // Libras
                        switch (destino) {
                            case 1: // Libras para Quilogramas
                                resultado = valor * 0.453592;
                                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + valor + " libras = " + resultado + " quilogramas");
                                break;
                            case 2: // Libras para Gramas
                                resultado = valor * 453.592;
                                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + valor + " libras = " + resultado + " gramas");
                                break;
                            case 3: // Libras para Libras   
                                resultado = valor;
                                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + valor + " libras = " + resultado + " libras");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida.");
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }
}
