public class Vector {
    private int x = 0;
    private int y = 0;
    private int z = 0;

    public void Vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + "," + z + ")";
    }

    public void addition(int x1, int y1, int z1) {
        x += x1;
        y += y1;
        z += z1;
    }

    public void difference(int x1, int y1, int z1) {
        x -= x1;
        y -= y1;
        z -= z1;
    }

    public int scalarProduct(int x1, int y1, int z1) {
        return x * x1 + y * y1 + z * z1;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double cos(int x1, int y1, int z1) {
        if (x * x + y * y + z * z != 0 && x1 * x1 + y1 * y1 + z1 * z1 != 0) {
            return scalarProduct(x1, y1, z1) / (Math.sqrt(x * x + y * y + z * z) * Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1));
        }
        else {
            throw new ArithmeticException("Ошибка ввода");
        }

    }
}