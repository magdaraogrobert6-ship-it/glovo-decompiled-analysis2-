package o;

import com.google.firebase.firestore.local.LocalDocumentsView;
import com.sentiance.core.model.events.I$b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class distanceInMinimumTouchTargettz77jQw implements DelegatingNode {
    public final /* synthetic */ I$b RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ distanceInMinimumTouchTargettz77jQw(I$b i$b, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = i$b;
    }

    @Override // o.DelegatingNode
    public final Object B_() {
        int i = this.serializer;
        I$b i$b = this.RemoteActionCompatParcelizer;
        return i != 0 ? (LocalDocumentsView) i$b.MediaDescriptionCompat : (onLayoutModifierNodeChanged) i$b.read;
    }
}
