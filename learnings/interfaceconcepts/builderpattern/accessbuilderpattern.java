package learnings.interfaceconcepts.builderpattern;

public class accessbuilderpattern {

    public static void main(String[] args) {

//You can omit certain values too. Like you can omit account number , branch and then build. So the default value will be set to zero.

        BankAccount account = new BankAccount.AccountBuilder(1234L)
                .withOwner("Marge")
                .atBranch("Springfield")
                .openingBalance(100)
                .atRate(2.5)
                .build();

        System.out.println(account.accountNumber);

    }

}
