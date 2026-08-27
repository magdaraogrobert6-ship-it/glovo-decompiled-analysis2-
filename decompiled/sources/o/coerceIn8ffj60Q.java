package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class coerceIn8ffj60Q {
    private static int read = 1;
    private static int write;
    public final List serializer;

    public final List read() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 61;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.serializer;
        int i5 = i2 + 11;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public coerceIn8ffj60Q(List list) {
        list.getClass();
        this.serializer = list;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 81;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer.hashCode();
        }
        int i3 = 90 / 0;
        return this.serializer.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return MediaSessionCompatQueueItem.read("AcceptParams(acceptDetailsList=", ")", this.serializer);
        }
        MediaSessionCompatQueueItem.read("AcceptParams(acceptDetailsList=", ")", this.serializer);
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 97;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof coerceIn8ffj60Q) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((coerceIn8ffj60Q) obj).serializer}, getCieXyz.write())).booleanValue();
        }
        int i3 = write + 121;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
