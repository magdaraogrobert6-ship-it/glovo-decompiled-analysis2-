package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.pudo.Instruction$SplitOrder$OtherRider$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getPopupContentSizebOM6tXw;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setParentLayoutDirection {
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String name;
    public final String phoneNumber;
    public final String title;
    public final List trackingEvents;
    public static final Instruction$SplitOrder$OtherRider$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.Instruction$SplitOrder$OtherRider$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 81;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getPopupContentSizebOM6tXw getpopupcontentsizebom6txw = getPopupContentSizebOM6tXw.RemoteActionCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 9;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return getpopupcontentsizebom6txw;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(15))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.pudo.Instruction$SplitOrder$OtherRider$Companion] */
    static {
        int i = serializer + 105;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ setParentLayoutDirection(int i, String str, String str2, String str3, List list) {
        if (3 == (i & 3)) {
            this.title = str;
            this.name = str2;
            if ((i & 4) == 0) {
                this.phoneNumber = null;
                int i2 = IconCompatParcelizer + 53;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } else {
                this.phoneNumber = str3;
            }
            if ((i & 8) != 0) {
                this.trackingEvents = list;
                return;
            }
            int i4 = IconCompatParcelizer + 119;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            this.trackingEvents = null;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getPopupContentSizebOM6tXw.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(c8$$ExternalSyntheticOutline0.m("OtherRider(title=", this.title, ", name=", this.name, ", phoneNumber="), this.phoneNumber, ", trackingEvents=", this.trackingEvents, ")");
        }
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(c8$$ExternalSyntheticOutline0.m("OtherRider(title=", this.title, ", name=", this.name, ", phoneNumber="), this.phoneNumber, ", trackingEvents=", this.trackingEvents, ")");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0049 A[PHI: r1 r4
  0x0049: PHI (r1v13 int) = (r1v7 int), (r1v17 int) binds: [B:8:0x0035, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0049: PHI (r4v6 java.lang.String) = (r4v1 java.lang.String), (r4v8 java.lang.String) binds: [B:8:0x0035, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[PHI: r1
  0x0037: PHI (r1v8 int) = (r1v7 int), (r1v17 int) binds: [B:8:0x0035, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.title.hashCode() >> 48, 47, this.name);
            str = this.phoneNumber;
            if (str == null) {
                int i3 = write;
                int i4 = i3 + 23;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i3 + 121;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.name);
            str = this.phoneNumber;
            if (str == null) {
                int i8 = write;
                int i9 = i8 + 23;
                IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                int i11 = i8 + 121;
                IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        }
        List list = this.trackingEvents;
        return ((iM + iHashCode) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if ((!(r22 instanceof o.setParentLayoutDirection)) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r1 = (o.setParentLayoutDirection) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.title, r1.title}, o.getCieXyz.write())).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.name, r1.name}, o.getCieXyz.write())).booleanValue() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        r1 = o.setParentLayoutDirection.write + 55;
        o.setParentLayoutDirection.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b6, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.phoneNumber, r1.phoneNumber}, o.getCieXyz.write())).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00de, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.trackingEvents, r1.trackingEvents}, o.getCieXyz.write())).booleanValue() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e0, code lost:
    
        r1 = o.setParentLayoutDirection.IconCompatParcelizer + 95;
        o.setParentLayoutDirection.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ea, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r1 = r3 + 83;
        o.setParentLayoutDirection.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
        r3 = r3 + 11;
        o.setParentLayoutDirection.IconCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setParentLayoutDirection.equals(java.lang.Object):boolean");
    }
}
