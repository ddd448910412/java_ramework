package org.smart4j.chapter2.controller;

import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.service.CustomerService;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 编辑客户
 */
@WebServlet("/customer_edit")
public class CustomerEditServlet extends HttpServlet {

    private CustomerService customerService;


    @Override
    public void init() throws ServletException {
        customerService = new CustomerService();
    }

    /**
     * 进入 编辑客户 界面
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO
       String id= req.getParameter("id");
        Customer customer= customerService.getCustomer(Long.parseLong(id));
        req.setAttribute("customer",customer);
        System.out.println(customer);
        //D:\yijie\workspace\ide001\java_framework\src\main\webapp\WEB-INF\view\customer_edit.jsp
        req.getRequestDispatcher("/WEB-INF/view/customer_edit.jsp").forward(req, resp);
    }

    /**
     * 处理 编辑客户 请求
     */
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO
    }
}
