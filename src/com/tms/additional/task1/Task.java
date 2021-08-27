package com.tms.additional.task1;

public class Task {

    static float findFinalContribution(float contribution, int months) {
        for(int i = 0; i < months; i++) {
            contribution += contribution * 0.07;
        }
        return contribution;
    }
}
