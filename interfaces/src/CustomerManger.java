public class CustomerManger {
    //Utils utils = new Utils();
    private Logger[] loggers;
    public CustomerManger(Logger[] loggers) {
        this.loggers = loggers;
    }
    //loosly and tightly bagımlıllık; Dependisi enjeksıon
    public void add(Customer customer) {
        System.out.println(customer.getFirstName() + " Customer added.");
        //FileLogger logger = new FileLogger();
        //Bad Code
      /*  for (Logger logger: this.loggers
             ) {
            logger.log(customer.getFirstName());
        }*/
        //utils.runLoggers(loggers, customer.getFirstName());
        Utils.runLoggers(loggers, customer.getFirstName());
    }


    public void delete(Customer customer) {
        System.out.println(customer.getFirstName() + " Customer deleted");
        //utils.runLoggers(loggers,customer.getFirstName());
        Utils.runLoggers(loggers, customer.getFirstName());
    }
}
