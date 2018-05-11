package com.flashhold.build;

public abstract class Builder {
    public abstract  void buildCpu();
    public abstract  void  buildHD();
    public abstract void buildMainboard();
    public abstract Computer getComputer();
}
