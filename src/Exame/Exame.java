package Exame;

abstract class Exame {
    private String nomePaciente;
    private String tipoSanguineo;
    private int anoNascimento;

    public Exame(String nomePaciente, String tipoSanguineo, int anoNascimento){
       this.nomePaciente = nomePaciente;
       this.tipoSanguineo = tipoSanguineo;
       this.anoNascimento = anoNascimento;
    }
    public  abstract  void classificarResultado();
    public abstract void mostrarResultado();
    public  abstract  void cadastrarExame(double valor);


}
