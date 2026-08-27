package o;

import android.content.SharedPreferences;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class getOrder {
    public final SharedPreferences RemoteActionCompatParcelizer;

    static {
        new HashMap();
    }

    public final String RemoteActionCompatParcelizer(String str) {
        SharedPreferences sharedPreferences = this.RemoteActionCompatParcelizer;
        if (sharedPreferences == null) {
            return "";
        }
        try {
            return sharedPreferences.getString(str, "");
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read("LocationPreferences", "getString fail");
            return "";
        }
    }

    public final long write(String str) {
        SharedPreferences sharedPreferences = this.RemoteActionCompatParcelizer;
        if (sharedPreferences == null) {
            return -1L;
        }
        try {
            return sharedPreferences.getLong(str, -1L);
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read("LocationPreferences", "getLong fail");
            return -1L;
        }
    }

    public getOrder(String str) {
        try {
            this.RemoteActionCompatParcelizer = ((Integer.parseInt("100") == 200 || Integer.parseInt("100") == 300) ? placeAtf8xVGno.RemoteActionCompatParcelizer : placeAtf8xVGno.read()).createDeviceProtectedStorageContext().getSharedPreferences(str, 0);
        } catch (Exception e) {
            WrappedCompositionsetContent1211.read("LocationPreferences", "init getSharedPreferences fail:" + e.getMessage());
        }
    }

    public final void IconCompatParcelizer(String str, String str2) {
        SharedPreferences sharedPreferences = this.RemoteActionCompatParcelizer;
        if (sharedPreferences == null) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit != null) {
                editorEdit.putString(str, str2);
                editorEdit.commit();
            }
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read("LocationPreferences", "saveString fail");
        }
    }

    public final void write(String str, long j) {
        SharedPreferences sharedPreferences = this.RemoteActionCompatParcelizer;
        if (sharedPreferences == null) {
            return;
        }
        try {
            sharedPreferences.edit().putLong(str, j).commit();
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read("LocationPreferences", "saveLong fail");
        }
    }
}
