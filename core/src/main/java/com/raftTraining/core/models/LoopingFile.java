package com.raftTraining.core.models;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;


@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class LoopingFile {
	
    @ValueMapValue
	 private String type ;
	 
	 
	public String getType() {
		return type;
	}
	
	@ValueMapValue
	 private String name ;
	
	public String getName() {
		return name;
	}
	
	@ValueMapValue
	 private String description ;
	

	public String getDescription() {
		return description;
	}

	@ValueMapValue
	 private String image ;


	public String getImage() {
		return image;
	}

}
