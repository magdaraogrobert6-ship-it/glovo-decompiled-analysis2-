package o;

/* JADX INFO: loaded from: classes4.dex */
public final class addInAppMessageViewToViewGrouplambda1 extends accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp {
    public final /* synthetic */ int IconCompatParcelizer;

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            int i2 = this.serializer;
            this.serializer = i2 + 2;
            return this.RemoteActionCompatParcelizer[i2];
        }
        if (i != 1) {
            int i3 = this.serializer;
            this.serializer = i3 + 2;
            return this.RemoteActionCompatParcelizer[i3 + 1];
        }
        int i4 = this.serializer;
        this.serializer = i4 + 2;
        Object[] objArr = this.RemoteActionCompatParcelizer;
        return new AnchoredDragFinishedSignal(objArr[i4], 2, objArr[i4 + 1]);
    }
}
