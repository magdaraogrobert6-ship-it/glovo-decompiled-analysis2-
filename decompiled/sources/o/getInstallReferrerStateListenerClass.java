package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.provider.data.model.StatusAction$Companion;
import kotlinx.serialization.Serializable;
import o.getReferrerClickTimestampServerSeconds;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getInstallReferrerStateListenerClass {
    public static final StatusAction$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.data.model.StatusAction$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 71;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getReferrerClickTimestampServerSeconds getreferrerclicktimestampserverseconds = getReferrerClickTimestampServerSeconds.RemoteActionCompatParcelizer;
            int i4 = write + 111;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getreferrerclicktimestampserverseconds;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final String text;
    public final String type;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.data.model.StatusAction$Companion] */
    static {
        int i = read + 33;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ getInstallReferrerStateListenerClass(int i, String str, String str2, String str3) {
        if (3 == (i & 3)) {
            this.type = str;
            this.text = str2;
            if ((i & 4) == 0) {
                this.url = null;
                int i2 = RemoteActionCompatParcelizer + 59;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 14 / 0;
                    return;
                }
                return;
            }
            this.url = str3;
            int i4 = IconCompatParcelizer + 121;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getReferrerClickTimestampServerSeconds.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("StatusAction(type=", this.type, ", text=", this.text, ", url="), this.url, ")");
        int i4 = IconCompatParcelizer + 1;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038 A[PHI: r1 r2
  0x0038: PHI (r1v11 int) = (r1v7 int), (r1v15 int) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r2v8 java.lang.String) = (r2v2 java.lang.String), (r2v11 java.lang.String) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r1
  0x0036: PHI (r1v8 int) = (r1v7 int), (r1v15 int) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 49;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.type.hashCode() - 28, 85, this.text);
            str = this.url;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.type.hashCode() * 31, 31, this.text);
            str = this.url;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        }
        int i3 = iM + iHashCode;
        int i4 = IconCompatParcelizer + 103;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return i3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 5;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (!(obj instanceof getInstallReferrerStateListenerClass)) {
                return false;
            }
            getInstallReferrerStateListenerClass getinstallreferrerstatelistenerclass = (getInstallReferrerStateListenerClass) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, getinstallreferrerstatelistenerclass.type}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, getinstallreferrerstatelistenerclass.text}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, getinstallreferrerstatelistenerclass.url}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i5 = RemoteActionCompatParcelizer + 47;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i5 % 2 != 0;
            }
            int i6 = IconCompatParcelizer;
            int i7 = i6 + 15;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = i6 + 37;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                int i10 = 3 / 0;
            }
            return false;
        }
        int i11 = i2 + 73;
        RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i11 % 2 != 0;
    }
}
