package androidx.compose.animation.core;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.UniqueHttpExceptionKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getHoldoutVariationName;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(int i, ShortNewsContentCardView shortNewsContentCardView, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(1, shortNewsContentCardView);
        this.read = i;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return new androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(1, r6, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r1 = new androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(r2, r6, r3);
        r6 = androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2.write + 69;
        androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2.IconCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 != 0) goto L9;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(o.ShortNewsContentCardView r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2.write
            int r1 = r1 + 59
            int r2 = r1 % 128
            androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L19
            int r1 = r5.read
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r3 = r5.serializer
            r4 = 78
            int r4 = r4 / r2
            if (r1 == 0) goto L26
            goto L1f
        L19:
            int r1 = r5.read
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r3 = r5.serializer
            if (r1 == 0) goto L26
        L1f:
            androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 r0 = new androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2
            r1 = 1
            r0.<init>(r1, r6, r3)
            return r0
        L26:
            androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 r1 = new androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2
            r1.<init>(r2, r6, r3)
            int r6 = androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2.write
            int r6 = r6 + 69
            int r2 = r6 % 128
            androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2.IconCompatParcelizer = r2
            int r6 = r6 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2.create(o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = write + 93;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i4 == 0) {
            return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = IconCompatParcelizer + 121;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        getHoldoutVariationName getholdoutvariationname;
        int i = 2 % 2;
        int i2 = this.read;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.serializer;
        Object obj2 = null;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.RemoteActionCompatParcelizer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                Object objWithFrameNanos = TextStreamsKt.read(getContext()).withFrameNanos(r8lambdaunavo3sxub_pc9xroryotnrlvsm, this);
                return objWithFrameNanos == coroutineSingletons ? coroutineSingletons : objWithFrameNanos;
            }
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = IconCompatParcelizer + 111;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            obj2.hashCode();
            throw null;
        }
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.RemoteActionCompatParcelizer;
        if (i5 != 0) {
            int i6 = write + 87;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i5 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getholdoutvariationname = (getHoldoutVariationName) obj;
                if (getholdoutvariationname.rawResponse.isSuccessful) {
                    throw UniqueHttpExceptionKt.write(new HttpException(getholdoutvariationname));
                }
                int i8 = write + 85;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                obj3 = createFromParcel.INSTANCE;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj3 = null;
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.RemoteActionCompatParcelizer = 1;
            obj = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
            if (obj == obj3) {
                int i10 = IconCompatParcelizer + 61;
                write = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
            } else {
                getholdoutvariationname = (getHoldoutVariationName) obj;
                if (getholdoutvariationname.rawResponse.isSuccessful) {
                    throw UniqueHttpExceptionKt.write(new HttpException(getholdoutvariationname));
                }
                int i11 = write + 85;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                obj3 = createFromParcel.INSTANCE;
            }
        }
        int i13 = write + 5;
        IconCompatParcelizer = i13 % Fields.SpotShadowColor;
        if (i13 % 2 == 0) {
            return obj3;
        }
        obj2.hashCode();
        throw null;
    }
}
