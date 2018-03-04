package constructorDI;

import org.springframework.beans.factory.annotation.Autowired;

public class D {
	
	
private DependencyA dependencyA;
private DependencyB dependencyB;
private DependencyC dependencyC;

//setter injection
@Autowired
public void setDependencyA(DependencyA dependencyA) {
	this.dependencyA = dependencyA;
}
@Autowired
public void setDependencyB(DependencyB dependencyB) {
	this.dependencyB = dependencyB;
}
@Autowired
public void setDependencyC(DependencyC dependencyC) {
	this.dependencyC = dependencyC;
}


//constructor-based DI
/*@Autowired
public D(DependencyA dependencyA, DependencyB dependencyB, DependencyC dependencyC) {
	
	this.dependencyA = dependencyA;
	this.dependencyB = dependencyB;
	this.dependencyC = dependencyC;
}
*/




}
