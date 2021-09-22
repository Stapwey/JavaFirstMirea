package ru.mirea.task5;

public abstract class Furniture {
    private String manufacturer;
    private int price;
    private String material;

    public Furniture(String manufacturer, int price, String material) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.material = material;
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public int getPrice() {
        return price;
    }

    public static class Table extends Furniture{
        private int effectivesurface;
        private int numberofboxes;

        public Table(String manufacturer, int price, String material) {
            super(manufacturer, price, material);
        }
        public Table(String manufacturer, int price, String material, int numberofboxes, int effectivesurface) {
            super(manufacturer, price, material);
            this.numberofboxes = numberofboxes;
            this.effectivesurface = effectivesurface;
        }
        public int getEffectivesurface() {
            return effectivesurface;
        }

        public int getNumberofboxes() {
            return numberofboxes;
        }



    }
    public static class Chair extends Furniture{

        private int backrestheight;

        public Chair(String manufacturer, int price, String material) {
            super(manufacturer, price, material);
        }

        public Chair(String manufacturer, int price, String material, int backrestheight) {
            super(manufacturer, price, material);
            this.backrestheight = backrestheight;
        }


        public int getBackrestheight() {
            return backrestheight;
        }
    }
    public class Cupboard extends Furniture{
        private int width;
        private int depth;
        private int height;
        public Cupboard(String manufacturer, int price, String material) {
            super(manufacturer, price, material);

        }
        public Cupboard(String manufacturer, int price, String material, int width, int depth, int height) {
            super(manufacturer, price, material);
            this.width = width;
            this.depth = depth;
            this.height = height;
        }
        public int getWidth() {
            return width;
        }

        public int getDepth() {
            return depth;
        }

        public int getHeight() {
            return height;
        }
    }


}
