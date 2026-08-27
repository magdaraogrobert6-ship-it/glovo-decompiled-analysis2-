package o;

import com.google.android.gms.internal.gtm.zzkh;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class asList implements Iterable {
    public final accessswap RemoteActionCompatParcelizer;

    public final zzkh IconCompatParcelizer(calculateMinimumTouchTargetPaddingE7KxVPU calculateminimumtouchtargetpaddinge7kxvpu) {
        return new zzkh(this.RemoteActionCompatParcelizer.write(calculateminimumtouchtargetpaddinge7kxvpu), 6, false);
    }

    public final asList IconCompatParcelizer(Object obj) {
        return new asList(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(obj, null));
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzkh(this.RemoteActionCompatParcelizer.iterator(), 6, false);
    }

    public final asList read(Object obj) {
        accessswap accessswapVar = this.RemoteActionCompatParcelizer;
        accessswap accessswapVarRemoteActionCompatParcelizer = accessswapVar.RemoteActionCompatParcelizer(obj);
        return accessswapVarRemoteActionCompatParcelizer == accessswapVar ? this : new asList(accessswapVarRemoteActionCompatParcelizer);
    }

    public asList(List list, Comparator comparator) {
        accessswap accessswapVarWrite;
        Map map = Collections.EMPTY_MAP;
        if (list.size() < 25) {
            Collections.sort(list, comparator);
            int size = list.size();
            Object[] objArr = new Object[size];
            Object[] objArr2 = new Object[size];
            int i = 0;
            for (Object obj : list) {
                objArr[i] = obj;
                objArr2[i] = map.get(obj);
                i++;
            }
            accessswapVarWrite = new MyersDiffKt(comparator, objArr, objArr2);
        } else {
            accessswapVarWrite = androidx.transition.TransitionValuesMaps.write(list, map, comparator);
        }
        this.RemoteActionCompatParcelizer = accessswapVarWrite;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof asList) {
            return this.RemoteActionCompatParcelizer.equals(((asList) obj).RemoteActionCompatParcelizer);
        }
        return false;
    }

    public asList(accessswap accessswapVar) {
        this.RemoteActionCompatParcelizer = accessswapVar;
    }
}
