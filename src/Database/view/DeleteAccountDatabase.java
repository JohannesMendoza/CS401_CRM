package Database.view;

import Menu.MenuItem;

/**
 *
 * @author kenny
 * Deletes account from database using a given account name.
 */
public class DeleteAccountDatabase implements MenuItem {

    // URL to where database is created
    private String URL;
    private String accountName;

    // Constructor sets default URL and accepts accountName
    public DeleteAccountDatabase(String accountName) {
        this.URL = "jdbc:derby://localhost:1527/CRM";
        this.accountName = accountName;
    }
    
    // Constructor accepts accountName and URL
    public DeleteAccountDatabase(String accountName, String URL) {
        this.URL = URL;
        this.accountName = accountName;
    }    

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
