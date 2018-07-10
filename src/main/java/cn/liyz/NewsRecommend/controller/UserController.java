package cn.liyz.NewsRecommend.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import cn.liyz.NewsRecommend.entity.User;
import cn.liyz.NewsRecommend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaoyanger on 2017/12/15.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody
    Map<String, Object> login(@RequestBody User user, HttpSession session) {
        int result = userService.login(user.getUsername(), user.getPassword());//调用service层验证登陆
        Map<String, Object> modelMap = new HashMap<String, Object>();
        if (result == 1) {
            session.setAttribute("currUser", user);
            modelMap.put("result", 1);
        } else {
            modelMap.put("result", -1);
        }
        return modelMap;
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> addUser(@RequestBody User user, HttpServletRequest request) {
        int result = userService.addUser(user);//调用service层进行注册
        Map<String, Object> modelMap = new HashMap<String, Object>();
        if (result > 0) {
            modelMap.put("result", "success");
        } else if (result == -1) {
            modelMap.put("result", "The username has already existed!");
        } else if (result == -2) {
            modelMap.put("result", "The email has already existed!");
        } else {
            modelMap.put("result", "fail");
        }
        return modelMap;
    }

    @RequestMapping(value = "/addCustomLabel", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> addCustomLabel(@RequestBody Map<String, Object> map) {
        int result = userService.addCustomLabel(map.get("usernmae").toString(),map.get("customLabel").toString());//调用service层进行注册
        Map<String, Object> modelMap = new HashMap<String, Object>();
        if (result > 0) {
            modelMap.put("result", "success");
        } else {
            modelMap.put("result", "fail");
        }
        return modelMap;
    }

    @RequestMapping(value = "/addCustomLabel", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> addKeyType(@RequestBody List<String> keyTypeList,String username) {
        int result = userService.addKeyType(keyTypeList,username);//调用service层进行注册
        Map<String, Object> modelMap = new HashMap<String, Object>();
        if (result > 0) {
            modelMap.put("result", "success");
        } else {
            modelMap.put("result", "fail");
        }
        return modelMap;
    }

}
