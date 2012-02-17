package com.example.horsite;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import com.vaadin.terminal.gwt.server.ApplicationServlet;
import java.io.BufferedWriter;


public class HorsiteApplicationServlet extends ApplicationServlet {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//This will go in the <head>
   @Override
   protected void writeAjaxPageHtmlHeader(final BufferedWriter page, String title, String themeUri,
           final HttpServletRequest request) throws IOException {
       //Don't forget to call super or nothing will work
       super.writeAjaxPageHtmlHeader(page, title, themeUri, request);
       page.append("<meta name=\"fragment\" content=\"!\">");
   }

 }

