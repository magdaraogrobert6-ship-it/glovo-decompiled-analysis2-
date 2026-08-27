package com.roadrunner.map.container.enabled.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SingleProcessDataStore$data$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.reactive.FlowSubscription$consumeFlow$2;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class MapViewModel$observeSafeArea$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ MapViewModel IconCompatParcelizer;
    public final /* synthetic */ int read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapViewModel$observeSafeArea$1(MapViewModel mapViewModel, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.IconCompatParcelizer = mapViewModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return new com.roadrunner.map.container.enabled.presentation.MapViewModel$observeSafeArea$1(r2, r6, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r0 = new com.roadrunner.map.container.enabled.presentation.MapViewModel$observeSafeArea$1(r2, r6, r1);
        r6 = com.roadrunner.map.container.enabled.presentation.MapViewModel$observeSafeArea$1.serializer + 39;
        com.roadrunner.map.container.enabled.presentation.MapViewModel$observeSafeArea$1.RemoteActionCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if ((r6 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r0 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r0 != 0) goto L9;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(java.lang.Object r5, o.ShortNewsContentCardView r6) {
        /*
            r4 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.roadrunner.map.container.enabled.presentation.MapViewModel$observeSafeArea$1.RemoteActionCompatParcelizer
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.roadrunner.map.container.enabled.presentation.MapViewModel$observeSafeArea$1.serializer = r1
            int r0 = r0 % r5
            r1 = 0
            if (r0 != 0) goto L19
            int r0 = r4.read
            com.roadrunner.map.container.enabled.presentation.MapViewModel r2 = r4.IconCompatParcelizer
            r3 = 97
            int r3 = r3 / r1
            if (r0 == 0) goto L26
            goto L1f
        L19:
            int r0 = r4.read
            com.roadrunner.map.container.enabled.presentation.MapViewModel r2 = r4.IconCompatParcelizer
            if (r0 == 0) goto L26
        L1f:
            com.roadrunner.map.container.enabled.presentation.MapViewModel$observeSafeArea$1 r5 = new com.roadrunner.map.container.enabled.presentation.MapViewModel$observeSafeArea$1
            r0 = 1
            r5.<init>(r2, r6, r0)
            return r5
        L26:
            com.roadrunner.map.container.enabled.presentation.MapViewModel$observeSafeArea$1 r0 = new com.roadrunner.map.container.enabled.presentation.MapViewModel$observeSafeArea$1
            r0.<init>(r2, r6, r1)
            int r6 = com.roadrunner.map.container.enabled.presentation.MapViewModel$observeSafeArea$1.serializer
            int r6 = r6 + 39
            int r1 = r6 % 128
            com.roadrunner.map.container.enabled.presentation.MapViewModel$observeSafeArea$1.RemoteActionCompatParcelizer = r1
            int r6 = r6 % r5
            if (r6 != 0) goto L37
            return r0
        L37:
            r5 = 0
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.map.container.enabled.presentation.MapViewModel$observeSafeArea$1.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 83;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            return ((MapViewModel$observeSafeArea$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((MapViewModel$observeSafeArea$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = serializer + 51;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return objInvokeSuspend;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.read;
        MapViewModel mapViewModel = this.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.write;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                StateFlow stateFlow = mapViewModel.read.read;
                FlowSubscription$consumeFlow$2 flowSubscription$consumeFlow$2 = new FlowSubscription$consumeFlow$2(6, mapViewModel);
                this.write = 1;
                if (stateFlow.collect(flowSubscription$consumeFlow$2, this) == coroutineSingletons) {
                    int i4 = serializer + 59;
                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            DrawableTransformation.read();
            return null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = this.write;
        if (i6 != 0) {
            int i7 = serializer;
            int i8 = i7 + 69;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = i7 + 79;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = mapViewModel.ParcelableVolumeInfo.RemoteActionCompatParcelizer;
            SingleProcessDataStore$data$1.AnonymousClass1 anonymousClass1 = new SingleProcessDataStore$data$1.AnonymousClass1(mapViewModel, shortNewsContentCardView, 24);
            this.write = 1;
            if (FlowKt.collectLatest(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, anonymousClass1, this) == coroutineSingletons2) {
                int i11 = RemoteActionCompatParcelizer + 43;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return coroutineSingletons2;
            }
        }
        return createFromParcel.INSTANCE;
    }
}
