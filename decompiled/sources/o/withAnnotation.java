package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.remote.dto.ReleasesResponse$Route$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.toUpperCase;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class withAnnotation {
    public static final ReleasesResponse$Route$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.remote.dto.ReleasesResponse$Route$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 1;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return toUpperCase.IconCompatParcelizer;
            }
            toUpperCase touppercase = toUpperCase.IconCompatParcelizer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final boolean mainFrameOnly;
    public final String serveArtifactId;
    public final String servePath;
    public final String serveSha256;
    public final String urlPattern;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.remote.dto.ReleasesResponse$Route$Companion] */
    static {
        int i = write + 99;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 111;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String str = this.serveSha256;
        int i5 = i3 + 23;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return str;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = serializer + 59;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.urlPattern;
        int i5 = i3 + 109;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = read + 89;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serveArtifactId;
        }
        int i3 = 84 / 0;
        return this.serveArtifactId;
    }

    public /* synthetic */ withAnnotation(int i, String str, String str2, String str3, String str4, boolean z) {
        if (31 == (i & 31)) {
            this.urlPattern = str;
            this.mainFrameOnly = z;
            this.serveArtifactId = str2;
            this.servePath = str3;
            this.serveSha256 = str4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, toUpperCase.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 9;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("Route(urlPattern=", this.urlPattern, ", mainFrameOnly=", ", serveArtifactId=", this.mainFrameOnly);
        c8$$ExternalSyntheticOutline0.m(sbM, this.serveArtifactId, ", servePath=", this.servePath, ", serveSha256=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.serveSha256, ")");
        int i4 = read + 93;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 11;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serveSha256.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.urlPattern.hashCode() * 31, 31, this.mainFrameOnly), 31, this.serveArtifactId), 31, this.servePath);
        int i4 = read + 97;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof withAnnotation)) {
            return false;
        }
        withAnnotation withannotation = (withAnnotation) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.urlPattern, withannotation.urlPattern}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.mainFrameOnly == withannotation.mainFrameOnly) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serveArtifactId, withannotation.serveArtifactId}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.servePath, withannotation.servePath}, getCieXyz.write())).booleanValue()) {
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serveSha256, withannotation.serveSha256}, getCieXyz.write())).booleanValue();
                }
                int i2 = serializer + 39;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = serializer + 31;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = read + 49;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 0 / 0;
        }
        return false;
    }
}
