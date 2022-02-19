package com.learningjava.tutA;

public class Lenses {

    public static void main(String[] args) {

        Lens lensOne = new Lens("Sony", "85mm", true);

        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);

        String message = lensOne.isPrime ?
                "Lens is prime" :
                "Lens is not prime";
        System.out.println(message);
    }

    static class Lens {

        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }

    }

}
