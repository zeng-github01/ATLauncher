/*
 * ATLauncher - https://github.com/ATLauncher/ATLauncher
 * Copyright (C) 2013-2021 ATLauncher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.atlauncher.data.installables;

import com.atlauncher.data.Pack;
import com.atlauncher.data.PackVersion;
import com.atlauncher.data.minecraft.VersionManifestVersion;
import com.atlauncher.data.minecraft.loaders.LoaderVersion;

public class VanillaInstallable extends ATLauncherFormatInstallable {
    public VanillaInstallable(VersionManifestVersion minecraftVersion, LoaderVersion loaderVersion) {
        super();

        this.pack = new Pack();
        this.pack._new = true;
        this.pack.name = "Vanilla Minecraft";
        this.pack.description = "Vanilla Minecraft";

        this.packVersion = new PackVersion();
        this.packVersion.version = minecraftVersion.id;
        this.packVersion.minecraftVersion = minecraftVersion;
        this.packVersion.hasLoader = loaderVersion != null;

        this.loaderVersion = loaderVersion;
    }
}
