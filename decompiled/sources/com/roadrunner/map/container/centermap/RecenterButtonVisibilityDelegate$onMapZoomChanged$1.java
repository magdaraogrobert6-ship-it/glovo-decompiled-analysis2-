package com.roadrunner.map.container.centermap;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import o.C;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.f5ExternalSyntheticLambda4;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class RecenterButtonVisibilityDelegate$onMapZoomChanged$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ double IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ C serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecenterButtonVisibilityDelegate$onMapZoomChanged$1(C c, double d, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = c;
        this.IconCompatParcelizer = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        RecenterButtonVisibilityDelegate$onMapZoomChanged$1 recenterButtonVisibilityDelegate$onMapZoomChanged$1 = new RecenterButtonVisibilityDelegate$onMapZoomChanged$1(this.serializer, this.IconCompatParcelizer, shortNewsContentCardView);
        int i2 = read + 17;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return recenterButtonVisibilityDelegate$onMapZoomChanged$1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 109;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((RecenterButtonVisibilityDelegate$onMapZoomChanged$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = read + 11;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 107;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.RemoteActionCompatParcelizer;
        Object obj2 = null;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.RemoteActionCompatParcelizer = 1;
            if (DelayKt.delay(350L, this) == coroutineSingletons) {
                int i5 = write + 47;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return coroutineSingletons;
                }
                obj2.hashCode();
                throw null;
            }
        } else {
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = read + 95;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i8 = read + 63;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        C c = this.serializer;
        c.serializer = f5ExternalSyntheticLambda4.RemoteActionCompatParcelizer(c.serializer, this.IconCompatParcelizer, null, null, 6);
        return createFromParcel.INSTANCE;
    }
}
