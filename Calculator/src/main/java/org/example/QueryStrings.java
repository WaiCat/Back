package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueryStrings {

    private List<QueryString> queryStrings = new ArrayList<>();

    public QueryStrings(String queryStringsLine) {
        String[] queryStringTokens =  queryStringsLine.split("&");
        Arrays.stream(queryStringTokens)
                .forEach(queryString -> {
                    String[] values = queryString.split("=");
                    if(values.length != 2) {
                        throw new IllegalArgumentException("잘못된 쿼리 스트링 입니다.");
                    }
                    queryStrings.add(new QueryString(values[0], values[1]));
                });
    }

    public String getValue(String key) {
        return queryStrings.stream()
               .filter(queryString -> queryString.exists(key))
               .map(QueryString::getValue)
                .findFirst()
                .orElse(null);
    }
}
