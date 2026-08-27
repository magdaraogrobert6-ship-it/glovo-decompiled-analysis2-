package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemLifecycleSystemLifecycleCache extends registerActivityLifecycleCallbacks {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final long read;
    public final int serializer;

    public SystemLifecycleSystemLifecycleCache(int i, long j, String str) {
        this.serializer = i;
        this.read = j;
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + d$$ExternalSyntheticOutline0.m(Integer.hashCode(this.serializer) * 31, 31, this.read);
        int i4 = RemoteActionCompatParcelizer + 13;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("OpenHelpCenter(unreadMessagesCount=");
        sb.append(this.serializer);
        sb.append(", lastMessageTime=");
        sb.append(this.read);
        String strM = d$$ExternalSyntheticOutline0.m(sb, ", courierId=", this.IconCompatParcelizer, ")");
        int i2 = RemoteActionCompatParcelizer + 5;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 109;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof SystemLifecycleSystemLifecycleCache) {
            SystemLifecycleSystemLifecycleCache systemLifecycleSystemLifecycleCache = (SystemLifecycleSystemLifecycleCache) obj;
            if (this.serializer == systemLifecycleSystemLifecycleCache.serializer && this.read == systemLifecycleSystemLifecycleCache.read && this.IconCompatParcelizer.equals(systemLifecycleSystemLifecycleCache.IconCompatParcelizer)) {
                return true;
            }
        } else {
            int i4 = write + 45;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int i6 = write + 29;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
