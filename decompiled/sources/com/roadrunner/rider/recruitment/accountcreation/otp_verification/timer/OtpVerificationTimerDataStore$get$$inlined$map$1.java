package com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import o.ActivityHandler10;
import o.ActivityHandler11;
import o.ActivityHandlerExternalSyntheticLambda7;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getNoActiveChildannotations;
import o.isAdapterPositionOnScreen;
import o.isRoot;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class OtpVerificationTimerDataStore$get$$inlined$map$1 implements Flow {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ DropShadowEffect RemoteActionCompatParcelizer;
    public final /* synthetic */ FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 read;
    public final /* synthetic */ int write;

    /* JADX INFO: renamed from: com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;
        public final /* synthetic */ DropShadowEffect read;
        public final /* synthetic */ int serializer;
        public final /* synthetic */ FlowCollector write;

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, DropShadowEffect dropShadowEffect, int i) {
            this.serializer = i;
            this.write = flowCollector;
            this.read = dropShadowEffect;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003d  */
        /* JADX WARN: Code duplicated, block: B:26:0x007b  */
        /* JADX WARN: Code duplicated, block: B:28:0x008b  */
        /* JADX WARN: Code duplicated, block: B:9:0x002d  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            ActivityHandlerExternalSyntheticLambda7 activityHandlerExternalSyntheticLambda7;
            int i;
            ActivityHandler11 activityHandler11;
            int i2;
            int i3 = 2 % 2;
            int i4 = this.serializer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            DropShadowEffect dropShadowEffect = this.read;
            FlowCollector flowCollector = this.write;
            ActivityHandler10 activityHandler10 = null;
            if (i4 != 0) {
                if (shortNewsContentCardView instanceof ActivityHandler11) {
                    int i5 = RemoteActionCompatParcelizer + 71;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    activityHandler11 = (ActivityHandler11) shortNewsContentCardView;
                    int i7 = activityHandler11.IconCompatParcelizer;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        activityHandler11.IconCompatParcelizer = i7 - Integer.MIN_VALUE;
                    } else {
                        activityHandler11 = new ActivityHandler11(this, shortNewsContentCardView);
                        i2 = IconCompatParcelizer + 51;
                        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            int i8 = 5 % 4;
                        }
                    }
                } else {
                    activityHandler11 = new ActivityHandler11(this, shortNewsContentCardView);
                    i2 = IconCompatParcelizer + 51;
                    RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        int i9 = 5 % 4;
                    }
                }
                Object obj2 = activityHandler11.serializer;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = activityHandler11.IconCompatParcelizer;
                if (i10 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    Object objSerializer = ((getNoActiveChildannotations) obj).serializer((isRoot) dropShadowEffect.MediaDescriptionCompat);
                    activityHandler11.IconCompatParcelizer = 1;
                    return flowCollector.emit(objSerializer, activityHandler11) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                }
                if (i10 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            if (shortNewsContentCardView instanceof ActivityHandlerExternalSyntheticLambda7) {
                activityHandlerExternalSyntheticLambda7 = (ActivityHandlerExternalSyntheticLambda7) shortNewsContentCardView;
                int i11 = activityHandlerExternalSyntheticLambda7.IconCompatParcelizer;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    activityHandlerExternalSyntheticLambda7.IconCompatParcelizer = i11 - Integer.MIN_VALUE;
                } else {
                    activityHandlerExternalSyntheticLambda7 = new ActivityHandlerExternalSyntheticLambda7(this, shortNewsContentCardView);
                    i = IconCompatParcelizer + 13;
                    RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        int i12 = 3 % 2;
                    }
                }
            } else {
                activityHandlerExternalSyntheticLambda7 = new ActivityHandlerExternalSyntheticLambda7(this, shortNewsContentCardView);
                i = IconCompatParcelizer + 13;
                RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    int i13 = 3 % 2;
                }
            }
            Object obj3 = activityHandlerExternalSyntheticLambda7.write;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i14 = activityHandlerExternalSyntheticLambda7.IconCompatParcelizer;
            if (i14 != 0) {
                int i15 = IconCompatParcelizer + 111;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0 ? i14 != 1 : i14 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
            String str = (String) ((getNoActiveChildannotations) obj).serializer((isRoot) dropShadowEffect.serializer);
            if (str != null) {
                try {
                    resetTransientState resettransientstate = (resetTransientState) ((isAdapterPositionOnScreen) dropShadowEffect.write).MediaSessionCompatResultReceiverWrapper();
                    resettransientstate.getClass();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(ActivityHandler10.Companion.serializer());
                    activityHandler10 = (ActivityHandler10) resettransientstate.serializer(str, setgraphicmodalmaxwidthdp);
                } catch (Exception e) {
                    Timber.RemoteActionCompatParcelizer.write(new OtpVerificationTimberException("Failed to decode otp verification timer datastore", e));
                }
            }
            activityHandlerExternalSyntheticLambda7.IconCompatParcelizer = 1;
            return flowCollector.emit(activityHandler10, activityHandlerExternalSyntheticLambda7) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
    }

    public /* synthetic */ OtpVerificationTimerDataStore$get$$inlined$map$1(FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, DropShadowEffect dropShadowEffect, int i) {
        this.write = i;
        this.read = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
        this.RemoteActionCompatParcelizer = dropShadowEffect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r8 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r9 = com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1.serializer + 49;
        com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1.IconCompatParcelizer = r9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if ((r9 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        r8 = r5.collect(new com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1.AnonymousClass2(r8, r4, r2), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r8 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        r9 = com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1.serializer + 43;
        com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1.IconCompatParcelizer = r9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r9 = r9 % 2;
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        r8 = com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1.serializer + 63;
        com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1.IconCompatParcelizer = r8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r8 = r5.collect(new com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1.AnonymousClass2(r8, r4, 1), r9);
     */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r8, o.ShortNewsContentCardView r9) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1.IconCompatParcelizer
            int r1 = r1 + 19
            int r2 = r1 % 128
            com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1.serializer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1d
            int r1 = r7.write
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            com.airbnb.lottie.parser.DropShadowEffect r4 = r7.RemoteActionCompatParcelizer
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 r5 = r7.read
            r6 = 75
            int r6 = r6 / r2
            if (r1 == 0) goto L45
            goto L27
        L1d:
            int r1 = r7.write
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            com.airbnb.lottie.parser.DropShadowEffect r4 = r7.RemoteActionCompatParcelizer
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 r5 = r7.read
            if (r1 == 0) goto L45
        L27:
            com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1$2 r1 = new com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1$2
            r2 = 1
            r1.<init>(r8, r4, r2)
            java.lang.Object r8 = r5.collect(r1, r9)
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r8 != r9) goto L44
            int r9 = com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1.serializer
            int r9 = r9 + 49
            int r1 = r9 % 128
            com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1.IconCompatParcelizer = r1
            int r9 = r9 % r0
            if (r9 != 0) goto L42
            r3 = r8
            goto L44
        L42:
            r8 = 0
            throw r8
        L44:
            return r3
        L45:
            com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1$2 r1 = new com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1$2
            r1.<init>(r8, r4, r2)
            java.lang.Object r8 = r5.collect(r1, r9)
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r8 != r9) goto L5c
            int r9 = com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1.serializer
            int r9 = r9 + 43
            int r1 = r9 % 128
            com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1.IconCompatParcelizer = r1
            int r9 = r9 % r0
            r3 = r8
        L5c:
            int r8 = com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1.serializer
            int r8 = r8 + 63
            int r9 = r8 % 128
            com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1.IconCompatParcelizer = r9
            int r8 = r8 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1.collect(kotlinx.coroutines.flow.FlowCollector, o.ShortNewsContentCardView):java.lang.Object");
    }
}
