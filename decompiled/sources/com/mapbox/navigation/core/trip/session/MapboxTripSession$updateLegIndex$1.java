package com.mapbox.navigation.core.trip.session;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import coil3.network.okhttp.internal.CallsKt$await$2$2;
import com.data.extensions.ThrowableExtensionsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.navigator.internal.MapboxNativeNavigatorImpl;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.roadrunner.rider.state.provider.data.model.FetchRiderStatusImpl;
import com.roadrunner.rider.state.searchshifts.presentation.SearchShiftsWithBonusUiModelImpl;
import com.sentiance.core.model.events.H$b;
import io.grpc.LoadBalancer$Helper;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.ShortNewsContentCardView;
import o.cancelPendingWebViewPause;
import o.createFromParcel;
import o.ddefault;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getPayloadFromFileSystem;
import o.getPayloadFromSystemPropertyFilePath;
import o.getQueryContext;
import o.hasAllLocationsBeenRead;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onPrimaryNavigationFragmentChanged;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.sendPurchaseVerificationPackageSync;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxTripSession$updateLegIndex$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ Object $callback;
    public final /* synthetic */ int $legIndex;
    public final /* synthetic */ Object $legIndexUpdated;
    public final /* synthetic */ int $r8$classId = 0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxTripSession$updateLegIndex$1(SearchShiftsWithBonusUiModelImpl searchShiftsWithBonusUiModelImpl, int i, hasAllLocationsBeenRead hasalllocationsbeenread, String str, String str2, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.L$2 = searchShiftsWithBonusUiModelImpl;
        this.$legIndex = i;
        this.$legIndexUpdated = hasalllocationsbeenread;
        this.this$0 = str;
        this.$callback = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxTripSession$updateLegIndex$1(MapboxTripSession mapboxTripSession, cancelPendingWebViewPause cancelpendingwebviewpause, int i, ArrivalProgressObserver$$ExternalSyntheticLambda0 arrivalProgressObserver$$ExternalSyntheticLambda0, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.this$0 = mapboxTripSession;
        this.$legIndexUpdated = cancelpendingwebviewpause;
        this.$legIndex = i;
        this.$callback = arrivalProgressObserver$$ExternalSyntheticLambda0;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            return ((MapboxTripSession$updateLegIndex$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((MapboxTripSession$updateLegIndex$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = serializer + 9;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        return new com.mapbox.navigation.core.trip.session.MapboxTripSession$updateLegIndex$1((com.roadrunner.rider.state.searchshifts.presentation.SearchShiftsWithBonusUiModelImpl) r11.L$2, r11.$legIndex, (o.hasAllLocationsBeenRead) r3, (java.lang.String) r2, (java.lang.String) r1, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        r0 = new com.mapbox.navigation.core.trip.session.MapboxTripSession$updateLegIndex$1((com.mapbox.navigation.core.trip.session.MapboxTripSession) r2, (o.cancelPendingWebViewPause) r3, r11.$legIndex, (com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0) r1, r13);
        r13 = com.mapbox.navigation.core.trip.session.MapboxTripSession$updateLegIndex$1.serializer + 41;
        com.mapbox.navigation.core.trip.session.MapboxTripSession$updateLegIndex$1.RemoteActionCompatParcelizer = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r0 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r0 != 0) goto L9;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(java.lang.Object r12, o.ShortNewsContentCardView r13) {
        /*
            r11 = this;
            r12 = 2
            int r0 = r12 % r12
            int r0 = com.mapbox.navigation.core.trip.session.MapboxTripSession$updateLegIndex$1.RemoteActionCompatParcelizer
            int r0 = r0 + 103
            int r1 = r0 % 128
            com.mapbox.navigation.core.trip.session.MapboxTripSession$updateLegIndex$1.serializer = r1
            int r0 = r0 % r12
            if (r0 != 0) goto L1d
            int r0 = r11.$r8$classId
            java.lang.Object r1 = r11.$callback
            java.lang.Object r2 = r11.this$0
            java.lang.Object r3 = r11.$legIndexUpdated
            r4 = 21
            int r4 = r4 / 0
            if (r0 == 0) goto L3f
            goto L27
        L1d:
            int r0 = r11.$r8$classId
            java.lang.Object r1 = r11.$callback
            java.lang.Object r2 = r11.this$0
            java.lang.Object r3 = r11.$legIndexUpdated
            if (r0 == 0) goto L3f
        L27:
            java.lang.Object r12 = r11.L$2
            r5 = r12
            com.roadrunner.rider.state.searchshifts.presentation.SearchShiftsWithBonusUiModelImpl r5 = (com.roadrunner.rider.state.searchshifts.presentation.SearchShiftsWithBonusUiModelImpl) r5
            r7 = r3
            o.hasAllLocationsBeenRead r7 = (o.hasAllLocationsBeenRead) r7
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            int r6 = r11.$legIndex
            com.mapbox.navigation.core.trip.session.MapboxTripSession$updateLegIndex$1 r12 = new com.mapbox.navigation.core.trip.session.MapboxTripSession$updateLegIndex$1
            r4 = r12
            r10 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r12
        L3f:
            r5 = r2
            com.mapbox.navigation.core.trip.session.MapboxTripSession r5 = (com.mapbox.navigation.core.trip.session.MapboxTripSession) r5
            r6 = r3
            o.cancelPendingWebViewPause r6 = (o.cancelPendingWebViewPause) r6
            int r7 = r11.$legIndex
            r8 = r1
            com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0 r8 = (com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0) r8
            com.mapbox.navigation.core.trip.session.MapboxTripSession$updateLegIndex$1 r0 = new com.mapbox.navigation.core.trip.session.MapboxTripSession$updateLegIndex$1
            r4 = r0
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            int r13 = com.mapbox.navigation.core.trip.session.MapboxTripSession$updateLegIndex$1.serializer
            int r13 = r13 + 41
            int r1 = r13 % 128
            com.mapbox.navigation.core.trip.session.MapboxTripSession$updateLegIndex$1.RemoteActionCompatParcelizer = r1
            int r13 = r13 % r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.core.trip.session.MapboxTripSession$updateLegIndex$1.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object result;
        BannerInstructionEvent$LatestInstructionWrapper bannerInstructionEvent$LatestInstructionWrapper;
        VoiceInstructions voiceInstructions;
        cancelPendingWebViewPause cancelpendingwebviewpause;
        Object objM5032assignyxL6bBk;
        SearchShiftsWithBonusUiModelImpl searchShiftsWithBonusUiModelImpl;
        Throwable thSerializer;
        String strIconCompatParcelizer;
        FetchRiderStatusImpl fetchRiderStatusImpl;
        int i = 2 % 2;
        int i2 = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.$callback;
        Object obj3 = this.this$0;
        Object obj4 = this.$legIndexUpdated;
        int i3 = 5;
        if (i2 == 0) {
            ArrivalProgressObserver$$ExternalSyntheticLambda0 arrivalProgressObserver$$ExternalSyntheticLambda0 = (ArrivalProgressObserver$$ExternalSyntheticLambda0) obj2;
            final MapboxTripSession mapboxTripSession = (MapboxTripSession) obj3;
            H$b h$b = mapboxTripSession.bannerInstructionEvent;
            cancelPendingWebViewPause cancelpendingwebviewpause2 = (cancelPendingWebViewPause) obj4;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.label;
            final int i5 = this.$legIndex;
            try {
                if (i4 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    final String str = "started";
                    final String str2 = "";
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.navigation.core.trip.session.MapboxTripSession$updateLegIndex$1$msg$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            StringBuilder sb = new StringBuilder("update to new leg ");
                            sb.append(str);
                            sb.append(". Leg index: ");
                            sb.append(i5);
                            sb.append(", route id: ");
                            NavigationRoute navigationRoute = mapboxTripSession.primaryRoute;
                            sb.append(navigationRoute != null ? navigationRoute.id : null);
                            sb.append(" + ");
                            sb.append(str2);
                            return sb.toString();
                        }
                    };
                    if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                        LoggerProviderKt.logD((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), "MapboxTripSession");
                    }
                    BannerInstructionEvent$LatestInstructionWrapper bannerInstructionEvent$LatestInstructionWrapper2 = (BannerInstructionEvent$LatestInstructionWrapper) h$b.serializer;
                    VoiceInstructions voiceInstructions2 = mapboxTripSession.lastVoiceInstruction;
                    MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl = mapboxTripSession.navigator;
                    this.L$0 = bannerInstructionEvent$LatestInstructionWrapper2;
                    this.L$1 = voiceInstructions2;
                    this.L$2 = cancelpendingwebviewpause2;
                    this.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(this));
                    cancellableContinuationImpl.read();
                    if (!mapboxNativeNavigatorImpl.warnIfShutdown("updateLegIndex")) {
                        mapboxNativeNavigatorImpl.getNavigator().changeLeg(i5, new CallsKt$await$2$2(cancellableContinuationImpl, i3));
                    } else {
                        cancellableContinuationImpl.resumeWith(Boolean.FALSE);
                    }
                    result = cancellableContinuationImpl.getResult();
                    if (result == coroutineSingletons) {
                        int i6 = serializer + 31;
                        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        return coroutineSingletons;
                    }
                    bannerInstructionEvent$LatestInstructionWrapper = bannerInstructionEvent$LatestInstructionWrapper2;
                    voiceInstructions = voiceInstructions2;
                    cancelpendingwebviewpause = cancelpendingwebviewpause2;
                } else {
                    if (i4 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cancelpendingwebviewpause = (cancelPendingWebViewPause) this.L$2;
                    voiceInstructions = (VoiceInstructions) this.L$1;
                    bannerInstructionEvent$LatestInstructionWrapper = (BannerInstructionEvent$LatestInstructionWrapper) this.L$0;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    result = obj;
                }
                cancelpendingwebviewpause.IconCompatParcelizer = ((Boolean) result).booleanValue();
                if (cancelpendingwebviewpause2.IconCompatParcelizer) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bannerInstructionEvent$LatestInstructionWrapper, (BannerInstructionEvent$LatestInstructionWrapper) h$b.serializer}, getCieXyz.write())).booleanValue()) {
                        h$b.serializer = null;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mapboxTripSession.lastVoiceInstruction, voiceInstructions}, getCieXyz.write())).booleanValue()) {
                        int i8 = serializer + 29;
                        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                        if (i8 % 2 != 0) {
                            mapboxTripSession.lastVoiceInstruction = null;
                            int i9 = 13 / 0;
                        } else {
                            mapboxTripSession.lastVoiceInstruction = null;
                        }
                    }
                }
                final String str3 = "(is leg updated: " + cancelpendingwebviewpause2.IconCompatParcelizer + "; latestInstructionWrapper: [" + bannerInstructionEvent$LatestInstructionWrapper + "]; lastVoiceInstruction: [" + voiceInstructions + "])";
                final String str4 = "finished";
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.navigation.core.trip.session.MapboxTripSession$updateLegIndex$1$msg$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        StringBuilder sb = new StringBuilder("update to new leg ");
                        sb.append(str4);
                        sb.append(". Leg index: ");
                        sb.append(i5);
                        sb.append(", route id: ");
                        NavigationRoute navigationRoute = mapboxTripSession.primaryRoute;
                        sb.append(navigationRoute != null ? navigationRoute.id : null);
                        sb.append(" + ");
                        sb.append(str3);
                        return sb.toString();
                    }
                };
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                    int i10 = serializer + 61;
                    RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 != 0) {
                        LoggerProviderKt.logD((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke(), "MapboxTripSession");
                        int i11 = 3 / 0;
                    } else {
                        LoggerProviderKt.logD((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke(), "MapboxTripSession");
                    }
                }
                arrivalProgressObserver$$ExternalSyntheticLambda0.onLegIndexUpdatedCallback(cancelpendingwebviewpause2.IconCompatParcelizer);
                return createfromparcel;
            } catch (Throwable th) {
                arrivalProgressObserver$$ExternalSyntheticLambda0.onLegIndexUpdatedCallback(cancelpendingwebviewpause2.IconCompatParcelizer);
                throw th;
            }
        }
        SearchShiftsWithBonusUiModelImpl searchShiftsWithBonusUiModelImpl2 = (SearchShiftsWithBonusUiModelImpl) this.L$2;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = this.label;
        if (i12 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            searchShiftsWithBonusUiModelImpl2.write.serializer(new getPayloadFromSystemPropertyFilePath(searchShiftsWithBonusUiModelImpl2.MediaMetadataCompat.IconCompatParcelizer(R.string.rid_quick_sessions_loading_description)));
            this.label = 1;
            objM5032assignyxL6bBk = searchShiftsWithBonusUiModelImpl2.RatingCompat.m5032assignyxL6bBk(this.$legIndex, ((hasAllLocationsBeenRead) obj4).ComponentActivity, (String) obj3, (String) obj2, this);
            if (objM5032assignyxL6bBk != coroutineSingletons2) {
            }
            return coroutineSingletons2;
        }
        if (i12 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM5032assignyxL6bBk = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((onItemDismiss) obj).getClass();
                return createfromparcel;
            }
            searchShiftsWithBonusUiModelImpl = (SearchShiftsWithBonusUiModelImpl) this.L$1;
            objM5032assignyxL6bBk = this.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((onItemDismiss) obj).getClass();
        }
        searchShiftsWithBonusUiModelImpl.MediaSessionCompatQueueItem.IconCompatParcelizer(onPrimaryNavigationFragmentChanged.EXPANDED);
        thSerializer = onItemDismiss.serializer(objM5032assignyxL6bBk);
        if (thSerializer == null) {
            return createfromparcel;
        }
        getQueryContext getquerycontext = searchShiftsWithBonusUiModelImpl2.write;
        strIconCompatParcelizer = ThrowableExtensionsKt.IconCompatParcelizer(thSerializer);
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strIconCompatParcelizer)) {
            strIconCompatParcelizer = searchShiftsWithBonusUiModelImpl2.MediaMetadataCompat.IconCompatParcelizer(R.string.all_error_message);
        }
        getquerycontext.serializer(new getPayloadFromFileSystem(strIconCompatParcelizer, ddefault.IconCompatParcelizer));
        fetchRiderStatusImpl = searchShiftsWithBonusUiModelImpl2.serializer;
        this.L$0 = objM5032assignyxL6bBk;
        this.L$1 = null;
        this.label = 3;
        if (fetchRiderStatusImpl.m5029invokeIoAF18A(this) != coroutineSingletons2) {
            return createfromparcel;
        }
        return coroutineSingletons2;
        if (objM5032assignyxL6bBk instanceof isItemDismissable) {
            thSerializer = onItemDismiss.serializer(objM5032assignyxL6bBk);
            if (thSerializer == null) {
                return createfromparcel;
            }
            getQueryContext getquerycontext2 = searchShiftsWithBonusUiModelImpl2.write;
            strIconCompatParcelizer = ThrowableExtensionsKt.IconCompatParcelizer(thSerializer);
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strIconCompatParcelizer)) {
                strIconCompatParcelizer = searchShiftsWithBonusUiModelImpl2.MediaMetadataCompat.IconCompatParcelizer(R.string.all_error_message);
            }
            getquerycontext2.serializer(new getPayloadFromFileSystem(strIconCompatParcelizer, ddefault.IconCompatParcelizer));
            fetchRiderStatusImpl = searchShiftsWithBonusUiModelImpl2.serializer;
            this.L$0 = objM5032assignyxL6bBk;
            this.L$1 = null;
            this.label = 3;
            if (fetchRiderStatusImpl.m5029invokeIoAF18A(this) != coroutineSingletons2) {
                return createfromparcel;
            }
        } else {
            searchShiftsWithBonusUiModelImpl2.write.serializer(new getPayloadFromFileSystem(((sendPurchaseVerificationPackageSync) objM5032assignyxL6bBk).message, ddefault.RemoteActionCompatParcelizer));
            FetchRiderStatusImpl fetchRiderStatusImpl2 = searchShiftsWithBonusUiModelImpl2.serializer;
            this.L$0 = objM5032assignyxL6bBk;
            this.L$1 = searchShiftsWithBonusUiModelImpl2;
            this.label = 2;
            if (fetchRiderStatusImpl2.m5029invokeIoAF18A(this) == coroutineSingletons2) {
                int i13 = serializer + 67;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    int i14 = 5 / 5;
                }
            } else {
                searchShiftsWithBonusUiModelImpl = searchShiftsWithBonusUiModelImpl2;
                searchShiftsWithBonusUiModelImpl.MediaSessionCompatQueueItem.IconCompatParcelizer(onPrimaryNavigationFragmentChanged.EXPANDED);
                thSerializer = onItemDismiss.serializer(objM5032assignyxL6bBk);
                if (thSerializer == null) {
                    return createfromparcel;
                }
                getQueryContext getquerycontext3 = searchShiftsWithBonusUiModelImpl2.write;
                strIconCompatParcelizer = ThrowableExtensionsKt.IconCompatParcelizer(thSerializer);
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strIconCompatParcelizer)) {
                    strIconCompatParcelizer = searchShiftsWithBonusUiModelImpl2.MediaMetadataCompat.IconCompatParcelizer(R.string.all_error_message);
                }
                getquerycontext3.serializer(new getPayloadFromFileSystem(strIconCompatParcelizer, ddefault.IconCompatParcelizer));
                fetchRiderStatusImpl = searchShiftsWithBonusUiModelImpl2.serializer;
                this.L$0 = objM5032assignyxL6bBk;
                this.L$1 = null;
                this.label = 3;
                if (fetchRiderStatusImpl.m5029invokeIoAF18A(this) != coroutineSingletons2) {
                    return createfromparcel;
                }
            }
        }
        return coroutineSingletons2;
    }
}
