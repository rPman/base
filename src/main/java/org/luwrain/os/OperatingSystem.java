/*
   Copyright 2012-2016 Michael Pozhidaev <michael.pozhidaev@gmail.com>
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

package org.luwrain.os;

import java.io.File;
import org.luwrain.core.EventConsumer;
import org.luwrain.core.Registry;

public interface OperatingSystem
{
    String init(String dataDir);
    org.luwrain.hardware.Hardware getHardware();
    org.luwrain.speech.Channel loadSpeechChannel(String[] cmdLine, Registry registry, String path);
    void openFileInDesktop(File file);
    KeyboardHandler getCustomKeyboardHandler(String subsystem);
}
