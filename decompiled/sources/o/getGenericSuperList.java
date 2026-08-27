package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.helpcenter.data.bridge.CameraBridgeMessagePayload$Companion;
import kotlinx.serialization.Serializable;
import o.CodedOutputStreamOutOfSpaceException;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getGenericSuperList {
    public static final CameraBridgeMessagePayload$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.data.bridge.CameraBridgeMessagePayload$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 105;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            CodedOutputStreamOutOfSpaceException codedOutputStreamOutOfSpaceException = CodedOutputStreamOutOfSpaceException.read;
            int i4 = RemoteActionCompatParcelizer + 13;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return codedOutputStreamOutOfSpaceException;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final boolean isCameraOnly;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.data.bridge.CameraBridgeMessagePayload$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 11;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getGenericSuperList(int i, boolean z) {
        if (1 == (i & 1)) {
            this.isCameraOnly = z;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, CodedOutputStreamOutOfSpaceException.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 93;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.isCameraOnly);
        int i4 = read + 121;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 111;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            String strSerializer = MediaSessionCompatQueueItem.serializer("CameraBridgeMessagePayload(isCameraOnly=", ")", this.isCameraOnly);
            int i3 = IconCompatParcelizer + 85;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return strSerializer;
            }
            throw null;
        }
        MediaSessionCompatQueueItem.serializer("CameraBridgeMessagePayload(isCameraOnly=", ")", this.isCameraOnly);
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.getGenericSuperList) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 7;
        o.getGenericSuperList.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r5.isCameraOnly == ((o.getGenericSuperList) r6).isCameraOnly) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r1 = r1 + 97;
        o.getGenericSuperList.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
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
            int r1 = o.getGenericSuperList.IconCompatParcelizer
            int r2 = r1 + 25
            int r3 = r2 % 128
            o.getGenericSuperList.read = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 90
            int r2 = r2 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r6 instanceof o.getGenericSuperList
            if (r2 != 0) goto L28
            int r1 = r1 + 7
            int r6 = r1 % 128
            o.getGenericSuperList.read = r6
            int r1 = r1 % r0
            if (r1 == 0) goto L27
            return r3
        L27:
            return r4
        L28:
            o.getGenericSuperList r6 = (o.getGenericSuperList) r6
            boolean r2 = r5.isCameraOnly
            boolean r6 = r6.isCameraOnly
            if (r2 == r6) goto L38
            int r1 = r1 + 97
            int r6 = r1 % 128
            o.getGenericSuperList.read = r6
            int r1 = r1 % r0
            return r4
        L38:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getGenericSuperList.equals(java.lang.Object):boolean");
    }
}
