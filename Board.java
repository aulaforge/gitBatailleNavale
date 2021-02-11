class Board{
    private String nom;
    public char[][] navires;
    public boolean[][] frappes;

    public String getNom(){
      return nom;
    }

    public void setNom(String nouvNom){
      this.nom=nouvNom;
    }

    public Board(String nom, int taille){
      this.nom=nom;
      this.navires=new char[taille][taille];
      this.frappes=new boolean[taille][taille];
      for(int i=0; i<taille; i++){
        for(int j=0; j<taille; j++){
          navires[i][j]='.';
          frappes[i][j]=false;
        }
      }
    }

    public Board(String nom){
      this.nom = nom;
      this.navires=new char[10][10];
      this.frappes=new boolean[10][10];
      for(int i=0; i<10; i++){
        for(int j=0; j<10; j++){
          navires[i][j]='.';
          frappes[i][j]=false;
        }
      }
    }

    public void print(){
      int taille=navires.length;
      int nombreCaracParLigne;
      if(taille>=27){
        System.out.println("Taille trop grande, non gérée, veuillez rentrer une valeur entre 4 et 26 (bornes incluses).");
        return;
      }
      else if(taille<4){
        System.out.println("Taille trop petite, non gérée, veuillez rentrer une valeur entre 4 et 26 (bornes incluses).");
        return;
      }
      if (taille<10){
        nombreCaracParLigne=2*taille+1;
      }
      else{
        nombreCaracParLigne=2*taille+2;
      }

      System.out.print("Navires :");
      for(int gap=0;gap<(nombreCaracParLigne-5);gap++){
        System.out.print(" ");
      }
      System.out.println("Frappes :");

      if (taille<10){
        System.out.print(" ");
      }
      else{
        System.out.print("  ");
      }

      for (int i=0; i<taille;i++){
        char c=(char)(65+i);
        System.out.print(" " + c);
      }

      System.out.print("    ");

      if (taille<10){
        System.out.print(" ");
      }
      else{
        System.out.print("  ");
      }

      for (int i=0; i<taille;i++){
        char c=(char)(65+i);
        System.out.print(" " + c);
      }
      System.out.println(" ");
      for(int j=1; j<taille+1; j++){
        if (j<10&&taille>=10){
          System.out.print(j + " ");
        }
        else{
          System.out.print(j);
        }
        for(int i=0;i<taille; i++){
          System.out.print(" " + navires[j-1][i]);
        }

        System.out.print("    ");

        if (j<10&&taille>=10){
          System.out.print(j + " ");
        }
        else{
          System.out.print(j);
        }
        for(int i=0;i<taille; i++){
          char affichageFrappe;
          if(frappes[j-1][i]){
            affichageFrappe='x';
          }
          else{
            affichageFrappe='.';
          }
          System.out.print(" " + affichageFrappe);
        }


        System.out.println(" ");
      }
    }

    public static void main(String[] args) {
      Board test=new Board("Test", 12);
      test.print();
    }

}
