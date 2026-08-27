package o;

import com.roadrunner.recentdeliveries.presentation.RecentDeliveriesFragment;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ForEachGestureKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    public static final void IconCompatParcelizer(String str) {
        int i = 2 % 2;
        throw new IllegalArgumentException(str);
    }

    public static final void RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        throw new NoSuchElementException(str);
    }

    public static RecentDeliveriesFragment read() {
        int i = 2 % 2;
        RecentDeliveriesFragment recentDeliveriesFragment = new RecentDeliveriesFragment();
        int i2 = RemoteActionCompatParcelizer + 63;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return recentDeliveriesFragment;
    }

    public static final void serializer(String str) {
        int i = 2 % 2;
        throw new IndexOutOfBoundsException(str);
    }

    public static final void write(String str) {
        int i = 2 % 2;
        throw new IllegalStateException(str);
    }
}
