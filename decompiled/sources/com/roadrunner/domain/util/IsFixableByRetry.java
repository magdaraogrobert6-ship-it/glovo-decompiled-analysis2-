package com.roadrunner.domain.util;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.api.directions.v5.utils.ParseUtils;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$DecreaseTraffic;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$IncreaseTraffic;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$NoAction;
import com.mapbox.navigation.core.internal.congestions.scanner.TrafficUpdateActionScanner;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.ContentSharingFragment;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.ConstraintsKt;
import o.accessgetInstancedelegatecp;
import o.bitOffsetToIndex;
import o.bitsNeedForSizeUnchecked;
import o.constrainWidthK40F9xA;
import o.createNodeAt;
import o.fixedJhjzzOo;
import o.fixedWidthOenEA2s;
import o.getSteps;
import o.ignoreRemeasureRequests;
import o.restrictConstraintsxF2OJ5Q;

/* JADX INFO: loaded from: classes3.dex */
public final class IsFixableByRetry implements ParseUtils.ValueParser, TrafficUpdateActionScanner {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ IsFixableByRetry(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // com.mapbox.navigation.core.internal.congestions.scanner.TrafficUpdateActionScanner
    public ignoreRemeasureRequests scan(ignoreRemeasureRequests ignoreremeasurerequests, createNodeAt createnodeat) {
        boolean z;
        int i = 2 % 2;
        ignoreremeasurerequests.getClass();
        if (!(ignoreremeasurerequests instanceof TrafficUpdateAction$IncreaseTraffic)) {
            z = ignoreremeasurerequests instanceof TrafficUpdateAction$DecreaseTraffic;
        } else {
            int i2 = write;
            int i3 = i2 + 73;
            serializer = i3 % Fields.SpotShadowColor;
            boolean z2 = i3 % 2 != 0;
            int i4 = i2 + 67;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = z2;
        }
        if (!z) {
            return null;
        }
        TrafficUpdateAction$NoAction trafficUpdateAction$NoAction = TrafficUpdateAction$NoAction.INSTANCE;
        int i6 = serializer + 35;
        write = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return trafficUpdateAction$NoAction;
        }
        throw null;
    }

    public void write(String str, String str2) {
        String strConcat;
        int i = 2 % 2;
        if (TextUtils.isEmpty(str)) {
            int i2 = serializer + 81;
            write = i2 % Fields.SpotShadowColor;
            strConcat = "Credential";
            if (i2 % 2 != 0) {
                int i3 = 79 / 0;
            }
        } else {
            strConcat = "Credential-".concat(str);
        }
        getSteps.read(strConcat, str2, new Object[0]);
        int i4 = write + 55;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.mapbox.api.directions.v5.utils.ParseUtils.ValueParser
    public Object parse(String str) {
        int i = 2 % 2;
        int i2 = write + 113;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.IconCompatParcelizer == 2) {
            return Integer.valueOf(str);
        }
        if (str.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (!str.equalsIgnoreCase("false")) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Boolean value should be either true or false string but is ".concat(str));
            return null;
        }
        Boolean bool = Boolean.FALSE;
        int i4 = write + 119;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return bool;
    }

    public static void read(FragmentActivity fragmentActivity, String str, String str2) {
        int i = 2 % 2;
        int i2 = serializer + 77;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        if (fragmentActivity.getSupportFragmentManager().findFragmentByTag("ContentSharingFragment") != null) {
            int i4 = write + 65;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        ContentSharingFragment contentSharingFragment = new ContentSharingFragment();
        Bundle bundle = new Bundle();
        bundle.putString("address", str);
        bundle.putString("result_key", str2);
        contentSharingFragment.setArguments(bundle);
        contentSharingFragment.RemoteActionCompatParcelizer(fragmentActivity.getSupportFragmentManager(), "ContentSharingFragment");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00dd  */
    public static ArrayList IconCompatParcelizer(Set set, List list) {
        boolean z;
        bitsNeedForSizeUnchecked bitsneedforsizeunchecked;
        bitsNeedForSizeUnchecked bitsneedforsizeunchecked2;
        bitOffsetToIndex bitoffsettoindex;
        constrainWidthK40F9xA constrainwidthk40f9xa;
        Object obj;
        restrictConstraintsxF2OJ5Q restrictconstraintsxf2oj5q;
        int i = 2 % 2;
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        Iterator it = list2.iterator();
        while (!(!it.hasNext())) {
            fixedWidthOenEA2s fixedwidthoenea2s = (fixedWidthOenEA2s) it.next();
            List list3 = fixedwidthoenea2s.read();
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        break;
                    }
                    if (!set.contains((String) it2.next())) {
                        z = false;
                        break;
                    }
                }
            } else {
                z = true;
                break;
            }
            Object obj2 = null;
            if (fixedwidthoenea2s instanceof fixedJhjzzOo) {
                int i2 = write + 121;
                int i3 = i2 % Fields.SpotShadowColor;
                serializer = i3;
                if (i2 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                if (z) {
                    restrictconstraintsxf2oj5q = ((fixedJhjzzOo) fixedwidthoenea2s).currentStateType;
                    if (restrictconstraintsxf2oj5q == restrictConstraintsxF2OJ5Q.DISABLED) {
                        int i4 = write + 123;
                        serializer = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            restrictconstraintsxf2oj5q = restrictConstraintsxF2OJ5Q.NOT_INITIATED;
                            int i5 = 16 / 0;
                        } else {
                            restrictconstraintsxf2oj5q = restrictConstraintsxF2OJ5Q.NOT_INITIATED;
                        }
                    }
                } else {
                    int i6 = i3 + 67;
                    write = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        restrictConstraintsxF2OJ5Q restrictconstraintsxf2oj5q2 = restrictConstraintsxF2OJ5Q.DISABLED;
                        throw null;
                    }
                    restrictconstraintsxf2oj5q = restrictConstraintsxF2OJ5Q.DISABLED;
                }
                restrictConstraintsxF2OJ5Q restrictconstraintsxf2oj5q3 = restrictconstraintsxf2oj5q;
                fixedJhjzzOo fixedjhjzzoo = (fixedJhjzzOo) fixedwidthoenea2s;
                Map map = fixedjhjzzoo.availableStates;
                ConstraintsKt constraintsKt = (ConstraintsKt) map.get(restrictconstraintsxf2oj5q3);
                obj = fixedJhjzzOo.read(fixedjhjzzoo, constraintsKt == null ? (ConstraintsKt) map.get(restrictConstraintsxF2OJ5Q.NOT_INITIATED) : constraintsKt, restrictconstraintsxf2oj5q3, z, false, 143);
            } else {
                if (!(fixedwidthoenea2s instanceof bitOffsetToIndex)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                if (z) {
                    bitsNeedForSizeUnchecked bitsneedforsizeunchecked3 = ((bitOffsetToIndex) fixedwidthoenea2s).currentStateType;
                    bitsNeedForSizeUnchecked bitsneedforsizeunchecked4 = bitsNeedForSizeUnchecked.COMPLETED;
                    if (bitsneedforsizeunchecked3 == bitsneedforsizeunchecked4) {
                        bitsneedforsizeunchecked2 = bitsneedforsizeunchecked4;
                    } else {
                        bitsneedforsizeunchecked = bitsNeedForSizeUnchecked.RUNNING;
                    }
                    bitoffsettoindex = (bitOffsetToIndex) fixedwidthoenea2s;
                    constrainwidthk40f9xa = (constrainWidthK40F9xA) bitoffsettoindex.availableStates.get(bitsneedforsizeunchecked2);
                    if (constrainwidthk40f9xa == null) {
                        constrainwidthk40f9xa = bitoffsettoindex.currentState;
                    }
                    obj = bitOffsetToIndex.read(bitoffsettoindex, null, constrainwidthk40f9xa, bitsneedforsizeunchecked2, z, 63);
                } else {
                    bitsneedforsizeunchecked = bitsNeedForSizeUnchecked.DISABLED;
                }
                bitsneedforsizeunchecked2 = bitsneedforsizeunchecked;
                bitoffsettoindex = (bitOffsetToIndex) fixedwidthoenea2s;
                constrainwidthk40f9xa = (constrainWidthK40F9xA) bitoffsettoindex.availableStates.get(bitsneedforsizeunchecked2);
                if (constrainwidthk40f9xa == null) {
                    constrainwidthk40f9xa = bitoffsettoindex.currentState;
                }
                obj = bitOffsetToIndex.read(bitoffsettoindex, null, constrainwidthk40f9xa, bitsneedforsizeunchecked2, z, 63);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
