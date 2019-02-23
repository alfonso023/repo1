package cn.itheima.service.Impl;

import cn.itheima.dao.IAccountDao;
import cn.itheima.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author alfon
 */
@Service("/accountService")
public class AccountService implements IAccountDao{

    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有执行了 .....");
        return null;
    }

    @Override
    public Account findById() {
        return null;
    }

    @Override
    public void saveAccount(Account account) {

    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public void deleteAccount(Account account) {

    }
}
