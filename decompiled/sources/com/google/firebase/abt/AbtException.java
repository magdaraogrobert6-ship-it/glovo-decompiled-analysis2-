package com.google.firebase.abt;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public class AbtException extends Exception {
    public static int RemoteActionCompatParcelizer;
    public static int serializer;

    public static int RemoteActionCompatParcelizer() {
        int i = serializer;
        int i2 = i % 5037249;
        serializer = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        RemoteActionCompatParcelizer = elapsedCpuTime;
        return elapsedCpuTime;
    }

    public AbtException(String str) {
        super(str);
    }

    public AbtException(String str, Throwable th) {
        super(str, th);
    }
}
