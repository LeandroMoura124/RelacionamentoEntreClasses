public class Lutador implements Controlador {
    //Atributos
    public String nome, categoria, nacionalidade;
    public int idade, vitorias, derrotas, empates;
    public float peso, altura; 

    //Método Construtor - Valores que seräo implementados após eu instanciar a classe

    public Lutador(String no, String na, int id, int vi, int de, int em, float pe, float al){
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
        this.setPeso(pe);
        this.setAltura(al);
    }
    



    //Métodos modificadores - Get e Sett
    public void setNome(String no) {
        this.nome = no;
    }
    public String getNome() {
        return nome;
    }
    public void setCategoria() {

        if(this.getPeso() < 72.2){
            this.categoria = "Inválido";
        }
        else if(this.getPeso() <= 81){
            this.categoria = "Leve";
        }
        else if(this.getPeso() <= 98.7){
            this.categoria = "Médio";
        }
        else if(this.getPeso() <=120.5){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Peso inválido";
        }
    }
    public String getCategoria() {
        return categoria;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }
    public int getIdade() {
        return idade;
    }


    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(); // Chamando o set categoria - Se o valor do peso estiver entre as faixas de peso, a string do valor categoria "leve, medio ou pesado" irá entrar automaticamente.
    }
    public float getPeso() {
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getAltura() {
        return altura;
    }

    
    public void setVitorias(int vi) {
        this.vitorias = vi;
    }
    public int getVitorias() {
        return vitorias;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setEmpates(int em) {
        this.empates = em;
    }
    public int getEmpates() {
        return empates;
    }



    //Métodos especifícos
    @Override
    public void apresentar() {
       
        System.out.println("LÁ VEM ELE, O LUTADOR: " + this.getNome());
        System.out.println("Diretamente do: " + this.getNacionalidade());
        System.out.println("Tendo apenas " + this.getIdade() + " anos");
        System.out.println("Pesando " + this.getPeso() + "kg e com " + this.getAltura() + "m de altura");

    }

    @Override
    public void status() {
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    @Override
    public void ganharLuta() {
        
        this.setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
        
    }

    @Override
    public void empatarLuta() {
    this.setEmpates(getEmpates() + 1);

    
    }
}
