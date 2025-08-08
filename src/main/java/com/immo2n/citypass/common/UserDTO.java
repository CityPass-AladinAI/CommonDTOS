package com.immo2n.citypass.common;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDTO {

    private String fullName;
    private String email;
    private String phone;
    private LocalDate birthday;
    private String gender;
    private String image;
    private String telephone;
    private String address;
    private boolean otpVerified;
    private SocialLink facebookLink;
    private SocialLink linkedinLink;
    private boolean neededProfileSetup;

    @Data
    public static class SocialLink {
        private String name;
        private String url;
    }
}
