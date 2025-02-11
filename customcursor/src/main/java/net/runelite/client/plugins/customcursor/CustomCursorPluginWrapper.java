package net.runelite.client.plugins.customcursor;

import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomCursorPluginWrapper extends Plugin
{
	private static final Logger logger = LoggerFactory.getLogger(net.runelite.client.plugins.customcursor.CustomCursorPluginWrapper.class);

	public CustomCursorPluginWrapper(PluginWrapper wrapper)
	{
		super(wrapper);
	}
}
