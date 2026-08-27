package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.instant.shifts.data.entity.ZoneResponse$Companion;
import kotlinx.serialization.Serializable;
import o.offsetPosition;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class isInvalid {
    public static final ZoneResponse$Companion Companion = new Object() { // from class: com.roadrunner.instant.shifts.data.entity.ZoneResponse$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 95;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            offsetPosition offsetposition = offsetPosition.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 87;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return offsetposition;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final int id;
    public final String name;
    public final isRecyclable startingPoint;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.instant.shifts.data.entity.ZoneResponse$Companion] */
    static {
        int i = write + 67;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 117;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 9;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final int serializer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 69;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.id;
        int i5 = i2 + 23;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final isRecyclable write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        isRecyclable isrecyclable = this.startingPoint;
        int i4 = i3 + 5;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return isrecyclable;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ isInvalid(int i, int i2, String str, isRecyclable isrecyclable) {
        if (7 == (i & 7)) {
            this.id = i2;
            this.name = str;
            this.startingPoint = isrecyclable;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, offsetPosition.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.startingPoint.hashCode() - af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.id) + 56, 126, this.name);
        } else {
            iHashCode = this.startingPoint.hashCode() + af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.id) * 31, 31, this.name);
        }
        int i3 = read + 83;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            StringBuilder sbM = d$$ExternalSyntheticOutline0.m("ZoneResponse(id=", this.id, ", name=", this.name, ", startingPoint=");
            sbM.append(this.startingPoint);
            sbM.append(")");
            String string = sbM.toString();
            int i3 = IconCompatParcelizer + 17;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return string;
        }
        StringBuilder sbM2 = d$$ExternalSyntheticOutline0.m("ZoneResponse(id=", this.id, ", name=", this.name, ", startingPoint=");
        sbM2.append(this.startingPoint);
        sbM2.append(")");
        sbM2.toString();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof isInvalid))) {
            isInvalid isinvalid = (isInvalid) obj;
            if (this.id == isinvalid.id) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, isinvalid.name}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.startingPoint, isinvalid.startingPoint}, getCieXyz.write())).booleanValue();
            }
            int i2 = read + 23;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IconCompatParcelizer + 51;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 33;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
