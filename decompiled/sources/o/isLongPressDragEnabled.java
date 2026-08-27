package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class isLongPressDragEnabled implements Iterable, displayInAppMessagelambda121 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Object write;

    public /* synthetic */ isLongPressDragEnabled(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.write;
        if (i != 0) {
            return i != 1 ? new r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44((r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) obj) : new r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44((Object[]) obj);
        }
        return new r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44((Iterator) ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj).invoke());
    }
}
