package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$ExpandableButtonV1$FullscreenItem$FullscreenItemComponent$Companion;
import kotlinx.serialization.Serializable;
import o.fastLastOrNull;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class fastMapIndexed {
    public static final Deliveries$Delivery$DeliveriesComponent$ExpandableButtonV1$FullscreenItem$FullscreenItemComponent$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$ExpandableButtonV1$FullscreenItem$FullscreenItemComponent$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 89;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            fastLastOrNull fastlastornull = fastLastOrNull.RemoteActionCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 65;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return fastlastornull;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String bags;
    public final String fullscreenTitle;
    public final String pickedUpTitle;
    public final String shelves;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$ExpandableButtonV1$FullscreenItem$FullscreenItemComponent$Companion] */
    static {
        int i = serializer + 39;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 80 / 0;
        }
    }

    public /* synthetic */ fastMapIndexed(String str, int i, String str2, String str3, String str4) {
        if (4 != (i & 4)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 4, fastLastOrNull.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.bags = null;
        } else {
            this.bags = str;
        }
        if ((i & 2) == 0) {
            this.shelves = null;
            int i2 = write + 111;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            this.shelves = str2;
        }
        int i4 = 2 % 2;
        this.fullscreenTitle = str3;
        if ((i & 8) != 0) {
            this.pickedUpTitle = str4;
            return;
        }
        int i5 = write + 59;
        int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i6;
        int i7 = i5 % 2;
        this.pickedUpTitle = null;
        int i8 = i6 + 113;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 23;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("FullscreenItemComponent(bags=", this.bags, ", shelves=", this.shelves, ", fullscreenTitle="), this.fullscreenTitle, ", pickedUpTitle=", this.pickedUpTitle, ")");
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("FullscreenItemComponent(bags=", this.bags, ", shelves=", this.shelves, ", fullscreenTitle="), this.fullscreenTitle, ", pickedUpTitle=", this.pickedUpTitle, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023 A[PHI: r2 r4
  0x0023: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v6 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x0023: PHI (r4v5 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001a A[PHI: r4
  0x001a: PHI (r4v1 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 105;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            str = this.bags;
            iHashCode = 1;
            if (str == null) {
                int i4 = i2 + 25;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str.hashCode();
            }
        } else {
            str = this.bags;
            iHashCode = 0;
            if (str == null) {
                int i6 = i2 + 25;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str.hashCode();
            }
        }
        String str2 = this.shelves;
        int iM = af$$ExternalSyntheticOutline0.m(((iHashCode2 * 31) + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.fullscreenTitle);
        String str3 = this.pickedUpTitle;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return iM + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof fastMapIndexed) {
            fastMapIndexed fastmapindexed = (fastMapIndexed) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bags, fastmapindexed.bags}, getCieXyz.write())).booleanValue()) {
                int i2 = read + 65;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shelves, fastmapindexed.shelves}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fullscreenTitle, fastmapindexed.fullscreenTitle}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pickedUpTitle, fastmapindexed.pickedUpTitle}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = write + 119;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        int i5 = read + 99;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
