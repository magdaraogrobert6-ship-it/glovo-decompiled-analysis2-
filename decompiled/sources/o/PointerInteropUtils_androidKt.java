package o;

import android.content.Context;
import com.huawei.location.logic.zp;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class PointerInteropUtils_androidKt implements emptyCancelMotionEventScope {
    public final ArrayList IconCompatParcelizer;

    @Override // o.emptyCancelMotionEventScope
    public final void serializer(zp zpVar) {
        Iterator it = this.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((emptyCancelMotionEventScope) it.next()).serializer(zpVar);
        }
    }

    public PointerInteropUtils_androidKt(Context context, toCancelMotionEventScoped4ec7I tocancelmotioneventscoped4ec7i) {
        ArrayList arrayList = new ArrayList();
        this.IconCompatParcelizer = arrayList;
        arrayList.add(new PointerKeyboardModifiers(context, tocancelmotioneventscoped4ec7i));
    }
}
