package learnings.interfaceconcepts.builderpattern;

public class BankAccount {


    //create a inner class called builder and create setters for all the variables .Make sure the setters return the builder object
    //Create an instance for the main class where the builder lives.This shoukd be the build() method
    //Make sure the builder class you create is static
    //While creating the object call outerclass.builderclass and chain the methods 



    public long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    public static class AccountBuilder {

        private long accountNumber; //This is important, so we'll pass it to the constructor.
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public AccountBuilder(long accountNumber) {
            this.accountNumber = accountNumber;
        }
        public AccountBuilder withOwner(String owner){
            this.owner = owner;
            return this;  //By returning the builder each time, we can create a fluent interface.
        }
        public AccountBuilder atBranch(String branch){
            this.branch = branch;
            return this;
        }
        public AccountBuilder openingBalance(double balance){
            this.balance = balance;
            return this;
        }
        public AccountBuilder atRate(double interestRate){
            this.interestRate = interestRate;
            return this;
        }
        public BankAccount build(){
            //Here we create the actual bank account object, which is always in a fully initialised state when it's returned.
            BankAccount account = new BankAccount();  //Since the builder is in the BankAccount class, we can invoke its private constructor.
            account.accountNumber = accountNumber;
            account.owner = owner;
            account.branch = branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;
            return account;
        }
    }










    //Fields omitted for brevity.  This is how we were doing before
/*    private BankAccount(long accountNumber, String owner,
                        String branch,
                        double balance,
                        double interestRate)
             {
        this.accountNumber = accountNumber;
        //Constructor is now private.
    }*/
    //Getters and setters omitted for brevity.
}



