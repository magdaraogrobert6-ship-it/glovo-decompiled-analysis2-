package kotlinx.serialization.json.internal;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.measurement.internal.zzgs;
import kotlin.DeepRecursiveScopeImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import o.ShortNewsContentCardView;
import o.SwipeDismissTouchListenerVerticalDismissDirection;
import o.applyDisplayCutoutMarginsToCloseButtonlambda0;
import o.createFromParcel;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public final /* synthetic */ zzgs read;
    public /* synthetic */ DeepRecursiveScopeImpl serializer;
    public int write;

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.read, (ShortNewsContentCardView) obj3);
        jsonTreeReader$readDeepRecursive$1.serializer = (DeepRecursiveScopeImpl) obj;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzgs zzgsVar = this.read;
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = (applyDisplayCutoutMarginsToCloseButtonlambda0) zzgsVar.IconCompatParcelizer;
        DeepRecursiveScopeImpl deepRecursiveScopeImpl = this.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.write;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            byte bMediaBrowserCompatMediaItem = applydisplaycutoutmarginstoclosebuttonlambda0.MediaBrowserCompatMediaItem();
            if (bMediaBrowserCompatMediaItem == 1) {
                return zzgsVar.RemoteActionCompatParcelizer(true);
            }
            if (bMediaBrowserCompatMediaItem == 0) {
                return zzgsVar.RemoteActionCompatParcelizer(false);
            }
            if (bMediaBrowserCompatMediaItem != 6) {
                if (bMediaBrowserCompatMediaItem == 8) {
                    return zzgsVar.serializer();
                }
                applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.serializer = null;
            this.write = 1;
            obj = zzgs.access$readObject(zzgsVar, deepRecursiveScopeImpl, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return (SwipeDismissTouchListenerVerticalDismissDirection) obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(zzgs zzgsVar, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.read = zzgsVar;
    }
}
