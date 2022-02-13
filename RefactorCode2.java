package com.Bridgelabz.GenericProgram;

public class RefactorCode2<T extends Comparable<T>>{
	T x,y,z;
	public RefactorCode2(T x, T y, T z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public T maximum() {
		return RefactorCode2.maximum(x,y,z);
	}
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }
  
    public static <T> void printMax(T x,T y, T z, T max){
        System.out.printf("Max of %s, %s and %s is %s \n ", x, y, z, max);
    }
    public static void main(String[] args) {
        Integer xint =3, yint = 4, zint = 5;
        Float xfloat = 3.5f, yfloat = 4.5f, zfloat = 5.5f;
        String xstr = "pear", ystr = "apple", zstr = "banana";

        new RefactorCode2(xint,yint,zint).maximum();
        new RefactorCode2(xfloat,yfloat,zfloat).maximum();
        new RefactorCode2(xstr,ystr,zstr).maximum();
    }
}