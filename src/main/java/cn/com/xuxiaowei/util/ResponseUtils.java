/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.com.xuxiaowei.util;

import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * 响应数据 工具类
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
public class ResponseUtils {

    /**
     * 响应数据
     *
     * @param response 响应
     * @param map      Map 类型的数据
     * @throws IOException IO 异常
     */
    public static void response(HttpServletResponse response, Map<?, ?> map) throws IOException {
        String string = JSON.toJSONString(map);
        response(response, string);
    }

    /**
     * 响应数据
     *
     * @param response 响应
     * @param object   Object 类型的数据
     * @throws IOException IO 异常
     */
    public static void response(HttpServletResponse response, Object object) throws IOException {
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().println(object);
        response.setStatus(HttpServletResponse.SC_OK);
        response.flushBuffer();
    }

}
