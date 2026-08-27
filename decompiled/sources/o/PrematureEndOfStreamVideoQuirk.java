package o;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.roadrunner.opportunities.api.navigation.BonusCalendarParams;
import com.roadrunner.opportunities.calendar.BonusCalendarFragment;

/* JADX INFO: loaded from: classes.dex */
public abstract class PrematureEndOfStreamVideoQuirk {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static void write() {
        int i = 2 % 2;
        int i2 = read + 59;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            coil3.util.UtilsKt.RemoteActionCompatParcelizer("Not in application's main thread", read());
            throw null;
        }
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("Not in application's main thread", read());
        int i3 = IconCompatParcelizer + 33;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public static boolean read() {
        int i = 2 % 2;
        int i2 = read + 77;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            int i4 = read + 89;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 73 / 0;
            }
            return true;
        }
        int i6 = IconCompatParcelizer + 43;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public static BonusCalendarFragment IconCompatParcelizer(BonusCalendarParams bonusCalendarParams) {
        int i = 2 % 2;
        BonusCalendarFragment bonusCalendarFragment = new BonusCalendarFragment();
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("bonus_calendar_params", bonusCalendarParams)};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        bonusCalendarFragment.setArguments((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320));
        int i2 = IconCompatParcelizer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return bonusCalendarFragment;
    }

    public static void write(Runnable runnable) {
        int i = 2 % 2;
        if (!read()) {
            coil3.util.UtilsKt.RemoteActionCompatParcelizer("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
            return;
        }
        int i2 = read + 77;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            runnable.run();
            int i3 = 84 / 0;
        } else {
            runnable.run();
        }
        int i4 = read + 3;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
