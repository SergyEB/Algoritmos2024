/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polinomio;

/**
 *
 * @author sergi
 */
public class NodoPolinomio {
    int coeficiente;
    int exponente;
    NodoPolinomio siguiente;

    public NodoPolinomio(int coeficiente, int exponente, NodoPolinomio siguiente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        this.siguiente = siguiente;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    public NodoPolinomio getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPolinomio siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "NodoPolinomio{" + "coeficiente=" + coeficiente + ", exponente=" + exponente + ", siguiente=" + siguiente + '}';
    }
    
    
    
}
