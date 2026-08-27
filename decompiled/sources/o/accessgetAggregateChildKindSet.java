package o;

import com.google.android.gms.internal.gtm.zzbv;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetAggregateChildKindSet {
    public final Map IconCompatParcelizer;
    public final String read;

    public static accessgetAggregateChildKindSet read(String str) {
        return new accessgetAggregateChildKindSet(str, Collections.EMPTY_MAP);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + (this.read.hashCode() * 31);
    }

    public final Annotation write(Class cls) {
        return (Annotation) this.IconCompatParcelizer.get(cls);
    }

    public accessgetAggregateChildKindSet(String str, Map map) {
        this.read = str;
        this.IconCompatParcelizer = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessgetAggregateChildKindSet)) {
            return false;
        }
        accessgetAggregateChildKindSet accessgetaggregatechildkindset = (accessgetAggregateChildKindSet) obj;
        return this.read.equals(accessgetaggregatechildkindset.read) && this.IconCompatParcelizer.equals(accessgetaggregatechildkindset.IconCompatParcelizer);
    }

    public static zzbv write(String str) {
        return new zzbv(21, str);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.read + ", properties=" + this.IconCompatParcelizer.values() + "}";
    }
}
