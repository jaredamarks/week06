package warApp;



class Card {
	
	int value;
	String name;
	

	public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void describe() {
        System.out.println("Card: " + name + ", Value: " + value);
    }
}