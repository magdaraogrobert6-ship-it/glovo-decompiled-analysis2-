package o;

import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda4xemsQi_rXvuhFGMMjGIfxFd9k implements r8lambda55q2_ohlbc4LGzu4K9wd7pcC14s {
    private static int RatingCompat = 1;
    private static int read;
    public final ArrayList IconCompatParcelizer;
    public final Integer RemoteActionCompatParcelizer;
    public final InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet serializer;
    public final String write;

    public r8lambda4xemsQi_rXvuhFGMMjGIfxFd9k(String str, Integer num, ArrayList arrayList, InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet) {
        str.getClass();
        this.write = str;
        this.RemoteActionCompatParcelizer = num;
        this.IconCompatParcelizer = arrayList;
        this.serializer = instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031 A[PHI: r1 r3
  0x0031: PHI (r1v15 int) = (r1v5 int), (r1v17 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r3v6 java.lang.Integer) = (r3v0 java.lang.Integer), (r3v7 java.lang.Integer) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v6 int) = (r1v5 int), (r1v17 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        Integer num;
        int i = 2 % 2;
        int i2 = RatingCompat + 23;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode2 = 0;
        if (i2 % 2 != 0) {
            iHashCode = this.write.hashCode();
            num = this.RemoteActionCompatParcelizer;
            int i3 = 33 / 0;
            if (num == null) {
                int i4 = RatingCompat + 5;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                iHashCode2 = num.hashCode();
            }
        } else {
            iHashCode = this.write.hashCode();
            num = this.RemoteActionCompatParcelizer;
            if (num == null) {
                int i6 = RatingCompat + 5;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                iHashCode2 = num.hashCode();
            }
        }
        int iHashCode3 = this.serializer.hashCode() + r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.IconCompatParcelizer, ((iHashCode * 31) + iHashCode2) * 31, 31);
        int i8 = read + 59;
        RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SplitOrderInstruction(title=" + this.write + ", icon=" + this.RemoteActionCompatParcelizer + ", otherRiders=" + this.IconCompatParcelizer + ", actionSheet=" + this.serializer + ")";
        int i2 = RatingCompat + 29;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if ((!r20.serializer.equals(r1.serializer)) == true) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            int r3 = r2 % r2
            int r3 = o.r8lambda4xemsQi_rXvuhFGMMjGIfxFd9k.RatingCompat
            int r3 = r3 + 111
            int r4 = r3 % 128
            o.r8lambda4xemsQi_rXvuhFGMMjGIfxFd9k.read = r4
            int r3 = r3 % r2
            r3 = 1
            if (r0 != r1) goto L15
            goto L84
        L15:
            boolean r4 = r1 instanceof o.r8lambda4xemsQi_rXvuhFGMMjGIfxFd9k
            if (r4 != 0) goto L1a
            goto L85
        L1a:
            o.r8lambda4xemsQi_rXvuhFGMMjGIfxFd9k r1 = (o.r8lambda4xemsQi_rXvuhFGMMjGIfxFd9k) r1
            java.lang.String r4 = r0.write
            java.lang.String r5 = r1.write
            java.lang.Object[] r11 = new java.lang.Object[]{r4, r5}
            int r6 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            int r12 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            r14 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r15 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r7 = r14
            r8 = r15
            java.lang.Object r4 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L49
            goto L85
        L49:
            java.lang.Integer r4 = r0.RemoteActionCompatParcelizer
            java.lang.Integer r5 = r1.RemoteActionCompatParcelizer
            java.lang.Object[] r18 = new java.lang.Object[]{r4, r5}
            int r13 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r16 = o.getCieXyz.write()
            java.lang.Object r4 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L6e
            goto L85
        L6e:
            java.util.ArrayList r4 = r0.IconCompatParcelizer
            java.util.ArrayList r5 = r1.IconCompatParcelizer
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L79
            goto L85
        L79:
            com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet r4 = r0.serializer
            com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet r1 = r1.serializer
            boolean r1 = r4.equals(r1)
            r1 = r1 ^ r3
            if (r1 == r3) goto L85
        L84:
            return r3
        L85:
            int r1 = o.r8lambda4xemsQi_rXvuhFGMMjGIfxFd9k.RatingCompat
            int r1 = r1 + 125
            int r3 = r1 % 128
            o.r8lambda4xemsQi_rXvuhFGMMjGIfxFd9k.read = r3
            int r1 = r1 % r2
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambda4xemsQi_rXvuhFGMMjGIfxFd9k.equals(java.lang.Object):boolean");
    }
}
