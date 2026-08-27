package com.roadrunner.rrds.compose.component.buttons.slider;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.ranges.RangesKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class SliderButtonContainerKt$SliderCore$2$1$1$3$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ float IconCompatParcelizer;
    public final /* synthetic */ float RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ Animatable serializer;
    public final /* synthetic */ float write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderButtonContainerKt$SliderCore$2$1$1$3$1(Animatable animatable, float f, float f2, float f3, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = animatable;
        this.RemoteActionCompatParcelizer = f;
        this.IconCompatParcelizer = f2;
        this.write = f3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        SliderButtonContainerKt$SliderCore$2$1$1$3$1 sliderButtonContainerKt$SliderCore$2$1$1$3$1 = new SliderButtonContainerKt$SliderCore$2$1$1$3$1(this.serializer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, shortNewsContentCardView);
        int i2 = MediaBrowserCompatMediaItem + 1;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return sliderButtonContainerKt$SliderCore$2$1$1$3$1;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 27;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((SliderButtonContainerKt$SliderCore$2$1$1$3$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = MediaBrowserCompatMediaItem + 17;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.read;
        Object obj2 = null;
        if (i2 != 0) {
            int i3 = MediaSessionCompatQueueItem + 5;
            MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i5 = MediaSessionCompatQueueItem + 69;
                MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return null;
                }
                obj2.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Animatable animatable = this.serializer;
            Float f = new Float(RangesKt.write(((Number) animatable.write()).floatValue() + this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write));
            this.read = 1;
            if (animatable.snapTo(f, this) == coroutineSingletons) {
                int i6 = MediaBrowserCompatMediaItem + 21;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return coroutineSingletons;
                }
                obj2.hashCode();
                throw null;
            }
        }
        return createFromParcel.INSTANCE;
    }
}
