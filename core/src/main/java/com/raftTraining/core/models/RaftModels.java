package com.raftTraining.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class RaftModels {
	 @Inject
	 private String type ;
	 
	 
	public String getType() {
		return type;
	}
	
	@Inject
	 private String name ;
	
	public String getName() {
		return name;
	}
	
	@Inject
	 private String description ;
	

	public String getDescription() {
		return description;
	}

	@Inject
	 private String image ;


	public String getImage() {
		return image;
	}
	
	 @ChildResource
	    private List<LoopingFile> newsMultifield;

		public List<LoopingFile> getNewsMultifield() {
			return newsMultifield;
		}


}
