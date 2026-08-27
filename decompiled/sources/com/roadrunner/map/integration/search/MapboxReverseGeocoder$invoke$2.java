package com.roadrunner.map.integration.search;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.re2j.Parser;
import com.mapbox.geojson.Point;
import com.mapbox.search.ReverseGeoOptions;
import com.mapbox.search.SearchEngineImpl;
import com.mapbox.search.SearchEngineImpl$search$3;
import com.mapbox.search.adapter.BaseSearchCallbackAdapter;
import com.mapbox.search.base.task.AsyncOperationTaskImpl;
import com.mapbox.search.common.IsoLanguageCode;
import com.mapbox.search.common.concurrent.AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0;
import com.mapbox.search.common.concurrent.SearchSdkMainThreadWorker;
import com.sentiance.core.model.events.C$b;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getQueryParameterslambda2;
import o.ng;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI;

/* JADX INFO: loaded from: classes3.dex */
public final class MapboxReverseGeocoder$invoke$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ double IconCompatParcelizer;
    public final /* synthetic */ ng MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final /* synthetic */ double RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final /* synthetic */ r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxReverseGeocoder$invoke$2(ng ngVar, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, double d, double d2, r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI r8lambdaaazn5el4wkw0o5j25k1e0csgpoi, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaBrowserCompatMediaItem = ngVar;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = d;
        this.IconCompatParcelizer = d2;
        this.write = r8lambdaaazn5el4wkw0o5j25k1e0csgpoi;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 97;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((MapboxReverseGeocoder$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Object objInvokeSuspend = ((MapboxReverseGeocoder$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i3 = MediaSessionCompatQueueItem + 37;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        MapboxReverseGeocoder$invoke$2 mapboxReverseGeocoder$invoke$2 = new MapboxReverseGeocoder$invoke$2(this.MediaBrowserCompatMediaItem, this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, this.serializer, shortNewsContentCardView);
        int i2 = MediaSessionCompatQueueItem + 85;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return mapboxReverseGeocoder$invoke$2;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 49;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.MediaDescriptionCompat;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM searchEngineImpl$search$3 = this.read;
        ng ngVar = this.MediaBrowserCompatMediaItem;
        try {
            if (i3 != 0) {
                int i4 = RatingCompat + 9;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0 ? i3 != 1 : i3 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i5 = RatingCompat + 59;
                MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                InitialiseMapboxSearch initialiseMapboxSearch = ngVar.write;
                this.MediaDescriptionCompat = 1;
                if (initialiseMapboxSearch.invoke(this) == coroutineSingletons2) {
                    int i7 = RatingCompat + 91;
                    MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        return coroutineSingletons2;
                    }
                    obj2.hashCode();
                    throw null;
                }
            }
            Point pointFromLngLat = Point.fromLngLat(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
            pointFromLngLat.getClass();
            Integer num = new Integer(1);
            String language = Locale.getDefault().getLanguage();
            language.getClass();
            Object[] objArr = {new IsoLanguageCode(language)};
            int iSerializer = getQueryParameterslambda2.serializer();
            ReverseGeoOptions reverseGeoOptions = new ReverseGeoOptions(pointFromLngLat, null, (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer), num, null, null, null);
            SearchEngineImpl searchEngineImpl = ngVar.read;
            C$b c$b = new C$b(this.write, this.serializer, searchEngineImpl$search$3);
            Parser.Pair pair = SearchSdkMainThreadWorker.delegate;
            AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0 androidMainThreadWorkerImpl$$ExternalSyntheticLambda0 = (AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0) SearchSdkMainThreadWorker.delegate.write;
            androidMainThreadWorkerImpl$$ExternalSyntheticLambda0.getClass();
            searchEngineImpl.activityReporter.reportActivity("search-engine-reverse-geocoding");
            BaseSearchCallbackAdapter baseSearchCallbackAdapter = new BaseSearchCallbackAdapter(c$b);
            searchEngineImpl$search$3 = new SearchEngineImpl$search$3(searchEngineImpl, reverseGeoOptions, androidMainThreadWorkerImpl$$ExternalSyntheticLambda0, 0);
            AsyncOperationTaskImpl asyncOperationTaskImpl = new AsyncOperationTaskImpl();
            asyncOperationTaskImpl.setCallbackDelegate(baseSearchCallbackAdapter);
            searchEngineImpl$search$3.invoke(asyncOperationTaskImpl);
            return createfromparcel2;
        } catch (Throwable th) {
            searchEngineImpl$search$3.invoke(th);
            return createfromparcel2;
        }
    }
}
