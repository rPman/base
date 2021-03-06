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

import java.io.File;

public interface Hardware
{
    SysDevice[] getSysDevices();
    StorageDevice[] getStorageDevices();
    int mountAllPartitions(StorageDevice device);
    int umountAllPartitions(StorageDevice device);
    Partition[] getMountedPartitions();
    //    File getRoot(File relativeTo);
    AudioMixer getAudioMixer();
    Battery[] getBatteries();
}
