package application;
import java.awt.Button;
import java.net.URL;

import org.lu.ics.labbar.BankAccount;
import org.lu.ics.labbar.Person;
import org.lu.ics.labbar.PersonRegister;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
	PersonRegister reg = new PersonRegister();

	@FXML 
	private TextField txtPersonName;
	@FXML
	private TextField txtPersonNbr;
	@FXML
	private TextField txtAccountNbr;
	@FXML
	private TextArea lblAccountList;
	

	@FXML
	public void btnAdd_Click(ActionEvent event) {
		String pName = txtPersonName.getText();
		String pNumber = txtPersonNbr.getText();
		Person tmpPerson = new Person(pNumber, pName);
		if(reg.findPerson(pNumber) != null) {
			lblAccountList.setText("Personnummret finns redan. Testa ett nytt.");
		}
		else {
		reg.addPerson(tmpPerson);
		lblAccountList.setText("Person added: " + tmpPerson.getName());
		}

	}
	@FXML
	public void btnFind_Click(ActionEvent event) {
		String pNumber = txtPersonNbr.getText();
		Person tmpPerson = reg.findPerson(pNumber);
		if (tmpPerson != null) {
			lblAccountList.setText("Response: Person found!");
			txtPersonNbr.setText(tmpPerson.getpNbr());
			txtPersonName.setText(tmpPerson.getName());
			txtAccountNbr.setText("");

			}
		else {
			lblAccountList.setText("Response: Person not found!");
		}
	}
	@FXML
	public void btnDelete_Click(ActionEvent event) {
		String pNumber = txtPersonNbr.getText();
		reg.removePerson(pNumber);
		lblAccountList.setText("Response: Person deleted");
	}

	@FXML
	public void btnPrint_Accounts(ActionEvent event) {
		String pNumber = txtPersonNbr.getText();
		lblAccountList.setText(reg.findPerson(pNumber).getAllAccounts());
		
		
	}

	@FXML
	public void btnAdd_Account(ActionEvent event) {
		String pNbr = txtPersonNbr.getText();
		String aNbr = txtAccountNbr.getText();
		Person p = reg.findPerson(pNbr);
		BankAccount acc = new BankAccount(0,aNbr,p);
		if(p.getAccount(aNbr) != null) {
			lblAccountList.setText("Kontonummret finns. Använd ett nytt nummer.");
		}
		else {
		reg.findPerson(pNbr).addAccount(acc);
		lblAccountList.setText("Account added");	
		}
	}
}


