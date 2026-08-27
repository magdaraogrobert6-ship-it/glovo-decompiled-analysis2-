package o;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class RoundRectCompanion extends getBottomRightCornerRadiuskKHJgLs {
    public final /* synthetic */ androidx.fragment.app.Fragment IconCompatParcelizer;
    public final /* synthetic */ setTextClassifier RemoteActionCompatParcelizer;
    public final /* synthetic */ AtomicReference read;
    public final /* synthetic */ onNewIntent serializer;
    public final /* synthetic */ getNavigationEventDispatcher write;

    @Override // o.getBottomRightCornerRadiuskKHJgLs
    public final void write() {
        androidx.fragment.app.Fragment fragment = this.IconCompatParcelizer;
        this.read.set(((androidx.activity.result.ActivityResultRegistry) this.RemoteActionCompatParcelizer.read(null)).register(fragment.generateActivityResultKey(), fragment, this.serializer, this.write));
    }

    public RoundRectCompanion(androidx.fragment.app.Fragment fragment, setTextClassifier settextclassifier, AtomicReference atomicReference, onNewIntent onnewintent, getNavigationEventDispatcher getnavigationeventdispatcher) {
        this.IconCompatParcelizer = fragment;
        this.RemoteActionCompatParcelizer = settextclassifier;
        this.read = atomicReference;
        this.serializer = onnewintent;
        this.write = getnavigationeventdispatcher;
    }
}
