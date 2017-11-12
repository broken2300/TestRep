package record;

import java.io.IOException;

public class DynaPackage {

	public static void main(String[] args) throws IOException {

        int c[] = {0, 3, 4, 5};
        int v[] = {0, 4, 5, 6};
        int f[][] = new int[4][11];

        for (int i = 1; i < 4; i++)
            for (int j = 1; j < 11; j++) {
                if (c[i] > j)//����������������Ų���c[i]����ѡc[i]
                    f[i][j] = f[i - 1][j];
                else {
                    f[i][j] = Math.max(f[i - 1][j], f[i - 1][j - c[i]] + v[i]);//ת�Ʒ���ʽ
                    System.out.println(f[i][j]);
                }
            }
        System.out.println("last answer: " + f[3][10]);
        for (int m = 0; m < 4; m++) {
            for (int n = 0; n < 11; n++) {
                System.out.println("the matrix answer f[" + m + "][" + n + "]:" + f[m][n]);
            }
        }


    }

}

/*
public class Foo implements Runnable{  
private static byte[] lock = new byte[0];  
  
@Override  
public void run() {  
      
methodA();  
                  
}  

public synchronized void methodA(){  
    System.out.println(this);  
}  
  
public void methodB(){  
    synchronized(this){  
        System.out.println(this);  
    }  
}  
  
public void methodC(){  
    synchronized(lock){  
        System.out.println(lock);  
    }  
}  
}  
*/