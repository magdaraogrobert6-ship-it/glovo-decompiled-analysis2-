package fwfd.com.fwfsdk.manager;

import android.content.Context;
import fwfd.com.fwfsdk.constant.FWFConstants;
import fwfd.com.fwfsdk.manager.callback.FWFFeatureCallback;
import fwfd.com.fwfsdk.manager.callback.FWFFeaturesCallback;
import fwfd.com.fwfsdk.model.dao.FWFDBRepository;
import fwfd.com.fwfsdk.model.db.FWFFallback;
import fwfd.com.fwfsdk.model.db.FWFFeature;
import fwfd.com.fwfsdk.model.db.FWFResult;
import fwfd.com.fwfsdk.util.FWFDBCallback;
import fwfd.com.fwfsdk.util.FWFResultCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes5.dex */
public class FWFFallbackManager {
    public static void createFWFResultsFallback(Context context, final HashMap<String, FWFFallback> map, String str, final String str2, final FWFFeaturesCallback fWFFeaturesCallback) {
        getFlagsById(context, new ArrayList(map.keySet()), str, new FWFDBCallback<List<FWFFeature>>() { // from class: fwfd.com.fwfsdk.manager.FWFFallbackManager.2
            @Override // fwfd.com.fwfsdk.util.FWFDBCallback
            public void onResponse(List<FWFFeature> list) {
                HashMap<String, FWFResult> map2 = new HashMap<>();
                if (list == null || list.isEmpty()) {
                    for (Map.Entry entry : map.entrySet()) {
                        map2.put((String) entry.getKey(), FWFFallbackManager.getValueFallback((FWFFallback) entry.getValue(), str2));
                    }
                } else {
                    for (FWFFeature fWFFeature : list) {
                        FWFFallback fWFFallback = (FWFFallback) map.get(fWFFeature.getKey());
                        if (fWFFallback != null) {
                            map2.put(fWFFeature.getKey(), FWFFallbackManager.evaluateFallback(fWFFeature, fWFFallback, str2));
                        }
                    }
                }
                fWFFeaturesCallback.onFwfResponse(map2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FWFResult evaluateFallback(FWFFeature fWFFeature, FWFFallback fWFFallback, String str) {
        if (fWFFallback != null) {
            return fWFFallback.getType() == FWFFallback.FallbackTypes.FROM_DB ? getDBFallback(fWFFeature, fWFFallback, str) : getValueFallback(fWFFallback, str);
        }
        return getValueFallback(new FWFFallback("No fallback", FWFFallback.FallbackTypes.FROM_VALUE), "");
    }

    private static FWFResult getDBFallback(FWFFeature fWFFeature, FWFFallback fWFFallback, String str) {
        return (fWFFeature == null || fWFFeature.getVariation() == null) ? getValueFallback(fWFFallback, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, ". No variation found on DB")) : new FWFResult(fWFFeature.getVariation(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, ". Retrieving last variation found from DB."), FWFConstants.EXPLANATION_KIND_DB_FALLBACK, fWFFeature.getTrackInfo());
    }

    private static void getFlagById(Context context, String str, String str2, final FWFDBCallback<FWFFeature> fWFDBCallback) {
        new FWFDBRepository(context).getFlagById(str, str2, new FWFResultCallback<FWFFeature>() { // from class: fwfd.com.fwfsdk.manager.FWFFallbackManager.3
            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onError(String str3) {
                fWFDBCallback.onResponse(null);
            }

            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onResponse(FWFFeature fWFFeature) {
                fWFDBCallback.onResponse(fWFFeature);
            }
        });
    }

    private static void getFlagsById(Context context, List<String> list, String str, final FWFDBCallback<List<FWFFeature>> fWFDBCallback) {
        new FWFDBRepository(context).getFlagsById(list, str, new FWFResultCallback<List<FWFFeature>>() { // from class: fwfd.com.fwfsdk.manager.FWFFallbackManager.4
            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onError(String str2) {
                fWFDBCallback.onResponse(null);
            }

            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onResponse(List<FWFFeature> list2) {
                fWFDBCallback.onResponse(list2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FWFResult getValueFallback(FWFFallback fWFFallback, String str) {
        return fWFFallback != null ? new FWFResult(fWFFallback.getValue(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, ". Retrieving fallback from value."), FWFConstants.EXPLANATION_KIND_VALUE_FALLBACK) : new FWFResult(null, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, ". Retrieving fallback from value."), FWFConstants.EXPLANATION_KIND_NULL_FALLBACK);
    }

    public static void createFWFResultFallback(Context context, String str, String str2, final FWFFallback fWFFallback, final String str3, final FWFFeatureCallback fWFFeatureCallback) {
        if (str != null && str2 != null && context != null && fWFFallback != null) {
            getFlagById(context, str, str2, new FWFDBCallback<FWFFeature>() { // from class: fwfd.com.fwfsdk.manager.FWFFallbackManager.1
                @Override // fwfd.com.fwfsdk.util.FWFDBCallback
                public void onResponse(FWFFeature fWFFeature) {
                    fWFFeatureCallback.onFwfResponse(FWFFallbackManager.evaluateFallback(fWFFeature, fWFFallback, str3));
                }
            });
        } else {
            fWFFeatureCallback.onFwfResponse(getValueFallback(fWFFallback, str3));
        }
    }
}
