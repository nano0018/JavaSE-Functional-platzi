package com.platzi.jobsearch.api;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class JobPosition {
    private String id;

    private String type;

    private String url;

    @SerializedName("created_at")
    private String createdAt;

    private String company;

    @SerializedName("company_url")
    private String companyUrl;

    private String title;

    private String location;

    private String description;

    @SerializedName("company_logo")
    private String companyLogo;

}
