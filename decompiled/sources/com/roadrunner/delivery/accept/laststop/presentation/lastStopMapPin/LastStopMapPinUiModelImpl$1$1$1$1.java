package com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin;

import androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.overlay.domain.ObserveAcceptOverlayVisibility$invoke$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getEndOffsetForRectWithinRun;
import o.hf;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class LastStopMapPinUiModelImpl$1$1$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ getEndOffsetForRectWithinRun RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LastStopMapPinUiModelImpl$1$1$1$1(getEndOffsetForRectWithinRun getendoffsetforrectwithinrun, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.RemoteActionCompatParcelizer = getendoffsetforrectwithinrun;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = read + 69;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        getEndOffsetForRectWithinRun getendoffsetforrectwithinrun = this.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            return new LastStopMapPinUiModelImpl$1$1$1$1(getendoffsetforrectwithinrun, shortNewsContentCardView, 1);
        }
        LastStopMapPinUiModelImpl$1$1$1$1 lastStopMapPinUiModelImpl$1$1$1$1 = new LastStopMapPinUiModelImpl$1$1$1$1(getendoffsetforrectwithinrun, shortNewsContentCardView, 0);
        int i5 = serializer + 89;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return lastStopMapPinUiModelImpl$1$1$1$1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        return ((com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.LastStopMapPinUiModelImpl$1$1$1$1) create(r5, r6)).invokeSuspend(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r5 = ((com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.LastStopMapPinUiModelImpl$1$1$1$1) create(r5, r6)).invokeSuspend(r2);
        r6 = com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.LastStopMapPinUiModelImpl$1$1$1$1.serializer + 101;
        com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.LastStopMapPinUiModelImpl$1$1$1$1.read = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if ((r6 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r1 != 0) goto L9;
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.LastStopMapPinUiModelImpl$1$1$1$1.serializer
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.LastStopMapPinUiModelImpl$1$1$1$1.read = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1b
            int r1 = r4.write
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            r3 = 0
            int r3 = r3 / r3
            if (r1 == 0) goto L30
            goto L25
        L1b:
            int r1 = r4.write
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            if (r1 == 0) goto L30
        L25:
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.LastStopMapPinUiModelImpl$1$1$1$1 r5 = (com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.LastStopMapPinUiModelImpl$1$1$1$1) r5
            java.lang.Object r5 = r5.invokeSuspend(r2)
            return r5
        L30:
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.LastStopMapPinUiModelImpl$1$1$1$1 r5 = (com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.LastStopMapPinUiModelImpl$1$1$1$1) r5
            java.lang.Object r5 = r5.invokeSuspend(r2)
            int r6 = com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.LastStopMapPinUiModelImpl$1$1$1$1.serializer
            int r6 = r6 + 101
            int r1 = r6 % 128
            com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.LastStopMapPinUiModelImpl$1$1$1$1.read = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L46
            return r5
        L46:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.LastStopMapPinUiModelImpl$1$1$1$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.write;
        getEndOffsetForRectWithinRun getendoffsetforrectwithinrun = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.IconCompatParcelizer;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                Object objCollect = FlowKt.serializer(((hf) getendoffsetforrectwithinrun.MediaMetadataCompat).MediaDescriptionCompat).collect(new FlowLiveDataConversions$asLiveData$1$1(19, getendoffsetforrectwithinrun), this);
                if (objCollect != coroutineSingletons) {
                    objCollect = createfromparcel;
                }
                return objCollect == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = serializer + 91;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.IconCompatParcelizer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.IconCompatParcelizer = 1;
            Object objCollect2 = FlowKt.collect(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(getendoffsetforrectwithinrun.IconCompatParcelizer.MediaBrowserCompatMediaItem, getendoffsetforrectwithinrun.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer, new ObserveAcceptOverlayVisibility$invoke$1(getendoffsetforrectwithinrun, shortNewsContentCardView, i)), new ComposePredictiveBackHandler$launchNewGesture$1$1(3, 1, null)), this);
            if (objCollect2 != coroutineSingletons2) {
                objCollect2 = createfromparcel;
            }
            return objCollect2 == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        int i8 = serializer;
        int i9 = i8 + 63;
        read = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        if (i7 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i11 = i8 + 113;
        read = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return createfromparcel;
    }
}
