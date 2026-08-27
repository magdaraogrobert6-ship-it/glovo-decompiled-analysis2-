package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class forceMeasureTheSubtree extends getPlacedOnce {
    public final int IconCompatParcelizer;
    public final getPlacedOnce RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final List write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        String str = this.serializer;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.write.hashCode();
        getPlacedOnce getplacedonce = this.RemoteActionCompatParcelizer;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ (getplacedonce != null ? getplacedonce.hashCode() : 0)) * 1000003) ^ this.IconCompatParcelizer;
    }

    public forceMeasureTheSubtree(String str, String str2, List list, getPlacedOnce getplacedonce, int i) {
        this.read = str;
        this.serializer = str2;
        this.write = list;
        this.RemoteActionCompatParcelizer = getplacedonce;
        this.IconCompatParcelizer = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getPlacedOnce)) {
            return false;
        }
        forceMeasureTheSubtree forcemeasurethesubtree = (forceMeasureTheSubtree) ((getPlacedOnce) obj);
        if (!this.read.equals(forcemeasurethesubtree.read)) {
            return false;
        }
        String str = forcemeasurethesubtree.serializer;
        String str2 = this.serializer;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.write.equals(forcemeasurethesubtree.write)) {
            return false;
        }
        getPlacedOnce getplacedonce = forcemeasurethesubtree.RemoteActionCompatParcelizer;
        getPlacedOnce getplacedonce2 = this.RemoteActionCompatParcelizer;
        if (getplacedonce2 == null) {
            if (getplacedonce != null) {
                return false;
            }
        } else if (!getplacedonce2.equals(getplacedonce)) {
            return false;
        }
        return this.IconCompatParcelizer == forcemeasurethesubtree.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.read);
        sb.append(", reason=");
        sb.append(this.serializer);
        sb.append(", frames=");
        sb.append(this.write);
        sb.append(", causedBy=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", overflowCount=");
        return af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, "}", sb);
    }
}
