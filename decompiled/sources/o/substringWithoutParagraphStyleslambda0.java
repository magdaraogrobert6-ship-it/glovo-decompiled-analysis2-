package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.remote.dto.ReleasesResponse$Module$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.toLowerCaselambda0;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class substringWithoutParagraphStyleslambda0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final List artifacts;
    public final String moduleId;
    public final String name;
    public final String role;
    public final String version;
    public static final ReleasesResponse$Module$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.remote.dto.ReleasesResponse$Module$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            toLowerCaselambda0 tolowercaselambda0;
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 45;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                tolowercaselambda0 = toLowerCaselambda0.IconCompatParcelizer;
                int i3 = 43 / 0;
            } else {
                tolowercaselambda0 = toLowerCaselambda0.IconCompatParcelizer;
            }
            int i4 = RemoteActionCompatParcelizer + 61;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return tolowercaselambda0;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new accessgetAboveBaselinecp(5))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.remote.dto.ReleasesResponse$Module$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 107;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final List serializer() {
        int i = 2 % 2;
        int i2 = serializer + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.artifacts;
        }
        throw null;
    }

    public /* synthetic */ substringWithoutParagraphStyleslambda0(int i, String str, String str2, String str3, String str4, List list) {
        if (31 == (i & 31)) {
            this.moduleId = str;
            this.name = str2;
            this.version = str3;
            this.role = str4;
            this.artifacts = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, toLowerCaselambda0.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 55;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Module(moduleId=", this.moduleId, ", name=", this.name, ", version=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.version, ", role=", this.role, ", artifacts=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.artifacts, ")");
        int i4 = serializer + 109;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 115;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.artifacts.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.moduleId.hashCode() * 31, 31, this.name), 31, this.version), 31, this.role);
        int i4 = serializer + 35;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.substringWithoutParagraphStyleslambda0) == true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r4 = r4 + 81;
        o.substringWithoutParagraphStyleslambda0.write = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r1 = (o.substringWithoutParagraphStyleslambda0) r22;
        r12 = new java.lang.Object[]{r21.moduleId, r1.moduleId};
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        r1 = o.substringWithoutParagraphStyleslambda0.write + 103;
        o.substringWithoutParagraphStyleslambda0.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        r19 = new java.lang.Object[]{r21.name, r1.name};
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        r1 = o.substringWithoutParagraphStyleslambda0.write + 9;
        o.substringWithoutParagraphStyleslambda0.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        r19 = new java.lang.Object[]{r21.version, r1.version};
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b7, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b9, code lost:
    
        r1 = o.substringWithoutParagraphStyleslambda0.serializer + 111;
        o.substringWithoutParagraphStyleslambda0.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c2, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
    
        r19 = new java.lang.Object[]{r21.role, r1.role};
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e8, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ea, code lost:
    
        r1 = o.substringWithoutParagraphStyleslambda0.serializer + 89;
        o.substringWithoutParagraphStyleslambda0.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f4, code lost:
    
        r19 = new java.lang.Object[]{r21.artifacts, r1.artifacts};
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0119, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011c, code lost:
    
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
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.substringWithoutParagraphStyleslambda0.equals(java.lang.Object):boolean");
    }
}
