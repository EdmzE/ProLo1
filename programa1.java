package com.mycompany.programacionlogicayfuncional;

/**
 *
 * @author enoce
 */
public class programa1 {

    public void programa1() {

        int v = 0, f = 0;
        String[] p = {"v", "v", "f", "f"};
        String[] q = {"v", "f", "v", "f"};
        String[] aux = new String[4];

        //Comparación de (p->q)
        for (int i = 0; i < 4; i++) {

            if ("v".equals(p[i])) {
                if ("v".equals(q[i])) {
                    aux[i] = "v";
                } else {
                    aux[i] = "f";
                }
            } else {
                if ("v".equals(q[i])) {
                    aux[i] = "v";
                } else {
                    aux[i] = "v";
                }
            }
        }
        //Comparación de [(p->q)^p]
        for (int i = 0; i < 4; i++) {

            if ("v".equals(aux[i])) {
                if ("v".equals(p[i])) {
                    aux[i] = "v";
                } else {
                    aux[i] = "f";
                }
            } else {
                if ("v".equals(p[i])) {
                    aux[i] = "f";
                } else {
                    aux[i] = "f";
                }
            }
        }
        //Comparación de [(p->q)^p]->q
        for (int i = 0; i < 4; i++) {

            if ("v".equals(aux[i])) {
                if ("v".equals(q[i])) {
                    aux[i] = "v";
                } else {
                    aux[i] = "f";
                }
            } else {
                if ("v".equals(q[i])) {
                    aux[i] = "v";
                } else {
                    aux[i] = "v";
                }
            }
        }
        //Imprime resultado final
        for (int i = 0; i < 4; i++) {
            System.out.println("[" + aux[i] + "]");
            if ("v".equals(aux[i])) {
                v++;
            } else {
                f++;
            }
        }
        System.out.println("");
        //Imprime T,C o C
        if (v == 4) {
            System.out.println("Es Tautología");
        } else {
            if (f == 4) {
                System.out.println("Es Contradicción");
            } else {
                System.out.println("Es Contingencia");
            }
        }
    }
}
