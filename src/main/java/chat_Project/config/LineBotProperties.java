//package chat_Project.config;
//
//import com.linecorp.bot.client.LineMessagingServiceBuilder;
//import com.linecorp.bot.spring.boot.annotation.EventMapping;
//import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;
//import lombok.Data;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//
//import javax.validation.Valid;
//import javax.validation.constraints.NotNull;
//import java.net.URI;
//
///**
// * Created by Film on 19/2/2560.
// */
//@Data
//@ConfigurationProperties(prefix = "line.bot")
//public class LineBotProperties {
//    /**
//     * Channel acccess token.
//     */
//    @Valid
//    @NotNull
//    private String channelToken;
//
//    /**
//     * Channel secret
//     */
//    @Valid
//    @NotNull
//    private String channelSecret;
//
//    @Valid
//    @NotNull
//    private String apiEndPoint = LineMessagingServiceBuilder.DEFAULT_API_END_POINT;
//
//    /**
//     * Connection timeout in milliseconds
//     */
//    @Valid
//    @NotNull
//    private long connectTimeout = LineMessagingServiceBuilder.DEFAULT_CONNECT_TIMEOUT;
//
//    /**
//     * Read timeout in milliseconds
//     */
//    @Valid
//    @NotNull
//    private long readTimeout = LineMessagingServiceBuilder.DEFAULT_READ_TIMEOUT;
//
//    /**
//     * Write timeout in milliseconds
//     */
//    @Valid
//    @NotNull
//    private long writeTimeout = LineMessagingServiceBuilder.DEFAULT_WRITE_TIMEOUT;
//
//    /**
//     * Configuration for {@link LineMessageHandler} and {@link EventMapping}.
//     */
//    @Valid
//    @NotNull
//    private Handler handler = new Handler();
//
//    @Data
//    public static class Handler {
//        /**
//         * Flag to enable/disable {@link LineMessageHandler} and {@link EventMapping}.
//         * <p>
//         * Default: {@code true}
//         */
//        boolean enabled = true;
//
//        /**
//         * REST endpoint path of dispatcher.
//         */
//        @NotNull
//        URI path = URI.create("/callback");
//    }
//}
