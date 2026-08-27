package o;

/* JADX INFO: loaded from: classes.dex */
public final class SessionMutex {
    public final long RemoteActionCompatParcelizer;
    public final long read;
    public final long serializer;
    public final long write;

    public final int hashCode() {
        return androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.write) + MediaSessionCompatQueueItem.IconCompatParcelizer(MediaSessionCompatQueueItem.IconCompatParcelizer(androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.read) * 31, 31, this.serializer), 31, this.RemoteActionCompatParcelizer);
    }

    public SessionMutex(long j, long j2, long j3, long j4) {
        this.read = j;
        this.serializer = j2;
        this.RemoteActionCompatParcelizer = j3;
        this.write = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SessionMutex)) {
            return false;
        }
        SessionMutex sessionMutex = (SessionMutex) obj;
        return androidx.compose.ui.graphics.Color.m723equalsimpl0(this.read, sessionMutex.read) && androidx.compose.ui.graphics.Color.m723equalsimpl0(this.serializer, sessionMutex.serializer) && androidx.compose.ui.graphics.Color.m723equalsimpl0(this.RemoteActionCompatParcelizer, sessionMutex.RemoteActionCompatParcelizer) && androidx.compose.ui.graphics.Color.m723equalsimpl0(this.write, sessionMutex.write);
    }
}
