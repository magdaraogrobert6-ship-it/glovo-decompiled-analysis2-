package o;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getSupportParentActivityIntent extends findViewById implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public View ComponentActivity;
    public View IconCompatParcelizer;
    public boolean MediaMetadataCompat;
    public PopupWindow.OnDismissListener MediaSessionCompatQueueItem;
    public final int MediaSessionCompatResultReceiverWrapper;
    public final boolean MediaSessionCompatToken;
    public getDrawerToggleDelegate ParcelableVolumeInfo;
    public final getSupportBackgroundTintList PlaybackStateCompat;
    public final int PlaybackStateCompatCustomAction;
    public final AlertControllerButtonHandler RatingCompat;
    public final onRestoreInstanceState RemoteActionCompatParcelizer;
    public boolean ResultReceiver;
    public boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public ViewTreeObserver r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public int read;
    public final Context write;
    public final setTitle MediaBrowserCompatMediaItem = new setTitle(2, this);
    public final onMenuOpened serializer = new onMenuOpened(0, this);
    public int MediaDescriptionCompat = 0;

    @Override // o.findViewById
    public final void IconCompatParcelizer(int i) {
        this.MediaDescriptionCompat = i;
    }

    @Override // o.findViewById
    public final void IconCompatParcelizer(PopupWindow.OnDismissListener onDismissListener) {
        this.MediaSessionCompatQueueItem = onDismissListener;
    }

    @Override // o.findViewById
    public final void IconCompatParcelizer(boolean z) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = z;
    }

    @Override // o.getResources
    public final void MediaDescriptionCompat() {
        this.MediaMetadataCompat = false;
        onRestoreInstanceState onrestoreinstancestate = this.RemoteActionCompatParcelizer;
        if (onrestoreinstancestate != null) {
            onrestoreinstancestate.notifyDataSetChanged();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.ResultReceiver = true;
        this.RatingCompat.RemoteActionCompatParcelizer(true);
        ViewTreeObserver viewTreeObserver = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = this.ComponentActivity.getViewTreeObserver();
            }
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.removeGlobalOnLayoutListener(this.MediaBrowserCompatMediaItem);
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
        }
        this.ComponentActivity.removeOnAttachStateChangeListener(this.serializer);
        PopupWindow.OnDismissListener onDismissListener = this.MediaSessionCompatQueueItem;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // o.getResources
    public final void read(getDrawerToggleDelegate getdrawertoggledelegate) {
        this.ParcelableVolumeInfo = getdrawertoggledelegate;
    }

    @Override // o.getResources
    public final boolean read() {
        return false;
    }

    @Override // o.findViewById
    public final void serializer(View view) {
        this.IconCompatParcelizer = view;
    }

    @Override // o.findViewById
    public final void write(AlertControllerButtonHandler alertControllerButtonHandler) {
    }

    @Override // o.findViewById
    public final void RemoteActionCompatParcelizer(boolean z) {
        this.RemoteActionCompatParcelizer.serializer = z;
    }

    @Override // o.invalidateOptionsMenu
    public final setHasNonEmbeddedTabs a_() {
        return this.PlaybackStateCompat.PlaybackStateCompat;
    }

    @Override // o.findViewById
    public final void read(int i) {
        this.PlaybackStateCompat.PlaybackStateCompatCustomAction = i;
    }

    @Override // o.findViewById
    public final void write(int i) {
        this.PlaybackStateCompat.write(i);
    }

    @Override // o.invalidateOptionsMenu
    public final boolean serializer() {
        return !this.ResultReceiver && this.PlaybackStateCompat.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.isShowing();
    }

    @Override // o.getResources
    public final void IconCompatParcelizer(AlertControllerButtonHandler alertControllerButtonHandler, boolean z) {
        if (alertControllerButtonHandler != this.RatingCompat) {
            return;
        }
        RemoteActionCompatParcelizer();
        getDrawerToggleDelegate getdrawertoggledelegate = this.ParcelableVolumeInfo;
        if (getdrawertoggledelegate != null) {
            getdrawertoggledelegate.read(alertControllerButtonHandler, z);
        }
    }

    public getSupportParentActivityIntent(Context context, AlertControllerButtonHandler alertControllerButtonHandler, View view, int i, boolean z) {
        this.write = context;
        this.RatingCompat = alertControllerButtonHandler;
        this.MediaSessionCompatToken = z;
        this.RemoteActionCompatParcelizer = new onRestoreInstanceState(alertControllerButtonHandler, LayoutInflater.from(context), z, com.logistics.rider.glovo.R.layout.abc_popup_menu_item_layout);
        this.MediaSessionCompatResultReceiverWrapper = i;
        Resources resources = context.getResources();
        this.PlaybackStateCompatCustomAction = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.abc_config_prefDialogWidth));
        this.IconCompatParcelizer = view;
        this.PlaybackStateCompat = new getSupportBackgroundTintList(context, null, i, 0);
        alertControllerButtonHandler.RemoteActionCompatParcelizer(this, context);
    }

    @Override // o.invalidateOptionsMenu
    public final void RemoteActionCompatParcelizer() {
        if (serializer()) {
            this.PlaybackStateCompat.RemoteActionCompatParcelizer();
        }
    }

    @Override // o.invalidateOptionsMenu
    public final void b_() {
        View view;
        if (serializer()) {
            return;
        }
        if (this.ResultReceiver || (view = this.IconCompatParcelizer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.ComponentActivity = view;
        getSupportBackgroundTintList getsupportbackgroundtintlist = this.PlaybackStateCompat;
        setItemInvoker setiteminvoker = getsupportbackgroundtintlist.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        setItemInvoker setiteminvoker2 = getsupportbackgroundtintlist.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        setiteminvoker.setOnDismissListener(this);
        getsupportbackgroundtintlist.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = this;
        getsupportbackgroundtintlist.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = true;
        setiteminvoker2.setFocusable(true);
        View view2 = this.ComponentActivity;
        boolean z = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.MediaBrowserCompatMediaItem);
        }
        view2.addOnAttachStateChangeListener(this.serializer);
        getsupportbackgroundtintlist.RatingCompat = view2;
        getsupportbackgroundtintlist.ParcelableVolumeInfo = this.MediaDescriptionCompat;
        boolean z2 = this.MediaMetadataCompat;
        Context context = this.write;
        onRestoreInstanceState onrestoreinstancestate = this.RemoteActionCompatParcelizer;
        if (!z2) {
            this.read = findViewById.RemoteActionCompatParcelizer(onrestoreinstancestate, context, this.PlaybackStateCompatCustomAction);
            this.MediaMetadataCompat = true;
        }
        getsupportbackgroundtintlist.read(this.read);
        setiteminvoker2.setInputMethodMode(2);
        android.graphics.Rect rect = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        getsupportbackgroundtintlist.ComponentActivity = rect != null ? new android.graphics.Rect(rect) : null;
        getsupportbackgroundtintlist.b_();
        setHasNonEmbeddedTabs sethasnonembeddedtabs = getsupportbackgroundtintlist.PlaybackStateCompat;
        sethasnonembeddedtabs.setOnKeyListener(this);
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            AlertControllerButtonHandler alertControllerButtonHandler = this.RatingCompat;
            if (alertControllerButtonHandler.MediaMetadataCompat != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(com.logistics.rider.glovo.R.layout.abc_popup_menu_header_item_layout, (ViewGroup) sethasnonembeddedtabs, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(alertControllerButtonHandler.MediaMetadataCompat);
                }
                frameLayout.setEnabled(false);
                sethasnonembeddedtabs.addHeaderView(frameLayout, null, false);
            }
        }
        getsupportbackgroundtintlist.read(onrestoreinstancestate);
        getsupportbackgroundtintlist.b_();
    }

    @Override // o.getResources
    public final boolean RemoteActionCompatParcelizer(onNightModeChanged onnightmodechanged) {
        boolean z;
        if (onnightmodechanged.hasVisibleItems()) {
            getMenuInflater getmenuinflater = new getMenuInflater(this.write, onnightmodechanged, this.ComponentActivity, this.MediaSessionCompatToken, this.MediaSessionCompatResultReceiverWrapper, 0);
            getDrawerToggleDelegate getdrawertoggledelegate = this.ParcelableVolumeInfo;
            getmenuinflater.MediaSessionCompatToken = getdrawertoggledelegate;
            findViewById findviewbyid = getmenuinflater.MediaMetadataCompat;
            if (findviewbyid != null) {
                findviewbyid.read(getdrawertoggledelegate);
            }
            int size = onnightmodechanged.ParcelableVolumeInfo.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = onnightmodechanged.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            getmenuinflater.write = z;
            findViewById findviewbyid2 = getmenuinflater.MediaMetadataCompat;
            if (findviewbyid2 != null) {
                findviewbyid2.RemoteActionCompatParcelizer(z);
            }
            getmenuinflater.MediaSessionCompatQueueItem = this.MediaSessionCompatQueueItem;
            this.MediaSessionCompatQueueItem = null;
            this.RatingCompat.RemoteActionCompatParcelizer(false);
            getSupportBackgroundTintList getsupportbackgroundtintlist = this.PlaybackStateCompat;
            int width = getsupportbackgroundtintlist.PlaybackStateCompatCustomAction;
            int iMediaBrowserCompatMediaItem = getsupportbackgroundtintlist.MediaBrowserCompatMediaItem();
            if ((Gravity.getAbsoluteGravity(this.MediaDescriptionCompat, this.IconCompatParcelizer.getLayoutDirection()) & 7) == 5) {
                width += this.IconCompatParcelizer.getWidth();
            }
            if (!getmenuinflater.serializer()) {
                if (getmenuinflater.serializer != null) {
                    getmenuinflater.write(width, iMediaBrowserCompatMediaItem, true, true);
                }
            }
            getDrawerToggleDelegate getdrawertoggledelegate2 = this.ParcelableVolumeInfo;
            if (getdrawertoggledelegate2 != null) {
                getdrawertoggledelegate2.read(onnightmodechanged);
            }
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        RemoteActionCompatParcelizer();
        return true;
    }
}
