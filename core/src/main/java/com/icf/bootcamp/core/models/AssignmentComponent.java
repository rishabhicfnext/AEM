package com.icf.bootcamp.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AssignmentComponent {

    @Inject
    private  String imagename;

    @Inject
    private  String imagedescription;

    @Inject
    private  String link;

    public String getImagename() {
        return imagename;
    }

    public String getImagedescription() {
        return imagedescription;
    }

    public String getLink() {
        return link;
    }
}
