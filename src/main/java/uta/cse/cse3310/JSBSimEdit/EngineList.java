package uta.cse.cse3310.JSBSimEdit;

public class EngineList {
    String name;
    String type;
    String desc;

    public EngineList(String name, String type, String desc) {
        this.name = name;
        this.type = type;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		return sb.toString();
	}

}
