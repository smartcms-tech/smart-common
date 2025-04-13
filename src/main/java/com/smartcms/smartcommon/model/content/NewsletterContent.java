package com.smartcms.smartcommon.model.content;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NewsletterContent implements ContentDetails {
    private String subject;
    private String htmlContent;
    private String preHeaderText;
    private List<String> targetSegments;
    private List<ContentBlock> blocks;
    private EmailHeaderFooter headerFooter;
}

