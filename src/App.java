public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Lutador l1[] = new Lutador[6];

        l1[0] = new Lutador("Leandrinho", "Brasileiro", 18, 10, 0, 2, 82.5f, 1.80f );
        l1[1] = new Lutador("Jessé", "Brasileiro", 18, 10, 0, 2, 82.5f, 1.80f );
        l1[2] = new Lutador("Ruan", "Brasileiro", 18, 10, 0, 2, 82.5f, 1.80f );
        l1[3] = new Lutador("Thiagueta", "Brasileiro", 18, 10, 0, 2, 85.5f, 1.80f );
       
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l1[0], l1[2]);// Marcando a luta entre Leandro e o Ruan.
        UEC01.lutar();
        l1[0].status();
        l1[3].status();
       

    }
}
