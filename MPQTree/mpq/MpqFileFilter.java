/*
 * Copyright (C) 2011 Thedeath<www.fseek.org>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package mpq;

import java.io.File;
import java.io.FileFilter;

public class MpqFileFilter implements FileFilter
{
    private boolean includeDirs;
    public MpqFileFilter()
    {
        this(false);
    }
    
    public MpqFileFilter(boolean includeDirs)
    {
        this.includeDirs = includeDirs;
    }
    
    @Override
    public boolean accept(File pathname)
    {
        String name = pathname.getName();
        if(includeDirs == false)
        {
           if(name.toLowerCase().endsWith(".mpq"))
           {
               return true;
           }
        }
        else
        {
           if(name.toLowerCase().endsWith(".mpq") || pathname.isDirectory())
           {
               return true;
           }
        }
        return false;
    }
}
