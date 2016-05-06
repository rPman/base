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

import java.awt.Rectangle;

public interface ElementIterator
{
    int getPos();
    String getType();
    String getText();
    String[] getMultipleText();
    String getComputedText();
    String getLink();
    Rectangle getRect();
    boolean isEditable();
    void setText(String text);
    String getAttributeProperty(String name);
    String getComputedStyleProperty(final String name);
    String getComputedStyleAll();
    void clickEmulate();
    boolean isChangedAround(Selector selector, int pos, int count);
    ElementIterator getParent();
    SelectorChildren getChildren(boolean visible);
    boolean isVisible();
    boolean forTEXT();
    ElementIterator clone();
}