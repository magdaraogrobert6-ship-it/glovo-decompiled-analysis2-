package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.state.searchshifts.api.entity.QuickSessionZone$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.PackageHandler2;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class PackageHandler6 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final List pickerData;
    public final int zoneId;
    public static final QuickSessionZone$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.searchshifts.api.entity.QuickSessionZone$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 57;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            PackageHandler2 packageHandler2 = PackageHandler2.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 93;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return packageHandler2;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new getSessionParameters(22))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.searchshifts.api.entity.QuickSessionZone$Companion] */
    static {
        int i = IconCompatParcelizer + 83;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 9 / 0;
        }
    }

    public final List RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 9;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.pickerData;
        int i5 = i2 + 49;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final int read() {
        int i = 2 % 2;
        int i2 = serializer + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = this.zoneId;
        int i6 = i3 + 29;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    public /* synthetic */ PackageHandler6(List list, int i, int i2) {
        if (1 == (i & 1)) {
            this.zoneId = i2;
            if ((i & 2) == 0) {
                this.pickerData = instance_delegatelambda0.write;
                int i3 = RemoteActionCompatParcelizer + 57;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return;
            }
            this.pickerData = list;
            int i5 = RemoteActionCompatParcelizer + 121;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, PackageHandler2.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 19;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.pickerData.hashCode() * (Integer.hashCode(this.zoneId) >>> 56);
        } else {
            iHashCode = this.pickerData.hashCode() + (Integer.hashCode(this.zoneId) * 31);
        }
        int i3 = RemoteActionCompatParcelizer + 27;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 77;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageHandler6)) {
            int i5 = i2 + 75;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        PackageHandler6 packageHandler6 = (PackageHandler6) obj;
        if (this.zoneId == packageHandler6.zoneId) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pickerData, packageHandler6.pickerData}, getCieXyz.write())).booleanValue();
        }
        int i7 = i4 + 105;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 == 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "QuickSessionZone(zoneId=" + this.zoneId + ", pickerData=" + this.pickerData + ")";
        int i2 = serializer + 5;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
