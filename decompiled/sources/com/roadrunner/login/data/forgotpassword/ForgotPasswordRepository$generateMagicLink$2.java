package com.roadrunner.login.data.forgotpassword;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.common.data.api.UniqueHttpExceptionKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.TransacterBase;
import o.createFromParcel;
import o.getHoldoutVariationName;
import o.getSuccessfulruntime;
import o.lottieComposition;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public final class ForgotPasswordRepository$generateMagicLink$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ String IconCompatParcelizer;
    public int MediaDescriptionCompat;
    public final /* synthetic */ SignInDataStore MediaMetadataCompat;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForgotPasswordRepository$generateMagicLink$2(SignInDataStore signInDataStore, String str, String str2, String str3, String str4, String str5, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.MediaMetadataCompat = signInDataStore;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = str2;
        this.write = str3;
        this.read = str4;
        this.IconCompatParcelizer = str5;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 103;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ((ForgotPasswordRepository$generateMagicLink$2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        }
        int i3 = 77 / 0;
        return ((ForgotPasswordRepository$generateMagicLink$2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        ForgotPasswordRepository$generateMagicLink$2 forgotPasswordRepository$generateMagicLink$2 = new ForgotPasswordRepository$generateMagicLink$2(this.MediaMetadataCompat, this.RemoteActionCompatParcelizer, this.serializer, this.write, this.read, this.IconCompatParcelizer, shortNewsContentCardView);
        int i2 = RatingCompat + 3;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return forgotPasswordRepository$generateMagicLink$2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036 A[PHI: r1
  0x0036: PHI (r1v8 kotlin.coroutines.intrinsics.CoroutineSingletons) = (r1v4 kotlin.coroutines.intrinsics.CoroutineSingletons), (r1v9 kotlin.coroutines.intrinsics.CoroutineSingletons) binds: [B:8:0x001f, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[DONT_INVERT, PHI: r4
  0x0021: PHI (r4v1 int) = (r4v0 int), (r4v4 int) binds: [B:8:0x001f, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons;
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompat + 91;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = this.MediaDescriptionCompat;
            int i4 = 76 / 0;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                SignInDataStore signInDataStore = this.MediaMetadataCompat;
                getSuccessfulruntime getsuccessfulruntime = (getSuccessfulruntime) signInDataStore.RemoteActionCompatParcelizer;
                String strIconCompatParcelizer = lottieComposition.IconCompatParcelizer((lottieComposition) signInDataStore.read, this.RemoteActionCompatParcelizer, null, 2, null);
                TransacterBase transacterBase = new TransacterBase(this.RemoteActionCompatParcelizer, this.serializer, this.write, this.read, this.IconCompatParcelizer);
                this.MediaDescriptionCompat = 1;
                obj = getsuccessfulruntime.RemoteActionCompatParcelizer(strIconCompatParcelizer, transacterBase, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i == 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i5 = RatingCompat + 79;
                MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } else {
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = this.MediaDescriptionCompat;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                SignInDataStore signInDataStore2 = this.MediaMetadataCompat;
                getSuccessfulruntime getsuccessfulruntime2 = (getSuccessfulruntime) signInDataStore2.RemoteActionCompatParcelizer;
                String strIconCompatParcelizer2 = lottieComposition.IconCompatParcelizer((lottieComposition) signInDataStore2.read, this.RemoteActionCompatParcelizer, null, 2, null);
                TransacterBase transacterBase2 = new TransacterBase(this.RemoteActionCompatParcelizer, this.serializer, this.write, this.read, this.IconCompatParcelizer);
                this.MediaDescriptionCompat = 1;
                obj = getsuccessfulruntime2.RemoteActionCompatParcelizer(strIconCompatParcelizer2, transacterBase2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i == 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = RatingCompat + 79;
                MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        }
        getHoldoutVariationName getholdoutvariationname = (getHoldoutVariationName) obj;
        getholdoutvariationname.getClass();
        if (!getholdoutvariationname.rawResponse.isSuccessful) {
            throw UniqueHttpExceptionKt.write(new HttpException(getholdoutvariationname));
        }
        return createFromParcel.INSTANCE;
    }
}
