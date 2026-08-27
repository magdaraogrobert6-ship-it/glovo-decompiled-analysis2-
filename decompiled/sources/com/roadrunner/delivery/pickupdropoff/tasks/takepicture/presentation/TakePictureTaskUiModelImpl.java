package com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation;

import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.api.extension.FlowExtensionsKt;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.home.nest.NestViewModel$observeNestScope$1;
import com.roadrunner.rider.safety.report.domain.MapSafetyReportResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.IntSize;
import o.LinearFontScaleConverter;
import o.PreviewLogger;
import o.ShortNewsContentCardView;
import o.accessgetLOREM_IPSUM_SOURCEp;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.fastFilterNotNull;
import o.getContentViewGroupParentLayout;
import o.getFocusIndeximpl;
import o.getHasFixedWidthimpl;
import o.getMinHeightimpl;
import o.getPositionannotations;
import o.getQueryContext;
import o.isItemDismissable;
import o.millisToNanos;
import o.minHeightOffsets;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.roundToIntRect;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class TakePictureTaskUiModelImpl implements minHeightOffsets {
    private static int ResultReceiver = 0;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 1;
    public final getQueryContext IconCompatParcelizer;
    public final DeliveryConfirmationLoggerImpl MediaBrowserCompatMediaItem;
    public final long MediaDescriptionCompat;
    public final GetDeliveryAnalyticsUseCaseImpl MediaMetadataCompat;
    public final fastFilterNotNull MediaSessionCompatQueueItem;
    public final ObserveTaskByTypeAndIdUseCaseImpl MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public final MapSafetyReportResponse ParcelableVolumeInfo;
    public final UpdateTaskUseCaseImpl PlaybackStateCompat;
    public final StateFlow PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public final millisToNanos RemoteActionCompatParcelizer;
    public getPositionannotations read;
    public final MutableStateFlow serializer;
    public final ContextScope write;

    /* JADX INFO: renamed from: com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;
        public final /* synthetic */ TakePictureTaskUiModelImpl IconCompatParcelizer;
        public int read;
        public final /* synthetic */ int serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(TakePictureTaskUiModelImpl takePictureTaskUiModelImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.serializer = i;
            this.IconCompatParcelizer = takePictureTaskUiModelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = write + 39;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = this.serializer;
            TakePictureTaskUiModelImpl takePictureTaskUiModelImpl = this.IconCompatParcelizer;
            if (i5 == 0) {
                return new AnonymousClass1(takePictureTaskUiModelImpl, shortNewsContentCardView, 0);
            }
            int i6 = 1;
            if (i5 != 1) {
                return i5 != 2 ? new AnonymousClass1(takePictureTaskUiModelImpl, shortNewsContentCardView, 3) : new AnonymousClass1(takePictureTaskUiModelImpl, shortNewsContentCardView, i);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(takePictureTaskUiModelImpl, shortNewsContentCardView, i6);
            int i7 = write + 25;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                return anonymousClass1;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = write + 17;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            int i3 = this.serializer;
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i3 == 0) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            if (i3 != 1) {
                return i3 != 2 ? ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2) : ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            Object objInvokeSuspend = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            int i4 = write + 101;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code duplicated, block: B:58:0x0133  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objInvoke;
            int i = 2 % 2;
            int i2 = this.serializer;
            TakePictureTaskUiModelImpl takePictureTaskUiModelImpl = this.IconCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (i2 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.read;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl = takePictureTaskUiModelImpl.MediaSessionCompatResultReceiverWrapper;
                fastFilterNotNull fastfilternotnull = takePictureTaskUiModelImpl.MediaSessionCompatQueueItem;
                FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1Write = FlowExtensionsKt.write(observeTaskByTypeAndIdUseCaseImpl.serializer(fastfilternotnull.deliveryId, fastfilternotnull.action, takePictureTaskUiModelImpl.MediaSessionCompatToken, displayInAppMessagelambda1.serializer(accessgetLOREM_IPSUM_SOURCEp.class)), takePictureTaskUiModelImpl.serializer, IntSize.read, "TakePictureTaskUiModelImpl: Error observing take picture task by type and ID.");
                NestViewModel$observeNestScope$1.AnonymousClass1 anonymousClass1 = new NestViewModel$observeNestScope$1.AnonymousClass1(16, takePictureTaskUiModelImpl);
                this.read = 1;
                return flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1Write.collect(anonymousClass1, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            if (i2 == 1) {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.read;
                if (i4 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return TakePictureTaskUiModelImpl.access$loadAnalytics(takePictureTaskUiModelImpl, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
                }
                if (i4 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            if (i2 == 2) {
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.read;
                if (i5 != 0) {
                    int i6 = write + 91;
                    RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0 ? i5 != 1 : i5 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.read = 1;
                accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcepSerializer = takePictureTaskUiModelImpl.serializer();
                if (accessgetlorem_ipsum_sourcepSerializer == null) {
                    objInvoke = createfromparcel;
                } else {
                    List list = accessgetlorem_ipsum_sourcepSerializer.images;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        int i7 = write + 65;
                        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        if (obj2 instanceof getHasFixedWidthimpl) {
                            arrayList.add(obj2);
                        }
                    }
                    objInvoke = takePictureTaskUiModelImpl.PlaybackStateCompat.invoke(takePictureTaskUiModelImpl.MediaDescriptionCompat, takePictureTaskUiModelImpl.RatingCompat, accessgetLOREM_IPSUM_SOURCEp.serializer(accessgetlorem_ipsum_sourcepSerializer, arrayList, "", 24063), displayInAppMessagelambda1.serializer(accessgetLOREM_IPSUM_SOURCEp.class), this);
                    if (objInvoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objInvoke = createfromparcel;
                    }
                }
                if (objInvoke != coroutineSingletons3) {
                    return createfromparcel;
                }
                int i9 = RemoteActionCompatParcelizer + 27;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return coroutineSingletons3;
            }
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i11 = this.read;
            if (i11 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (takePictureTaskUiModelImpl.read == null) {
                    this.read = 1;
                    if (TakePictureTaskUiModelImpl.access$loadAnalytics(takePictureTaskUiModelImpl, this) != coroutineSingletons4) {
                    }
                }
                return coroutineSingletons4;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcepSerializer2 = takePictureTaskUiModelImpl.serializer();
            getMinHeightimpl getminheightimplIconCompatParcelizer = accessgetlorem_ipsum_sourcepSerializer2 != null ? TakePictureTaskUiModelImpl.IconCompatParcelizer(accessgetlorem_ipsum_sourcepSerializer2) : null;
            if (accessgetlorem_ipsum_sourcepSerializer2 != null) {
                int i12 = RemoteActionCompatParcelizer + 23;
                write = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (getminheightimplIconCompatParcelizer != null) {
                    Uri uri = getminheightimplIconCompatParcelizer.photoData.imageUri;
                    String string = uri.toString();
                    string.getClass();
                    String string2 = uri.toString();
                    string2.getClass();
                    getHasFixedWidthimpl gethasfixedwidthimpl = new getHasFixedWidthimpl(string, string2);
                    takePictureTaskUiModelImpl.MediaBrowserCompatMediaItem.read(takePictureTaskUiModelImpl.read, accessgetlorem_ipsum_sourcepSerializer2.taskId);
                    List list2 = accessgetlorem_ipsum_sourcepSerializer2.images;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (obj3 instanceof getHasFixedWidthimpl) {
                            arrayList2.add(obj3);
                        }
                    }
                    accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcepSerializer3 = accessgetLOREM_IPSUM_SOURCEp.serializer(accessgetlorem_ipsum_sourcepSerializer2, onContentCardDismissed.RemoteActionCompatParcelizer((Collection) arrayList2, (Object) gethasfixedwidthimpl), null, 32255);
                    UpdateTaskUseCaseImpl updateTaskUseCaseImpl = takePictureTaskUiModelImpl.PlaybackStateCompat;
                    long j = takePictureTaskUiModelImpl.MediaDescriptionCompat;
                    String str = takePictureTaskUiModelImpl.RatingCompat;
                    r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(accessgetLOREM_IPSUM_SOURCEp.class);
                    this.read = 2;
                    if (updateTaskUseCaseImpl.invoke(j, str, accessgetlorem_ipsum_sourcepSerializer3, r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, this) != coroutineSingletons4) {
                        return createfromparcel;
                    }
                    return coroutineSingletons4;
                }
            }
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("TakePictureTaskUiModelImpl: unexpected calling onPhotoCaptureSuccess when where is no taking photo ui", new Object[0]);
            return createfromparcel;
        }
    }

    @Override // o.minHeightOffsets
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = ResultReceiver + 19;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.MediaSessionCompatToken;
        }
        int i3 = 97 / 0;
        return this.MediaSessionCompatToken;
    }

    public TakePictureTaskUiModelImpl(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str, ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl, UpdateTaskUseCaseImpl updateTaskUseCaseImpl, millisToNanos millistonanos, MapSafetyReportResponse mapSafetyReportResponse, GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl, getQueryContext getquerycontext, DeliveryConfirmationLoggerImpl deliveryConfirmationLoggerImpl) {
        str.getClass();
        observeTaskByTypeAndIdUseCaseImpl.getClass();
        updateTaskUseCaseImpl.getClass();
        millistonanos.getClass();
        mapSafetyReportResponse.getClass();
        getDeliveryAnalyticsUseCaseImpl.getClass();
        getquerycontext.getClass();
        deliveryConfirmationLoggerImpl.getClass();
        this.MediaSessionCompatQueueItem = fastfilternotnull;
        this.write = contextScope;
        this.MediaSessionCompatToken = str;
        this.MediaSessionCompatResultReceiverWrapper = observeTaskByTypeAndIdUseCaseImpl;
        this.PlaybackStateCompat = updateTaskUseCaseImpl;
        this.RemoteActionCompatParcelizer = millistonanos;
        this.ParcelableVolumeInfo = mapSafetyReportResponse;
        this.MediaMetadataCompat = getDeliveryAnalyticsUseCaseImpl;
        this.IconCompatParcelizer = getquerycontext;
        this.MediaBrowserCompatMediaItem = deliveryConfirmationLoggerImpl;
        this.MediaDescriptionCompat = fastfilternotnull.deliveryId;
        this.RatingCompat = fastfilternotnull.action;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(IntSize.read);
        this.serializer = mutableStateFlow;
        this.PlaybackStateCompatCustomAction = mutableStateFlow;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 1), 3);
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(this.write, null, null, new AnonymousClass1(this, null, 3), 3);
        int i2 = ResultReceiver + 25;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void write() {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(this.write, null, null, new AnonymousClass1(this, null, 2), 3);
        int i2 = ResultReceiver + 53;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public static getMinHeightimpl IconCompatParcelizer(accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcep) {
        getMinHeightimpl getminheightimpl;
        Object next;
        int i = 2 % 2;
        int i2 = ResultReceiver + 99;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        List list = accessgetlorem_ipsum_sourcep.images;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof getMinHeightimpl));
            getminheightimpl = (getMinHeightimpl) next;
        } else {
            getminheightimpl = null;
        }
        int i4 = ResultReceiver + 13;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return getminheightimpl;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[LOOP:0: B:14:0x0048->B:26:?, LOOP_END, SYNTHETIC] */
    public final accessgetLOREM_IPSUM_SOURCEp serializer() {
        roundToIntRect roundtointrect;
        Iterator it;
        int i = 2 % 2;
        Object obj = this.serializer.read();
        Object obj2 = null;
        if (obj instanceof roundToIntRect) {
            int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 125;
            ResultReceiver = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            roundtointrect = (roundToIntRect) obj;
        } else {
            int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 69;
            ResultReceiver = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            roundtointrect = null;
        }
        if (roundtointrect == null) {
            return null;
        }
        accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcep = roundtointrect.serializer;
        List list = accessgetlorem_ipsum_sourcep.images;
        if (list instanceof Collection) {
            int i6 = ResultReceiver + 71;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (!list.isEmpty()) {
                it = list.iterator();
                while (!(!it.hasNext())) {
                    if (((getFocusIndeximpl) it.next()) instanceof getMinHeightimpl) {
                        return accessgetlorem_ipsum_sourcep;
                    }
                }
            }
        } else {
            it = list.iterator();
            while (!(!it.hasNext())) {
                if (((getFocusIndeximpl) it.next()) instanceof getMinHeightimpl) {
                    return accessgetlorem_ipsum_sourcep;
                }
            }
        }
        int i8 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 121;
        ResultReceiver = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public static final Object access$loadAnalytics(TakePictureTaskUiModelImpl takePictureTaskUiModelImpl, ContinuationImpl continuationImpl) {
        LinearFontScaleConverter linearFontScaleConverter;
        Object objM4939invoke0E7RQCE;
        int i = 2 % 2;
        takePictureTaskUiModelImpl.getClass();
        if (continuationImpl instanceof LinearFontScaleConverter) {
            int i2 = ResultReceiver + 53;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            linearFontScaleConverter = (LinearFontScaleConverter) continuationImpl;
            int i4 = linearFontScaleConverter.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                linearFontScaleConverter.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                linearFontScaleConverter = new LinearFontScaleConverter(takePictureTaskUiModelImpl, continuationImpl);
            }
        } else {
            linearFontScaleConverter = new LinearFontScaleConverter(takePictureTaskUiModelImpl, continuationImpl);
        }
        Object obj = linearFontScaleConverter.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = linearFontScaleConverter.RemoteActionCompatParcelizer;
        if (i5 != 0) {
            int i6 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 63;
            ResultReceiver = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4939invoke0E7RQCE = ((onItemDismiss) obj).IconCompatParcelizer;
            int i8 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 41;
            ResultReceiver = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 3 % 3;
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl = takePictureTaskUiModelImpl.MediaMetadataCompat;
            long j = takePictureTaskUiModelImpl.MediaDescriptionCompat;
            String str = takePictureTaskUiModelImpl.RatingCompat;
            linearFontScaleConverter.RemoteActionCompatParcelizer = 1;
            objM4939invoke0E7RQCE = getDeliveryAnalyticsUseCaseImpl.m4939invoke0E7RQCE(j, str, linearFontScaleConverter);
            if (objM4939invoke0E7RQCE == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (!(objM4939invoke0E7RQCE instanceof isItemDismissable)) {
            getPositionannotations getpositionannotations = ((PreviewLogger) objM4939invoke0E7RQCE).serializer;
            takePictureTaskUiModelImpl.read = getpositionannotations;
            if (getpositionannotations == null) {
                int i10 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 5;
                ResultReceiver = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("TakePictureTaskUiModelImpl: Analytics bundle is null in tasks response!", new Object[1]);
                } else {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("TakePictureTaskUiModelImpl: Analytics bundle is null in tasks response!", new Object[0]);
                }
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4939invoke0E7RQCE);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "TakePictureTaskUiModelImpl: Analytics failed to load.", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }
}
