/*
Convenciones de nomenclatura para tests unitarios
https://github.com/I2BTech/guia-para-el-codigo-frontend/blob/master/convenciones-nomenclatura-tests-unitarios_ES.md
 */
package clases;

/**
 * @author Miguel
 * @version 1.0
 */
public class mayorNumeros {
      /**
     * Método que recibe 3 números int, y retorna el mayor de 3.
     * @param a int 
     * @param b int
     * @param c int
     * @return Mayor
     */
    public int numeroMayor(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (c > b) {
            return c;  //Fallo trivial +1
        } else {
            return b;
        }
    }
}
