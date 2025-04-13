package com.smartcms.smartcommon.model.account;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDetails {

    public UserDetails(String userId) {
        this.userId = userId;
    }

    private String userId;
    private String name;
    private String email;
}
