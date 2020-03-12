/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciones;

/**
 *
 * @author Bilal
 */
public class ecuacionGrado2 {
    private double coeficienteA;
    private double coeficienteB;
    private double coeficienteC;

    public ecuacionGrado2(double coeficienteA, double coeficienteB, double coeficienteC) {
        this.coeficienteA = coeficienteA;
        this.coeficienteB = coeficienteB;
        this.coeficienteC = coeficienteC;
    }

    public double getCoeficienteA() {
        return coeficienteA;
    }

    public double getCoeficienteB() {
        return coeficienteB;
    }

    public double getCoeficienteC() {
        return coeficienteC;
    }
    public double getDiscriminante(){
        return (coeficienteB*coeficienteB)-4*coeficienteA*coeficienteC;
    }
    public int calculaRaices(){
        int cont=0;
        if(getDiscriminante()>0){
            cont=2;
        }else if(getDiscriminante()==0){
            cont=1;
        }else if(getDiscriminante()<0){
            cont=0;
        }
        return cont;
    }
}
