package com.controller;

import com.entities.ThObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ThymeleafController {

    @RequestMapping("dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @RequestMapping("thymeleaf")
    public String thymeleaf(ModelMap map) {
        map.put("thText", "<b>加粗</b>");
        map.put("thUText", "<b>加粗</b>");
        map.put("thValue", "<b>加粗</b>");
        map.put("thEach", Arrays.asList("1","2","3"));
        map.put("thIf", "not null");
        map.put("thObject", new ThObject(1L, "th:object", "th属性"));
        return "grammar/thymeleaf";
    }

    @RequestMapping("varexpressions")
    public String varexpressions(ModelMap map) {
        map.put("itdragonStr", "itdragonBlog");
        map.put("itdragonBool", true);
        map.put("itdragonArray", new Integer[]{1, 2, 3, 4});
        map.put("itdragonList", Arrays.asList(1, 3, 2, 4, 0));
        Map itdragonMap = new HashMap();
        itdragonMap.put("thName", "${#...}");
        itdragonMap.put("desc", "变量表达式内置方法");
        map.put("itdragonMap", itdragonMap);
        map.put("itdragonDate", new Date());
        map.put("itdragonNum", 888.888D);
        return "grammar/varexpressions";
    }
}
