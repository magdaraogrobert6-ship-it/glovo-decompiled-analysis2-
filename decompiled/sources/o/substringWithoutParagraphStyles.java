package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.remote.dto.ReleasesResponse$Module$Artifact$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.withLink;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class substringWithoutParagraphStyles {
    public static final ReleasesResponse$Module$Artifact$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.remote.dto.ReleasesResponse$Module$Artifact$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 31;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            withLink withlink = withLink.write;
            int i4 = RemoteActionCompatParcelizer + 13;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return withlink;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String artifactId;
    public final String contentType;
    public final String downloadPath;
    public final boolean isCriticalArtifact;
    public final String kind;
    public final String path;
    public final String sha256;
    public final long sizeBytes;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.remote.dto.ReleasesResponse$Module$Artifact$Companion] */
    static {
        int i = read + 123;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 41 / 0;
        }
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 91;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String str = this.sha256;
        int i5 = i3 + 1;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.downloadPath;
        int i4 = i3 + 77;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 41;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.path;
        int i5 = i2 + 95;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String serializer() {
        String str;
        int i = 2 % 2;
        int i2 = write + 11;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            str = this.artifactId;
            int i4 = 68 / 0;
        } else {
            str = this.artifactId;
        }
        int i5 = i3 + 97;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.contentType;
        int i5 = i3 + 117;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ substringWithoutParagraphStyles(int i, String str, String str2, boolean z, String str3, String str4, String str5, String str6, long j) {
        if (255 == (i & 255)) {
            this.artifactId = str;
            this.kind = str2;
            this.isCriticalArtifact = z;
            this.path = str3;
            this.downloadPath = str4;
            this.contentType = str5;
            this.sha256 = str6;
            this.sizeBytes = j;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 255, withLink.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 99;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.sizeBytes) + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.artifactId.hashCode() * 31, 31, this.kind), 31, this.isCriticalArtifact), 31, this.path), 31, this.downloadPath), 31, this.contentType), 31, this.sha256);
        int i4 = serializer + 37;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Artifact(artifactId=", this.artifactId, ", kind=", this.kind, ", isCriticalArtifact=");
        IconCompatParcelizer.RemoteActionCompatParcelizer(", path=", this.path, ", downloadPath=", sbM, this.isCriticalArtifact);
        c8$$ExternalSyntheticOutline0.m(sbM, this.downloadPath, ", contentType=", this.contentType, ", sha256=");
        sbM.append(this.sha256);
        sbM.append(", sizeBytes=");
        sbM.append(this.sizeBytes);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = serializer + 117;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof substringWithoutParagraphStyles)) {
                int i2 = write + 87;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            substringWithoutParagraphStyles substringwithoutparagraphstyles = (substringWithoutParagraphStyles) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.artifactId, substringwithoutparagraphstyles.artifactId}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.kind, substringwithoutparagraphstyles.kind}, getCieXyz.write())).booleanValue() || this.isCriticalArtifact != substringwithoutparagraphstyles.isCriticalArtifact) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.path, substringwithoutparagraphstyles.path}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.downloadPath, substringwithoutparagraphstyles.downloadPath}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.contentType, substringwithoutparagraphstyles.contentType}, getCieXyz.write())).booleanValue()) {
                    int i4 = serializer + 105;
                    int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    write = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 87;
                    serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        return false;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sha256, substringwithoutparagraphstyles.sha256}, getCieXyz.write())).booleanValue()) {
                    int i8 = write + 105;
                    serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return false;
                }
                if (this.sizeBytes == substringwithoutparagraphstyles.sizeBytes) {
                    return true;
                }
                int i10 = write + 99;
                serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return false;
            }
            int i12 = write + 75;
            serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i12 % 2 == 0;
        }
        int i13 = serializer + 5;
        write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i13 % 2 == 0;
    }
}
