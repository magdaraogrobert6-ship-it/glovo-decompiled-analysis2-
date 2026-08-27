package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.RiderStateSummaryAction$Companion;
import kotlinx.serialization.Serializable;
import o.makeDexElements;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class mkdirChecked {
    public static final RiderStateSummaryAction$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.RiderStateSummaryAction$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 39;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            makeDexElements makedexelements = makeDexElements.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 27;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return makedexelements;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final Boolean confirmationRequired;
    public final String icon;
    public final String style;
    public final String text;
    public final String type;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.RiderStateSummaryAction$Companion] */
    static {
        int i = IconCompatParcelizer + 83;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x0051 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    public /* synthetic */ mkdirChecked(int i, String str, String str2, String str3, Boolean bool, String str4, String str5) {
        int i2;
        if (3 != (i & 3)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, makeDexElements.IconCompatParcelizer.getDescriptor());
            throw null;
        }
        this.text = str;
        this.type = str2;
        if ((i & 4) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
        if ((i & 8) == 0) {
            this.confirmationRequired = null;
        } else {
            this.confirmationRequired = bool;
        }
        if ((i & 16) != 0) {
            this.style = str4;
            int i3 = serializer + 55;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
            }
            if ((i & 32) == 0) {
                this.icon = str5;
                return;
            }
            this.icon = null;
            i2 = read + 119;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
        this.style = null;
        int i4 = read + 67;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = 2 % 2;
        if ((i & 32) == 0) {
            this.icon = str5;
            return;
        }
        this.icon = null;
        i2 = read + 119;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 75;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("RiderStateSummaryAction(text=", this.text, ", type=", this.type, ", url=");
        sbM.append(this.url);
        sbM.append(", confirmationRequired=");
        sbM.append(this.confirmationRequired);
        sbM.append(", style=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.style, ", icon=", this.icon, ")");
        int i4 = read + 87;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public mkdirChecked(String str, String str2, String str3, Boolean bool, String str4, String str5) {
        str.getClass();
        str2.getClass();
        this.text = str;
        this.type = str2;
        this.url = str3;
        this.confirmationRequired = bool;
        this.style = str4;
        this.icon = str5;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.text.hashCode() * 31, 31, this.type);
        String str = this.url;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Boolean bool = this.confirmationRequired;
        if (bool == null) {
            int i2 = read + 13;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
        }
        String str2 = this.style;
        if (str2 == null) {
            int i4 = serializer + 63;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i6 = serializer + 89;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        String str3 = this.icon;
        return ((((((iM + iHashCode3) * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkdirChecked)) {
            return false;
        }
        mkdirChecked mkdirchecked = (mkdirChecked) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, mkdirchecked.text}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, mkdirchecked.type}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, mkdirchecked.url}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.confirmationRequired, mkdirchecked.confirmationRequired}, getCieXyz.write())).booleanValue()) {
                    if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, mkdirchecked.style}, getCieXyz.write())).booleanValue())) {
                        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.icon, mkdirchecked.icon}, getCieXyz.write())).booleanValue();
                    }
                }
                return false;
            }
            int i2 = serializer + 49;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        int i3 = serializer + 119;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
