package com.smartcms.smartcommon.model.content;

import com.smartcms.smartcommon.model.media.MediaReference;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Section {
    private String heading;
    private String body;
    private List<MediaReference> media;
}
