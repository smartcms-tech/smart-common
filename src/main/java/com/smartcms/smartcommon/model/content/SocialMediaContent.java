package com.smartcms.smartcommon.model.content;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.smartcms.smartcommon.model.media.MediaReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SocialMediaContent implements ContentDetails {
    private SocialPlatform platform;
    private String caption;
    private List<String> hashtags;
    private List<MediaReference> media;
    private List<String> mentions;
    @JsonIgnore
    private Map<String, Object> platformSpecificFields;
}

