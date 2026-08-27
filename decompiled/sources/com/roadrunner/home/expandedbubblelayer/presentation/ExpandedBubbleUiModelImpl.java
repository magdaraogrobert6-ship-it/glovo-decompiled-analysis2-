package com.roadrunner.home.expandedbubblelayer.presentation;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.map.container.context.GetMapScope$invoke$4;
import com.roadrunner.overlay.bubble.permission.data.OverlayBubbleDatastoreImpl$setPermissionGranted$2$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.DiskLruCacheEditor;
import o.LayoutWithLinksAndInlineContent11Od_4g;
import o.ShortNewsContentCardView;
import o.StaticImageDecoder;
import o.accessisRelatedToAutoCommit;
import o.applyMeasureResultfoundation;
import o.createFromParcel;
import o.getCharSequenceBounds;
import o.getContentViewGroupParentLayout;
import o.inCompatibilityMode;
import o.isAdapterPositionOnScreen;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.requiredWidthInVpY3zN4default;
import o.setNextTransition;
import o.setReenterTransition;

/* JADX INFO: loaded from: classes3.dex */
public final class ExpandedBubbleUiModelImpl {
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final MutableStateFlow serializer;
    public final setNextTransition write;

    public ExpandedBubbleUiModelImpl(SaveHeatmapUrlImpl saveHeatmapUrlImpl, setReenterTransition setreentertransition, setNextTransition setnexttransition, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getcontentviewgroupparentlayout.getClass();
        this.write = setnexttransition;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.serializer = mutableStateFlow;
        this.read = mutableStateFlow;
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(28, saveHeatmapUrlImpl));
        FlowKt.RemoteActionCompatParcelizer(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(this, null), setreentertransition.write), new GetMapScope$invoke$4(3, 4, null)), getcontentviewgroupparentlayout);
    }

    /* JADX INFO: renamed from: com.roadrunner.home.expandedbubblelayer.presentation.ExpandedBubbleUiModelImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int IconCompatParcelizer = 0;
        private static int MediaMetadataCompat = 1;
        public final /* synthetic */ int RemoteActionCompatParcelizer;
        public /* synthetic */ boolean read;
        public final /* synthetic */ Object serializer;
        public int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, AnchoredDraggableState anchoredDraggableState, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = 1;
            this.read = z;
            this.serializer = anchoredDraggableState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, boolean z, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = i;
            this.serializer = obj;
            this.read = z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ExpandedBubbleUiModelImpl expandedBubbleUiModelImpl, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = 0;
            this.serializer = expandedBubbleUiModelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = IconCompatParcelizer + 81;
            MediaMetadataCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = this.RemoteActionCompatParcelizer;
            Object obj2 = this.serializer;
            if (i4 == 0) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((ExpandedBubbleUiModelImpl) obj2, shortNewsContentCardView);
                anonymousClass1.read = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }
            if (i4 != 1) {
                return i4 != 2 ? new AnonymousClass1((DiskLruCacheEditor) obj2, this.read, shortNewsContentCardView, 3) : new AnonymousClass1((StaticImageDecoder) obj2, this.read, shortNewsContentCardView, i);
            }
            AnonymousClass1 anonymousClass2 = new AnonymousClass1(this.read, (AnchoredDraggableState) obj2, shortNewsContentCardView);
            int i5 = MediaMetadataCompat + 85;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return anonymousClass2;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = MediaMetadataCompat + 25;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (i4 != 0) {
                if (i4 != 1) {
                    return i4 != 2 ? ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel) : ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                }
                return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            }
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            Object objInvokeSuspend = ((AnonymousClass1) create(bool, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            int i5 = MediaMetadataCompat + 45;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            requiredWidthInVpY3zN4default requiredwidthinvpy3zn4defaultSerializer;
            int i = 2;
            int i2 = 2 % 2;
            int i3 = IconCompatParcelizer + 103;
            MediaMetadataCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = this.RemoteActionCompatParcelizer;
            Object obj2 = this.serializer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (i5 == 0) {
                boolean z = this.read;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.write;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                MutableStateFlow mutableStateFlow = ((ExpandedBubbleUiModelImpl) obj2).serializer;
                this.read = z;
                this.write = 1;
                mutableStateFlow.emit(Boolean.valueOf(z), this);
                if (createfromparcel != coroutineSingletons) {
                    return createfromparcel;
                }
                int i7 = IconCompatParcelizer + 19;
                MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return coroutineSingletons;
            }
            if (i5 == 1) {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.write;
                if (i9 != 0) {
                    int i10 = IconCompatParcelizer + 37;
                    MediaMetadataCompat = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    if (i9 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    int i12 = MediaMetadataCompat + 47;
                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (!this.read) {
                    return createfromparcel;
                }
                AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) obj2;
                getCharSequenceBounds getcharsequencebounds = getCharSequenceBounds.ANCHORED;
                this.write = 1;
                accessisRelatedToAutoCommit accessisrelatedtoautocommit = AnchoredDraggableKt.serializer;
                if (anchoredDraggableState.serializer()) {
                    int i14 = IconCompatParcelizer + 87;
                    MediaMetadataCompat = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    requiredwidthinvpy3zn4defaultSerializer = anchoredDraggableState.MediaSessionCompatResultReceiverWrapper;
                    if (requiredwidthinvpy3zn4defaultSerializer == null) {
                        removeNodeAtDepth.serializer("snapAnimationSpec");
                        throw null;
                    }
                } else {
                    requiredwidthinvpy3zn4defaultSerializer = LayoutWithLinksAndInlineContent11Od_4g.serializer();
                }
                Object objAnchoredDrag = anchoredDraggableState.anchoredDrag(getcharsequencebounds, applyMeasureResultfoundation.Default, new AnchoredDraggableKt$animateTo$4(anchoredDraggableState, requiredwidthinvpy3zn4defaultSerializer, null), this);
                if (objAnchoredDrag != coroutineSingletons2) {
                    objAnchoredDrag = createfromparcel;
                }
                return objAnchoredDrag == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
            }
            if (i5 == 2) {
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.write;
                if (i16 != 0) {
                    if (i16 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                StaticImageDecoder staticImageDecoder = (StaticImageDecoder) obj2;
                performCustomExitMxy_nc0 performcustomexitmxy_nc0 = staticImageDecoder.RemoteActionCompatParcelizer;
                OverlayBubbleDatastoreImpl$setPermissionGranted$2$1 overlayBubbleDatastoreImpl$setPermissionGranted$2$1 = new OverlayBubbleDatastoreImpl$setPermissionGranted$2$1(staticImageDecoder, this.read, null);
                this.write = 1;
                return pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, overlayBubbleDatastoreImpl$setPermissionGranted$2$1, this) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
            }
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i17 = this.write;
            if (i17 != 0) {
                if (i17 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            StaticImageDecoder staticImageDecoder2 = ((DiskLruCacheEditor) obj2).read;
            boolean z2 = this.read;
            this.write = 1;
            ((inCompatibilityMode) staticImageDecoder2.IconCompatParcelizer).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new AnonymousClass1(staticImageDecoder2, z2, shortNewsContentCardView, i), this);
            if (objWithContext != coroutineSingletons4) {
                objWithContext = createfromparcel;
            }
            if (objWithContext != coroutineSingletons4) {
                return createfromparcel;
            }
            int i18 = MediaMetadataCompat + 105;
            IconCompatParcelizer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            return coroutineSingletons4;
        }
    }
}
