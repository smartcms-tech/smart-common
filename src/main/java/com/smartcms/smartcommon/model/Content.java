package com.smartcms.smartcommon.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;
import java.util.List;

@Document(collection = "content")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@CompoundIndex(name = "unique_slug_per_org", def = "{'orgDetails.orgId': 1, 'slug': 1}", unique = true)
public class Content {
    @Id
    private String id;
    private String title;
    private String slug;
    private List<String> tags;
    private String description;
    private String body;
    private ContentStatus status;
    private UserDetails author;
    private OrgDetails orgDetails;
    private Instant createdAt;
    private Instant updatedAt;
    private int version;
    private UserDetails lastUpdatedBy;
    private ContentType contentType;
    private MetaData meta;
    private Instant scheduledPublishAt;
    private Instant deletedAt;
    private AIInsights aiInsights;
    private List<MediaReference> mediaReferences;
}
