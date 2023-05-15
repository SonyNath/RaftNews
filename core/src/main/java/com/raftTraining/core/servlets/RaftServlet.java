package com.raftTraining.core.servlets;

import javax.jcr.Node;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.jcr.JsonItemWriter;
import org.osgi.service.component.annotations.Component;

import javax.jcr.RepositoryException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;


@Component(service=Servlet.class, immediate = true, property = {
		"sling.servlet.paths="+"/bin/raftnews"
})
public class RaftServlet extends SlingSafeMethodsServlet {

@Override

protected void doGet(SlingHttpServletRequest req, SlingHttpServletResponse res) throws ServletException, IOException {

	res.setContentType("application/json");
	res.setCharacterEncoding("UTF-8");
	PrintWriter out = res.getWriter();
	ResourceResolver resourceResolver = req.getResourceResolver();
	Resource resource = resourceResolver.getResource("/content/raftTraining/us/raft-news/jcr:content");
	Node node = resource.adaptTo(Node.class);
	JsonItemWriter jsonWriter = new JsonItemWriter(null);

	try {
		jsonWriter.dump(node,out,1,true);
	}
 	catch (JSONException | RepositoryException e) {
		throw new RuntimeException(e);
	}
}
}

