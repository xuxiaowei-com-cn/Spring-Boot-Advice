package cn.com.xuxiaowei.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常 Controller
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Slf4j
@Controller
@RequestMapping("/error")
public class ErrorController {

    /**
     * 错误页面
     *
     * @param request  请求
     * @param response 响应
     * @return 返回 错误 页面
     */
    @RequestMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response, Model model) {

        Object code = request.getAttribute("code");
        Object msg = request.getAttribute("msg");

        log.error("异常代码：{}", code);
        log.error("异常消息：{}", msg);

        model.addAttribute("code", code);
        model.addAttribute("msg", msg);

        return "error/index";
    }

    /**
     * 模拟 算数异常
     *
     * @param request  请求
     * @param response 响应
     * @return 返回 主页
     */
    @RequestMapping("/arithmetic.html")
    public String arithmetic(HttpServletRequest request, HttpServletResponse response, Model model) {

        int i = 1 / 0;

        return "index";
    }

}
