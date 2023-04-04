
import br.com.DesafioDio.dominio.util.ConsoleUIHelper;
import br.com.DesafioDio.dominio.view.Menu;


public class Main {
    public static void main(String[] args) {
        ConsoleUIHelper.drawHeader("Prática de POO DIO", 80);
        Menu.menu();
        ConsoleUIHelper.drawHeader("PROGRAMA FINALIZADO", 80);


    }


}