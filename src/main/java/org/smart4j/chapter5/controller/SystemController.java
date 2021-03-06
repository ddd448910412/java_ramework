//package org.smart4j.chapter5.controller;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.smart4j.framework.annotation.Action;
//import org.smart4j.framework.annotation.Controller;
//import org.smart4j.framework.bean.Param;
//import org.smart4j.framework.bean.View;
//import org.smart4j.plugin.security.SecurityHelper;
//import org.smart4j.plugin.security.exception.AuthcException;
//
///**
// * 处理系统请求
// */
//@Controller
//public class SystemController {
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(SystemController.class);
//
//    /**
//     * 进入首界面
//     */
//    @Action("get:/")
//    public View index() {
//        return new View("index.jsp");
//    }
//
//    /**
//     * 进入登录界面
//     */
//    @Action("get:/login")
//    public View login() {
//        return new View("login.jsp");
//    }
//
//    /**
//     * 提交登录表单
//     */
//    @Action("post:/login")
//    public View loginSubmit(Param param) {
//        String username = param.getString("username");
//        String password = param.getString("password");
//        try {
//            SecurityHelper.login(username, password);
//        } catch (AuthcException e) {
//            LOGGER.error("login failure", e);
//            return new View("/login");
//        }
//        return new View("/customer");
//    }
//
//    /**
//     * 提交注销请求
//     */
//    @Action("get:/logout")
//    public View logout() {
//        SecurityHelper.logout();
//        return new View("/");
//    }
//}
