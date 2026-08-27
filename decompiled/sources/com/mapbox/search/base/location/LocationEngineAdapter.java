package com.mapbox.search.base.location;

import android.app.Application;
import com.google.gson.stream.JsonWriter;
import com.mapbox.common.Cancelable;
import com.mapbox.common.CommonSdkLog;
import com.mapbox.geojson.Point;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.mapbox.search.adapter.BaseSearchCallbackAdapter;
import com.mapbox.search.base.BaseResponseInfo;
import com.mapbox.search.base.task.AsyncOperationTaskImpl;
import com.mapbox.search.internal.bindgen.LocationProvider;
import com.mapbox.search.internal.bindgen.LonLatBBox;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.RemoteActionCompatParcelizer;
import io.sentry.android.replay.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
import io.sentry.android.replay.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.YieldKt;
import o.FocusListener;
import o.ShortNewsContentCardView;
import o.UriActionExternalSyntheticLambda4;
import o.createFromParcel;
import o.getCardAtIndex;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public final class LocationEngineAdapter implements LocationProvider {

    /* JADX INFO: renamed from: app, reason: collision with root package name */
    public final Application f38app;
    public volatile LocationInfo lastLocationInfo;
    public Cancelable locationCancelable;
    public final LocationEngineAdapter$$ExternalSyntheticLambda0 locationObserver;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM locationPermissionChecker;
    public final com.mapbox.common.location.LocationProvider locationProvider;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU timeoutWatcherJob;

    /* JADX INFO: renamed from: com.mapbox.search.base.location.LocationEngineAdapter$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        public final /* synthetic */ Object $app;
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, Object obj) {
            super(1);
            this.$r8$classId = i;
            this.$app = obj;
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            int i = this.$r8$classId;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj2 = this.$app;
            boolean z = true;
            if (i == 0) {
                ((Application) obj).getClass();
                Application application = (Application) obj2;
                application.getClass();
                if (FocusListener.write(application, "android.permission.ACCESS_COARSE_LOCATION") != 0 && FocusListener.write(application, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            if (i == 1) {
                BaseSearchCallbackAdapter baseSearchCallbackAdapter = (BaseSearchCallbackAdapter) obj;
                baseSearchCallbackAdapter.getClass();
                baseSearchCallbackAdapter.onResults(instance_delegatelambda0.write, (BaseResponseInfo) obj2);
                return createfromparcel;
            }
            if (i == 2) {
                AsyncOperationTaskImpl asyncOperationTaskImpl = (AsyncOperationTaskImpl) obj;
                asyncOperationTaskImpl.getClass();
                asyncOperationTaskImpl.onComplete();
                ((Runnable) obj2).run();
                return createfromparcel;
            }
            if (i == 3) {
                JsonWriter jsonWriter = (JsonWriter) obj;
                jsonWriter.getClass();
                Point point = (Point) obj2;
                jsonWriter.value(point.longitude());
                jsonWriter.value(point.latitude());
                return createfromparcel;
            }
            if (i == 4) {
                Date date = (Date) obj;
                date.getClass();
                ReplayIntegration replayIntegration = (ReplayIntegration) obj2;
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = replayIntegration.serializer;
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.IconCompatParcelizer(remoteActionCompatParcelizer.RemoteActionCompatParcelizer() + 1);
                }
                RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = replayIntegration.serializer;
                if (remoteActionCompatParcelizer2 != null) {
                    remoteActionCompatParcelizer2.IconCompatParcelizer(date);
                }
                return createfromparcel;
            }
            ArrayList arrayList = (ArrayList) obj;
            arrayList.getClass();
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7ijbvrn0shyidcazufwejfc7yy = (r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) obj2;
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = r8lambda7ijbvrn0shyidcazufwejfc7yy.read.serializer();
            try {
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys = r8lambda7ijbvrn0shyidcazufwejfc7yy.RemoteActionCompatParcelizer;
                r8lambda54beh8zsbru0cxi2ccsp2synys.addAll(arrayList);
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
                return r8lambda54beh8zsbru0cxi2ccsp2synys;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                    throw th2;
                }
            }
        }
    }

    public final class LocationInfo {
        public final Point point;
        public final long timestamp;

        public LocationInfo(Point point, long j) {
            this.point = point;
            this.timestamp = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocationInfo)) {
                return false;
            }
            LocationInfo locationInfo = (LocationInfo) obj;
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.point, locationInfo.point}, getCieXyz.write())).booleanValue() && this.timestamp == locationInfo.timestamp;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LocationInfo(point=");
            sb.append(this.point);
            sb.append(", timestamp=");
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.timestamp, ')');
        }

        public final int hashCode() {
            Point point = this.point;
            return Long.hashCode(this.timestamp) + ((point == null ? 0 : point.hashCode()) * 31);
        }
    }

    @Override // com.mapbox.search.internal.bindgen.LocationProvider
    public final Point getLocation() {
        if (!((Boolean) this.locationPermissionChecker.invoke(this.f38app)).booleanValue()) {
            return null;
        }
        if (this.timeoutWatcherJob == null) {
            if (this.lastLocationInfo.timestamp + 30000 <= System.currentTimeMillis()) {
                startLocationListener();
            }
        }
        return this.lastLocationInfo.point;
    }

    public LocationEngineAdapter(Application application, com.mapbox.common.location.LocationProvider locationProvider) {
        int i = 0;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i, application);
        application.getClass();
        this.f38app = application;
        this.locationProvider = locationProvider;
        this.locationPermissionChecker = anonymousClass1;
        this.lastLocationInfo = new LocationInfo(null, 0L);
        this.locationObserver = new LocationEngineAdapter$$ExternalSyntheticLambda0(i, this);
        if (!((Boolean) anonymousClass1.invoke(application)).booleanValue()) {
            CommonSdkLog.INSTANCE.logi(null, "Location permission is not granted");
        } else {
            this.locationCancelable = locationProvider != null ? locationProvider.getLastLocation(new MapboxNavigation$$ExternalSyntheticLambda4(18, this)) : null;
        }
    }

    @Override // com.mapbox.search.internal.bindgen.LocationProvider
    public final LonLatBBox getViewport() {
        throw new getCardAtIndex(0);
    }

    public final void startLocationListener() {
        com.mapbox.common.location.LocationProvider locationProvider = this.locationProvider;
        if (locationProvider != null) {
            locationProvider.addLocationObserver(this.locationObserver);
        }
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.timeoutWatcherJob;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.timeoutWatcherJob = BuildersKt.RemoteActionCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(JobKt.RemoteActionCompatParcelizer()), null, null, new NafathModalUiModelImpl$1.AnonymousClass2(1000L, this, (ShortNewsContentCardView) null), 3);
    }

    public final void stopLocationListener() {
        com.mapbox.common.location.LocationProvider locationProvider = this.locationProvider;
        if (locationProvider != null) {
            locationProvider.removeLocationObserver(this.locationObserver);
        }
        Cancelable cancelable = this.locationCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.locationCancelable = null;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.timeoutWatcherJob;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.timeoutWatcherJob = null;
    }
}
