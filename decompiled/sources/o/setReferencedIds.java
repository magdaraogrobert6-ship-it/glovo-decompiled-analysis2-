package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import io.socket.emitter.Emitter;

/* JADX INFO: loaded from: classes3.dex */
public final class setReferencedIds extends Emitter {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public static int RemoteActionCompatParcelizer;
    public static int write;
    public final androidx.compose.ui.text.AnnotatedString IconCompatParcelizer;
    public final String read;
    public final String serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setReferencedIds(String str, androidx.compose.ui.text.AnnotatedString annotatedString, String str2) {
        super(str);
        annotatedString.getClass();
        this.serializer = str;
        this.IconCompatParcelizer = annotatedString;
        this.read = str2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RatingCompat + 15;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.serializer.hashCode();
        int iHashCode3 = this.IconCompatParcelizer.hashCode();
        String str = this.read;
        if (str == null) {
            int i4 = RatingCompat + 17;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return ((iHashCode3 + (iHashCode2 * 31)) * 31) + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Failed(failedText=");
        sb.append(this.serializer);
        sb.append(", explanationText=");
        sb.append((Object) this.IconCompatParcelizer);
        sb.append(", buttonText=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.read, ")");
        int i2 = MediaSessionCompatQueueItem + 69;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof setReferencedIds) {
            setReferencedIds setreferencedids = (setReferencedIds) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, setreferencedids.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, setreferencedids.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, setreferencedids.read}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = MediaSessionCompatQueueItem + 37;
            RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = RatingCompat + 17;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }

    public static int write() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 9500361;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        write = iFreeMemory;
        return iFreeMemory;
    }
}
