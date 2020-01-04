package com.atlassian.panel.jira.tabpanels;

import com.atlassian.jira.component.ComponentAccessor;
import com.atlassian.jira.security.JiraAuthenticationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.jira.plugin.issuetabpanel.AbstractIssueTabPanel;
import com.atlassian.jira.plugin.issuetabpanel.IssueTabPanel;
import com.atlassian.jira.issue.tabpanels.GenericMessageAction;
import com.atlassian.jira.issue.Issue;
//import com.opensymphony.user.User;
//import com.atlassian.crowd.embedded.api.User;
import com.atlassian.jira.user.ApplicationUser;
import com.atlassian.jira.security.JiraAuthenticationContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientCommunication extends AbstractIssueTabPanel implements IssueTabPanel{
    private static final Logger log = LoggerFactory.getLogger(ClientCommunication.class);
    public List getActions(Issue issue, ApplicationUser remoteUser) {
        List<ClientCommunicationAction> panelActions = new ArrayList<ClientCommunicationAction>();
        panelActions.add(new ClientCommunicationAction(descriptor, ComponentAccessor.getJiraAuthenticationContext()));
        return panelActions;

//        return Collections.singletonList(new GenericMessageAction("This is a message brought to you by the Client Communication"));
    }

    public boolean showPanel(Issue issue, ApplicationUser remoteUser)
    {
        return true;
    }
}
