package com.smartcms.smartcommon.model;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrgDetails {
    private String orgId;
    private String orgName;

    public OrgDetails(String orgId) {
        this.orgId = orgId;
    }
}