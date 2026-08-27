package com.deliveryhero.perseus.logger;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.net.Uri;
import android.os.ParcelUuid;
import androidx.compose.ui.graphics.Fields;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import androidx.room.Room;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.selfServiceChat.ui.WebChatViewmodel;
import com.foodora.courier.app.application.CourierApplication;
import com.foodora.courier.push.messages.domain.HandlePushMessageUseCase;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.accounts.BillingController$onExternalRouteSet$newWaypoints$1;
import com.mapbox.navigation.core.internal.RouteProgressData;
import com.mapbox.navigation.core.routerefresh.RouteRefresher;
import com.mapbox.navigation.ui.base.util.MapboxNavigationConsumer;
import com.mapbox.navigation.ui.maps.building.BuildingAction$QueryBuilding;
import com.mapbox.navigation.ui.maps.route.line.RouteLineHistoryRecordingPusher;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.customerchat.selfservice.data.remote.HelpCenterRemoteDataSourceImpl;
import com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl;
import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel;
import com.roadrunner.delivery.accept.laststop.presentation.LastStopOptionUiModelImpl;
import com.roadrunner.delivery.ontheway.navigation.presentation.NavigationButtonUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.bluetoothscanning.BleScanningLifecycleObserverImpl;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$4;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.home.nest.NestFragment$onCreateView$1$1$1$1;
import com.roadrunner.home.nest.NestLoadingServiceImpl$special$$inlined$map$1;
import com.roadrunner.location.core.domain.ObserveDistanceToLocationUseCaseImpl;
import com.roadrunner.location.core.domain.ObserveIsWithinGeofenceUseCaseImpl$invoke$$inlined$map$1;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import com.sentiance.core.model.events.H$b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import o.AnimationSearchSearch;
import o.BoringLayoutFactory33ExternalSyntheticApiModelOutline0;
import o.DialogLayoutContent4;
import o.EditingBufferCompanion;
import o.FocusTargetInteropElement;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.LinkAnnotationClickable;
import o.ShortNewsContentCardView;
import o.TextMeasurerKt;
import o.VectorPainter;
import o.accessgetInstancedelegatecp;
import o.accessisRenderNodeCompatiblecp;
import o.attach;
import o.createFromParcel;
import o.endI;
import o.ensureSubscribedToInAppMessageEvents;
import o.getAnimated;
import o.getClipgIe3tQ8;
import o.getCompared;
import o.getContentViewGroupParentLayout;
import o.getGlobalChangeEntries;
import o.getHasStaleResolvedFonts;
import o.getLineEllipsisCountui_text;
import o.getLinearity4e0Vf04ui_text;
import o.getMBufferStateui_text;
import o.getMinDebounceDeadline;
import o.getNone4e0Vf04;
import o.getSpanVerticalAligndo9XGg;
import o.getStyles;
import o.getY2;
import o.inCompatibilityMode;
import o.isInsideContent;
import o.isRoot;
import o.obtainSizePxVpY3zN4;
import o.onViewAttachedToWindowlambda0;
import o.onViewCreated;
import o.pathNodesFromArgs;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda0dL3NwAAnESqa66IBFAXKvH5HU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setDrawStyle;
import o.swap;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class PerseusLogger$w$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public Object IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerseusLogger$w$1(getLinearity4e0Vf04ui_text getlinearity4e0vf04ui_text, String str, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 24;
        this.serializer = getlinearity4e0vf04ui_text;
        this.RemoteActionCompatParcelizer = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerseusLogger$w$1(LastStopOptionUiModelImpl lastStopOptionUiModelImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 21;
        this.RemoteActionCompatParcelizer = lastStopOptionUiModelImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PerseusLogger$w$1(Object obj, Object obj2, Object obj3, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.serializer = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PerseusLogger$w$1(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PerseusLogger$w$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.serializer = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerseusLogger$w$1(ShortNewsContentCardView shortNewsContentCardView, WebChatViewmodel webChatViewmodel, String str) {
        super(2, shortNewsContentCardView);
        this.read = 3;
        this.serializer = webChatViewmodel;
        this.RemoteActionCompatParcelizer = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerseusLogger$w$1(ShortNewsContentCardView shortNewsContentCardView, WebChatViewModel webChatViewModel, Uri uri) {
        super(2, shortNewsContentCardView);
        this.read = 17;
        this.RemoteActionCompatParcelizer = webChatViewModel;
        this.serializer = uri;
    }

    private final Object invokeSuspend$com$roadrunner$delivery$pickupdropoff$bluetoothscanning$BleScanningLifecycleObserverImpl$onCreate$1$1$2$2$3$1(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 1;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj2.hashCode();
            throw null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        if (i3 != 0) {
            if (i3 == 1) {
                int i4 = MediaMetadataCompat + 125;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel2;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i6 = MediaMetadataCompat + 75;
            MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl = (BleScanningLifecycleObserverImpl) this.IconCompatParcelizer;
        isInsideContent isinsidecontent = (isInsideContent) this.RemoteActionCompatParcelizer;
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) this.serializer;
        this.write = 1;
        ((inCompatibilityMode) bleScanningLifecycleObserverImpl.MediaBrowserCompatMediaItem).getClass();
        Object objWithContext = BuildersKt.withContext(prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, new NavHostKt$NavHost$29$1(bleScanningLifecycleObserverImpl, isinsidecontent, accessisrendernodecompatiblecp, null, 25), this);
        if (objWithContext == coroutineSingletons2) {
            int i8 = MediaMetadataCompat + 27;
            MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 5 % 5;
            }
        } else {
            objWithContext = createfromparcel2;
        }
        return objWithContext == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel2;
    }

    private final Object invokeSuspend$com$roadrunner$delivery$pickupdropoff$tasks$customerunavailable$data$UseCaseUtilsKt$validateAndExecuteMultipleApiCalls$2(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 115;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i4 != 0) {
            int i5 = MediaMetadataCompat + 59;
            int i6 = i5 % Fields.SpotShadowColor;
            MediaDescriptionCompat = i6;
            int i7 = i5 % 2;
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = i6 + 45;
            MediaMetadataCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        List list = (List) this.RemoteActionCompatParcelizer;
        NestFragment$onCreateView$1$1$1$1 nestFragment$onCreateView$1$1$1$1 = (NestFragment$onCreateView$1$1$1$1) this.serializer;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(BuildersKt.IconCompatParcelizer(getcontentviewgroupparentlayout, null, null, new QrCodeScanTaskUiModelImpl$1((AnimationSearchSearch) it.next(), nestFragment$onCreateView$1$1$1$1, shortNewsContentCardView, 7), 3));
        }
        this.IconCompatParcelizer = null;
        this.write = 1;
        Object objAwaitAll = JobKt.awaitAll(arrayList, this);
        if (objAwaitAll == coroutineSingletons) {
            return coroutineSingletons;
        }
        int i10 = MediaMetadataCompat + 59;
        MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return objAwaitAll;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    private final Object invokeSuspend$com$roadrunner$delivery$pickupdropoff$bluetoothscanning$domain$ObserveRiderNearVendor$invoke$1(Object obj) {
        Object objFirstOrNull;
        getNone4e0Vf04 getnone4e0vf04;
        isInsideContent isinsidecontent;
        Flow flowSerializer;
        int i = 2 % 2;
        getClipgIe3tQ8 getclipgie3tq8 = (getClipgIe3tQ8) this.serializer;
        FlowCollector flowCollector = (FlowCollector) this.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Boolean bool = Boolean.FALSE;
            this.RemoteActionCompatParcelizer = flowCollector;
            this.write = 1;
            if (flowCollector.emit(bool, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        int i3 = MediaMetadataCompat;
        int i4 = i3 + 35;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0 ? i2 == 1 : i2 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i5 = i3 + 27;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            getnone4e0vf04 = (getNone4e0Vf04) this.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objFirstOrNull = obj;
        }
        isinsidecontent = (isInsideContent) objFirstOrNull;
        if (isinsidecontent != null) {
            CreateHomeScope createHomeScope = getclipgie3tq8.write;
            DialogLayoutContent4 dialogLayoutContent4 = isinsidecontent.location;
            double d = dialogLayoutContent4.latitude;
            double d2 = dialogLayoutContent4.longitude;
            flowSerializer = FlowKt.serializer(new ObserveIsWithinGeofenceUseCaseImpl$invoke$$inlined$map$1(((ObserveDistanceToLocationUseCaseImpl) createHomeScope.read).RemoteActionCompatParcelizer(d, d2), getnone4e0vf04.scanningStartGeofenceMeters, 0));
            this.RemoteActionCompatParcelizer = null;
            this.IconCompatParcelizer = null;
            this.write = 3;
            if (FlowKt.emitAll(flowCollector, flowSerializer, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createfromparcel;
        getNone4e0Vf04 getnone4e0vf04RemoteActionCompatParcelizer = getclipgie3tq8.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        if (getnone4e0vf04RemoteActionCompatParcelizer != null) {
            Object[] objArr = {getclipgie3tq8.serializer.serializer};
            FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(new NestLoadingServiceImpl$special$$inlined$map$1((StateProviderImpl$special$$inlined$map$4) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 76932691, -76932687, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr), 24));
            this.RemoteActionCompatParcelizer = flowCollector;
            this.IconCompatParcelizer = getnone4e0vf04RemoteActionCompatParcelizer;
            this.write = 2;
            objFirstOrNull = FlowKt.firstOrNull(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, this);
            if (objFirstOrNull == coroutineSingletons) {
                int i7 = MediaDescriptionCompat + 91;
                MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 5 / 3;
                }
            } else {
                getnone4e0vf04 = getnone4e0vf04RemoteActionCompatParcelizer;
                isinsidecontent = (isInsideContent) objFirstOrNull;
                if (isinsidecontent != null) {
                    CreateHomeScope createHomeScope2 = getclipgie3tq8.write;
                    DialogLayoutContent4 dialogLayoutContent5 = isinsidecontent.location;
                    double d3 = dialogLayoutContent5.latitude;
                    double d4 = dialogLayoutContent5.longitude;
                    flowSerializer = FlowKt.serializer(new ObserveIsWithinGeofenceUseCaseImpl$invoke$$inlined$map$1(((ObserveDistanceToLocationUseCaseImpl) createHomeScope2.read).RemoteActionCompatParcelizer(d3, d4), getnone4e0vf04.scanningStartGeofenceMeters, 0));
                    this.RemoteActionCompatParcelizer = null;
                    this.IconCompatParcelizer = null;
                    this.write = 3;
                    if (FlowKt.emitAll(flowCollector, flowSerializer, this) == coroutineSingletons) {
                    }
                }
            }
            return coroutineSingletons;
        }
        return createfromparcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d2, code lost:
    
        if (r3.collect(r4, r18) == r6) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$com$roadrunner$delivery$pickupdropoff$confirmbutton$presentation$ConfirmButtonV1UiModelImpl$1(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.logger.PerseusLogger$w$1.invokeSuspend$com$roadrunner$delivery$pickupdropoff$confirmbutton$presentation$ConfirmButtonV1UiModelImpl$1(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ed, code lost:
    
        if (r13 == r3) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$com$roadrunner$delivery$ontheway$navigation$presentation$NavigationButtonUiModelImpl$onNavigationClick$1$1(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.logger.PerseusLogger$w$1.invokeSuspend$com$roadrunner$delivery$ontheway$navigation$presentation$NavigationButtonUiModelImpl$onNavigationClick$1$1(java.lang.Object):java.lang.Object");
    }

    private final Object invokeSuspend$com$roadrunner$delivery$pickupdropoff$bluetoothscanning$BleScannerImpl$scan$1(Object obj) {
        BluetoothManager bluetoothManager;
        BluetoothAdapter adapter;
        BluetoothLeScanner bluetoothLeScanner;
        int i = 2 % 2;
        String str = (String) this.RemoteActionCompatParcelizer;
        getLinearity4e0Vf04ui_text getlinearity4e0vf04ui_text = (getLinearity4e0Vf04ui_text) this.serializer;
        InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        getlinearity4e0vf04ui_text.write.getClass();
        str.getClass();
        byte[] bytes = str.getBytes(ensureSubscribedToInAppMessageEvents.write);
        bytes.getClass();
        UUID uuidNameUUIDFromBytes = UUID.nameUUIDFromBytes(bytes);
        uuidNameUUIDFromBytes.getClass();
        Object systemService = getlinearity4e0vf04ui_text.IconCompatParcelizer.getSystemService("bluetooth");
        if (systemService instanceof BluetoothManager) {
            int i4 = MediaMetadataCompat + 51;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                throw null;
            }
            bluetoothManager = (BluetoothManager) systemService;
        } else {
            int i5 = MediaMetadataCompat + 5;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            bluetoothManager = null;
        }
        if (bluetoothManager == null || (adapter = bluetoothManager.getAdapter()) == null || (bluetoothLeScanner = adapter.getBluetoothLeScanner()) == null) {
            ((ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1).IconCompatParcelizer((Throwable) null);
            return createfromparcel;
        }
        getAnimated getanimated = new getAnimated(getlinearity4e0vf04ui_text, str, inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1);
        ParcelUuid parcelUuid = new ParcelUuid(uuidNameUUIDFromBytes);
        try {
            bluetoothLeScanner.startScan(SQLite.read(new ScanFilter.Builder().setServiceUuid(parcelUuid).build(), new ScanFilter.Builder().setServiceData(parcelUuid, null).build()), new ScanSettings.Builder().setScanMode(2).build(), getanimated);
            DeviceManager$$ExternalSyntheticLambda1 deviceManager$$ExternalSyntheticLambda1 = new DeviceManager$$ExternalSyntheticLambda1(bluetoothLeScanner, i3, getanimated);
            this.IconCompatParcelizer = null;
            this.write = 1;
            if (Room.awaitClose(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, deviceManager$$ExternalSyntheticLambda1, this) != coroutineSingletons) {
                return createfromparcel;
            }
            int i7 = MediaDescriptionCompat + 109;
            MediaMetadataCompat = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                return coroutineSingletons;
            }
            throw null;
        } catch (SecurityException e) {
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            forest.RemoteActionCompatParcelizer("BleScannerImpl");
            forest.serializer(e, "startScan failed: BLUETOOTH_SCAN permission not granted", new Object[0]);
            ((ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1).IconCompatParcelizer((Throwable) null);
            return createfromparcel;
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i2) {
            case 0:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 1:
                return ((PerseusLogger$w$1) create((VectorPainter) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                return ((PerseusLogger$w$1) create((VectorPainter) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 3:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 4:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 5:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 6:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 7:
                Object objInvokeSuspend = ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i3 = MediaMetadataCompat + 31;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return objInvokeSuspend;
            case 8:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 9:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 10:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 11:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 12:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 13:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 14:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 15:
                Object objInvokeSuspend2 = ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = MediaDescriptionCompat + 69;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return objInvokeSuspend2;
                }
                throw null;
            case 16:
                return ((PerseusLogger$w$1) create((WebChatEventsTrackerImpl) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 17:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 18:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 19:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 20:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 21:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 22:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 23:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 24:
                return ((PerseusLogger$w$1) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 25:
                return ((PerseusLogger$w$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 26:
                return ((PerseusLogger$w$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 27:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 28:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            default:
                return ((PerseusLogger$w$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        switch (this.read) {
            case 0:
                return new PerseusLogger$w$1((PerseusLogger) this.IconCompatParcelizer, (String) this.RemoteActionCompatParcelizer, (Throwable) this.serializer, shortNewsContentCardView, 0);
            case 1:
                PerseusLogger$w$1 perseusLogger$w$1 = new PerseusLogger$w$1((pathNodesFromArgs) this.RemoteActionCompatParcelizer, (obtainSizePxVpY3zN4) this.serializer, shortNewsContentCardView, 1);
                perseusLogger$w$1.IconCompatParcelizer = obj;
                return perseusLogger$w$1;
            case 2:
                PerseusLogger$w$1 perseusLogger$w$2 = new PerseusLogger$w$1((getY2) this.RemoteActionCompatParcelizer, (WebChatViewmodel) this.serializer, shortNewsContentCardView, i);
                perseusLogger$w$2.IconCompatParcelizer = obj;
                return perseusLogger$w$2;
            case 3:
                PerseusLogger$w$1 perseusLogger$w$3 = new PerseusLogger$w$1(shortNewsContentCardView, (WebChatViewmodel) this.serializer, (String) this.RemoteActionCompatParcelizer);
                perseusLogger$w$3.IconCompatParcelizer = obj;
                return perseusLogger$w$3;
            case 4:
                return new PerseusLogger$w$1((HandlePushMessageUseCase) this.IconCompatParcelizer, (endI) this.RemoteActionCompatParcelizer, (CourierApplication) this.serializer, shortNewsContentCardView, 4);
            case 5:
                return new PerseusLogger$w$1((swap) this.IconCompatParcelizer, (isRoot) this.RemoteActionCompatParcelizer, (Long) this.serializer, shortNewsContentCardView, 5);
            case 6:
                return new PerseusLogger$w$1((x) this.serializer, shortNewsContentCardView, 6);
            case 7:
                PerseusLogger$w$1 perseusLogger$w$4 = new PerseusLogger$w$1((MapboxNavigation) this.serializer, shortNewsContentCardView, 7);
                int i3 = MediaMetadataCompat + 63;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return perseusLogger$w$4;
            case 8:
                return new PerseusLogger$w$1((RouteProgressData) this.IconCompatParcelizer, (RouteRefresher) this.RemoteActionCompatParcelizer, (onViewAttachedToWindowlambda0) this.serializer, shortNewsContentCardView, 8);
            case 9:
                return new PerseusLogger$w$1((H$b) this.IconCompatParcelizer, (BuildingAction$QueryBuilding) this.RemoteActionCompatParcelizer, (MapboxNavigationConsumer) this.serializer, shortNewsContentCardView, 9);
            case 10:
                PerseusLogger$w$1 perseusLogger$w$5 = new PerseusLogger$w$1((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.RemoteActionCompatParcelizer, (RouteLineHistoryRecordingPusher) this.serializer, shortNewsContentCardView, 10);
                perseusLogger$w$5.IconCompatParcelizer = obj;
                return perseusLogger$w$5;
            case 11:
                return new PerseusLogger$w$1((List) this.IconCompatParcelizer, (getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer, (BillingController$onExternalRouteSet$newWaypoints$1) this.serializer, shortNewsContentCardView, 11);
            case 12:
                return new PerseusLogger$w$1((InitializeAppStartupItemsImpl) this.IconCompatParcelizer, (getGlobalChangeEntries) this.RemoteActionCompatParcelizer, (getMinDebounceDeadline) this.serializer, shortNewsContentCardView, 12);
            case 13:
                return new PerseusLogger$w$1((r8lambda0dL3NwAAnESqa66IBFAXKvH5HU) this.RemoteActionCompatParcelizer, (LinkAnnotationClickable) this.serializer, shortNewsContentCardView, 13);
            case 14:
                return new PerseusLogger$w$1((r8lambda0dL3NwAAnESqa66IBFAXKvH5HU) this.RemoteActionCompatParcelizer, (getStyles) this.serializer, shortNewsContentCardView, 14);
            case 15:
                return new PerseusLogger$w$1((HelpCenterRemoteDataSourceImpl) this.serializer, shortNewsContentCardView, 15);
            case 16:
                PerseusLogger$w$1 perseusLogger$w$6 = new PerseusLogger$w$1((getLineEllipsisCountui_text) this.RemoteActionCompatParcelizer, (getHasStaleResolvedFonts) this.serializer, shortNewsContentCardView, 16);
                perseusLogger$w$6.IconCompatParcelizer = obj;
                return perseusLogger$w$6;
            case 17:
                PerseusLogger$w$1 perseusLogger$w$7 = new PerseusLogger$w$1(shortNewsContentCardView, (WebChatViewModel) this.RemoteActionCompatParcelizer, (Uri) this.serializer);
                perseusLogger$w$7.IconCompatParcelizer = obj;
                int i5 = MediaDescriptionCompat + 119;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return perseusLogger$w$7;
            case 18:
                return new PerseusLogger$w$1((onViewCreated) this.IconCompatParcelizer, (SignInDataStore) this.RemoteActionCompatParcelizer, (TextMeasurerKt) this.serializer, shortNewsContentCardView, 18);
            case 19:
                return new PerseusLogger$w$1((BoringLayoutFactory33ExternalSyntheticApiModelOutline0) this.RemoteActionCompatParcelizer, (List) this.serializer, shortNewsContentCardView, 19);
            case 20:
                return new PerseusLogger$w$1((BoringLayoutFactory33ExternalSyntheticApiModelOutline0) this.RemoteActionCompatParcelizer, (FocusTargetInteropElement) this.serializer, shortNewsContentCardView, 20);
            case 21:
                return new PerseusLogger$w$1((LastStopOptionUiModelImpl) this.RemoteActionCompatParcelizer, shortNewsContentCardView);
            case 22:
                return new PerseusLogger$w$1((EditingBufferCompanion) this.IconCompatParcelizer, (String) this.RemoteActionCompatParcelizer, (getMBufferStateui_text) this.serializer, shortNewsContentCardView, 22);
            case 23:
                return new PerseusLogger$w$1((NavigationButtonUiModelImpl) this.RemoteActionCompatParcelizer, (setDrawStyle) this.serializer, shortNewsContentCardView, 23);
            case 24:
                PerseusLogger$w$1 perseusLogger$w$8 = new PerseusLogger$w$1((getLinearity4e0Vf04ui_text) this.serializer, (String) this.RemoteActionCompatParcelizer, shortNewsContentCardView);
                perseusLogger$w$8.IconCompatParcelizer = obj;
                return perseusLogger$w$8;
            case 25:
                return new PerseusLogger$w$1((BleScanningLifecycleObserverImpl) this.IconCompatParcelizer, (isInsideContent) this.RemoteActionCompatParcelizer, (accessisRenderNodeCompatiblecp) this.serializer, shortNewsContentCardView, 25);
            case 26:
                PerseusLogger$w$1 perseusLogger$w$9 = new PerseusLogger$w$1((getClipgIe3tQ8) this.serializer, shortNewsContentCardView, 26);
                perseusLogger$w$9.RemoteActionCompatParcelizer = obj;
                return perseusLogger$w$9;
            case 27:
                PerseusLogger$w$1 perseusLogger$w$10 = new PerseusLogger$w$1((ConfirmButtonV1UiModelImpl) this.RemoteActionCompatParcelizer, (attach) this.serializer, shortNewsContentCardView, 27);
                perseusLogger$w$10.IconCompatParcelizer = obj;
                return perseusLogger$w$10;
            case 28:
                PerseusLogger$w$1 perseusLogger$w$11 = new PerseusLogger$w$1((List) this.RemoteActionCompatParcelizer, (NestFragment$onCreateView$1$1$1$1) this.serializer, shortNewsContentCardView, 28);
                perseusLogger$w$11.IconCompatParcelizer = obj;
                return perseusLogger$w$11;
            default:
                return new PerseusLogger$w$1((CustomerUnavailableViewModel) this.IconCompatParcelizer, (getSpanVerticalAligndo9XGg) this.RemoteActionCompatParcelizer, (getCompared) this.serializer, shortNewsContentCardView, 29);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x023e, code lost:
    
        if (r5.optOutOfBackToBackOrders(r44) == r4) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02cd, code lost:
    
        if (r4.optOutOfBackToBackOrders(r44) == r6) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02e4, code lost:
    
        if (r3 == r6) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0446, code lost:
    
        if (r0 == r3) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x059b, code lost:
    
        if (r0 == r2) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0686, code lost:
    
        if (r0 == r2) goto L263;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.logger.PerseusLogger$w$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
