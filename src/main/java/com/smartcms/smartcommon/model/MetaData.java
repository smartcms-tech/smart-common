package com.smartcms.smartcommon.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MetaData {
    private String metaTitle;
    private String metaDescription;
    private List<String> metaKeywords;
    private String canonicalUrl;
    private String ogTitle;
    private String ogDescription;
    private String twitterTitle;
    private String twitterDescription;
    private String robots;
    private String structuredData;
}
