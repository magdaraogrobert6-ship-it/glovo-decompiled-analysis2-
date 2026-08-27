package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreenResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.drawBitmap;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class get_nativeCanvasui_textannotations {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final getLineBreakStyle data;
    public final List events;
    public static final LastStopScreenResponse$Companion Companion = new Object() { // from class: com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreenResponse$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 3;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            drawBitmap drawbitmap = drawBitmap.read;
            int i4 = read + 55;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 14 / 0;
            }
            return drawbitmap;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new accessgetAboveBaselinecp(25))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreenResponse$Companion] */
    static {
        int i = serializer + 5;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final getLineBreakStyle serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        getLineBreakStyle getlinebreakstyle = this.data;
        int i4 = i3 + 73;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getlinebreakstyle;
    }

    public /* synthetic */ get_nativeCanvasui_textannotations(int i, getLineBreakStyle getlinebreakstyle, List list) {
        if ((i & 1) == 0) {
            int i2 = 2 % 2;
            getlinebreakstyle = null;
        }
        this.data = getlinebreakstyle;
        if ((i & 2) != 0) {
            this.events = list;
            int i3 = IconCompatParcelizer + 75;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        this.events = instance_delegatelambda0.write;
        int i5 = RemoteActionCompatParcelizer + 23;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 49;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        getLineBreakStyle getlinebreakstyle = this.data;
        int iHashCode = this.events.hashCode() + ((getlinebreakstyle == null ? 0 : getlinebreakstyle.components.hashCode()) * 31);
        int i3 = RemoteActionCompatParcelizer + 47;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "LastStopScreenResponse(data=" + this.data + ", events=" + this.events + ")";
        int i2 = IconCompatParcelizer + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if ((r23 instanceof o.get_nativeCanvasui_textannotations) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r3 = r3 + 83;
        o.get_nativeCanvasui_textannotations.IconCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r1 = (o.get_nativeCanvasui_textannotations) r23;
        r13 = new java.lang.Object[]{r22.data, r1.data};
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r13, o.getCieXyz.write())).booleanValue() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        r1 = o.get_nativeCanvasui_textannotations.IconCompatParcelizer + 27;
        o.get_nativeCanvasui_textannotations.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        r20 = new java.lang.Object[]{r22.events, r1.events};
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r20, o.getCieXyz.write())).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        r1 = o.get_nativeCanvasui_textannotations.IconCompatParcelizer + 107;
        o.get_nativeCanvasui_textannotations.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r22 == r23) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r22 == r23) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r5 = r5 + 61;
        o.get_nativeCanvasui_textannotations.RemoteActionCompatParcelizer = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if ((r5 % 2) != 0) goto L11;
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
            int r3 = o.get_nativeCanvasui_textannotations.RemoteActionCompatParcelizer
            int r4 = r3 + 33
            int r5 = r4 % 128
            o.get_nativeCanvasui_textannotations.IconCompatParcelizer = r5
            int r4 = r4 % r2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L1a
            r4 = 62
            int r4 = r4 / r7
            if (r0 != r1) goto L27
            goto L1c
        L1a:
            if (r0 != r1) goto L27
        L1c:
            int r5 = r5 + 61
            int r1 = r5 % 128
            o.get_nativeCanvasui_textannotations.RemoteActionCompatParcelizer = r1
            int r5 = r5 % r2
            if (r5 != 0) goto L26
            return r7
        L26:
            return r6
        L27:
            boolean r4 = r1 instanceof o.get_nativeCanvasui_textannotations
            if (r4 != 0) goto L33
            int r3 = r3 + 83
            int r1 = r3 % 128
            o.get_nativeCanvasui_textannotations.IconCompatParcelizer = r1
            int r3 = r3 % r2
            return r7
        L33:
            o.get_nativeCanvasui_textannotations r1 = (o.get_nativeCanvasui_textannotations) r1
            o.getLineBreakStyle r3 = r0.data
            o.getLineBreakStyle r4 = r1.data
            java.lang.Object[] r13 = new java.lang.Object[]{r3, r4}
            int r8 = o.getCieXyz.write()
            int r12 = o.getCieXyz.write()
            int r14 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            r16 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r17 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r9 = r16
            r10 = r17
            java.lang.Object r3 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r8, r9, r10, r11, r12, r13, r14)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L6d
            int r1 = o.get_nativeCanvasui_textannotations.IconCompatParcelizer
            int r1 = r1 + 27
            int r3 = r1 % 128
            o.get_nativeCanvasui_textannotations.RemoteActionCompatParcelizer = r3
            int r1 = r1 % r2
            return r7
        L6d:
            java.util.List r3 = r0.events
            java.util.List r1 = r1.events
            java.lang.Object[] r20 = new java.lang.Object[]{r3, r1}
            int r15 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r21 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L9b
            int r1 = o.get_nativeCanvasui_textannotations.IconCompatParcelizer
            int r1 = r1 + 107
            int r3 = r1 % 128
            o.get_nativeCanvasui_textannotations.RemoteActionCompatParcelizer = r3
            int r1 = r1 % r2
            return r7
        L9b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.get_nativeCanvasui_textannotations.equals(java.lang.Object):boolean");
    }
}
