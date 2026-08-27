package o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class movegyyYBs implements Runnable {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ reuseLayer serializer;

    public /* synthetic */ movegyyYBs(reuseLayer reuselayer, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = reuselayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RemoteActionCompatParcelizer;
        reuseLayer reuselayer = this.serializer;
        if (i != 0) {
            if (reuselayer.serializer()) {
                reuselayer.MediaSessionCompatToken = decrementKeepScreenOnCount.Healthy;
            }
        } else {
            decrementKeepScreenOnCount decrementkeepscreenoncount = reuselayer.MediaSessionCompatToken;
            getRectManager.RemoteActionCompatParcelizer(decrementkeepscreenoncount == decrementKeepScreenOnCount.Backoff, "State should still be backoff but was %s", decrementkeepscreenoncount);
            reuselayer.MediaSessionCompatToken = decrementKeepScreenOnCount.Initial;
            reuselayer.RemoteActionCompatParcelizer();
            getRectManager.RemoteActionCompatParcelizer(reuselayer.IconCompatParcelizer(), "Stream should have started", new Object[0]);
        }
    }
}
