package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.helpcenter.data.unread_message_count.dto.Chat$Companion;
import kotlinx.serialization.Serializable;
import o.DialogFragment5;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class instantiate {
    public static final Chat$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.data.unread_message_count.dto.Chat$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 59;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            DialogFragment5 dialogFragment5 = DialogFragment5.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 13;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return dialogFragment5;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final boolean active;
    public final int unreadMessageCount;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.data.unread_message_count.dto.Chat$Companion] */
    static {
        int i = serializer + 1;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final int RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 55;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.unreadMessageCount;
        int i5 = i3 + 123;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return i4;
    }

    public final boolean write() {
        int i = 2 % 2;
        int i2 = write + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        boolean z = this.active;
        int i5 = i3 + 63;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    public /* synthetic */ instantiate(int i, int i2, boolean z) {
        if (3 == (i & 3)) {
            this.unreadMessageCount = i2;
            this.active = z;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, DialogFragment5.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 57;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Boolean.hashCode(this.active) - (Integer.hashCode(this.unreadMessageCount) - 10);
        }
        return Boolean.hashCode(this.active) + (Integer.hashCode(this.unreadMessageCount) * 31);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r7 instanceof o.instantiate) == true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 29;
        o.instantiate.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r7 = (o.instantiate) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r6.unreadMessageCount == r7.unreadMessageCount) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r6.active == r7.active) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        r1 = r1 + 57;
        o.instantiate.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.instantiate.read
            int r2 = r1 + 37
            int r3 = r2 % 128
            o.instantiate.write = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 17
            int r2 = r2 / r4
            if (r6 != r7) goto L19
            goto L18
        L16:
            if (r6 != r7) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r7 instanceof o.instantiate
            if (r2 == r3) goto L25
            int r1 = r1 + 29
            int r7 = r1 % 128
            o.instantiate.write = r7
            int r1 = r1 % r0
            return r4
        L25:
            o.instantiate r7 = (o.instantiate) r7
            int r2 = r6.unreadMessageCount
            int r5 = r7.unreadMessageCount
            if (r2 == r5) goto L2e
            return r4
        L2e:
            boolean r2 = r6.active
            boolean r7 = r7.active
            if (r2 == r7) goto L3c
            int r1 = r1 + 57
            int r7 = r1 % 128
            o.instantiate.write = r7
            int r1 = r1 % r0
            return r4
        L3c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.instantiate.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Chat(unreadMessageCount=" + this.unreadMessageCount + ", active=" + this.active + ")";
        int i2 = read + 87;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
