package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.instant.shifts.data.entity.InstantShiftResponse$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class isRemoved {
    public static final InstantShiftResponse$Companion Companion = new InstantShiftResponse$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final boolean canWorkNow;
    public final String endedAt;
    public final int id;
    public final String startedAt;
    public final isInvalid zone;

    static {
        int i = RemoteActionCompatParcelizer + 53;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 60 / 0;
        }
    }

    public /* synthetic */ isRemoved(int i, int i2, String str, String str2, boolean z, isInvalid isinvalid) {
        if (31 == (i & 31)) {
            this.id = i2;
            this.startedAt = str;
            this.endedAt = str2;
            this.canWorkNow = z;
            this.zone = isinvalid;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, isScrap.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 71;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.zone.hashCode() + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.id) * 31, 31, this.startedAt), 31, this.endedAt), 31, this.canWorkNow);
        int i4 = IconCompatParcelizer + 37;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 25;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("InstantShiftResponse(id=", this.id, ", startedAt=", this.startedAt, ", endedAt=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.endedAt, ", canWorkNow=", ", zone=", sbM, this.canWorkNow);
        sbM.append(this.zone);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 47;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof isRemoved) {
                isRemoved isremoved = (isRemoved) obj;
                if (this.id != isremoved.id) {
                    return false;
                }
                Object[] objArr = {this.startedAt, isremoved.startedAt};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr2 = {this.endedAt, isremoved.endedAt};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    if (this.canWorkNow != isremoved.canWorkNow) {
                        int i2 = IconCompatParcelizer + 31;
                        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        return false;
                    }
                    Object[] objArr3 = {this.zone, isremoved.zone};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i4 = write + 13;
                    IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                int i6 = IconCompatParcelizer + 9;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = write + 9;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = write + 77;
        int i11 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 121;
        write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i13 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
