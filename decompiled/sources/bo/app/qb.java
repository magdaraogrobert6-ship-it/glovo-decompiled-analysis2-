package bo.app;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qb extends cb {
    public qb(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // bo.app.n9
    public final boolean a(da daVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((n9) obj).a(daVar)) {
                return true;
            }
        }
        return false;
    }
}
