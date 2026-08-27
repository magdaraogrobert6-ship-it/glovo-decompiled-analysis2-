package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$App$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.capitalizelambda0;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class buildAnnotatedString {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final String appId;
    public final List releases;
    public static final ManifestResponse$App$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$App$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 103;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            capitalizelambda0 capitalizelambda0Var = capitalizelambda0.read;
            int i4 = write + 67;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return capitalizelambda0Var;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ActionPropertyKey(28))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$App$Companion] */
    static {
        int i = write + 97;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 35;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.appId;
        int i5 = i2 + 5;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.releases;
        }
        int i3 = 54 / 0;
        return this.releases;
    }

    public /* synthetic */ buildAnnotatedString(List list, int i, String str) {
        if (3 == (i & 3)) {
            this.appId = str;
            this.releases = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, capitalizelambda0.read.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        String str;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str = IconCompatParcelizer.read("App(appId=", this.appId, ", releases=", this.releases, ")");
            int i3 = 76 / 0;
        } else {
            str = IconCompatParcelizer.read("App(appId=", this.appId, ", releases=", this.releases, ")");
        }
        int i4 = RemoteActionCompatParcelizer + 25;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 63;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int iHashCode2 = this.appId.hashCode();
            iHashCode = this.releases.hashCode();
            i = iHashCode2 >> 4;
        } else {
            int iHashCode3 = this.appId.hashCode();
            iHashCode = this.releases.hashCode();
            i = iHashCode3 * 31;
        }
        return iHashCode + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.buildAnnotatedString) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r1 = (o.buildAnnotatedString) r22;
        r12 = new java.lang.Object[]{r21.appId, r1.appId};
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        r1 = o.buildAnnotatedString.RemoteActionCompatParcelizer + 97;
        o.buildAnnotatedString.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        r19 = new java.lang.Object[]{r21.releases, r1.releases};
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        r1 = o.buildAnnotatedString.IconCompatParcelizer + 83;
        o.buildAnnotatedString.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
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
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = 2
            int r3 = r2 % r2
            int r3 = o.buildAnnotatedString.RemoteActionCompatParcelizer
            int r3 = r3 + 123
            int r4 = r3 % 128
            o.buildAnnotatedString.IconCompatParcelizer = r4
            int r3 = r3 % r2
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L1a
            r3 = 82
            int r3 = r3 / r5
            if (r0 != r1) goto L1d
            goto L1c
        L1a:
            if (r0 != r1) goto L1d
        L1c:
            return r4
        L1d:
            boolean r3 = r1 instanceof o.buildAnnotatedString
            if (r3 != 0) goto L22
            return r5
        L22:
            o.buildAnnotatedString r1 = (o.buildAnnotatedString) r1
            java.lang.String r3 = r0.appId
            java.lang.String r6 = r1.appId
            java.lang.Object[] r12 = new java.lang.Object[]{r3, r6}
            int r7 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r13 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            r15 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r16 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r8 = r15
            r9 = r16
            java.lang.Object r3 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L5b
            int r1 = o.buildAnnotatedString.RemoteActionCompatParcelizer
            int r1 = r1 + 97
            int r3 = r1 % 128
            o.buildAnnotatedString.IconCompatParcelizer = r3
            int r1 = r1 % r2
            return r5
        L5b:
            java.util.List r3 = r0.releases
            java.util.List r1 = r1.releases
            java.lang.Object[] r19 = new java.lang.Object[]{r3, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L89
            int r1 = o.buildAnnotatedString.IconCompatParcelizer
            int r1 = r1 + 83
            int r3 = r1 % 128
            o.buildAnnotatedString.RemoteActionCompatParcelizer = r3
            int r1 = r1 % r2
            return r5
        L89:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.buildAnnotatedString.equals(java.lang.Object):boolean");
    }
}
