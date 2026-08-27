package o;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.SdkConfig;
import com.sentiance.sdk.UserLinkerAsync;
import com.sentiance.sdk.UserLinkerCallback;
import com.sentiance.sdk.diagnostics.SdkDiagnostics;
import com.sentiance.sdk.init.SentianceOptions;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "SdkInitOptions")
public final class r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg {
    private static r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg serializer;
    private final Context RemoteActionCompatParcelizer;
    private SentianceOptions read;
    private SdkConfig write;

    public static /* synthetic */ void IconCompatParcelizer(r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg r8lambda7zcvodb3ypljdzjmgkbnvobyklg, String str, UserLinkerCallback userLinkerCallback) {
        if (r8lambda7zcvodb3ypljdzjmgkbnvobyklg.write.getUserLinker().link(str)) {
            userLinkerCallback.onSuccess();
        } else {
            userLinkerCallback.onFailure();
        }
    }

    private r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg(Context context) {
        this.RemoteActionCompatParcelizer = context;
    }

    @SuppressLint
    public final boolean IconCompatParcelizer() {
        SdkConfig sdkConfig = this.write;
        if (sdkConfig != null) {
            return sdkConfig.isAppSessionDataCollectionEnabled();
        }
        SentianceOptions sentianceOptions = this.read;
        if (sentianceOptions != null) {
            return sentianceOptions.isAppSessionDataCollectionEnabled();
        }
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("No SDK config");
        return false;
    }

    public final boolean MediaDescriptionCompat() {
        SdkConfig sdkConfig = this.write;
        if (sdkConfig != null) {
            return sdkConfig.isTriggeredTripsEnabled();
        }
        return false;
    }

    public final Notification read() {
        SdkConfig sdkConfig = this.write;
        if (sdkConfig != null) {
            return sdkConfig.getNotification();
        }
        SentianceOptions sentianceOptions = this.read;
        return sentianceOptions != null ? sentianceOptions.getNotification() : migrateBannerStorageToJsonlambda3.read(this.RemoteActionCompatParcelizer);
    }

    public final int serializer() {
        SdkConfig sdkConfig = this.write;
        if (sdkConfig != null) {
            return sdkConfig.getNotificationId();
        }
        SentianceOptions sentianceOptions = this.read;
        if (sentianceOptions != null) {
            return sentianceOptions.getNotificationId();
        }
        return 2123874432;
    }

    public final SdkDiagnostics write() {
        SentianceOptions sentianceOptions = this.read;
        if (sentianceOptions != null) {
            return sentianceOptions.getSdkDiagnostics();
        }
        return null;
    }

    public final UserLinkerAsync RemoteActionCompatParcelizer() {
        SdkConfig sdkConfig = this.write;
        if (sdkConfig == null) {
            return null;
        }
        UserLinkerAsync userLinkerAsync = sdkConfig.getUserLinkerAsync();
        SdkConfig sdkConfig2 = this.write;
        if (userLinkerAsync != null) {
            return sdkConfig2.getUserLinkerAsync();
        }
        if (sdkConfig2.getUserLinker() != null) {
            return new createNotificationlambda0(0, this);
        }
        return null;
    }

    public static r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg read(Context context) {
        if (serializer == null) {
            serializer = new r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg(context);
        }
        return serializer;
    }

    public final void write(SdkConfig sdkConfig) {
        this.write = sdkConfig;
        this.read = null;
    }

    public final void RemoteActionCompatParcelizer(SentianceOptions sentianceOptions) {
        this.read = sentianceOptions;
        this.write = null;
    }
}
