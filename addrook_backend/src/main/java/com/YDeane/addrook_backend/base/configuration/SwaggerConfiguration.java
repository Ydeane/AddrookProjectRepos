package com.YDeane.addrook_backend.base.configuration;
import com.YDeane.addrook_backend.base.util.BaseContants;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * <b>Swagger文档框架配置类</b>
 * @author YDeane
 * @date 2021-12-15
 * @version 1.0.0
 */
@Configuration
public class SwaggerConfiguration {
	/**
	 * 创建Swagger的核心对象Docket
	 * @return
	 */
	@Bean
	public Docket createRestAPI(){
		Docket docket = new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
				.paths(PathSelectors.any())
				.build();
		return docket;
	}

	/**
	 * 配置Swagger文档配置信息文字说明
	 * @return
	 */
	private ApiInfo apiInfo(){
		ApiInfo apiInfo = new ApiInfoBuilder()
				.title(BaseContants.SWAGGER_TITLE)
				.description(BaseContants.SWAGGER_DESCRIPTION)
				.version(BaseContants.SWAGGER_VERSION)
				.contact(new Contact(BaseContants.SWAGGER_CONTACT_NAME, BaseContants.SWAGGER_CONTACT_URL, BaseContants.SWAGGER_CONTACT_EMAIL))
				.build();
		return apiInfo;
	}

}
