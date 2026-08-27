package o;

/* JADX INFO: loaded from: classes.dex */
public final class getSupportButtonTintList extends checkForSystemLogLevelPropertylambda0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public boolean read;
    public final /* synthetic */ Object write;

    public getSupportButtonTintList(PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1) {
        this.IconCompatParcelizer = 1;
        this.write = predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1;
        this.read = false;
        this.RemoteActionCompatParcelizer = 0;
    }

    @Override // o.checkForSystemLogLevelPropertylambda0, o.getCancel
    public final void RemoteActionCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        if (i == 0) {
            ((setFilters) obj).PlaybackStateCompat.setVisibility(0);
            return;
        }
        if (this.read) {
            return;
        }
        this.read = true;
        getCancel getcancel = ((PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1) obj).serializer;
        if (getcancel != null) {
            getcancel.RemoteActionCompatParcelizer();
        }
    }

    @Override // o.getCancel
    public final void serializer() {
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        if (i == 0) {
            if (this.read) {
                return;
            }
            ((setFilters) obj).PlaybackStateCompat.setVisibility(this.RemoteActionCompatParcelizer);
            return;
        }
        int i2 = this.RemoteActionCompatParcelizer + 1;
        this.RemoteActionCompatParcelizer = i2;
        PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 = (PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1) obj;
        if (i2 == predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1.read.size()) {
            getCancel getcancel = predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1.serializer;
            if (getcancel != null) {
                getcancel.serializer();
            }
            this.RemoteActionCompatParcelizer = 0;
            this.read = false;
            predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1.write = false;
        }
    }

    @Override // o.checkForSystemLogLevelPropertylambda0, o.getCancel
    public void read() {
        if (this.IconCompatParcelizer != 0) {
            return;
        }
        this.read = true;
    }

    public getSupportButtonTintList(setFilters setfilters, int i) {
        this.IconCompatParcelizer = 0;
        this.write = setfilters;
        this.RemoteActionCompatParcelizer = i;
        this.read = false;
    }
}
