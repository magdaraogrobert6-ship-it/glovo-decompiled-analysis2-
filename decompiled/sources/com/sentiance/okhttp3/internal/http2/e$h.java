package com.sentiance.okhttp3.internal.http2;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.countdowntimer.CountDownTimerUiModel;
import com.roadrunner.countdowntimer.CountDownTimerUiModel$observeTimerState$$inlined$map$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.twofa.domain.GetRemainingTwoFaTimerIfRunning;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getContentCaptureSessionui;
import o.getPlatformAndroidManager;
import o.isOpenInternalroom_runtime;
import o.onHideTranslationui;
import o.populate;
import o.setGoogleAdvertisingIdlambda10;
import o.setOutboundNetworkRequestsOffline;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class e$h {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public Object IconCompatParcelizer;
    public boolean MediaSessionCompatQueueItem;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    public e$h(CountDownTimerUiModel countDownTimerUiModel, GetRemainingTwoFaTimerIfRunning getRemainingTwoFaTimerIfRunning, GetRemainingTwoFaTimerIfRunning getRemainingTwoFaTimerIfRunning2, transferSessionPackageI transfersessionpackagei, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        countDownTimerUiModel.getClass();
        getRemainingTwoFaTimerIfRunning.getClass();
        getRemainingTwoFaTimerIfRunning2.getClass();
        transfersessionpackagei.getClass();
        isopeninternalroom_runtime.getClass();
        this.write = countDownTimerUiModel;
        this.read = getRemainingTwoFaTimerIfRunning;
        this.RemoteActionCompatParcelizer = getRemainingTwoFaTimerIfRunning2;
        this.serializer = transfersessionpackagei;
        this.IconCompatParcelizer = isopeninternalroom_runtime;
    }

    public float IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 63;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        float fSerializer = ((getContentCaptureSessionui) ((populate) this.RemoteActionCompatParcelizer)).serializer();
        int i4 = MediaDescriptionCompat + 39;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return fSerializer;
    }

    public int RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 23;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((onHideTranslationui) ((getPlatformAndroidManager) this.read)).serializer();
            throw null;
        }
        int iSerializer = ((onHideTranslationui) ((getPlatformAndroidManager) this.read)).serializer();
        int i3 = MediaBrowserCompatMediaItem + 33;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iSerializer;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    public Object start(ContinuationImpl continuationImpl) {
        setOutboundNetworkRequestsOffline setoutboundnetworkrequestsoffline;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 81;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            boolean z = continuationImpl instanceof setOutboundNetworkRequestsOffline;
            throw null;
        }
        CountDownTimerUiModel countDownTimerUiModel = (CountDownTimerUiModel) this.write;
        if (continuationImpl instanceof setOutboundNetworkRequestsOffline) {
            setoutboundnetworkrequestsoffline = (setOutboundNetworkRequestsOffline) continuationImpl;
            int i3 = setoutboundnetworkrequestsoffline.read;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                setoutboundnetworkrequestsoffline.read = i3 - Integer.MIN_VALUE;
                int i4 = MediaBrowserCompatMediaItem + 13;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                setoutboundnetworkrequestsoffline = new setOutboundNetworkRequestsOffline(this, continuationImpl);
            }
        } else {
            setoutboundnetworkrequestsoffline = new setOutboundNetworkRequestsOffline(this, continuationImpl);
        }
        Object objDetermineDuration = setoutboundnetworkrequestsoffline.RemoteActionCompatParcelizer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = setoutboundnetworkrequestsoffline.read;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objDetermineDuration);
            if (!this.MediaSessionCompatQueueItem) {
                this.MediaSessionCompatQueueItem = true;
                setoutboundnetworkrequestsoffline.read = 1;
                objDetermineDuration = determineDuration(setoutboundnetworkrequestsoffline);
                if (objDetermineDuration == obj) {
                    return obj;
                }
            }
            return new CountDownTimerUiModel$observeTimerState$$inlined$map$1(countDownTimerUiModel.write.serializer, countDownTimerUiModel, R.string.two_factor_auth_request_again_in);
        }
        if (i6 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i7 = MediaDescriptionCompat + 71;
        MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        ExtrasKt.RemoteActionCompatParcelizer(objDetermineDuration);
        countDownTimerUiModel.write(((Number) objDetermineDuration).longValue());
        return new CountDownTimerUiModel$observeTimerState$$inlined$map$1(countDownTimerUiModel.write.serializer, countDownTimerUiModel, R.string.two_factor_auth_request_again_in);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    public Object determineDuration(ContinuationImpl continuationImpl) {
        setGoogleAdvertisingIdlambda10 setgoogleadvertisingidlambda10;
        Long l;
        int i = 2 % 2;
        if (continuationImpl instanceof setGoogleAdvertisingIdlambda10) {
            setgoogleadvertisingidlambda10 = (setGoogleAdvertisingIdlambda10) continuationImpl;
            int i2 = setgoogleadvertisingidlambda10.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaDescriptionCompat + 7;
                MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                setgoogleadvertisingidlambda10.read = i3 % 2 != 0 ? i2 % Integer.MIN_VALUE : i2 - Integer.MIN_VALUE;
            } else {
                setgoogleadvertisingidlambda10 = new setGoogleAdvertisingIdlambda10(this, continuationImpl);
            }
        } else {
            setgoogleadvertisingidlambda10 = new setGoogleAdvertisingIdlambda10(this, continuationImpl);
        }
        Object objInvoke = setgoogleadvertisingidlambda10.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = setgoogleadvertisingidlambda10.read;
        Long l2 = null;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            GetRemainingTwoFaTimerIfRunning getRemainingTwoFaTimerIfRunning = (GetRemainingTwoFaTimerIfRunning) this.read;
            setgoogleadvertisingidlambda10.read = 1;
            objInvoke = getRemainingTwoFaTimerIfRunning.invoke(setgoogleadvertisingidlambda10);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = MediaBrowserCompatMediaItem + 75;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        }
        long jLongValue = ((Number) objInvoke).longValue();
        if (jLongValue <= 0) {
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) this.serializer);
            String str = firebaseRemoteConfigImpl.read.read();
            if (str == null) {
                jLongValue = 0;
            } else {
                Object obj = firebaseRemoteConfigImpl.IconCompatParcelizer.IconCompatParcelizer("request_again_timeout_config_in_seconds", str).get("2fa");
                if (obj instanceof Long) {
                    int i7 = MediaBrowserCompatMediaItem + 39;
                    MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        l = (Long) obj;
                        int i8 = 39 / 0;
                    } else {
                        l = (Long) obj;
                    }
                    l2 = l;
                }
                if (l2 != null) {
                    int i9 = MediaDescriptionCompat + 9;
                    MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    jLongValue = l2.longValue();
                    int i11 = MediaBrowserCompatMediaItem + 29;
                    MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                } else {
                    jLongValue = 0;
                }
            }
            if (jLongValue <= 0) {
                jLongValue = 60;
            }
        }
        return new Long(jLongValue);
    }

    public e$h() {
    }
}
