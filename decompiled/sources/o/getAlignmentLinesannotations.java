package o;

import android.content.Context;
import com.google.android.gms.internal.mlkit_vision_common.zzmp;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getAlignmentLinesannotations implements getApproachNode {
    public final ArrayList read;

    @Override // o.getApproachNode
    public final void read(colorResource colorresource) {
        Iterator it = this.read.iterator();
        while (it.hasNext()) {
            ((getApproachNode) it.next()).read(colorresource);
        }
    }

    public getAlignmentLinesannotations(Context context, getLookaheadScopeCoordinates getlookaheadscopecoordinates) {
        ArrayList arrayList = new ArrayList();
        this.read = arrayList;
        arrayList.add(new zzmp(context, getlookaheadscopecoordinates));
    }
}
