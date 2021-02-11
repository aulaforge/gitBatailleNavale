class Board{
    private String nom;
    private char[][] navires;
    private boolean[][] frappes;

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
      int n=navires.length;
      if (n<10){
        System.out.print(" ");
      }
      else if(n>=10 && n<100){
        System.out.print("  ");
      }
      else{
        System.out.println("Taille trop grande, non gérée, veuillez rentrer une valeur inférieure à 100");
        return;
      }
      for (int i=0; i<n;i++){
        char c=(char)(65+i);
        System.out.print(" " + c);
      }
      System.out.println(" ");
      for(int j=1; j<n+1; j++){
        if (j<10){
          System.out.print(j + " ");
        }
        else{
          System.out.print(j);
        }
        for(int i=0;i<n; i++){
          System.out.print(" " + navires[j-1][i]);
        }
        System.out.println(" ");
      }
    }

    public static void main(String[] args) {
      Board test=new Board("Test");
      test.print();
    }

}
