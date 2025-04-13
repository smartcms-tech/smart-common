package com.smartcms.smartcommon.model.content;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CallToAction {
    private String text;
    private String url;
    private String buttonColor;
    private String buttonStyle;
}
