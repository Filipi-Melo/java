import javax.swing.JOptionPane;
public class paineis {
    private static final String input(String a){return JOptionPane.showInputDialog(null,a);}
    private static final int confirm(String a){return JOptionPane.showConfirmDialog(null,a);}
    private static void message(String a){JOptionPane.showMessageDialog(null,a);}

    public static void main(String[] args) {
        String v1 = input("Digite um valor:");
        int v2 = confirm("Deseja confirmar o valor:  " + v1+" ?");
        if (v2 == 0) {
            message("Valor:  '" + v1 + "' foi confirmado");
        }
        if (v2 == 1) {
            message("Valor:  '" + v1 + "' foi negado");
        }
        if (v2 == 2) {
            message("Valor:  '" + v1 + "' foi cancelado");
        }
        //JOptionPane.showOptionDialog(null, "Valor decidido: ", "Fim",0, 1, null,args,null);
    }
}