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

    /**
     * 登录接口
     * @param user
     * @param session
     * @return
     */
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

    /**
     * 注册接口
     * @param user
     * @param request
     * @return
     */
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

    /**
     * 注册完之后标签选择接口
     * @param
     * @return
     */
    @RequestMapping(value = "/addKeyType", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> addKeyType(@RequestBody List<String> keyTypeList,String username,String customLabel) {
        int result = userService.addKeyType(keyTypeList,username,customLabel);//调用service层进行注册
        Map<String, Object> modelMap = new HashMap<String, Object>();
        if (result > 0) {
            modelMap.put("result", "success");
        } else {
            modelMap.put("result", "fail");
        }
        return modelMap;
    }

    /**
     * 获取用户所选新闻关键字接口
     * @param username
     * @return
     */
    @RequestMapping(value = "/getAllLabel", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> getAllLabel(@RequestBody String username) {
        List<String> labels = userService.getAllLabel(username);//调用service层进行注册
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("result", "success");
        modelMap.put("labels", labels);
        return modelMap;
    }
}
