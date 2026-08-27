package com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.setNativeShader;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class OtpVerificationTimerDataStore$get$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    public /* synthetic */ Throwable RemoteActionCompatParcelizer;
    public /* synthetic */ FlowCollector read;
    public int serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OtpVerificationTimerDataStore$get$1(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.write = i2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        FlowCollector flowCollector = (FlowCollector) obj;
        Throwable th = (Throwable) obj2;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj3;
        int i5 = 3;
        if (i4 != 0) {
            OtpVerificationTimerDataStore$get$1 otpVerificationTimerDataStore$get$1 = new OtpVerificationTimerDataStore$get$1(i5, 1, shortNewsContentCardView);
            otpVerificationTimerDataStore$get$1.read = flowCollector;
            otpVerificationTimerDataStore$get$1.RemoteActionCompatParcelizer = th;
            return otpVerificationTimerDataStore$get$1.invokeSuspend(createfromparcel);
        }
        OtpVerificationTimerDataStore$get$1 otpVerificationTimerDataStore$get$2 = new OtpVerificationTimerDataStore$get$1(i5, 0, shortNewsContentCardView);
        otpVerificationTimerDataStore$get$2.read = flowCollector;
        otpVerificationTimerDataStore$get$2.RemoteActionCompatParcelizer = th;
        Object objInvokeSuspend = otpVerificationTimerDataStore$get$2.invokeSuspend(createfromparcel);
        int i6 = MediaBrowserCompatMediaItem + 123;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 == 0) {
            FlowCollector flowCollector = this.read;
            Throwable th = this.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.serializer;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Timber.RemoteActionCompatParcelizer.write(new OtpVerificationTimberException("Failed to fetch otp verification timer datastore", th));
                backwardFocusSearch backwardfocussearch = setNativeShader.read();
                this.read = null;
                this.RemoteActionCompatParcelizer = null;
                this.serializer = 1;
                return flowCollector.emit(backwardfocussearch, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            if (i5 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i6 = MediaBrowserCompatMediaItem + 55;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return null;
        }
        FlowCollector flowCollector2 = this.read;
        Throwable th2 = this.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.serializer;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.write(new OtpVerificationTimberException("Failed to fetch otp verification request id datastore", th2));
            backwardFocusSearch backwardfocussearch2 = setNativeShader.read();
            this.read = null;
            this.RemoteActionCompatParcelizer = null;
            this.serializer = 1;
            return flowCollector2.emit(backwardfocussearch2, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        if (i8 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i9 = MediaBrowserCompatMediaItem + 69;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return null;
        }
        int i11 = MediaBrowserCompatMediaItem + 109;
        IconCompatParcelizer = i11 % Fields.SpotShadowColor;
        if (i11 % 2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        int i12 = 36 / 0;
        return createfromparcel;
    }
}
