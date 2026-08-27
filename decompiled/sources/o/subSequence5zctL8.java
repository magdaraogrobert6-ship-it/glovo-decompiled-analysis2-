package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheMetadataRoute$Companion;
import kotlinx.serialization.Serializable;
import o.AnnotatedStringBuilder;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class subSequence5zctL8 {
    public static final ChatAssetCacheMetadataRoute$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheMetadataRoute$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 33;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AnnotatedStringBuilder annotatedStringBuilder = AnnotatedStringBuilder.read;
            int i4 = IconCompatParcelizer + 111;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 11 / 0;
            }
            return annotatedStringBuilder;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String entryArtifactId;
    public final String entryArtifactSha256;
    public final String pattern;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheMetadataRoute$Companion] */
    static {
        int i = read + 37;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = serializer + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.pattern;
        int i5 = i3 + 95;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 27;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.entryArtifactSha256;
        int i5 = i2 + 21;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ subSequence5zctL8(int i, String str, String str2, String str3) {
        if (7 == (i & 7)) {
            this.pattern = str;
            this.entryArtifactId = str2;
            this.entryArtifactSha256 = str3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, AnnotatedStringBuilder.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 119;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.entryArtifactSha256.hashCode() / af$$ExternalSyntheticOutline0.m(this.pattern.hashCode() << 62, 40, this.entryArtifactId);
        }
        return this.entryArtifactSha256.hashCode() + af$$ExternalSyntheticOutline0.m(this.pattern.hashCode() * 31, 31, this.entryArtifactId);
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = write + 49;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("ChatAssetCacheMetadataRoute(pattern=", this.pattern, ", entryArtifactId=", this.entryArtifactId, ", entryArtifactSha256="), this.entryArtifactSha256, ")");
            int i3 = 49 / 0;
        } else {
            strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("ChatAssetCacheMetadataRoute(pattern=", this.pattern, ", entryArtifactId=", this.entryArtifactId, ", entryArtifactSha256="), this.entryArtifactSha256, ")");
        }
        int i4 = write + 3;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public subSequence5zctL8(String str, String str2, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.pattern = str;
        this.entryArtifactId = str2;
        this.entryArtifactSha256 = str3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof subSequence5zctL8)) {
            return false;
        }
        subSequence5zctL8 subsequence5zctl8 = (subSequence5zctL8) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pattern, subsequence5zctl8.pattern}, getCieXyz.write())).booleanValue()) {
            int i2 = write + 117;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.entryArtifactId, subsequence5zctl8.entryArtifactId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.entryArtifactSha256, subsequence5zctl8.entryArtifactSha256}, getCieXyz.write())).booleanValue())) {
            return true;
        }
        int i4 = serializer + 39;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }
}
