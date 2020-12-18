package cn.com.xuxiaowei.advice;

import cn.com.xuxiaowei.util.Constants;
import cn.com.xuxiaowei.util.ResponseUtils;
import com.google.common.net.HttpHeaders;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
     * @param exception  异常
     * @param request    请求
     * @param response   响应
     * @param webRequest Web请求的通用接口。
     *                   主要用于通用Web请求拦截器，使它们可以访问通用请求元数据，而不用于实际处理请求。
     */
    @ExceptionHandler(ArithmeticException.class)
    public void arithmeticException(ArithmeticException exception, HttpServletRequest request,
                                    HttpServletResponse response, WebRequest webRequest) throws IOException, ServletException {

        log.error(exception.getMessage(), exception);

        String xRequestedWith = request.getHeader(HttpHeaders.X_REQUESTED_WITH);
        if (Constants.X_REQUESTED_WITH_CONTENT.equals(xRequestedWith)) {
            // ajax 请求

            Map<String, Object> map = new HashMap<>(4);
            Map<String, Object> data = new HashMap<>(4);
            map.put("data", data);
            map.put("code", "A001");
            map.put("msg", "发生算数异常：" + exception.getMessage());

            ResponseUtils.response(response, map);
        } else {
            // 非 Ajax 请求

            request.setAttribute("code", "A001");
            request.setAttribute("msg", "发生算数异常：" + exception.getMessage());

            request.getRequestDispatcher("/error/index").forward(request, response);
        }

    }

}
