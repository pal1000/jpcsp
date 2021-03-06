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

public class sceAudio implements HLEModule {
	@Override
	public String getName() { return "sceAudio"; }
	
	@Override
	public void installModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.addFunction(sceAudioOutputFunction, 0x8C1009B2);
			mm.addFunction(sceAudioOutputBlockingFunction, 0x136CAF51);
			mm.addFunction(sceAudioOutputPannedFunction, 0xE2D56B2D);
			mm.addFunction(sceAudioOutputPannedBlockingFunction, 0x13F592BC);
			mm.addFunction(sceAudioChReserveFunction, 0x5EC81C55);
			mm.addFunction(sceAudioOneshotOutputFunction, 0x41EFADE7);
			mm.addFunction(sceAudioChReleaseFunction, 0x6FC46853);
			mm.addFunction(sceAudioGetChannelRestLengthFunction, 0xB011922F);
			mm.addFunction(sceAudioSetChannelDataLenFunction, 0xCB2E439E);
			mm.addFunction(sceAudioChangeChannelConfigFunction, 0x95FD0C2D);
			mm.addFunction(sceAudioChangeChannelVolumeFunction, 0xB7E1D8E7);
			mm.addFunction(sceAudioSRCChReserveFunction, 0x38553111);
			mm.addFunction(sceAudioSRCChReleaseFunction, 0x5C37C0AE);
			mm.addFunction(sceAudioSRCOutputBlockingFunction, 0xE0727056);
			mm.addFunction(sceAudioInputBlockingFunction, 0x086E5895);
			mm.addFunction(sceAudioInputFunction, 0x6D4BEC68);
			mm.addFunction(sceAudioGetInputLengthFunction, 0xA708C6A6);
			mm.addFunction(sceAudioWaitInputEndFunction, 0x87B2E651);
			mm.addFunction(sceAudioInputInitFunction, 0x7DE61688);
			mm.addFunction(sceAudioInputInitExFunction, 0xE926D3FB);
			mm.addFunction(sceAudioPollInputEndFunction, 0xA633048E);
			mm.addFunction(sceAudioGetChannelRestLenFunction, 0xE9D97901);
			
		}
	}
	
	@Override
	public void uninstallModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.removeFunction(sceAudioOutputFunction);
			mm.removeFunction(sceAudioOutputBlockingFunction);
			mm.removeFunction(sceAudioOutputPannedFunction);
			mm.removeFunction(sceAudioOutputPannedBlockingFunction);
			mm.removeFunction(sceAudioChReserveFunction);
			mm.removeFunction(sceAudioOneshotOutputFunction);
			mm.removeFunction(sceAudioChReleaseFunction);
			mm.removeFunction(sceAudioGetChannelRestLengthFunction);
			mm.removeFunction(sceAudioSetChannelDataLenFunction);
			mm.removeFunction(sceAudioChangeChannelConfigFunction);
			mm.removeFunction(sceAudioChangeChannelVolumeFunction);
			mm.removeFunction(sceAudioSRCChReserveFunction);
			mm.removeFunction(sceAudioSRCChReleaseFunction);
			mm.removeFunction(sceAudioSRCOutputBlockingFunction);
			mm.removeFunction(sceAudioInputBlockingFunction);
			mm.removeFunction(sceAudioInputFunction);
			mm.removeFunction(sceAudioGetInputLengthFunction);
			mm.removeFunction(sceAudioWaitInputEndFunction);
			mm.removeFunction(sceAudioInputInitFunction);
			mm.removeFunction(sceAudioInputInitExFunction);
			mm.removeFunction(sceAudioPollInputEndFunction);
			mm.removeFunction(sceAudioGetChannelRestLenFunction);
			
		}
	}
	
	
	public void sceAudioOutput(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioOutput [0x8C1009B2]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioOutputBlocking(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioOutputBlocking [0x136CAF51]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioOutputPanned(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioOutputPanned [0xE2D56B2D]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioOutputPannedBlocking(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioOutputPannedBlocking [0x13F592BC]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioChReserve(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioChReserve [0x5EC81C55]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioOneshotOutput(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioOneshotOutput [0x41EFADE7]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioChRelease(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioChRelease [0x6FC46853]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioGetChannelRestLength(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioGetChannelRestLength [0xB011922F]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioSetChannelDataLen(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioSetChannelDataLen [0xCB2E439E]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioChangeChannelConfig(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioChangeChannelConfig [0x95FD0C2D]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioChangeChannelVolume(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioChangeChannelVolume [0xB7E1D8E7]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioSRCChReserve(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioSRCChReserve [0x38553111]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioSRCChRelease(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioSRCChRelease [0x5C37C0AE]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioSRCOutputBlocking(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioSRCOutputBlocking [0xE0727056]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioInputBlocking(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioInputBlocking [0x086E5895]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioInput(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioInput [0x6D4BEC68]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioGetInputLength(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioGetInputLength [0xA708C6A6]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioWaitInputEnd(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioWaitInputEnd [0x87B2E651]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioInputInit(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioInputInit [0x7DE61688]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioInputInitEx(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioInputInitEx [0xE926D3FB]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioPollInputEnd(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioPollInputEnd [0xA633048E]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudioGetChannelRestLen(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudioGetChannelRestLen [0xE9D97901]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public final HLEModuleFunction sceAudioOutputFunction = new HLEModuleFunction("sceAudio", "sceAudioOutput") {
		@Override
		public final void execute(Processor processor) {
			sceAudioOutput(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioOutput(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioOutputBlockingFunction = new HLEModuleFunction("sceAudio", "sceAudioOutputBlocking") {
		@Override
		public final void execute(Processor processor) {
			sceAudioOutputBlocking(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioOutputBlocking(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioOutputPannedFunction = new HLEModuleFunction("sceAudio", "sceAudioOutputPanned") {
		@Override
		public final void execute(Processor processor) {
			sceAudioOutputPanned(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioOutputPanned(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioOutputPannedBlockingFunction = new HLEModuleFunction("sceAudio", "sceAudioOutputPannedBlocking") {
		@Override
		public final void execute(Processor processor) {
			sceAudioOutputPannedBlocking(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioOutputPannedBlocking(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioChReserveFunction = new HLEModuleFunction("sceAudio", "sceAudioChReserve") {
		@Override
		public final void execute(Processor processor) {
			sceAudioChReserve(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioChReserve(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioOneshotOutputFunction = new HLEModuleFunction("sceAudio", "sceAudioOneshotOutput") {
		@Override
		public final void execute(Processor processor) {
			sceAudioOneshotOutput(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioOneshotOutput(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioChReleaseFunction = new HLEModuleFunction("sceAudio", "sceAudioChRelease") {
		@Override
		public final void execute(Processor processor) {
			sceAudioChRelease(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioChRelease(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioGetChannelRestLengthFunction = new HLEModuleFunction("sceAudio", "sceAudioGetChannelRestLength") {
		@Override
		public final void execute(Processor processor) {
			sceAudioGetChannelRestLength(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioGetChannelRestLength(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioSetChannelDataLenFunction = new HLEModuleFunction("sceAudio", "sceAudioSetChannelDataLen") {
		@Override
		public final void execute(Processor processor) {
			sceAudioSetChannelDataLen(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioSetChannelDataLen(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioChangeChannelConfigFunction = new HLEModuleFunction("sceAudio", "sceAudioChangeChannelConfig") {
		@Override
		public final void execute(Processor processor) {
			sceAudioChangeChannelConfig(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioChangeChannelConfig(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioChangeChannelVolumeFunction = new HLEModuleFunction("sceAudio", "sceAudioChangeChannelVolume") {
		@Override
		public final void execute(Processor processor) {
			sceAudioChangeChannelVolume(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioChangeChannelVolume(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioSRCChReserveFunction = new HLEModuleFunction("sceAudio", "sceAudioSRCChReserve") {
		@Override
		public final void execute(Processor processor) {
			sceAudioSRCChReserve(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioSRCChReserve(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioSRCChReleaseFunction = new HLEModuleFunction("sceAudio", "sceAudioSRCChRelease") {
		@Override
		public final void execute(Processor processor) {
			sceAudioSRCChRelease(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioSRCChRelease(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioSRCOutputBlockingFunction = new HLEModuleFunction("sceAudio", "sceAudioSRCOutputBlocking") {
		@Override
		public final void execute(Processor processor) {
			sceAudioSRCOutputBlocking(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioSRCOutputBlocking(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioInputBlockingFunction = new HLEModuleFunction("sceAudio", "sceAudioInputBlocking") {
		@Override
		public final void execute(Processor processor) {
			sceAudioInputBlocking(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioInputBlocking(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioInputFunction = new HLEModuleFunction("sceAudio", "sceAudioInput") {
		@Override
		public final void execute(Processor processor) {
			sceAudioInput(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioInput(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioGetInputLengthFunction = new HLEModuleFunction("sceAudio", "sceAudioGetInputLength") {
		@Override
		public final void execute(Processor processor) {
			sceAudioGetInputLength(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioGetInputLength(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioWaitInputEndFunction = new HLEModuleFunction("sceAudio", "sceAudioWaitInputEnd") {
		@Override
		public final void execute(Processor processor) {
			sceAudioWaitInputEnd(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioWaitInputEnd(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioInputInitFunction = new HLEModuleFunction("sceAudio", "sceAudioInputInit") {
		@Override
		public final void execute(Processor processor) {
			sceAudioInputInit(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioInputInit(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioInputInitExFunction = new HLEModuleFunction("sceAudio", "sceAudioInputInitEx") {
		@Override
		public final void execute(Processor processor) {
			sceAudioInputInitEx(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioInputInitEx(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioPollInputEndFunction = new HLEModuleFunction("sceAudio", "sceAudioPollInputEnd") {
		@Override
		public final void execute(Processor processor) {
			sceAudioPollInputEnd(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioPollInputEnd(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudioGetChannelRestLenFunction = new HLEModuleFunction("sceAudio", "sceAudioGetChannelRestLen") {
		@Override
		public final void execute(Processor processor) {
			sceAudioGetChannelRestLen(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudioModule.sceAudioGetChannelRestLen(processor);";
		}
	};
    
};
