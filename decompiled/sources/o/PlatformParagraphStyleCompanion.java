package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.database.entity.Vendor$Companion;
import kotlinx.serialization.Serializable;
import o.PlatformSpanStyleCompanion;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
@SuppressLint
public final class PlatformParagraphStyleCompanion {
    public static final Vendor$Companion Companion = new Object() { // from class: com.roadrunner.database.entity.Vendor$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 51;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            PlatformSpanStyleCompanion platformSpanStyleCompanion = PlatformSpanStyleCompanion.RemoteActionCompatParcelizer;
            int i4 = write + 17;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return platformSpanStyleCompanion;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final long id;
    public final String name;
    public final String phoneNumber;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.database.entity.Vendor$Companion] */
    static {
        int i = IconCompatParcelizer + 19;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 68 / 0;
        }
    }

    public /* synthetic */ PlatformParagraphStyleCompanion(int i, long j, String str, String str2) {
        Object obj = null;
        if (3 == (i & 3)) {
            this.id = j;
            this.name = str;
            if ((i & 4) == 0) {
                this.phoneNumber = null;
                int i2 = RemoteActionCompatParcelizer + 73;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.phoneNumber = str2;
            int i3 = write + 107;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, PlatformSpanStyleCompanion.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            String strM = d$$ExternalSyntheticOutline0.m(getBitmapFromCache.read("Vendor(id=", ", name=", this.id, this.name), ", phoneNumber=", this.phoneNumber, ")");
            int i3 = write + 83;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return strM;
            }
            obj.hashCode();
            throw null;
        }
        d$$ExternalSyntheticOutline0.m(getBitmapFromCache.read("Vendor(id=", ", name=", this.id, this.name), ", phoneNumber=", this.phoneNumber, ")");
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 71;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.name);
        String str = this.phoneNumber;
        if (str == null) {
            int i4 = RemoteActionCompatParcelizer + 29;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return iM + iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if ((r23 instanceof o.PlatformParagraphStyleCompanion) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        r3 = r3 + 99;
        o.PlatformParagraphStyleCompanion.RemoteActionCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r1 = (o.PlatformParagraphStyleCompanion) r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r22.id == r1.id) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r22.name, r1.name}, o.getCieXyz.write())).booleanValue()) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r1 = o.PlatformParagraphStyleCompanion.RemoteActionCompatParcelizer + 105;
        r3 = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        o.PlatformParagraphStyleCompanion.write = r3;
        r1 = r1 % 2;
        r3 = r3 + 107;
        o.PlatformParagraphStyleCompanion.RemoteActionCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r22.phoneNumber, r1.phoneNumber}, o.getCieXyz.write())).booleanValue() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        r1 = o.PlatformParagraphStyleCompanion.write + 3;
        o.PlatformParagraphStyleCompanion.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r22 == r23) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r22 == r23) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r5 = r5 + 87;
        o.PlatformParagraphStyleCompanion.write = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if ((r5 % 2) == 0) goto L11;
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
            int r3 = o.PlatformParagraphStyleCompanion.write
            int r4 = r3 + 77
            int r5 = r4 % 128
            o.PlatformParagraphStyleCompanion.RemoteActionCompatParcelizer = r5
            int r4 = r4 % r2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L1a
            r4 = 30
            int r4 = r4 / r7
            if (r0 != r1) goto L28
            goto L1c
        L1a:
            if (r0 != r1) goto L28
        L1c:
            int r5 = r5 + 87
            int r1 = r5 % 128
            o.PlatformParagraphStyleCompanion.write = r1
            int r5 = r5 % r2
            if (r5 == 0) goto L26
            return r6
        L26:
            r1 = 0
            throw r1
        L28:
            boolean r4 = r1 instanceof o.PlatformParagraphStyleCompanion
            if (r4 != 0) goto L34
            int r3 = r3 + 99
            int r1 = r3 % 128
            o.PlatformParagraphStyleCompanion.RemoteActionCompatParcelizer = r1
            int r3 = r3 % r2
            return r7
        L34:
            o.PlatformParagraphStyleCompanion r1 = (o.PlatformParagraphStyleCompanion) r1
            long r3 = r0.id
            long r8 = r1.id
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L3f
            return r7
        L3f:
            java.lang.String r3 = r0.name
            java.lang.String r4 = r1.name
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
            r3 = r3 ^ r6
            if (r3 == 0) goto L7f
            int r1 = o.PlatformParagraphStyleCompanion.RemoteActionCompatParcelizer
            int r1 = r1 + 105
            int r3 = r1 % 128
            o.PlatformParagraphStyleCompanion.write = r3
            int r1 = r1 % r2
            int r3 = r3 + 107
            int r1 = r3 % 128
            o.PlatformParagraphStyleCompanion.RemoteActionCompatParcelizer = r1
            int r3 = r3 % r2
            return r7
        L7f:
            java.lang.String r3 = r0.phoneNumber
            java.lang.String r1 = r1.phoneNumber
            java.lang.Object[] r20 = new java.lang.Object[]{r3, r1}
            int r15 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r21 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto Lad
            int r1 = o.PlatformParagraphStyleCompanion.write
            int r1 = r1 + 3
            int r3 = r1 % 128
            o.PlatformParagraphStyleCompanion.RemoteActionCompatParcelizer = r3
            int r1 = r1 % r2
            return r7
        Lad:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PlatformParagraphStyleCompanion.equals(java.lang.Object):boolean");
    }
}
