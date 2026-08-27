package o;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DecodeResult {
    public final List IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final Class serializer;
    public final Method write;

    public final String toString() {
        return String.format("%s.%s() %s", this.serializer.getName(), this.write.getName(), this.IconCompatParcelizer);
    }

    public DecodeResult(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.serializer = cls;
        this.RemoteActionCompatParcelizer = obj;
        this.write = method;
        this.IconCompatParcelizer = Collections.unmodifiableList(arrayList);
    }
}
