import java.util.*;
public class CPU{
	double price;
	public class Processor
	{
		int cores;
		String manufacturer;
		void info(int c,String m)
		{
			cores=c;
			manufacturer=m;
			System.out.println("\n__PROCESSOR INFORMATION__");
			System.out.println("No. of Cores+\n"+"Manufacturer Name="+manufacturer);
		}
	}
static class RAM
{
	double memory;
	String manufacturer;
	void info(double mem,String man)
		{
			memory=mem;
			manufacturer=man;
			System.out.println("\n__RAM INFORMATION__");
			System.out.println("Memory="+memory+"6GB\n"+"Manufacturer 						Name="+manufacturer);
	}
}
public static void main(String[]args){
CPU cpu = new CPU();
CPU.RAM ram=new CPU.RAM();
CPU.Processor processor=cpu.new Processor();
processor.info(12,"manufact name");
ram.info(126,"INTEL");
}
		}

