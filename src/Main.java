import java.io.IOException;
import java.sql.SQLException;

import controller.AppController;
import exception.InvalidCustomerDetailsException;

public class Main {
	public static void main(String []args) throws NumberFormatException, IOException, SQLException, InvalidCustomerDetailsException {
		AppController app = new AppController();
		app.start();
	}
}
