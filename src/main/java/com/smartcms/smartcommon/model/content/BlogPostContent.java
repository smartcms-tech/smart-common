package com.smartcms.smartcommon.model.content;

import com.smartcms.smartcommon.model.MetaData;
import com.smartcms.smartcommon.model.media.MediaReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BlogPostContent implements ContentDetails {
    private String slug;
    private String content; // Main HTML/markdown content
    private String excerpt;
    private MediaReference featuredImage;
    private List<Section> sections;
    private Integer readTime;
    private MetaData metaData;
}

