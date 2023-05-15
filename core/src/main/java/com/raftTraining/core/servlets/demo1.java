//package com.raftTraining.core.servlets;
//
//
//import javax.jcr.Node;
//import org.apache.sling.api.SlingHttpServletRequest;
//import org.apache.sling.api.SlingHttpServletResponse;
//import org.apache.sling.api.resource.Resource;
//import org.apache.sling.api.resource.ResourceResolver;
//import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
//import org.apache.sling.commons.json.JSONException;
//import org.apache.sling.commons.json.jcr.JsonItemWriter;
//import org.json.simple.JSONObject;
//import org.osgi.service.component.annotations.Component;
//import org.osgi.service.log.LoggerFactory;
//
//import javax.servlet.Servlet;
//import javax.servlet.ServletException;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.io.StringWriter;
//import java.util.logging.Logger;
//import javax.jcr.RepositoryException;
//
//
//@Component(service= Servlet.class, immediate = true, property = {
//        "sling.servlet.paths="+"/bin/News"
//})
//public class demo1 {

//    public JSONObject resourceToJSON(SlingHttpServletRequest resolver, SlingHttpServletResponse resource){
//        final Node node = resource.adaptTo(Node.class);
//        final StringWriter stringWriter = new StringWriter();
//
//        final JsonItemWriter jsonWriter = new JsonItemWriter(null);
//
//       final JSONObject obj = null;
//
//        try {
//            /* Get JSON with no limit to recursion depth. */
//            jsonWriter.dump(node, stringWriter, -1);
//
//        } catch (RepositoryException | JSONException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
// }
//
//
//
