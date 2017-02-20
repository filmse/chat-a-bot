//package chat_Project.config;
//
//import com.linecorp.bot.spring.boot.interceptor.LineBotServerInterceptor;
//import com.linecorp.bot.spring.boot.support.LineBotServerArgumentProcessor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.method.support.HandlerMethodArgumentResolver;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//import java.util.List;
//
///**
// * Created by Film on 19/2/2560.
// */
//@Configuration
//public class LineBotWebMvcConfigurer extends WebMvcConfigurerAdapter {
//    @Autowired
//    private LineBotServerInterceptor lineBotServerInterceptor;
//    @Autowired
//    private LineBotServerArgumentProcessor lineBotServerArgumentProcessor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(lineBotServerInterceptor);
//    }
//
//    @Override
//    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
//        argumentResolvers.add(lineBotServerArgumentProcessor);
//    }
//}
