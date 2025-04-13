package com.smartcms.smartcommon.model.content;

import com.smartcms.smartcommon.model.media.MediaReference;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContentBlock {
    private String type; // "text", "image", "cta", etc.
    private String content;
    private MediaReference media; // Optional (for CTA or image)
}

