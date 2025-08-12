// Product
class Computer 
{
    private String CPU;
    private String RAM;
    private String storage;
    private boolean graphicsCard;
    private boolean bluetooth;

    // Private constructor to force use of Builder
    private Computer(Builder builder) 
    {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.bluetooth = builder.bluetooth;
    }

    @Override
    public String toString() 
    {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage +
               ", graphicsCard=" + graphicsCard + ", bluetooth=" + bluetooth + "]";
    }

    // Builder Class
    public static class Builder 
    {
        private String CPU;
        private String RAM;
        private String storage;
        private boolean graphicsCard;
        private boolean bluetooth;

        public Builder(String CPU, String RAM) 
        { 
            // Mandatory params
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder storage(String storage) 
        {
            this.storage = storage;
            return this;
        }

        public Builder graphicsCard(boolean graphicsCard) 
        {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder bluetooth(boolean bluetooth) 
        {
            this.bluetooth = bluetooth;
            return this;
        }

        public Computer build() 
        {
            return new Computer(this);
        }
    }
}

// Client
public class BuilderPattern_Main
{
    public static void main(String[] args) 
    {
        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                .storage("1TB SSD")
                .graphicsCard(true)
                .bluetooth(true)
                .build();

        Computer officePC = new Computer.Builder("Intel i5", "16GB")
                .storage("512GB SSD")
                .build();

        System.out.println(gamingPC);
        System.out.println(officePC);
    }
}