package com.itcast;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author wangzhineng
 * @date 2019-10-14 - 17:10
 */
public class AccountDaoImpl implements AccountDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int addAccount(Account account) {
        String sql = "insert into account(username,balance) value(?,?)";
        Object[] obj = new Object[]{account.getUsername(),account.getBalance()};
        int num = this.jdbcTemplate.update(sql, obj);
        return num;
    }

    public int updateAccount() {
        return 0;
    }

    public int deleteAccount() {
        return 0;
    }
}
