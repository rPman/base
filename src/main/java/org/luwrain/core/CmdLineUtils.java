/*
   Copyright 2012-2015 Michael Pozhidaev <msp@altlinux.org>

   This file is part of the Luwrain.

   Luwrain is free software; you can redistribute it and/or
   modify it under the terms of the GNU General Public
   License as published by the Free Software Foundation; either
   version 3 of the License, or (at your option) any later version.

   Luwrain is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
   General Public License for more details.
*/

package org.luwrain.core;

import java.util.*;

public class CmdLineUtils
{
    private String[] cmdLine;

    public CmdLineUtils(String[] cmdLine)
    {
	NullCheck.notNullItems(cmdLine, "cmdLine");
	this.cmdLine = cmdLine;
    }

    public boolean used(String option)
    {
	NullCheck.notNull(option, "option");
	for(String s: cmdLine)
	    if (s.equals(option))
		return true;
	return false;
    }

    public String getFirstArg(String prefix)
    {
	NullCheck.notNull(prefix, "prefix");
	for(String s: cmdLine)
	{
	    if (s.length() < prefix.length() || !s.startsWith(prefix))
		continue;
	    return s.substring(prefix.length());
	}
	return null;
    }

    public String[] getArgs(String prefix)
    {
	final LinkedList<String> res = new LinkedList<String>();
	NullCheck.notNull(prefix, "prefix");
	for(String s: cmdLine)
	{
	    if (s.length() < prefix.length() || !s.startsWith(prefix))
		continue;
	    res.add(s.substring(prefix.length()));
	}
	return res.toArray(new String[res.size()]);
    }
}