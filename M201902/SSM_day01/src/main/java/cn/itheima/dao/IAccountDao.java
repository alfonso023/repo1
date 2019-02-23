package cn.itheima.dao;

import cn.itheima.domain.Account;

import java.util.List;

public interface IAccountDao {
    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();

    /**
     * 查询Id
     * @return
     */
    public Account findById();

    /**
     * 保存账户
     * @param account
     */
    public void saveAccount(Account account);

    /**
     * 修改账户
     * @param account
     */
    public void updateAccount(Account account);

    /**
     * 删除账户
     * @param account
     */
    public void deleteAccount(Account account);
}
