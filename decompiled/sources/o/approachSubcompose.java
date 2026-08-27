package o;

import android.app.Application;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class approachSubcompose {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    public static AudioManager read(Application application) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object systemService = application.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        int i4 = serializer + 13;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return audioManager;
    }
}
