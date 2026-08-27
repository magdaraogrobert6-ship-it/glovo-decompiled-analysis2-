package com.roadrunner.login.presentation.checkemail;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.nest.NestViewModel$observeNestScope$1;
import com.roadrunner.login.presentation.forgotpassword.ForgotPasswordPersistedTimerManager;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.sentiance.core.model.events.N$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C0150a;
import o.C0166g;
import o.ShortNewsContentCardView;
import o.TurbineTimeoutCancellationException;
import o.a4;
import o.createFromParcel;
import o.getAutofillManager;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setApplicationContext;
import o.transferSessionPackageI;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class CheckEmailViewModel$startTimer$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ TurbineTimeoutCancellationException RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckEmailViewModel$startTimer$1(TurbineTimeoutCancellationException turbineTimeoutCancellationException, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = turbineTimeoutCancellationException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 37;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.serializer;
        TurbineTimeoutCancellationException turbineTimeoutCancellationException = this.RemoteActionCompatParcelizer;
        if (i5 == 0) {
            return new CheckEmailViewModel$startTimer$1(turbineTimeoutCancellationException, shortNewsContentCardView, 0);
        }
        int i6 = 1;
        if (i5 == 1) {
            return new CheckEmailViewModel$startTimer$1(turbineTimeoutCancellationException, shortNewsContentCardView, i6);
        }
        CheckEmailViewModel$startTimer$1 checkEmailViewModel$startTimer$1 = new CheckEmailViewModel$startTimer$1(turbineTimeoutCancellationException, shortNewsContentCardView, i);
        int i7 = write + 29;
        read = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return checkEmailViewModel$startTimer$1;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = read + 35;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i4 == 0) {
            return ((CheckEmailViewModel$startTimer$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 != 1) {
            return ((CheckEmailViewModel$startTimer$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((CheckEmailViewModel$startTimer$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = read + 47;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object objM5080invoke0E7RQCE;
        Object obj3;
        int i = 2 % 2;
        int i2 = this.serializer;
        C0166g c0166g = C0166g.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        TurbineTimeoutCancellationException turbineTimeoutCancellationException = this.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 == 0) {
            transferSessionPackageI transfersessionpackagei = turbineTimeoutCancellationException.RatingCompat;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.IconCompatParcelizer;
            if (i3 != 0) {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = read + 35;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
            firebaseRemoteConfigImpl.getClass();
            if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_PERSIST_TIMER_IN_RESET_PASSWORD_ENABLED)) {
                turbineTimeoutCancellationException.serializer.write(firebaseRemoteConfigImpl.IconCompatParcelizer.write("reset_password_by_magic_link_timeout"));
                return createfromparcel;
            }
            ForgotPasswordPersistedTimerManager forgotPasswordPersistedTimerManager = turbineTimeoutCancellationException.RemoteActionCompatParcelizer;
            this.IconCompatParcelizer = 1;
            if (forgotPasswordPersistedTimerManager.start(c0166g, this) != coroutineSingletons) {
                return createfromparcel;
            }
            int i6 = write + 53;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return coroutineSingletons;
        }
        if (i2 != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = this.IconCompatParcelizer;
            if (i8 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ForgotPasswordPersistedTimerManager forgotPasswordPersistedTimerManager2 = turbineTimeoutCancellationException.RemoteActionCompatParcelizer;
                this.IconCompatParcelizer = 1;
                obj = forgotPasswordPersistedTimerManager2.resumeIfPersisted(c0166g, this);
                if (obj != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            }
            if (i8 != 1) {
                int i9 = write + 91;
                read = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0 ? i8 != 2 : i8 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            NestViewModel$observeNestScope$1.AnonymousClass1 anonymousClass1 = new NestViewModel$observeNestScope$1.AnonymousClass1(27, turbineTimeoutCancellationException);
            this.IconCompatParcelizer = 2;
            if (((Flow) obj).collect(anonymousClass1, this) != coroutineSingletons2) {
                return createfromparcel;
            }
            return coroutineSingletons2;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.IconCompatParcelizer;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MutableStateFlow mutableStateFlow = turbineTimeoutCancellationException.IconCompatParcelizer;
            do {
                obj2 = mutableStateFlow.read();
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, a4.serializer((a4) obj2, true, null, 126)));
            N$b n$b = turbineTimeoutCancellationException.write;
            String str = turbineTimeoutCancellationException.MediaSessionCompatQueueItem;
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) turbineTimeoutCancellationException.RatingCompat;
            firebaseRemoteConfigImpl2.getClass();
            boolean zIconCompatParcelizer = firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_RESET_PASSWORD_FLEXIBILITY_ENABLED);
            this.IconCompatParcelizer = 1;
            objM5080invoke0E7RQCE = n$b.m5080invoke0E7RQCE(str, zIconCompatParcelizer, this);
            if (objM5080invoke0E7RQCE == coroutineSingletons3) {
                return coroutineSingletons3;
            }
        } else {
            if (i10 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM5080invoke0E7RQCE = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        int i11 = 0;
        if (!(objM5080invoke0E7RQCE instanceof isItemDismissable)) {
            turbineTimeoutCancellationException.getClass();
            r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(turbineTimeoutCancellationException, new CheckEmailViewModel$startTimer$1(turbineTimeoutCancellationException, shortNewsContentCardView, i11));
        }
        Throwable thSerializer = onItemDismiss.serializer(objM5080invoke0E7RQCE);
        if (thSerializer != null) {
            turbineTimeoutCancellationException.MediaBrowserCompatMediaItem.serializer(new C0150a(new setApplicationContext(turbineTimeoutCancellationException.MediaDescriptionCompat.read(thSerializer), getAutofillManager.Long, null, 4)));
        }
        MutableStateFlow mutableStateFlow2 = turbineTimeoutCancellationException.IconCompatParcelizer;
        do {
            obj3 = mutableStateFlow2.read();
        } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj3, a4.serializer((a4) obj3, false, null, 126)));
        return createfromparcel;
    }
}
