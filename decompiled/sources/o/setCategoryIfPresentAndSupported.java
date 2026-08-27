package o;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class setCategoryIfPresentAndSupported {
    private static setCategoryIfPresentAndSupported RemoteActionCompatParcelizer;
    private final HashSet IconCompatParcelizer = new HashSet();

    public static setCategoryIfPresentAndSupported write() {
        setCategoryIfPresentAndSupported setcategoryifpresentandsupported;
        synchronized (setCategoryIfPresentAndSupported.class) {
            if (RemoteActionCompatParcelizer == null) {
                RemoteActionCompatParcelizer = new setCategoryIfPresentAndSupported();
            }
            setcategoryifpresentandsupported = RemoteActionCompatParcelizer;
        }
        return setcategoryifpresentandsupported;
    }

    public final void read() {
        this.IconCompatParcelizer.clear();
    }

    public final ArrayList serializer() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.IconCompatParcelizer);
        return arrayList;
    }

    private setCategoryIfPresentAndSupported() {
    }

    public final void serializer(Class<? extends getValidNotificationChannellambda0> cls) {
        this.IconCompatParcelizer.add(cls);
    }
}
