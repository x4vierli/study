package org.smart4j.chapter2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.util.PropsUtil;
import org.smart4j.chapter2.util.StringUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Author: LiTing
 * Date: 2017/7/5 23:40
 */
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    public List<Customer> getCustomerList() {
        // Connection conn = null;
        // try {
        //     List<Customer> customerList = new ArrayList<Customer>();
        //     String sql = "SELECT * FROM customer";
        //     conn = DatabaseHelper.getConnection();
        //     PreparedStatement stmt = conn.prepareStatement(sql);
        //     ResultSet rs = stmt.executeQuery();
        //     while (rs.next()) {
        //         Customer customer = new Customer();
        //         customer.setId(rs.getLong("id"));
        //         customer.setName(rs.getString("name"));
        //         customer.setContact(rs.getString("contact"));
        //         customer.setTelephone(rs.getString("telephone"));
        //         customer.setEmail(rs.getString("email"));
        //         customer.setRemark(rs.getString("remark"));
        //         customerList.add(customer);
        //     }
        //     return customerList;
        // } catch (SQLException e) {
        //     LOGGER.error("execute sql failure", e);
        // } finally {
        //     DatabaseHelper.closeConnection(conn);
        // }
        // return null;

        // Connection conn = DatabaseHelper.getConnection();
        // try {
        //     String sql = "SELECT * FROM customer";
        //     return DatabaseHelper.queryEntityList(Customer.class, conn, sql);
        // } finally {
        //     DatabaseHelper.closeConnection(conn);
        // }

        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    public Customer getCustomer(long id) {
        String sql = "SELECT * FROM customer where id=" + Long.toString(id);
        return DatabaseHelper.queryEntity(Customer.class, sql);
    }

    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
