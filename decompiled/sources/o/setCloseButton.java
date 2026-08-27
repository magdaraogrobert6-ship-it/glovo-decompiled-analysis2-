package o;

import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes4.dex */
public final class setCloseButton implements createClickListener {
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ setCloseButton(int i, Object obj) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // o.createClickListener
    public final void RemoteActionCompatParcelizer(Throwable th) {
        int i = this.serializer;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj).invoke(th);
        } else {
            ((setAndStartAnimation) obj).RemoteActionCompatParcelizer();
        }
    }

    public final String toString() {
        int i = this.serializer;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return "DisposeOnCancel[" + ((setAndStartAnimation) obj) + ']';
        }
        return "CancelHandler.UserSupplied[" + ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj).getClass().getSimpleName() + '@' + RegexKt.IconCompatParcelizer(this) + ']';
    }
}
