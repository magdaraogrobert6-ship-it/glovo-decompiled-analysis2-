package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class nowInMillisecondsSystemClock extends nowInMillisecondslambda0 {
    public final String serializer;

    public nowInMillisecondsSystemClock(String str) {
        this.serializer = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nowInMillisecondsSystemClock)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((nowInMillisecondsSystemClock) obj).serializer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m("Secondary(tag=", this.serializer, ")");
    }

    public final int hashCode() {
        String str = this.serializer;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
