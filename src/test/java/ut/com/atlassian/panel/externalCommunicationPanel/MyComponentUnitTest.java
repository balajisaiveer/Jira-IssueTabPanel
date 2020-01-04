package ut.com.atlassian.panel.externalCommunicationPanel;

import org.junit.Test;
import com.atlassian.panel.externalCommunicationPanel.api.MyPluginComponent;
import com.atlassian.panel.externalCommunicationPanel.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}