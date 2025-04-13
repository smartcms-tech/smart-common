package com.smartcms.smartcommon.model.media;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MediaReference {
    private String mediaId;
    private String url;
    private MediaType type;
    private boolean isAIGenerated;
    private boolean isPrimary;
}
