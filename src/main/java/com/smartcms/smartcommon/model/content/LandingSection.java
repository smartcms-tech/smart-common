package com.smartcms.smartcommon.model.content;

import com.smartcms.smartcommon.model.media.MediaReference;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class LandingSection {
    private String sectionType;
    private String content;
    private List<MediaReference> media;
    private String backgroundColor;
    private String textColor;
}

