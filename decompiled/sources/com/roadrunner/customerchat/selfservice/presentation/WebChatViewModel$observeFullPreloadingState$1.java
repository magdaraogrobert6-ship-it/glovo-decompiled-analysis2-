package com.roadrunner.customerchat.selfservice.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.location.toggle.presentation.GetLocationToggleUiState$invoke$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getHasStaleResolvedFonts;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class WebChatViewModel$observeFullPreloadingState$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ WebChatViewModel RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebChatViewModel$observeFullPreloadingState$1(WebChatViewModel webChatViewModel, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.RemoteActionCompatParcelizer = webChatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 17;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.write;
        WebChatViewModel webChatViewModel = this.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            int i5 = 1;
            if (i4 != 1) {
                return i4 != 2 ? new WebChatViewModel$observeFullPreloadingState$1(webChatViewModel, shortNewsContentCardView, 3) : new WebChatViewModel$observeFullPreloadingState$1(webChatViewModel, shortNewsContentCardView, i);
            }
            return new WebChatViewModel$observeFullPreloadingState$1(webChatViewModel, shortNewsContentCardView, i5);
        }
        WebChatViewModel$observeFullPreloadingState$1 webChatViewModel$observeFullPreloadingState$1 = new WebChatViewModel$observeFullPreloadingState$1(webChatViewModel, shortNewsContentCardView, 0);
        int i6 = serializer + 93;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return webChatViewModel$observeFullPreloadingState$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i2 == 0) {
            return ((WebChatViewModel$observeFullPreloadingState$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i2 == 1) {
            return ((WebChatViewModel$observeFullPreloadingState$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i2 != 2) {
            Object objInvokeSuspend = ((WebChatViewModel$observeFullPreloadingState$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i3 = read + 119;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return objInvokeSuspend;
        }
        Object objInvokeSuspend2 = ((WebChatViewModel$observeFullPreloadingState$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = serializer + 51;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return objInvokeSuspend2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        WebChatViewModel webChatViewModel = this.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.IconCompatParcelizer;
            if (i4 != 0) {
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i5 = read + 31;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.IconCompatParcelizer = 1;
            Object objCollect = webChatViewModel.MediaSessionCompatQueueItem.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.collect(new WebChatViewModel$observeBridgeMessage$2(webChatViewModel, 0), this);
            if (objCollect != coroutineSingletons) {
                objCollect = createfromparcel;
            }
            if (objCollect != coroutineSingletons) {
                return createfromparcel;
            }
            int i7 = serializer + 111;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                return coroutineSingletons;
            }
            shortNewsContentCardView.hashCode();
            throw null;
        }
        if (i3 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = this.IconCompatParcelizer;
            if (i8 != 0) {
                int i9 = serializer + 53;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (i8 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i11 = serializer + 111;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                SharedFlowImpl sharedFlowImpl = webChatViewModel.ParcelableVolumeInfo.MediaDescriptionCompat.serializer;
                WebChatViewModel$observeBridgeMessage$2 webChatViewModel$observeBridgeMessage$2 = new WebChatViewModel$observeBridgeMessage$2(webChatViewModel, 1);
                this.IconCompatParcelizer = 1;
                sharedFlowImpl.getClass();
                if (SharedFlowImpl.collect$suspendImpl(sharedFlowImpl, webChatViewModel$observeBridgeMessage$2, this) == coroutineSingletons2) {
                    int i13 = serializer + 103;
                    read = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 == 0) {
                        return coroutineSingletons2;
                    }
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
            }
            DrawableTransformation.read();
            return null;
        }
        int i14 = 3;
        if (i3 != 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i15 = this.IconCompatParcelizer;
            if (i15 != 0) {
                if (i15 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            StateFlow stateFlow = webChatViewModel.IconCompatParcelizer;
            WebChatViewModel$fetchChatUrl$1.AnonymousClass2 anonymousClass2 = new WebChatViewModel$fetchChatUrl$1.AnonymousClass2(webChatViewModel, shortNewsContentCardView, i14);
            this.IconCompatParcelizer = 1;
            return FlowKt.collectLatest(stateFlow, anonymousClass2, this) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i16 = this.IconCompatParcelizer;
        if (i16 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getHasStaleResolvedFonts gethasstaleresolvedfonts = webChatViewModel.MediaSessionCompatQueueItem;
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(gethasstaleresolvedfonts.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, gethasstaleresolvedfonts.PlaybackStateCompatCustomAction, new GetLocationToggleUiState$invoke$1(i14, i, shortNewsContentCardView));
            WebChatViewModel$observeBridgeMessage$2 webChatViewModel$observeBridgeMessage$3 = new WebChatViewModel$observeBridgeMessage$2(webChatViewModel, 2);
            this.IconCompatParcelizer = 1;
            return flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(webChatViewModel$observeBridgeMessage$3, this) == coroutineSingletons4 ? coroutineSingletons4 : createfromparcel;
        }
        int i17 = serializer + 113;
        read = i17 % Fields.SpotShadowColor;
        if (i17 % 2 == 0 ? i16 != 1 : i16 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return createfromparcel;
    }
}
