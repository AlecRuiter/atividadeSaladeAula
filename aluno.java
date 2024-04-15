public class aluno {
    String nome;
    int ra;
    int nota1;
    int nota2;
    int nota3;
    
    public aluno(String nome, int ra, int nota1, int nota2, int nota3) {
        this.nome = nome;
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public int somaNotas(int nota1, int nota2, int nota3){
        return nota1 + nota2+ nota3;
    }



    
}