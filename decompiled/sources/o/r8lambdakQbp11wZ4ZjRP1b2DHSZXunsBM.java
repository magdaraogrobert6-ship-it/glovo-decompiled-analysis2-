package o;

import com.roadrunner.sidemenu.data.model.SideMenuResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final List components;
    public final r8lambdak1a0rpdUPyOEpImrlB5GQGel8x4 photoId;
    public static final SideMenuResponse$Companion Companion = new SideMenuResponse$Companion();
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new performPushDeliveryFlushlambda1(9)), null};

    static {
        int i = RemoteActionCompatParcelizer + 75;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM(int i, List list, r8lambdak1a0rpdUPyOEpImrlB5GQGel8x4 r8lambdak1a0rpdupyoepimrlb5gqgel8x4) {
        if (1 == (i & 1)) {
            this.components = list;
            if ((i & 2) == 0) {
                this.photoId = null;
                int i2 = serializer + 75;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.photoId = r8lambdak1a0rpdupyoepimrlb5gqgel8x4;
            int i4 = read + 67;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, r8lambdak135lx_A5yFeP1me8TnbOQD4Tfc.serializer.getDescriptor());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031 A[PHI: r1 r3
  0x0031: PHI (r1v10 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r3v4 o.r8lambdak1a0rpdUPyOEpImrlB5GQGel8x4) = (r3v0 o.r8lambdak1a0rpdUPyOEpImrlB5GQGel8x4), (r3v5 o.r8lambdak1a0rpdUPyOEpImrlB5GQGel8x4) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v6 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        r8lambdak1a0rpdUPyOEpImrlB5GQGel8x4 r8lambdak1a0rpdupyoepimrlb5gqgel8x4;
        int i = 2 % 2;
        int i2 = read + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode2 = 0;
        if (i2 % 2 != 0) {
            iHashCode = this.components.hashCode();
            r8lambdak1a0rpdupyoepimrlb5gqgel8x4 = this.photoId;
            int i3 = 94 / 0;
            if (r8lambdak1a0rpdupyoepimrlb5gqgel8x4 == null) {
                int i4 = read + 85;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                iHashCode2 = r8lambdak1a0rpdupyoepimrlb5gqgel8x4.hashCode();
            }
        } else {
            iHashCode = this.components.hashCode();
            r8lambdak1a0rpdupyoepimrlb5gqgel8x4 = this.photoId;
            if (r8lambdak1a0rpdupyoepimrlb5gqgel8x4 == null) {
                int i6 = read + 85;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                iHashCode2 = r8lambdak1a0rpdupyoepimrlb5gqgel8x4.hashCode();
            }
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SideMenuResponse(components=" + this.components + ", photoId=" + this.photoId + ")";
        int i2 = serializer + 59;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r3 = r3 + 69;
        o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM.read = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r1 = (o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM) r22;
        r12 = new java.lang.Object[]{r21.components, r1.components};
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r19 = new java.lang.Object[]{r21.photoId, r1.photoId};
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() == true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        r1 = o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM.serializer + 7;
        o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if ((r1 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
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
            int r3 = o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM.serializer
            int r4 = r3 + 23
            int r5 = r4 % 128
            o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM.read = r5
            int r4 = r4 % r2
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L1a
            r4 = 72
            int r4 = r4 / r6
            if (r0 != r1) goto L1d
            goto L1c
        L1a:
            if (r0 != r1) goto L1d
        L1c:
            return r5
        L1d:
            boolean r4 = r1 instanceof o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM
            if (r4 != 0) goto L29
            int r3 = r3 + 69
            int r1 = r3 % 128
            o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM.read = r1
            int r3 = r3 % r2
            return r6
        L29:
            o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM r1 = (o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM) r1
            java.util.List r3 = r0.components
            java.util.List r4 = r1.components
            java.lang.Object[] r12 = new java.lang.Object[]{r3, r4}
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
            if (r3 != 0) goto L59
            return r6
        L59:
            o.r8lambdak1a0rpdUPyOEpImrlB5GQGel8x4 r3 = r0.photoId
            o.r8lambdak1a0rpdUPyOEpImrlB5GQGel8x4 r1 = r1.photoId
            java.lang.Object[] r19 = new java.lang.Object[]{r3, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == r5) goto L8a
            int r1 = o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM.serializer
            int r1 = r1 + 7
            int r3 = r1 % 128
            o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM.read = r3
            int r1 = r1 % r2
            if (r1 != 0) goto L89
            return r5
        L89:
            return r6
        L8a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM.equals(java.lang.Object):boolean");
    }
}
