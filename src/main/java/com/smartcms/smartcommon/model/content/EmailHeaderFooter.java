package com.smartcms.smartcommon.model.content;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmailHeaderFooter {
    private String headerHtml;
    private String footerHtml;
    private String unsubscribeLink;
}