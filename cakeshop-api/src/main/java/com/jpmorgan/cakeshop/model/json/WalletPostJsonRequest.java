package com.jpmorgan.cakeshop.model.json;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = WalletDeserializer.class)
public class WalletPostJsonRequest {

    private String fromAccount, account, accountPassword, data;
    private Long newBalance;
    private List<String> privateFor;

    /**
     * @return the formAccount
     */
    public String getFromAccount() {
        return fromAccount;
    }

    /**
     * @param formAccount the formAccount to set
     */
    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    /**
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return the accountPassword
     */
    public String getAccountPassword() {
        return accountPassword;
    }

    /**
     * @param accountPassword the accountPassword to set
     */
    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    /**
     * @return the newBalance
     */
    public Long getNewBalance() {
        return newBalance;
    }

    /**
     * @param newBalance the newBalance to set
     */
    public void setNewBalance(Long newBalance) {
        this.newBalance = newBalance;
    }

    /**
     * @return the contract data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the contract data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the privateFor
     */
    public List<String> getPrivateFor() {
        return privateFor;
    }

    /**
     * @param privateFor the privateFor to set
     */
    public void setPrivateFor(List<String> privateFor) {
        this.privateFor = privateFor;
    }

}
