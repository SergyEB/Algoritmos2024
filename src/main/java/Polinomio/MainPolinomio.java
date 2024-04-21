package Polinomio;

/**
 *
 * @author sergi
 */
public class MainPolinomio {

    public static void main(String[] args) {

        NodoPolinomio term1 = new NodoPolinomio(11, 0, null);
        NodoPolinomio term2 = new NodoPolinomio(-4, 2, term1);
        NodoPolinomio term3 = new NodoPolinomio(3, 4, term2);

        for (double x = 0.0; x <= 5.0; x += 0.5) {

            NodoPolinomio aux = term3;
            double sumatoria = 0.0;

            while (aux != null) {
                sumatoria += aux.getCoeficiente() * Math.pow(x, aux.getExponente());

                aux = aux.getSiguiente();

            }
            System.out.println("x = " + x + " = " + sumatoria);
        }
        
        
    }

}
