package com.google.android.gms.internal.mlkit_vision_barcode;

import android.app.Application;
import android.content.Context;
import androidx.cardview.widget.CardView$1;
import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda3;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.graphics.Fields;
import bo.app.ah$$ExternalSyntheticLambda0;
import coil3.ExtrasKt;
import com.google.gson.Gson;
import com.google.re2j.Parser;
import com.huawei.location.Vw$Vw;
import com.mapbox.common.EventsServerOptions;
import com.mapbox.common.EventsService;
import com.mapbox.common.SdkInformation;
import com.mapbox.search.ApiType;
import com.mapbox.search.ApiTypeKt;
import com.mapbox.search.MapboxSearchSdk;
import com.mapbox.search.MapboxSearchSdk$formattedTimeProvider$2;
import com.mapbox.search.SearchEngineFactory$WhenMappings;
import com.mapbox.search.SearchEngineImpl;
import com.mapbox.search.SearchEngineSettings;
import com.mapbox.search.ServiceProvider$Companion;
import com.mapbox.search.analytics.AnalyticsEventJsonParser;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.mapbox.search.base.BaseSearchSdkInitializerImpl;
import com.mapbox.search.base.StubCompletionCallback;
import com.mapbox.search.base.location.LocationEngineAdapter;
import com.mapbox.search.base.location.WrapperLocationProvider;
import com.mapbox.search.base.result.SearchResultFactory;
import com.mapbox.search.base.task.AsyncOperationTaskImpl;
import com.mapbox.search.base.utils.FormattedTimeProviderImpl;
import com.mapbox.search.common.concurrent.AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0;
import com.mapbox.search.common.concurrent.SearchSdkMainThreadWorker;
import com.mapbox.search.internal.bindgen.EngineOptions;
import com.mapbox.search.internal.bindgen.LocationProvider;
import com.mapbox.search.internal.bindgen.SearchEngine;
import com.mapbox.search.internal.bindgen.UserActivityReporter;
import com.mapbox.search.internal.bindgen.UserActivityReporterOptions;
import com.mapbox.search.record.HistoryDataProviderImpl;
import com.mapbox.search.utils.CompoundCompletionCallback;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.events.N$b;
import java.util.ArrayList;
import o.AndroidContentCaptureManagerCompanion;
import o.BlockDropShadowNode;
import o.DragAndDropTargetModifierNode;
import o.alpha;
import o.getBirthDateFull;
import o.getBlock;
import o.getCreditCardExpirationMonth;
import o.getCurrent;
import o.getEventType;
import o.getHandleruiannotations;
import o.getIdentifiersValidationsEnabled;
import o.getNewPassword;
import o.getOrElseNullable;
import o.getPostalCode;
import o.isAdapterPositionOnScreen;
import o.o6ExternalSyntheticLambda20;
import o.r8lambdaD6k6wXRxTgZJWNsBhjsOrg3Yu9s;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;
import o.setHasPhysicalKeyboard;
import o.waitForFirstLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgz {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static o6ExternalSyntheticLambda20 write(getIdentifiersValidationsEnabled getidentifiersvalidationsenabled) {
        int i = 2 % 2;
        int i2 = serializer + 95;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getidentifiersvalidationsenabled.write("http://localhost/");
        Object objWrite = getidentifiersvalidationsenabled.write().write(o6ExternalSyntheticLambda20.class);
        objWrite.getClass();
        o6ExternalSyntheticLambda20 o6externalsyntheticlambda20 = (o6ExternalSyntheticLambda20) objWrite;
        int i4 = IconCompatParcelizer + 59;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return o6externalsyntheticlambda20;
    }

    public static final void serializer(DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-709502251);
        int i4 = 4;
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = getBlock.read;
            alpha alphaVar = (alpha) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui);
            BlockDropShadowNode blockDropShadowNodeIconCompatParcelizer = r8lambdaD6k6wXRxTgZJWNsBhjsOrg3Yu9s.IconCompatParcelizer(getpostalcode);
            Object[] objArr = {alphaVar};
            int i5 = 5;
            CardView$1 cardView$1 = new CardView$1(new ScrollState$$ExternalSyntheticLambda3(2), 5, new waitForFirstLayout(alphaVar, 19, blockDropShadowNodeIconCompatParcelizer));
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(alphaVar);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(blockDropShadowNodeIconCompatParcelizer);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer | zIconCompatParcelizer2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new ah$$ExternalSyntheticLambda0(alphaVar, i4, blockDropShadowNodeIconCompatParcelizer);
                getpostalcode.write(objComponentActivity);
            }
            getCurrent getcurrent = (getCurrent) getEventType.RemoteActionCompatParcelizer(objArr, cardView$1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 0);
            AndroidContentCaptureManagerCompanion.read(setcurrentsemanticsnodesui.write(getcurrent), ExtrasKt.write(-412824043, new GapComposerKt$$ExternalSyntheticLambda0(dragAndDropTargetModifierNode, i5, getcurrent), getpostalcode), getpostalcode, 56);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i6 = IconCompatParcelizer + 119;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new setHasPhysicalKeyboard(dragAndDropTargetModifierNode, i, 1);
            int i8 = IconCompatParcelizer + 85;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        int i10 = IconCompatParcelizer + 49;
        serializer = i10 % Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public static SearchEngineImpl providesMapboxSearchEngine() {
        LocationProvider wrapperLocationProvider;
        int i = 2 % 2;
        ApiType apiType = ApiType.GEOCODING;
        SearchEngineSettings searchEngineSettings = new SearchEngineSettings();
        Parser.Pair pair = SearchSdkMainThreadWorker.delegate;
        AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0 androidMainThreadWorkerImpl$$ExternalSyntheticLambda0 = (AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0) SearchSdkMainThreadWorker.delegate.write;
        StubCompletionCallback stubCompletionCallback = new StubCompletionCallback();
        apiType.getClass();
        androidMainThreadWorkerImpl$$ExternalSyntheticLambda0.getClass();
        String str = SearchEngineFactory$WhenMappings.$EnumSwitchMapping$0[apiType.ordinal()] != 1 ? null : searchEngineSettings.geocodingEndpointBaseUrl;
        com.mapbox.common.location.LocationProvider locationProvider = searchEngineSettings.locationProvider;
        if (locationProvider instanceof LocationProvider) {
            int i2 = IconCompatParcelizer + 105;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            wrapperLocationProvider = (LocationProvider) locationProvider;
        } else {
            Context context = BaseSearchSdkInitializerImpl.appContext;
            if (context == null) {
                removeNodeAtDepth.serializer("appContext");
                throw null;
            }
            wrapperLocationProvider = new WrapperLocationProvider(new LocationEngineAdapter((Application) context, locationProvider), new MapboxSearchSdk$formattedTimeProvider$2(0, 1));
        }
        SearchEngine searchEngine = new SearchEngine(new EngineOptions(str, ApiTypeKt.mapToCore(apiType), new SdkInformation("search-sdk-android", "2.25.1", "com.mapbox.search"), null, null), wrapperLocationProvider);
        MapboxSearchSdk mapboxSearchSdk = MapboxSearchSdk.INSTANCE;
        AnalyticsEventJsonParser analyticsEventJsonParser = new AnalyticsEventJsonParser();
        new Gson();
        if (MapboxSearchSdk.uuidProvider == null) {
            removeNodeAtDepth.serializer("uuidProvider");
            throw null;
        }
        ((FormattedTimeProviderImpl) MapboxSearchSdk.formattedTimeProvider$delegate.MediaSessionCompatResultReceiverWrapper()).getClass();
        AnalyticsEventJsonParser analyticsEventJsonParser2 = new AnalyticsEventJsonParser();
        EventsService orCreate = EventsService.getOrCreate(new EventsServerOptions(new SdkInformation("search-sdk-android", "2.25.1", "com.mapbox.search"), null));
        orCreate.getClass();
        AnalyticsServiceImpl analyticsServiceImpl = new AnalyticsServiceImpl(orCreate, analyticsEventJsonParser, analyticsEventJsonParser2, locationProvider);
        UserActivityReporter orCreate2 = UserActivityReporter.getOrCreate(new UserActivityReporterOptions(new SdkInformation("search-sdk-android", "2.25.1", "com.mapbox.search"), null));
        orCreate2.getClass();
        N$b n$b = ServiceProvider$Companion.INTERNAL_INSTANCE;
        if (n$b == null) {
            removeNodeAtDepth.serializer("INTERNAL_INSTANCE");
            throw null;
        }
        int i4 = IconCompatParcelizer + 37;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            Vw$Vw vw$Vw = MapboxSearchSdk.searchRequestContextProvider;
            throw null;
        }
        HistoryDataProviderImpl historyDataProviderImpl = (HistoryDataProviderImpl) ((isAdapterPositionOnScreen) n$b.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper();
        Vw$Vw vw$Vw2 = MapboxSearchSdk.searchRequestContextProvider;
        if (vw$Vw2 == null) {
            removeNodeAtDepth.serializer("searchRequestContextProvider");
            throw null;
        }
        SearchResultFactory searchResultFactory = MapboxSearchSdk.searchResultFactory;
        if (searchResultFactory == null) {
            removeNodeAtDepth.serializer("searchResultFactory");
            throw null;
        }
        H$b h$b = MapboxSearchSdk.indexableDataProvidersRegistry;
        if (h$b == null) {
            removeNodeAtDepth.serializer("indexableDataProvidersRegistry");
            throw null;
        }
        SearchEngineImpl searchEngineImpl = new SearchEngineImpl(apiType, searchEngineSettings, analyticsServiceImpl, searchEngine, orCreate2, historyDataProviderImpl, vw$Vw2, searchResultFactory, h$b);
        CompoundCompletionCallback compoundCompletionCallback = new CompoundCompletionCallback(androidMainThreadWorkerImpl$$ExternalSyntheticLambda0, stubCompletionCallback);
        ArrayList arrayList = (ArrayList) compoundCompletionCallback.tasks;
        N$b n$b2 = ServiceProvider$Companion.INTERNAL_INSTANCE;
        if (n$b2 == null) {
            removeNodeAtDepth.serializer("INTERNAL_INSTANCE");
            throw null;
        }
        AsyncOperationTaskImpl asyncOperationTaskImplRegisterDataProvider = searchEngineImpl.registerDataProvider((HistoryDataProviderImpl) ((isAdapterPositionOnScreen) n$b2.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper(), androidMainThreadWorkerImpl$$ExternalSyntheticLambda0, compoundCompletionCallback);
        asyncOperationTaskImplRegisterDataProvider.getClass();
        AsyncOperationTaskImpl asyncOperationTaskImpl = compoundCompletionCallback.compoundTask;
        asyncOperationTaskImpl.plusAssign(asyncOperationTaskImplRegisterDataProvider);
        arrayList.add(asyncOperationTaskImplRegisterDataProvider);
        N$b n$b3 = ServiceProvider$Companion.INTERNAL_INSTANCE;
        if (n$b3 == null) {
            removeNodeAtDepth.serializer("INTERNAL_INSTANCE");
            throw null;
        }
        AsyncOperationTaskImpl asyncOperationTaskImplRegisterDataProvider2 = searchEngineImpl.registerDataProvider((getOrElseNullable) ((isAdapterPositionOnScreen) n$b3.serializer).MediaSessionCompatResultReceiverWrapper(), androidMainThreadWorkerImpl$$ExternalSyntheticLambda0, compoundCompletionCallback);
        asyncOperationTaskImplRegisterDataProvider2.getClass();
        asyncOperationTaskImpl.plusAssign(asyncOperationTaskImplRegisterDataProvider2);
        arrayList.add(asyncOperationTaskImplRegisterDataProvider2);
        return searchEngineImpl;
    }
}
