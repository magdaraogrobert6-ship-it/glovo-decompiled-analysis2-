package o;

import com.huawei.hmf.tasks.a.d$a;

/* JADX INFO: loaded from: classes4.dex */
public final class setContentCardUpdateHandler implements getContentCardsViewBindingHandler {
    public final /* synthetic */ d$a IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ int[] serializer;

    public /* synthetic */ setContentCardUpdateHandler(int[] iArr, d$a d_a, int i) {
        this.read = i;
        this.serializer = iArr;
        this.IconCompatParcelizer = d_a;
    }

    @Override // o.getContentCardsViewBindingHandler
    public final void RemoteActionCompatParcelizer(Object... objArr) {
        int i = this.read;
        d$a d_a = this.IconCompatParcelizer;
        int[] iArr = this.serializer;
        if (i != 0) {
            networkUnavailable.PlaybackStateCompatCustomAction.fine("pre-pause writing complete");
            int i2 = iArr[0] - 1;
            iArr[0] = i2;
            if (i2 == 0) {
                d_a.run();
                return;
            }
            return;
        }
        networkUnavailable.PlaybackStateCompatCustomAction.fine("pre-pause polling complete");
        int i3 = iArr[0] - 1;
        iArr[0] = i3;
        if (i3 == 0) {
            d_a.run();
        }
    }
}
