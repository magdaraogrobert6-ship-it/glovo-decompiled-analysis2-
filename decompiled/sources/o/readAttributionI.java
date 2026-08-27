package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.recentdeliveries.data.model.Score$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.readGlobalCallbackParametersI;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class readAttributionI {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String label;
    public final String question;
    public final List tags;
    public final int value;
    public static final Score$Companion Companion = new Object() { // from class: com.roadrunner.recentdeliveries.data.model.Score$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 51;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                readGlobalCallbackParametersI readglobalcallbackparametersi = readGlobalCallbackParametersI.write;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            readGlobalCallbackParametersI readglobalcallbackparametersi2 = readGlobalCallbackParametersI.write;
            int i3 = RemoteActionCompatParcelizer + 1;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return readglobalcallbackparametersi2;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new wa(24))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.recentdeliveries.data.model.Score$Companion] */
    static {
        int i = write + 65;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ readAttributionI(int i, int i2, String str, String str2, List list) {
        if (15 == (i & 15)) {
            this.value = i2;
            this.label = str;
            this.question = str2;
            this.tags = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, readGlobalCallbackParametersI.write.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String str = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(d$$ExternalSyntheticOutline0.m("Score(value=", this.value, ", label=", this.label, ", question="), this.question, ", tags=", this.tags, ")");
            int i3 = RemoteActionCompatParcelizer + 35;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return str;
        }
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(d$$ExternalSyntheticOutline0.m("Score(value=", this.value, ", label=", this.label, ", question="), this.question, ", tags=", this.tags, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.tags.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.value) * 31, 31, this.label), 31, this.question);
        int i4 = RemoteActionCompatParcelizer + 31;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.readAttributionI) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r1 = (o.readAttributionI) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r21.value == r1.value) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r12 = new java.lang.Object[]{r21.label, r1.label};
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        r1 = o.readAttributionI.IconCompatParcelizer + 77;
        o.readAttributionI.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        r19 = new java.lang.Object[]{r21.question, r1.question};
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r19 = new java.lang.Object[]{r21.tags, r1.tags};
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b1, code lost:
    
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
            int r3 = o.readAttributionI.IconCompatParcelizer
            int r3 = r3 + 5
            int r4 = r3 % 128
            o.readAttributionI.RemoteActionCompatParcelizer = r4
            int r3 = r3 % r2
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L1a
            r3 = 80
            int r3 = r3 / r5
            if (r0 != r1) goto L1d
            goto L1c
        L1a:
            if (r0 != r1) goto L1d
        L1c:
            return r4
        L1d:
            boolean r3 = r1 instanceof o.readAttributionI
            if (r3 != 0) goto L22
            return r5
        L22:
            o.readAttributionI r1 = (o.readAttributionI) r1
            int r3 = r0.value
            int r6 = r1.value
            if (r3 == r6) goto L2b
            return r5
        L2b:
            java.lang.String r3 = r0.label
            java.lang.String r6 = r1.label
            java.lang.Object[] r12 = new java.lang.Object[]{r3, r6}
            int r7 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r13 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            r3 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r6 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r8 = r3
            r9 = r6
            java.lang.Object r7 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L61
            int r1 = o.readAttributionI.IconCompatParcelizer
            int r1 = r1 + 77
            int r3 = r1 % 128
            o.readAttributionI.RemoteActionCompatParcelizer = r3
            int r1 = r1 % r2
            return r5
        L61:
            java.lang.String r2 = r0.question
            java.lang.String r7 = r1.question
            java.lang.Object[] r19 = new java.lang.Object[]{r2, r7}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            r15 = r3
            r16 = r6
            java.lang.Object r2 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L89
            return r5
        L89:
            java.util.List r2 = r0.tags
            java.util.List r1 = r1.tags
            java.lang.Object[] r19 = new java.lang.Object[]{r2, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            r15 = r3
            r16 = r6
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto Lb1
            return r5
        Lb1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.readAttributionI.equals(java.lang.Object):boolean");
    }
}
