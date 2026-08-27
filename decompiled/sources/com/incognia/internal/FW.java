package com.incognia.internal;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class FW {
    public final native List fep(List list);

    public static Long BGx(String str) {
        try {
            return Long.valueOf(new File(str).length());
        } catch (Throwable unused) {
            return null;
        }
    }
}
