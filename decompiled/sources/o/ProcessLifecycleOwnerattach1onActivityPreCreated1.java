package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.nest.api.data.LastStop$LastStopDetails$Companion;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.ProcessLifecycleOwnerattach1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ProcessLifecycleOwnerattach1onActivityPreCreated1 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final Map data;
    public final String url;
    public static final LastStop$LastStopDetails$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.LastStop$LastStopDetails$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 37;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ProcessLifecycleOwnerattach1 processLifecycleOwnerattach1 = ProcessLifecycleOwnerattach1.IconCompatParcelizer;
            int i4 = read + 75;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return processLifecycleOwnerattach1;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RoomDatabaseExternalSyntheticLambda4(8))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.LastStop$LastStopDetails$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 49;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 94 / 0;
        }
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.url;
        }
        int i3 = 28 / 0;
        return this.url;
    }

    public /* synthetic */ ProcessLifecycleOwnerattach1onActivityPreCreated1(int i, String str, Map map) {
        if (3 == (i & 3)) {
            this.url = str;
            this.data = map;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, ProcessLifecycleOwnerattach1.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.data.hashCode() + (this.url.hashCode() * 31);
        int i4 = read + 61;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "LastStopDetails(url=" + this.url + ", data=" + this.data + ")";
        int i2 = IconCompatParcelizer + 109;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if ((r22 instanceof o.ProcessLifecycleOwnerattach1onActivityPreCreated1) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        r1 = (o.ProcessLifecycleOwnerattach1onActivityPreCreated1) r22;
        r12 = new java.lang.Object[]{r21.url, r1.url};
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        r19 = new java.lang.Object[]{r21.data, r1.data};
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() == true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        r1 = o.ProcessLifecycleOwnerattach1onActivityPreCreated1.read + 7;
        o.ProcessLifecycleOwnerattach1onActivityPreCreated1.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r4 = r4 + 89;
        o.ProcessLifecycleOwnerattach1onActivityPreCreated1.IconCompatParcelizer = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if ((r4 % 2) != 0) goto L23;
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
            int r3 = o.ProcessLifecycleOwnerattach1onActivityPreCreated1.IconCompatParcelizer
            int r3 = r3 + 117
            int r4 = r3 % 128
            o.ProcessLifecycleOwnerattach1onActivityPreCreated1.read = r4
            int r3 = r3 % r2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L1a
            r3 = 13
            int r3 = r3 / r6
            if (r0 != r1) goto L27
            goto L1c
        L1a:
            if (r0 != r1) goto L27
        L1c:
            int r4 = r4 + 89
            int r1 = r4 % 128
            o.ProcessLifecycleOwnerattach1onActivityPreCreated1.IconCompatParcelizer = r1
            int r4 = r4 % r2
            if (r4 != 0) goto L26
            r5 = r6
        L26:
            return r5
        L27:
            boolean r3 = r1 instanceof o.ProcessLifecycleOwnerattach1onActivityPreCreated1
            if (r3 != 0) goto L2c
            return r6
        L2c:
            o.ProcessLifecycleOwnerattach1onActivityPreCreated1 r1 = (o.ProcessLifecycleOwnerattach1onActivityPreCreated1) r1
            java.lang.String r3 = r0.url
            java.lang.String r4 = r1.url
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
            if (r3 != 0) goto L5c
            return r6
        L5c:
            java.util.Map r3 = r0.data
            java.util.Map r1 = r1.data
            java.lang.Object[] r19 = new java.lang.Object[]{r3, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == r5) goto L8a
            int r1 = o.ProcessLifecycleOwnerattach1onActivityPreCreated1.read
            int r1 = r1 + 7
            int r3 = r1 % 128
            o.ProcessLifecycleOwnerattach1onActivityPreCreated1.IconCompatParcelizer = r3
            int r1 = r1 % r2
            return r6
        L8a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ProcessLifecycleOwnerattach1onActivityPreCreated1.equals(java.lang.Object):boolean");
    }
}
