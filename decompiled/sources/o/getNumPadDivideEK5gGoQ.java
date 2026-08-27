package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumPadDivideEK5gGoQ {
    public static final undelegateUnprotectedui IconCompatParcelizer = undelegateUnprotectedui.RemoteActionCompatParcelizer(3, "_syn", "_err", "_el");
    public String RemoteActionCompatParcelizer;
    public final HashMap serializer;
    public final long write;

    public static Object write(String str, Object obj, Object obj2) {
        if (IconCompatParcelizer.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith(BundleUtil.UNDERLINE_TAG)) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final getNumPadDivideEK5gGoQ clone() {
        return new getNumPadDivideEK5gGoQ(this.RemoteActionCompatParcelizer, this.write, new HashMap(this.serializer));
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        long j = this.write;
        return this.serializer.hashCode() + (((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String string = this.serializer.toString();
        int length = String.valueOf(str).length();
        long j = this.write;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + string.length() + 1);
        af$$ExternalSyntheticOutline0.m(sb, "Event{name='", str, "', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }

    public getNumPadDivideEK5gGoQ(String str, long j, HashMap map) {
        this.RemoteActionCompatParcelizer = str;
        this.write = j;
        HashMap map2 = new HashMap();
        this.serializer = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNumPadDivideEK5gGoQ)) {
            return false;
        }
        getNumPadDivideEK5gGoQ getnumpaddivideek5ggoq = (getNumPadDivideEK5gGoQ) obj;
        if (this.write == getnumpaddivideek5ggoq.write && this.RemoteActionCompatParcelizer.equals(getnumpaddivideek5ggoq.RemoteActionCompatParcelizer)) {
            return this.serializer.equals(getnumpaddivideek5ggoq.serializer);
        }
        return false;
    }
}
