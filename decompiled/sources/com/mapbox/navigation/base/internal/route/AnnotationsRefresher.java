package com.mapbox.navigation.base.internal.route;

import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import java.util.ArrayList;
import java.util.List;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getInAppMessageStackannotations;
import o.instance_delegatelambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationsRefresher {
    public static ArrayList mergeAnnotationProperty(LegAnnotation legAnnotation, LegAnnotation legAnnotation2, int i, int i2, int i3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        List list = (List) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(legAnnotation);
        if (list == null) {
            return null;
        }
        List list2 = legAnnotation2 != null ? (List) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(legAnnotation2) : null;
        if (list2 == null) {
            list2 = instance_delegatelambda0.write;
        }
        int size = list.size();
        if (size < i) {
            LoggerProviderKt.logE("Annotations sizes mismatch: index=" + i + ", expected_size=" + size, "AnnotationsRefresher");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < i; i4++) {
            arrayList.add(list.get(i4));
        }
        int iMin = Math.min(size - i, list2.size());
        for (int i5 = 0; i5 < iMin; i5++) {
            arrayList.add(list2.get(i5));
        }
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size - size2; i6++) {
            arrayList.add(list.get(i6 + size2));
        }
        if (i2 > 0) {
            int i7 = (i2 + i3) - 1;
            if (i7 <= size) {
                size = i7;
            }
            getInAppMessageStackannotations it = new ensureSubscribedToInAppMessageEventslambda7(i3, size, 1).iterator();
            while (it.RemoteActionCompatParcelizer) {
                int iRemoteActionCompatParcelizer = it.RemoteActionCompatParcelizer();
                arrayList.set(iRemoteActionCompatParcelizer, list.get(iRemoteActionCompatParcelizer));
            }
        }
        return arrayList;
    }
}
