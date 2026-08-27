package kotlinx.coroutines.reactive;

import android.content.Intent;
import android.location.LocationManager;
import android.view.View;
import androidx.compose.ui.graphics.Fields;
import androidx.drawerlayout.widget.DrawerLayout;
import coil3.ComponentRegistry$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.main.presentation.MainActivity;
import com.mapbox.geojson.Point;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.instant.shifts.presentation.InstantShiftsUiModelImpl;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.map.container.enabled.presentation.MapViewModel;
import com.roadrunner.map.container.enabled.presentation.MapboxFragment;
import com.roadrunner.map.container.enabled.usecases.recenter.RecenterMapTriggerImpl;
import com.roadrunner.nafath.VerificationStatusLifecycleObserverImpl;
import com.roadrunner.permission.location.gps.presentation.GPSActivity;
import com.roadrunner.permission.location.permission.LocationPermissionLifecycleHandler;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.futureshift.presentation.FutureShiftUiModelImpl;
import com.roadrunner.rider.state.offertowork.presentation.OfferToWorkUiModelImpl;
import com.roadrunner.rider.state.ondemand.bonus.OnDemandWithBonusUiModelImpl;
import com.roadrunner.rider.state.ondemand.outsideactivearea.OnDemandOutsideActiveAreaUiModelImpl;
import com.roadrunner.rider.state.ondemand.presentation.OnDemandUiModelImpl;
import com.roadrunner.rider.state.onpause.presentation.OnPauseUiModelImpl;
import com.roadrunner.rider.state.searchshifts.presentation.SearchShiftsWithBonusUiModelImpl;
import com.roadrunner.rider.state.suspension.presentation.SuspensionUiModelImpl;
import com.roadrunner.startingarea.presentation.StartingAreaNavigateViewUiModelImpl;
import io.grpc.CallOptions$Builder;
import io.grpc.LoadBalancer$Helper;
import io.sentry.util.MediaBrowserCompatMediaItem;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AdjustInstance10;
import o.AdjustPlayStorePurchase;
import o.AdjustStoreInfo;
import o.AdjustThirdPartySharingResult;
import o.AdjustTimeoutCallback;
import o.AttributionHandler3;
import o.C;
import o.C0211w;
import o.C0215z;
import o.ShortNewsContentCardView;
import o.StaggeredGridLayoutManager;
import o.StaggeredGridLayoutManagerLazySpanLookupFullSpanItem;
import o.T;
import o.WorkManagerImpl;
import o.WorkerStoppedException;
import o.access102;
import o.accessisMainThread;
import o.addDateInSeconds;
import o.addDouble;
import o.buildAndGetAttributionPackage;
import o.buildInstallReferrerSdkClickPackage;
import o.cacheDeeplink;
import o.checkDeeplinkInSessionResponseI;
import o.createFromParcel;
import o.doInBackground;
import o.e6;
import o.f5ExternalSyntheticLambda4;
import o.f8;
import o.f9;
import o.g6;
import o.getABI;
import o.getCieXyz;
import o.getFailureResponseData;
import o.getOnAdidReadListener;
import o.getOsName;
import o.getPackageName;
import o.getPayloadFromSystemPropertyReflection;
import o.getPushToken;
import o.getScreenDensity;
import o.getSku;
import o.getThirdPartySharingSettingsJson;
import o.getTimeoutTimer;
import o.isAdapterPositionOnScreen;
import o.o8ExternalSyntheticLambda0;
import o.o9;
import o.onPrimaryNavigationFragmentChanged;
import o.r8lambda3bU44Zoh4poQG1b9BbDBVanKQ;
import o.r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08;
import o.r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA;
import o.r8lambda_xjKNsnSVqrQpdhsT42da52uGY;
import o.r8lambdaguMkB96aaxyAGqCnh2xMDXoFAs;
import o.r8lambdaomj_unyZPrJ1UpAaUuFSp7i4jfc;
import o.r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY;
import o.r8lambdapuqoe0VC36y8sBKTs_UMSEkf62I;
import o.r8lambdaxReHo_J2NBln0NmeW7hxMCvaAI;
import o.r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.readAndInitOrPropagateAndThrowFailure;
import o.readContentProviderIntentAction;
import o.removeDeeplink;
import o.removeNodeAtDepth;
import o.setTimer;
import o.setTimerStart;
import o.sign;
import o.updateAdidI;
import o.updateHasCallbacks;
import o.x8;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowSubscription$consumeFlow$2 implements FlowCollector {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ FlowSubscription$consumeFlow$2(int i, Object obj) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        Object objUpdateLayerElements;
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.RemoteActionCompatParcelizer;
        boolean z = false;
        String str = null;
        switch (i2) {
            case 0:
                FlowSubscription flowSubscription = (FlowSubscription) obj2;
                flowSubscription.MediaBrowserCompatMediaItem.onNext(obj);
                if (FlowSubscription.IconCompatParcelizer.decrementAndGet(flowSubscription) > 0) {
                    JobKt.RemoteActionCompatParcelizer(flowSubscription.RemoteActionCompatParcelizer);
                    return createfromparcel;
                }
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
                cancellableContinuationImpl.read();
                FlowSubscription.write.set(flowSubscription, cancellableContinuationImpl);
                Object result = cancellableContinuationImpl.getResult();
                return result == CoroutineSingletons.COROUTINE_SUSPENDED ? result : createfromparcel;
            case 1:
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) obj;
                InstantShiftsUiModelImpl instantShiftsUiModelImpl = (InstantShiftsUiModelImpl) obj2;
                instantShiftsUiModelImpl.serializer.IconCompatParcelizer(staggeredGridLayoutManager);
                instantShiftsUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{staggeredGridLayoutManager, StaggeredGridLayoutManagerLazySpanLookupFullSpanItem.write}, getCieXyz.write())).booleanValue()));
                return createfromparcel;
            case 2:
                getFailureResponseData getfailureresponsedata = (getFailureResponseData) obj;
                WorkManagerImpl workManagerImpl = (WorkManagerImpl) obj2;
                if (!((FirebaseRemoteConfigImpl) workManagerImpl.write).IconCompatParcelizer(updateAdidI.IS_LOCATION_PERMISSION_TOGGLE_ENABLED)) {
                    return createfromparcel;
                }
                switch (WorkerStoppedException.serializer[getfailureresponsedata.RemoteActionCompatParcelizer.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return createfromparcel;
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        workManagerImpl.IconCompatParcelizer(false);
                        return createfromparcel;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        int i3 = write + 79;
                        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 == 0) {
                            int i4 = 3 % 3;
                        }
                        return null;
                }
            case 3:
                T t = (T) obj2;
                f5ExternalSyntheticLambda4 f5externalsyntheticlambda4 = t.IconCompatParcelizer;
                int i5 = (int) f5externalsyntheticlambda4.IconCompatParcelizer;
                f5ExternalSyntheticLambda4 f5externalsyntheticlambda5 = t.serializer;
                if (i5 == ((int) f5externalsyntheticlambda5.IconCompatParcelizer)) {
                    MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = t.RemoteActionCompatParcelizer;
                    g6 g6Var = f5externalsyntheticlambda4.write;
                    g6 g6Var2 = f5externalsyntheticlambda5.write;
                    mediaBrowserCompatMediaItem.getClass();
                    if (Math.abs(g6Var.write - g6Var2.write) > 2 || Math.abs(g6Var.IconCompatParcelizer - g6Var2.IconCompatParcelizer) > 2 || Math.abs(g6Var.serializer - g6Var2.serializer) > 2 || Math.abs(g6Var.read - g6Var2.read) > 2) {
                        SaveHeatmapUrlImpl saveHeatmapUrlImpl = t.write;
                        f8 f8Var = t.IconCompatParcelizer.serializer;
                        f8 f8Var2 = t.serializer.serializer;
                        ((accessisMainThread) saveHeatmapUrlImpl.serializer).getClass();
                        if (((int) TuplesKt.distance(Point.fromLngLat(f8Var.read, f8Var.serializer), Point.fromLngLat(f8Var2.read, f8Var2.serializer), "meters")) <= 0) {
                            RecenterMapTriggerImpl recenterMapTriggerImpl = t.MediaBrowserCompatMediaItem;
                            updateHasCallbacks updatehascallbacks = updateHasCallbacks.MapVisibleAreaChange;
                            recenterMapTriggerImpl.getClass();
                            updatehascallbacks.getClass();
                            recenterMapTriggerImpl.RemoteActionCompatParcelizer.onNext(updatehascallbacks);
                        }
                    }
                }
                return createfromparcel;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((C0215z) obj2).RemoteActionCompatParcelizer.IconCompatParcelizer(bool);
                return createfromparcel;
            case 5:
                C c = (C) obj2;
                f5ExternalSyntheticLambda4 f5externalsyntheticlambda6 = c.serializer;
                int i6 = (int) f5externalsyntheticlambda6.IconCompatParcelizer;
                f5ExternalSyntheticLambda4 f5externalsyntheticlambda7 = c.write;
                if (i6 == ((int) f5externalsyntheticlambda7.IconCompatParcelizer)) {
                    SaveHeatmapUrlImpl saveHeatmapUrlImpl2 = c.IconCompatParcelizer;
                    f8 f8Var3 = f5externalsyntheticlambda6.serializer;
                    f8 f8Var4 = f5externalsyntheticlambda7.serializer;
                    ((accessisMainThread) saveHeatmapUrlImpl2.serializer).getClass();
                    if (((int) TuplesKt.distance(Point.fromLngLat(f8Var3.read, f8Var3.serializer), Point.fromLngLat(f8Var4.read, f8Var4.serializer), "meters")) > 0) {
                    }
                    c.MediaDescriptionCompat.write.write(Boolean.valueOf(z));
                    return createfromparcel;
                }
                int i7 = write + 49;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                z = true;
                c.MediaDescriptionCompat.write.write(Boolean.valueOf(z));
                return createfromparcel;
            case 6:
                ((MapViewModel) obj2).MediaDescriptionCompat.serializer(new C0211w(((onPrimaryNavigationFragmentChanged) obj) == onPrimaryNavigationFragmentChanged.COLLAPSED));
                return createfromparcel;
            case 7:
                e6 e6Var = (e6) obj;
                MapboxFragment mapboxFragment = (MapboxFragment) obj2;
                e6 e6Var2 = mapboxFragment.MediaSessionCompatQueueItem;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{e6Var2 != null ? e6Var2.IconCompatParcelizer : null, e6Var.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return createfromparcel;
                }
                mapboxFragment.MediaSessionCompatQueueItem = e6Var;
                ComponentRegistry$Builder componentRegistry$Builder = mapboxFragment.MediaDescriptionCompat;
                return (componentRegistry$Builder == null || (objUpdateLayerElements = componentRegistry$Builder.updateLayerElements(e6Var.IconCompatParcelizer, shortNewsContentCardView)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? createfromparcel : objUpdateLayerElements;
            case 8:
                ((x8) obj2).write.IconCompatParcelizer((f9) obj);
                return createfromparcel;
            case 9:
                ((x8) obj2).write.IconCompatParcelizer((f9) obj);
                return createfromparcel;
            case 10:
                VerificationStatusLifecycleObserverImpl verificationStatusLifecycleObserverImpl = (VerificationStatusLifecycleObserverImpl) obj2;
                if (((r8lambda3bU44Zoh4poQG1b9BbDBVanKQ) obj) == r8lambda3bU44Zoh4poQG1b9BbDBVanKQ.NOT_AVAILABLE) {
                    RouterLogger routerLogger = (RouterLogger) verificationStatusLifecycleObserverImpl.IconCompatParcelizer;
                    MainActivity mainActivity = (MainActivity) verificationStatusLifecycleObserverImpl.serializer;
                    routerLogger.getClass();
                    if (((r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA) routerLogger.read).read(r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.LOCATION, mainActivity)) {
                        Object systemService = ((r8lambda_xjKNsnSVqrQpdhsT42da52uGY) routerLogger.serializer).read.getSystemService("location");
                        systemService.getClass();
                        if (!((LocationManager) systemService).isLocationEnabled()) {
                            ((MediaBrowserCompatMediaItem) verificationStatusLifecycleObserverImpl.write).getClass();
                            mainActivity.startActivity(new Intent(mainActivity, (Class<?>) GPSActivity.class));
                        }
                    }
                }
                return createfromparcel;
            case 11:
                ((LocationPermissionLifecycleHandler) obj2).write();
                return createfromparcel;
            case 12:
                ((setTimerStart) obj2).write.serializer(new cacheDeeplink((String) obj));
                return createfromparcel;
            case 13:
                AdjustInstance10 adjustInstance10 = (AdjustInstance10) obj;
                FutureShiftUiModelImpl futureShiftUiModelImpl = (FutureShiftUiModelImpl) obj2;
                futureShiftUiModelImpl.write.IconCompatParcelizer(Boolean.valueOf(adjustInstance10 instanceof doInBackground));
                futureShiftUiModelImpl.serializer.IconCompatParcelizer(adjustInstance10);
                return createfromparcel;
            case 14:
                AdjustPlayStorePurchase adjustPlayStorePurchase = (AdjustPlayStorePurchase) obj;
                OfferToWorkUiModelImpl offerToWorkUiModelImpl = (OfferToWorkUiModelImpl) obj2;
                offerToWorkUiModelImpl.write.IconCompatParcelizer(Boolean.valueOf(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{adjustPlayStorePurchase, getSku.IconCompatParcelizer}, getCieXyz.write())).booleanValue()));
                offerToWorkUiModelImpl.IconCompatParcelizer.IconCompatParcelizer(adjustPlayStorePurchase);
                return createfromparcel;
            case 15:
                sign signVar = (sign) obj;
                OnDemandWithBonusUiModelImpl onDemandWithBonusUiModelImpl = (OnDemandWithBonusUiModelImpl) obj2;
                onDemandWithBonusUiModelImpl.read.IconCompatParcelizer(Boolean.valueOf(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{signVar, AdjustStoreInfo.serializer}, getCieXyz.write())).booleanValue()));
                onDemandWithBonusUiModelImpl.serializer.IconCompatParcelizer(signVar);
                return createfromparcel;
            case 16:
                getThirdPartySharingSettingsJson getthirdpartysharingsettingsjson = (getThirdPartySharingSettingsJson) obj;
                getABI getabi = (getABI) obj2;
                isAdapterPositionOnScreen isadapterpositiononscreen = getabi.write;
                if ((getthirdpartysharingsettingsjson instanceof AdjustThirdPartySharingResult) && isadapterpositiononscreen.MediaSessionCompatToken()) {
                    ((AttributionHandler3) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).serializer();
                }
                getabi.RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(getthirdpartysharingsettingsjson instanceof AdjustTimeoutCallback));
                getabi.IconCompatParcelizer.IconCompatParcelizer(getthirdpartysharingsettingsjson);
                return createfromparcel;
            case 17:
                getOnAdidReadListener getonadidreadlistener = (getOnAdidReadListener) obj;
                OnDemandOutsideActiveAreaUiModelImpl onDemandOutsideActiveAreaUiModelImpl = (OnDemandOutsideActiveAreaUiModelImpl) obj2;
                onDemandOutsideActiveAreaUiModelImpl.write.IconCompatParcelizer(getonadidreadlistener);
                onDemandOutsideActiveAreaUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(!(getonadidreadlistener instanceof getTimeoutTimer)));
                return createfromparcel;
            case 18:
                setTimer settimer = (setTimer) obj;
                OnDemandUiModelImpl onDemandUiModelImpl = (OnDemandUiModelImpl) obj2;
                onDemandUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{settimer, access102.read}, getCieXyz.write())).booleanValue()));
                onDemandUiModelImpl.serializer.IconCompatParcelizer(settimer);
                return createfromparcel;
            case 19:
                checkDeeplinkInSessionResponseI checkdeeplinkinsessionresponsei = (checkDeeplinkInSessionResponseI) obj;
                getOsName getosname = (getOsName) obj2;
                getosname.read.IconCompatParcelizer(Boolean.valueOf(checkdeeplinkinsessionresponsei instanceof buildAndGetAttributionPackage));
                getosname.RemoteActionCompatParcelizer.IconCompatParcelizer(checkdeeplinkinsessionresponsei);
                return createfromparcel;
            case 20:
                getPackageName getpackagename = (getPackageName) obj;
                OnPauseUiModelImpl onPauseUiModelImpl = (OnPauseUiModelImpl) obj2;
                onPauseUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(getpackagename);
                onPauseUiModelImpl.read.IconCompatParcelizer(Boolean.valueOf(getpackagename instanceof getScreenDensity));
                return createfromparcel;
            case 21:
                addDateInSeconds adddateinseconds = (addDateInSeconds) obj;
                buildInstallReferrerSdkClickPackage buildinstallreferrersdkclickpackage = (buildInstallReferrerSdkClickPackage) obj2;
                buildinstallreferrersdkclickpackage.IconCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(!(adddateinseconds instanceof addDouble)));
                buildinstallreferrersdkclickpackage.serializer.IconCompatParcelizer(adddateinseconds);
                return createfromparcel;
            case 22:
                getPayloadFromSystemPropertyReflection getpayloadfromsystempropertyreflection = (getPayloadFromSystemPropertyReflection) obj;
                SearchShiftsWithBonusUiModelImpl searchShiftsWithBonusUiModelImpl = (SearchShiftsWithBonusUiModelImpl) obj2;
                searchShiftsWithBonusUiModelImpl.IconCompatParcelizer.IconCompatParcelizer(getpayloadfromsystempropertyreflection);
                searchShiftsWithBonusUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpayloadfromsystempropertyreflection, readContentProviderIntentAction.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()));
                return createfromparcel;
            case 23:
                getPushToken getpushtoken = (getPushToken) obj;
                SuspensionUiModelImpl suspensionUiModelImpl = (SuspensionUiModelImpl) obj2;
                suspensionUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(getpushtoken);
                suspensionUiModelImpl.read.IconCompatParcelizer(Boolean.valueOf(getpushtoken instanceof removeDeeplink));
                return createfromparcel;
            case 24:
                r8lambdapuqoe0VC36y8sBKTs_UMSEkf62I r8lambdapuqoe0vc36y8sbkts_umsekf62i = (r8lambdapuqoe0VC36y8sBKTs_UMSEkf62I) obj;
                MutableStateFlow mutableStateFlow = ((r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY) obj2).serializer;
                if (r8lambdapuqoe0vc36y8sbkts_umsekf62i != null) {
                    int i9 = IconCompatParcelizer + 7;
                    write = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        str = r8lambdapuqoe0vc36y8sbkts_umsekf62i.IconCompatParcelizer;
                        int i10 = 78 / 0;
                    } else {
                        str = r8lambdapuqoe0vc36y8sbkts_umsekf62i.IconCompatParcelizer;
                    }
                }
                mutableStateFlow.IconCompatParcelizer(new r8lambdaomj_unyZPrJ1UpAaUuFSp7i4jfc(str));
                return createfromparcel;
            case 25:
                CallOptions$Builder callOptions$Builder = (CallOptions$Builder) obj2;
                int i11 = r8lambdaxReHo_J2NBln0NmeW7hxMCvaAI.write[((r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug) obj).ordinal()];
                if (i11 == 1) {
                    DrawerLayout drawerLayout = (DrawerLayout) callOptions$Builder.write;
                    View view = drawerLayout.read(8388611);
                    if (view != null) {
                        drawerLayout.RatingCompat(view);
                        ((r8lambdaguMkB96aaxyAGqCnh2xMDXoFAs) callOptions$Builder.MediaMetadataCompat).RemoteActionCompatParcelizer.logEvent("open_side_menu_click", null);
                        callOptions$Builder.read();
                        return createfromparcel;
                    }
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(DrawerLayout.write(8388611), "No drawer view found with gravity ");
                } else {
                    if (i11 == 2) {
                        callOptions$Builder.serializer();
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                }
                return null;
            case 26:
                ((readAndInitOrPropagateAndThrowFailure) obj2).RemoteActionCompatParcelizer.IconCompatParcelizer((f9) obj);
                return createfromparcel;
            default:
                o8ExternalSyntheticLambda0 o8externalsyntheticlambda0 = (o8ExternalSyntheticLambda0) obj;
                StartingAreaNavigateViewUiModelImpl startingAreaNavigateViewUiModelImpl = (StartingAreaNavigateViewUiModelImpl) obj2;
                startingAreaNavigateViewUiModelImpl.IconCompatParcelizer.IconCompatParcelizer(o8externalsyntheticlambda0);
                startingAreaNavigateViewUiModelImpl.serializer.IconCompatParcelizer(Boolean.valueOf(o8externalsyntheticlambda0 instanceof o9));
                return createfromparcel;
        }
    }
}
