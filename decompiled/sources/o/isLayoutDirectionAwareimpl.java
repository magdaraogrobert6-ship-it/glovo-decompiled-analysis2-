package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes4.dex */
public class isLayoutDirectionAwareimpl extends Absolutevsh68fgdefault {
    public View MediaBrowserCompatMediaItem;
    public View MediaDescriptionCompat;
    public View RatingCompat;
    public View write;

    public isLayoutDirectionAwareimpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // o.Absolutevsh68fgdefault, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
        int iSerializer = Absolutevsh68fgdefault.serializer(this.MediaDescriptionCompat);
        Absolutevsh68fgdefault.read(this.MediaDescriptionCompat, 0, 0, iSerializer, Absolutevsh68fgdefault.read(this.MediaDescriptionCompat));
        int iRemoteActionCompatParcelizer3 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer4 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer4, -1540001960, new Object[0], iRemoteActionCompatParcelizer3);
        int i5 = Absolutevsh68fgdefault.read(this.RatingCompat);
        Absolutevsh68fgdefault.read(this.RatingCompat, iSerializer, 0, measuredWidth, i5);
        int iRemoteActionCompatParcelizer5 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer6 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer6, -1540001960, new Object[0], iRemoteActionCompatParcelizer5);
        Absolutevsh68fgdefault.read(this.MediaBrowserCompatMediaItem, iSerializer, i5, measuredWidth, Absolutevsh68fgdefault.read(this.MediaBrowserCompatMediaItem) + i5);
        int iRemoteActionCompatParcelizer7 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer8 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer8, -1540001960, new Object[0], iRemoteActionCompatParcelizer7);
        Absolutevsh68fgdefault.read(this.write, iSerializer, measuredHeight - Absolutevsh68fgdefault.read(this.write), measuredWidth, measuredHeight);
    }

    @Override // o.Absolutevsh68fgdefault, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.MediaDescriptionCompat = write(com.logistics.rider.glovo.R.id.image_view);
        this.RatingCompat = write(com.logistics.rider.glovo.R.id.message_title);
        this.MediaBrowserCompatMediaItem = write(com.logistics.rider.glovo.R.id.body_scroll);
        View viewWrite = write(com.logistics.rider.glovo.R.id.action_bar);
        this.write = viewWrite;
        List listAsList = Arrays.asList(this.RatingCompat, this.MediaBrowserCompatMediaItem, viewWrite);
        int iIconCompatParcelizer = IconCompatParcelizer(i);
        int iSerializer = serializer(i2);
        int iRound = Math.round(((int) (((double) iIconCompatParcelizer) * 0.6d)) / 4.0f) * 4;
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer);
        getCoordinator.read(this.MediaDescriptionCompat, iIconCompatParcelizer, iSerializer, Integer.MIN_VALUE, 1073741824);
        if (Absolutevsh68fgdefault.serializer(this.MediaDescriptionCompat) > iRound) {
            int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer2);
            getCoordinator.read(this.MediaDescriptionCompat, iRound, iSerializer, 1073741824, Integer.MIN_VALUE);
        }
        int i3 = Absolutevsh68fgdefault.read(this.MediaDescriptionCompat);
        int iSerializer2 = Absolutevsh68fgdefault.serializer(this.MediaDescriptionCompat);
        int i4 = iIconCompatParcelizer - iSerializer2;
        int iRemoteActionCompatParcelizer3 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer3);
        int iRemoteActionCompatParcelizer4 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer4);
        getCoordinator.write(i4, i3, this.RatingCompat);
        int iRemoteActionCompatParcelizer5 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer5);
        getCoordinator.write(i4, i3, this.write);
        int iRemoteActionCompatParcelizer6 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer6);
        getCoordinator.read(this.MediaBrowserCompatMediaItem, i4, (i3 - Absolutevsh68fgdefault.read(this.RatingCompat)) - Absolutevsh68fgdefault.read(this.write), Integer.MIN_VALUE, 1073741824);
        Iterator it = listAsList.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(Absolutevsh68fgdefault.serializer((View) it.next()), iMax);
        }
        int iRemoteActionCompatParcelizer7 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer7);
        int iRemoteActionCompatParcelizer8 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer8);
        setMeasuredDimension(iSerializer2 + iMax, i3);
    }
}
