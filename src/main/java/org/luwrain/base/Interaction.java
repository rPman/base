/*
   Copyright 2012-2017 Michael Pozhidaev <michael.pozhidaev@gmail.com>
   Copyright 2015-2016 Roman Volovodov <gr.rPman@gmail.com>

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

package org.luwrain.base;

import org.luwrain.browser.Browser;

public interface Interaction
{
    boolean init(InteractionParams params,OperatingSystem os);
    void close();
    void startInputEventsAccepting(EventConsumer eventConsumer);
    void stopInputEventsAccepting();
    boolean setDesirableFontSize(int size);
    int getFontSize();
    int getWidthInCharacters();
    int getHeightInCharacters();
    void startDrawSession();
    void clearRect(int left, int top, int right, int bottom);
    void drawText(int x, int y, String text);
	void drawText(int x,int y,String text,boolean font2);
    void endDrawSession();
    void setHotPoint(int x, int y);
    void drawVerticalLine(int top, int bottom, int x);
    void drawHorizontalLine(int left, int right, int y);
    Browser createBrowser();
}
