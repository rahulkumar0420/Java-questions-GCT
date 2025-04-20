class mathoperation {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        mathoperation mo = new mathoperation();
        System.out.println("Add 2 numbers: " + mo.add(5, 10));
        System.out.println("Add 3 numbers: " + mo.add(1, 2, 3));
    }
}
