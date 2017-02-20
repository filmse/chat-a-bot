//package chat_Project.config;
//
//import com.linecorp.bot.client.*;
//import com.linecorp.bot.servlet.LineBotCallbackRequestParser;
//import com.linecorp.bot.spring.boot.LineBotProperties;
//import com.linecorp.bot.spring.boot.LineBotWebMvcConfigurer;
//import com.linecorp.bot.spring.boot.interceptor.LineBotServerInterceptor;
//import com.linecorp.bot.spring.boot.support.LineBotServerArgumentProcessor;
//import com.linecorp.bot.spring.boot.support.LineMessageHandlerSupport;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//
//import java.nio.charset.StandardCharsets;
//
///**
// * Created by Film on 19/2/2560.
// */
//@Configuration
//@AutoConfigureAfter(LineBotWebMvcConfigurer.class)
//@EnableConfigurationProperties(LineBotProperties.class)
//@Import(LineMessageHandlerSupport.class)
//public class LineBotAutoConfiguration {
//    @Autowired
//    private LineBotProperties lineBotProperties;
//
//    @Bean
//    public LineMessagingService lineMessagingService() {
//        return LineMessagingServiceBuilder
//                .create(lineBotProperties.getChannelToken())
//                .apiEndPoint(lineBotProperties.getApiEndPoint())
//                .connectTimeout(lineBotProperties.getConnectTimeout())
//                .readTimeout(lineBotProperties.getReadTimeout())
//                .writeTimeout(lineBotProperties.getWriteTimeout())
//                .build();
//    }
//
//    @Bean
//    public LineMessagingClient lineMessagingClient(final LineMessagingService lineMessagingService) {
//        return new LineMessagingClientImpl(lineMessagingService);
//    }
//
//    @Bean
//    @ConditionalOnWebApplication
//    public LineBotServerArgumentProcessor lineBotServerArgumentProcessor() {
//        return new LineBotServerArgumentProcessor();
//    }
//
//    @Bean
//    @ConditionalOnWebApplication
//    public LineBotServerInterceptor lineBotServerInterceptor() {
//        return new LineBotServerInterceptor();
//    }
//
//    @Bean
//    @ConditionalOnWebApplication
//    public LineSignatureValidator lineSignatureValidator() {
//        return new LineSignatureValidator(
//                lineBotProperties.getChannelSecret().getBytes(StandardCharsets.US_ASCII));
//    }
//
//    @Bean
//    @ConditionalOnWebApplication
//    public LineBotCallbackRequestParser lineBotCallbackRequestParser(
//            LineSignatureValidator lineSignatureValidator) {
//        return new LineBotCallbackRequestParser(lineSignatureValidator);
//    }
//}
