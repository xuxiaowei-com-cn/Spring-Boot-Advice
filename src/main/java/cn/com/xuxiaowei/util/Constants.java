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

import com.google.common.net.HttpHeaders;

/**
 * 常量
 *
 * @author xuxiaowei
 * @see org.springframework.http.MediaType spring-web，从 3.0 开始
 * @see org.springframework.util.MimeTypeUtils spring-core，从 4.0 开始
 * @see org.springframework.http.HttpHeaders spring-web，从 3.0 开始
 * @see com.google.common.net.HttpHeaders guava，从 11.0 开始
 * @see javax.servlet.http.HttpServletResponse
 * @see org.springframework.web.context.support.XmlWebApplicationContext spring-web
 * @see org.springframework.context.ApplicationContextAware spring-context，可获取 {@link org.springframework.context.ApplicationContext}，非常量相关
 * @see org.springframework.web.util.JavaScriptUtils spring-web，从 1.1.1 开始，将JavaScript特殊字符转换为转义字符，非常量相关
 * @see org.springframework.web.servlet.view.json.MappingJackson2JsonView spring-webmvc，从 3.1.2 开始
 * @see org.springframework.web.context.WebApplicationContext
 * @see java.nio.charset.StandardCharsets
 * @see sun.nio.cs.StandardCharsets
 * @since 0.0.1
 */
public final class Constants {

    /**
     * Ajax 请求时的 X-Requested-With 内容
     *
     * @see HttpHeaders#X_REQUESTED_WITH
     */
    public static final String X_REQUESTED_WITH_CONTENT = "XMLHttpRequest";

}
