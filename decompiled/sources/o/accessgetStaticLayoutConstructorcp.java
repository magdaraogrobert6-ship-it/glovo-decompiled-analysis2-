package o;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetStaticLayoutConstructorcp extends StaticLayoutFactory33 {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk IconCompatParcelizer;
    public final accesssetStaticLayoutConstructorcp RemoteActionCompatParcelizer;
    public final int serializer;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk write;

    public accessgetStaticLayoutConstructorcp(int i, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, accesssetStaticLayoutConstructorcp accesssetstaticlayoutconstructorcp) {
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2.getClass();
        this.serializer = i;
        this.write = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.IconCompatParcelizer = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2;
        this.RemoteActionCompatParcelizer = accesssetstaticlayoutconstructorcp;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 17;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Integer.hashCode(this.serializer);
            this.write.hashCode();
            this.IconCompatParcelizer.hashCode();
            throw null;
        }
        int iHashCode2 = Integer.hashCode(this.serializer);
        int iHashCode3 = this.write.hashCode();
        int iHashCode4 = this.IconCompatParcelizer.hashCode();
        accesssetStaticLayoutConstructorcp accesssetstaticlayoutconstructorcp = this.RemoteActionCompatParcelizer;
        if (accesssetstaticlayoutconstructorcp == null) {
            int i3 = MediaDescriptionCompat + 33;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = accesssetstaticlayoutconstructorcp.hashCode();
        }
        return ((iHashCode4 + ((iHashCode3 + (iHashCode2 * 31)) * 31)) * 31) + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "IndividualEarningsState(selectedTabIndex=" + this.serializer + ", earningsTabs=" + this.write + ", earningsList=" + this.IconCompatParcelizer + ", selectedEarningsData=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = read + 125;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 87;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof accessgetStaticLayoutConstructorcp) {
            accessgetStaticLayoutConstructorcp accessgetstaticlayoutconstructorcp = (accessgetStaticLayoutConstructorcp) obj;
            if (this.serializer == accessgetstaticlayoutconstructorcp.serializer) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, accessgetstaticlayoutconstructorcp.write}, getCieXyz.write())).booleanValue()) {
                    if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, accessgetstaticlayoutconstructorcp.IconCompatParcelizer}, getCieXyz.write())).booleanValue())) {
                        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, accessgetstaticlayoutconstructorcp.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
                    }
                } else {
                    int i4 = MediaDescriptionCompat + 23;
                    read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
            } else {
                int i6 = MediaDescriptionCompat + 65;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }
        return false;
    }
}
