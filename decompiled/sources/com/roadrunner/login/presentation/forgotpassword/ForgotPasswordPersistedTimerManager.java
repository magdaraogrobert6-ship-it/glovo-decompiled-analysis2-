package com.roadrunner.login.presentation.forgotpassword;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.countdowntimer.CountDownTimerUiModel;
import com.roadrunner.login.domain.forgotpassword.usecase.GetRemainingForgotPasswordTimerIfRunning;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.sentiance.core.model.events.N$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.C0166g;
import o.C0175h;
import o.createFromParcel;
import o.endStream;
import o.getCieXyz;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;
import o.removeNodeAtDepth;
import o.setSuccessfulruntime;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class ForgotPasswordPersistedTimerManager {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final CountDownTimerUiModel IconCompatParcelizer;
    public final transferSessionPackageI RemoteActionCompatParcelizer;
    public final GetRemainingForgotPasswordTimerIfRunning read;
    public final CountDownTimerUiModel serializer;
    public final GetRemainingForgotPasswordTimerIfRunning write;

    public ForgotPasswordPersistedTimerManager(CountDownTimerUiModel countDownTimerUiModel, CountDownTimerUiModel countDownTimerUiModel2, transferSessionPackageI transfersessionpackagei, GetRemainingForgotPasswordTimerIfRunning getRemainingForgotPasswordTimerIfRunning, GetRemainingForgotPasswordTimerIfRunning getRemainingForgotPasswordTimerIfRunning2) {
        countDownTimerUiModel.getClass();
        countDownTimerUiModel2.getClass();
        transfersessionpackagei.getClass();
        getRemainingForgotPasswordTimerIfRunning.getClass();
        getRemainingForgotPasswordTimerIfRunning2.getClass();
        this.IconCompatParcelizer = countDownTimerUiModel;
        this.serializer = countDownTimerUiModel2;
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
        this.write = getRemainingForgotPasswordTimerIfRunning;
        this.read = getRemainingForgotPasswordTimerIfRunning2;
    }

    public final CountDownTimerUiModel write(endStream endstream) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 71;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object[] objArr = {endstream, C0166g.read};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            CountDownTimerUiModel countDownTimerUiModel = this.IconCompatParcelizer;
            int i4 = MediaSessionCompatQueueItem + 77;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return countDownTimerUiModel;
        }
        Object[] objArr2 = {endstream, C0175h.read};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        CountDownTimerUiModel countDownTimerUiModel2 = this.serializer;
        int i6 = MediaSessionCompatQueueItem + 69;
        MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return countDownTimerUiModel2;
    }

    public final Object start(endStream endstream, ContinuationImpl continuationImpl) throws Throwable {
        long jWrite;
        int i = 2 % 2;
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{endstream, C0166g.read}, getCieXyz.write())).booleanValue();
        transferSessionPackageI transfersessionpackagei = this.RemoteActionCompatParcelizer;
        if (zBooleanValue) {
            int i2 = MediaSessionCompatQueueItem + 101;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                jWrite = ((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer.write("reset_password_by_magic_link_timeout");
                int i3 = 54 / 0;
            } else {
                jWrite = ((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer.write("reset_password_by_magic_link_timeout");
            }
        } else {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{endstream, C0175h.read}, getCieXyz.write())).booleanValue()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                int i4 = MediaDescriptionCompat + 55;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            int i5 = MediaDescriptionCompat + 91;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                jWrite = ((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer.write("login_otp_timeout_duration");
                int i6 = 69 / 0;
            } else {
                jWrite = ((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer.write("login_otp_timeout_duration");
            }
        }
        write(endstream).write(jWrite);
        GetRemainingForgotPasswordTimerIfRunning getRemainingForgotPasswordTimerIfRunning = this.read;
        getRemainingForgotPasswordTimerIfRunning.getClass();
        setSuccessfulruntime setsuccessfulruntime = new setSuccessfulruntime((jWrite * 1000) + System.currentTimeMillis());
        N$b n$b = getRemainingForgotPasswordTimerIfRunning.read;
        ((inCompatibilityMode) ((isOpenInternalroom_runtime) n$b.write)).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new ReconnectScheduler$schedule$1(endstream, n$b, setsuccessfulruntime, null, 13), continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (objWithContext != coroutineSingletons) {
            int i7 = MediaSessionCompatQueueItem + 85;
            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            objWithContext = createfromparcel;
        }
        if (objWithContext != coroutineSingletons) {
            objWithContext = createfromparcel;
        }
        return objWithContext == coroutineSingletons ? objWithContext : createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
    
        if (start(r8, r1) == r4) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resumeIfPersisted(o.endStream r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.login.presentation.forgotpassword.ForgotPasswordPersistedTimerManager.resumeIfPersisted(o.endStream, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
