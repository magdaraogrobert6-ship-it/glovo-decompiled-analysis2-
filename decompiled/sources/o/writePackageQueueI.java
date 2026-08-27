package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.state.searchshifts.api.entity.QuickSessionEndTime$Companion;
import kotlinx.serialization.Serializable;
import o.PackageHandler4;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class writePackageQueueI {
    public static final QuickSessionEndTime$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.searchshifts.api.entity.QuickSessionEndTime$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 73;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            PackageHandler4 packageHandler4 = PackageHandler4.IconCompatParcelizer;
            int i4 = read + 55;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return packageHandler4;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String endTime;
    public final Boolean isDefault;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.searchshifts.api.entity.QuickSessionEndTime$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 101;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ writePackageQueueI(int i, String str, Boolean bool) {
        if (1 == (i & 1)) {
            this.endTime = str;
            if ((i & 2) == 0) {
                this.isDefault = null;
                int i2 = IconCompatParcelizer + 107;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.isDefault = bool;
            int i4 = IconCompatParcelizer + 75;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 77 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, PackageHandler4.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.endTime.hashCode();
        Boolean bool = this.isDefault;
        if (bool == null) {
            int i4 = IconCompatParcelizer + 125;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
        }
        int i6 = (iHashCode2 * 31) + iHashCode;
        int i7 = write + 55;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "QuickSessionEndTime(endTime=" + this.endTime + ", isDefault=" + this.isDefault + ")";
        int i2 = IconCompatParcelizer + 77;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 95;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof writePackageQueueI)) {
            return false;
        }
        writePackageQueueI writepackagequeuei = (writePackageQueueI) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.endTime, writepackagequeuei.endTime}, getCieXyz.write())).booleanValue()) {
            int i3 = IconCompatParcelizer + 15;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isDefault, writepackagequeuei.isDefault}, getCieXyz.write())).booleanValue())) {
            return true;
        }
        int i5 = write + 107;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
