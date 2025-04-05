package com.smartcms.smartcommon.model;

import lombok.*;

@Getter
@Setter
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
