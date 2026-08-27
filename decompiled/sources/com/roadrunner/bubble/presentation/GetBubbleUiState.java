package com.roadrunner.bubble.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.play.core.appupdate.zzz;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.accept.backToBackOrder.domain.GetBackToBackOrdersDataImpl;
import com.roadrunner.delivery.midshiftverification.LastDropoffConfirmedEventImpl;
import com.roadrunner.delivery.repository.api.DeliveryInformation$DeliveryStatus;
import com.roadrunner.delivery.repository.api.DeliveryInformation$ScreenDataType;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import com.roadrunner.opportunities.domain.IsRiderInsideActiveAreaBoundaryImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import io.sentry.CombinedScopeView;
import io.sentry.metrics.MetricsBatchProcessor;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AndroidPopup_androidKtPopup1;
import o.AndroidPopup_androidKtPopup41invokeinlinedonDispose1;
import o.AndroidView_androidKtupdateViewHolderParams5;
import o.ContainsAlllambda0;
import o.ContainsCenterlambda0;
import o.ExtensionWindowAreaStatusRequirements;
import o.FontStyleSaverlambda0;
import o.LocaleSaverlambda0;
import o.PaintExtensions_androidKt;
import o.ParagraphStyleSaverlambda1;
import o.ShortNewsContentCardView;
import o.TextLayoutInput;
import o.accessgetEmbeddedView;
import o.accessrequireViewFactoryHolder;
import o.accesstoNestedScrollSource;
import o.allocateItemsIndex;
import o.createFromParcel;
import o.endRearDisplayPresentationSession;
import o.f9;
import o.forEachUpdatedRect;
import o.getCieXyz;
import o.getFailureResponseData;
import o.getLengthimpl;
import o.getOnRequesterReady;
import o.getRearDisplayPresentation;
import o.getReversedimpl;
import o.getTextBounds;
import o.getWindowAreaDisplayMetrics;
import o.getWindowAreaStatus;
import o.instance_delegatelambda0;
import o.invoke58bKbWc;
import o.isItemDismissable;
import o.isTrackingEnabled;
import o.measurexDpz5zYdefault;
import o.metaFor;
import o.moveBasedOnParentOffset;
import o.o7ExternalSyntheticLambda3;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.r8lambdafHcIMtqslO5nN2ofGE631aElY;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.s6;
import o.sc;
import o.se;
import o.setFitInsetsSides;
import o.setLastHorizontalStyle;
import o.setTransactionSuccessful;
import o.subscribeToBannersUpdateslambda2;
import o.timesmpE4wyQ;

/* JADX INFO: loaded from: classes3.dex */
public final class GetBubbleUiState {
    private static int MediaMetadataCompat = 1;
    private static int serializer;
    public final GetRiderStatusImpl IconCompatParcelizer;
    public final zzz RemoteActionCompatParcelizer;
    public final moveBasedOnParentOffset read;
    public final setTransactionSuccessful write;

    /* JADX INFO: renamed from: com.roadrunner.bubble.presentation.GetBubbleUiState$invoke$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
        private static int MediaBrowserCompatMediaItem = 1;
        private static int serializer;
        public /* synthetic */ Object IconCompatParcelizer;
        public final /* synthetic */ int RemoteActionCompatParcelizer;
        public /* synthetic */ Object read;
        public final /* synthetic */ Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(3, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = i;
            this.write = obj;
        }

        @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = MediaBrowserCompatMediaItem + 55;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                throw null;
            }
            int i4 = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            Object obj4 = this.write;
            switch (i4) {
                case 0:
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2((GetBubbleUiState) obj4, (ShortNewsContentCardView) obj3, 0);
                    anonymousClass2.IconCompatParcelizer = (FontStyleSaverlambda0) obj;
                    anonymousClass2.read = (getFailureResponseData) obj2;
                    return anonymousClass2.invokeSuspend(createfromparcel2);
                case 1:
                    AnonymousClass2 anonymousClass3 = new AnonymousClass2((LocaleSaverlambda0) obj4, (ShortNewsContentCardView) obj3, 1);
                    anonymousClass3.IconCompatParcelizer = (AndroidView_androidKtupdateViewHolderParams5) obj;
                    anonymousClass3.read = (Map) obj2;
                    return anonymousClass3.invokeSuspend(createfromparcel2);
                case 2:
                    Object obj5 = ((onItemDismiss) obj).IconCompatParcelizer;
                    Object obj6 = ((onItemDismiss) obj2).IconCompatParcelizer;
                    AnonymousClass2 anonymousClass4 = new AnonymousClass2((MetricsBatchProcessor) obj4, (ShortNewsContentCardView) obj3, i);
                    anonymousClass4.IconCompatParcelizer = obj5;
                    anonymousClass4.read = obj6;
                    return anonymousClass4.invokeSuspend(createfromparcel2);
                case 3:
                    Object obj7 = ((onItemDismiss) obj).IconCompatParcelizer;
                    Object obj8 = ((onItemDismiss) obj2).IconCompatParcelizer;
                    AnonymousClass2 anonymousClass5 = new AnonymousClass2((GetBackToBackOrdersDataImpl) obj4, (ShortNewsContentCardView) obj3, 3);
                    anonymousClass5.IconCompatParcelizer = obj7;
                    anonymousClass5.read = obj8;
                    return anonymousClass5.invokeSuspend(createfromparcel2);
                case 4:
                    AnonymousClass2 anonymousClass6 = new AnonymousClass2((measurexDpz5zYdefault) obj4, (ShortNewsContentCardView) obj3, 4);
                    anonymousClass6.IconCompatParcelizer = (PaintExtensions_androidKt) obj;
                    anonymousClass6.read = (ContainsAlllambda0) obj2;
                    anonymousClass6.invokeSuspend(createfromparcel2);
                    return createfromparcel2;
                case 5:
                    AnonymousClass2 anonymousClass7 = new AnonymousClass2((getReversedimpl) obj4, (ShortNewsContentCardView) obj3, 5);
                    anonymousClass7.IconCompatParcelizer = (accessgetEmbeddedView) obj;
                    anonymousClass7.read = (Map) obj2;
                    return anonymousClass7.invokeSuspend(createfromparcel2);
                case 6:
                    AnonymousClass2 anonymousClass8 = new AnonymousClass2((LastDropoffConfirmedEventImpl) obj4, (ShortNewsContentCardView) obj3, 6);
                    anonymousClass8.IconCompatParcelizer = (timesmpE4wyQ) obj;
                    anonymousClass8.read = (isTrackingEnabled) obj2;
                    return anonymousClass8.invokeSuspend(createfromparcel2);
                case 7:
                    AnonymousClass2 anonymousClass9 = new AnonymousClass2((IsRiderInsideActiveAreaBoundaryImpl) obj4, (ShortNewsContentCardView) obj3, 7);
                    anonymousClass9.IconCompatParcelizer = (se) obj;
                    anonymousClass9.read = (getWindowAreaDisplayMetrics) obj2;
                    return anonymousClass9.invokeSuspend(createfromparcel2);
                default:
                    AnonymousClass2 anonymousClass10 = new AnonymousClass2((CombinedScopeView) obj4, (ShortNewsContentCardView) obj3, 8);
                    anonymousClass10.IconCompatParcelizer = (sc) obj;
                    anonymousClass10.read = (f9) obj2;
                    Object objInvokeSuspend = anonymousClass10.invokeSuspend(createfromparcel2);
                    int i5 = MediaBrowserCompatMediaItem + 69;
                    serializer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    throw null;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            long supportBackgroundTintMode;
            String str2;
            getOnRequesterReady getonrequesterready;
            Long l;
            ZonedDateTime zonedDateTimePlusSeconds;
            Integer num;
            List list;
            ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements;
            int i = 2 % 2;
            int i2 = MediaBrowserCompatMediaItem + 83;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.RemoteActionCompatParcelizer;
            Object obj2 = this.write;
            int iIntValue = 0;
            z = false;
            boolean z = false;
            iIntValue = 0;
            switch (i4) {
                case 0:
                    FontStyleSaverlambda0 fontStyleSaverlambda0 = (FontStyleSaverlambda0) this.IconCompatParcelizer;
                    getFailureResponseData getfailureresponsedata = (getFailureResponseData) this.read;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    GetBubbleUiState getBubbleUiState = (GetBubbleUiState) obj2;
                    String strIconCompatParcelizer = getBubbleUiState.write.IconCompatParcelizer(R.string.COURIER_AND_FRAGMENT_STATUS);
                    if (fontStyleSaverlambda0 != null && (str2 = fontStyleSaverlambda0.write) != null) {
                        strIconCompatParcelizer = str2;
                    }
                    if (fontStyleSaverlambda0 == null || (str = fontStyleSaverlambda0.IconCompatParcelizer) == null) {
                        str = getfailureresponsedata.serializer;
                    }
                    moveBasedOnParentOffset movebasedonparentoffset = getBubbleUiState.read;
                    isTrackingEnabled istrackingenabled = getfailureresponsedata.RemoteActionCompatParcelizer;
                    setLastHorizontalStyle setlasthorizontalstyle = movebasedonparentoffset.IconCompatParcelizer;
                    istrackingenabled.getClass();
                    switch (metaFor.IconCompatParcelizer[istrackingenabled.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                            supportBackgroundTintMode = setlasthorizontalstyle.IconCompatParcelizer().getSupportBackgroundTintMode();
                            break;
                        case 4:
                        case 5:
                        case 6:
                            supportBackgroundTintMode = setlasthorizontalstyle.IconCompatParcelizer().read();
                            break;
                        case 7:
                        case 8:
                        case 9:
                            supportBackgroundTintMode = setlasthorizontalstyle.IconCompatParcelizer().setSupportBackgroundTintList();
                            break;
                        case 10:
                            supportBackgroundTintMode = setlasthorizontalstyle.IconCompatParcelizer().getWindowSystemUiVisibility();
                            break;
                        default:
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                    }
                    return new allocateItemsIndex(strIconCompatParcelizer, str, supportBackgroundTintMode);
                case 1:
                    AndroidView_androidKtupdateViewHolderParams5 androidView_androidKtupdateViewHolderParams5 = (AndroidView_androidKtupdateViewHolderParams5) this.IconCompatParcelizer;
                    Map map = (Map) this.read;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (androidView_androidKtupdateViewHolderParams5 != null) {
                        int i5 = MediaBrowserCompatMediaItem + 111;
                        serializer = i5 % Fields.SpotShadowColor;
                        if (i5 % 2 != 0) {
                            getonrequesterready = androidView_androidKtupdateViewHolderParams5.countDownDetails;
                            int i6 = 33 / 0;
                        } else {
                            getonrequesterready = androidView_androidKtupdateViewHolderParams5.countDownDetails;
                        }
                    } else {
                        getonrequesterready = null;
                    }
                    if (getonrequesterready == null) {
                        return null;
                    }
                    List listSerializer = getonrequesterready.serializer();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listSerializer.iterator();
                    while (it.hasNext()) {
                        Long l2 = (Long) map.get(Long.valueOf(((Number) it.next()).longValue()));
                        if (l2 != null) {
                            arrayList.add(l2);
                        }
                    }
                    Long l3 = (Long) onContentCardDismissed.RatingCompat((Iterable) arrayList);
                    if (l3 == null) {
                        return null;
                    }
                    ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(l3.longValue()).plusSeconds(getonrequesterready.write()), ZoneId.systemDefault());
                    zonedDateTimeOfInstant.getClass();
                    return new ParagraphStyleSaverlambda1(zonedDateTimeOfInstant, getonrequesterready.write());
                case 2:
                    Object obj3 = this.IconCompatParcelizer;
                    Object obj4 = this.read;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Set set = (Set) ((MetricsBatchProcessor) obj2).IconCompatParcelizer;
                    if (obj4 instanceof isItemDismissable) {
                        obj4 = null;
                    }
                    if (onContentCardDismissed.write(set, obj4)) {
                        return (setFitInsetsSides) (obj3 instanceof isItemDismissable ? null : obj3);
                    }
                    return null;
                case 3:
                    Object obj5 = this.IconCompatParcelizer;
                    Object obj6 = this.read;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (obj5 instanceof isItemDismissable) {
                        obj5 = null;
                    }
                    AndroidPopup_androidKtPopup1 androidPopup_androidKtPopup1 = (AndroidPopup_androidKtPopup1) obj5;
                    if (androidPopup_androidKtPopup1 != null) {
                        return new r8lambdafHcIMtqslO5nN2ofGE631aElY(androidPopup_androidKtPopup1.title, androidPopup_androidKtPopup1.description, ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{androidPopup_androidKtPopup1.animation, "rate_equipment"}, getCieXyz.write())).booleanValue() ? R.raw.rate_equipment : R.raw.back_to_back_order);
                    }
                    AndroidPopup_androidKtPopup41invokeinlinedonDispose1 androidPopup_androidKtPopup41invokeinlinedonDispose1 = (AndroidPopup_androidKtPopup41invokeinlinedonDispose1) (obj6 instanceof isItemDismissable ? null : obj6);
                    return androidPopup_androidKtPopup41invokeinlinedonDispose1 != null ? new TextLayoutInput(androidPopup_androidKtPopup41invokeinlinedonDispose1.message) : ContainsCenterlambda0.RemoteActionCompatParcelizer;
                case 4:
                    PaintExtensions_androidKt paintExtensions_androidKt = (PaintExtensions_androidKt) this.IconCompatParcelizer;
                    ContainsAlllambda0 containsAlllambda0 = (ContainsAlllambda0) this.read;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    boolean z2 = containsAlllambda0 instanceof r8lambdafHcIMtqslO5nN2ofGE631aElY;
                    measurexDpz5zYdefault measurexdpz5zydefault = (measurexDpz5zYdefault) obj2;
                    MutableStateFlow mutableStateFlow = measurexdpz5zydefault.IconCompatParcelizer;
                    if (z2) {
                        measurexdpz5zydefault.RemoteActionCompatParcelizer.IconCompatParcelizer(new Integer(R.drawable.ic_bold_large_shopping_bag_paired_orders));
                        mutableStateFlow.IconCompatParcelizer(Boolean.valueOf(paintExtensions_androidKt instanceof getTextBounds));
                    } else {
                        mutableStateFlow.IconCompatParcelizer(Boolean.FALSE);
                        int i7 = MediaBrowserCompatMediaItem + 1;
                        serializer = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                    }
                    return createFromParcel.INSTANCE;
                case 5:
                    accessgetEmbeddedView accessgetembeddedview = (accessgetEmbeddedView) this.IconCompatParcelizer;
                    Map map2 = (Map) this.read;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (accessgetembeddedview == null || (list = accessgetembeddedview.deliveryIds) == null) {
                        l = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            int i9 = serializer + 41;
                            MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            Long l4 = (Long) map2.get(Long.valueOf(((Number) it2.next()).longValue()));
                            if (l4 != null) {
                                arrayList2.add(l4);
                            }
                        }
                        l = (Long) onContentCardDismissed.RatingCompat((Iterable) arrayList2);
                    }
                    Long l5 = accessgetembeddedview != null ? accessgetembeddedview.expirationTimestamp : null;
                    if (l5 != null) {
                        zonedDateTimePlusSeconds = ZonedDateTime.ofInstant(Instant.ofEpochSecond(l5.longValue()), ZoneId.systemDefault());
                    } else {
                        Integer num2 = accessgetembeddedview != null ? accessgetembeddedview.secondsToExpiry : null;
                        if (num2 == null || l == null) {
                            zonedDateTimePlusSeconds = null;
                        } else {
                            int i11 = MediaBrowserCompatMediaItem + 115;
                            serializer = i11 % Fields.SpotShadowColor;
                            int i12 = i11 % 2;
                            zonedDateTimePlusSeconds = ZonedDateTime.ofInstant(Instant.ofEpochMilli(l.longValue()), ZoneId.systemDefault()).plusSeconds(num2.intValue());
                        }
                    }
                    if (zonedDateTimePlusSeconds == null) {
                        return null;
                    }
                    int i13 = MediaBrowserCompatMediaItem + 27;
                    serializer = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 != 0) {
                        if (zonedDateTimePlusSeconds.isAfter(ZonedDateTime.now())) {
                            return null;
                        }
                    } else if (!zonedDateTimePlusSeconds.isAfter(ZonedDateTime.now())) {
                        return null;
                    }
                    boolean z3 = accessgetembeddedview != null && accessgetembeddedview.showTimer;
                    if (accessgetembeddedview != null && (num = accessgetembeddedview.secondsToExpiry) != null) {
                        int i14 = serializer + 77;
                        MediaBrowserCompatMediaItem = i14 % Fields.SpotShadowColor;
                        if (i14 % 2 == 0) {
                            num.intValue();
                            throw null;
                        }
                        iIntValue = num.intValue();
                    }
                    return new getLengthimpl(z3, zonedDateTimePlusSeconds, iIntValue);
                case 6:
                    timesmpE4wyQ timesmpe4wyq = (timesmpE4wyQ) this.IconCompatParcelizer;
                    isTrackingEnabled istrackingenabled2 = (isTrackingEnabled) this.read;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Set set2 = LastDropoffConfirmedEventImpl.IconCompatParcelizer;
                    if (istrackingenabled2 != isTrackingEnabled.WORKING && istrackingenabled2 != isTrackingEnabled.ENDING) {
                        return null;
                    }
                    Collection collectionValues = timesmpe4wyq.write.values();
                    if ((!(collectionValues instanceof Collection)) || !collectionValues.isEmpty()) {
                        Iterator it3 = collectionValues.iterator();
                        while (it3.hasNext()) {
                            if (LastDropoffConfirmedEventImpl.IconCompatParcelizer.contains((DeliveryInformation$DeliveryStatus) it3.next())) {
                                int i15 = serializer + 87;
                                MediaBrowserCompatMediaItem = i15 % Fields.SpotShadowColor;
                                if (i15 % 2 != 0) {
                                    return invoke58bKbWc.DROPOFF_IN_PROGRESS;
                                }
                                invoke58bKbWc invoke58bkbwc = invoke58bKbWc.DROPOFF_IN_PROGRESS;
                                throw null;
                            }
                        }
                    }
                    if (timesmpe4wyq.MediaMetadataCompat == DeliveryInformation$ScreenDataType.NO_DELIVERIES) {
                        return invoke58bKbWc.NO_DELIVERIES;
                    }
                    return null;
                case 7:
                    se seVar = (se) this.IconCompatParcelizer;
                    getWindowAreaDisplayMetrics getwindowareadisplaymetrics = (getWindowAreaDisplayMetrics) this.read;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    s6 s6Var = seVar.read;
                    if (s6Var == null) {
                        int i16 = serializer + 117;
                        MediaBrowserCompatMediaItem = i16 % Fields.SpotShadowColor;
                        if (i16 % 2 != 0) {
                            return Boolean.FALSE;
                        }
                        Boolean bool = Boolean.FALSE;
                        throw null;
                    }
                    if (getwindowareadisplaymetrics instanceof endRearDisplayPresentationSession) {
                        extensionWindowAreaStatusRequirements = ((endRearDisplayPresentationSession) getwindowareadisplaymetrics).IconCompatParcelizer;
                    } else {
                        if (!(getwindowareadisplaymetrics instanceof getRearDisplayPresentation)) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getwindowareadisplaymetrics, getWindowAreaStatus.read}, getCieXyz.write())).booleanValue()) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return null;
                            }
                            Boolean bool2 = Boolean.FALSE;
                            int i17 = serializer + 27;
                            MediaBrowserCompatMediaItem = i17 % Fields.SpotShadowColor;
                            if (i17 % 2 != 0) {
                                return bool2;
                            }
                            int i18 = 5 / 5;
                            return bool2;
                        }
                        extensionWindowAreaStatusRequirements = ((getRearDisplayPresentation) getwindowareadisplaymetrics).RemoteActionCompatParcelizer;
                    }
                    o7ExternalSyntheticLambda3 o7externalsyntheticlambda3 = new o7ExternalSyntheticLambda3(extensionWindowAreaStatusRequirements.serializer, extensionWindowAreaStatusRequirements.read);
                    ArrayList arrayList3 = s6Var.serializer;
                    IsRiderInsideActiveAreaBoundaryImpl isRiderInsideActiveAreaBoundaryImpl = (IsRiderInsideActiveAreaBoundaryImpl) obj2;
                    if (!arrayList3.isEmpty()) {
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            if (isRiderInsideActiveAreaBoundaryImpl.RemoteActionCompatParcelizer.invoke(o7externalsyntheticlambda3, (List) it4.next())) {
                                z = true;
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                default:
                    sc scVar = (sc) this.IconCompatParcelizer;
                    f9 f9Var = (f9) this.read;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((subscribeToBannersUpdateslambda2) ((CombinedScopeView) obj2).write).read(), "ON_DEMAND"}, getCieXyz.write())).booleanValue() || scVar == sc.SCHEDULE) ? f9Var : new f9(instance_delegatelambda0.write);
            }
        }
    }

    public GetBubbleUiState(GetRiderStatusImpl getRiderStatusImpl, moveBasedOnParentOffset movebasedonparentoffset, setTransactionSuccessful settransactionsuccessful, zzz zzzVar) {
        this.IconCompatParcelizer = getRiderStatusImpl;
        this.read = movebasedonparentoffset;
        this.write = settransactionsuccessful;
        this.RemoteActionCompatParcelizer = zzzVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        forEachUpdatedRect foreachupdatedrect;
        int i = 2;
        int i2 = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (continuationImpl instanceof forEachUpdatedRect) {
            int i3 = MediaMetadataCompat + 67;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = ((forEachUpdatedRect) continuationImpl).RemoteActionCompatParcelizer;
                throw null;
            }
            foreachupdatedrect = (forEachUpdatedRect) continuationImpl;
            int i5 = foreachupdatedrect.RemoteActionCompatParcelizer;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                foreachupdatedrect.RemoteActionCompatParcelizer = i5 - Integer.MIN_VALUE;
            } else {
                foreachupdatedrect = new forEachUpdatedRect(this, continuationImpl);
            }
        } else {
            foreachupdatedrect = new forEachUpdatedRect(this, continuationImpl);
        }
        Object obj = foreachupdatedrect.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = foreachupdatedrect.RemoteActionCompatParcelizer;
        int i7 = 0;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            foreachupdatedrect.RemoteActionCompatParcelizer = 1;
            StateProviderImpl$special$$inlined$map$2 stateProviderImpl$special$$inlined$map$2 = new StateProviderImpl$special$$inlined$map$2(FlowKt.serializer(new WorkSpecDaoKt$dedup$$inlined$map$1(i, new StateProviderImpl$special$$inlined$map$2(((StateProviderImpl) ((accesstoNestedScrollSource) ((accessrequireViewFactoryHolder) this.RemoteActionCompatParcelizer.serializer))).MediaBrowserCompatMediaItem, 4))), 5);
            if (stateProviderImpl$special$$inlined$map$2 == coroutineSingletons) {
                int i8 = MediaMetadataCompat + 109;
                serializer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    int i9 = 22 / 0;
                }
                return coroutineSingletons;
            }
            obj = stateProviderImpl$special$$inlined$map$2;
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i10 = MediaMetadataCompat + 43;
                serializer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    int i11 = 82 / 0;
                }
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1((Flow) obj, this.IconCompatParcelizer.IconCompatParcelizer(), new AnonymousClass2(this, shortNewsContentCardView, i7));
    }
}
