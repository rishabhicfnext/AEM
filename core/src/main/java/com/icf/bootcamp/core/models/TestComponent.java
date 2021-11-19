package com.icf.bootcamp.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TestComponent {

    @Inject
    private  String bookname;

    @Inject
    private  String booksubject;

    @Inject
    private  String publishyear;

    public String getBookname() {
        return bookname;
    }

    public String getBooksubject() {
        return booksubject;
    }

    public String getPublishyear() {
        return publishyear;
    }
}
