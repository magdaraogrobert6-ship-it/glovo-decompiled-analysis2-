package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.Menu;
import android.view.Window;
import com.google.android.gms.stats.zza;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedCallback extends onTrimMemory {
    public final addCloseableactivity IconCompatParcelizer;
    public boolean MediaMetadataCompat;
    public final Window.Callback MediaSessionCompatQueueItem;
    public boolean RemoteActionCompatParcelizer;
    public boolean read;
    public final setFilters write;
    public final ArrayList MediaDescriptionCompat = new ArrayList();
    public final zza serializer = new zza(2, this);

    @Override // o.onTrimMemory
    public final void IconCompatParcelizer(boolean z) {
        read(4, 4);
    }

    @Override // o.onTrimMemory
    public final void MediaSessionCompatQueueItem() {
        read(2, 2);
    }

    @Override // o.onTrimMemory
    public final void MediaSessionCompatResultReceiverWrapper() {
        this.write.PlaybackStateCompat.setVisibility(0);
    }

    @Override // o.onTrimMemory
    public final void RatingCompat() {
    }

    @Override // o.onTrimMemory
    public final void read(CharSequence charSequence) {
        setFilters setfilters = this.write;
        setfilters.MediaSessionCompatToken = true;
        androidx.appcompat.widget.Toolbar toolbar = setfilters.PlaybackStateCompat;
        setfilters.ParcelableVolumeInfo = charSequence;
        if ((setfilters.IconCompatParcelizer & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (setfilters.MediaSessionCompatToken) {
                FocusPropertiesNode.read(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // o.onTrimMemory
    public final void serializer(boolean z) {
    }

    @Override // o.onTrimMemory
    public final void write(boolean z) {
    }

    @Override // o.onTrimMemory
    public final void IconCompatParcelizer() {
        this.write.PlaybackStateCompat.setVisibility(8);
    }

    @Override // o.onTrimMemory
    public final void IconCompatParcelizer(Drawable drawable) {
        this.write.PlaybackStateCompat.setBackground(drawable);
    }

    @Override // o.onTrimMemory
    public final boolean MediaBrowserCompatMediaItem() {
        setFilters setfilters = this.write;
        androidx.appcompat.widget.Toolbar toolbar = setfilters.PlaybackStateCompat;
        zza zzaVar = this.serializer;
        toolbar.removeCallbacks(zzaVar);
        androidx.appcompat.widget.Toolbar toolbar2 = setfilters.PlaybackStateCompat;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        toolbar2.postOnAnimation(zzaVar);
        return true;
    }

    @Override // o.onTrimMemory
    public final void MediaDescriptionCompat() {
        this.write.PlaybackStateCompat.removeCallbacks(this.serializer);
    }

    @Override // o.onTrimMemory
    public final boolean MediaMetadataCompat() {
        return this.write.PlaybackStateCompat.RatingCompat();
    }

    @Override // o.onTrimMemory
    public final boolean RemoteActionCompatParcelizer() {
        Keep keep;
        setAllCaps setallcaps = this.write.PlaybackStateCompat.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (setallcaps == null || (keep = setallcaps.IconCompatParcelizer) == null) {
            return false;
        }
        if (setallcaps == null) {
            keep = null;
        }
        if (keep == null) {
            return true;
        }
        keep.collapseActionView();
        return true;
    }

    public final Menu getMenu() {
        boolean z = this.RemoteActionCompatParcelizer;
        setFilters setfilters = this.write;
        if (!z) {
            setDropDownVerticalOffset setdropdownverticaloffset = new setDropDownVerticalOffset(this);
            addCloseableactivity addcloseableactivity = new addCloseableactivity(this);
            androidx.appcompat.widget.Toolbar toolbar = setfilters.PlaybackStateCompat;
            toolbar.write = setdropdownverticaloffset;
            toolbar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = addcloseableactivity;
            setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility = toolbar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            if (setsupportprogressbarindeterminatevisibility != null) {
                setsupportprogressbarindeterminatevisibility.IconCompatParcelizer = setdropdownverticaloffset;
                setsupportprogressbarindeterminatevisibility.MediaSessionCompatQueueItem = addcloseableactivity;
            }
            this.RemoteActionCompatParcelizer = true;
        }
        return setfilters.PlaybackStateCompat.getMenu();
    }

    @Override // o.onTrimMemory
    public final Context read() {
        return this.write.PlaybackStateCompat.getContext();
    }

    public final void read(int i, int i2) {
        setFilters setfilters = this.write;
        setfilters.read((i & i2) | ((~i2) & setfilters.IconCompatParcelizer));
    }

    @Override // o.onTrimMemory
    public final int serializer() {
        return this.write.IconCompatParcelizer;
    }

    @Override // o.onTrimMemory
    public final void serializer(float f) {
        androidx.appcompat.widget.Toolbar toolbar = this.write.PlaybackStateCompat;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        toolbar.setElevation(0.0f);
    }

    @Override // o.onTrimMemory
    public final void write(int i) {
        setFilters setfilters = this.write;
        androidx.appcompat.widget.Toolbar toolbar = setfilters.PlaybackStateCompat;
        Drawable drawableWrite = i != 0 ? coil3.util.IntPair.write(toolbar.getContext(), i) : null;
        setfilters.MediaDescriptionCompat = drawableWrite;
        if ((setfilters.IconCompatParcelizer & 4) == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawableWrite == null) {
            drawableWrite = setfilters.RemoteActionCompatParcelizer;
        }
        toolbar.setNavigationIcon(drawableWrite);
    }

    @Override // o.onTrimMemory
    public final void write(CharSequence charSequence) {
        setFilters setfilters = this.write;
        if (setfilters.MediaSessionCompatToken) {
            return;
        }
        androidx.appcompat.widget.Toolbar toolbar = setfilters.PlaybackStateCompat;
        setfilters.ParcelableVolumeInfo = charSequence;
        if ((setfilters.IconCompatParcelizer & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (setfilters.MediaSessionCompatToken) {
                FocusPropertiesNode.read(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // o.onTrimMemory
    public final boolean write() {
        onSupportActionModeStarted onsupportactionmodestarted;
        setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility = this.write.PlaybackStateCompat.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        return (setsupportprogressbarindeterminatevisibility == null || (onsupportactionmodestarted = setsupportprogressbarindeterminatevisibility.PlaybackStateCompatCustomAction) == null || !onsupportactionmodestarted.RemoteActionCompatParcelizer()) ? false : true;
    }

    @Override // o.onTrimMemory
    public final void MediaSessionCompatToken() {
        read(0, 8);
    }

    @Override // o.onTrimMemory
    public final void PlaybackStateCompat() {
        setFilters setfilters = this.write;
        setfilters.MediaMetadataCompat = null;
        setfilters.serializer();
    }

    @Override // o.onTrimMemory
    public final void ParcelableVolumeInfo() {
        setFilters setfilters = this.write;
        setfilters.MediaBrowserCompatMediaItem = "Close Survey";
        setfilters.IconCompatParcelizer();
    }

    public OnBackPressedCallback(androidx.appcompat.widget.Toolbar toolbar, CharSequence charSequence, startIntentSenderForResult startintentsenderforresult) {
        addCloseableactivity addcloseableactivity = new addCloseableactivity(this);
        setFilters setfilters = new setFilters(toolbar, false);
        this.write = setfilters;
        startintentsenderforresult.getClass();
        this.MediaSessionCompatQueueItem = startintentsenderforresult;
        setfilters.PlaybackStateCompatCustomAction = startintentsenderforresult;
        toolbar.setOnMenuItemClickListener(addcloseableactivity);
        if (!setfilters.MediaSessionCompatToken) {
            setfilters.ParcelableVolumeInfo = charSequence;
            if ((setfilters.IconCompatParcelizer & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (setfilters.MediaSessionCompatToken) {
                    FocusPropertiesNode.read(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.IconCompatParcelizer = new addCloseableactivity(this);
    }

    @Override // o.onTrimMemory
    public final void RemoteActionCompatParcelizer(boolean z) {
        if (z == this.read) {
            return;
        }
        this.read = z;
        ArrayList arrayList = this.MediaDescriptionCompat;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
    }

    @Override // o.onTrimMemory
    public final boolean read(int i, android.view.KeyEvent keyEvent) {
        Menu menu = getMenu();
        if (menu == null) {
            return false;
        }
        menu.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menu.performShortcut(i, keyEvent, 0);
    }

    @Override // o.onTrimMemory
    public final boolean serializer(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            MediaMetadataCompat();
        }
        return true;
    }

    @Override // o.onTrimMemory
    public final void serializer(Drawable drawable) {
        setFilters setfilters = this.write;
        setfilters.MediaDescriptionCompat = drawable;
        int i = setfilters.IconCompatParcelizer;
        androidx.appcompat.widget.Toolbar toolbar = setfilters.PlaybackStateCompat;
        if ((i & 4) == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = setfilters.RemoteActionCompatParcelizer;
        }
        toolbar.setNavigationIcon(drawable);
    }
}
