package bo.app;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i extends cb {
    public i(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // bo.app.n9
    public final boolean a(da daVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (!((n9) obj).a(daVar)) {
                return false;
            }
            z = true;
        }
        return z;
    }
}
