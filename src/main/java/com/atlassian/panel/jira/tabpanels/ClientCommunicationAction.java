
package com.atlassian.panel.jira.tabpanels;

import com.atlassian.jira.plugin.issuetabpanel.AbstractIssueAction;
import com.atlassian.jira.plugin.issuetabpanel.IssueTabPanelModuleDescriptor;
import com.atlassian.jira.security.JiraAuthenticationContext;

import java.util.Date;
import java.util.Map;

public class ClientCommunicationAction extends AbstractIssueAction {
    private final JiraAuthenticationContext authenticationContext;

    public ClientCommunicationAction(IssueTabPanelModuleDescriptor descriptor, JiraAuthenticationContext authenticationContext){
        super(descriptor);
        this.authenticationContext = authenticationContext;
    }

    @Override
    public Date getTimePerformed() {
        return new Date();
    }

    @Override
    protected void populateVelocityParams(Map params) {
        params.put("user", this.authenticationContext.getUser().getName());
    }
}
