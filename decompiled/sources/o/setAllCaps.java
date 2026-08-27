package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class setAllCaps implements getResources {
    public Keep IconCompatParcelizer;
    public final /* synthetic */ androidx.appcompat.widget.Toolbar RemoteActionCompatParcelizer;
    public AlertControllerButtonHandler serializer;

    @Override // o.getResources
    public final void IconCompatParcelizer(AlertControllerButtonHandler alertControllerButtonHandler, boolean z) {
    }

    @Override // o.getResources
    public final boolean RemoteActionCompatParcelizer(onNightModeChanged onnightmodechanged) {
        return false;
    }

    @Override // o.getResources
    public final boolean read() {
        return false;
    }

    @Override // o.getResources
    public final boolean RemoteActionCompatParcelizer(Keep keep) {
        androidx.appcompat.widget.Toolbar toolbar = this.RemoteActionCompatParcelizer;
        android.view.KeyEvent.Callback callback = toolbar.PlaybackStateCompat;
        if (callback instanceof handleOnBackProgressed) {
            ((dispatchKeyEvent) ((handleOnBackProgressed) callback)).write.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.PlaybackStateCompat);
        toolbar.removeView(toolbar.MediaBrowserCompatMediaItem);
        toolbar.PlaybackStateCompat = null;
        ArrayList arrayList = toolbar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.IconCompatParcelizer = null;
                toolbar.requestLayout();
                keep.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = false;
                keep.ResultReceiver.write(false);
                toolbar.MediaBrowserCompatMediaItem();
                return true;
            }
            toolbar.addView((View) arrayList.get(size));
        }
    }

    @Override // o.getResources
    public final boolean write(Keep keep) {
        androidx.appcompat.widget.Toolbar toolbar = this.RemoteActionCompatParcelizer;
        toolbar.write();
        ViewParent parent = toolbar.MediaBrowserCompatMediaItem.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.MediaBrowserCompatMediaItem);
            }
            toolbar.addView(toolbar.MediaBrowserCompatMediaItem);
        }
        View actionView = keep.getActionView();
        toolbar.PlaybackStateCompat = actionView;
        this.IconCompatParcelizer = keep;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.PlaybackStateCompat);
            }
            getAutoSizeTextType getautosizetexttype = androidx.appcompat.widget.Toolbar.read();
            getautosizetexttype.write = (toolbar.read & 112) | 8388611;
            getautosizetexttype.RemoteActionCompatParcelizer = 2;
            toolbar.PlaybackStateCompat.setLayoutParams(getautosizetexttype);
            toolbar.addView(toolbar.PlaybackStateCompat);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((getAutoSizeTextType) childAt.getLayoutParams()).RemoteActionCompatParcelizer != 2 && childAt != toolbar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                toolbar.removeViewAt(childCount);
                toolbar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.add(childAt);
            }
        }
        toolbar.requestLayout();
        keep.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = true;
        keep.ResultReceiver.write(false);
        android.view.KeyEvent.Callback callback = toolbar.PlaybackStateCompat;
        if (callback instanceof handleOnBackProgressed) {
            ((dispatchKeyEvent) ((handleOnBackProgressed) callback)).write.onActionViewExpanded();
        }
        toolbar.MediaBrowserCompatMediaItem();
        return true;
    }

    public setAllCaps(androidx.appcompat.widget.Toolbar toolbar) {
        this.RemoteActionCompatParcelizer = toolbar;
    }

    @Override // o.getResources
    public final void IconCompatParcelizer(Context context, AlertControllerButtonHandler alertControllerButtonHandler) {
        Keep keep;
        AlertControllerButtonHandler alertControllerButtonHandler2 = this.serializer;
        if (alertControllerButtonHandler2 != null && (keep = this.IconCompatParcelizer) != null) {
            alertControllerButtonHandler2.write(keep);
        }
        this.serializer = alertControllerButtonHandler;
    }

    @Override // o.getResources
    public final void MediaDescriptionCompat() {
        if (this.IconCompatParcelizer != null) {
            AlertControllerButtonHandler alertControllerButtonHandler = this.serializer;
            if (alertControllerButtonHandler != null) {
                int size = alertControllerButtonHandler.ParcelableVolumeInfo.size();
                for (int i = 0; i < size; i++) {
                    if (this.serializer.getItem(i) == this.IconCompatParcelizer) {
                        return;
                    }
                }
            }
            RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        }
    }
}
