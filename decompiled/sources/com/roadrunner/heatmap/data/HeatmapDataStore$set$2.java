package com.roadrunner.heatmap.data;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import coil3.compose.AsyncImagePainter$launchJob$1;
import com.deliveryhero.fwf_http.model.FwFHTTPResponse;
import com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl;
import com.foodora.courier.main.lifecycle.PermissionsLifecycleObserver;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.appmigration.presentation.AppMigrationUiModelImpl;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptMessageUiModelImpl;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptUiModelImpl;
import com.roadrunner.delivery.accept.backToBackOrder.presentation.BackToBackAutoAcceptUiModelImpl;
import com.roadrunner.delivery.accept.domain.AcceptDeliveriesUseCaseImpl;
import com.roadrunner.delivery.accept.domain.AutoAcceptEarningsUseCaseImpl;
import com.roadrunner.delivery.accept.domain.StoreAutoAcceptedDeliveryIdsImpl;
import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.errorhandler.DeliveryErrorProviderImpl;
import com.roadrunner.delivery.state.StateDataStoreImpl;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.home.bottomsheet.HomeBottomSheetUiModelImpl;
import com.roadrunner.map.container.safearea.SafeAreaPublisherImpl;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import com.roadrunner.user.properties.data.UserPropertiesDataStore;
import com.roadrunner.util.sound.DefaultForegroundSoundManager;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import o.EditingBufferCompanion;
import o.FontEj4NQ78;
import o.FontVariationSettingInt;
import o.FontVariationSettingTextUnit;
import o.GapBuffer;
import o.ISdkClickHandler;
import o.SegmentFinder;
import o.SegmentFinderCompanion;
import o.ShortNewsContentCardView;
import o.SuspendingTransacterDefaultImpls;
import o.TextGranularityCompanion;
import o.WebViewBuilderException;
import o._get_messageWebView_lambda1;
import o._get_messageWebView_lambda3;
import o.access500;
import o.accessgetMiddleEllipsiscp;
import o.accessisRenderNodeCompatiblecp;
import o.accessrequireViewFactoryHolder;
import o.backwardFocusSearch;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.checkOffsetIsValid;
import o.clearTmpDetachFlag;
import o.clipCanvasToPath;
import o.createFromFile;
import o.createFromParcel;
import o.createGraphemeClusterSegmentFinder;
import o.createQuery;
import o.decode;
import o.endFirstSessionDelay;
import o.f2ExternalSyntheticLambda4;
import o.fastMapTo;
import o.findNestedRecyclerView;
import o.getAttributionWithTimeout;
import o.getCharacterDRrd7Zo;
import o.getCompositionStartui_text;
import o.getContentViewGroupParentLayout;
import o.getCursorui_text;
import o.getDecoratedBoundsWithMarginsInt;
import o.getEndOffsetForRectWithinRun;
import o.getFailureResponseData;
import o.getGestureThresholdActivate5zf0vsI;
import o.getKeyboardTap5zf0vsI;
import o.getMultiParagraph;
import o.getNeedsDensity;
import o.getNoActiveChildannotations;
import o.getPrimaryDownstream;
import o.getQueryContext;
import o.getQueryParameterslambda2;
import o.getRangeForRect;
import o.getStartOffsetForRectWithinRun;
import o.i2;
import o.isComputingLayout;
import o.isFakeui;
import o.isIncluded;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.jumpToPositionForSmoothScroller;
import o.lineEndToVisibleEnd;
import o.mergePlatformStyle;
import o.n8;
import o.onMeasureChild;
import o.onViewCreated;
import o.packInts;
import o.performContextItemSelected;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0;
import o.r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdajRJFbIqkkFSo0J2N8n3tH4yM;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.r8lambdat1peidAd9PyU23jWJ4Oj0nfx3d4;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.resetTransientState;
import o.setTimerInterval;
import o.setTimerStart;
import o.setTransactionSuccessful;
import o.sourceInformationContextOfdefault;
import o.subscribeToBannersUpdateslambda30;
import o.toAnnotatedStringui_text;
import o.toBitmapConfig1JJdX4A;
import o.toStringForLog;
import o.toVariationSettings;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class HeatmapDataStore$set$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int serializer;
    public final /* synthetic */ Object IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeatmapDataStore$set$2(SuspendingTransacterDefaultImpls suspendingTransacterDefaultImpls, String str, Map map, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.RemoteActionCompatParcelizer = suspendingTransacterDefaultImpls;
        this.read = str;
        this.IconCompatParcelizer = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeatmapDataStore$set$2(Object obj, Object obj2, Object obj3, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = obj2;
        this.read = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeatmapDataStore$set$2(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.IconCompatParcelizer = obj;
        this.read = obj2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 11;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        switch (i3) {
            case 0:
                ((HeatmapDataStore$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
                return createfromparcel2;
            case 1:
                ((HeatmapDataStore$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
                int i4 = MediaMetadataCompat + 103;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 87 / 0;
                }
                return createfromparcel2;
            case 2:
                return ((HeatmapDataStore$set$2) create((getNoActiveChildannotations) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 3:
                ((HeatmapDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
                return createfromparcel2;
            case 4:
                ((HeatmapDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
                return createfromparcel2;
            case 5:
                ((HeatmapDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
                return createfromparcel2;
            case 6:
                ((HeatmapDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
                return createfromparcel2;
            case 7:
                ((HeatmapDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
                return createfromparcel2;
            case 8:
                ((HeatmapDataStore$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
                return createfromparcel2;
            case 9:
                return ((HeatmapDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 10:
                ((HeatmapDataStore$set$2) create((getFailureResponseData) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
                return createfromparcel2;
            default:
                ((HeatmapDataStore$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
                return createfromparcel2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028 A[PHI: r3 r4
  0x0028: PHI (r3v17 java.lang.Object) = (r3v0 java.lang.Object), (r3v19 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r4v18 java.lang.Object) = (r4v0 java.lang.Object), (r4v20 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0036 A[PHI: r3 r4
  0x0036: PHI (r3v16 java.lang.Object) = (r3v0 java.lang.Object), (r3v19 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0036: PHI (r4v17 java.lang.Object) = (r4v0 java.lang.Object), (r4v20 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x004b A[PHI: r3 r4
  0x004b: PHI (r3v14 java.lang.Object) = (r3v0 java.lang.Object), (r3v19 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x004b: PHI (r4v15 java.lang.Object) = (r4v0 java.lang.Object), (r4v20 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[PHI: r3 r4
  0x0059: PHI (r3v13 java.lang.Object) = (r3v0 java.lang.Object), (r3v19 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0059: PHI (r4v14 java.lang.Object) = (r4v0 java.lang.Object), (r4v20 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0078  */
    /* JADX WARN: Code duplicated, block: B:21:0x007d A[PHI: r3 r4
  0x007d: PHI (r3v12 java.lang.Object) = (r3v0 java.lang.Object), (r3v19 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x007d: PHI (r4v13 java.lang.Object) = (r4v0 java.lang.Object), (r4v20 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0091 A[PHI: r3 r4
  0x0091: PHI (r3v11 java.lang.Object) = (r3v0 java.lang.Object), (r3v19 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0091: PHI (r4v12 java.lang.Object) = (r4v0 java.lang.Object), (r4v20 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5 A[PHI: r3 r4
  0x00a5: PHI (r3v10 java.lang.Object) = (r3v0 java.lang.Object), (r3v19 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r4v11 java.lang.Object) = (r4v0 java.lang.Object), (r4v20 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9 A[PHI: r3 r4
  0x00b9: PHI (r3v8 java.lang.Object) = (r3v0 java.lang.Object), (r3v19 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x00b9: PHI (r4v9 java.lang.Object) = (r4v0 java.lang.Object), (r4v20 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c6 A[PHI: r3 r4
  0x00c6: PHI (r3v6 java.lang.Object) = (r3v0 java.lang.Object), (r3v19 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x00c6: PHI (r4v7 java.lang.Object) = (r4v0 java.lang.Object), (r4v20 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d2 A[PHI: r3 r4
  0x00d2: PHI (r3v5 java.lang.Object) = (r3v0 java.lang.Object), (r3v19 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x00d2: PHI (r4v5 java.lang.Object) = (r4v0 java.lang.Object), (r4v20 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00dd A[PHI: r3 r4
  0x00dd: PHI (r3v3 java.lang.Object) = (r3v0 java.lang.Object), (r3v19 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x00dd: PHI (r4v3 java.lang.Object) = (r4v0 java.lang.Object), (r4v20 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e9 A[PHI: r3 r4
  0x00e9: PHI (r3v1 java.lang.Object) = (r3v0 java.lang.Object), (r3v19 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r4v1 java.lang.Object) = (r4v0 java.lang.Object), (r4v20 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        Object obj2;
        Object obj3;
        HeatmapDataStore$set$2 heatmapDataStore$set$2;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = serializer + 65;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = 0;
        if (i4 % 2 != 0) {
            int i6 = this.write;
            obj2 = this.read;
            obj3 = this.IconCompatParcelizer;
            switch (i6) {
                case 0:
                    HeatmapDataStore$set$2 heatmapDataStore$set$3 = new HeatmapDataStore$set$2((isRoot) obj3, (String) obj2, shortNewsContentCardView, i5);
                    heatmapDataStore$set$3.RemoteActionCompatParcelizer = obj;
                    return heatmapDataStore$set$3;
                case 1:
                    HeatmapDataStore$set$2 heatmapDataStore$set$4 = new HeatmapDataStore$set$2((isRoot) obj3, obj2, shortNewsContentCardView, 1);
                    heatmapDataStore$set$4.RemoteActionCompatParcelizer = obj;
                    return heatmapDataStore$set$4;
                case 2:
                    HeatmapDataStore$set$2 heatmapDataStore$set$5 = new HeatmapDataStore$set$2((StateDataStoreImpl) obj3, (String) obj2, shortNewsContentCardView, i2);
                    heatmapDataStore$set$5.RemoteActionCompatParcelizer = obj;
                    return heatmapDataStore$set$5;
                case 3:
                    HeatmapDataStore$set$2 heatmapDataStore$set$6 = new HeatmapDataStore$set$2((performContextItemSelected) obj3, (HomeBottomSheetUiModelImpl) obj2, shortNewsContentCardView, 3);
                    heatmapDataStore$set$6.RemoteActionCompatParcelizer = obj;
                    return heatmapDataStore$set$6;
                case 4:
                    return new HeatmapDataStore$set$2((access500) this.RemoteActionCompatParcelizer, (getContentViewGroupParentLayout) obj3, (getDecoratedBoundsWithMarginsInt) obj2, shortNewsContentCardView, 4);
                case 5:
                    return new HeatmapDataStore$set$2((CreateHomeScope) this.RemoteActionCompatParcelizer, (getContentViewGroupParentLayout) obj3, (isComputingLayout) obj2, shortNewsContentCardView, 5);
                case 6:
                    return new HeatmapDataStore$set$2((SuspendingTransacterDefaultImpls) this.RemoteActionCompatParcelizer, (String) obj2, (Map) obj3, shortNewsContentCardView, 6);
                case 7:
                    heatmapDataStore$set$2 = new HeatmapDataStore$set$2((SuspendingTransacterDefaultImpls) this.RemoteActionCompatParcelizer, (String) obj2, (Map) obj3, shortNewsContentCardView, 7);
                    i = serializer + 9;
                    MediaMetadataCompat = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        return heatmapDataStore$set$2;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                case 8:
                    HeatmapDataStore$set$2 heatmapDataStore$set$7 = new HeatmapDataStore$set$2((endFirstSessionDelay) obj3, (Map) obj2, shortNewsContentCardView, 8);
                    heatmapDataStore$set$7.RemoteActionCompatParcelizer = obj;
                    return heatmapDataStore$set$7;
                case 9:
                    return new HeatmapDataStore$set$2((r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0) this.RemoteActionCompatParcelizer, (r8lambday113fDFTSR5e4PZj6XsSXLtpL60) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, 9);
                case 10:
                    HeatmapDataStore$set$2 heatmapDataStore$set$8 = new HeatmapDataStore$set$2((PermissionsLifecycleObserver) obj3, (accessisRenderNodeCompatiblecp) obj2, shortNewsContentCardView, 10);
                    heatmapDataStore$set$8.RemoteActionCompatParcelizer = obj;
                    return heatmapDataStore$set$8;
                default:
                    HeatmapDataStore$set$2 heatmapDataStore$set$9 = new HeatmapDataStore$set$2((UserPropertiesDataStore) obj3, (subscribeToBannersUpdateslambda30) obj2, shortNewsContentCardView, 11);
                    heatmapDataStore$set$9.RemoteActionCompatParcelizer = obj;
                    int i7 = MediaMetadataCompat + 9;
                    serializer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return heatmapDataStore$set$9;
            }
        }
        int i9 = this.write;
        obj2 = this.read;
        obj3 = this.IconCompatParcelizer;
        int i10 = 12 / 0;
        switch (i9) {
            case 0:
                HeatmapDataStore$set$2 heatmapDataStore$set$10 = new HeatmapDataStore$set$2((isRoot) obj3, (String) obj2, shortNewsContentCardView, i5);
                heatmapDataStore$set$10.RemoteActionCompatParcelizer = obj;
                return heatmapDataStore$set$10;
            case 1:
                HeatmapDataStore$set$2 heatmapDataStore$set$11 = new HeatmapDataStore$set$2((isRoot) obj3, obj2, shortNewsContentCardView, 1);
                heatmapDataStore$set$11.RemoteActionCompatParcelizer = obj;
                return heatmapDataStore$set$11;
            case 2:
                HeatmapDataStore$set$2 heatmapDataStore$set$12 = new HeatmapDataStore$set$2((StateDataStoreImpl) obj3, (String) obj2, shortNewsContentCardView, i2);
                heatmapDataStore$set$12.RemoteActionCompatParcelizer = obj;
                return heatmapDataStore$set$12;
            case 3:
                HeatmapDataStore$set$2 heatmapDataStore$set$13 = new HeatmapDataStore$set$2((performContextItemSelected) obj3, (HomeBottomSheetUiModelImpl) obj2, shortNewsContentCardView, 3);
                heatmapDataStore$set$13.RemoteActionCompatParcelizer = obj;
                return heatmapDataStore$set$13;
            case 4:
                return new HeatmapDataStore$set$2((access500) this.RemoteActionCompatParcelizer, (getContentViewGroupParentLayout) obj3, (getDecoratedBoundsWithMarginsInt) obj2, shortNewsContentCardView, 4);
            case 5:
                return new HeatmapDataStore$set$2((CreateHomeScope) this.RemoteActionCompatParcelizer, (getContentViewGroupParentLayout) obj3, (isComputingLayout) obj2, shortNewsContentCardView, 5);
            case 6:
                return new HeatmapDataStore$set$2((SuspendingTransacterDefaultImpls) this.RemoteActionCompatParcelizer, (String) obj2, (Map) obj3, shortNewsContentCardView, 6);
            case 7:
                heatmapDataStore$set$2 = new HeatmapDataStore$set$2((SuspendingTransacterDefaultImpls) this.RemoteActionCompatParcelizer, (String) obj2, (Map) obj3, shortNewsContentCardView, 7);
                i = serializer + 9;
                MediaMetadataCompat = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    return heatmapDataStore$set$2;
                }
                Object obj5 = null;
                obj5.hashCode();
                throw null;
            case 8:
                HeatmapDataStore$set$2 heatmapDataStore$set$14 = new HeatmapDataStore$set$2((endFirstSessionDelay) obj3, (Map) obj2, shortNewsContentCardView, 8);
                heatmapDataStore$set$14.RemoteActionCompatParcelizer = obj;
                return heatmapDataStore$set$14;
            case 9:
                return new HeatmapDataStore$set$2((r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0) this.RemoteActionCompatParcelizer, (r8lambday113fDFTSR5e4PZj6XsSXLtpL60) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, 9);
            case 10:
                HeatmapDataStore$set$2 heatmapDataStore$set$15 = new HeatmapDataStore$set$2((PermissionsLifecycleObserver) obj3, (accessisRenderNodeCompatiblecp) obj2, shortNewsContentCardView, 10);
                heatmapDataStore$set$15.RemoteActionCompatParcelizer = obj;
                return heatmapDataStore$set$15;
            default:
                HeatmapDataStore$set$2 heatmapDataStore$set$16 = new HeatmapDataStore$set$2((UserPropertiesDataStore) obj3, (subscribeToBannersUpdateslambda30) obj2, shortNewsContentCardView, 11);
                heatmapDataStore$set$16.RemoteActionCompatParcelizer = obj;
                int i11 = MediaMetadataCompat + 9;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return heatmapDataStore$set$16;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.read;
        Object obj3 = this.IconCompatParcelizer;
        switch (i2) {
            case 0:
                backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch.write((isRoot) obj3, (String) obj2);
                return createfromparcel;
            case 1:
                backwardFocusSearch backwardfocussearch2 = (backwardFocusSearch) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch2.getClass();
                backwardfocussearch2.serializer((isRoot) obj3, obj2);
                return createfromparcel;
            case 2:
                getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardFocusSearch backwardfocussearchIconCompatParcelizer = getnoactivechildannotations.IconCompatParcelizer();
                StateDataStoreImpl stateDataStoreImpl = (StateDataStoreImpl) obj3;
                backwardfocussearchIconCompatParcelizer.write(stateDataStoreImpl.read, (String) obj2);
                isRoot isroot = stateDataStoreImpl.RemoteActionCompatParcelizer;
                Integer num = (Integer) getnoactivechildannotations.serializer(isroot);
                if (num == null) {
                    backwardfocussearchIconCompatParcelizer.serializer(isroot, new Integer(0));
                } else {
                    backwardfocussearchIconCompatParcelizer.serializer(isroot, new Integer(num.intValue() + 1));
                }
                return backwardfocussearchIconCompatParcelizer;
            case 3:
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl = (HomeBottomSheetUiModelImpl) obj2;
                Iterator<E> it = ((performContextItemSelected) obj3).serializer.iterator();
                while (it.hasNext()) {
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new HeatmapMapLayerUiModelImpl$1((onViewCreated) it.next(), homeBottomSheetUiModelImpl, null, 21), 3);
                }
                return createfromparcel;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                access500 access500Var = (access500) this.RemoteActionCompatParcelizer;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = (getContentViewGroupParentLayout) obj3;
                getcontentviewgroupparentlayout2.getClass();
                ProtobufEncoder protobufEncoder = ((toVariationSettings) access500Var.RatingCompat).serializer;
                getQueryContext getquerycontext = new getQueryContext();
                Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.write).write();
                objWrite.getClass();
                accessrequireViewFactoryHolder accessrequireviewfactoryholder = (accessrequireViewFactoryHolder) objWrite;
                Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.serializer).write();
                objWrite2.getClass();
                Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.RemoteActionCompatParcelizer).write();
                objWrite3.getClass();
                createFromFile createfromfile = new createFromFile(getcontentviewgroupparentlayout2, getquerycontext, accessrequireviewfactoryholder, (DeliveryErrorProviderImpl) objWrite2, (setTransactionSuccessful) objWrite3);
                i2 i2Var = ((TextGranularityCompanion) access500Var.serializer).write;
                getQueryContext getquerycontext2 = new getQueryContext();
                Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.MediaDescriptionCompat).write();
                objWrite4.getClass();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite4;
                Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.MediaBrowserCompatMediaItem).write();
                objWrite5.getClass();
                r8lambdat1peidAd9PyU23jWJ4Oj0nfx3d4 r8lambdat1peidad9pyu23jwj4oj0nfx3d4 = (r8lambdat1peidAd9PyU23jWJ4Oj0nfx3d4) objWrite5;
                Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.write).write();
                objWrite6.getClass();
                AcceptDeliveriesUseCaseImpl acceptDeliveriesUseCaseImpl = (AcceptDeliveriesUseCaseImpl) objWrite6;
                Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.MediaMetadataCompat).write();
                objWrite7.getClass();
                FontVariationSettingTextUnit fontVariationSettingTextUnit = (FontVariationSettingTextUnit) objWrite7;
                Object objWrite8 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.serializer).write();
                objWrite8.getClass();
                UpdateStateUseCaseImpl updateStateUseCaseImpl = (UpdateStateUseCaseImpl) objWrite8;
                Object objWrite9 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.ParcelableVolumeInfo).write();
                objWrite9.getClass();
                DeliveryAcceptanceLogger deliveryAcceptanceLogger = (DeliveryAcceptanceLogger) objWrite9;
                Object objWrite10 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.MediaSessionCompatResultReceiverWrapper).write();
                objWrite10.getClass();
                DefaultForegroundSoundManager defaultForegroundSoundManager = (DefaultForegroundSoundManager) objWrite10;
                Object objWrite11 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.RemoteActionCompatParcelizer).write();
                objWrite11.getClass();
                getKeyboardTap5zf0vsI getkeyboardtap5zf0vsi = (getKeyboardTap5zf0vsI) objWrite11;
                Object objWrite12 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.IconCompatParcelizer).write();
                objWrite12.getClass();
                getNeedsDensity getneedsdensity = (getNeedsDensity) objWrite12;
                Object objWrite13 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.MediaSessionCompatQueueItem).write();
                objWrite13.getClass();
                StoreAutoAcceptedDeliveryIdsImpl storeAutoAcceptedDeliveryIdsImpl = (StoreAutoAcceptedDeliveryIdsImpl) objWrite13;
                createQuery createquery = (createQuery) ((lineEndToVisibleEnd) i2Var.PlaybackStateCompat).write();
                Object objWrite14 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.RatingCompat).write();
                objWrite14.getClass();
                clearTmpDetachFlag cleartmpdetachflag = (clearTmpDetachFlag) objWrite14;
                Object objWrite15 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.read).write();
                objWrite15.getClass();
                Object objWrite16 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.PlaybackStateCompatCustomAction).write();
                objWrite16.getClass();
                DeliveryAutoAcceptUiModelImpl deliveryAutoAcceptUiModelImpl = new DeliveryAutoAcceptUiModelImpl(getcontentviewgroupparentlayout2, getquerycontext2, settransactionsuccessful, r8lambdat1peidad9pyu23jwj4oj0nfx3d4, acceptDeliveriesUseCaseImpl, fontVariationSettingTextUnit, updateStateUseCaseImpl, deliveryAcceptanceLogger, defaultForegroundSoundManager, getkeyboardtap5zf0vsi, getneedsdensity, storeAutoAcceptedDeliveryIdsImpl, createquery, cleartmpdetachflag, (WebViewBuilderException) objWrite15, (DeliveryErrorProviderImpl) objWrite16);
                n8 n8Var = ((setTimerInterval) access500Var.MediaDescriptionCompat).RemoteActionCompatParcelizer;
                getQueryContext getquerycontext3 = new getQueryContext();
                Object objWrite17 = n8Var.read.write();
                objWrite17.getClass();
                setTimerStart settimerstart = new setTimerStart(getquerycontext3, (ISdkClickHandler) objWrite17, getcontentviewgroupparentlayout2);
                access500 access500Var2 = ((getCharacterDRrd7Zo) access500Var.IconCompatParcelizer).write;
                Object objWrite18 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) access500Var2.RatingCompat).write();
                objWrite18.getClass();
                packInts packints = (packInts) objWrite18;
                Object objWrite19 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) access500Var2.serializer).write();
                objWrite19.getClass();
                getPrimaryDownstream getprimarydownstream = (getPrimaryDownstream) objWrite19;
                Object objWrite20 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) access500Var2.IconCompatParcelizer).write();
                objWrite20.getClass();
                setTransactionSuccessful settransactionsuccessful2 = (setTransactionSuccessful) objWrite20;
                Object objWrite21 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) access500Var2.MediaDescriptionCompat).write();
                objWrite21.getClass();
                AutoAcceptEarningsUseCaseImpl autoAcceptEarningsUseCaseImpl = (AutoAcceptEarningsUseCaseImpl) objWrite21;
                Object objWrite22 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) access500Var2.write).write();
                objWrite22.getClass();
                r8lambdajRJFbIqkkFSo0J2N8n3tH4yM r8lambdajrjfbiqkkfso0j2n8n3th4ym = (r8lambdajRJFbIqkkFSo0J2N8n3tH4yM) objWrite22;
                Object objWrite23 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) access500Var2.MediaSessionCompatQueueItem).write();
                objWrite23.getClass();
                isIncluded isincluded = (isIncluded) objWrite23;
                zzz zzzVar = (zzz) ((lineEndToVisibleEnd) access500Var2.read).write();
                Object objWrite24 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) access500Var2.MediaMetadataCompat).write();
                objWrite24.getClass();
                Object objWrite25 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) access500Var2.RemoteActionCompatParcelizer).write();
                objWrite25.getClass();
                DeliveryAutoAcceptMessageUiModelImpl deliveryAutoAcceptMessageUiModelImpl = new DeliveryAutoAcceptMessageUiModelImpl(getcontentviewgroupparentlayout2, packints, getprimarydownstream, settransactionsuccessful2, autoAcceptEarningsUseCaseImpl, r8lambdajrjfbiqkkfso0j2n8n3th4ym, isincluded, zzzVar, (FontEj4NQ78) objWrite24, (DeliveryAcceptanceLogger) objWrite25);
                MapDelegateProviderImpl mapDelegateProviderImpl = ((toAnnotatedStringui_text) access500Var.write).write;
                Object objWrite26 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapboxMap).write();
                objWrite26.getClass();
                Object objWrite27 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapCameraManagerDelegate).write();
                objWrite27.getClass();
                Object objWrite28 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapProjectionDelegate).write();
                objWrite28.getClass();
                Object objWrite29 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapTransformDelegate).write();
                objWrite29.getClass();
                Object objWrite30 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapListenerDelegate).write();
                objWrite30.getClass();
                CustomerChatCommunicatorImpl customerChatCommunicatorImpl = (CustomerChatCommunicatorImpl) objWrite30;
                Object objWrite31 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapStyleManagerDelegate).write();
                objWrite31.getClass();
                CustomerChatProviderImpl customerChatProviderImpl = (CustomerChatProviderImpl) objWrite31;
                Object objWrite32 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapInteractionDelegate).write();
                objWrite32.getClass();
                getGestureThresholdActivate5zf0vsI getgesturethresholdactivate5zf0vsi = (getGestureThresholdActivate5zf0vsI) objWrite32;
                Object objWrite33 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapAttributionDelegate$delegate).write();
                objWrite33.getClass();
                toStringForLog tostringforlog = (toStringForLog) objWrite33;
                InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = (InitializeAppStartupItemsImpl) ((onMeasureChild) mapDelegateProviderImpl.mapPluginProviderDelegate).write();
                Object objWrite34 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.indoorManager).write();
                objWrite34.getClass();
                EditingBufferCompanion editingBufferCompanion = new EditingBufferCompanion((getCursorui_text) objWrite26, (getCompositionStartui_text) objWrite27, (GapBuffer) objWrite28, (mergePlatformStyle) objWrite29, customerChatCommunicatorImpl, customerChatProviderImpl, getgesturethresholdactivate5zf0vsi, tostringforlog, initializeAppStartupItemsImpl, (transferSessionPackageI) objWrite34, getcontentviewgroupparentlayout2);
                InitializeAppStartupItemsImpl initializeAppStartupItemsImpl2 = ((SegmentFinderCompanion) access500Var.MediaSessionCompatQueueItem).IconCompatParcelizer;
                accessgetMiddleEllipsiscp accessgetmiddleellipsiscp = (accessgetMiddleEllipsiscp) ((FontVariationSettingInt) initializeAppStartupItemsImpl2.IconCompatParcelizer).write();
                Object objWrite35 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) initializeAppStartupItemsImpl2.serializer).write();
                objWrite35.getClass();
                SegmentFinder segmentFinder = new SegmentFinder(accessgetmiddleellipsiscp, (createGraphemeClusterSegmentFinder) objWrite35, getcontentviewgroupparentlayout2);
                ComponentRegistry$Builder componentRegistry$Builder = ((getMultiParagraph) access500Var.read).RemoteActionCompatParcelizer;
                Object objWrite36 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) componentRegistry$Builder.write).write();
                objWrite36.getClass();
                setTransactionSuccessful settransactionsuccessful3 = (setTransactionSuccessful) objWrite36;
                getQueryContext getquerycontext4 = new getQueryContext();
                Object objWrite37 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) componentRegistry$Builder.read).write();
                objWrite37.getClass();
                r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84 r8lambdakluglsifrlmial3gbmulfwcpk84 = (r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84) objWrite37;
                ProtobufEncoder protobufEncoder2 = (ProtobufEncoder) ((ShouldShowHeatmap_Factory) componentRegistry$Builder.RemoteActionCompatParcelizer).write();
                Object objWrite38 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) componentRegistry$Builder.IconCompatParcelizer).write();
                objWrite38.getClass();
                Object objWrite39 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) componentRegistry$Builder.serializer).write();
                objWrite39.getClass();
                BackToBackAutoAcceptUiModelImpl backToBackAutoAcceptUiModelImpl = new BackToBackAutoAcceptUiModelImpl(getcontentviewgroupparentlayout2, settransactionsuccessful3, getquerycontext4, r8lambdakluglsifrlmial3gbmulfwcpk84, protobufEncoder2, (WebViewBuilderException) objWrite38, (DeliveryErrorProviderImpl) objWrite39);
                checkOffsetIsValid checkoffsetisvalid = ((getStartOffsetForRectWithinRun) access500Var.MediaMetadataCompat).RemoteActionCompatParcelizer;
                Object objWrite40 = checkoffsetisvalid.serializer.write();
                objWrite40.getClass();
                Object objWrite41 = checkoffsetisvalid.write.write();
                objWrite41.getClass();
                Object objWrite42 = checkoffsetisvalid.IconCompatParcelizer.write();
                objWrite42.getClass();
                Object objWrite43 = checkoffsetisvalid.RemoteActionCompatParcelizer.write();
                objWrite43.getClass();
                getEndOffsetForRectWithinRun getendoffsetforrectwithinrun = new getEndOffsetForRectWithinRun((getRangeForRect) objWrite40, (LastStopSelectionCoordinator) objWrite41, (f2ExternalSyntheticLambda4) objWrite42, (SafeAreaPublisherImpl) objWrite43, getcontentviewgroupparentlayout2);
                isFakeui isfakeui = (isFakeui) access500Var.RemoteActionCompatParcelizer;
                List list = SQLite.read(createfromfile, deliveryAutoAcceptUiModelImpl, settimerstart, deliveryAutoAcceptMessageUiModelImpl, editingBufferCompanion, segmentFinder, backToBackAutoAcceptUiModelImpl, getendoffsetforrectwithinrun, new AppMigrationUiModelImpl(getcontentviewgroupparentlayout2, isfakeui.read, isfakeui.write, isfakeui.serializer));
                getDecoratedBoundsWithMarginsInt getdecoratedboundswithmarginsint = (getDecoratedBoundsWithMarginsInt) obj2;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new AsyncImagePainter$launchJob$1((findNestedRecyclerView) it2.next(), getdecoratedboundswithmarginsint, list, null, 19), 3);
                }
                return createfromparcel;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                CreateHomeScope createHomeScope = (CreateHomeScope) this.RemoteActionCompatParcelizer;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout3 = (getContentViewGroupParentLayout) obj3;
                getcontentviewgroupparentlayout3.getClass();
                List list2 = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{((fastMapTo) createHomeScope.read).read(getcontentviewgroupparentlayout3, false)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                isComputingLayout iscomputinglayout = (isComputingLayout) obj2;
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, null, new AsyncImagePainter$launchJob$1((jumpToPositionForSmoothScroller) it3.next(), iscomputinglayout, list2, null, 20), 3);
                }
                int i3 = serializer + 39;
                MediaMetadataCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return createfromparcel;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                String str = (String) obj2;
                Map map = (Map) obj3;
                Iterator it4 = ((Set) ((SuspendingTransacterDefaultImpls) this.RemoteActionCompatParcelizer).write).iterator();
                while (it4.hasNext()) {
                    ((decode) it4.next()).logEvent(str, map);
                }
                return createfromparcel;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                String str2 = (String) obj2;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                Iterator it5 = ((Set) ((SuspendingTransacterDefaultImpls) this.RemoteActionCompatParcelizer).write).iterator();
                while (it5.hasNext()) {
                    ((decode) it5.next()).IconCompatParcelizer(str2, linkedHashMap);
                }
                return createfromparcel;
            case 8:
                backwardFocusSearch backwardfocussearch3 = (backwardFocusSearch) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                isRoot isroot2 = endFirstSessionDelay.serializer;
                resetTransientState resettransientstate = (resetTransientState) ((endFirstSessionDelay) obj3).write.MediaSessionCompatResultReceiverWrapper();
                resettransientstate.getClass();
                backwardfocussearch3.write(isroot2, resettransientstate.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, getAttributionWithTimeout.Companion.serializer()), (Map) obj2));
                return createfromparcel;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                try {
                    _get_messageWebView_lambda1 _get_messagewebview_lambda1Execute = FirebasePerfOkHttpClient.execute(new clipCanvasToPath((r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0) this.RemoteActionCompatParcelizer, (r8lambday113fDFTSR5e4PZj6XsSXLtpL60) obj3, false));
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
                    try {
                        int i5 = _get_messagewebview_lambda1Execute.code;
                        String str3 = _get_messagewebview_lambda1Execute.message;
                        _get_messageWebView_lambda3 _get_messagewebview_lambda3 = _get_messagewebview_lambda1Execute.body;
                        FwFHTTPResponse fwFHTTPResponse = new FwFHTTPResponse(i5, str3, _get_messagewebview_lambda3 != null ? r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(_get_messagewebview_lambda3) : null);
                        _get_messagewebview_lambda1Execute.close();
                        return fwFHTTPResponse;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{_get_messagewebview_lambda1Execute, th}, sourceInformationContextOfdefault.read());
                            throw th2;
                        }
                    }
                } catch (IOException e) {
                    return new FwFHTTPResponse(-1, e.getMessage(), null, 4, null);
                } catch (IllegalStateException e2) {
                    return new FwFHTTPResponse(-1, e2.getMessage(), null, 4, null);
                }
            case 10:
                getFailureResponseData getfailureresponsedata = (getFailureResponseData) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                PermissionsLifecycleObserver permissionsLifecycleObserver = (PermissionsLifecycleObserver) obj3;
                if (((Set) permissionsLifecycleObserver.serializer).contains(getfailureresponsedata.RemoteActionCompatParcelizer)) {
                    accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) obj2;
                    long j = getfailureresponsedata.write;
                    r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = (r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) permissionsLifecycleObserver.IconCompatParcelizer;
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    }
                    permissionsLifecycleObserver.IconCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new PerseusUserLocalDataStoreImpl.AnonymousClass2(permissionsLifecycleObserver, j, null), 3);
                } else {
                    r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = (r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) permissionsLifecycleObserver.IconCompatParcelizer;
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                        int i6 = serializer + 109;
                        MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 == 0) {
                            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                            int i7 = 7 / 0;
                        } else {
                            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                        }
                    }
                    permissionsLifecycleObserver.IconCompatParcelizer = null;
                }
                return createfromparcel;
            default:
                backwardFocusSearch backwardfocussearch4 = (backwardFocusSearch) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                isRoot isroot3 = ((UserPropertiesDataStore) obj3).read;
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                backwardfocussearch4.write(isroot3, isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(subscribeToBannersUpdateslambda30.Companion.serializer(), (subscribeToBannersUpdateslambda30) obj2));
                return createfromparcel;
        }
    }
}
