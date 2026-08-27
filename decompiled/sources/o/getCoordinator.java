package o;

import android.view.View;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getCoordinator {
    public static void write(int i, int i2, View view) {
        read(view, i, i2, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public static void read(View view, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        view.getMeasuredWidth();
        view.getMeasuredHeight();
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer);
        if (view.getVisibility() == 8) {
            i5 = 0;
            i6 = 0;
        } else {
            i5 = i;
            i6 = i2;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i5, i3), View.MeasureSpec.makeMeasureSpec(i6, i4));
        view.getMeasuredWidth();
        view.getMeasuredHeight();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer2);
    }
}
