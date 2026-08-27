package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheMetadataEntry$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.subSequence;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getUrlAnnotations {
    public static final ChatAssetCacheMetadataEntry$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheMetadataEntry$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 73;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            subSequence subsequence = subSequence.RemoteActionCompatParcelizer;
            int i4 = write + 95;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return subsequence;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final String contentType;
    public final String id;
    public final String localFileName;
    public final String path;
    public final String sha256;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheMetadataEntry$Companion] */
    static {
        int i = write + 3;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.sha256;
        }
        throw null;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 23;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.localFileName;
        }
        throw null;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 31;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.contentType;
        }
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 15;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.path;
        int i5 = i2 + 97;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ getUrlAnnotations(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 == (i & 31)) {
            this.id = str;
            this.path = str2;
            this.sha256 = str3;
            this.contentType = str4;
            this.localFileName = str5;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, subSequence.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public getUrlAnnotations(String str, String str2, String str3, String str4, String str5) {
        d$$ExternalSyntheticOutline0.m(str, str2, str3, str4);
        this.id = str;
        this.path = str2;
        this.sha256 = str3;
        this.contentType = str4;
        this.localFileName = str5;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ChatAssetCacheMetadataEntry(id=", this.id, ", path=", this.path, ", sha256=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.sha256, ", contentType=", this.contentType, ", localFileName=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.localFileName, ")");
        int i4 = serializer + 9;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.localFileName.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.path), 31, this.sha256), 31, this.contentType);
        int i4 = serializer + 69;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.getUrlAnnotations) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r1 = (o.getUrlAnnotations) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.id, r1.id}, o.getCieXyz.write())).booleanValue() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r1 = o.getUrlAnnotations.IconCompatParcelizer + 83;
        o.getUrlAnnotations.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        if ((r1 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.path, r1.path}, o.getCieXyz.write())).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        r1 = o.getUrlAnnotations.IconCompatParcelizer + 57;
        o.getUrlAnnotations.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.sha256, r1.sha256}, o.getCieXyz.write())).booleanValue() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dc, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.contentType, r1.contentType}, o.getCieXyz.write())).booleanValue() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00de, code lost:
    
        r1 = o.getUrlAnnotations.serializer + 23;
        o.getUrlAnnotations.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010e, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.localFileName, r1.localFileName}, o.getCieXyz.write())).booleanValue()) == true) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0110, code lost:
    
        r1 = o.getUrlAnnotations.IconCompatParcelizer + 103;
        o.getUrlAnnotations.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0119, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getUrlAnnotations.equals(java.lang.Object):boolean");
    }
}
