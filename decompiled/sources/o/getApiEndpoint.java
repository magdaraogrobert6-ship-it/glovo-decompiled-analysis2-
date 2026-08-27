package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.startworking.data.startworking.oneclick.PolicyLabel$Companion;
import kotlinx.serialization.Serializable;
import o.getCachedContentCardslambda0;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getApiEndpoint {
    public static final PolicyLabel$Companion Companion = new Object() { // from class: com.roadrunner.startworking.data.startworking.oneclick.PolicyLabel$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 25;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getCachedContentCardslambda0 getcachedcontentcardslambda0 = getCachedContentCardslambda0.read;
            int i4 = write + 55;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return getcachedcontentcardslambda0;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String hyperlinkText;
    public final String text;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.startworking.data.startworking.oneclick.PolicyLabel$Companion] */
    static {
        int i = write + 61;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getApiEndpoint(int i, String str, String str2, String str3) {
        if (1 == (i & 1)) {
            this.text = str;
            if ((i & 2) == 0) {
                this.url = null;
                int i2 = IconCompatParcelizer + 15;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
            } else {
                this.url = str2;
            }
            int i4 = 2 % 2;
            if ((i & 4) != 0) {
                this.hyperlinkText = str3;
                return;
            }
            int i5 = RemoteActionCompatParcelizer + 47;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                this.hyperlinkText = null;
                return;
            } else {
                this.hyperlinkText = null;
                throw null;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getCachedContentCardslambda0.read.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PolicyLabel(text=", this.text, ", url=", this.url, ", hyperlinkText="), this.hyperlinkText, ")");
        int i4 = RemoteActionCompatParcelizer + 77;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        String str;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = 0;
        int iHashCode3 = 1;
        if (i2 % 2 == 0) {
            iHashCode = this.text.hashCode();
            str = this.url;
            if (str == null) {
                iHashCode2 = 1;
                int i4 = RemoteActionCompatParcelizer + 17;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i3 = i4 % 2 == 0 ? iHashCode3 : 0;
            } else {
                i3 = 1;
                iHashCode3 = str.hashCode();
                iHashCode2 = i3;
            }
        } else {
            iHashCode = this.text.hashCode();
            str = this.url;
            if (str == null) {
                iHashCode2 = 0;
                int i5 = RemoteActionCompatParcelizer + 17;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                }
            } else {
                iHashCode3 = str.hashCode();
                iHashCode2 = i3;
            }
        }
        String str2 = this.hyperlinkText;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
            int i6 = IconCompatParcelizer + 45;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 2 / 4;
            }
        }
        return (((iHashCode * 31) + i3) * 31) + iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getApiEndpoint)) {
            return false;
        }
        getApiEndpoint getapiendpoint = (getApiEndpoint) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, getapiendpoint.text}, getCieXyz.write())).booleanValue()) {
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, getapiendpoint.url}, getCieXyz.write())).booleanValue())) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hyperlinkText, getapiendpoint.hyperlinkText}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = RemoteActionCompatParcelizer + 3;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = RemoteActionCompatParcelizer + 63;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = RemoteActionCompatParcelizer + 21;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
