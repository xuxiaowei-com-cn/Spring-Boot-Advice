package cn.com.xuxiaowei.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Controller 异常拦截
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Slf4j
@ControllerAdvice
public class ControllerAdviceConfiguration {

    /**
     * 算数异常（ArithmeticException） 拦截处理
     *
     * @param e       异常
     * @param request 请求
     * @return 返回 异常信息
     */
    @ResponseBody
    @ExceptionHandler(ArithmeticException.class)
    public Map<String, Object> arithmeticException(ArithmeticException e, WebRequest request) {
        Map<String, Object> map = new HashMap<>(4);
        Map<String, Object> data = new HashMap<>(4);
        map.put("data", data);
        map.put("code", "A001");
        map.put("msg", "发生算数异常：" + e.getMessage());
        log.error(e.getMessage(), e);
        return map;
    }

}
