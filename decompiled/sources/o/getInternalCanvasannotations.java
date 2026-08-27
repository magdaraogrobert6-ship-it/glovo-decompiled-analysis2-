package o;

import android.view.ViewGroup;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class getInternalCanvasannotations {
    public final ArrayList IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public drawLines ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public final isSpecifieduvyYCjkannotations RatingCompat;
    public final androidx.fragment.app.Fragment RemoteActionCompatParcelizer;
    public final ArrayList read;
    public clipRectN_I0leg serializer;
    public final ArrayList write;

    public final void RemoteActionCompatParcelizer() {
        this.PlaybackStateCompat = false;
        if (!this.MediaMetadataCompat) {
            if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                toString();
            }
            this.MediaMetadataCompat = true;
            Iterator it = this.read.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.RemoteActionCompatParcelizer.getDefaultViewModelCreationExtras = false;
        this.RatingCompat.MediaDescriptionCompat();
    }

    public getInternalCanvasannotations(clipRectN_I0leg cliprectn_i0leg, drawLines drawlines, isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations) {
        cliprectn_i0leg.getClass();
        drawlines.getClass();
        androidx.fragment.app.Fragment fragment = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
        fragment.getClass();
        cliprectn_i0leg.getClass();
        drawlines.getClass();
        fragment.getClass();
        this.serializer = cliprectn_i0leg;
        this.ParcelableVolumeInfo = drawlines;
        this.RemoteActionCompatParcelizer = fragment;
        this.read = new ArrayList();
        this.MediaDescriptionCompat = true;
        ArrayList arrayList = new ArrayList();
        this.IconCompatParcelizer = arrayList;
        this.write = arrayList;
        this.RatingCompat = isspecifieduvyycjkannotations;
    }

    public final void RemoteActionCompatParcelizer(drawRawPoints drawrawpoints) {
        drawrawpoints.getClass();
        ArrayList arrayList = this.IconCompatParcelizer;
        if (arrayList.remove(drawrawpoints) && arrayList.isEmpty()) {
            RemoteActionCompatParcelizer();
        }
    }

    public final void write(clipRectN_I0leg cliprectn_i0leg, drawLines drawlines) {
        cliprectn_i0leg.getClass();
        drawlines.getClass();
        int i = drawArc.IconCompatParcelizer[drawlines.ordinal()];
        androidx.fragment.app.Fragment fragment = this.RemoteActionCompatParcelizer;
        if (i == 1) {
            if (this.serializer == clipRectN_I0leg.REMOVED) {
                if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                    Objects.toString(fragment);
                    Objects.toString(this.ParcelableVolumeInfo);
                }
                this.serializer = clipRectN_I0leg.VISIBLE;
                this.ParcelableVolumeInfo = drawLines.ADDING;
                this.MediaDescriptionCompat = true;
                return;
            }
            return;
        }
        if (i == 2) {
            if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                Objects.toString(fragment);
                Objects.toString(this.serializer);
                Objects.toString(this.ParcelableVolumeInfo);
            }
            this.serializer = clipRectN_I0leg.REMOVED;
            this.ParcelableVolumeInfo = drawLines.REMOVING;
            this.MediaDescriptionCompat = true;
            return;
        }
        if (i == 3 && this.serializer != clipRectN_I0leg.REMOVED) {
            if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                Objects.toString(fragment);
                Objects.toString(this.serializer);
                cliprectn_i0leg.toString();
            }
            this.serializer = cliprectn_i0leg;
        }
    }

    public final String toString() {
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbM.append(this.serializer);
        sbM.append(" lifecycleImpact = ");
        sbM.append(this.ParcelableVolumeInfo);
        sbM.append(" fragment = ");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append('}');
        return sbM.toString();
    }

    public final void write(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.PlaybackStateCompat = false;
        if (this.MediaBrowserCompatMediaItem) {
            return;
        }
        this.MediaBrowserCompatMediaItem = true;
        if (this.IconCompatParcelizer.isEmpty()) {
            RemoteActionCompatParcelizer();
            return;
        }
        Iterator it = onContentCardDismissed.PlaybackStateCompat(this.write).iterator();
        while (it.hasNext()) {
            ((drawRawPoints) it.next()).serializer(viewGroup);
        }
    }
}
