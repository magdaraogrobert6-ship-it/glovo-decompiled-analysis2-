package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.state.quests.data.ProgressResponse$Companion;
import kotlinx.serialization.Serializable;
import o.getDefaultActivityPackage;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getEventSuffix {
    public static final ProgressResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.quests.data.ProgressResponse$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 37;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getDefaultActivityPackage getdefaultactivitypackage = getDefaultActivityPackage.write;
            int i4 = read + 31;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getdefaultactivitypackage;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final int goalCount;
    public final float percentage;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.quests.data.ProgressResponse$Companion] */
    static {
        int i = IconCompatParcelizer + 45;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getEventSuffix(float f, int i, int i2) {
        if (3 == (i & 3)) {
            this.percentage = f;
            this.goalCount = i2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getDefaultActivityPackage.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 45;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.goalCount) + (Float.hashCode(this.percentage) * 31);
        int i4 = serializer + 47;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.getEventSuffix) == true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (o.getEventSuffix) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (java.lang.Float.compare(r5.percentage, r6.percentage) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r6 = o.getEventSuffix.serializer + 101;
        o.getEventSuffix.RemoteActionCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if ((r6 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (r5.goalCount == r6.goalCount) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        r6 = o.getEventSuffix.serializer + 59;
        o.getEventSuffix.RemoteActionCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getEventSuffix.serializer
            int r1 = r1 + 67
            int r2 = r1 % 128
            o.getEventSuffix.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 70
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof o.getEventSuffix
            if (r1 == r2) goto L1e
            return r3
        L1e:
            o.getEventSuffix r6 = (o.getEventSuffix) r6
            float r1 = r5.percentage
            float r4 = r6.percentage
            int r1 = java.lang.Float.compare(r1, r4)
            if (r1 == 0) goto L37
            int r6 = o.getEventSuffix.serializer
            int r6 = r6 + 101
            int r1 = r6 % 128
            o.getEventSuffix.RemoteActionCompatParcelizer = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L36
            return r2
        L36:
            return r3
        L37:
            int r1 = r5.goalCount
            int r6 = r6.goalCount
            if (r1 == r6) goto L47
            int r6 = o.getEventSuffix.serializer
            int r6 = r6 + 59
            int r1 = r6 % 128
            o.getEventSuffix.RemoteActionCompatParcelizer = r1
            int r6 = r6 % r0
            return r3
        L47:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getEventSuffix.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ProgressResponse(percentage=" + this.percentage + ", goalCount=" + this.goalCount + ")";
        int i2 = RemoteActionCompatParcelizer + 73;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
