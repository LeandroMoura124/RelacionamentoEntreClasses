import java.util.Random;

public class Luta { //Nessa classe Luta, iremos relaciona-la a classe Lutador
    private Lutador desafiado; // Agregando o atributo desafiado a classe Lutador
    private Lutador desafiante; // Agragando o atributo desafiante a classe Lutador
    private int rounds;
    private boolean aprovada;



    //Métodos específicos

    public void marcarLuta(Lutador l1, Lutador l2)
    {
        if(l1.getCategoria().equals(l2.getCategoria()) && l1!=l2){ // Se a categoria dos lutadores forem iguais e os lutadores for diferente l2- A luta pode ser realizada
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            System.out.println("Luta marcada entre " + this.desafiado.getNome() + " e o " + this.desafiante.getNome());

        }
        else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
        
    }
    public void lutar(){
        if(this.getAprovada()){
            System.out.println("#### Desafiado ####");
            this.desafiado.apresentar();
            System.out.println("#### Desafiante ####");
            this.desafiante.apresentar();


            Random aleatorio = new Random(); // instanciando 'aleatorio' a classe Random do JAVA que serve para escolher número aleatórios import java.util.Random 
            int vencedor = aleatorio.nextInt(3); //0 1 2  
            switch (vencedor){
                case 0: //Empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // Desafiado
                    System.out.println("############### RESULTADO DA LUTA ##################");
                    System.out.println("O vencedor foi: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // Desafiante
                    System.out.println("################ RESULTADO DA LUTA ######################");
                    System.out.println("O vencedor foi: " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }

            
        }
        else{
            System.out.println("Luta não aprovada");
        }
    }


    // métodos get e sett

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public int getRounds() {
        return rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    public boolean getAprovada(){
        return aprovada;
    }
    
}
