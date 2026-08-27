package com.roadrunner.rrds.compose.component.image.zoomable;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.YieldKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.width;

/* JADX INFO: loaded from: classes3.dex */
public final class ZoomableKt$zoomable$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public final /* synthetic */ ZoomState IconCompatParcelizer;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableKt$zoomable$1(boolean z, ZoomState zoomState, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = zoomState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        ZoomableKt$zoomable$1 zoomableKt$zoomable$1 = new ZoomableKt$zoomable$1(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, shortNewsContentCardView);
        zoomableKt$zoomable$1.write = ((Offset) obj).m487unboximpl();
        int i2 = serializer + 57;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return zoomableKt$zoomable$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 125;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((ZoomableKt$zoomable$1) create(Offset.m466boximpl(((Offset) obj).m487unboximpl()), (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = MediaBrowserCompatMediaItem + 11;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 115;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        long j = this.write;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        if (i3 != 0) {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i4 = serializer + 43;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel2;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (this.RemoteActionCompatParcelizer) {
            int i6 = serializer + 83;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            this.write = j;
            this.read = 1;
            width widthVarIconCompatParcelizer = DelayKt.IconCompatParcelizer(0.0f, 0.0f, 7, (Object) null);
            ZoomState zoomState = this.IconCompatParcelizer;
            Object objCoroutineScope = YieldKt.coroutineScope(new ZoomState$changeScale$2(zoomState.RemoteActionCompatParcelizer() == 1.0f ? 2.5f : 1.0f, zoomState, j, widthVarIconCompatParcelizer, null), this);
            if (objCoroutineScope != coroutineSingletons2) {
                objCoroutineScope = createfromparcel2;
            }
            if (objCoroutineScope != coroutineSingletons2) {
                objCoroutineScope = createfromparcel2;
            }
            if (objCoroutineScope == coroutineSingletons2) {
                return coroutineSingletons2;
            }
        }
        return createfromparcel2;
    }
}
