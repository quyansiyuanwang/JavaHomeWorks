package com.Complex;

public class Complex {

    private double real;
    private double imaginary;

    public Complex() {
        this.real = 0.;
        this.imaginary = 0;
    }

    public Complex(double real,
            double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void setReal(double value) {
        this.real = value;
    }

    public void setImaginary(double value) {
        this.imaginary = value;
    }

    public Complex negate() {
        return new Complex(-this.real, -this.imaginary);
    }

    public <T> Complex add(T another) {
        switch (another) {
            case Complex complex -> {
                return new Complex(this.real + complex.getReal(), this.imaginary + complex.getImaginary());
            }
            case Number number -> {
                return new Complex(this.real + (number).doubleValue(), this.imaginary);
            }
            default ->
                throw new IllegalArgumentException("Unsupported type: " + another.getClass().getName());
        }
    }

    public <T> Complex sub(T another) {
        if (another == null) {
            throw new IllegalArgumentException("Argument cannot be null");
        }
        return this.add(another instanceof Complex ? ((Complex) another).negate() : -((Number) another).doubleValue());
    }

    @Override
    public String toString() {
        return "Complex["
                + this.real
                + (this.imaginary != 0 ? ((this.imaginary >= 0 ? "+" : "-") + Math.abs(this.imaginary) + "i]")
                        : "]");
    }
}
