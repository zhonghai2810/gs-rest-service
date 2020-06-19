package com.gvt.riskservice;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
@ComponentScan("controllers")
public class SwaggerConfig {

    @Bean
    public Docket docker(){
        // 构造函数传入初始化规范，这是swagger2规范
        return new Docket(DocumentationType.SWAGGER_2)
                //apiInfo： 添加api详情信息，参数为ApiInfo类型的参数，这个参数包含了第二部分的所有信息比如标题、描述、版本之类的，开发中一般都会自定义这些信息
                .groupName("风控")
                .apiInfo(apiInfo())
                .pathMapping("/")
                //配置是否启用Swagger，如果是false，在浏览器将无法访问，默认是true
                .enable(true)
                .select()
                //apis： 添加过滤条件,
                .apis(RequestHandlerSelectors.basePackage("controllers"))
                //paths： 这里是控制哪些路径的api会被显示出来，比如下方的参数就是除了s/user以外的其它路径都会生成api文档
//                .paths((String a) ->
//                        !a.equals("/user"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        Contact contact = new Contact("alexis", null, "alexiszhong@gvt861.com");
        return new ApiInfoBuilder()
                //页面标题
                .title("风控数据接口")
                //设置作者联系方式,可有可无
                .contact(contact)
                //版本号
                .version("1.1.0")
                //描述
                .description("API 描述")
                .build();
    }

}
