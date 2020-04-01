package mvc_test;
import javax.swing.JOptionPane;

public class Controller {
	 private Model model;
	 private View view;
	 public Controller(Model m, View v) {
	  model = m;
	  view = v;
	  initView();
	 }
	 public Controller(Model m, javax.swing.text.View v) {
		// TODO Auto-generated constructor stub
	}
	public void initView() {
	  view.getFirstnameTextfield().setText(model.getFirstName());
	  view.getLastnameTextfield().setText(model.getLastName());
	 }
	 public void initController() {
	  view.getFirstnameSaveButton().addActionListener(e -> saveFirstname());
	  view.getLastnameSaveButton().addActionListener(e -> saveLastname());
	  view.getHello().addActionListener(e -> sayHello());
	  view.getBye().addActionListener(e -> sayBye());
	 }
	 private void saveFirstname() {
	  model.setFirstName(view.getFirstnameTextfield().getText());
	  JOptionPane.showMessageDialog(null, "Firstname saved : " + model.getFirstName(), "Info", JOptionPane.INFORMATION_MESSAGE);
	 }
	 private void saveLastname() {
	  model.setLastName(view.getLastnameTextfield().getText());
	  JOptionPane.showMessageDialog(null, "Lastname saved : " + model.getLastName(), "Info", JOptionPane.INFORMATION_MESSAGE);
	 }
	 private void sayHello() {
	  JOptionPane.showMessageDialog(null, "Hello " + model.getFirstName() + " " + model.getLastName(), "Info", JOptionPane.INFORMATION_MESSAGE);
	 }
	 private void sayBye() {
	  System.exit(0);
	 }
	}