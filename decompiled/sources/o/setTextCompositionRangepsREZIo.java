package o;

import android.content.SharedPreferences;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import dagger.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class setTextCompositionRangepsREZIo {
    private static int read = 0;
    private static int write = 1;
    public final isAdapterPositionOnScreen IconCompatParcelizer;
    public final Lazy RemoteActionCompatParcelizer;

    public setTextCompositionRangepsREZIo(Lazy lazy) {
        lazy.getClass();
        this.RemoteActionCompatParcelizer = lazy;
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new BrazeUser$$ExternalSyntheticLambda28(18, this));
    }

    public final SharedPreferences RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 81;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
        int i3 = write + 83;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return sharedPreferences;
    }

    public final boolean serializer() {
        int i = 2 % 2;
        int i2 = read + 53;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean z = RemoteActionCompatParcelizer().getBoolean("SHARED_PREF_BIOMETRIC_SHOULD_LAUNCH_FLAG", true);
        int i4 = write + 43;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return z;
    }
}
