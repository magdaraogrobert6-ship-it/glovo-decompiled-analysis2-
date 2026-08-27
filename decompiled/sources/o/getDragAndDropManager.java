package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getDragAndDropManager extends AnchoredDragFinishedSignal implements displayInAppMessagelambda122 {
    public Object IconCompatParcelizer;
    public final ContentCardsDividerItemDecoration serializer;

    public getDragAndDropManager(ContentCardsDividerItemDecoration contentCardsDividerItemDecoration, Object obj, Object obj2) {
        super(obj, 1, obj2);
        this.serializer = contentCardsDividerItemDecoration;
        this.IconCompatParcelizer = obj2;
    }

    @Override // o.AnchoredDragFinishedSignal, java.util.Map.Entry
    public final Object getValue() {
        return this.IconCompatParcelizer;
    }

    @Override // o.AnchoredDragFinishedSignal, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.IconCompatParcelizer;
        this.IconCompatParcelizer = obj;
        onExited onexited = (onExited) this.serializer.read;
        onEntered onentered = onexited.read;
        Object obj3 = this.RemoteActionCompatParcelizer;
        if (!onentered.containsKey(obj3)) {
            return obj2;
        }
        boolean z = onexited.serializer;
        if (!z) {
            onentered.put(obj3, obj);
        } else {
            if (!z) {
                ScreenStartObserver$$ExternalSyntheticLambda0.read();
                return null;
            }
            startDragAndDropTransferd4ec7I startdraganddroptransferd4ec7i = onexited.write[onexited.IconCompatParcelizer];
            Object obj4 = startdraganddroptransferd4ec7i.read[startdraganddroptransferd4ec7i.write];
            onentered.put(obj3, obj);
            onexited.RemoteActionCompatParcelizer(obj4 != null ? obj4.hashCode() : 0, onentered.serializer, obj4, 0);
        }
        onexited.RemoteActionCompatParcelizer = onentered.RemoteActionCompatParcelizer;
        return obj2;
    }
}
