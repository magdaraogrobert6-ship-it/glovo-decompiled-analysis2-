package o;

import android.os.SystemClock;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.sdk.services.ServiceManager;

/* JADX INFO: loaded from: classes3.dex */
public final class getHtmlSpannedTextIfEnabledlambda0 {
    private ServiceManager.StartState IconCompatParcelizer = ServiceManager.StartState.STOPPED;
    final /* synthetic */ ServiceManager RemoteActionCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI serializer;
    private long write;

    public static boolean IconCompatParcelizer(getHtmlSpannedTextIfEnabledlambda0 gethtmlspannedtextifenabledlambda0) {
        return gethtmlspannedtextifenabledlambda0.IconCompatParcelizer == ServiceManager.StartState.START_FAILED;
    }

    public static boolean RemoteActionCompatParcelizer(getHtmlSpannedTextIfEnabledlambda0 gethtmlspannedtextifenabledlambda0) {
        return gethtmlspannedtextifenabledlambda0.IconCompatParcelizer == ServiceManager.StartState.STOPPED;
    }

    public static boolean read(getHtmlSpannedTextIfEnabledlambda0 gethtmlspannedtextifenabledlambda0) {
        return gethtmlspannedtextifenabledlambda0.IconCompatParcelizer == ServiceManager.StartState.START_RESTRICTED;
    }

    public static boolean serializer(getHtmlSpannedTextIfEnabledlambda0 gethtmlspannedtextifenabledlambda0) {
        r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = gethtmlspannedtextifenabledlambda0.serializer;
        ServiceManager.StartState startState = gethtmlspannedtextifenabledlambda0.IconCompatParcelizer;
        ServiceManager.StartState startState2 = ServiceManager.StartState.START_RESTRICTED;
        if (startState != startState2 && startState != ServiceManager.StartState.START_FAILED) {
            return false;
        }
        if (startState == startState2) {
            r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
            if (SystemClock.elapsedRealtime() - gethtmlspannedtextifenabledlambda0.RemoteActionCompatParcelizer.PlaybackStateCompatCustomAction < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                return true;
            }
        }
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        return SystemClock.elapsedRealtime() - gethtmlspannedtextifenabledlambda0.write > 1000;
    }

    public final void write(ServiceManager.StartState startState) {
        this.IconCompatParcelizer = startState;
        this.serializer.getClass();
        this.write = SystemClock.elapsedRealtime();
    }

    public getHtmlSpannedTextIfEnabledlambda0(ServiceManager serviceManager, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.RemoteActionCompatParcelizer = serviceManager;
        this.serializer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    public static boolean write(getHtmlSpannedTextIfEnabledlambda0 gethtmlspannedtextifenabledlambda0) {
        return gethtmlspannedtextifenabledlambda0.IconCompatParcelizer == ServiceManager.StartState.STARTED;
    }
}
