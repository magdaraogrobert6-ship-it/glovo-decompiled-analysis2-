package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes4.dex */
public class getStartimpl extends Absolutevsh68fgdefault {
    public View MediaDescriptionCompat;
    public View MediaMetadataCompat;
    public View RatingCompat;
    public View write;

    public getStartimpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // o.Absolutevsh68fgdefault, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int size = getVisibleChildren().size();
        int measuredHeight = 0;
        for (int i5 = 0; i5 < size; i5++) {
            View view = getVisibleChildren().get(i5);
            int measuredHeight2 = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer);
            int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer2);
            int iRemoteActionCompatParcelizer3 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer3);
            view.layout(0, measuredHeight, measuredWidth, measuredHeight2 + measuredHeight);
            view.getMeasuredWidth();
            view.getMeasuredHeight();
            int iRemoteActionCompatParcelizer4 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer4);
            measuredHeight += view.getMeasuredHeight();
        }
    }

    @Override // o.Absolutevsh68fgdefault, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.RatingCompat = write(com.logistics.rider.glovo.R.id.image_view);
        this.MediaDescriptionCompat = write(com.logistics.rider.glovo.R.id.message_title);
        this.MediaMetadataCompat = write(com.logistics.rider.glovo.R.id.body_scroll);
        this.write = write(com.logistics.rider.glovo.R.id.action_bar);
        int iIconCompatParcelizer = IconCompatParcelizer(i);
        int iSerializer = serializer(i2);
        int iRound = Math.round(((int) (((double) iSerializer) * 0.8d)) / 4.0f) * 4;
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer);
        getCoordinator.read(this.RatingCompat, iIconCompatParcelizer, iSerializer, 1073741824, Integer.MIN_VALUE);
        if (Absolutevsh68fgdefault.read(this.RatingCompat) > iRound) {
            int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer2);
            getCoordinator.read(this.RatingCompat, iIconCompatParcelizer, iRound, Integer.MIN_VALUE, 1073741824);
        }
        int iSerializer2 = Absolutevsh68fgdefault.serializer(this.RatingCompat);
        int iRemoteActionCompatParcelizer3 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer3);
        getCoordinator.read(this.MediaDescriptionCompat, iSerializer2, iSerializer, 1073741824, Integer.MIN_VALUE);
        int iRemoteActionCompatParcelizer4 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer4);
        getCoordinator.read(this.write, iSerializer2, iSerializer, 1073741824, Integer.MIN_VALUE);
        int iRemoteActionCompatParcelizer5 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer5);
        int i3 = Absolutevsh68fgdefault.read(this.RatingCompat);
        getCoordinator.read(this.MediaMetadataCompat, iSerializer2, ((iSerializer - i3) - Absolutevsh68fgdefault.read(this.MediaDescriptionCompat)) - Absolutevsh68fgdefault.read(this.write), 1073741824, Integer.MIN_VALUE);
        int size = getVisibleChildren().size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += Absolutevsh68fgdefault.read(getVisibleChildren().get(i5));
        }
        setMeasuredDimension(iSerializer2, i4);
    }
}
