package kotlinx.serialization;

import android.app.Application;
import androidx.datastore.preferences.core.PreferencesSerializer;
import androidx.fragment.app.FragmentActivity;
import coil3.ComponentRegistry$Builder;
import com.incognia.internal.xr$$ExternalSyntheticLambda1;
import com.mapbox.navigation.ui.maps.route.arrow.api.MapboxRouteArrowView;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineViewOptions;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.location.core.domain.GetLocationUpdatesUseCaseImpl;
import com.roadrunner.logger.api.data.AppInfoChangedListener;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.logger.performance.DefaultPerformanceLogger;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import com.roadrunner.map.integration.mapbox.route.RouteArrowApi;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.rider.state.futureshift.presentation.FutureShiftUiModelImpl;
import com.roadrunner.rider.state.offertowork.presentation.OfferToWorkUiModelImpl;
import com.roadrunner.rider.state.ondemand.bonus.OnDemandWithBonusUiModelImpl;
import com.roadrunner.rider.state.ondemand.presentation.OnDemandUiModelImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import com.roadrunner.startworking.domain.stopworking.StopWorkingUseCaseImpl;
import io.grpc.internal.CallTracer;
import io.sentry.util.UrlUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import kotlinx.coroutines.internal.MainDispatchersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.test.internal.TestMainDispatcherFactory;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.json.internal.JsonNamesMapKt;
import o.AttributionHandler3;
import o.AttributionResponseData;
import o.BrazeExternalSyntheticLambda48;
import o.DefaultInAppMessageFullViewFactoryCompanion;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.InAppMessageSlideupView;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SemanticsOwner;
import o.SimpleItemTouchHelperCallback;
import o.SuspendingTransactionWrapper;
import o.Worker;
import o.createFromParcel;
import o.createHorizontalAnimation;
import o.createInAppMessageEventSubscriber;
import o.createInAppMessageViewlambda0;
import o.createNotificationChannels;
import o.div7Ah8Wj8;
import o.getABI;
import o.getCieXyz;
import o.getFocusedRect;
import o.getMapper;
import o.getMaxSafeTopInset;
import o.getQueryContext;
import o.inCompatibilityMode;
import o.isActivityRegisteredInManifestlambda0;
import o.isItemDismissable;
import o.isOpenInternalroom_runtime;
import o.localError;
import o.m7;
import o.md;
import o.onCreateWindowlambda3;
import o.onItemDismiss;
import o.openSessionlambda0;
import o.overwriteCallback;
import o.prepareForActivityTransitionCarryover;
import o.publishErrorlambda1;
import o.r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambda93S_WWydVO4tgS0mQqqSoxDXifE;
import o.r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8;
import o.r8lambdaNxOeuqJ_rnU5CrrwK9PIxTYNtqE;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaXNVkurBk5ihN67JvNZdyPWNMsNw;
import o.r8lambdaaj64OZVyd1y4RKHlJSx10F9bUic;
import o.r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.r8lambdanbCgCZH9JKHUNnWSIyypdsyJVco;
import o.r8lambdazCd1z82txJou5vkO0oL_06hVCA;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.restoreChildFragmentState;
import o.setTransactionSuccessful;
import o.transferSessionPackageI;
import o.waitTime;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class SealedClassSerializer$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ SealedClassSerializer$$ExternalSyntheticLambda0(MainDispatcherFactory mainDispatcherFactory, ArrayList arrayList, TestMainDispatcherFactory testMainDispatcherFactory) {
        this.RemoteActionCompatParcelizer = 18;
        this.IconCompatParcelizer = mainDispatcherFactory;
        this.serializer = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x015d  */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Object isitemdismissable;
        boolean z;
        String lowerCase;
        String[] strArr;
        long jSerializer;
        int i = 7;
        isActivityRegisteredInManifestlambda0[] isactivityregisteredinmanifestlambda0Arr = null;
        int i2 = 0;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                return RangesKt.write((String) this.IconCompatParcelizer, createInAppMessageViewlambda0.write, new r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[0], new DefaultInAppMessageFullViewFactoryCompanion((DefaultInAppMessageHtmlFullViewFactory) this.serializer, i2));
            case 1:
                ((GetLocationUpdatesUseCaseImpl) this.IconCompatParcelizer).write.serializer((SaveHeatmapUrlImpl) this.serializer);
                return createFromParcel.INSTANCE;
            case 2:
                return FlowKt.serializer(new GetMapScope$invoke$$inlined$map$1(((GetRiderStatusImpl) this.IconCompatParcelizer).IconCompatParcelizer(), (Worker) this.serializer, 2));
            case 3:
                AppEventInfoChangeHandler appEventInfoChangeHandler = (AppEventInfoChangeHandler) this.IconCompatParcelizer;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.serializer;
                Iterator it = appEventInfoChangeHandler.write().iterator();
                while (it.hasNext()) {
                    ((AppInfoChangedListener) it.next()).updateProperties(linkedHashMap);
                }
                return createFromParcel.INSTANCE;
            case 4:
                return new MapboxRouteArrowView(((RouteArrowApi) this.IconCompatParcelizer).IconCompatParcelizer((Application) this.serializer));
            case 5:
                m7 m7Var = (m7) this.IconCompatParcelizer;
                Application application = (Application) this.serializer;
                String str = m7Var.IconCompatParcelizer;
                md mdVar = m7Var.MediaSessionCompatToken;
                if (str == null) {
                    removeNodeAtDepth.serializer("layerId");
                    throw null;
                }
                if (str.length() <= 0) {
                    MapboxRouteLineViewOptions.Builder builder = new MapboxRouteLineViewOptions.Builder(application);
                    builder.routeLineColorResources(mdVar.write());
                    return builder.build();
                }
                MapboxRouteLineViewOptions.Builder builder2 = new MapboxRouteLineViewOptions.Builder(application);
                String str2 = m7Var.IconCompatParcelizer;
                if (str2 == null) {
                    removeNodeAtDepth.serializer("layerId");
                    throw null;
                }
                builder2.routeLineBelowLayerId(str2);
                builder2.routeLineColorResources(mdVar.write());
                return builder2.build();
            case 6:
                return ((openSessionlambda0) this.IconCompatParcelizer).serializer(((FutureShiftUiModelImpl) this.serializer).read);
            case 7:
                return ((openSessionlambda0) this.IconCompatParcelizer).serializer(((OfferToWorkUiModelImpl) this.serializer).RemoteActionCompatParcelizer);
            case 8:
                return ((overwriteCallback) this.IconCompatParcelizer).read(((OnDemandWithBonusUiModelImpl) this.serializer).IconCompatParcelizer);
            case 9:
                return ((openSessionlambda0) this.IconCompatParcelizer).serializer(((OnDemandWithBonusUiModelImpl) this.serializer).IconCompatParcelizer);
            case 10:
                AttributionResponseData attributionResponseData = (AttributionResponseData) this.IconCompatParcelizer;
                ContextScope contextScope = ((getABI) this.serializer).read;
                CallTracer callTracer = attributionResponseData.write;
                Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.RemoteActionCompatParcelizer).write();
                objWrite.getClass();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite;
                StopWorkingUseCaseImpl stopWorkingUseCaseImpl = (StopWorkingUseCaseImpl) ((publishErrorlambda1) callTracer.write).write();
                Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.serializer).write();
                objWrite2.getClass();
                Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.IconCompatParcelizer).write();
                objWrite3.getClass();
                return new AttributionHandler3(settransactionsuccessful, stopWorkingUseCaseImpl, (restoreChildFragmentState) objWrite2, (NetworkErrorMapperImpl) objWrite3, new getQueryContext(), contextScope);
            case 11:
                return ((overwriteCallback) this.IconCompatParcelizer).read(((OnDemandUiModelImpl) this.serializer).read);
            case 12:
                return ((openSessionlambda0) this.IconCompatParcelizer).serializer(((OnDemandUiModelImpl) this.serializer).read);
            case 13:
                waitTime waittime = (waitTime) this.IconCompatParcelizer;
                FragmentActivity fragmentActivity = (FragmentActivity) this.serializer;
                r8lambda93S_WWydVO4tgS0mQqqSoxDXifE r8lambda93s_wwydvo4tgs0mqqqsoxdxife = waittime.serializer;
                div7Ah8Wj8 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                r8lambda93s_wwydvo4tgs0mqqqsoxdxife.write(fragmentActivity, supportFragmentManager);
                return createFromParcel.INSTANCE;
            case 14:
                localError localerror = (localError) this.IconCompatParcelizer;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.serializer;
                long jLongValue = ((Number) localerror.write.invoke()).longValue();
                if (localerror.RemoteActionCompatParcelizer + localerror.serializer <= jLongValue) {
                    localerror.RemoteActionCompatParcelizer = jLongValue;
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                }
                return createFromParcel.INSTANCE;
            case 15:
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.IconCompatParcelizer;
                ((PopulateViewStructure_androidKtpopulate7) this.serializer).setValue(Boolean.FALSE);
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
                return createFromParcel.INSTANCE;
            case 16:
                isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) this.IconCompatParcelizer;
                Application application2 = (Application) this.serializer;
                createNotificationChannels createnotificationchannels = new createNotificationChannels(1);
                ((inCompatibilityMode) isopeninternalroom_runtime).getClass();
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                return PreferencesSerializer.write(YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer.plus(UrlUtils.serializer()).plus(createnotificationchannels)), new r8lambdaNxOeuqJ_rnU5CrrwK9PIxTYNtqE(application2, i), 3);
            case 17:
                ComponentRegistry$Builder componentRegistry$Builder = (ComponentRegistry$Builder) this.IconCompatParcelizer;
                String strRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(((BrazeExternalSyntheticLambda48) this.serializer).RemoteActionCompatParcelizer, "_tti");
                getMapper getmapper = getMapper.UI_LOAD;
                componentRegistry$Builder.getClass();
                getmapper.getClass();
                return new DefaultPerformanceLogger((SemanticsOwner) componentRegistry$Builder.write, (SuspendingTransactionWrapper) componentRegistry$Builder.read, (AppEventInfoChangeHandler) componentRegistry$Builder.RemoteActionCompatParcelizer, (Application) componentRegistry$Builder.IconCompatParcelizer, (transferSessionPackageI) componentRegistry$Builder.serializer, strRemoteActionCompatParcelizer, getmapper);
            case 18:
                try {
                    MainCoroutineDispatcher mainCoroutineDispatcherCreateDispatcher = ((MainDispatcherFactory) this.IconCompatParcelizer).createDispatcher((ArrayList) this.serializer);
                    if (!MainDispatchersKt.IconCompatParcelizer(mainCoroutineDispatcherCreateDispatcher)) {
                        return mainCoroutineDispatcherCreateDispatcher;
                    }
                    try {
                        mainCoroutineDispatcherCreateDispatcher.dispatch(mainCoroutineDispatcherCreateDispatcher, new xr$$ExternalSyntheticLambda1(1));
                        isitemdismissable = createFromParcel.INSTANCE;
                        break;
                    } catch (Throwable th) {
                        isitemdismissable = new isItemDismissable(th);
                    }
                    getFocusedRect.IconCompatParcelizer(onItemDismiss.serializer(isitemdismissable));
                    throw null;
                } catch (Throwable th2) {
                    getFocusedRect.IconCompatParcelizer(th2);
                    throw null;
                }
            case 19:
                EnumSerializer enumSerializer = (EnumSerializer) this.serializer;
                String str3 = (String) this.IconCompatParcelizer;
                r8lambdazCd1z82txJou5vkO0oL_06hVCA r8lambdazcd1z82txjou5vko0ol_06hvca = (r8lambdazCd1z82txJou5vkO0oL_06hVCA) enumSerializer.write;
                if (r8lambdazcd1z82txjou5vko0ol_06hvca != null) {
                    return r8lambdazcd1z82txjou5vko0ol_06hvca;
                }
                Enum[] enumArr = (Enum[]) enumSerializer.serializer;
                r8lambdazCd1z82txJou5vkO0oL_06hVCA r8lambdazcd1z82txjou5vko0ol_06hvca2 = new r8lambdazCd1z82txJou5vkO0oL_06hVCA(str3, enumArr.length);
                for (Enum r0 : enumArr) {
                    r8lambdazcd1z82txjou5vko0ol_06hvca2.read(r0.name(), false);
                }
                return r8lambdazcd1z82txjou5vko0ol_06hvca2;
            case 20:
                return RangesKt.write((String) this.IconCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.write, new r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[0], new r8lambdaaj64OZVyd1y4RKHlJSx10F9bUic(i, (EnumSerializer) this.serializer));
            case 21:
                r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) this.IconCompatParcelizer;
                resetTransientState resettransientstate = (resetTransientState) this.serializer;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (!resettransientstate.IconCompatParcelizer.serializer) {
                    z = false;
                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(), r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                JsonNamesMapKt.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, resettransientstate);
                int iIconCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer();
                for (int i3 = 0; i3 < iIconCompatParcelizer; i3++) {
                    List listSerializer = r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer(i3);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listSerializer) {
                        if (obj instanceof r8lambdaXNVkurBk5ihN67JvNZdyPWNMsNw) {
                            arrayList.add(obj);
                        }
                    }
                    r8lambdaXNVkurBk5ihN67JvNZdyPWNMsNw r8lambdaxnvkurbk5ihn67jvnzdypwnmsnw = (r8lambdaXNVkurBk5ihN67JvNZdyPWNMsNw) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (r8lambdaxnvkurbk5ihn67jvnzdypwnmsnw != null && (strArr = r8lambdaxnvkurbk5ihn67jvnzdypwnmsnw.read()) != null) {
                        for (String lowerCase2 : strArr) {
                            if (z) {
                                lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                                lowerCase2.getClass();
                            }
                            JsonNamesMapKt.serializer(linkedHashMap2, r8lambda92m0p9sit5uf70mvjf4rwmruda, lowerCase2, i3);
                        }
                    }
                    if (z) {
                        lowerCase = r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer(i3).toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    } else {
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        JsonNamesMapKt.serializer(linkedHashMap2, r8lambda92m0p9sit5uf70mvjf4rwmruda, lowerCase, i3);
                    }
                }
                return linkedHashMap2.isEmpty() ? SimpleItemTouchHelperCallback.serializer : linkedHashMap2;
            case 22:
                createHorizontalAnimation createhorizontalanimation = (createHorizontalAnimation) this.IconCompatParcelizer;
                isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0 = (isActivityRegisteredInManifestlambda0) this.serializer;
                try {
                    createhorizontalanimation.listener.read(isactivityregisteredinmanifestlambda0);
                    break;
                } catch (IOException e) {
                    getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
                    getMaxSafeTopInset.MediaDescriptionCompat.read(4, "Http2Connection.Listener failure for " + createhorizontalanimation.connectionName, e);
                    try {
                        isactivityregisteredinmanifestlambda0.write(InAppMessageSlideupView.PROTOCOL_ERROR, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return createFromParcel.INSTANCE;
            case 23:
                r8lambdanbCgCZH9JKHUNnWSIyypdsyJVco r8lambdanbcgczh9jkhunnwsiyypdsyjvco = (r8lambdanbCgCZH9JKHUNnWSIyypdsyJVco) this.IconCompatParcelizer;
                r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU r8lambdaegyeunc1miz5uhkn7yqmbsifezu = (r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU) this.serializer;
                createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                createHorizontalAnimation createhorizontalanimation2 = r8lambdanbcgczh9jkhunnwsiyypdsyjvco.this$0;
                synchronized (createhorizontalanimation2.writer) {
                    synchronized (createhorizontalanimation2) {
                        r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU r8lambdaegyeunc1miz5uhkn7yqmbsifezu2 = createhorizontalanimation2.peerSettings;
                        r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU r8lambdaegyeunc1miz5uhkn7yqmbsifezu3 = new r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU();
                        r8lambdaegyeunc1miz5uhkn7yqmbsifezu2.getClass();
                        for (int i4 = 0; i4 < 10; i4++) {
                            if ((r8lambdaegyeunc1miz5uhkn7yqmbsifezu2.set & (1 << i4)) != 0) {
                                r8lambdaegyeunc1miz5uhkn7yqmbsifezu3.read(i4, r8lambdaegyeunc1miz5uhkn7yqmbsifezu2.values[i4]);
                            }
                        }
                        for (int i5 = 0; i5 < 10; i5++) {
                            if ((r8lambdaegyeunc1miz5uhkn7yqmbsifezu.set & (1 << i5)) != 0) {
                                r8lambdaegyeunc1miz5uhkn7yqmbsifezu3.read(i5, r8lambdaegyeunc1miz5uhkn7yqmbsifezu.values[i5]);
                            }
                        }
                        createinappmessageeventsubscriber.IconCompatParcelizer = r8lambdaegyeunc1miz5uhkn7yqmbsifezu3;
                        jSerializer = ((long) r8lambdaegyeunc1miz5uhkn7yqmbsifezu3.serializer()) - ((long) r8lambdaegyeunc1miz5uhkn7yqmbsifezu2.serializer());
                        if (jSerializer != 0 && !createhorizontalanimation2.streams.isEmpty()) {
                            isactivityregisteredinmanifestlambda0Arr = (isActivityRegisteredInManifestlambda0[]) createhorizontalanimation2.streams.values().toArray(new isActivityRegisteredInManifestlambda0[0]);
                        }
                        r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU r8lambdaegyeunc1miz5uhkn7yqmbsifezu4 = (r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU) createinappmessageeventsubscriber.IconCompatParcelizer;
                        r8lambdaegyeunc1miz5uhkn7yqmbsifezu4.getClass();
                        createhorizontalanimation2.peerSettings = r8lambdaegyeunc1miz5uhkn7yqmbsifezu4;
                        onCreateWindowlambda3.RemoteActionCompatParcelizer(createhorizontalanimation2.settingsListenerQueue, createhorizontalanimation2.connectionName + " onSettings", 0L, new SealedClassSerializer$$ExternalSyntheticLambda0(createhorizontalanimation2, 24, createinappmessageeventsubscriber), 6);
                    }
                    try {
                        createhorizontalanimation2.writer.serializer((r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU) createinappmessageeventsubscriber.IconCompatParcelizer);
                    } catch (IOException e2) {
                        InAppMessageSlideupView inAppMessageSlideupView = InAppMessageSlideupView.PROTOCOL_ERROR;
                        createhorizontalanimation2.RemoteActionCompatParcelizer(inAppMessageSlideupView, inAppMessageSlideupView, e2);
                    }
                    break;
                }
                if (isactivityregisteredinmanifestlambda0Arr != null) {
                    int length = isactivityregisteredinmanifestlambda0Arr.length;
                    while (i2 < length) {
                        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda1 = isactivityregisteredinmanifestlambda0Arr[i2];
                        synchronized (isactivityregisteredinmanifestlambda1) {
                            isactivityregisteredinmanifestlambda1.ParcelableVolumeInfo += jSerializer;
                            if (jSerializer > 0) {
                                isactivityregisteredinmanifestlambda1.notifyAll();
                            }
                            break;
                        }
                        i2++;
                    }
                }
                return createFromParcel.INSTANCE;
            default:
                createHorizontalAnimation createhorizontalanimation3 = (createHorizontalAnimation) this.IconCompatParcelizer;
                createhorizontalanimation3.listener.serializer(createhorizontalanimation3, (r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU) ((createInAppMessageEventSubscriber) this.serializer).IconCompatParcelizer);
                return createFromParcel.INSTANCE;
        }
    }

    public /* synthetic */ SealedClassSerializer$$ExternalSyntheticLambda0(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj;
        this.serializer = obj2;
    }

    public /* synthetic */ SealedClassSerializer$$ExternalSyntheticLambda0(EnumSerializer enumSerializer, String str) {
        this.RemoteActionCompatParcelizer = 19;
        this.serializer = enumSerializer;
        this.IconCompatParcelizer = str;
    }
}
