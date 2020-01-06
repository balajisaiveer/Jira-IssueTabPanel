
package com.atlassian.panel.jira.tabpanels;

import com.atlassian.jira.issue.Issue;
import com.atlassian.jira.plugin.issuetabpanel.AbstractIssueAction;
import com.atlassian.jira.plugin.issuetabpanel.IssueTabPanelModuleDescriptor;
import com.atlassian.jira.security.JiraAuthenticationContext;

import java.util.Date;
import java.util.Map;

public class ClientCommunicationAction extends AbstractIssueAction {
    private final JiraAuthenticationContext authenticationContext;
    String summary;

    public ClientCommunicationAction(IssueTabPanelModuleDescriptor descriptor, JiraAuthenticationContext authenticationContext, Issue issue){

        super(descriptor);
        this.authenticationContext = authenticationContext;
        this.summary = issue.getSummary();
    }

    @Override
    public Date getTimePerformed() {
        return new Date();
    }

    @Override
    protected void populateVelocityParams(Map params) {
        params.put("user", this.authenticationContext.getUser().getName());
        params.put("summary",this.summary);
        System.out.println(this.authenticationContext.getUser().getName());
        System.out.println("--------------------------SUMMARY--------------");
        System.out.println(summary);
        System.out.println("--------------------------SUMMARY--------------");
//        params.put("summary",summary);
    }
}
