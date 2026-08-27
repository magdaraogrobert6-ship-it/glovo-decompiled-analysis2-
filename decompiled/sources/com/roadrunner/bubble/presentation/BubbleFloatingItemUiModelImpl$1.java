package com.roadrunner.bubble.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$1;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import com.roadrunner.rider.state.domain.GetRiderStateImpl$invoke$1;
import com.roadrunner.rider.state.provider.domain.ObserveRiderSessionEventsImpl$invoke$$inlined$map$1;
import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl$get$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1;
import o.ShortNewsContentCardView;
import o.allocateItemsIndex;
import o.createFromParcel;
import o.debugString;
import o.dispatchChildDetached;
import o.displayInAppMessagelambda1;
import o.findContainingItemView;
import o.forEachFocusableIntersection;
import o.getContentViewGroupParentLayout;
import o.getMnc;
import o.isTrackingEnabled;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class BubbleFloatingItemUiModelImpl$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ forEachFocusableIntersection RemoteActionCompatParcelizer;
    public int write;

    /* JADX INFO: renamed from: com.roadrunner.bubble.presentation.BubbleFloatingItemUiModelImpl$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        private static int read = 0;
        private static int write = 1;
        public final /* synthetic */ forEachFocusableIntersection IconCompatParcelizer;
        public final /* synthetic */ int RemoteActionCompatParcelizer;

        public /* synthetic */ AnonymousClass1(forEachFocusableIntersection foreachfocusableintersection, int i) {
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = foreachfocusableintersection;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0032  */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
        
            if (r1.invoke(r5) == r7) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
        
            if (r9 == r7) goto L41;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(o.getMnc r17, o.ShortNewsContentCardView r18) {
            /*
                Method dump skipped, instruction units count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.bubble.presentation.BubbleFloatingItemUiModelImpl$1.AnonymousClass1.emit(o.getMnc, o.ShortNewsContentCardView):java.lang.Object");
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = write + 111;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (this.RemoteActionCompatParcelizer == 0) {
                return emit((getMnc) obj, shortNewsContentCardView);
            }
            debugString debugstring = (debugString) obj;
            forEachFocusableIntersection foreachfocusableintersection = this.IconCompatParcelizer;
            foreachfocusableintersection.RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(debugstring instanceof allocateItemsIndex));
            foreachfocusableintersection.read.IconCompatParcelizer(debugstring);
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i4 = read + 35;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return createfromparcel;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BubbleFloatingItemUiModelImpl$1(forEachFocusableIntersection foreachfocusableintersection, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = foreachfocusableintersection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.IconCompatParcelizer;
        forEachFocusableIntersection foreachfocusableintersection = this.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            BubbleFloatingItemUiModelImpl$1 bubbleFloatingItemUiModelImpl$1 = new BubbleFloatingItemUiModelImpl$1(foreachfocusableintersection, shortNewsContentCardView, 0);
            int i4 = read + 43;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return bubbleFloatingItemUiModelImpl$1;
            }
            throw null;
        }
        int i5 = 1;
        if (i3 == 1) {
            return new BubbleFloatingItemUiModelImpl$1(foreachfocusableintersection, shortNewsContentCardView, i5);
        }
        BubbleFloatingItemUiModelImpl$1 bubbleFloatingItemUiModelImpl$2 = new BubbleFloatingItemUiModelImpl$1(foreachfocusableintersection, shortNewsContentCardView, i);
        int i6 = read + 1;
        serializer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return bubbleFloatingItemUiModelImpl$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 69;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((BubbleFloatingItemUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 == 1) {
            return ((BubbleFloatingItemUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((BubbleFloatingItemUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = read + 109;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        forEachFocusableIntersection foreachfocusableintersection = this.RemoteActionCompatParcelizer;
        int i5 = 3;
        int i6 = 4;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i7 = 1;
        if (i4 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = this.write;
            if (i8 != 0) {
                if (i8 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i9 = serializer + 113;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i11 = 0;
            FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(new SideMenuCacheImpl$get$$inlined$map$1(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(null, new ObserveRiderSessionEventsImpl$invoke$$inlined$map$1(foreachfocusableintersection.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer.IconCompatParcelizer(), i11), new GetRiderStateImpl$invoke$1(i5, 9, shortNewsContentCardView))), SQLite.read(isTrackingEnabled.WORKING, isTrackingEnabled.ENDING, isTrackingEnabled.READY), SQLite.read(isTrackingEnabled.NOT_WORKING, isTrackingEnabled.STARTING, isTrackingEnabled.LATE, isTrackingEnabled.AVAILABLE), i6));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(foreachfocusableintersection, i11);
            this.write = 1;
            if (flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.collect(anonymousClass1, this) != coroutineSingletons) {
                return createfromparcel;
            }
            int i12 = serializer + 121;
            read = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                int i13 = 82 / 0;
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            dispatchChildDetached dispatchchilddetached = foreachfocusableintersection.RatingCompat;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i14 = this.write;
            if (i14 != 0) {
                int i15 = read + 113;
                serializer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0 ? i14 != 1 : i14 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            RiderStateRepositoryImpl riderStateRepositoryImpl = (RiderStateRepositoryImpl) dispatchchilddetached;
            if (!riderStateRepositoryImpl.write()) {
                BuildersKt.RemoteActionCompatParcelizer(foreachfocusableintersection.IconCompatParcelizer, null, null, new BubbleFloatingItemUiModelImpl$1(foreachfocusableintersection, shortNewsContentCardView, i2), 3);
                return createfromparcel;
            }
            Flow flow = riderStateRepositoryImpl.read(displayInAppMessagelambda1.serializer(findContainingItemView.class));
            FlowLiveDataConversions$asLiveData$1$1 flowLiveDataConversions$asLiveData$1$1 = new FlowLiveDataConversions$asLiveData$1$1(i6, foreachfocusableintersection);
            this.write = 1;
            return flow.collect(flowLiveDataConversions$asLiveData$1$1, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i16 = this.write;
        if (i16 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            GetBubbleUiState getBubbleUiState = foreachfocusableintersection.serializer;
            this.write = 1;
            obj = getBubbleUiState.invoke(this);
            if (obj != coroutineSingletons3) {
            }
            i = read + 1;
            serializer = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i17 = 4 % 4;
            }
            return coroutineSingletons3;
        }
        int i18 = serializer + 35;
        read = i18 % Fields.SpotShadowColor;
        int i19 = i18 % 2;
        if (i16 != 1) {
            if (i16 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        AnonymousClass1 anonymousClass2 = new AnonymousClass1(foreachfocusableintersection, i7);
        this.write = 2;
        if (((Flow) obj).collect(anonymousClass2, this) != coroutineSingletons3) {
            return createfromparcel;
        }
        i = read + 1;
        serializer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i110 = 4 % 4;
        }
        return coroutineSingletons3;
    }
}
