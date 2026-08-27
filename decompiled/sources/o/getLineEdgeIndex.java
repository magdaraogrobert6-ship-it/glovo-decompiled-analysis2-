package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getLineEdgeIndex {
    public final String IconCompatParcelizer;
    public final AccessibilityIteratorsParagraphTextSegmentIterator read;
    public final long write;

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.write;
        int i = (int) (j ^ (j >>> 32));
        AccessibilityIteratorsParagraphTextSegmentIterator accessibilityIteratorsParagraphTextSegmentIterator = this.read;
        return ((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ (accessibilityIteratorsParagraphTextSegmentIterator != null ? accessibilityIteratorsParagraphTextSegmentIterator.hashCode() : 0);
    }

    public final AccessibilityIteratorsParagraphTextSegmentIterator read() {
        return this.read;
    }

    public final long serializer() {
        return this.write;
    }

    public static accessgetLineInstancecp write() {
        accessgetLineInstancecp accessgetlineinstancecp = new accessgetLineInstancecp();
        accessgetlineinstancecp.RemoteActionCompatParcelizer(0L);
        return accessgetlineinstancecp;
    }

    public getLineEdgeIndex(String str, long j, AccessibilityIteratorsParagraphTextSegmentIterator accessibilityIteratorsParagraphTextSegmentIterator) {
        this.IconCompatParcelizer = str;
        this.write = j;
        this.read = accessibilityIteratorsParagraphTextSegmentIterator;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getLineEdgeIndex)) {
            return false;
        }
        getLineEdgeIndex getlineedgeindex = (getLineEdgeIndex) obj;
        String str = getlineedgeindex.IconCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.write != getlineedgeindex.write) {
            return false;
        }
        AccessibilityIteratorsParagraphTextSegmentIterator accessibilityIteratorsParagraphTextSegmentIterator = getlineedgeindex.read;
        AccessibilityIteratorsParagraphTextSegmentIterator accessibilityIteratorsParagraphTextSegmentIterator2 = this.read;
        if (accessibilityIteratorsParagraphTextSegmentIterator2 == null) {
            if (accessibilityIteratorsParagraphTextSegmentIterator != null) {
                return false;
            }
        } else if (!accessibilityIteratorsParagraphTextSegmentIterator2.equals(accessibilityIteratorsParagraphTextSegmentIterator)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "TokenResult{token=" + this.IconCompatParcelizer + ", tokenExpirationTimestamp=" + this.write + ", responseCode=" + this.read + "}";
    }
}
