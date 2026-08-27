package com.mapbox.search;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import o.StillCaptureFlashStopRepeatingQuirk;
import o.UseTorchAsFlashQuirk;
import o.getOrientation;
import o.getWeightSum;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ApiTypeKt {
    public static final com.mapbox.search.internal.bindgen.ApiType mapToCore(ApiType apiType) {
        int i = WhenMappings.$EnumSwitchMapping$0[apiType.ordinal()];
        if (i == 1) {
            return com.mapbox.search.internal.bindgen.ApiType.GEOCODING;
        }
        if (i == 2) {
            return com.mapbox.search.internal.bindgen.ApiType.SBS;
        }
        if (i == 3) {
            return com.mapbox.search.internal.bindgen.ApiType.SEARCH_BOX;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiType.values().length];
            try {
                iArr[ApiType.GEOCODING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiType.SBS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiType.SEARCH_BOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void read(StillCaptureFlashStopRepeatingQuirk stillCaptureFlashStopRepeatingQuirk, ArrayList arrayList) {
        if (stillCaptureFlashStopRepeatingQuirk instanceof UseTorchAsFlashQuirk) {
            Iterator it = ((UseTorchAsFlashQuirk) stillCaptureFlashStopRepeatingQuirk).serializer.iterator();
            while (it.hasNext()) {
                read((StillCaptureFlashStopRepeatingQuirk) it.next(), arrayList);
            }
        } else if (stillCaptureFlashStopRepeatingQuirk instanceof getWeightSum) {
            arrayList.add(((getWeightSum) stillCaptureFlashStopRepeatingQuirk).serializer);
        } else {
            arrayList.add(new getOrientation(stillCaptureFlashStopRepeatingQuirk));
        }
    }
}
