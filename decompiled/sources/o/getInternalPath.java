package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes.dex */
public final class getInternalPath extends androidx.lifecycle.ViewModel {
    public final LinkedHashMap read = new LinkedHashMap();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.read;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((getFilterQualityfv9h1I) it.next()).read();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int iIdentityHashCode = System.identityHashCode(this);
        TuplesKt.RemoteActionCompatParcelizer(16);
        sb.append(DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(16, ((long) iIdentityHashCode) & 4294967295L));
        sb.append("} ViewModelStores (");
        Iterator it = this.read.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
