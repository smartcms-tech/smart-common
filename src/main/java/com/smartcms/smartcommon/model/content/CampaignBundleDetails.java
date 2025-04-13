package com.smartcms.smartcommon.model.content;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CampaignBundleDetails implements ContentDetails {
    private String theme;
    private String description;
    private List<String> relatedContentIds; // references to other content
}

