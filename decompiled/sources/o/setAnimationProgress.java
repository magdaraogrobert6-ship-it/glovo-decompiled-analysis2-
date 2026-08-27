package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setAnimationProgress {
    private static int serializer = 1;
    private static int write;
    public final List RemoteActionCompatParcelizer;

    public setAnimationProgress(List list) {
        list.getClass();
        this.RemoteActionCompatParcelizer = list;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 101;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.RemoteActionCompatParcelizer.hashCode();
        }
        this.RemoteActionCompatParcelizer.hashCode();
        throw null;
    }

    public final String toString() {
        String str;
        int i = 2 % 2;
        int i2 = serializer + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str = MediaSessionCompatQueueItem.read("Faces(list=", ")", this.RemoteActionCompatParcelizer);
            int i3 = 10 / 0;
        } else {
            str = MediaSessionCompatQueueItem.read("Faces(list=", ")", this.RemoteActionCompatParcelizer);
        }
        int i4 = serializer + 41;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 85;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (obj instanceof setAnimationProgress) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, ((setAnimationProgress) obj).RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
        }
        int i3 = write + 83;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
