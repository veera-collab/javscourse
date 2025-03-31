class Casting {
    public static void main(String[] args) {
        int a = 197; // ✅ Declare 'a' first
        byte b = (byte) a; // ✅ Now we can use 'a'
        float f = 5.6f;
        int p = (int)f;
        System.out.println(p); // Output: 127
        System.out.println(b);
    }
}

