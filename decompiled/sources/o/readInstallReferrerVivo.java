package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.recentdeliveries.data.model.VendorReviewConfig$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.readInstallReferrerSamsung;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class readInstallReferrerVivo {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final VendorReviewConfig$Companion Companion = new Object() { // from class: com.roadrunner.recentdeliveries.data.model.VendorReviewConfig$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 53;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return readInstallReferrerSamsung.serializer;
            }
            readInstallReferrerSamsung readinstallreferrersamsung = readInstallReferrerSamsung.serializer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final List scores;
    public final List tags;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.recentdeliveries.data.model.VendorReviewConfig$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new wa(25)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new wa(26))};
        int i = serializer + 115;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ readInstallReferrerVivo(List list, List list2, int i) {
        if (3 == (i & 3)) {
            this.scores = list;
            this.tags = list2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, readInstallReferrerSamsung.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 99;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int iHashCode2 = this.scores.hashCode();
            iHashCode = this.tags.hashCode();
            i = iHashCode2 + 103;
        } else {
            int iHashCode3 = this.scores.hashCode();
            iHashCode = this.tags.hashCode();
            i = iHashCode3 * 31;
        }
        return iHashCode + i;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "VendorReviewConfig(scores=" + this.scores + ", tags=" + this.tags + ")";
        int i2 = read + 5;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.readInstallReferrerVivo) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r1 = (o.readInstallReferrerVivo) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.scores, r1.scores}, o.getCieXyz.write())).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.tags, r1.tags}, o.getCieXyz.write())).booleanValue()) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r1 = o.readInstallReferrerVivo.RemoteActionCompatParcelizer + 73;
        o.readInstallReferrerVivo.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
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
            int r3 = o.readInstallReferrerVivo.RemoteActionCompatParcelizer
            int r3 = r3 + 115
            int r4 = r3 % 128
            o.readInstallReferrerVivo.read = r4
            int r3 = r3 % r2
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L1a
            r3 = 34
            int r3 = r3 / r5
            if (r0 != r1) goto L1d
            goto L1c
        L1a:
            if (r0 != r1) goto L1d
        L1c:
            return r4
        L1d:
            boolean r3 = r1 instanceof o.readInstallReferrerVivo
            if (r3 != 0) goto L22
            return r5
        L22:
            o.readInstallReferrerVivo r1 = (o.readInstallReferrerVivo) r1
            java.util.List r3 = r0.scores
            java.util.List r6 = r1.scores
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
            if (r3 != 0) goto L52
            return r5
        L52:
            java.util.List r3 = r0.tags
            java.util.List r1 = r1.tags
            java.lang.Object[] r19 = new java.lang.Object[]{r3, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r4
            if (r1 == 0) goto L78
            return r5
        L78:
            int r1 = o.readInstallReferrerVivo.RemoteActionCompatParcelizer
            int r1 = r1 + 73
            int r3 = r1 % 128
            o.readInstallReferrerVivo.read = r3
            int r1 = r1 % r2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.readInstallReferrerVivo.equals(java.lang.Object):boolean");
    }
}
