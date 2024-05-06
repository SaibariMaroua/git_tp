public class Somme {
    public static void main(String[] args) {
        int somme = 0;
        
        // Boucle for pour parcourir les nombres de 1 à 10
        for (int i = 1; i <= 10; i++) {
            somme += i; // Ajoute chaque nombre à la somme
        }
        
        System.out.println("La somme des nombres de 1 à 10 est : " + somme);
    }
}
