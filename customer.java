class customer {
    private int number;
    private String name;
    private String address;
    private String description;
    private double price;
    private int quantity;
    private int modePayment;


    // Setters and Getters
    public void setNumber(int a)
    {
        number = a;
    }
    public int getNumber()
    {
        return number;
    }
    public void setName(String a)
    {
        name = a;
    }
    public String getName()
    {
        return name;
    }
    public void setAddress(String a)
    {
        address = a;
    }
    public String getAddress()
    {
        return address;
    }
    public void setDescription(String a)
    {
        description = a;
    }
    public String getDescription()
    {
        return description;
    }
    public void setPrice(double a)
    {
        price = a;
    }
    public double getPrice()
    {
        return price;
    }
    public void setQuantity(int a)
    {
        quantity = a;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setModePayment(int a)
    {
        modePayment = a;
    }
    public int getModePayment()
    {
        return modePayment;
    }

    double compute()
    {
        return price * quantity;
    }

    double net()
    {
        double netTotal = 0;
        switch (modePayment) {
            case 1: netTotal = compute() * 0.95; break;
            case 2: netTotal = compute() * 1.05; break;
            case 3: netTotal = compute() * 1.1; break;
            default:
                System.out.println("Invalid Choice"); netTotal = 0;             
        }
        return netTotal;
    }

    void display()
    {
        System.out.println("Customer Details: ");
        System.out.println("Customer Number: " + number);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Item Description: " + description);
        System.out.println("Price: PHP " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: PHP " + compute());
        System.out.println("Net Price: PHP " + net());

    }

}


