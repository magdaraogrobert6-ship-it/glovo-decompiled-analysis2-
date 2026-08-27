package o;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getOriginal {
    public static final HashMap serializer = new HashMap();

    public static accesssetAddedToLifecyclep write(String str) {
        Class cls = (Class) serializer.get(str);
        if (cls == null) {
            return null;
        }
        try {
            return (accesssetAddedToLifecyclep) cls.newInstance();
        } catch (Exception unused) {
            return null;
        }
    }
}
