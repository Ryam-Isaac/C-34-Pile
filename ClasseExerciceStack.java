package projet_piles;

import java.util.List;
import java.util.Set;
import java.util.Stack;

public class ClasseExerciceStack {

    public static void main(String[] args)
    {
        // créer une pile

        Stack<Article> s = new Stack<>();

        //1 ajouter une cravate de code 718 dans la pile
        Cravate cravate = new Cravate("718");
        s.push(cravate);


        //2 ajouter une cravate de code 22 dans la pile
        Cravate cravate1 = new Cravate("22");
        s.push(cravate1);

        //3 ajouter un maillot de code 123 et de grandeur moyenne
        Maillot maillot = new Maillot("123","moyenne" );
        s.push(maillot);

        //4 afficher le nombre d'objets dans la pile à l'aide d'une méthode

        //System.out.println(s.size());

        //5 créez une deuxième pile identique à la première et contenant les mêmes articles, peut-on faire ça en une ligne de code ?

        // option 1

         Stack<Article> s1 = (Stack<Article>) s.clone();
         s.peek().setCode("123456");
         //System.out.println(s1.peek().getCode());

        //option 2

        Stack<Article> pileCopie2 =new Stack<>();
        pileCopie2.addAll(s);
        pileCopie2.peek().setCode("1234");
        System.out.println(pileCopie2.peek().getCode());

        // ce n'est pas egale , c'e
        if(pileCopie2 == s1 ) {
            System.out.println("true");
        }

        //6 en les retirant un à un de la pile originale, calculer le total des prix des articles contenus dans la pile
        // je ne sais pas comment calculer le prix des articles

        double prixTot = 0 ;
        while (!s.empty()){
           Article aTemp = (Article)s.pop();
           double prix = aTemp.getPrix();
           prixTot += aTemp.getPrix();

       }
        System.out.println(prixTot);


        //7 Créez maintenant une Pile qui ne pourra contenir que des Articles
        Stack<Article> pile3 = new Stack<Article>();


        //8 ajouter un objet Cravate, code 565 à cette pile, est-ce possible ?
        pile3.add(new Cravate("565")) ;

        //9 ajouter un objet String à cette pile , est-ce possible ?

        //articles.add(5,"ellp");

        // non car article ne peut qu'impleter des articles
        //10 ajouter deux autres cravates à cette pile, code 456 et 242

        pile3.add(new Cravate("456")) ;
        pile3.add(new Cravate("242")) ;


        //11 en les retirant un à un de cette pile , calculer le total des prix des articles contenus dans cette pile
        double prixTot2 = 0 ;
        while (!pile3.empty()){
            Article aTemp = (Article)s.pop();
            double prix = aTemp.getPrix();
            prixTot2 += aTemp.getPrix();

        }
        System.out.println(prixTot);

        //12 en utilisant la méthode search, retrouver l'ordre de sortie (1 étant le dessus de la pile) de la cravate avec le code 22 dans la deuxième pile.
        //La méthode equals de Cravate doit être définie. Voir https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html 
        //pour comprendre quel est l'argument qui doit être passé à search.
        //Refaire avec une cravate ayant un code qui ne figure pas dans celles de la pile.
        System.out.println(pile3.search(new Cravate("22")));
    }
}
