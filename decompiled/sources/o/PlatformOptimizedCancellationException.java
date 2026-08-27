package o;

import android.os.Bundle;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.navigation.PinScreenArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenFragment;

/* JADX INFO: loaded from: classes.dex */
public abstract class PlatformOptimizedCancellationException {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    public static PinScreenFragment RemoteActionCompatParcelizer(PinScreenArgs pinScreenArgs) {
        int i = 2 % 2;
        PinScreenFragment pinScreenFragment = new PinScreenFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_pin_screen", pinScreenArgs);
        pinScreenFragment.setArguments(bundle);
        int i2 = write + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
        return pinScreenFragment;
    }
}
