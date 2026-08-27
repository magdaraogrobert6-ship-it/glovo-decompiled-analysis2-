package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.domain.upload.SharedImageData$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class TextFieldValueCompanion {
    public static final SharedImageData$Companion Companion = new SharedImageData$Companion();
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final long capturedAt;
    public final String id;
    public final Double latitude;
    public final Double longitude;
    public final String path;

    static {
        int i = IconCompatParcelizer + 75;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ TextFieldValueCompanion(int i, String str, String str2, long j, Double d, Double d2) {
        if (31 == (i & 31)) {
            this.id = str;
            this.path = str2;
            this.capturedAt = j;
            this.latitude = d;
            this.longitude = d2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, copy3r_uNRQ.serializer.getDescriptor());
        throw null;
    }

    public TextFieldValueCompanion(String str, String str2, long j, Double d, Double d2) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.path = str2;
        this.capturedAt = j;
        this.latitude = d;
        this.longitude = d2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 11;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.path), 31, this.capturedAt);
        Double d = this.latitude;
        int iHashCode2 = 0;
        if (d == null) {
            int i4 = write + 53;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = d.hashCode();
        }
        Double d2 = this.longitude;
        if (d2 != null) {
            iHashCode2 = d2.hashCode();
            int i6 = serializer + 53;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        return ((iM + iHashCode) * 31) + iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 91;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("SharedImageData(id=", this.id, ", path=", this.path, ", capturedAt=");
        sbM.append(this.capturedAt);
        sbM.append(", latitude=");
        sbM.append(this.latitude);
        sbM.append(", longitude=");
        sbM.append(this.longitude);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 123;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof TextFieldValueCompanion)) {
                return false;
            }
            TextFieldValueCompanion textFieldValueCompanion = (TextFieldValueCompanion) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, textFieldValueCompanion.id}, getCieXyz.write())).booleanValue()) {
                int i2 = serializer + 59;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.path, textFieldValueCompanion.path}, getCieXyz.write())).booleanValue()) {
                int i4 = serializer + 7;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            if (this.capturedAt != textFieldValueCompanion.capturedAt) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.latitude, textFieldValueCompanion.latitude}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.longitude, textFieldValueCompanion.longitude}, getCieXyz.write())).booleanValue()) {
                    int i6 = serializer + 21;
                    write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i6 % 2 != 0;
                }
                int i7 = serializer + 21;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i8 = serializer + 79;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i8 % 2 != 0;
        }
        int i9 = write + 61;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i9 % 2 != 0;
    }
}
