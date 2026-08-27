package o;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class focusTargetAvailable {
    public static Serializable IconCompatParcelizer(Bundle bundle, String str, Class cls) {
        return bundle.getSerializable(str, cls);
    }

    public static ArrayList read(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static Object serializer(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }
}
