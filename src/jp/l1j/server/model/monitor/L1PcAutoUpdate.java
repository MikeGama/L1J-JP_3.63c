/*
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

package jp.l1j.server.model.monitor;

import jp.l1j.server.model.instance.L1PcInstance;

public class L1PcAutoUpdate extends L1PcMonitor {

	public L1PcAutoUpdate(int oId) {
		super(oId);
	}

	@Override
	public void execTask(L1PcInstance pc) {
		pc.updateObject();
	}
}
