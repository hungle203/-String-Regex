package thuchanh.account;

import thuchanh.account.AccountExample;

public class Test {

    private static AccountExample accountExample;
    public static final String[] validAccount = new String[] { "A*434524", "abc123", "______", "hungle2003","abcdefgh" };

    public static void main(String args[]) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }

    }
}
