package o;

/* JADX INFO: loaded from: classes2.dex */
public final class AccessibilityIteratorsPageTextSegmentIterator {
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final getLineEdgeIndex read;
    public final String serializer;
    public final accessgetPageInstancecp write;

    public final getLineEdgeIndex IconCompatParcelizer() {
        return this.read;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.serializer;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.RemoteActionCompatParcelizer;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        getLineEdgeIndex getlineedgeindex = this.read;
        int iHashCode4 = getlineedgeindex == null ? 0 : getlineedgeindex.hashCode();
        accessgetPageInstancecp accessgetpageinstancecp = this.write;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ (accessgetpageinstancecp != null ? accessgetpageinstancecp.hashCode() : 0);
    }

    public final accessgetPageInstancecp read() {
        return this.write;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public static AccessibilityIteratorsLineTextSegmentIteratorCompanion serializer() {
        return new AccessibilityIteratorsLineTextSegmentIteratorCompanion();
    }

    public AccessibilityIteratorsPageTextSegmentIterator(String str, String str2, String str3, getLineEdgeIndex getlineedgeindex, accessgetPageInstancecp accessgetpageinstancecp) {
        this.IconCompatParcelizer = str;
        this.serializer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.read = getlineedgeindex;
        this.write = accessgetpageinstancecp;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccessibilityIteratorsPageTextSegmentIterator)) {
            return false;
        }
        AccessibilityIteratorsPageTextSegmentIterator accessibilityIteratorsPageTextSegmentIterator = (AccessibilityIteratorsPageTextSegmentIterator) obj;
        String str = accessibilityIteratorsPageTextSegmentIterator.IconCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = accessibilityIteratorsPageTextSegmentIterator.serializer;
        String str4 = this.serializer;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = accessibilityIteratorsPageTextSegmentIterator.RemoteActionCompatParcelizer;
        String str6 = this.RemoteActionCompatParcelizer;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        getLineEdgeIndex getlineedgeindex = accessibilityIteratorsPageTextSegmentIterator.read;
        getLineEdgeIndex getlineedgeindex2 = this.read;
        if (getlineedgeindex2 == null) {
            if (getlineedgeindex != null) {
                return false;
            }
        } else if (!getlineedgeindex2.equals(getlineedgeindex)) {
            return false;
        }
        accessgetPageInstancecp accessgetpageinstancecp = accessibilityIteratorsPageTextSegmentIterator.write;
        accessgetPageInstancecp accessgetpageinstancecp2 = this.write;
        if (accessgetpageinstancecp2 == null) {
            if (accessgetpageinstancecp != null) {
                return false;
            }
        } else if (!accessgetpageinstancecp2.equals(accessgetpageinstancecp)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.IconCompatParcelizer + ", fid=" + this.serializer + ", refreshToken=" + this.RemoteActionCompatParcelizer + ", authToken=" + this.read + ", responseCode=" + this.write + "}";
    }
}
