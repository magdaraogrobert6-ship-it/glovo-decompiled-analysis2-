package o;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public class getMenuInflater {
    public final AlertControllerButtonHandler MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public findViewById MediaMetadataCompat;
    public PopupWindow.OnDismissListener MediaSessionCompatQueueItem;
    public getDrawerToggleDelegate MediaSessionCompatToken;
    public final boolean RatingCompat;
    public final Context read;
    public View serializer;
    public boolean write;
    public int RemoteActionCompatParcelizer = 8388611;
    public final getDelegate IconCompatParcelizer = new getDelegate(this);

    public void write() {
        this.MediaMetadataCompat = null;
        PopupWindow.OnDismissListener onDismissListener = this.MediaSessionCompatQueueItem;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean serializer() {
        findViewById findviewbyid = this.MediaMetadataCompat;
        return findviewbyid != null && findviewbyid.serializer();
    }

    public final void write(int i, int i2, boolean z, boolean z2) {
        findViewById findviewbyidIconCompatParcelizer = IconCompatParcelizer();
        findviewbyidIconCompatParcelizer.IconCompatParcelizer(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.RemoteActionCompatParcelizer, this.serializer.getLayoutDirection()) & 7) == 5) {
                i -= this.serializer.getWidth();
            }
            findviewbyidIconCompatParcelizer.read(i);
            findviewbyidIconCompatParcelizer.write(i2);
            int i3 = (int) ((this.read.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            findviewbyidIconCompatParcelizer.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new android.graphics.Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        findviewbyidIconCompatParcelizer.b_();
    }

    public getMenuInflater(Context context, AlertControllerButtonHandler alertControllerButtonHandler, View view, boolean z, int i, int i2) {
        this.read = context;
        this.MediaBrowserCompatMediaItem = alertControllerButtonHandler;
        this.serializer = view;
        this.RatingCompat = z;
        this.MediaDescriptionCompat = i;
    }

    public final findViewById IconCompatParcelizer() {
        findViewById getsupportparentactivityintent;
        if (this.MediaMetadataCompat == null) {
            Context context = this.read;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.read;
            if (iMin >= dimensionPixelSize) {
                getsupportparentactivityintent = new r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0(context2, this.serializer, this.MediaDescriptionCompat, this.RatingCompat);
            } else {
                getsupportparentactivityintent = new getSupportParentActivityIntent(context2, this.MediaBrowserCompatMediaItem, this.serializer, this.MediaDescriptionCompat, this.RatingCompat);
            }
            getsupportparentactivityintent.write(this.MediaBrowserCompatMediaItem);
            getsupportparentactivityintent.IconCompatParcelizer(this.IconCompatParcelizer);
            getsupportparentactivityintent.serializer(this.serializer);
            getsupportparentactivityintent.read(this.MediaSessionCompatToken);
            getsupportparentactivityintent.RemoteActionCompatParcelizer(this.write);
            getsupportparentactivityintent.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
            this.MediaMetadataCompat = getsupportparentactivityintent;
        }
        return this.MediaMetadataCompat;
    }
}
