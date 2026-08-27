package com.roadrunner.rrds.compose.component.image.zoomable;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.YieldKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.width;

/* JADX INFO: loaded from: classes3.dex */
public final class ZoomableNode$pointerInputNode$1$9$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ ZoomableNode serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableNode$pointerInputNode$1$9$1(ZoomableNode zoomableNode, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = zoomableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        ZoomableNode$pointerInputNode$1$9$1 zoomableNode$pointerInputNode$1$9$1 = new ZoomableNode$pointerInputNode$1$9$1(this.serializer, shortNewsContentCardView);
        int i2 = IconCompatParcelizer + 55;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return zoomableNode$pointerInputNode$1$9$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((ZoomableNode$pointerInputNode$1$9$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Object objInvokeSuspend = ((ZoomableNode$pointerInputNode$1$9$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i3 = IconCompatParcelizer + 95;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 != 0) {
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            if (i2 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i3 = IconCompatParcelizer + 115;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return null;
            }
            shortNewsContentCardView.hashCode();
            throw null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ZoomableNode zoomableNode = this.serializer;
        float fRemoteActionCompatParcelizer = zoomableNode.MediaDescriptionCompat.RemoteActionCompatParcelizer();
        ZoomState zoomState = zoomableNode.MediaDescriptionCompat;
        if (fRemoteActionCompatParcelizer >= 1.0f) {
            this.RemoteActionCompatParcelizer = 2;
            zoomState.getClass();
            Object objCoroutineScope = YieldKt.coroutineScope(new PhotoIdUiModelImpl$1$1(zoomState, shortNewsContentCardView, 20), this);
            if (objCoroutineScope != coroutineSingletons) {
                objCoroutineScope = createfromparcel;
            }
            return objCoroutineScope == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        long jM493getZeroF1C5BW0 = Offset.Companion.m493getZeroF1C5BW0();
        this.RemoteActionCompatParcelizer = 1;
        width widthVarIconCompatParcelizer = DelayKt.IconCompatParcelizer(0.0f, 0.0f, 7, (Object) null);
        zoomState.getClass();
        Object objCoroutineScope2 = YieldKt.coroutineScope(new ZoomState$changeScale$2(1.0f, zoomState, jM493getZeroF1C5BW0, widthVarIconCompatParcelizer, null), this);
        if (objCoroutineScope2 != coroutineSingletons) {
            objCoroutineScope2 = createfromparcel;
        }
        if (objCoroutineScope2 == coroutineSingletons) {
            int i4 = read + 9;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }
}
