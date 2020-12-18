package cn.com.xuxiaowei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 异常 RestController
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@RestController
@RequestMapping("/error")
public class ErrorRestController {

    /**
     * 模拟 算数异常
     *
     * @param request  请求
     * @param response 响应
     * @return 返回 结果
     */
    @RequestMapping("/arithmetic.json")
    public Map<String, Object> arithmetic(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<>(4);
        Map<String, Object> data = new HashMap<>(4);
        map.put("data", data);

        int i = 1 / 0;

        return map;
    }

}
