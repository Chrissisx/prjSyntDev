public class JoanBedonL02 {
    public void hashtagbarra(char caracter) {
        int longitudBarra = 20; //Marca cuanto va avanzar o medir
          
          String[] figuras = {
                  "[" + new String(new char[longitudBarra]).replace('\0', ' ') + "] 0%",
                  "[" + new String(new char[1]).replace('\0', caracter) + new String(new char[longitudBarra - 1]).replace('\0', ' ') + "] 0%"
          };
  
          for (int i = 1; i <= 100; i++) {
              figuras[0] = "[" + new String(new char[i * longitudBarra / 100]).replace('\0', caracter) + new String(new char[longitudBarra - i * longitudBarra / 100]).replace('\0', ' ') + "] " + i + "%"; //Que suba de 0 a 100 pero dependiendo de su restriccion
  
              System.out.print("\r" + figuras[0]);
  
              try {
                  Thread.sleep(200);  
              } catch (InterruptedException e) {
                  Thread.currentThread().interrupt();
              }
          }
  
          System.out.println("\r[" + new String(new char[longitudBarra]).replace('\0', caracter) + "] 100%");
     }
  }

