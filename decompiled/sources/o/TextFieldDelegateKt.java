package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import kotlin.TuplesKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldDelegateKt {
    public final SnapshotApplyConflictException read;
    public final CancellableContinuationImpl serializer;

    public final String toString() {
        CancellableContinuationImpl cancellableContinuationImpl = this.serializer;
        getInAppMessageViewLifecycleListener getinappmessageviewlifecyclelistener = (getInAppMessageViewLifecycleListener) cancellableContinuationImpl.MediaBrowserCompatMediaItem.get(getInAppMessageViewLifecycleListener.serializer);
        String str = getinappmessageviewlifecyclelistener != null ? getinappmessageviewlifecyclelistener.write : null;
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        TuplesKt.RemoteActionCompatParcelizer(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        sb.append(str != null ? ff$$ExternalSyntheticOutline0.m("[", str, "](") : "(");
        sb.append("currentBounds()=");
        sb.append(this.read.invoke());
        sb.append(", continuation=");
        sb.append(cancellableContinuationImpl);
        sb.append(')');
        return sb.toString();
    }

    public TextFieldDelegateKt(SnapshotApplyConflictException snapshotApplyConflictException, CancellableContinuationImpl cancellableContinuationImpl) {
        this.read = snapshotApplyConflictException;
        this.serializer = cancellableContinuationImpl;
    }
}
