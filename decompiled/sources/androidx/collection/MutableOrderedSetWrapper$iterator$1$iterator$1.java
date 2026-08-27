package androidx.collection;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.SequenceBuilderIterator;
import o.ShortNewsContentCardView;
import o.accesscalculateScrollDeltaI_oMVgE;
import o.createFromParcel;
import o.isMaxVisibleEQwtKwdefault;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.verifyOrientationStatuslambda0;

/* JADX INFO: loaded from: classes.dex */
public final class MutableOrderedSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public verifyOrientationStatuslambda0 IconCompatParcelizer;
    public final /* synthetic */ verifyOrientationStatuslambda0 MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final /* synthetic */ accesscalculateScrollDeltaI_oMVgE MediaSessionCompatQueueItem;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public accesscalculateScrollDeltaI_oMVgE read;
    public long[] serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper$iterator$1$iterator$1(accesscalculateScrollDeltaI_oMVgE accesscalculatescrolldeltai_omvge, verifyOrientationStatuslambda0 verifyorientationstatuslambda0, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaSessionCompatQueueItem = accesscalculatescrolldeltai_omvge;
        this.MediaBrowserCompatMediaItem = verifyorientationstatuslambda0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.MediaSessionCompatQueueItem, this.MediaBrowserCompatMediaItem, shortNewsContentCardView);
        mutableOrderedSetWrapper$iterator$1$iterator$1.RemoteActionCompatParcelizer = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((MutableOrderedSetWrapper$iterator$1$iterator$1) create((SequenceBuilderIterator) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SequenceBuilderIterator sequenceBuilderIterator;
        accesscalculateScrollDeltaI_oMVgE accesscalculatescrolldeltai_omvge;
        long[] jArr;
        int i;
        verifyOrientationStatuslambda0 verifyorientationstatuslambda0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.MediaDescriptionCompat;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            sequenceBuilderIterator = (SequenceBuilderIterator) this.RemoteActionCompatParcelizer;
            accesscalculatescrolldeltai_omvge = this.MediaSessionCompatQueueItem;
            isMaxVisibleEQwtKwdefault ismaxvisibleeqwtkwdefault = accesscalculatescrolldeltai_omvge.RemoteActionCompatParcelizer;
            jArr = ismaxvisibleeqwtkwdefault.MediaMetadataCompat;
            i = ismaxvisibleeqwtkwdefault.RatingCompat;
            verifyorientationstatuslambda0 = this.MediaBrowserCompatMediaItem;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.write;
            jArr = this.serializer;
            accesscalculatescrolldeltai_omvge = this.read;
            verifyorientationstatuslambda0 = this.IconCompatParcelizer;
            sequenceBuilderIterator = (SequenceBuilderIterator) this.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        while (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            verifyorientationstatuslambda0.serializer = i;
            Object obj2 = accesscalculatescrolldeltai_omvge.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[i];
            this.RemoteActionCompatParcelizer = sequenceBuilderIterator;
            this.IconCompatParcelizer = verifyorientationstatuslambda0;
            this.read = accesscalculatescrolldeltai_omvge;
            this.serializer = jArr;
            this.write = i3;
            this.MediaDescriptionCompat = 1;
            if (sequenceBuilderIterator.yield(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i = i3;
        }
        return createFromParcel.INSTANCE;
    }
}
