package o;

import android.provider.Settings;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getNoneui_textannotations extends androidx.lifecycle.ViewModel {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final MutableStateFlow IconCompatParcelizer;
    public final OtpLogger MediaBrowserCompatMediaItem;
    public final StateFlow MediaDescriptionCompat;
    public final setTransactionSuccessful RatingCompat;
    public final getQueryContext RemoteActionCompatParcelizer;
    public final setVerticalStyle read;
    public final TextIndentKt serializer;
    public final TextMotion write;

    public getNoneui_textannotations(TextIndentKt textIndentKt, TextMotion textMotion, setTransactionSuccessful settransactionsuccessful, OtpLogger otpLogger, setVerticalStyle setverticalstyle, getQueryContext getquerycontext) {
        textIndentKt.getClass();
        textMotion.getClass();
        settransactionsuccessful.getClass();
        otpLogger.getClass();
        setverticalstyle.getClass();
        getquerycontext.getClass();
        this.serializer = textIndentKt;
        this.write = textMotion;
        this.RatingCompat = settransactionsuccessful;
        this.MediaBrowserCompatMediaItem = otpLogger;
        this.read = setverticalstyle;
        this.RemoteActionCompatParcelizer = getquerycontext;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(copyNB67dxodefault.serializer);
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaDescriptionCompat = mutableStateFlow;
        serializer();
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 55;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer.IconCompatParcelizer(copyNB67dxodefault.serializer);
        this.RemoteActionCompatParcelizer.serializer(copyNB67dxo.IconCompatParcelizer);
        int i4 = MediaSessionCompatQueueItem + 97;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a A[PHI: r1
  0x003a: PHI (r1v20 o.setVerticalStyle) = (r1v4 o.setVerticalStyle), (r1v21 o.setVerticalStyle) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r1
  0x002f: PHI (r1v5 o.setVerticalStyle) = (r1v4 o.setVerticalStyle), (r1v21 o.setVerticalStyle) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public final void write() {
        setVerticalStyle setverticalstyle;
        boolean z;
        boolean z2;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 81;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            setverticalstyle = this.read;
            if (Settings.Global.getInt(setverticalstyle.read.getContentResolver(), "auto_time", 1) == 0) {
                int i3 = MediaMetadataCompat + 43;
                MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            setverticalstyle = this.read;
            if (Settings.Global.getInt(setverticalstyle.read.getContentResolver(), "auto_time", 0) == 1) {
                int i5 = MediaMetadataCompat + 43;
                MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
        }
        if (Settings.Global.getInt(setverticalstyle.read.getContentResolver(), "auto_time_zone", 0) == 1) {
            int i7 = MediaMetadataCompat + 41;
            MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        OtpLogger otpLogger = this.MediaBrowserCompatMediaItem;
        otpLogger.getClass();
        otpLogger.RemoteActionCompatParcelizer(new TrackingEvent("DIALOG_BUTTON_CLICK", "time_manipulated_blocking_ui", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("action", "click"), new onViewAttachedToWindowlambda0("settings_global_auto_time", Boolean.valueOf(z)), new onViewAttachedToWindowlambda0("settings_global_auto_time_zone", Boolean.valueOf(z2)))));
    }

    public final void serializer() {
        boolean z;
        int i = 2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.write.serializer;
        String strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
        boolean zM = strSerializer == null ? false : m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_TRUSTED_TIME_BLOCKING_UI_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, strSerializer, firebaseRemoteConfigImpl);
        copyNB67dxodefault copynb67dxodefault = copyNB67dxodefault.serializer;
        MutableStateFlow mutableStateFlow = this.IconCompatParcelizer;
        Object obj = null;
        if (!zM) {
            int i2 = MediaMetadataCompat + 95;
            MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                mutableStateFlow.IconCompatParcelizer(copynb67dxodefault);
                return;
            } else {
                mutableStateFlow.IconCompatParcelizer(copynb67dxodefault);
                throw null;
            }
        }
        if (this.serializer.serializer()) {
            setTransactionSuccessful settransactionsuccessful = this.RatingCompat;
            mutableStateFlow.IconCompatParcelizer(new TextGeometricTransformCompanion(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.time_manipulated_error_dialog_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.time_manipulated_error_dialog_description), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.time_manipulated_error_dialog_go_to_settings)));
            int i3 = MediaSessionCompatQueueItem + 57;
            MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        setVerticalStyle setverticalstyle = this.read;
        if (Settings.Global.getInt(setverticalstyle.read.getContentResolver(), "auto_time", 0) == 1) {
            int i4 = MediaSessionCompatQueueItem + 103;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        boolean z2 = Settings.Global.getInt(setverticalstyle.read.getContentResolver(), "auto_time_zone", 0) == 1;
        OtpLogger otpLogger = this.MediaBrowserCompatMediaItem;
        otpLogger.getClass();
        otpLogger.RemoteActionCompatParcelizer(new TrackingEvent(GrsBaseInfo.CountryCodeSource.UNKNOWN, "time_manipulated_blocking_ui", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("action", "change"), new onViewAttachedToWindowlambda0("settings_global_auto_time", Boolean.valueOf(z)), new onViewAttachedToWindowlambda0("settings_global_auto_time_zone", Boolean.valueOf(z2)))));
        mutableStateFlow.IconCompatParcelizer(copynb67dxodefault);
        int i6 = MediaSessionCompatQueueItem + 33;
        MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            throw null;
        }
    }
}
