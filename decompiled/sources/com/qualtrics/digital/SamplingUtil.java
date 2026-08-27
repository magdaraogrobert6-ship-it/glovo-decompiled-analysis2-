package com.qualtrics.digital;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class SamplingUtil {
    public static boolean checkSampling(Double d) {
        if (d.doubleValue() != 100.0d) {
            return new Random().nextDouble() * 100.0d <= d.doubleValue();
        }
        return true;
    }
}
