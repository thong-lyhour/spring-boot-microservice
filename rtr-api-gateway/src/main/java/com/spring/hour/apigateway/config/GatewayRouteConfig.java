//package training.micro.rtrapigateway.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class GatewayRouteConfig {
//
//    @Bean
//    public RouteLocator customRouterLocator(RouteLocatorBuilder builder) {
//        return builder
//                .routes()
//                .route("customer-service", predicateSpec -> predicateSpec
//                        .path("/cus/**")
//                        .filters(gatewayFilterSpec -> gatewayFilterSpec
//                                .rewritePath("/cus/(?<segment>.*)", "/api/${segment}"))
//                        .uri("lb://customer-service"))
//                .route("account-service", predicateSpec -> predicateSpec
//                        .path("/acc/**")
//                        .filters(gatewayFilterSpec -> gatewayFilterSpec
//                                .rewritePath("/acc/(?<segment>.*)", "/api/${segment}"))
//                        .uri("lb://account-service"))
//                .build();
//    }
//}
