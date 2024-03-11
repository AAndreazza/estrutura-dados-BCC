public class Aluno {
    private String nome;
    private Float nota1;
    private Float nota2;
    private Float nota3;
    
    public Aluno(String nome, Float nota1, Float nota2, Float nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Float getNota1() {
        return nota1;
    }
    public void setNota1(Float nota1) {
        this.nota1 = nota1;
    }
    public Float getNota2() {
        return nota2;
    }
    public void setNota2(Float nota2) {
        this.nota2 = nota2;
    }
    public Float getNota3() {
        return nota3;
    }
    public void setNota3(Float nota3) {
        this.nota3 = nota3;
    }

    public String toString(){
        return getNome() + " - " + getNota1() + " | " + getNota2() + " | "+ getNota3();
    }
}
