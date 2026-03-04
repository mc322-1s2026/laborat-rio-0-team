package com.laboratorio0;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Ana", "ana@email.com");
        Usuario u2 = new Usuario("Carlos", "carlos@email.com"); // Perfil do chefe
        Usuario u3 = new Usuario("Vitor", "v255931@dac.unicamp.br");

        Chefe chefe = new Chefe(u2);
        Tarefa t1 = new Tarefa("Revisão de Código");
        Tarefa t2 = new Tarefa("Modifica Lab0");

        chefe.direcionarTarefa(t1, u1);
        System.out.println("Dados do Chefe: " + chefe.getNome() + " (" + chefe.getEmail() + ")");

        chefe.direcionarTarefa(t2, u3);
        System.out.println("Dados do user3: " + u3.getNomeUsuario() + " (" + u3.getEmail() + ")");
    }
}
