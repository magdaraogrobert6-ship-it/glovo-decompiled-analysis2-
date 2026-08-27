package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.Reason$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.common.data.model.tasks.TakePicture$ImageOverlay$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.FontStyleCompanion;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class filterByClosestWeightui_text {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String iconToken;
    public final List tags;
    public final String title;
    public static final TakePicture$ImageOverlay$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.TakePicture$ImageOverlay$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 97;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            FontStyleCompanion fontStyleCompanion = FontStyleCompanion.read;
            int i4 = RemoteActionCompatParcelizer + 13;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return fontStyleCompanion;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new Reason$$ExternalSyntheticLambda0(12))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.TakePicture$ImageOverlay$Companion] */
    static {
        int i = serializer + 95;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 105;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.title;
        int i4 = i2 + 77;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 119;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.iconToken;
        int i5 = i2 + 3;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.tags;
        }
        throw null;
    }

    public /* synthetic */ filterByClosestWeightui_text(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
            int i2 = 2 % 2;
        }
        if ((i & 2) == 0) {
            this.iconToken = null;
        } else {
            this.iconToken = str2;
            int i3 = IconCompatParcelizer + 3;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        if ((i & 4) != 0) {
            this.tags = list;
            return;
        }
        int i6 = write + 17;
        int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i7;
        int i8 = i6 % 2;
        this.tags = null;
        int i9 = i7 + 17;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 97;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = MediaSessionCompatQueueItem.read(c8$$ExternalSyntheticOutline0.m("ImageOverlay(title=", this.title, ", iconToken=", this.iconToken, ", tags="), this.tags, ")");
        int i4 = IconCompatParcelizer + 35;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.title;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = IconCompatParcelizer + 77;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.iconToken;
        if (str2 == null) {
            int i3 = IconCompatParcelizer + 123;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        List list = this.tags;
        if (list != null) {
            iHashCode3 = list.hashCode();
            int i5 = IconCompatParcelizer + 85;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 3 / 5;
            }
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if ((r23 instanceof o.filterByClosestWeightui_text) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r3 = r3 + 125;
        o.filterByClosestWeightui_text.IconCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if ((r3 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        r1 = 86 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        r1 = (o.filterByClosestWeightui_text) r23;
        r13 = new java.lang.Object[]{r22.title, r1.title};
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r13, o.getCieXyz.write())).booleanValue() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        r1 = o.filterByClosestWeightui_text.IconCompatParcelizer + 91;
        o.filterByClosestWeightui_text.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if ((r1 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        r20 = new java.lang.Object[]{r22.iconToken, r1.iconToken};
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r20, o.getCieXyz.write())).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        r20 = new java.lang.Object[]{r22.tags, r1.tags};
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bf, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r20, o.getCieXyz.write())).booleanValue() == true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c2, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r22 == r23) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r22 == r23) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r5 = r5 + 69;
        o.filterByClosestWeightui_text.write = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = 2
            int r3 = r2 % r2
            int r3 = o.filterByClosestWeightui_text.write
            int r4 = r3 + 67
            int r5 = r4 % 128
            o.filterByClosestWeightui_text.IconCompatParcelizer = r5
            int r4 = r4 % r2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L1a
            r4 = 97
            int r4 = r4 / r7
            if (r0 != r1) goto L24
            goto L1c
        L1a:
            if (r0 != r1) goto L24
        L1c:
            int r5 = r5 + 69
            int r1 = r5 % 128
            o.filterByClosestWeightui_text.write = r1
            int r5 = r5 % r2
            return r6
        L24:
            boolean r4 = r1 instanceof o.filterByClosestWeightui_text
            if (r4 != 0) goto L35
            int r3 = r3 + 125
            int r1 = r3 % 128
            o.filterByClosestWeightui_text.IconCompatParcelizer = r1
            int r3 = r3 % r2
            if (r3 == 0) goto L34
            r1 = 86
            int r1 = r1 / r7
        L34:
            return r7
        L35:
            o.filterByClosestWeightui_text r1 = (o.filterByClosestWeightui_text) r1
            java.lang.String r3 = r0.title
            java.lang.String r4 = r1.title
            java.lang.Object[] r13 = new java.lang.Object[]{r3, r4}
            int r8 = o.getCieXyz.write()
            int r12 = o.getCieXyz.write()
            int r14 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            r3 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r4 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r9 = r3
            r10 = r4
            java.lang.Object r5 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r8, r9, r10, r11, r12, r13, r14)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L70
            int r1 = o.filterByClosestWeightui_text.IconCompatParcelizer
            int r1 = r1 + 91
            int r3 = r1 % 128
            o.filterByClosestWeightui_text.write = r3
            int r1 = r1 % r2
            if (r1 != 0) goto L6f
            return r6
        L6f:
            return r7
        L70:
            java.lang.String r2 = r0.iconToken
            java.lang.String r5 = r1.iconToken
            java.lang.Object[] r20 = new java.lang.Object[]{r2, r5}
            int r15 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r21 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            r16 = r3
            r17 = r4
            java.lang.Object r2 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L99
            return r7
        L99:
            java.util.List r2 = r0.tags
            java.util.List r1 = r1.tags
            java.lang.Object[] r20 = new java.lang.Object[]{r2, r1}
            int r15 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r21 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            r16 = r3
            r17 = r4
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == r6) goto Lc2
            return r7
        Lc2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.filterByClosestWeightui_text.equals(java.lang.Object):boolean");
    }
}
