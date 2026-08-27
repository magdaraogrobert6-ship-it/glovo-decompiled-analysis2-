package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class copyqCc9W8c extends ClipMetadata {
    public final getHeadsetHookEK5gGoQ RemoteActionCompatParcelizer;
    public ClipMetadata serializer = write();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.serializer != null;
    }

    public final Clipboard write() {
        getHeadsetHookEK5gGoQ getheadsethookek5ggoq = this.RemoteActionCompatParcelizer;
        if (getheadsethookek5ggoq.hasNext()) {
            return new Clipboard(getheadsethookek5ggoq.write());
        }
        return null;
    }

    @Override // o.ClipMetadata
    public final byte serializer() {
        ClipMetadata clipMetadata = this.serializer;
        if (clipMetadata == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return (byte) 0;
        }
        byte bSerializer = clipMetadata.serializer();
        if (!this.serializer.hasNext()) {
            this.serializer = write();
        }
        return bSerializer;
    }

    public copyqCc9W8c(DisposableSaveableStateRegistry disposableSaveableStateRegistry) {
        this.RemoteActionCompatParcelizer = new getHeadsetHookEK5gGoQ(disposableSaveableStateRegistry);
    }
}
