package com.smartcms.smartcommon.model.content;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PromotionalEmailContent implements ContentDetails {
    private String subject;
    private String preHeaderText;
    private String htmlContent;
    private String plainTextContent;
    private String discountCode;
    private Instant offerExpiry;
    private CallToAction callToAction;
    private EmailHeaderFooter headerFooter;
}

