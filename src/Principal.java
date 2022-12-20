/* Contruir uma aplicação de cálculo de notas de um aluno,
sabendo que ele pode ser aluno da Univille ou aluno da UFSC, que
possuem formas de avaliação diferente. Mostrar os dados e a m
média do aluno
HERANÇA = possibilidade de se reutilizar os atributos e os métodos
em outra classe. É possível fazer herança única, não existe
herança múltipla no Java, mas uma classe pode gerar várias
outras classes-filhas.
SUPERCLASSE: PESSOA -> aluno        -> estagiario
                    -> funcionario
*/
public class Principal {
    public static void main(String[] args) {

        AlunoUFSC aluno1 = new AlunoUFSC();
        AlunoUFSC aluno2 = new AlunoUFSC("Anderson", "2022-4343",
                9.5, 1.5, 6.4);

        aluno1.setNomeAluno("Anderson Vieira");
        aluno1.setMatricula("2022-545454");
        aluno1.setProva1(7.5);
        aluno1.setProva2(8.5);

        System.out.println(aluno1.getNomeAluno());
        System.out.println(aluno1.getMatricula());

        System.out.println(aluno1.toString());
        aluno1.calcMedia();




    }
}
