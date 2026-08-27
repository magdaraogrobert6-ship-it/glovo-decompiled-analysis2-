package androidx.compose.foundation;

import coil3.ExtrasKt;
import coil3.RealImageLoader;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.ShortNewsContentCardViewViewHolder;
import o.TextLayoutResultProxy;
import o.applyMeasureResultfoundation;
import o.awaitScrollDependencies;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.onAnimationEndlambda1;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setCustomInAppMessageAnimationFactorylambda0;

/* JADX INFO: loaded from: classes.dex */
public final class MutatorMutex$mutateWith$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ TextLayoutResultProxy IconCompatParcelizer;
    public final /* synthetic */ awaitScrollDependencies MediaBrowserCompatMediaItem;
    public TextLayoutResultProxy MediaDescriptionCompat;
    public awaitScrollDependencies MediaMetadataCompat;
    public Object MediaSessionCompatQueueItem;
    public int RatingCompat;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ applyMeasureResultfoundation read;
    public setCustomInAppMessageAnimationFactorylambda0 serializer;
    public final /* synthetic */ RealImageLoader.AnonymousClass2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutateWith$2(applyMeasureResultfoundation applymeasureresultfoundation, awaitScrollDependencies awaitscrolldependencies, RealImageLoader.AnonymousClass2 anonymousClass2, TextLayoutResultProxy textLayoutResultProxy, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = applymeasureresultfoundation;
        this.MediaBrowserCompatMediaItem = awaitscrolldependencies;
        this.write = anonymousClass2;
        this.IconCompatParcelizer = textLayoutResultProxy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.read, this.MediaBrowserCompatMediaItem, this.write, this.IconCompatParcelizer, shortNewsContentCardView);
        mutatorMutex$mutateWith$2.RemoteActionCompatParcelizer = obj;
        return mutatorMutex$mutateWith$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((MutatorMutex$mutateWith$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, o.setCustomInAppMessageAnimationFactorylambda0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutatorMutex$Mutator mutatorMutex$Mutator;
        awaitScrollDependencies awaitscrolldependencies;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        TextLayoutResultProxy textLayoutResultProxy;
        MutatorMutex$Mutator mutatorMutex$Mutator2;
        awaitScrollDependencies awaitscrolldependencies2;
        Throwable th;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.RatingCompat;
        try {
            try {
                if (r1 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = ((getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer).getCoroutineContext().get(onAnimationEndlambda1.RemoteActionCompatParcelizer);
                    shortNewsContentCardViewViewHolder.getClass();
                    mutatorMutex$Mutator = new MutatorMutex$Mutator(this.read, (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) shortNewsContentCardViewViewHolder);
                    awaitscrolldependencies = this.MediaBrowserCompatMediaItem;
                    awaitScrollDependencies.serializer(awaitscrolldependencies, mutatorMutex$Mutator);
                    setcustominappmessageanimationfactorylambda0 = awaitscrolldependencies.RemoteActionCompatParcelizer;
                    this.RemoteActionCompatParcelizer = mutatorMutex$Mutator;
                    this.serializer = setcustominappmessageanimationfactorylambda0;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.write;
                    this.MediaSessionCompatQueueItem = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                    TextLayoutResultProxy textLayoutResultProxy2 = this.IconCompatParcelizer;
                    this.MediaDescriptionCompat = textLayoutResultProxy2;
                    this.MediaMetadataCompat = awaitscrolldependencies;
                    this.RatingCompat = 1;
                    if (setcustominappmessageanimationfactorylambda0.lock(this) != coroutineSingletons) {
                        textLayoutResultProxy = textLayoutResultProxy2;
                    }
                    return coroutineSingletons;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    awaitscrolldependencies2 = (awaitScrollDependencies) this.MediaSessionCompatQueueItem;
                    setcustominappmessageanimationfactorylambda0 = this.serializer;
                    mutatorMutex$Mutator2 = (MutatorMutex$Mutator) this.RemoteActionCompatParcelizer;
                    try {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        atomicReference2 = awaitscrolldependencies2.serializer;
                        while (!atomicReference2.compareAndSet(mutatorMutex$Mutator2, null) && atomicReference2.get() == mutatorMutex$Mutator2) {
                        }
                        setcustominappmessageanimationfactorylambda0.write(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = awaitscrolldependencies2.serializer;
                        while (!atomicReference.compareAndSet(mutatorMutex$Mutator2, null)) {
                        }
                        throw th;
                    }
                }
                awaitScrollDependencies awaitscrolldependencies3 = this.MediaMetadataCompat;
                textLayoutResultProxy = this.MediaDescriptionCompat;
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.MediaSessionCompatQueueItem;
                setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = this.serializer;
                MutatorMutex$Mutator mutatorMutex$Mutator3 = (MutatorMutex$Mutator) this.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                awaitscrolldependencies = awaitscrolldependencies3;
                setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                mutatorMutex$Mutator = mutatorMutex$Mutator3;
                this.RemoteActionCompatParcelizer = mutatorMutex$Mutator;
                this.serializer = setcustominappmessageanimationfactorylambda0;
                this.MediaSessionCompatQueueItem = awaitscrolldependencies;
                this.MediaDescriptionCompat = null;
                this.MediaMetadataCompat = null;
                this.RatingCompat = 2;
                Object objInvoke = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(textLayoutResultProxy, this);
                if (objInvoke != coroutineSingletons) {
                    awaitscrolldependencies2 = awaitscrolldependencies;
                    obj = objInvoke;
                    mutatorMutex$Mutator2 = mutatorMutex$Mutator;
                    atomicReference2 = awaitscrolldependencies2.serializer;
                    while (!atomicReference2.compareAndSet(mutatorMutex$Mutator2, null)) {
                    }
                    setcustominappmessageanimationfactorylambda0.write(null);
                    return obj;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                mutatorMutex$Mutator2 = mutatorMutex$Mutator;
                awaitscrolldependencies2 = awaitscrolldependencies;
                th = th3;
                atomicReference = awaitscrolldependencies2.serializer;
                while (!atomicReference.compareAndSet(mutatorMutex$Mutator2, null) && atomicReference.get() == mutatorMutex$Mutator2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.write(null);
            throw th4;
        }
    }
}
