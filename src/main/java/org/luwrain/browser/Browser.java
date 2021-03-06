/*
   Copyright 2015 Roman Volovodov <gr.rPman@gmail.com>
   Copyright 2012-2015 Michael Pozhidaev <michael.pozhidaev@gmail.com>

   This file is part of the LUWRAIN.

   LUWRAIN is free software; you can redistribute it and/or
   modify it under the terms of the GNU General Public
   License as published by the Free Software Foundation; either
   version 3 of the License, or (at your option) any later version.

   LUWRAIN is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
   General Public License for more details.
*/

package org.luwrain.browser;

import java.util.LinkedHashMap;
import java.util.Vector;

import org.w3c.dom.Node;

public interface Browser
{
    String getTitle();
    String getUrl();
    int numElements();

    void init(Events events);
    void Remove();
    void setVisibility(boolean enable);
    boolean getVisibility();

    void RescanDOM();
    void load(String link);
    void loadContent(String text);
    void stop();
    Object executeScript(String script);
    boolean isBusy();

    ElementIterator iterator();
	Vector<NodeInfo> getDOMList();
	LinkedHashMap<Node,Integer> getDOMmap();
	/** update watch array of node's indexes in dom list to observe page modification */
	void setWatchNodes(Iterable<Integer> indexes);
	/** restart update timer as fast as possble */
	void doFastUpdate();
	long getLastTimeChanged();
}
