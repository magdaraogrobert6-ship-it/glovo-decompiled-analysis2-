package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class operationsList extends getMessage {
    public final /* synthetic */ ArrayList read;
    public final /* synthetic */ android.graphics.Matrix serializer;

    public operationsList(ArrayList arrayList, android.graphics.Matrix matrix) {
        this.read = arrayList;
        this.serializer = matrix;
    }

    @Override // o.getMessage
    public final void RemoteActionCompatParcelizer(android.graphics.Matrix matrix, takeOrElseoyDd2qo takeorelseoydd2qo, int i, android.graphics.Canvas canvas) {
        Iterator it = this.read.iterator();
        while (it.hasNext()) {
            ((getMessage) it.next()).RemoteActionCompatParcelizer(this.serializer, takeorelseoydd2qo, i, canvas);
        }
    }
}
