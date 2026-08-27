package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z7ExternalSyntheticLambda4 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final List RemoteActionCompatParcelizer;
    public final zcExternalSyntheticLambda0 serializer;
    public final List write;

    public z7ExternalSyntheticLambda4(List list, zcExternalSyntheticLambda0 zcexternalsyntheticlambda0, List list2) {
        list.getClass();
        list2.getClass();
        this.write = list;
        this.serializer = zcexternalsyntheticlambda0;
        this.RemoteActionCompatParcelizer = list2;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.write.hashCode();
        zcExternalSyntheticLambda0 zcexternalsyntheticlambda0 = this.serializer;
        if (zcexternalsyntheticlambda0 == null) {
            int i3 = IconCompatParcelizer + 65;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode2 = zcexternalsyntheticlambda0.hashCode();
            int i5 = IconCompatParcelizer + 117;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return this.RemoteActionCompatParcelizer.hashCode() + (((iHashCode * 31) + i) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("History(summation=");
        sb.append(this.write);
        sb.append(", latestDelivery=");
        sb.append(this.serializer);
        sb.append(", allDeliveries=");
        String str = MediaSessionCompatQueueItem.read(sb, this.RemoteActionCompatParcelizer, ")");
        int i2 = IconCompatParcelizer + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 83;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof z7ExternalSyntheticLambda4)) {
            int i4 = IconCompatParcelizer + 77;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        z7ExternalSyntheticLambda4 z7externalsyntheticlambda4 = (z7ExternalSyntheticLambda4) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, z7externalsyntheticlambda4.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, z7externalsyntheticlambda4.serializer}, getCieXyz.write())).booleanValue())) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, z7externalsyntheticlambda4.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i6 = read + 73;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = IconCompatParcelizer + 89;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
