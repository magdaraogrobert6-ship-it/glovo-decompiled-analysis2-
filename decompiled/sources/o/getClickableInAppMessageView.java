package o;

import kotlinx.coroutines.JobNode;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: loaded from: classes4.dex */
public final class getClickableInAppMessageView extends JobNode implements createButtonClickListeners {
    public final JobSupport serializer;

    @Override // kotlinx.coroutines.JobNode
    public final boolean write() {
        return true;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void write(Throwable th) {
        this.serializer.MediaDescriptionCompat(serializer());
    }

    public getClickableInAppMessageView(JobSupport jobSupport) {
        this.serializer = jobSupport;
    }

    @Override // o.createButtonClickListeners
    public final boolean read(Throwable th) {
        return serializer().serializer(th);
    }
}
