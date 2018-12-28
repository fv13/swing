import javax.swing.JOptionPane;
public class Principal {
	public static void main(String[] args) {
		Principal app = new Principal();
		app.start();
	}
	/**
	 * Description:Inicio de la app
	 * @param:None
	 * @return:None
	 */
	private void start() {
		if (MysqlServer.tryConnection()==true) {
			JOptionPane.showMessageDialog(null, "Test conection : Connected and closed");
			
		} else {
			JOptionPane.showMessageDialog(null, "Can't connect", "Connect ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
}