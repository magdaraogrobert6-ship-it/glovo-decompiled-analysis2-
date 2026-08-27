package o;

import android.app.Application;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes3.dex */
public final class subscribeToChangeUserEventslambda31 {
    private static int read = 0;
    private static int serializer = 1;
    public final AudioFocusRequest IconCompatParcelizer = new AudioFocusRequest.Builder(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).build();
    public final isAdapterPositionOnScreen write;

    public subscribeToChangeUserEventslambda31(Application application) {
        this.write = new isAdapterPositionOnScreen(new subscribeToContentCardsUpdateslambda30(application, 0));
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((AudioManager) this.write.MediaSessionCompatResultReceiverWrapper()).abandonAudioFocusRequest(this.IconCompatParcelizer);
            throw null;
        }
        ((AudioManager) this.write.MediaSessionCompatResultReceiverWrapper()).abandonAudioFocusRequest(this.IconCompatParcelizer);
        int i3 = serializer + 75;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 51 / 0;
        }
    }
}
