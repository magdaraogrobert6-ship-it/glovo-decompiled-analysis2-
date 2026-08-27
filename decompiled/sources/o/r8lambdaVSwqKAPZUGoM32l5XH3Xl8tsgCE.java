package o;

import android.app.Application;
import android.content.SharedPreferences;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaVSwqKAPZUGoM32l5XH3Xl8tsgCE {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final registerOnChangedCallback IconCompatParcelizer;
    public final Application serializer;
    public final SharedPreferences write;

    public r8lambdaVSwqKAPZUGoM32l5XH3Xl8tsgCE(Application application, SharedPreferences sharedPreferences, registerOnChangedCallback registeronchangedcallback) {
        application.getClass();
        sharedPreferences.getClass();
        registeronchangedcallback.getClass();
        this.serializer = application;
        this.write = sharedPreferences;
        this.IconCompatParcelizer = registeronchangedcallback;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String string = this.serializer.getString(com.logistics.rider.glovo.R.string.preference_chat_language);
        string.getClass();
        String string2 = this.write.getString(string, (String) onContentCardDismissed.MediaMetadataCompat(((FirebaseRemoteConfigImpl) ((accessanalyzeComponents58bKbWc) this.IconCompatParcelizer).serializer).RemoteActionCompatParcelizer()));
        if (string2 == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string2)) {
            return null;
        }
        int i4 = read + 45;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return string2;
    }
}
