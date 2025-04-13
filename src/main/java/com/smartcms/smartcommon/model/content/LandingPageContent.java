package com.smartcms.smartcommon.model.content;

import com.smartcms.smartcommon.model.MetaData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LandingPageContent implements ContentDetails {
    private String slug;
    private String heroTitle;
    private String heroSubtitle;
    private List<LandingSection> sections;
    private CallToAction primaryCTA;
    private CallToAction secondaryCTA;
    private MetaData metaData;
}

