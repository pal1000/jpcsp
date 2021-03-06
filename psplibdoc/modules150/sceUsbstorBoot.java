/* This autogenerated file is part of jpcsp. */
/*
This file is part of jpcsp.

Jpcsp is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Jpcsp is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Jpcsp.  If not, see <http://www.gnu.org/licenses/>.
 */

package jpcsp.HLE.modules150;

import jpcsp.HLE.Modules;
import jpcsp.HLE.modules.HLEModule;
import jpcsp.HLE.modules.HLEModuleFunction;
import jpcsp.HLE.modules.HLEModuleManager;

import jpcsp.Memory;
import jpcsp.Processor;

import jpcsp.Allegrex.CpuState; // New-Style Processor

public class sceUsbstorBoot implements HLEModule {
	@Override
	public String getName() { return "sceUsbstorBoot"; }
	
	@Override
	public void installModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.addFunction(sceUsbstorBootSetCapacityFunction, 0xE58818A8);
			mm.addFunction(sceUsbstorBootSetLoadAddrFunction, 0x594BBF95);
			mm.addFunction(sceUsbstorBootGetDataSizeFunction, 0x6D865ECD);
			mm.addFunction(sceUsbstorBootSetStatusFunction, 0xA1119F0D);
			mm.addFunction(sceUsbstorBootRegisterNotifyFunction, 0x1F080078);
			mm.addFunction(sceUsbstorBootUnregisterNotifyFunction, 0xA55C9E16);
			
		}
	}
	
	@Override
	public void uninstallModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.removeFunction(sceUsbstorBootSetCapacityFunction);
			mm.removeFunction(sceUsbstorBootSetLoadAddrFunction);
			mm.removeFunction(sceUsbstorBootGetDataSizeFunction);
			mm.removeFunction(sceUsbstorBootSetStatusFunction);
			mm.removeFunction(sceUsbstorBootRegisterNotifyFunction);
			mm.removeFunction(sceUsbstorBootUnregisterNotifyFunction);
			
		}
	}
	
	
	public void sceUsbstorBootSetCapacity(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceUsbstorBootSetCapacity [0xE58818A8]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceUsbstorBootSetLoadAddr(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceUsbstorBootSetLoadAddr [0x594BBF95]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceUsbstorBootGetDataSize(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceUsbstorBootGetDataSize [0x6D865ECD]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceUsbstorBootSetStatus(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceUsbstorBootSetStatus [0xA1119F0D]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceUsbstorBootRegisterNotify(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceUsbstorBootRegisterNotify [0x1F080078]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceUsbstorBootUnregisterNotify(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceUsbstorBootUnregisterNotify [0xA55C9E16]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public final HLEModuleFunction sceUsbstorBootSetCapacityFunction = new HLEModuleFunction("sceUsbstorBoot", "sceUsbstorBootSetCapacity") {
		@Override
		public final void execute(Processor processor) {
			sceUsbstorBootSetCapacity(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceUsbstorBootModule.sceUsbstorBootSetCapacity(processor);";
		}
	};
    
	public final HLEModuleFunction sceUsbstorBootSetLoadAddrFunction = new HLEModuleFunction("sceUsbstorBoot", "sceUsbstorBootSetLoadAddr") {
		@Override
		public final void execute(Processor processor) {
			sceUsbstorBootSetLoadAddr(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceUsbstorBootModule.sceUsbstorBootSetLoadAddr(processor);";
		}
	};
    
	public final HLEModuleFunction sceUsbstorBootGetDataSizeFunction = new HLEModuleFunction("sceUsbstorBoot", "sceUsbstorBootGetDataSize") {
		@Override
		public final void execute(Processor processor) {
			sceUsbstorBootGetDataSize(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceUsbstorBootModule.sceUsbstorBootGetDataSize(processor);";
		}
	};
    
	public final HLEModuleFunction sceUsbstorBootSetStatusFunction = new HLEModuleFunction("sceUsbstorBoot", "sceUsbstorBootSetStatus") {
		@Override
		public final void execute(Processor processor) {
			sceUsbstorBootSetStatus(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceUsbstorBootModule.sceUsbstorBootSetStatus(processor);";
		}
	};
    
	public final HLEModuleFunction sceUsbstorBootRegisterNotifyFunction = new HLEModuleFunction("sceUsbstorBoot", "sceUsbstorBootRegisterNotify") {
		@Override
		public final void execute(Processor processor) {
			sceUsbstorBootRegisterNotify(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceUsbstorBootModule.sceUsbstorBootRegisterNotify(processor);";
		}
	};
    
	public final HLEModuleFunction sceUsbstorBootUnregisterNotifyFunction = new HLEModuleFunction("sceUsbstorBoot", "sceUsbstorBootUnregisterNotify") {
		@Override
		public final void execute(Processor processor) {
			sceUsbstorBootUnregisterNotify(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceUsbstorBootModule.sceUsbstorBootUnregisterNotify(processor);";
		}
	};
    
};
