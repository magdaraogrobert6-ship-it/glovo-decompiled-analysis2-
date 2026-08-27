package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bKM {
    public static String BGx(Exception exc) {
        try {
            Throwable cause = exc.getCause();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; cause != null && i < 5; i++) {
                sb.append(cause.getClass().getName());
                sb.append(": ");
                sb.append(cause.getMessage());
                sb.append("\n");
                cause = cause.getCause();
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
