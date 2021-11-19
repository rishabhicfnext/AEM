package com.icf.bootcamp.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AssignmentModel {

    @ChildResource
    private List<AssignmentComponent> bookdetailswithmap;

    public List<AssignmentComponent> getBookdetailswithmap() {
        return bookdetailswithmap;
    }

}
