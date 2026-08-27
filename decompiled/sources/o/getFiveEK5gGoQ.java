package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getFiveEK5gGoQ {
    public static final String RemoteActionCompatParcelizer = new String("");
    public final Object IconCompatParcelizer;
    public final List read;
    public final int write;

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public /* synthetic */ getFiveEK5gGoQ(Integer num, Object obj, ArrayList arrayList) {
        this.write = num.intValue();
        this.IconCompatParcelizer = obj;
        this.read = Collections.unmodifiableList(arrayList);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof getFiveEK5gGoQ) && ((getFiveEK5gGoQ) obj).IconCompatParcelizer.equals(this.IconCompatParcelizer);
    }

    public final String toString() {
        Object obj = this.IconCompatParcelizer;
        if (obj != null) {
            return obj.toString();
        }
        getButtonThumbLeftEK5gGoQ.write("Fail to convert a null object to string");
        return RemoteActionCompatParcelizer;
    }
}
