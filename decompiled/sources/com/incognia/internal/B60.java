package com.incognia.internal;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public final class B60 {
    public final Context BGx;

    public final Integer BGx() {
        try {
            return Integer.valueOf(Settings.Secure.getInt(this.BGx.getContentResolver(), "accessibility_enabled"));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String HQ(String str) {
        try {
            return Settings.System.getString(this.BGx.getContentResolver(), str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String mbG(String str) {
        try {
            return Settings.Secure.getString(this.BGx.getContentResolver(), str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public B60(Context context) {
        this.BGx = context;
    }

    public final String BGx(String str) {
        try {
            return Settings.Global.getString(this.BGx.getContentResolver(), str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
