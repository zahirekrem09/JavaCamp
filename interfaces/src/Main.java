public class Main {

    public static void main(String[] args) {
		//CustomerManger customerManger = new CustomerManger(new FileLogger()) ;
		//CustomerManger customerManger = new CustomerManger(new DatabaseLogger()) ;
		Logger[] loggers = {new DatabaseLogger(),new EmailLogger(),new FileLogger()};
		CustomerManger customerManger = new CustomerManger(loggers) ;
		Customer ekrem = new Customer(1,"Ekrem","Sarı");

	customerManger.add(ekrem);

    }
}
