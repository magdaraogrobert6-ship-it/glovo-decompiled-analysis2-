package o;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class getSetCompositionContextui {
    public final /* synthetic */ int read;
    public final SideSheetBehavior write;

    public final int RemoteActionCompatParcelizer() {
        return this.read != 0 ? 0 : 1;
    }

    public /* synthetic */ getSetCompositionContextui(SideSheetBehavior sideSheetBehavior, int i) {
        this.read = i;
        this.write = sideSheetBehavior;
    }

    public final int read() {
        int i = this.read;
        SideSheetBehavior sideSheetBehavior = this.write;
        if (i == 0) {
            return Math.max(0, sideSheetBehavior.MediaSessionCompatResultReceiverWrapper + sideSheetBehavior.PlaybackStateCompat);
        }
        return Math.max(0, (sideSheetBehavior.PlaybackStateCompatCustomAction - sideSheetBehavior.serializer) - sideSheetBehavior.PlaybackStateCompat);
    }

    public final int write() {
        int i = this.read;
        SideSheetBehavior sideSheetBehavior = this.write;
        return i != 0 ? sideSheetBehavior.PlaybackStateCompatCustomAction : (-sideSheetBehavior.serializer) - sideSheetBehavior.PlaybackStateCompat;
    }

    public final int write(View view) {
        int i = this.read;
        SideSheetBehavior sideSheetBehavior = this.write;
        return i != 0 ? view.getLeft() - sideSheetBehavior.PlaybackStateCompat : view.getRight() + sideSheetBehavior.PlaybackStateCompat;
    }

    public final void IconCompatParcelizer(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (this.read != 0) {
            marginLayoutParams.rightMargin = i;
        } else {
            marginLayoutParams.leftMargin = i;
        }
    }
}
