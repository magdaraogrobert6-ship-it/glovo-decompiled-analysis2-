package o;

import com.huawei.hmf.tasks.a.d$a;

/* JADX INFO: loaded from: classes4.dex */
public final class setContentCardsRecyclerView implements getContentCardsViewBindingHandler {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ setContentCardsSwipeLayout write;

    public /* synthetic */ setContentCardsRecyclerView(setContentCardsSwipeLayout setcontentcardsswipelayout, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = setcontentcardsswipelayout;
    }

    @Override // o.getContentCardsViewBindingHandler
    public final void RemoteActionCompatParcelizer(Object... objArr) {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a(this, 26, objArr));
            return;
        }
        if (i == 1) {
            this.write.write("requestHeaders", objArr[0]);
        } else if (i == 2) {
            r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a(this, 27, objArr));
        } else if (i != 3) {
            r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a(this, 29, objArr));
        } else {
            r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a(this, 28, objArr));
        }
    }
}
