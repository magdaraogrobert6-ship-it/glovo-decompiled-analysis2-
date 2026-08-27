package com.roadrunner.rider.state.cashblock.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.EventResponseData;
import o.GooglePlayServicesClient;
import o.GraphicsLayerScopeDefaultImpls;
import o.ShortNewsContentCardView;
import o.SystemLifecycleSystemLifecycleCache;
import o.accessgetInstancedelegatecp;
import o.accessgetMovecp;
import o.createFromParcel;
import o.ensureLeftGlow;
import o.fillRemainingScrollValues;
import o.getBaseUrl;
import o.getFailureResponseData;
import o.getInstallSessionBackoffStrategy;
import o.isTrackingEnabled;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.setSdkPrefix;
import o.setTranslationX;
import o.timesmpE4wyQ;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class GetCashBlockUiState$invoke$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCashBlockUiState$invoke$1(PickUpDropOffTasksUiModelV2Impl pickUpDropOffTasksUiModelV2Impl, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.IconCompatParcelizer = 3;
        this.read = pickUpDropOffTasksUiModelV2Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetCashBlockUiState$invoke$1(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.IconCompatParcelizer = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetCashBlockUiState$invoke$1(int i) {
        super(3, null);
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = 3;
        if (i3 == 0) {
            GetCashBlockUiState$invoke$1 getCashBlockUiState$invoke$1 = new GetCashBlockUiState$invoke$1(i4, 0, (ShortNewsContentCardView) obj3);
            getCashBlockUiState$invoke$1.RemoteActionCompatParcelizer = (timesmpE4wyQ) obj;
            getCashBlockUiState$invoke$1.read = (GooglePlayServicesClient) obj2;
            Object objInvokeSuspend = getCashBlockUiState$invoke$1.invokeSuspend(createfromparcel);
            int i5 = write + 65;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }
        int i7 = 1;
        if (i3 == 1) {
            GetCashBlockUiState$invoke$1 getCashBlockUiState$invoke$2 = new GetCashBlockUiState$invoke$1(i4, i7, (ShortNewsContentCardView) obj3);
            getCashBlockUiState$invoke$2.RemoteActionCompatParcelizer = (setSdkPrefix) obj;
            getCashBlockUiState$invoke$2.read = (accessgetMovecp) obj2;
            return getCashBlockUiState$invoke$2.invokeSuspend(createfromparcel);
        }
        if (i3 == 2) {
            GetCashBlockUiState$invoke$1 getCashBlockUiState$invoke$3 = new GetCashBlockUiState$invoke$1(i4, i, (ShortNewsContentCardView) obj3);
            getCashBlockUiState$invoke$3.RemoteActionCompatParcelizer = (onViewAttachedToWindowlambda0) obj;
            getCashBlockUiState$invoke$3.read = (List) obj2;
            Object objInvokeSuspend2 = getCashBlockUiState$invoke$3.invokeSuspend(createfromparcel);
            int i8 = write + 17;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return objInvokeSuspend2;
        }
        if (i3 == 3) {
            GetCashBlockUiState$invoke$1 getCashBlockUiState$invoke$4 = new GetCashBlockUiState$invoke$1((PickUpDropOffTasksUiModelV2Impl) this.read, (ShortNewsContentCardView) obj3);
            getCashBlockUiState$invoke$4.RemoteActionCompatParcelizer = (Throwable) obj2;
            getCashBlockUiState$invoke$4.invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        int i10 = 4;
        if (i3 == 4) {
            GetCashBlockUiState$invoke$1 getCashBlockUiState$invoke$5 = new GetCashBlockUiState$invoke$1(i4, i10, (ShortNewsContentCardView) obj3);
            getCashBlockUiState$invoke$5.RemoteActionCompatParcelizer = (fillRemainingScrollValues) obj;
            getCashBlockUiState$invoke$5.read = (ensureLeftGlow) obj2;
            return getCashBlockUiState$invoke$5.invokeSuspend(createfromparcel);
        }
        GetCashBlockUiState$invoke$1 getCashBlockUiState$invoke$6 = new GetCashBlockUiState$invoke$1(i4, 5, (ShortNewsContentCardView) obj3);
        getCashBlockUiState$invoke$6.read = (getFailureResponseData) obj;
        getCashBlockUiState$invoke$6.RemoteActionCompatParcelizer = (timesmpE4wyQ) obj2;
        return getCashBlockUiState$invoke$6.invokeSuspend(createfromparcel);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x0120 A[LOOP:1: B:53:0x011a->B:55:0x0120, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0146  */
    /* JADX WARN: Code duplicated, block: B:66:0x0172  */
    /* JADX WARN: Code duplicated, block: B:68:0x0183  */
    /* JADX WARN: Code duplicated, block: B:73:0x019a  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0140 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        timesmpE4wyQ timesmpe4wyq;
        GooglePlayServicesClient googlePlayServicesClient;
        setSdkPrefix setsdkprefix;
        String strValueOf;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        LinkedHashSet linkedHashSet;
        ArrayList arrayList3;
        setTranslationX settranslationx;
        Throwable th;
        Boolean boolValueOf;
        int i;
        getFailureResponseData getfailureresponsedata;
        int i2 = 2 % 2;
        int i3 = serializer + 59;
        write = i3 % Fields.SpotShadowColor;
        EventResponseData eventResponseData = null;
        boolean z2 = true;
        boolean z3 = false;
        if (i3 % 2 == 0) {
            int i4 = this.IconCompatParcelizer;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                z = true;
                                getfailureresponsedata = (getFailureResponseData) this.read;
                                timesmpE4wyQ timesmpe4wyq2 = (timesmpE4wyQ) this.RemoteActionCompatParcelizer;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                ExtrasKt.RemoteActionCompatParcelizer(obj);
                                if (getfailureresponsedata.RemoteActionCompatParcelizer == isTrackingEnabled.ENDING) {
                                    int i5 = write + 91;
                                    serializer = i5 % Fields.SpotShadowColor;
                                    int i6 = i5 % 2;
                                } else {
                                    z2 = false;
                                }
                                boolean zIsEmpty = timesmpe4wyq2.MediaBrowserCompatMediaItem.isEmpty();
                                if (z2) {
                                    z3 = z;
                                }
                                return Boolean.valueOf(z3);
                            }
                            fillRemainingScrollValues fillremainingscrollvalues = (fillRemainingScrollValues) this.RemoteActionCompatParcelizer;
                            ensureLeftGlow ensureleftglow = (ensureLeftGlow) this.read;
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            boolValueOf = Boolean.valueOf((fillremainingscrollvalues == null || ensureleftglow != null) ? z2 : false);
                            i = serializer + 117;
                            write = i % Fields.SpotShadowColor;
                            if (i % 2 == 0) {
                                return boolValueOf;
                            }
                            eventResponseData.hashCode();
                            throw null;
                        }
                        th = (Throwable) this.RemoteActionCompatParcelizer;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        PickUpDropOffTasksUiModelV2Impl pickUpDropOffTasksUiModelV2Impl = (PickUpDropOffTasksUiModelV2Impl) this.read;
                        MutableStateFlow mutableStateFlow = pickUpDropOffTasksUiModelV2Impl.RemoteActionCompatParcelizer;
                        SmallPersistentVector smallPersistentVector = SmallPersistentVector.RemoteActionCompatParcelizer;
                        mutableStateFlow.IconCompatParcelizer(smallPersistentVector);
                        PickUpDropOffTasksUiModelV2Impl.write(pickUpDropOffTasksUiModelV2Impl, smallPersistentVector);
                        pickUpDropOffTasksUiModelV2Impl.write.IconCompatParcelizer(Boolean.FALSE);
                        pickUpDropOffTasksUiModelV2Impl.serializer.IconCompatParcelizer(Boolean.TRUE);
                        pickUpDropOffTasksUiModelV2Impl.RemoteActionCompatParcelizer(false);
                        if (pauseWebviewIfNecessarylambda10.IconCompatParcelizer(th)) {
                            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                            final String message = th.getMessage();
                            forest.RemoteActionCompatParcelizer(new Exception(message) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.PuDoExceptions$PuDoTasksLoadFailedNetworkException
                            }, "PickUpDropOffTasksUiModelV2Impl: Failed to load confirmation tasks.", new Object[0]);
                        } else {
                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "PickUpDropOffTasksUiModelV2Impl: dataLoadingFailError: Task data loading failed.", new Object[0]);
                        }
                        return createFromParcel.INSTANCE;
                    }
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) this.RemoteActionCompatParcelizer;
                    List list = (List) this.read;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Set set = (Set) onviewattachedtowindowlambda0.serializer;
                    List list2 = list;
                    arrayList = new ArrayList();
                    for (Object obj2 : list2) {
                        settranslationx = ((GraphicsLayerScopeDefaultImpls) obj2).MediaDescriptionCompat;
                        if (settranslationx != setTranslationX.ENQUEUED) {
                        }
                        arrayList.add(obj2);
                    }
                    arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((GraphicsLayerScopeDefaultImpls) it.next()).read);
                    }
                    Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList2);
                    linkedHashSet = RangesKt.read(set, setR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                    arrayList3 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (linkedHashSet.contains(((GraphicsLayerScopeDefaultImpls) obj3).read)) {
                            arrayList3.add(obj3);
                        }
                    }
                    return new onViewAttachedToWindowlambda0(setR8lambda54BeH8ZsBru0CXI2CCSP2syNys, arrayList3);
                }
                setsdkprefix = (setSdkPrefix) this.RemoteActionCompatParcelizer;
                accessgetMovecp accessgetmovecp = (accessgetMovecp) this.read;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i7 = accessgetmovecp.write;
                long j = accessgetmovecp.IconCompatParcelizer;
                if (setsdkprefix != null) {
                    int i8 = serializer + 9;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    strValueOf = String.valueOf(setsdkprefix.write);
                    if (strValueOf == null) {
                        strValueOf = "";
                    }
                } else {
                    strValueOf = "";
                }
                return new SystemLifecycleSystemLifecycleCache(i7, j, strValueOf);
            }
            timesmpe4wyq = (timesmpE4wyQ) this.RemoteActionCompatParcelizer;
            googlePlayServicesClient = (GooglePlayServicesClient) this.read;
            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (googlePlayServicesClient != null) {
                eventResponseData = googlePlayServicesClient.read;
                int i10 = serializer + 37;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
            if (timesmpe4wyq.MediaBrowserCompatMediaItem.isEmpty()) {
                int i12 = write + 31;
                serializer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (eventResponseData != null) {
                    return new getBaseUrl(eventResponseData.write, eventResponseData.serializer, eventResponseData.IconCompatParcelizer, eventResponseData.read);
                }
            }
            return getInstallSessionBackoffStrategy.IconCompatParcelizer;
        }
        int i14 = this.IconCompatParcelizer;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 == 4) {
                            z2 = false;
                            fillRemainingScrollValues fillremainingscrollvalues2 = (fillRemainingScrollValues) this.RemoteActionCompatParcelizer;
                            ensureLeftGlow ensureleftglow2 = (ensureLeftGlow) this.read;
                            CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            boolValueOf = Boolean.valueOf((fillremainingscrollvalues2 == null || ensureleftglow2 != null) ? z2 : false);
                            i = serializer + 117;
                            write = i % Fields.SpotShadowColor;
                            if (i % 2 == 0) {
                                return boolValueOf;
                            }
                            eventResponseData.hashCode();
                            throw null;
                        }
                        z = false;
                        getfailureresponsedata = (getFailureResponseData) this.read;
                        timesmpE4wyQ timesmpe4wyq3 = (timesmpE4wyQ) this.RemoteActionCompatParcelizer;
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        if (getfailureresponsedata.RemoteActionCompatParcelizer == isTrackingEnabled.ENDING) {
                            int i15 = write + 91;
                            serializer = i15 % Fields.SpotShadowColor;
                            int i16 = i15 % 2;
                        } else {
                            z2 = false;
                        }
                        boolean zIsEmpty2 = timesmpe4wyq3.MediaBrowserCompatMediaItem.isEmpty();
                        if (z2 && zIsEmpty2) {
                            z3 = z;
                        }
                        return Boolean.valueOf(z3);
                    }
                    th = (Throwable) this.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    PickUpDropOffTasksUiModelV2Impl pickUpDropOffTasksUiModelV2Impl2 = (PickUpDropOffTasksUiModelV2Impl) this.read;
                    MutableStateFlow mutableStateFlow2 = pickUpDropOffTasksUiModelV2Impl2.RemoteActionCompatParcelizer;
                    SmallPersistentVector smallPersistentVector2 = SmallPersistentVector.RemoteActionCompatParcelizer;
                    mutableStateFlow2.IconCompatParcelizer(smallPersistentVector2);
                    PickUpDropOffTasksUiModelV2Impl.write(pickUpDropOffTasksUiModelV2Impl2, smallPersistentVector2);
                    pickUpDropOffTasksUiModelV2Impl2.write.IconCompatParcelizer(Boolean.FALSE);
                    pickUpDropOffTasksUiModelV2Impl2.serializer.IconCompatParcelizer(Boolean.TRUE);
                    pickUpDropOffTasksUiModelV2Impl2.RemoteActionCompatParcelizer(false);
                    if (pauseWebviewIfNecessarylambda10.IconCompatParcelizer(th)) {
                        Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                        final String message2 = th.getMessage();
                        forest2.RemoteActionCompatParcelizer(new Exception(message2) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.PuDoExceptions$PuDoTasksLoadFailedNetworkException
                        }, "PickUpDropOffTasksUiModelV2Impl: Failed to load confirmation tasks.", new Object[0]);
                    } else {
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "PickUpDropOffTasksUiModelV2Impl: dataLoadingFailError: Task data loading failed.", new Object[0]);
                    }
                    return createFromParcel.INSTANCE;
                }
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (onViewAttachedToWindowlambda0) this.RemoteActionCompatParcelizer;
                List list3 = (List) this.read;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Set set2 = (Set) onviewattachedtowindowlambda1.serializer;
                List list4 = list3;
                arrayList = new ArrayList();
                while (r2.hasNext()) {
                    settranslationx = ((GraphicsLayerScopeDefaultImpls) obj2).MediaDescriptionCompat;
                    if (settranslationx != setTranslationX.ENQUEUED || settranslationx == setTranslationX.RUNNING) {
                        arrayList.add(obj2);
                    }
                }
                arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((GraphicsLayerScopeDefaultImpls) it.next()).read);
                }
                Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList2);
                linkedHashSet = RangesKt.read(set2, setR8lambda54BeH8ZsBru0CXI2CCSP2syNys2);
                arrayList3 = new ArrayList();
                while (r1.hasNext()) {
                    if (linkedHashSet.contains(((GraphicsLayerScopeDefaultImpls) obj3).read)) {
                        arrayList3.add(obj3);
                    }
                }
                return new onViewAttachedToWindowlambda0(setR8lambda54BeH8ZsBru0CXI2CCSP2syNys2, arrayList3);
            }
            setsdkprefix = (setSdkPrefix) this.RemoteActionCompatParcelizer;
            accessgetMovecp accessgetmovecp2 = (accessgetMovecp) this.read;
            CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i17 = accessgetmovecp2.write;
            long j2 = accessgetmovecp2.IconCompatParcelizer;
            if (setsdkprefix != null) {
                int i18 = serializer + 9;
                write = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                strValueOf = String.valueOf(setsdkprefix.write);
                if (strValueOf == null) {
                    strValueOf = "";
                }
            } else {
                strValueOf = "";
            }
            return new SystemLifecycleSystemLifecycleCache(i17, j2, strValueOf);
        }
        timesmpe4wyq = (timesmpE4wyQ) this.RemoteActionCompatParcelizer;
        googlePlayServicesClient = (GooglePlayServicesClient) this.read;
        CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (googlePlayServicesClient != null) {
            eventResponseData = googlePlayServicesClient.read;
            int i110 = serializer + 37;
            write = i110 % Fields.SpotShadowColor;
            int i111 = i110 % 2;
        }
        if (timesmpe4wyq.MediaBrowserCompatMediaItem.isEmpty()) {
            int i112 = write + 31;
            serializer = i112 % Fields.SpotShadowColor;
            int i113 = i112 % 2;
            if (eventResponseData != null) {
                return new getBaseUrl(eventResponseData.write, eventResponseData.serializer, eventResponseData.IconCompatParcelizer, eventResponseData.read);
            }
        }
        return getInstallSessionBackoffStrategy.IconCompatParcelizer;
    }
}
