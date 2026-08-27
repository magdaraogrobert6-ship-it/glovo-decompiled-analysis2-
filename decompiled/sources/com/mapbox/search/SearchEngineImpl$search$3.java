package com.mapbox.search;

import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.BlockRunner;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.Vw$Vw;
import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import com.mapbox.common.CommonSdkLog;
import com.mapbox.geojson.Point;
import com.mapbox.maps.interactions.standard.generated.StandardPoi;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.mapbox.navigation.core.internal.router.GetRouteSignature;
import com.mapbox.navigator.GetRouteOptions;
import com.mapbox.search.base.BaseRequestOptions;
import com.mapbox.search.base.BaseResponseInfo;
import com.mapbox.search.base.engine.OneStepRequestCallbackWrapper$run$1$7$task$1;
import com.mapbox.search.base.record.BaseIndexableRecord;
import com.mapbox.search.base.result.BaseIndexableRecordSearchResultImpl;
import com.mapbox.search.base.result.BaseRawSearchResult;
import com.mapbox.search.base.result.SearchRequestContext;
import com.mapbox.search.base.task.AsyncOperationTaskImpl;
import com.mapbox.search.base.utils.orientation.ScreenOrientation;
import com.mapbox.search.common.IsoCountryCode;
import com.mapbox.search.common.IsoLanguageCode;
import com.mapbox.search.common.concurrent.AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0;
import com.mapbox.search.internal.bindgen.SearchEngine;
import com.mapbox.search.utils.CompoundCompletionCallback;
import com.mapbox.search.utils.LoggingCompletionCallback;
import io.sentry.android.navigation.SentryNavigationListener;
import io.sentry.compose.IconCompatParcelizer;
import io.sentry.compose.write;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Lambda;
import o.PopulateViewStructure_androidKtpopulate7;
import o.a9;
import o.accessgetInstancedelegatecp;
import o.accessprocessDragStart;
import o.createFromParcel;
import o.forEachGesture;
import o.getPersonNamePrefix;
import o.isItemDismissable;
import o.onItemDismiss;
import o.positionChangeInternalwfG_k4k;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.relativeMoveTo;
import o.supportsColorMatrixQuery;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchEngineImpl$search$3 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Object $executor;
    public final /* synthetic */ Object $options;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchEngineImpl$search$3(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$options = obj2;
        this.$executor = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0152  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Locale localeForLanguageTag;
        ScreenOrientation screenOrientation;
        com.mapbox.search.internal.bindgen.ReverseMode reverseMode;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        com.mapbox.search.internal.bindgen.QueryType queryType;
        com.mapbox.search.internal.bindgen.QueryType queryType2;
        com.mapbox.search.internal.bindgen.ReverseMode reverseMode2;
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.$options;
        Object obj3 = this.$executor;
        Object obj4 = this.this$0;
        ArrayList arrayList4 = null;
        switch (i) {
            case 0:
                AsyncOperationTaskImpl asyncOperationTaskImpl = (AsyncOperationTaskImpl) obj;
                asyncOperationTaskImpl.getClass();
                final SearchEngineImpl searchEngineImpl = (SearchEngineImpl) obj4;
                Vw$Vw vw$Vw = searchEngineImpl.requestContextProvider;
                com.mapbox.search.internal.bindgen.ApiType apiTypeMapToCore = ApiTypeKt.mapToCore(searchEngineImpl.apiType);
                vw$Vw.getClass();
                apiTypeMapToCore.getClass();
                Object systemService = ((a9) vw$Vw.serializer).read.getSystemService("input_method");
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                InputMethodSubtype currentInputMethodSubtype = inputMethodManager != null ? inputMethodManager.getCurrentInputMethodSubtype() : null;
                if (currentInputMethodSubtype == null) {
                    localeForLanguageTag = null;
                } else {
                    String languageTag = currentInputMethodSubtype.getLanguageTag();
                    languageTag.getClass();
                    if (languageTag.length() <= 0) {
                        languageTag = null;
                    }
                    localeForLanguageTag = languageTag != null ? Locale.forLanguageTag(languageTag) : null;
                    if (localeForLanguageTag == null) {
                        String locale = currentInputMethodSubtype.getLocale();
                        locale.getClass();
                        if (locale.length() <= 0) {
                            locale = null;
                        }
                        if (locale != null) {
                            localeForLanguageTag = new Locale(locale);
                        } else {
                            localeForLanguageTag = null;
                        }
                    }
                }
                int i2 = ((a9) vw$Vw.IconCompatParcelizer).read.getResources().getConfiguration().orientation;
                if (i2 != 1) {
                    if (i2 == 2) {
                        screenOrientation = ScreenOrientation.LANDSCAPE;
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write(m1$$ExternalSyntheticOutline0.m("Unknown android orientation code (= ", i2, ')'));
                    }
                    return null;
                }
                screenOrientation = ScreenOrientation.PORTRAIT;
                SearchRequestContext searchRequestContext = new SearchRequestContext(apiTypeMapToCore, localeForLanguageTag, screenOrientation, null);
                SearchEngine searchEngine = searchEngineImpl.coreEngine;
                ReverseGeoOptions reverseGeoOptions = (ReverseGeoOptions) obj2;
                Point point = reverseGeoOptions.center;
                ReverseMode reverseMode3 = reverseGeoOptions.reverseMode;
                if (reverseMode3 != null) {
                    int i3 = ReverseGeoOptionsKt$WhenMappings.$EnumSwitchMapping$0[reverseMode3.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            reverseMode2 = com.mapbox.search.internal.bindgen.ReverseMode.SCORE;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        return null;
                    }
                    reverseMode2 = com.mapbox.search.internal.bindgen.ReverseMode.DISTANCE;
                    reverseMode = reverseMode2;
                } else {
                    reverseMode = null;
                }
                List list = reverseGeoOptions.countries;
                if (list != null) {
                    List list2 = list;
                    ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(((IsoCountryCode) it.next()).code);
                    }
                    arrayList = arrayList5;
                } else {
                    arrayList = null;
                }
                List list3 = reverseGeoOptions.languages;
                if (list3 != null) {
                    List list4 = list3;
                    ArrayList arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList6.add(((IsoLanguageCode) it2.next()).code);
                    }
                    arrayList2 = arrayList6;
                } else {
                    arrayList2 = null;
                }
                Integer num = reverseGeoOptions.limit;
                List list5 = reverseGeoOptions.types;
                List list6 = reverseGeoOptions.newTypes;
                List list7 = list6;
                if (list7 == null || list7.isEmpty()) {
                    if (list5 != null) {
                        List<QueryType> list8 = list5;
                        ArrayList arrayList7 = new ArrayList(accessgetInstancedelegatecp.write(list8, 10));
                        for (QueryType queryType3 : list8) {
                            queryType3.getClass();
                            switch (QueryTypeKt$WhenMappings.$EnumSwitchMapping$0[queryType3.ordinal()]) {
                                case 1:
                                    queryType = com.mapbox.search.internal.bindgen.QueryType.COUNTRY;
                                    continue;
                                    arrayList7.add(queryType);
                                    break;
                                case 2:
                                    queryType = com.mapbox.search.internal.bindgen.QueryType.REGION;
                                    continue;
                                    arrayList7.add(queryType);
                                    break;
                                case 3:
                                    queryType = com.mapbox.search.internal.bindgen.QueryType.POSTCODE;
                                    continue;
                                    arrayList7.add(queryType);
                                    break;
                                case 4:
                                    queryType = com.mapbox.search.internal.bindgen.QueryType.DISTRICT;
                                    continue;
                                    arrayList7.add(queryType);
                                    break;
                                case 5:
                                    queryType = com.mapbox.search.internal.bindgen.QueryType.PLACE;
                                    continue;
                                    arrayList7.add(queryType);
                                    break;
                                case 6:
                                    queryType = com.mapbox.search.internal.bindgen.QueryType.LOCALITY;
                                    continue;
                                    arrayList7.add(queryType);
                                    break;
                                case 7:
                                    queryType = com.mapbox.search.internal.bindgen.QueryType.NEIGHBORHOOD;
                                    continue;
                                    arrayList7.add(queryType);
                                    break;
                                case 8:
                                    queryType = com.mapbox.search.internal.bindgen.QueryType.STREET;
                                    continue;
                                    arrayList7.add(queryType);
                                    break;
                                case 9:
                                    queryType = com.mapbox.search.internal.bindgen.QueryType.ADDRESS;
                                    continue;
                                    arrayList7.add(queryType);
                                    break;
                                case 10:
                                    queryType = com.mapbox.search.internal.bindgen.QueryType.POI;
                                    continue;
                                    arrayList7.add(queryType);
                                    break;
                                case 11:
                                    queryType = com.mapbox.search.internal.bindgen.QueryType.CATEGORY;
                                    continue;
                                    arrayList7.add(queryType);
                                    break;
                                default:
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    break;
                            }
                            return null;
                        }
                        arrayList3 = arrayList7;
                    }
                    final long jReverseGeocoding = searchEngine.reverseGeocoding(new com.mapbox.search.internal.bindgen.ReverseGeoOptions(point, reverseMode, arrayList, arrayList2, num, arrayList3), new DropShadowEffect(searchEngineImpl.searchResultFactory, (AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0) obj3, searchEngineImpl.engineExecutorService, asyncOperationTaskImpl, searchRequestContext));
                    asyncOperationTaskImpl.addOnCancelledCallback(new AsyncOperationTaskImpl.OnCancelledCallback() { // from class: com.mapbox.search.SearchEngineImpl$search$3$$ExternalSyntheticLambda0
                        @Override // com.mapbox.search.base.task.AsyncOperationTaskImpl.OnCancelledCallback
                        public final void onCancelled() {
                            searchEngineImpl.coreEngine.cancel(jReverseGeocoding);
                        }
                    });
                    return createfromparcel;
                }
                List list9 = list5;
                if (list9 != null && !list9.isEmpty()) {
                    CommonSdkLog.INSTANCE.logw("QueryType", "Both QueryType (types) and NewQueryType (newTypes) provided, newTypes take priority");
                }
                if (list6 != null) {
                    List<String> list10 = list6;
                    ArrayList arrayList8 = new ArrayList(accessgetInstancedelegatecp.write(list10, 10));
                    for (String str : list10) {
                        str.getClass();
                        switch (str.hashCode()) {
                            case -1147692044:
                                if (!str.equals("address")) {
                                    throw new IllegalStateException("Unsupported query type: ".concat(str).toString());
                                }
                                queryType2 = com.mapbox.search.internal.bindgen.QueryType.ADDRESS;
                                break;
                                break;
                            case -934795532:
                                if (!str.equals("region")) {
                                    throw new IllegalStateException("Unsupported query type: ".concat(str).toString());
                                }
                                queryType2 = com.mapbox.search.internal.bindgen.QueryType.REGION;
                                break;
                                break;
                            case -891990013:
                                if (!str.equals("street")) {
                                    throw new IllegalStateException("Unsupported query type: ".concat(str).toString());
                                }
                                queryType2 = com.mapbox.search.internal.bindgen.QueryType.STREET;
                                break;
                                break;
                            case 111178:
                                if (!str.equals(StandardPoi.FEATURESET_ID)) {
                                    throw new IllegalStateException("Unsupported query type: ".concat(str).toString());
                                }
                                queryType2 = com.mapbox.search.internal.bindgen.QueryType.POI;
                                break;
                                break;
                            case 50511102:
                                if (!str.equals("category")) {
                                    throw new IllegalStateException("Unsupported query type: ".concat(str).toString());
                                }
                                queryType2 = com.mapbox.search.internal.bindgen.QueryType.CATEGORY;
                                break;
                                break;
                            case 93997959:
                                if (!str.equals("brand")) {
                                    throw new IllegalStateException("Unsupported query type: ".concat(str).toString());
                                }
                                queryType2 = com.mapbox.search.internal.bindgen.QueryType.BRAND;
                                break;
                                break;
                            case 106748167:
                                if (!str.equals("place")) {
                                    throw new IllegalStateException("Unsupported query type: ".concat(str).toString());
                                }
                                queryType2 = com.mapbox.search.internal.bindgen.QueryType.PLACE;
                                break;
                                break;
                            case 288961422:
                                if (!str.equals("district")) {
                                    throw new IllegalStateException("Unsupported query type: ".concat(str).toString());
                                }
                                queryType2 = com.mapbox.search.internal.bindgen.QueryType.DISTRICT;
                                break;
                                break;
                            case 498460430:
                                if (!str.equals("neighborhood")) {
                                    throw new IllegalStateException("Unsupported query type: ".concat(str).toString());
                                }
                                queryType2 = com.mapbox.search.internal.bindgen.QueryType.NEIGHBORHOOD;
                                break;
                                break;
                            case 757462669:
                                if (!str.equals("postcode")) {
                                    throw new IllegalStateException("Unsupported query type: ".concat(str).toString());
                                }
                                queryType2 = com.mapbox.search.internal.bindgen.QueryType.POSTCODE;
                                break;
                                break;
                            case 957831062:
                                if (!str.equals(PushNotificationParserObj.COUNTRY_KEY)) {
                                    throw new IllegalStateException("Unsupported query type: ".concat(str).toString());
                                }
                                queryType2 = com.mapbox.search.internal.bindgen.QueryType.COUNTRY;
                                break;
                                break;
                            case 1900805475:
                                if (!str.equals("locality")) {
                                    throw new IllegalStateException("Unsupported query type: ".concat(str).toString());
                                }
                                queryType2 = com.mapbox.search.internal.bindgen.QueryType.LOCALITY;
                                break;
                                break;
                            default:
                                throw new IllegalStateException("Unsupported query type: ".concat(str).toString());
                        }
                        arrayList8.add(queryType2);
                    }
                    arrayList4 = arrayList8;
                }
                arrayList3 = arrayList4;
                final long jReverseGeocoding2 = searchEngine.reverseGeocoding(new com.mapbox.search.internal.bindgen.ReverseGeoOptions(point, reverseMode, arrayList, arrayList2, num, arrayList3), new DropShadowEffect(searchEngineImpl.searchResultFactory, (AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0) obj3, searchEngineImpl.engineExecutorService, asyncOperationTaskImpl, searchRequestContext));
                asyncOperationTaskImpl.addOnCancelledCallback(new AsyncOperationTaskImpl.OnCancelledCallback() { // from class: com.mapbox.search.SearchEngineImpl$search$3$$ExternalSyntheticLambda0
                    @Override // com.mapbox.search.base.task.AsyncOperationTaskImpl.OnCancelledCallback
                    public final void onCancelled() {
                        searchEngineImpl.coreEngine.cancel(jReverseGeocoding2);
                    }
                });
                return createfromparcel;
            case 1:
                return new forEachGesture((SnapshotStateList) obj4, obj2, (positionChangeInternalwfG_k4k) obj3, 0);
            case 2:
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
                GetRouteOptions getRouteOptions = new GetRouteOptions(null);
                GetRouteSignature getRouteSignature = (GetRouteSignature) obj3;
                getRouteSignature.getClass();
                return Long.valueOf(((BlockRunner) obj4).getRouter$navigation_release().getRoute((String) obj2, getRouteOptions, new com.mapbox.navigator.GetRouteSignature(getRouteSignature.reason.toNativeReason(), getRouteSignature.origin.toNativeOrigin(), "", null), new MapboxNavigation$$ExternalSyntheticLambda4(8, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)));
            case 3:
                ((AsyncOperationTaskImpl) obj).getClass();
                ((AsyncOperationTaskImpl) obj4).onComplete();
                ((LoggingCompletionCallback) obj2).onError((Exception) obj3);
                return createfromparcel;
            case 4:
                ((AsyncOperationTaskImpl) obj).getClass();
                ((AsyncOperationTaskImpl) obj4).onComplete();
                ((CompoundCompletionCallback) obj2).onError((Exception) obj3);
                return createfromparcel;
            case 5:
                Object baseIndexableRecordSearchResultImpl = ((onItemDismiss) obj).IconCompatParcelizer;
                OneStepRequestCallbackWrapper$run$1$7$task$1 oneStepRequestCallbackWrapper$run$1$7$task$1 = (OneStepRequestCallbackWrapper$run$1$7$task$1) obj4;
                BaseRawSearchResult baseRawSearchResult = (BaseRawSearchResult) obj2;
                BaseRequestOptions baseRequestOptions = (BaseRequestOptions) obj3;
                if (!(baseIndexableRecordSearchResultImpl instanceof isItemDismissable)) {
                    baseIndexableRecordSearchResultImpl = new BaseIndexableRecordSearchResultImpl((BaseIndexableRecord) baseIndexableRecordSearchResultImpl, baseRawSearchResult, baseRequestOptions);
                }
                accessprocessDragStart accessprocessdragstart = oneStepRequestCallbackWrapper$run$1$7$task$1.$results;
                int i4 = oneStepRequestCallbackWrapper$run$1$7$task$1.$index;
                List list11 = oneStepRequestCallbackWrapper$run$1$7$task$1.$responseResult;
                DropShadowEffect dropShadowEffect = oneStepRequestCallbackWrapper$run$1$7$task$1.this$0;
                BaseResponseInfo baseResponseInfo = oneStepRequestCallbackWrapper$run$1$7$task$1.$responseInfo;
                accessprocessdragstart.serializer(i4, new onItemDismiss(baseIndexableRecordSearchResultImpl));
                DropShadowEffect.run$lambda$4$notifyCallbackIfNeeded(accessprocessdragstart, list11, dropShadowEffect, baseResponseInfo);
                return createfromparcel;
            case 6:
                ((AsyncOperationTaskImpl) obj).getClass();
                ((Executor) obj4).execute(new ZM$$ExternalSyntheticLambda0((AsyncOperationTaskImpl) obj2, 21, (Runnable) obj3));
                return createfromparcel;
            default:
                ((getPersonNamePrefix) obj).getClass();
                IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer((relativeMoveTo) obj4, (SentryNavigationListener) ((PopulateViewStructure_androidKtpopulate7) obj3).getValue());
                supportsColorMatrixQuery supportscolormatrixquery = (supportsColorMatrixQuery) obj2;
                supportscolormatrixquery.IconCompatParcelizer(iconCompatParcelizer);
                return new write(iconCompatParcelizer, supportscolormatrixquery);
        }
    }
}
