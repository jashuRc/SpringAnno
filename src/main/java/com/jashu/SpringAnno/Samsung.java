package com.jashu.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("samsung") default name ||Non qualified and de capitalize
@Component
public class Samsung
{
    @Autowired
    @Qualifier("mediaTek")
    private MobileProcessor cpu;

    public void config()
    {
	System.out.println("Octa Core, 4gb ram, 12 MP camera");
	cpu.process();
    }

    public MobileProcessor getCpu()
    {
	return cpu;
    }

    public void setCpu(MobileProcessor cpu)
    {
	this.cpu = cpu;
    }
}
