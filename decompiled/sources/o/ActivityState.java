package o;

import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import dagger.Lazy;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityState {
    private static int serializer = 0;
    private static int write = 1;
    public final Lazy IconCompatParcelizer;
    public final Lazy RemoteActionCompatParcelizer;
    public final Lazy read;

    public ActivityState(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        lazy.getClass();
        lazy2.getClass();
        lazy3.getClass();
        this.read = lazy;
        this.RemoteActionCompatParcelizer = lazy2;
        this.IconCompatParcelizer = lazy3;
    }

    public final void RemoteActionCompatParcelizer(androidx.fragment.app.FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(fragmentActivity.getLifecycle()), null, null, new ReconnectScheduler$schedule$1(this, fragmentActivity, null, 29), 3);
        int i2 = write + 117;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
