package o;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class isSpecifieduvyYCjk {
    public getZeroNHjbRc serializer;
    public final ArrayList RemoteActionCompatParcelizer = new ArrayList();
    public final HashMap write = new HashMap();
    public final HashMap IconCompatParcelizer = new HashMap();

    public final androidx.fragment.app.Fragment IconCompatParcelizer(String str) {
        isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations = (isSpecifieduvyYCjkannotations) this.write.get(str);
        if (isspecifieduvyycjkannotations != null) {
            return isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
        }
        return null;
    }

    public final List IconCompatParcelizer() {
        ArrayList arrayList;
        if (this.RemoteActionCompatParcelizer.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.RemoteActionCompatParcelizer) {
            arrayList = new ArrayList(this.RemoteActionCompatParcelizer);
        }
        return arrayList;
    }

    public final androidx.fragment.app.Fragment RemoteActionCompatParcelizer(String str) {
        androidx.fragment.app.Fragment fragmentFindFragmentByWho;
        for (isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations : this.write.values()) {
            if (isspecifieduvyycjkannotations != null && (fragmentFindFragmentByWho = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList RemoteActionCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        for (isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations : this.write.values()) {
            if (isspecifieduvyycjkannotations != null) {
                arrayList.add(isspecifieduvyycjkannotations.RemoteActionCompatParcelizer);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final void RemoteActionCompatParcelizer(isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations) {
        androidx.fragment.app.Fragment fragment = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
        if (fragment.onBackPressedDispatcher_delegatelambda00) {
            this.serializer.IconCompatParcelizer(fragment);
        }
        String str = fragment.getViewModelStore;
        HashMap map = this.write;
        if (map.get(str) == isspecifieduvyycjkannotations && ((isSpecifieduvyYCjkannotations) map.put(fragment.getViewModelStore, null)) != null && div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            fragment.toString();
        }
    }

    public final ArrayList read() {
        ArrayList arrayList = new ArrayList();
        for (isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations : this.write.values()) {
            if (isspecifieduvyycjkannotations != null) {
                arrayList.add(isspecifieduvyycjkannotations);
            }
        }
        return arrayList;
    }

    public final void read(androidx.fragment.app.Fragment fragment) {
        if (this.RemoteActionCompatParcelizer.contains(fragment)) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(fragment, "Fragment already added: ");
            return;
        }
        synchronized (this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer.add(fragment);
        }
        fragment.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = true;
    }

    public final void serializer(isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations) {
        androidx.fragment.app.Fragment fragment = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
        String str = fragment.getViewModelStore;
        HashMap map = this.write;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.getViewModelStore, isspecifieduvyycjkannotations);
        if (fragment.addOnContextAvailableListener) {
            boolean z = fragment.onBackPressedDispatcher_delegatelambda00;
            getZeroNHjbRc getzeronhjbrc = this.serializer;
            if (z) {
                getzeronhjbrc.write(fragment);
            } else {
                getzeronhjbrc.IconCompatParcelizer(fragment);
            }
            fragment.addOnContextAvailableListener = false;
        }
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            fragment.toString();
        }
    }

    public final Bundle IconCompatParcelizer(Bundle bundle, String str) {
        HashMap map = this.IconCompatParcelizer;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
