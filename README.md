# JSBSimEdit JE (Java Edition)

## Semester project for CSE3310-004, Fall23, Group 2

### Background

JSBSimEdit JE is a Java refactor of the broken and outdated JSBSimCommander program written in C++. 

JSBSimEdit JE assists with the modification of XML flight config files for various aircraft used in the flight simulation software, JSBSim.

JSBSim is a data driven software package for aircraft simulation. JSBSim is widely used in
the Aerospace industry for modeling and simulation. JSBSim is also used as the simulation engine for
the open source FlightGear flight simulator that is freely available on the internet.

All aircraft characteristics are stored in XML files. A user can change the flight characteristics of a
simulated aircraft by changing these characteristics.

### Usage
```bash
# Maven packaging
mvn clean compile package

# Maven Run
mvn exec:java -Dexec.mainClass=uta.cse.cse3310.JSBSimEdit.App
```

### References

- [JSBSimCommander - *deprecated*](https://jsbsimcommander.sourceforge.net/)
- [JSBSimCommander Source - *deprecated*](https://github.com/JSBSim-Team/jsbsimcommander)
- [JSBSim Source](https://github.com/JSBSim-Team/jsbsim)
- [FlightGear](https://www.flightgear.org/)