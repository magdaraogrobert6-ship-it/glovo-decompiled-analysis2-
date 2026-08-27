package o;

import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class drawShadowerFMhIw implements androidx.lifecycle.DefaultLifecycleObserver {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int read;
    public final Object write;

    public /* synthetic */ drawShadowerFMhIw(int i, Object obj) {
        this.read = i;
        this.write = obj;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        Object isitemdismissable;
        int i = 2 % 2;
        int i2 = this.read;
        Object obj = this.write;
        accessisrendernodecompatiblecp.getClass();
        if (i2 == 0) {
            ((getMantissa64) obj).invoke();
            super.onStop(accessisrendernodecompatiblecp);
            return;
        }
        try {
            Object[] objArr = {(getRootInfoui) ((SemanticsOwner) ((androidx.work.impl.WorkerWrapper.Builder) obj).MediaSessionCompatQueueItem)};
            int iSerializer = getQueryParameterslambda2.serializer();
            getRootInfoui.serializer(233758517, -233758516, getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), objArr, iSerializer, getQueryParameterslambda2.serializer());
            isitemdismissable = createFromParcel.INSTANCE;
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Throwable thSerializer = onItemDismiss.serializer(isitemdismissable);
        if (thSerializer != null) {
            int i3 = RemoteActionCompatParcelizer + 41;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            String message = thSerializer.getMessage();
            if (message != null) {
                int i5 = RemoteActionCompatParcelizer + 79;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                    forest.RemoteActionCompatParcelizer("AppPerformance");
                    forest.IconCompatParcelizer(message, new Object[1]);
                } else {
                    Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                    forest2.RemoteActionCompatParcelizer("AppPerformance");
                    forest2.IconCompatParcelizer(message, new Object[0]);
                }
            }
        }
        super.onStop(accessisrendernodecompatiblecp);
    }
}
