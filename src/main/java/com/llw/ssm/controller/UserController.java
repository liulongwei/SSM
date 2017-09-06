package com.llw.ssm.controller;

import com.llw.ssm.common.PageInfo;
import com.llw.ssm.common.ResultBean;
import com.llw.ssm.model.User;
import com.llw.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "list", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public PageInfo findUser(PageInfo pageInfo, User user) {
        userService.findUser(pageInfo, user);
        return pageInfo;
    }

    @RequestMapping(value = "add", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResultBean add(User user) {
        ResultBean rb = new ResultBean();
        userService.createUser(user);
        rb.setFlag(true);
        return rb;
    }

    @RequestMapping(value = "delete", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResultBean delete(User user) {
        ResultBean rb = new ResultBean();
        userService.deleteUser(user);
        rb.setFlag(true);
        return rb;
    }

    @RequestMapping(value = "batchDeleteUser", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResultBean batchDeleteUser(@RequestParam(value = "userIds") List<Integer> userIds) {
        ResultBean rb = new ResultBean();
        userService.batchDeleteUser(userIds);
        rb.setFlag(true);
        return rb;
    }

    @RequestMapping(value = "update", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResultBean update(User user) {
        ResultBean rb = new ResultBean();
        userService.updateUser(user);
        rb.setFlag(true);
        return rb;
    }

}