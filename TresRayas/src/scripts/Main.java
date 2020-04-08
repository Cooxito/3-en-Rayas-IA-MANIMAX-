package scripts;

import Esena.Menu;
import Esenario.Esenario;

public class Main {

    public static void main(String[] args) {
        Esenario frm = new Esenario();
        Menu menu = new Menu(frm);
        frm.setSize(menu.getWidth(), menu.getHeight());
        frm.add(menu, 0, 0);
        frm.setResizable(false);
        frm.setLocationRelativeTo(menu);
        frm.setTitle("3 en Rayas");
        frm.setVisible(true);


    }

}
