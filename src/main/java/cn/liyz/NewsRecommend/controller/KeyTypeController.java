package cn.liyz.NewsRecommend.controller;

import cn.liyz.NewsRecommend.entity.KeyType;
import cn.liyz.NewsRecommend.service.KeyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liyan on 2018/7/12.
 */
@Controller
@RequestMapping("/keyType")
public class KeyTypeController {
    @Autowired
    private KeyTypeService keyTypeService;

    @RequestMapping(value = "/getAllKeyType", method = RequestMethod.POST)
    public @ResponseBody
    Map<String, Object> getAllKeyType() {
        List<KeyType> keyTypes =keyTypeService.getAllKeyType();//调用service层进行注册
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("result", "success");
        modelMap.put("keyTypes", keyTypes);
        return modelMap;
    }

    @RequestMapping(value = "/deleteUserKeyType", method = RequestMethod.POST)
    public @ResponseBody
    Map<String, Object> deleteUserKeyType(@RequestBody int userId,String keyType) {
        int result =keyTypeService.deleteUserKeyType(userId,keyType);//调用service层进行注册
        Map<String, Object> modelMap = new HashMap<String, Object>();
        if (result > 0) {
            modelMap.put("result", "success");
        } else {
            modelMap.put("result", "fail");
        }
        return modelMap;
    }
}
