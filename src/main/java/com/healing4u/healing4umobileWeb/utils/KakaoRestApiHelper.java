package com.healing4u.healing4umobileWeb.utils;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.http.RequestEntity;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//import java.net.URI;
//import java.net.URLEncoder;
//
//참고)
// 내 rest api ; eb0938f0aae67e229b135855b7589316
// 카카오api: https://developers.kakao.com/docs/latest/ko/local/dev-guide#search-by-keyword
// 참고 블로그 : https://eastglow.github.io/back-end/2019/09/01/Spring-RestTemplate를-이용하여-카카오-API-사용하기-(2).html
// 위의 깃허브 : https://github.com/eastglow/spring-boot-kakao-api-sample/blob/master/src/main/java/me/eastglow/controller/SearchController.java#L28
//@Slf4j
//@Component
//public class KakaoRestApiHelper {
//    @Value("${kakao.restapi.key}")
//    private String restApiKey;
//
//    private static final String API_SERVER_HOST  = "https://dapi.kakao.com";
//    private static final String SEARCH_PLACE_KEYWORD_PATH = "/v2/local/search/address.json";
//
//    public ResponseEntity<String> getSearchPlaceByKeyword(SearchVO searchVO) throws Exception {
//        String queryString = "?query="+ URLEncoder.encode(searchVO.getKeywordNm(), "UTF-8")+"&page="+searchVO.getCurrentPage()+"&size="+searchVO.getPageSize();
//        RestTemplate restTemplate = new RestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//
//        headers.add("Authorization", "KakaoAK " + restApiKey);
//        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
//        headers.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED_VALUE + ";charset=UTF-8");
//
//        URI url = URI.create(API_SERVER_HOST+SEARCH_PLACE_KEYWORD_PATH+queryString);
//        RequestEntity<String> rq = new RequestEntity<>(headers, HttpMethod.GET, url);
//        ResponseEntity<String> re = restTemplate.exchange(rq, String.class);
//
//        return re;
//    }
//}