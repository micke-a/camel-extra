/**************************************************************************************
 http://code.google.com/a/apache-extras.org/p/camel-extra

 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License
 as published by the Free Software Foundation; either version 2
 of the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.


 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 02110-1301, USA.

 http://www.gnu.org/licenses/gpl-2.0-standalone.html
 ***************************************************************************************/
package org.apacheextras.camel.component.virtualbox.command.handlers;

import org.apacheextras.camel.component.virtualbox.command.MachineAwareVirtualBoxCommand;
import org.apacheextras.camel.component.virtualbox.command.NoReturnValue;

public class SetBiosSystemTimeOffsetCommand extends MachineAwareVirtualBoxCommand<NoReturnValue> {

    public static final String HEADER_OFFSET = "VIRTUALBOX_BIOS_SYSTEM_TIME_OFFSET";

    private final long offset;

    public SetBiosSystemTimeOffsetCommand(String machineName, long offset) {
        super(machineName);
        this.offset = offset;
    }

    public long offset() {
        return offset;
    }

}
