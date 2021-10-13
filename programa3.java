
package com.mycompany.programacionlogicayfuncional;

/**
 *
 * @author enoce
 */
public class programa3 {
    public void programa3(String palabras){
    String num[] = null, car[] = null, cad[] = null;
    String cadenas = "";
    String caracteres = "";
    String numeros="";
    int cont_cad = 0, cont_car = 0, cont_num=0;
    
    String arreglo[] = palabras.split(" ");
    
    
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].matches("[\\d]*")) {
                numeros = numeros + arreglo[i] + " ";
                cont_num++;
            }else if (arreglo[i].matches("[a-z]")||arreglo[i].matches("[A-Z]")) {
                caracteres = caracteres + arreglo[i] + " ";
                cont_car++;
            }else{
                cadenas = cadenas + arreglo[i] + " ";
                cont_cad++;
            }
        }
        System.out.println("Los numeros son: "+numeros+" y fueron: "+cont_num+" en total.");
        System.out.println("Los caracteres son: "+caracteres+" y fueron: "+cont_car+" en total.");
        System.out.println("Las cadenas son: "+cadenas+" y fueron: "+cont_cad+" en total.");
    }
}
