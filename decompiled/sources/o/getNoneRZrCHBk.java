package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes4.dex */
public class getNoneRZrCHBk extends Absolutevsh68fgdefault {
    public View MediaBrowserCompatMediaItem;
    public View MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public View MediaSessionCompatQueueItem;
    public int PlaybackStateCompat;
    public View PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public int write;

    public getNoneRZrCHBk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // o.Absolutevsh68fgdefault, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int i7 = this.MediaMetadataCompat;
        int i8 = this.RatingCompat;
        if (i7 < i8) {
            i6 = (i8 - i7) / 2;
            i5 = 0;
        } else {
            i5 = (i7 - i8) / 2;
            i6 = 0;
        }
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        int i9 = i6 + paddingTop;
        int iSerializer = Absolutevsh68fgdefault.serializer(this.MediaSessionCompatQueueItem) + paddingLeft;
        Absolutevsh68fgdefault.read(this.MediaSessionCompatQueueItem, paddingLeft, i9, iSerializer, Absolutevsh68fgdefault.read(this.MediaSessionCompatQueueItem) + i9);
        int i10 = iSerializer + this.write;
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        int i11 = paddingTop + i5;
        int i12 = Absolutevsh68fgdefault.read(this.PlaybackStateCompatCustomAction) + i11;
        Absolutevsh68fgdefault.read(this.PlaybackStateCompatCustomAction, i10, i11, measuredWidth, i12);
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        int i13 = i12 + (this.PlaybackStateCompatCustomAction.getVisibility() == 8 ? 0 : this.PlaybackStateCompat);
        int i14 = Absolutevsh68fgdefault.read(this.MediaBrowserCompatMediaItem) + i13;
        Absolutevsh68fgdefault.read(this.MediaBrowserCompatMediaItem, i10, i13, measuredWidth, i14);
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        int i15 = i14 + (this.MediaBrowserCompatMediaItem.getVisibility() != 8 ? this.PlaybackStateCompat : 0);
        View view = this.MediaDescriptionCompat;
        Absolutevsh68fgdefault.read(view, i10, i15, Absolutevsh68fgdefault.serializer(view) + i10, Absolutevsh68fgdefault.read(view) + i15);
    }

    @Override // o.Absolutevsh68fgdefault, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.MediaSessionCompatQueueItem = write(com.logistics.rider.glovo.R.id.image_view);
        this.PlaybackStateCompatCustomAction = write(com.logistics.rider.glovo.R.id.message_title);
        this.MediaBrowserCompatMediaItem = write(com.logistics.rider.glovo.R.id.body_scroll);
        this.MediaDescriptionCompat = write(com.logistics.rider.glovo.R.id.button);
        int visibility = this.MediaSessionCompatQueueItem.getVisibility();
        DisplayMetrics displayMetrics = this.serializer;
        this.write = visibility == 8 ? 0 : (int) Math.floor(TypedValue.applyDimension(1, 24.0f, displayMetrics));
        this.PlaybackStateCompat = (int) Math.floor(TypedValue.applyDimension(1, 24.0f, displayMetrics));
        List listAsList = Arrays.asList(this.PlaybackStateCompatCustomAction, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iIconCompatParcelizer = IconCompatParcelizer(i);
        int iSerializer = serializer(i2) - paddingTop;
        int i3 = iIconCompatParcelizer - paddingRight;
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        getCoordinator.write((int) (i3 * 0.4f), iSerializer, this.MediaSessionCompatQueueItem);
        int iSerializer2 = Absolutevsh68fgdefault.serializer(this.MediaSessionCompatQueueItem);
        int i4 = i3 - (this.write + iSerializer2);
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        Iterator it = listAsList.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if (((View) it.next()).getVisibility() != 8) {
                i5++;
            }
        }
        int iMax = Math.max(0, (i5 - 1) * this.PlaybackStateCompat);
        int i6 = iSerializer - iMax;
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        getCoordinator.write(i4, i6, this.PlaybackStateCompatCustomAction);
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        getCoordinator.write(i4, i6, this.MediaDescriptionCompat);
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        getCoordinator.write(i4, (i6 - Absolutevsh68fgdefault.read(this.PlaybackStateCompatCustomAction)) - Absolutevsh68fgdefault.read(this.MediaDescriptionCompat), this.MediaBrowserCompatMediaItem);
        this.MediaMetadataCompat = Absolutevsh68fgdefault.read(this.MediaSessionCompatQueueItem);
        this.RatingCompat = iMax;
        Iterator it2 = listAsList.iterator();
        while (it2.hasNext()) {
            this.RatingCompat = Absolutevsh68fgdefault.read((View) it2.next()) + this.RatingCompat;
        }
        int iMax2 = Math.max(this.MediaMetadataCompat + paddingTop, this.RatingCompat + paddingTop);
        Iterator it3 = listAsList.iterator();
        int iMax3 = 0;
        while (it3.hasNext()) {
            iMax3 = Math.max(Absolutevsh68fgdefault.serializer((View) it3.next()), iMax3);
        }
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        int i7 = this.write;
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        setMeasuredDimension(iSerializer2 + iMax3 + i7 + paddingRight, iMax2);
    }
}
