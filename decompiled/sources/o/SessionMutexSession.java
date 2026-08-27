package o;

/* JADX INFO: loaded from: classes.dex */
public final class SessionMutexSession {
    public final float IconCompatParcelizer;
    public final float RemoteActionCompatParcelizer;
    public final float read;
    public final float serializer;
    public final float write;

    public final int hashCode() {
        return androidx.compose.ui.unit.Dp.m3679hashCodeimpl(this.IconCompatParcelizer) + getBitmapFromCache.serializer(this.read, getBitmapFromCache.serializer(this.serializer, getBitmapFromCache.serializer(this.write, androidx.compose.ui.unit.Dp.m3679hashCodeimpl(this.RemoteActionCompatParcelizer) * 31, 31), 31), 31);
    }

    public SessionMutexSession(float f, float f2, float f3, float f4, float f5, float f6) {
        this.RemoteActionCompatParcelizer = f;
        this.write = f2;
        this.serializer = f3;
        this.read = f4;
        this.IconCompatParcelizer = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SessionMutexSession)) {
            return false;
        }
        SessionMutexSession sessionMutexSession = (SessionMutexSession) obj;
        return androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.RemoteActionCompatParcelizer, sessionMutexSession.RemoteActionCompatParcelizer) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.write, sessionMutexSession.write) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.serializer, sessionMutexSession.serializer) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.read, sessionMutexSession.read) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.IconCompatParcelizer, sessionMutexSession.IconCompatParcelizer);
    }
}
