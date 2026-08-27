package com.roadrunner.auth.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.login.data.forgotpassword.entity.ForgotPasswordTimberException;
import com.roadrunner.nafath.data.NafathTimberException;
import com.roadrunner.twofa.data.entity.TwoFaTimberException;
import java.io.IOException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.onItemDismiss;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.setNativeShader;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInDataStore$get$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public int IconCompatParcelizer;
    public final /* synthetic */ int read;
    public /* synthetic */ FlowCollector serializer;
    public /* synthetic */ Throwable write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInDataStore$get$1() {
        super(3, null);
        this.read = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SignInDataStore$get$1(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.read = i2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 105;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        FlowCollector flowCollector = (FlowCollector) obj;
        Throwable th = (Throwable) obj2;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj3;
        int i6 = 3;
        if (i5 == 0) {
            SignInDataStore$get$1 signInDataStore$get$1 = new SignInDataStore$get$1(i6, 0, shortNewsContentCardView);
            signInDataStore$get$1.serializer = flowCollector;
            signInDataStore$get$1.write = th;
            return signInDataStore$get$1.invokeSuspend(createfromparcel);
        }
        int i7 = 1;
        if (i5 == 1) {
            SignInDataStore$get$1 signInDataStore$get$2 = new SignInDataStore$get$1(i6, i7, shortNewsContentCardView);
            signInDataStore$get$2.serializer = flowCollector;
            signInDataStore$get$2.write = th;
            return signInDataStore$get$2.invokeSuspend(createfromparcel);
        }
        if (i5 == 2) {
            SignInDataStore$get$1 signInDataStore$get$3 = new SignInDataStore$get$1(i6, i, shortNewsContentCardView);
            signInDataStore$get$3.serializer = flowCollector;
            signInDataStore$get$3.write = th;
            return signInDataStore$get$3.invokeSuspend(createfromparcel);
        }
        if (i5 == 3) {
            SignInDataStore$get$1 signInDataStore$get$4 = new SignInDataStore$get$1(i6, i6, shortNewsContentCardView);
            signInDataStore$get$4.serializer = flowCollector;
            signInDataStore$get$4.write = th;
            Object objInvokeSuspend = signInDataStore$get$4.invokeSuspend(createfromparcel);
            int i8 = RemoteActionCompatParcelizer + 53;
            RatingCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return objInvokeSuspend;
        }
        int i10 = 4;
        if (i5 != 4) {
            SignInDataStore$get$1 signInDataStore$get$5 = new SignInDataStore$get$1(i6, 5, shortNewsContentCardView);
            signInDataStore$get$5.serializer = flowCollector;
            signInDataStore$get$5.write = th;
            return signInDataStore$get$5.invokeSuspend(createfromparcel);
        }
        SignInDataStore$get$1 signInDataStore$get$6 = new SignInDataStore$get$1(i6, i10, shortNewsContentCardView);
        signInDataStore$get$6.serializer = flowCollector;
        signInDataStore$get$6.write = th;
        return signInDataStore$get$6.invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = this.read;
        Object obj2 = createFromParcel.INSTANCE;
        if (i2 == 0) {
            FlowCollector flowCollector = this.serializer;
            Throwable th = this.write;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.IconCompatParcelizer;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.write(new SignInDataStoreException("Failed to fetch datastore for sign in data", th));
            backwardFocusSearch backwardfocussearch = setNativeShader.read();
            this.serializer = null;
            this.write = null;
            this.IconCompatParcelizer = 1;
            return flowCollector.emit(backwardfocussearch, this) == coroutineSingletons ? coroutineSingletons : obj2;
        }
        if (i2 == 1) {
            FlowCollector flowCollector2 = this.serializer;
            Throwable th2 = this.write;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.IconCompatParcelizer;
            if (i4 != 0) {
                if (i4 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!(th2 instanceof IOException)) {
                throw th2;
            }
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th2, "Failed to read from DataStore", new Object[0]);
            backwardFocusSearch backwardfocussearch2 = setNativeShader.read();
            this.serializer = null;
            this.write = null;
            this.IconCompatParcelizer = 1;
            return flowCollector2.emit(backwardfocussearch2, this) == coroutineSingletons2 ? coroutineSingletons2 : obj2;
        }
        if (i2 == 2) {
            FlowCollector flowCollector3 = this.serializer;
            Throwable th3 = this.write;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.IconCompatParcelizer;
            if (i5 != 0) {
                if (i5 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th3, "Crowdsourcing: ObserveUploadCompletionUseCase failed", new Object[0]);
            onItemDismiss onitemdismiss = new onItemDismiss(ExtrasKt.IconCompatParcelizer(th3));
            this.serializer = null;
            this.write = null;
            this.IconCompatParcelizer = 1;
            if (flowCollector3.emit(onitemdismiss, this) != coroutineSingletons3) {
                return obj2;
            }
            int i6 = RemoteActionCompatParcelizer + 91;
            RatingCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return coroutineSingletons3;
        }
        if (i2 == 3) {
            FlowCollector flowCollector4 = this.serializer;
            Throwable th4 = this.write;
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = this.IconCompatParcelizer;
            if (i8 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Timber.RemoteActionCompatParcelizer.write(new ForgotPasswordTimberException("Failed to fetch forgot password timer datastore", th4));
                backwardFocusSearch backwardfocussearch3 = setNativeShader.read();
                this.serializer = null;
                this.write = null;
                this.IconCompatParcelizer = 1;
                if (flowCollector4.emit(backwardfocussearch3, this) == coroutineSingletons4) {
                    int i9 = RemoteActionCompatParcelizer + 47;
                    RatingCompat = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    obj2 = coroutineSingletons4;
                }
            } else if (i8 == 1) {
                int i11 = RatingCompat + 61;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            }
            int i13 = RatingCompat + 79;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                int i14 = 70 / 0;
            }
            return obj2;
        }
        if (i2 != 4) {
            FlowCollector flowCollector5 = this.serializer;
            Throwable th5 = this.write;
            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i15 = this.IconCompatParcelizer;
            if (i15 != 0) {
                if (i15 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.write(new TwoFaTimberException("Failed to fetch two fa timer datastore", th5));
            backwardFocusSearch backwardfocussearch4 = setNativeShader.read();
            this.serializer = null;
            this.write = null;
            this.IconCompatParcelizer = 1;
            return flowCollector5.emit(backwardfocussearch4, this) == coroutineSingletons5 ? coroutineSingletons5 : obj2;
        }
        FlowCollector flowCollector6 = this.serializer;
        Throwable th6 = this.write;
        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i16 = this.IconCompatParcelizer;
        if (i16 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.write(new NafathTimberException("Failed to fetch Nafath timer datastore", th6));
            backwardFocusSearch backwardfocussearch5 = setNativeShader.read();
            this.serializer = null;
            this.write = null;
            this.IconCompatParcelizer = 1;
            return flowCollector6.emit(backwardfocussearch5, this) == coroutineSingletons6 ? coroutineSingletons6 : obj2;
        }
        int i17 = RatingCompat + 43;
        int i18 = i17 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i18;
        int i19 = i17 % 2;
        if (i16 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i20 = i18 + 3;
        RatingCompat = i20 % Fields.SpotShadowColor;
        if (i20 % 2 != 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj2;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        int i21 = 68 / 0;
        return obj2;
    }
}
