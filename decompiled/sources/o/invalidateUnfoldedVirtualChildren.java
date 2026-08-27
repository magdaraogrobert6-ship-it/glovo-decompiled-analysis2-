package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class invalidateUnfoldedVirtualChildren {
    public final getZSortedChildrenannotations IconCompatParcelizer;
    public final Integer serializer;
    public final List write;

    public final int hashCode() {
        return Objects.hash(this.IconCompatParcelizer, this.write);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.IconCompatParcelizer, this.write, this.serializer);
    }

    public invalidateUnfoldedVirtualChildren(getZSortedChildrenannotations getzsortedchildrenannotations, List list, Integer num) {
        this.IconCompatParcelizer = getzsortedchildrenannotations;
        this.write = list;
        this.serializer = num;
    }

    public static accessgetTvTeletextcp read() {
        accessgetTvTeletextcp accessgettvteletextcp = new accessgetTvTeletextcp((byte) 0, 29);
        accessgettvteletextcp.RemoteActionCompatParcelizer = new ArrayList();
        accessgettvteletextcp.serializer = getZSortedChildrenannotations.read;
        accessgettvteletextcp.write = null;
        return accessgettvteletextcp;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof invalidateUnfoldedVirtualChildren)) {
            return false;
        }
        invalidateUnfoldedVirtualChildren invalidateunfoldedvirtualchildren = (invalidateUnfoldedVirtualChildren) obj;
        return this.IconCompatParcelizer.equals(invalidateunfoldedvirtualchildren.IconCompatParcelizer) && this.write.equals(invalidateunfoldedvirtualchildren.write) && Objects.equals(this.serializer, invalidateunfoldedvirtualchildren.serializer);
    }
}
