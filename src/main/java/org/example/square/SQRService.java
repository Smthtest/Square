package org.example.square;
public class SQRService {
    public int calcSqr(int start, int finish) {
        int numbers = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= start & i * i <= finish) {
                numbers++;
            }
        }
        return numbers;

    }
}

