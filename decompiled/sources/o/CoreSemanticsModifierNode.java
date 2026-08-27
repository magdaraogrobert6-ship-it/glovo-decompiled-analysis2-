package o;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CoreSemanticsModifierNode {
    public static String IconCompatParcelizer(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getDeclaredMethod("get", String.class, String.class).invoke(cls, str, "");
            return objInvoke instanceof String ? (String) objInvoke : "";
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            Log.e("PropertyUtil", "An exception occurred while reading string system properties: ".concat(str));
            return "";
        }
    }
}
