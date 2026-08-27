package fwfd.com.fwfsdk.manager;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import fwfd.com.fwfsdk.FunWithFlags;
import fwfd.com.fwfsdk.constant.FWFConstants;
import fwfd.com.fwfsdk.manager.callback.FWFFeatureCallback;
import fwfd.com.fwfsdk.manager.callback.FWFFeaturesCallback;
import fwfd.com.fwfsdk.manager.callback.FWFFlagKeysCallback;
import fwfd.com.fwfsdk.model.api.FWFPut;
import fwfd.com.fwfsdk.model.api.FWFSubscribeObservable;
import fwfd.com.fwfsdk.model.api.FWFSubscribeResult;
import fwfd.com.fwfsdk.model.api.FlagKey;
import fwfd.com.fwfsdk.model.api.FlagKeysContainer;
import fwfd.com.fwfsdk.model.dao.FWFAPIDAO;
import fwfd.com.fwfsdk.model.dao.FWFDBRepository;
import fwfd.com.fwfsdk.model.db.FWFFallback;
import fwfd.com.fwfsdk.model.db.FWFFeature;
import fwfd.com.fwfsdk.model.db.FWFFlagId;
import fwfd.com.fwfsdk.model.db.FWFFlagKey;
import fwfd.com.fwfsdk.model.db.FWFResult;
import fwfd.com.fwfsdk.model.db.FWFSDKInfo;
import fwfd.com.fwfsdk.util.FWFDBCallback;
import fwfd.com.fwfsdk.util.FWFHelper;
import fwfd.com.fwfsdk.util.FWFLogger;
import fwfd.com.fwfsdk.util.FWFResultCallback;
import fwfd.com.fwfsdk.util.FWFSubscribeObserverCallback;
import fwfd.com.fwfsdk.util.FWFTrackingCallback;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.accesstoOffsetmoWRBKg;
import o.getScrollAxesk4lQ0M;
import o.setFontSizeR2X_6o;

/* JADX INFO: loaded from: classes5.dex */
public class FWFDataManager {
    private static FWFDataManager instance;
    private static final FWFSubscribeObservable observable = new FWFSubscribeObservable();

    public FWFSubscribeObservable getObservable() {
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<FlagKey> buildFlagKeys(List<FWFFlagKey> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<FWFFlagKey> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toFlagKey());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, FWFResult> buildFlagsResult(List<FWFFeature> list) {
        HashMap<String, FWFResult> map = new HashMap<>();
        for (FWFFeature fWFFeature : list) {
            map.put(fWFFeature.getKey(), fWFFeature.toFWFResult());
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteAllFlagRecords(Context context) {
        new FWFDBRepository(context).deleteAllFlagRecords();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteAllFlagsFromEnvironment(Context context, String str) {
        new FWFDBRepository(context).deleteAllFlagsFromEnvironment(str);
    }

    private void getAllFlagsByRelevantContext(Context context, String str, final FWFDBCallback<List<FWFFlagId>> fWFDBCallback) {
        new FWFDBRepository(context).getAllFlagKeysByRelevantContext(str, new FWFResultCallback<List<FWFFlagId>>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.14
            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onError(String str2) {
                fWFDBCallback.onResponse(new ArrayList());
            }

            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onResponse(List<FWFFlagId> list) {
                fWFDBCallback.onResponse(list);
            }
        });
    }

    private void getFlagById(Context context, String str, String str2, final FWFDBCallback<FWFFeature> fWFDBCallback) {
        new FWFDBRepository(context).getFlagById(str, str2, new FWFResultCallback<FWFFeature>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.3
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

    /* JADX INFO: Access modifiers changed from: private */
    public void getFlagKeysFromDB(Context context, String str, final FWFDBCallback<List<FWFFlagKey>> fWFDBCallback) {
        new FWFDBRepository(context).getFlagKeys(str, new FWFResultCallback<List<FWFFlagKey>>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.22
            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onError(String str2) {
                fWFDBCallback.onResponse(new ArrayList());
            }

            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onResponse(List<FWFFlagKey> list) {
                fWFDBCallback.onResponse(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> getFlagKeysFromResult(List<FWFFeature> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<FWFFeature> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        return arrayList;
    }

    private void getFlagsById(Context context, List<String> list, String str, final FWFDBCallback<List<FWFFeature>> fWFDBCallback) {
        new FWFDBRepository(context).getFlagsById(list, str, new FWFResultCallback<List<FWFFeature>>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.7
            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onError(String str2) {
                fWFDBCallback.onResponse(new ArrayList());
            }

            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onResponse(List<FWFFeature> list2) {
                fWFDBCallback.onResponse(list2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getFlagsFromDB(Context context, String str, final FWFDBCallback<List<FWFFeature>> fWFDBCallback) {
        new FWFDBRepository(context).getAllFlagsFromEnvironment(str, new FWFResultCallback<List<FWFFeature>>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.25
            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onError(String str2) {
                fWFDBCallback.onResponse(new ArrayList());
            }

            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onResponse(List<FWFFeature> list) {
                fWFDBCallback.onResponse(list);
            }
        });
    }

    private void getLastSDKInfo(Context context, final FWFDBCallback<FWFSDKInfo> fWFDBCallback) {
        new FWFDBRepository(context).getLastSDKInfo(new FWFResultCallback<FWFSDKInfo>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.19
            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onError(String str) {
                fWFDBCallback.onResponse(null);
            }

            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onResponse(FWFSDKInfo fWFSDKInfo) {
                fWFDBCallback.onResponse(fWFSDKInfo);
            }
        });
    }

    private StringBuilder getStringForTracking(List<FWFFeature> list) {
        StringBuilder sb = new StringBuilder();
        for (FWFFeature fWFFeature : list) {
            Object variation = fWFFeature.getVariation();
            String key = fWFFeature.getKey();
            if (variation != null && key != null) {
                sb.append(key + ":" + variation.toString() + ",");
            }
        }
        return sb;
    }

    private void getSubscribedFlagsFromDB(Context context, final FWFDBCallback<List<FWFFlagId>> fWFDBCallback) {
        new FWFDBRepository(context).getSubscribedFlagIds(new FWFResultCallback<List<FWFFlagId>>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.11
            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onError(String str) {
                fWFDBCallback.onResponse(null);
                FWFLogger.logError(str);
            }

            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onResponse(List<FWFFlagId> list) {
                fWFDBCallback.onResponse(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void insertFlagCheckingSubscribe(Context context, FWFFeature fWFFeature) {
        new FWFDBRepository(context).insertFlagCheckingSubscribe(fWFFeature);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void insertFlagInDB(Context context, FWFFeature fWFFeature) {
        new FWFDBRepository(context).insertFlag(fWFFeature);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void insertFlagsInDB(Context context, List<FWFFeature> list) {
        new FWFDBRepository(context).insertFlags(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void insertSDKInfo(Context context, FWFSDKInfo fWFSDKInfo) {
        new FWFDBRepository(context).insertSDKInfo(fWFSDKInfo);
    }

    private void isValidExpirationForFlags(Context context, String str, final FWFDBCallback<Boolean> fWFDBCallback) {
        new FWFDBRepository(context).getOldestUpdatedFlagFromEnvironment(str, new FWFResultCallback<Boolean>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.26
            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onError(String str2) {
                fWFDBCallback.onResponse(Boolean.FALSE);
            }

            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onResponse(Boolean bool) {
                fWFDBCallback.onResponse(bool);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveFlagKeys(List<FlagKey> list, String str, Context context) {
        ArrayList arrayList = new ArrayList();
        Iterator<FlagKey> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toFWFFlagKey(str));
        }
        new FWFDBRepository(context).deleteAndInsertNewFlagKeys(arrayList, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSubscribedFlagsFromAPI(List<FWFFlagId> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        for (FWFFlagId fWFFlagId : list) {
            if (fWFFlagId != null && fWFFlagId.getAccessToken() != null && (fWFFlagId.requiresUpdate().booleanValue() || str.equals(FWFHelper.FROM_METHOD_RELEVANT_CONTEXT))) {
                List list2 = (List) map.get(fWFFlagId.getAccessToken());
                if (list2 != null) {
                    list2.add(fWFFlagId.getKey());
                    map.put(fWFFlagId.getAccessToken(), list2);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(fWFFlagId.getKey());
                    map.put(fWFFlagId.getAccessToken(), arrayList);
                }
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list3 = (List) entry.getValue();
            if (list3.size() > 1) {
                getSubscribedFromAPI((String[]) list3.toArray(new String[0]), (String) entry.getKey(), str, null);
            } else if (!list3.isEmpty()) {
                getSubscribedFromAPI((String) list3.get(0), (String) entry.getKey(), str);
            }
        }
    }

    public void deleteAllFlags() {
        new FWFDBRepository(FunWithFlags.getInstance().getContext()).deleteAllFlagRecords();
    }

    public void getAllExperiments(Context context, final FWFTrackingCallback fWFTrackingCallback) {
        new FWFDBRepository(context).getAllExperiments(new FWFResultCallback<List<FWFFeature>>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.16
            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onError(String str) {
                fWFTrackingCallback.onResponse(FWFDataManager.this.buildExperimentsResult(new ArrayList()));
            }

            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onResponse(List<FWFFeature> list) {
                fWFTrackingCallback.onResponse(FWFDataManager.this.buildExperimentsResult(list));
            }
        });
    }

    public void getFlagsToTrack(Context context, final FWFTrackingCallback fWFTrackingCallback) {
        new FWFDBRepository(context).getAllFlags(new FWFResultCallback<List<FWFFeature>>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.17
            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onError(String str) {
                fWFTrackingCallback.onResponse(FWFDataManager.this.buildExperimentsResult(new ArrayList()));
            }

            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onResponse(List<FWFFeature> list) {
                fWFTrackingCallback.onResponse(FWFDataManager.this.buildFlagsToTrackResult(list));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String buildExperimentsResult(List<FWFFeature> list) {
        StringBuilder stringForTracking = getStringForTracking(list);
        return ff$$ExternalSyntheticOutline0.m("eventAbTestCampaigns: \"", stringForTracking.length() == 0 ? "" : stringForTracking.substring(0, stringForTracking.length() - 1), "\"");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String buildFlagsToTrackResult(List<FWFFeature> list) {
        StringBuilder stringForTracking = getStringForTracking(list);
        return ff$$ExternalSyntheticOutline0.m("eventFwfFeatures: \"", stringForTracking.length() == 0 ? "" : stringForTracking.substring(0, stringForTracking.length() - 1), "\"");
    }

    private void createFWFResultForObserver(String str, String str2, FWFResult fWFResult, FWFSubscribeResult.FWFSubscribeCallbackExplanation fWFSubscribeCallbackExplanation) {
        observable.notify(str, new FWFSubscribeResult(str2, fWFResult, fWFSubscribeCallbackExplanation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getFlagKeysFromAPI(final String str, final FWFFlagKeysCallback fWFFlagKeysCallback, final Context context) {
        new FWFAPIDAO(FWFHelper.FROM_METHOD_GET_FLAG_KEYS).getFWFFlagKeys(str, new FWFResultCallback<FlagKeysContainer>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.21
            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onError(String str2) {
                FWFLogger.logError(str2);
                FWFDataManager.this.getFlagKeysFromDB(context, str, new FWFDBCallback<List<FWFFlagKey>>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.21.1
                    @Override // fwfd.com.fwfsdk.util.FWFDBCallback
                    public void onResponse(List<FWFFlagKey> list) {
                        AnonymousClass21 anonymousClass21 = AnonymousClass21.this;
                        fWFFlagKeysCallback.onResponse(new FlagKeysContainer(FWFDataManager.this.buildFlagKeys(list)));
                    }
                });
            }

            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onResponse(FlagKeysContainer flagKeysContainer) {
                if (FunWithFlags.getInstance().getFlagKeysExpirationTime() != null) {
                    FWFDataManager.this.saveFlagKeys(flagKeysContainer.getFlagKeys(), str, context);
                }
                fWFFlagKeysCallback.onResponse(flagKeysContainer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getFlagsFromAPI(final Context context, final String str, final FWFFeaturesCallback fWFFeaturesCallback) {
        new FWFAPIDAO(FWFHelper.FROM_METHOD_GET_ALL_FLAGS).getFWFFeatures(str, new FWFResultCallback<LinkedHashMap<String, FWFPut>>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.24
            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onResponse(LinkedHashMap<String, FWFPut> linkedHashMap) {
                HashMap<String, FWFResult> map = new HashMap<>();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, FWFPut> entry : linkedHashMap.entrySet()) {
                    FWFFeature fWFFeature = new FWFFeature(entry.getKey(), entry.getValue(), 1, str);
                    if (fWFFeature.getVariation() != null) {
                        arrayList.add(fWFFeature);
                        map.put(fWFFeature.getKey(), new FWFResult(fWFFeature.getVariation(), fWFFeature.getAbTest(), fWFFeature.getExplanation(), fWFFeature.getTrackInfo(), fWFFeature.getHoldoutsEvaluations()));
                    }
                }
                FWFDataManager.this.deleteAllFlagsFromEnvironment(context, str);
                FWFDataManager.this.insertFlagsInDB(context, arrayList);
                fWFFeaturesCallback.onFwfResponse(map);
            }

            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onError(String str2) {
                fWFFeaturesCallback.onFwfResponse(new HashMap<>());
                FWFLogger.logError(str2);
            }
        });
    }

    private void getSubscribedFromAPI(String[] strArr, final String str, String str2, final FWFFeaturesCallback fWFFeaturesCallback) {
        final Context context = FunWithFlags.getInstance().getContext();
        new FWFAPIDAO(str2).getFWFFeatures(strArr, str, new FWFResultCallback<LinkedHashMap<String, FWFPut>>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.8
            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onResponse(LinkedHashMap<String, FWFPut> linkedHashMap) {
                HashMap<String, FWFResult> map = new HashMap<>();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, FWFPut> entry : linkedHashMap.entrySet()) {
                    if (entry.getValue() != null && entry.getValue().getVariation() != null) {
                        FWFFeature fWFFeature = new FWFFeature(entry.getKey(), entry.getValue(), 1, str);
                        arrayList.add(fWFFeature);
                        map.put(fWFFeature.getKey(), new FWFResult(fWFFeature.getVariation(), fWFFeature.getAbTest(), fWFFeature.getExplanation(), fWFFeature.getTrackInfo(), fWFFeature.getHoldoutsEvaluations()));
                    }
                }
                FWFDataManager.this.insertFlagsInDB(context, arrayList);
                FWFDataManager.this.notifyObserver(map, str, FWFSubscribeResult.FWFSubscribeCallbackExplanation.BACKGROUND_UPDATE);
                FWFFeaturesCallback fWFFeaturesCallback2 = fWFFeaturesCallback;
                if (fWFFeaturesCallback2 != null) {
                    fWFFeaturesCallback2.onFwfResponse(map);
                }
            }

            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onError(String str3) {
                FWFLogger.logError("FunWithFlags: Error updating subscribed features." + str3);
                FWFFeaturesCallback fWFFeaturesCallback2 = fWFFeaturesCallback;
                if (fWFFeaturesCallback2 != null) {
                    fWFFeaturesCallback2.onFwfResponse(new HashMap<>());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyObserver(HashMap<String, FWFResult> map, String str, FWFSubscribeResult.FWFSubscribeCallbackExplanation fWFSubscribeCallbackExplanation) {
        observable.notify(str, new FWFSubscribeResult(map, fWFSubscribeCallbackExplanation));
    }

    public void addObserver(String str, FWFSubscribeObserverCallback fWFSubscribeObserverCallback) {
        observable.addObserver(new FWFSubscribeObservable.FWFSubscribeResultObserver(fWFSubscribeObserverCallback, str));
    }

    public void cleanDBOnVersionUpdate() {
        final Context context = FunWithFlags.getInstance().getContext();
        getLastSDKInfo(context, new FWFDBCallback<FWFSDKInfo>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.18
            @Override // fwfd.com.fwfsdk.util.FWFDBCallback
            public void onResponse(FWFSDKInfo fWFSDKInfo) {
                if (fWFSDKInfo != null && (fWFSDKInfo.getVersionNumber().intValue() >= FWFConstants.SDK_VERSION_NUMBER.intValue() || fWFSDKInfo.getSdkVersion().equals(FWFConstants.SDK_VERSION))) {
                    FWFLogger.logInfo(FWFHelper.SDK_NO_NEW_VERSION);
                    return;
                }
                FWFDataManager.this.insertSDKInfo(context, new FWFSDKInfo(FWFConstants.SDK_VERSION, FWFConstants.SDK_VERSION_NUMBER));
                FWFDataManager.this.deleteAllFlagRecords(context);
                FWFLogger.logInfo(FWFHelper.SDK_UPDATED);
            }
        });
    }

    public void getFlagKeys(final String str, final FWFFlagKeysCallback fWFFlagKeysCallback) {
        final Context context = FunWithFlags.getInstance().getContext();
        if (context == null || FunWithFlags.getInstance().getFlagKeysExpirationTime() == null) {
            getFlagKeysFromAPI(str, fWFFlagKeysCallback, context);
        } else {
            getFlagKeysFromDB(context, str, new FWFDBCallback<List<FWFFlagKey>>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.20
                @Override // fwfd.com.fwfsdk.util.FWFDBCallback
                public void onResponse(List<FWFFlagKey> list) {
                    if (list.isEmpty()) {
                        FWFDataManager.this.getFlagKeysFromAPI(str, fWFFlagKeysCallback, context);
                    } else if (list.get(0).isValid().booleanValue()) {
                        fWFFlagKeysCallback.onResponse(new FlagKeysContainer(FWFDataManager.this.buildFlagKeys(list)));
                    } else {
                        FWFDataManager.this.getFlagKeysFromAPI(str, fWFFlagKeysCallback, context);
                    }
                }
            });
        }
    }

    public void getFlags(final String str, Boolean bool, final FWFFeaturesCallback fWFFeaturesCallback) {
        final Context context = FunWithFlags.getInstance().getContext();
        if (bool.booleanValue()) {
            getFlagsFromAPI(context, str, fWFFeaturesCallback);
        } else {
            isValidExpirationForFlags(context, str, new FWFDBCallback<Boolean>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.23
                @Override // fwfd.com.fwfsdk.util.FWFDBCallback
                public void onResponse(Boolean bool2) {
                    boolean zBooleanValue = bool2.booleanValue();
                    FWFDataManager fWFDataManager = FWFDataManager.this;
                    if (zBooleanValue) {
                        fWFDataManager.getFlagsFromDB(context, str, new FWFDBCallback<List<FWFFeature>>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.23.1
                            @Override // fwfd.com.fwfsdk.util.FWFDBCallback
                            public void onResponse(List<FWFFeature> list) {
                                if (list.isEmpty()) {
                                    AnonymousClass23 anonymousClass23 = AnonymousClass23.this;
                                    FWFDataManager.this.getFlagsFromAPI(context, str, fWFFeaturesCallback);
                                    return;
                                }
                                HashMap<String, FWFResult> map = new HashMap<>();
                                for (FWFFeature fWFFeature : list) {
                                    if (fWFFeature.getVariation() != null) {
                                        map.put(fWFFeature.getKey(), new FWFResult(fWFFeature.getVariation(), fWFFeature.getAbTest(), fWFFeature.getExplanation(), fWFFeature.getTrackInfo(), fWFFeature.getHoldoutsEvaluations()));
                                    }
                                }
                                fWFFeaturesCallback.onFwfResponse(map);
                            }
                        });
                    } else {
                        fWFDataManager.getFlagsFromAPI(context, str, fWFFeaturesCallback);
                    }
                }
            });
        }
    }

    public void getVariationFromApi(final String str, final String str2, final FWFFallback fWFFallback, final FWFSubscribeResult.FWFSubscribeCallbackExplanation fWFSubscribeCallbackExplanation, boolean z, final FWFFeatureCallback fWFFeatureCallback) {
        final Context context = FunWithFlags.getInstance().getContext();
        new FWFAPIDAO(FWFHelper.getVariationFromMethod(z)).getFWFFeature(str, str2, new FWFResultCallback<FWFPut>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.2
            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onError(String str3) {
                FWFFallbackManager.createFWFResultFallback(context, str, str2, fWFFallback, str3, fWFFeatureCallback);
            }

            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onResponse(FWFPut fWFPut) {
                if (fWFPut == null || fWFPut.getVariation() == null) {
                    FWFFallbackManager.createFWFResultFallback(context, str, str2, fWFFallback, "ERROR IN FLAG", fWFFeatureCallback);
                    return;
                }
                FWFFeature fWFFeature = new FWFFeature(str, fWFPut, str2);
                FWFResult fWFResult = fWFFeature.toFWFResult();
                fWFFeatureCallback.onFwfResponse(fWFResult);
                FWFDataManager.this.notifyObserver(str, str2, fWFResult, fWFSubscribeCallbackExplanation);
                FWFDataManager.this.insertFlagCheckingSubscribe(context, fWFFeature);
            }
        });
    }

    public void getVariationFromDB(final String str, final String str2, final FWFFallback fWFFallback, final FWFSubscribeResult.FWFSubscribeCallbackExplanation fWFSubscribeCallbackExplanation, final FWFFeatureCallback fWFFeatureCallback) {
        getFlagById(FunWithFlags.getInstance().getContext(), str, str2, new FWFDBCallback<FWFFeature>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.1
            @Override // fwfd.com.fwfsdk.util.FWFDBCallback
            public void onResponse(FWFFeature fWFFeature) {
                if (fWFFeature == null || fWFFeature.getVariation() == null || fWFFeature.requiresUpdate()) {
                    FWFDataManager.this.getVariationFromApi(str, str2, fWFFallback, fWFSubscribeCallbackExplanation, false, fWFFeatureCallback);
                } else {
                    fWFFeatureCallback.onFwfResponse(fWFFeature.toFWFResult());
                }
            }
        });
    }

    public void getVariationsFromAPI(final HashMap<String, FWFFallback> map, final String str, final FWFSubscribeResult.FWFSubscribeCallbackExplanation fWFSubscribeCallbackExplanation, boolean z, final FWFFeaturesCallback fWFFeaturesCallback) {
        final Context context = FunWithFlags.getInstance().getContext();
        final String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        if (strArr.length > 1) {
            new FWFAPIDAO(FWFHelper.getVariationsFromMethod(z)).getFWFFeatures(strArr, str, new FWFResultCallback<LinkedHashMap<String, FWFPut>>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.5
                @Override // fwfd.com.fwfsdk.util.FWFResultCallback
                public void onResponse(LinkedHashMap<String, FWFPut> linkedHashMap) {
                    final HashMap<String, FWFResult> map2 = new HashMap<>();
                    HashMap map3 = new HashMap();
                    for (Map.Entry<String, FWFPut> entry : linkedHashMap.entrySet()) {
                        FWFFeature fWFFeature = new FWFFeature(entry.getKey(), entry.getValue(), str);
                        if (fWFFeature.getVariation() != null) {
                            FWFDataManager.this.insertFlagCheckingSubscribe(context, fWFFeature);
                            map2.put(fWFFeature.getKey(), new FWFResult(fWFFeature.getVariation(), fWFFeature.getAbTest(), fWFFeature.getExplanation(), fWFFeature.getTrackInfo(), fWFFeature.getHoldoutsEvaluations()));
                        } else {
                            map3.put(entry.getKey(), (FWFFallback) map.get(entry.getKey()));
                        }
                    }
                    if (!map3.isEmpty()) {
                        FWFFallbackManager.createFWFResultsFallback(context, map3, str, "ERROR IN FLAG", new FWFFeaturesCallback() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.5.1
                            private static final byte[] $$c = {97, -62, 62, -95};
                            private static final int $$d = 230;
                            private static int $10 = 0;
                            private static int $11 = 1;
                            private static final byte[] $$a = {21, -95, -81, 46, 12, -15, 7, 6, -13, 1, -19, 19, -15, 11, 2, -5, 0, -17, -5, 5};
                            private static final int $$b = 34;
                            private static int MediaBrowserCompatMediaItem = 0;
                            private static int RatingCompat = 1;
                            private static long RemoteActionCompatParcelizer = -7009568347796326538L;
                            private static int serializer = -658032778;
                            private static char IconCompatParcelizer = 26149;
                            private static char[] write = {20880, 20873, 20900, 20572, 20901, 20890, 20881, 20882, 20586, 20885, 20869, 20602, 20596, 20573, 20582, 20585, 20892, 20874, 20888, 20895, 20595, 20897, 20603, 20891, 20875, 20587, 20893, 20894, 20568, 20581, 20580, 20569, 20597, 20599, 20606, 20598, 20887, 20884, 20886, 20571, 20570, 20577, 20583, 20870, 20574, 20903, 20594, 20902, 20584, 20883, 20593, 20605, 20600, 20872, 20528, 20558, 20576, 20566};
                            private static int read = 1336102958;
                            private static boolean MediaDescriptionCompat = true;
                            private static boolean MediaMetadataCompat = true;

                            private static String $$e(int i, short s, short s2) {
                                int i2 = i + 66;
                                int i3 = 3 - (s * 4);
                                byte[] bArr = $$c;
                                int i4 = s2 * 3;
                                byte[] bArr2 = new byte[i4 + 1];
                                int i5 = -1;
                                if (bArr == null) {
                                    int i6 = i3 + (-i4);
                                    i3 = i3;
                                    i2 = i6;
                                }
                                while (true) {
                                    i5++;
                                    bArr2[i5] = (byte) i2;
                                    int i7 = i3 + 1;
                                    if (i5 == i4) {
                                        return new String(bArr2, 0);
                                    }
                                    i3 = i7;
                                    i2 += -bArr[i7];
                                }
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x0021  */
                            /* JADX WARN: Code duplicated, block: B:8:0x0019  */
                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
                            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                */
                            private static void b(int r5, short r6, short r7, java.lang.Object[] r8) {
                                /*
                                    int r0 = r5 + 3
                                    byte[] r1 = fwfd.com.fwfsdk.manager.FWFDataManager.AnonymousClass5.AnonymousClass1.$$a
                                    int r6 = 115 - r6
                                    int r7 = 18 - r7
                                    byte[] r0 = new byte[r0]
                                    int r5 = r5 + 2
                                    r2 = 0
                                    if (r1 != 0) goto L13
                                    r4 = r5
                                    r6 = r7
                                    r3 = r2
                                    goto L25
                                L13:
                                    r3 = r2
                                L14:
                                    byte r4 = (byte) r6
                                    r0[r3] = r4
                                    if (r3 != r5) goto L21
                                    java.lang.String r5 = new java.lang.String
                                    r5.<init>(r0, r2)
                                    r8[r2] = r5
                                    return
                                L21:
                                    int r3 = r3 + 1
                                    r4 = r1[r7]
                                L25:
                                    int r7 = r7 + 1
                                    int r4 = -r4
                                    int r6 = r6 + r4
                                    int r6 = r6 + (-2)
                                    goto L14
                                */
                                throw new UnsupportedOperationException("Method not decompiled: fwfd.com.fwfsdk.manager.FWFDataManager.AnonymousClass5.AnonymousClass1.b(int, short, short, java.lang.Object[]):void");
                            }

                            @Override // fwfd.com.fwfsdk.manager.callback.FWFFeaturesCallback
                            public void onFwfResponse(HashMap<String, FWFResult> map4) {
                                int i = 2 % 2;
                                int i2 = RatingCompat + 45;
                                MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
                                int i3 = i2 % 2;
                                map2.putAll(map4);
                                fWFFeaturesCallback.onFwfResponse(map2);
                                AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                                FWFDataManager.this.notifyObserver(map2, str, fWFSubscribeCallbackExplanation);
                                int i4 = RatingCompat + 73;
                                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                                int i5 = i4 % 2;
                            }

                            private static void a(int i, char[] cArr, char c, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
                                int i2 = 2;
                                int i3 = 2 % 2;
                                accesstoOffsetmoWRBKg accesstooffsetmowrbkg = new accesstoOffsetmoWRBKg();
                                int length = cArr2.length;
                                char[] cArr4 = new char[length];
                                int length2 = cArr3.length;
                                char[] cArr5 = new char[length2];
                                int i4 = 0;
                                System.arraycopy(cArr2, 0, cArr4, 0, length);
                                System.arraycopy(cArr3, 0, cArr5, 0, length2);
                                cArr4[0] = (char) (cArr4[0] ^ c);
                                cArr5[2] = (char) (cArr5[2] + ((char) i));
                                int length3 = cArr.length;
                                char[] cArr6 = new char[length3];
                                accesstooffsetmowrbkg.IconCompatParcelizer = 0;
                                while (accesstooffsetmowrbkg.IconCompatParcelizer < length3) {
                                    int i5 = $10 + 23;
                                    $11 = i5 % Fields.SpotShadowColor;
                                    int i6 = i5 % i2;
                                    try {
                                        Object[] objArr2 = {accesstooffsetmowrbkg};
                                        Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2056078218);
                                        if (objRemoteActionCompatParcelizer == null) {
                                            char cIndexOf = (char) TextUtils.indexOf("", "");
                                            int longPressTimeout = 231 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                            int iIndexOf = 21 - TextUtils.indexOf("", "", i4, i4);
                                            Class[] clsArr = new Class[1];
                                            clsArr[i4] = Object.class;
                                            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cIndexOf, longPressTimeout, iIndexOf, 1436720535, false, "j", clsArr);
                                        }
                                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                                        try {
                                            Object[] objArr3 = {accesstooffsetmowrbkg};
                                            Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(729107336);
                                            if (objRemoteActionCompatParcelizer2 == null) {
                                                char size = (char) View.MeasureSpec.getSize(i4);
                                                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 2547;
                                                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 30;
                                                byte b = (byte) i4;
                                                String str$$e = $$e((byte) ($$d & 63), b, b);
                                                Class[] clsArr2 = new Class[1];
                                                clsArr2[i4] = Object.class;
                                                objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(size, iLastIndexOf, fadingEdgeLength, -73045399, false, str$$e, clsArr2);
                                            }
                                            int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                                            int i7 = cArr4[accesstooffsetmowrbkg.IconCompatParcelizer % 4] * 32718;
                                            try {
                                                Object[] objArr4 = new Object[3];
                                                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                                                objArr4[1] = Integer.valueOf(i7);
                                                objArr4[i4] = accesstooffsetmowrbkg;
                                                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(245609149);
                                                if (objRemoteActionCompatParcelizer3 == null) {
                                                    byte b2 = (byte) i4;
                                                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 888 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 60, -562850980, false, $$e((byte) 45, b2, b2), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                                                }
                                                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                                                try {
                                                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                                    Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1101373148);
                                                    if (objRemoteActionCompatParcelizer4 == null) {
                                                        byte b3 = (byte) 0;
                                                        objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 65450), 1244 - TextUtils.getTrimmedLength(""), 34 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1854554309, false, $$e((byte) 42, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                                                    }
                                                    cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                                                    cArr4[iIntValue2] = accesstooffsetmowrbkg.write;
                                                    cArr6[accesstooffsetmowrbkg.IconCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[accesstooffsetmowrbkg.IconCompatParcelizer])) ^ (RemoteActionCompatParcelizer ^ (-7009568347796326538L))) ^ ((long) ((int) (((long) serializer) ^ (-7009568347796326538L))))) ^ ((long) ((char) (((long) IconCompatParcelizer) ^ (-7009568347796326538L)))));
                                                    accesstooffsetmowrbkg.IconCompatParcelizer++;
                                                    i2 = 2;
                                                    i4 = 0;
                                                } catch (Throwable th) {
                                                    Throwable cause = th.getCause();
                                                    if (cause == null) {
                                                        throw th;
                                                    }
                                                    throw cause;
                                                }
                                            } catch (Throwable th2) {
                                                Throwable cause2 = th2.getCause();
                                                if (cause2 == null) {
                                                    throw th2;
                                                }
                                                throw cause2;
                                            }
                                        } catch (Throwable th3) {
                                            Throwable cause3 = th3.getCause();
                                            if (cause3 == null) {
                                                throw th3;
                                            }
                                            throw cause3;
                                        }
                                    } catch (Throwable th4) {
                                        Throwable cause4 = th4.getCause();
                                        if (cause4 == null) {
                                            throw th4;
                                        }
                                        throw cause4;
                                    }
                                }
                                String str2 = new String(cArr6);
                                int i8 = $11 + 85;
                                $10 = i8 % Fields.SpotShadowColor;
                                if (i8 % 2 == 0) {
                                    objArr[0] = str2;
                                } else {
                                    int i9 = 21 / 0;
                                    objArr[0] = str2;
                                }
                            }

                            private static void c(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
                                char[] cArr2;
                                int i2 = 2 % 2;
                                getScrollAxesk4lQ0M getscrollaxesk4lq0m = new getScrollAxesk4lQ0M();
                                char[] cArr3 = write;
                                if (cArr3 != null) {
                                    int length = cArr3.length;
                                    char[] cArr4 = new char[length];
                                    for (int i3 = 0; i3 < length; i3++) {
                                        try {
                                            Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                                            Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1214572153);
                                            if (objRemoteActionCompatParcelizer == null) {
                                                byte b = (byte) 0;
                                                byte b2 = b;
                                                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (50817 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getEdgeSlop() >> 16) + 2087, 14 - (ViewConfiguration.getTapTimeout() >> 16), -1732982888, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                                            }
                                            cArr4[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause == null) {
                                                throw th;
                                            }
                                            throw cause;
                                        }
                                    }
                                    int i4 = $11 + 27;
                                    $10 = i4 % Fields.SpotShadowColor;
                                    int i5 = i4 % 2;
                                    cArr3 = cArr4;
                                }
                                Object[] objArr3 = {Integer.valueOf(read)};
                                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1093774937);
                                if (objRemoteActionCompatParcelizer2 == null) {
                                    byte b3 = (byte) 1;
                                    byte b4 = (byte) (b3 - 1);
                                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (4678 - View.MeasureSpec.getMode(0)), KeyEvent.normalizeMetaState(0) + 2803, KeyEvent.keyCodeFromString("") + 18, 1847488582, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                                }
                                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                                int i6 = -206402645;
                                if (MediaMetadataCompat) {
                                    int i7 = $10 + 75;
                                    $11 = i7 % Fields.SpotShadowColor;
                                    if (i7 % 2 == 0) {
                                        getscrollaxesk4lq0m.IconCompatParcelizer = bArr.length;
                                        cArr2 = new char[getscrollaxesk4lq0m.IconCompatParcelizer];
                                        getscrollaxesk4lq0m.serializer = 1;
                                    } else {
                                        getscrollaxesk4lq0m.IconCompatParcelizer = bArr.length;
                                        cArr2 = new char[getscrollaxesk4lq0m.IconCompatParcelizer];
                                        getscrollaxesk4lq0m.serializer = 0;
                                    }
                                    while (getscrollaxesk4lq0m.serializer < getscrollaxesk4lq0m.IconCompatParcelizer) {
                                        cArr2[getscrollaxesk4lq0m.serializer] = (char) (cArr3[bArr[(getscrollaxesk4lq0m.IconCompatParcelizer - 1) - getscrollaxesk4lq0m.serializer] + i] - iIntValue);
                                        Object[] objArr4 = {getscrollaxesk4lq0m, getscrollaxesk4lq0m};
                                        Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-206402645);
                                        if (objRemoteActionCompatParcelizer3 == null) {
                                            objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (2100 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getTouchSlop() >> 8) + 4635, 71 - View.resolveSize(0, 0), 593668682, false, "G", new Class[]{Object.class, Object.class});
                                        }
                                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                                    }
                                    objArr[0] = new String(cArr2);
                                    return;
                                }
                                if (!MediaDescriptionCompat) {
                                    getscrollaxesk4lq0m.IconCompatParcelizer = iArr.length;
                                    char[] cArr5 = new char[getscrollaxesk4lq0m.IconCompatParcelizer];
                                    getscrollaxesk4lq0m.serializer = 0;
                                    while (getscrollaxesk4lq0m.serializer < getscrollaxesk4lq0m.IconCompatParcelizer) {
                                        int i8 = $11 + 87;
                                        $10 = i8 % Fields.SpotShadowColor;
                                        int i9 = i8 % 2;
                                        cArr5[getscrollaxesk4lq0m.serializer] = (char) (cArr3[iArr[(getscrollaxesk4lq0m.IconCompatParcelizer - 1) - getscrollaxesk4lq0m.serializer] - i] - iIntValue);
                                        getscrollaxesk4lq0m.serializer++;
                                    }
                                    objArr[0] = new String(cArr5);
                                    return;
                                }
                                int i10 = $10 + 29;
                                $11 = i10 % Fields.SpotShadowColor;
                                int i11 = i10 % 2;
                                getscrollaxesk4lq0m.IconCompatParcelizer = cArr.length;
                                char[] cArr6 = new char[getscrollaxesk4lq0m.IconCompatParcelizer];
                                getscrollaxesk4lq0m.serializer = 0;
                                while (getscrollaxesk4lq0m.serializer < getscrollaxesk4lq0m.IconCompatParcelizer) {
                                    cArr6[getscrollaxesk4lq0m.serializer] = (char) (cArr3[cArr[(getscrollaxesk4lq0m.IconCompatParcelizer - 1) - getscrollaxesk4lq0m.serializer] - i] - iIntValue);
                                    Object[] objArr5 = {getscrollaxesk4lq0m, getscrollaxesk4lq0m};
                                    Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(i6);
                                    if (objRemoteActionCompatParcelizer4 == null) {
                                        objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (2100 - Color.green(0)), TextUtils.indexOf((CharSequence) "", '0') + 4636, 71 - (ViewConfiguration.getWindowTouchSlop() >> 8), 593668682, false, "G", new Class[]{Object.class, Object.class});
                                    }
                                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                                    i6 = -206402645;
                                }
                                String str2 = new String(cArr6);
                                int i12 = $11 + 113;
                                $10 = i12 % Fields.SpotShadowColor;
                                if (i12 % 2 == 0) {
                                    objArr[0] = str2;
                                } else {
                                    int i13 = 56 / 0;
                                    objArr[0] = str2;
                                }
                            }

                            /* JADX WARN: Not initialized variable reg: 55, insn: 0x5021: MOVE (r5 I:??[OBJECT, ARRAY]) = (r55 I:??[OBJECT, ARRAY]), block:B:2036:0x501f */
                            /*  JADX ERROR: Type inference failed
                                jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 279281. Try increasing type updates limit count.
                                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                                */
                            public static java.lang.Object[] serializer(android.content.Context r59, java.lang.String[] r60, int r61, int r62, int r63) {
                                /*
                                    Method dump skipped, instruction units count: 27928
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: fwfd.com.fwfsdk.manager.FWFDataManager.AnonymousClass5.AnonymousClass1.serializer(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
                            }
                        });
                    } else {
                        FWFDataManager.this.notifyObserver(map2, str, fWFSubscribeCallbackExplanation);
                        fWFFeaturesCallback.onFwfResponse(map2);
                    }
                }

                @Override // fwfd.com.fwfsdk.util.FWFResultCallback
                public void onError(String str2) {
                    FWFLogger.logError(str2);
                    FWFFallbackManager.createFWFResultsFallback(context, map, str, str2, fWFFeaturesCallback);
                }
            });
        } else if (strArr.length == 1) {
            getVariationFromApi(strArr[0], str, map.get(strArr[0]), fWFSubscribeCallbackExplanation, z, new FWFFeatureCallback() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.6
                @Override // fwfd.com.fwfsdk.manager.callback.FWFFeatureCallback
                public void onFwfResponse(FWFResult fWFResult) {
                    HashMap<String, FWFResult> map2 = new HashMap<>();
                    map2.put(strArr[0], fWFResult);
                    fWFFeaturesCallback.onFwfResponse(map2);
                }
            });
        } else {
            FWFLogger.logWarning(FWFHelper.FLAG_REQUEST_EMPTY);
            fWFFeaturesCallback.onFwfResponse(new HashMap<>());
        }
    }

    public void getVariationsFromDB(final HashMap<String, FWFFallback> map, final String str, final FWFSubscribeResult.FWFSubscribeCallbackExplanation fWFSubscribeCallbackExplanation, final FWFFeaturesCallback fWFFeaturesCallback) {
        getFlagsById(FunWithFlags.getInstance().getContext(), new ArrayList(map.keySet()), str, new FWFDBCallback<List<FWFFeature>>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.4
            @Override // fwfd.com.fwfsdk.util.FWFDBCallback
            public void onResponse(final List<FWFFeature> list) {
                if (list == null || list.isEmpty()) {
                    FWFDataManager.this.getVariationsFromAPI(map, str, fWFSubscribeCallbackExplanation, false, fWFFeaturesCallback);
                    return;
                }
                HashMap<String, FWFFallback> map2 = new HashMap<>();
                for (FWFFeature fWFFeature : list) {
                    if (fWFFeature.requiresUpdate()) {
                        map2.put(fWFFeature.getKey(), (FWFFallback) map.get(fWFFeature.getKey()));
                    }
                }
                List flagKeysFromResult = FWFDataManager.this.getFlagKeysFromResult(list);
                for (Map.Entry entry : map.entrySet()) {
                    if (!flagKeysFromResult.contains(entry.getKey())) {
                        map2.put((String) entry.getKey(), (FWFFallback) entry.getValue());
                    }
                }
                if (map2.isEmpty()) {
                    fWFFeaturesCallback.onFwfResponse(FWFDataManager.this.buildFlagsResult(list));
                } else {
                    FWFDataManager.this.getVariationsFromAPI(map2, str, fWFSubscribeCallbackExplanation, false, new FWFFeaturesCallback() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.4.1
                        @Override // fwfd.com.fwfsdk.manager.callback.FWFFeaturesCallback
                        public void onFwfResponse(HashMap<String, FWFResult> map3) {
                            HashMap<String, FWFResult> mapBuildFlagsResult = FWFDataManager.this.buildFlagsResult(list);
                            mapBuildFlagsResult.putAll(map3);
                            fWFFeaturesCallback.onFwfResponse(mapBuildFlagsResult);
                        }
                    });
                }
            }
        });
    }

    public void updateFlagsWithRelevantContext(String str) {
        getAllFlagsByRelevantContext(FunWithFlags.getInstance().getContext(), str, new FWFDBCallback<List<FWFFlagId>>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.12
            @Override // fwfd.com.fwfsdk.util.FWFDBCallback
            public void onResponse(List<FWFFlagId> list) {
                FWFDataManager.this.updateSubscribedFlagsFromAPI(list, FWFHelper.FROM_METHOD_RELEVANT_CONTEXT);
            }
        });
    }

    public void updateSubscribedFeatures() {
        getSubscribedFlagsFromDB(FunWithFlags.getInstance().getContext(), new FWFDBCallback<List<FWFFlagId>>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.10
            @Override // fwfd.com.fwfsdk.util.FWFDBCallback
            public void onResponse(List<FWFFlagId> list) {
                FWFDataManager.this.updateSubscribedFlagsFromAPI(list, FWFHelper.FROM_METHOD_SUBSCRIBE_UPDATE);
            }
        });
    }

    public static FWFDataManager getInstance() {
        if (instance == null) {
            instance = new FWFDataManager();
        }
        return instance;
    }

    public void subscribeFeatures(String[] strArr, String str) {
        if (strArr.length > 0) {
            getSubscribedFromAPI(strArr, str, FWFHelper.FROM_METHOD_SUBSCRIBE_INIT, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyObserver(String str, String str2, FWFResult fWFResult, FWFSubscribeResult.FWFSubscribeCallbackExplanation fWFSubscribeCallbackExplanation) {
        createFWFResultForObserver(str2, str, fWFResult, fWFSubscribeCallbackExplanation);
    }

    public void subscribeFeatures(String[] strArr, String str, FWFFeaturesCallback fWFFeaturesCallback) {
        if (strArr.length > 0) {
            getSubscribedFromAPI(strArr, str, FWFHelper.FROM_METHOD_SUBSCRIBE_INIT, fWFFeaturesCallback);
        }
    }

    private void getAllFlagsByRelevantContext(Context context, List<String> list, final FWFDBCallback<List<FWFFlagId>> fWFDBCallback) {
        new FWFDBRepository(context).getAllFlagKeysByRelevantContext(list, new FWFResultCallback<Set<FWFFlagId>>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.15
            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onError(String str) {
                fWFDBCallback.onResponse(new ArrayList());
            }

            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onResponse(Set<FWFFlagId> set) {
                fWFDBCallback.onResponse(new ArrayList(set));
            }
        });
    }

    public void updateFlagsWithRelevantContext(List<String> list) {
        getAllFlagsByRelevantContext(FunWithFlags.getInstance().getContext(), list, new FWFDBCallback<List<FWFFlagId>>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.13
            @Override // fwfd.com.fwfsdk.util.FWFDBCallback
            public void onResponse(List<FWFFlagId> list2) {
                FWFDataManager.this.updateSubscribedFlagsFromAPI(list2, FWFHelper.FROM_METHOD_RELEVANT_CONTEXT);
            }
        });
    }

    private void getSubscribedFromAPI(final String str, final String str2, String str3) {
        final Context context = FunWithFlags.getInstance().getContext();
        new FWFAPIDAO(str3).getFWFFeature(str, str2, new FWFResultCallback<FWFPut>() { // from class: fwfd.com.fwfsdk.manager.FWFDataManager.9
            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onResponse(FWFPut fWFPut) {
                if (fWFPut == null || fWFPut.getVariation() == null) {
                    return;
                }
                FWFFeature fWFFeature = new FWFFeature(str, fWFPut, 1, str2);
                FWFDataManager.this.insertFlagInDB(context, fWFFeature);
                FWFDataManager.this.notifyObserver(str, str2, new FWFResult(fWFFeature.getVariation(), fWFFeature.getAbTest(), fWFFeature.getExplanation(), fWFFeature.getTrackInfo(), fWFFeature.getHoldoutsEvaluations()), FWFSubscribeResult.FWFSubscribeCallbackExplanation.BACKGROUND_UPDATE);
            }

            @Override // fwfd.com.fwfsdk.util.FWFResultCallback
            public void onError(String str4) {
                FWFLogger.logError("FunWithFlags: Error updating subscribed feature." + str4);
            }
        });
    }
}
