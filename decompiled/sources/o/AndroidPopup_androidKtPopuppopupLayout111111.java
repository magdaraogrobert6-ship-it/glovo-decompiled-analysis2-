package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$DetailComponent$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidPopup_androidKtSimpleStack11;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AndroidPopup_androidKtPopuppopupLayout111111 {
    public static final StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$DetailComponent$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$DetailComponent$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 13;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return AndroidPopup_androidKtSimpleStack11.read;
            }
            int i3 = 63 / 0;
            return AndroidPopup_androidKtSimpleStack11.read;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String description;
    public final String disabledDescription;
    public final String title;
    public final String toggleTitle;
    public final String type;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$DetailComponent$Companion] */
    static {
        int i = read + 49;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ AndroidPopup_androidKtPopuppopupLayout111111(int i, String str, String str2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
            int i2 = write + 91;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = 2 % 2;
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            int i5 = RemoteActionCompatParcelizer + 119;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i & 8) == 0) {
            this.toggleTitle = null;
            int i7 = RemoteActionCompatParcelizer + 35;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
        } else {
            this.toggleTitle = str4;
        }
        if ((i & 16) == 0) {
            this.disabledDescription = null;
        } else {
            this.disabledDescription = str5;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DetailComponent(type=", this.type, ", title=", this.title, ", description=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.description, ", toggleTitle=", this.toggleTitle, ", disabledDescription=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.disabledDescription, ")");
        int i4 = RemoteActionCompatParcelizer + 13;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        int i;
        int iHashCode2;
        int iHashCode3;
        int i2 = 2 % 2;
        int i3 = write + 105;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode4 = 1;
        if (i3 % 2 != 0) {
            str = this.type;
            if (str == null) {
                i = 1;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 1;
                iHashCode2 = str.hashCode();
            }
        } else {
            str = this.type;
            if (str == null) {
                i = 0;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 0;
                iHashCode2 = str.hashCode();
            }
        }
        String str2 = this.title;
        if (str2 == null) {
            int i4 = write + 9;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str2.hashCode();
        }
        String str3 = this.description;
        if (str3 == null) {
            int i6 = write + 25;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                iHashCode4 = 0;
            }
        } else {
            iHashCode4 = str3.hashCode();
        }
        String str4 = this.toggleTitle;
        int iHashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.disabledDescription;
        if (str5 != null) {
            iHashCode = str5.hashCode();
            int i7 = write + 13;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        int i9 = (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
        int i10 = write + 103;
        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return i9;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidPopup_androidKtPopuppopupLayout111111)) {
            return false;
        }
        AndroidPopup_androidKtPopuppopupLayout111111 androidPopup_androidKtPopuppopupLayout111111 = (AndroidPopup_androidKtPopuppopupLayout111111) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, androidPopup_androidKtPopuppopupLayout111111.type}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, androidPopup_androidKtPopuppopupLayout111111.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, androidPopup_androidKtPopuppopupLayout111111.description}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.toggleTitle, androidPopup_androidKtPopuppopupLayout111111.toggleTitle}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.disabledDescription, androidPopup_androidKtPopuppopupLayout111111.disabledDescription}, getCieXyz.write())).booleanValue()) {
                int i2 = write + 103;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = write + 111;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = write + 29;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
