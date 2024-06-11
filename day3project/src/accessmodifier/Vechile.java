package accessmodifier;

public class Vechile {
private String vehNumber;

private String vehmodel;

private String vehprice;

public String getVehNumber() {
	return vehNumber;
}

public void setVehNumber(String vehNumber) {
	this.vehNumber = vehNumber;
}

public String getVehmodel() {
	return vehmodel;
}

public void setVehmodel(String vehmodel) {
	this.vehmodel = vehmodel;
}

public String getVehprice() {
	return vehprice;
}

public void setVehprice(String vehprice) {
	this.vehprice = vehprice;
}

public Vechile(String vehNumber, String vehmodel, String vehprice) {
	super();
	this.vehNumber = vehNumber;
	this.vehmodel = vehmodel;
	this.vehprice = vehprice;
}
public Vechile () {};
@Override
public String toString() {
	return "Vechile [vehNumber=" + vehNumber + ", vehmodel=" + vehmodel + ", vehprice=" + vehprice + "]";
}

}
