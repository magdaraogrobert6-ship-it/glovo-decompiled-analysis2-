package com.roadrunner.push.core.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.access1500;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaxxf_OxJQyqvagkBotvkQpFWGJ2k;

/* JADX INFO: loaded from: classes3.dex */
public final class PushServiceRepository$registerPushForRider$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RatingCompat = 1;
    private static int serializer;
    public final /* synthetic */ PushServiceRepository IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ access1500 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PushServiceRepository$registerPushForRider$2(PushServiceRepository pushServiceRepository, access1500 access1500Var, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = pushServiceRepository;
        this.write = access1500Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RatingCompat + 45;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        access1500 access1500Var = this.write;
        PushServiceRepository pushServiceRepository = this.IconCompatParcelizer;
        if (i4 == 0) {
            return new PushServiceRepository$registerPushForRider$2(pushServiceRepository, access1500Var, shortNewsContentCardView, 0);
        }
        PushServiceRepository$registerPushForRider$2 pushServiceRepository$registerPushForRider$2 = new PushServiceRepository$registerPushForRider$2(pushServiceRepository, access1500Var, shortNewsContentCardView, 1);
        int i5 = RatingCompat + 89;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return pushServiceRepository$registerPushForRider$2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 63;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i4 != 0) {
            return ((PushServiceRepository$registerPushForRider$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((PushServiceRepository$registerPushForRider$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = RatingCompat + 85;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        access1500 access1500Var = this.write;
        PushServiceRepository pushServiceRepository = this.IconCompatParcelizer;
        Object obj2 = null;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.read;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                r8lambdaxxf_OxJQyqvagkBotvkQpFWGJ2k r8lambdaxxf_oxjqyqvagkbotvkqpfwgj2k = pushServiceRepository.RemoteActionCompatParcelizer;
                this.read = 1;
                return r8lambdaxxf_oxjqyqvagkbotvkqpfwgj2k.IconCompatParcelizer(access1500Var, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = serializer + 85;
            RatingCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            obj2.hashCode();
            throw null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.read;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            r8lambdaxxf_OxJQyqvagkBotvkQpFWGJ2k r8lambdaxxf_oxjqyqvagkbotvkqpfwgj2k2 = pushServiceRepository.write;
            this.read = 1;
            return r8lambdaxxf_oxjqyqvagkbotvkqpfwgj2k2.IconCompatParcelizer(access1500Var, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        int i6 = serializer;
        int i7 = i6 + 7;
        RatingCompat = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        if (i5 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i9 = i6 + 83;
        RatingCompat = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return createfromparcel;
    }
}
