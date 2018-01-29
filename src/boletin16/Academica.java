
package boletin16;

import datos.Persoal;


public class Academica {
    private static int numReferencia = 233;
    private String nome;
    private Notas nota;
    private Persoal alum;

    public Academica() {
    }

    public Academica(String nome, Notas nota, Persoal alum) {
        this.nome = nome;
        this.nota = nota;
        this.alum = alum;
        numReferencia += 1;
    }

    public static int getNumReferencia() {
        return numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public Notas getNota() {
        return nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public static void setNumReferencia(int numReferencia) {
        Academica.numReferencia = numReferencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(Notas nota) {
        this.nota = nota;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

   @Override
    public String toString() {
        return "DATOS:\n" + "Numero de referencia: "+numReferencia+"\nnome: " + nome +nota + alum;
    }

   
    
    
    
}
