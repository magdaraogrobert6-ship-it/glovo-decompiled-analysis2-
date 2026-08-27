package androidx.compose.animation.core;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.logger.PerseusLogger$e$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.YieldKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.onShowTranslationui;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class SeekableTransitionState$snapTo$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final /* synthetic */ SeekableTransitionState read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Transition write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$snapTo$2(SeekableTransitionState seekableTransitionState, Object obj, Transition transition, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.read = seekableTransitionState;
        this.serializer = obj;
        this.write = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        SeekableTransitionState seekableTransitionState = this.read;
        Transition transition = this.write;
        return i != 0 ? new SeekableTransitionState$snapTo$2(transition, seekableTransitionState, obj, shortNewsContentCardView) : new SeekableTransitionState$snapTo$2(seekableTransitionState, obj, transition, shortNewsContentCardView);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        return i != 0 ? ((SeekableTransitionState$snapTo$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((SeekableTransitionState$snapTo$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f;
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.IconCompatParcelizer;
            Transition transition = this.write;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                PerseusLogger$e$1 perseusLogger$e$1 = new PerseusLogger$e$1(this.read, this.serializer, transition, (ShortNewsContentCardView) null, 1);
                this.IconCompatParcelizer = 1;
                if (YieldKt.coroutineScope(perseusLogger$e$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            transition.onTransitionEnd$animation_core();
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.IconCompatParcelizer;
        Transition transition2 = this.write;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SeekableTransitionState seekableTransitionState = this.read;
            seekableTransitionState.read();
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = seekableTransitionState.ResultReceiver;
            seekableTransitionState.ParcelableVolumeInfo = Long.MIN_VALUE;
            seekableTransitionState.IconCompatParcelizer(0.0f);
            Object value = ((onShowTranslationui) seekableTransitionState.MediaBrowserCompatMediaItem).getValue();
            Object obj2 = this.serializer;
            if (obj2.equals(value)) {
                f = -4.0f;
            } else {
                f = obj2.equals(((onShowTranslationui) populateViewStructure_androidKtpopulate7).getValue()) ? -5.0f : -3.0f;
            }
            transition2.updateTarget$animation_core(obj2);
            transition2.serializer(0L);
            ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(obj2);
            seekableTransitionState.IconCompatParcelizer(0.0f);
            seekableTransitionState.write(obj2);
            transition2.resetAnimationFraction$animation_core(f);
            if (f == -3.0f) {
                this.IconCompatParcelizer = 1;
                if (SeekableTransitionState.access$waitForCompositionAfterTargetStateChange(seekableTransitionState, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        transition2.onTransitionEnd$animation_core();
        return createfromparcel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$snapTo$2(Transition transition, SeekableTransitionState seekableTransitionState, Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.write = transition;
        this.read = seekableTransitionState;
        this.serializer = obj;
    }
}
