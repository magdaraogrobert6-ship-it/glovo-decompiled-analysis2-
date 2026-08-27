package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class getCenteruvyYCjk implements getUnspecifiedNHjbRcannotations {
    public final /* synthetic */ div7Ah8Wj8 serializer;

    @Override // o.getUnspecifiedNHjbRcannotations
    public final boolean write(ArrayList arrayList, ArrayList arrayList2) {
        boolean zRemoteActionCompatParcelizer;
        div7Ah8Wj8 div7ah8wj8 = this.serializer;
        ArrayList<ActualLinearGradientShaderVjE6UOU> arrayList3 = div7ah8wj8.write;
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            Objects.toString(div7ah8wj8._init_lambda2);
        }
        if (div7ah8wj8.serializer.isEmpty()) {
            zRemoteActionCompatParcelizer = false;
        } else {
            isInfiniteannotations isinfiniteannotations = (isInfiniteannotations) af$$ExternalSyntheticOutline0.m(1, div7ah8wj8.serializer);
            div7ah8wj8.fullyDrawnReporter_delegatelambda0 = isinfiniteannotations;
            Iterator it = isinfiniteannotations.MediaSessionCompatResultReceiverWrapper.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.Fragment fragment = ((timesd16Qtg0) it.next()).serializer;
                if (fragment != null) {
                    fragment.getDefaultViewModelCreationExtras = true;
                }
            }
            zRemoteActionCompatParcelizer = div7ah8wj8.RemoteActionCompatParcelizer(arrayList, arrayList2, null, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            boolean zBooleanValue = ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(div7Ah8Wj8.serializer((isInfiniteannotations) it2.next()));
            }
            for (ActualLinearGradientShaderVjE6UOU actualLinearGradientShaderVjE6UOU : arrayList3) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    actualLinearGradientShaderVjE6UOU.IconCompatParcelizer((androidx.fragment.app.Fragment) it3.next(), zBooleanValue);
                }
            }
        }
        return zRemoteActionCompatParcelizer;
    }

    public getCenteruvyYCjk(div7Ah8Wj8 div7ah8wj8) {
        this.serializer = div7ah8wj8;
    }
}
