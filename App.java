public class App {

    public static void main(String[] args) throws Exception {
        aluno primeiroAluno = new aluno("João", 12345, 11, 20, 3);

        System.out.println("Nome: " + primeiroAluno.nome);
        System.out.println("RA: " + primeiroAluno.ra);
        System.out.println("Nota 1: " + primeiroAluno.nota1);
        System.out.println("Nota 2: " + primeiroAluno.nota2);
        System.out.println("Nota 3: " + primeiroAluno.nota3);
        int totalNotas = primeiroAluno.somaNotas(primeiroAluno.nota1, primeiroAluno.nota2, primeiroAluno.nota3);
        System.out.println("Soma das notas: " + totalNotas);
        
        System.out.println();
        
        aluno segundoAluno = new aluno("Gareldomel", 12345, 11, 20, 3);

        System.out.println("Nome: " + segundoAluno.nome);
        System.out.println("RA: " + segundoAluno.ra);
        System.out.println("Nota 1: " + segundoAluno.nota1);
        System.out.println("Nota 2: " + segundoAluno.nota2);
        System.out.println("Nota 3: " + segundoAluno.nota3);
        int totalNotas2 = segundoAluno.somaNotas(segundoAluno.nota1, segundoAluno.nota2, segundoAluno.nota3);
        System.out.println("Soma das notas: " + totalNotas2);
    
    
    }


}