package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.TrackpadScrollingLogic;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ThumbNode$measure$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ float IconCompatParcelizer;
    public int read;
    public final /* synthetic */ ThumbNode serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThumbNode$measure$1(ThumbNode thumbNode, float f, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.serializer = thumbNode;
        this.IconCompatParcelizer = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.write;
        float f = this.IconCompatParcelizer;
        ThumbNode thumbNode = this.serializer;
        return i != 0 ? new ThumbNode$measure$1(thumbNode, f, shortNewsContentCardView, 1) : new ThumbNode$measure$1(thumbNode, f, shortNewsContentCardView, 0);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((ThumbNode$measure$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((ThumbNode$measure$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        float f = this.IconCompatParcelizer;
        ThumbNode thumbNode = this.serializer;
        if (i != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.read;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Animatable animatable = thumbNode.RatingCompat;
                if (animatable == null) {
                    return createfromparcel;
                }
                Float f2 = new Float(f);
                TrackpadScrollingLogic trackpadScrollingLogic = thumbNode.MediaDescriptionCompat ? SwitchKt.serializer : thumbNode.read;
                this.read = 1;
                obj = Animatable.IconCompatParcelizer(animatable, f2, trackpadScrollingLogic, this, 12);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.read;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Animatable animatable2 = thumbNode.MediaMetadataCompat;
            if (animatable2 == null) {
                return createfromparcel;
            }
            Float f3 = new Float(f);
            TrackpadScrollingLogic trackpadScrollingLogic2 = thumbNode.MediaDescriptionCompat ? SwitchKt.serializer : thumbNode.read;
            this.read = 1;
            obj = Animatable.IconCompatParcelizer(animatable2, f3, trackpadScrollingLogic2, this, 12);
            if (obj == coroutineSingletons2) {
                return coroutineSingletons2;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createfromparcel;
    }
}
