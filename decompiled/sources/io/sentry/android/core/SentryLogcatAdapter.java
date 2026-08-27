package io.sentry.android.core;

import android.content.pm.PackageManager;
import android.util.Log;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.roadrunner.twofa.presentation.TwoFaViewModel$onPinChanged$1;
import io.socket.parser.IOParser$Decoder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ViewLayerCompanionLayerOutlineProvider1;
import o._get_messageWebView_lambda3;
import o.getHoldoutVariationName;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.internalHeightCallbacklambda0;
import o.logClicklambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.resetPivot;
import o.setCanUseCompositingLayerui_graphics;
import o.setDrawParams;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SentryLogcatAdapter {
    public static void read(String str, r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco, String str2, Throwable th) {
        getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = new getIntentArrayWithConfiguredBackStacklambda1();
        getintentarraywithconfiguredbackstacklambda1.write = "Logcat";
        getintentarraywithconfiguredbackstacklambda1.serializer = str2;
        getintentarraywithconfiguredbackstacklambda1.read = r8lambdal32xcezw71g2xzeh1nm3nimxco;
        if (str != null) {
            getintentarraywithconfiguredbackstacklambda1.read(str, RemoteMessageConst.Notification.TAG);
        }
        if (th != null && th.getMessage() != null) {
            getintentarraywithconfiguredbackstacklambda1.read(th.getMessage(), "throwable");
        }
        internalHeightCallbacklambda0.IconCompatParcelizer().read(getintentarraywithconfiguredbackstacklambda1);
    }

    public static int IconCompatParcelizer(String str, String str2) {
        read(str, r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, str2, null);
        serializer(logClicklambda0.WARN, str2, null);
        return Log.w(str, str2);
    }

    public static int serializer(String str, String str2) {
        read(str, r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, str2, null);
        serializer(logClicklambda0.ERROR, str2, null);
        return Log.e(str, str2);
    }

    public static void serializer(logClicklambda0 logclicklambda0, String str, Throwable th) {
        if (internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer().getLogs().write) {
            String message = th != null ? th.getMessage() : null;
            IOParser$Decoder iOParser$Decoder = new IOParser$Decoder(22);
            iOParser$Decoder.read = "auto.log.logcat";
            if (th == null || message == null) {
                internalHeightCallbacklambda0.IconCompatParcelizer().MediaDescriptionCompat().IconCompatParcelizer(logclicklambda0, iOParser$Decoder, str, new Object[0]);
                return;
            }
            io.sentry.logger.RemoteActionCompatParcelizer remoteActionCompatParcelizerMediaDescriptionCompat = internalHeightCallbacklambda0.IconCompatParcelizer().MediaDescriptionCompat();
            if (str != null) {
                message = af$$ExternalSyntheticOutline0.m(str, "\n", message);
            }
            remoteActionCompatParcelizerMediaDescriptionCompat.IconCompatParcelizer(logclicklambda0, iOParser$Decoder, message, new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object handleApi(TwoFaViewModel$onPinChanged$1 twoFaViewModel$onPinChanged$1, ContinuationImpl continuationImpl) {
        resetPivot resetpivot;
        if (continuationImpl instanceof resetPivot) {
            resetpivot = (resetPivot) continuationImpl;
            int i = resetpivot.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                resetpivot.write = i - Integer.MIN_VALUE;
            } else {
                resetpivot = new resetPivot(continuationImpl);
            }
        } else {
            resetpivot = new resetPivot(continuationImpl);
        }
        Object objInvoke = resetpivot.IconCompatParcelizer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = resetpivot.write;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                resetpivot.write = 1;
                objInvoke = twoFaViewModel$onPinChanged$1.invoke(resetpivot);
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            }
            getHoldoutVariationName getholdoutvariationname = (getHoldoutVariationName) objInvoke;
            Object obj2 = getholdoutvariationname.body;
            if (getholdoutvariationname.rawResponse.isSuccessful) {
                return new ViewLayerCompanionLayerOutlineProvider1(obj2);
            }
            _get_messageWebView_lambda3 _get_messagewebview_lambda3 = getholdoutvariationname.errorBody;
            if (_get_messagewebview_lambda3 != null) {
                _get_messagewebview_lambda3.MediaMetadataCompat();
            }
            return new setCanUseCompositingLayerui_graphics();
        } catch (HttpException unused) {
            return new setCanUseCompositingLayerui_graphics();
        } catch (Exception e) {
            return new setDrawParams(e);
        }
    }

    public static void serializer(PackageManager.NameNotFoundException nameNotFoundException) {
        read("emoji2.text.DefaultEmojiConfig", r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, null, nameNotFoundException);
        serializer(logClicklambda0.FATAL, null, nameNotFoundException);
        Log.wtf("emoji2.text.DefaultEmojiConfig", nameNotFoundException);
    }

    public static int read(String str, String str2, Throwable th) {
        read(str, r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, str2, th);
        serializer(logClicklambda0.ERROR, str2, th);
        return Log.e(str, str2, th);
    }

    public static int write(String str, String str2, Throwable th) {
        read(str, r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, str2, th);
        serializer(logClicklambda0.WARN, str2, th);
        return Log.w(str, str2, th);
    }

    public static void IconCompatParcelizer(String str, String str2, Exception exc) {
        read(str, r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, str2, exc);
        serializer(logClicklambda0.FATAL, str2, exc);
        Log.wtf(str, str2, exc);
    }

    public static void IconCompatParcelizer(String str, Throwable th) {
        read(str, r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, null, th);
        serializer(logClicklambda0.WARN, null, th);
        Log.w(str, th);
    }
}
