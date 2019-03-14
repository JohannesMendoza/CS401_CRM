package view;

/**
 *
 * @author kluceycose
 */

import Menu.MenuItem;
import model.Account;
import model.AccountList;

import java.util.Scanner;

public class DisplayAccount implements MenuItem {
    AccountList accountList;

    public DisplayAccount(AccountList _accountList){
        accountList = _accountList;
    }

    public void execute(){
        Scanner STDIN = new Scanner(System.in);
        System.out.println("Enter Account ID: ");
        int id = STDIN.nextInt();
        Account account = accountList.getAccount(id);
        if(account != null){
            System.out.println("Account ID: "+account.getAccountId()+
                    "\nAccount Name: "+account.getAccountName()+
                    "\nAmount: $"+account.getAmount()+
                    "\nClose Date: "+account.getCloseDate().toString()+
                    "\nPrimary Contact ID: "+account.getPrimaryContactId());
        }
    }

    @Override
    public String toString(){
        return "Display an Account's Details";
    }
}
