package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.camera.core.ImageCapture$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Keep implements dispatchIndirectPointerEvent {
    private static int _init_lambda1 = 0;
    private static int _init_lambda4 = 1;
    private static byte r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = -112;
    public attachBaseContext IconCompatParcelizer;
    public Drawable MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final int MediaSessionCompatToken;
    public Intent ParcelableVolumeInfo;
    public final int RemoteActionCompatParcelizer;
    public final AlertControllerButtonHandler ResultReceiver;
    public final int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public MenuItem.OnActionExpandListener r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public char r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public char r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public CharSequence r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public onNightModeChanged r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public CharSequence r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public CharSequence r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public CharSequence read;
    public View serializer;
    public MenuItem.OnMenuItemClickListener write;
    public int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = androidx.compose.ui.graphics.Fields.TransformOrigin;
    public int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = androidx.compose.ui.graphics.Fields.TransformOrigin;
    public int PlaybackStateCompatCustomAction = 0;
    public ColorStateList MediaSessionCompatResultReceiverWrapper = null;
    public PorterDuff.Mode PlaybackStateCompat = null;
    public boolean MediaBrowserCompatMediaItem = false;
    public boolean MediaDescriptionCompat = false;
    public boolean ComponentActivity = false;
    public int RatingCompat = 16;
    public boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = false;

    @Override // o.dispatchIndirectPointerEvent
    public final dispatchIndirectPointerEvent RemoteActionCompatParcelizer(attachBaseContext attachbasecontext) {
        this.serializer = null;
        this.IconCompatParcelizer = attachbasecontext;
        this.ResultReceiver.write(true);
        attachBaseContext attachbasecontext2 = this.IconCompatParcelizer;
        if (attachbasecontext2 != null) {
            attachbasecontext2.read = new ImageCapture$1(5, this);
            attachbasecontext2.RemoteActionCompatParcelizer.setVisibilityListener(attachbasecontext2);
        }
        return this;
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.read;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.MediaSessionCompatQueueItem;
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.PlaybackStateCompat;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.ParcelableVolumeInfo;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.MediaSessionCompatToken;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.RatingCompat & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.RatingCompat & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.RatingCompat & 16) != 0;
    }

    @Override // o.dispatchIndirectPointerEvent
    public final attachBaseContext serializer() {
        return this.IconCompatParcelizer;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.MediaMetadataCompat = null;
        this.PlaybackStateCompatCustomAction = i;
        this.ComponentActivity = true;
        this.ResultReceiver.write(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.ParcelableVolumeInfo = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.write = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final Drawable serializer(Drawable drawable) {
        if (drawable != null && this.ComponentActivity && (this.MediaBrowserCompatMediaItem || this.MediaDescriptionCompat)) {
            drawable = drawable.mutate();
            if (this.MediaBrowserCompatMediaItem) {
                drawable.setTintList(this.MediaSessionCompatResultReceiverWrapper);
            }
            if (this.MediaDescriptionCompat) {
                drawable.setTintMode(this.PlaybackStateCompat);
            }
            this.ComponentActivity = false;
        }
        return drawable;
    }

    @Override // o.dispatchIndirectPointerEvent
    public final dispatchIndirectPointerEvent serializer(CharSequence charSequence) {
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = charSequence;
        this.ResultReceiver.write(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        AlertControllerButtonHandler alertControllerButtonHandler = this.ResultReceiver;
        Context context = alertControllerButtonHandler.write;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.serializer = viewInflate;
        this.IconCompatParcelizer = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.MediaSessionCompatToken) > 0) {
            viewInflate.setId(i2);
        }
        alertControllerButtonHandler.PlaybackStateCompat = true;
        alertControllerButtonHandler.write(true);
        return this;
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = c;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = android.view.KeyEvent.normalizeMetaState(i);
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = Character.toLowerCase(c2);
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = android.view.KeyEvent.normalizeMetaState(i2);
        this.ResultReceiver.write(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = charSequence;
        this.ResultReceiver.write(false);
        onNightModeChanged onnightmodechanged = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (onnightmodechanged != null) {
            onnightmodechanged.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = charSequence;
        this.ResultReceiver.write(false);
        return this;
    }

    @Override // o.dispatchIndirectPointerEvent
    public final dispatchIndirectPointerEvent write(CharSequence charSequence) {
        this.read = charSequence;
        this.ResultReceiver.write(false);
        return this;
    }

    public static void serializer(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.MediaSessionCompatResultReceiverWrapper = colorStateList;
        this.MediaBrowserCompatMediaItem = true;
        this.ComponentActivity = true;
        this.ResultReceiver.write(false);
        return this;
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.PlaybackStateCompat = mode;
        this.MediaDescriptionCompat = true;
        this.ComponentActivity = true;
        this.ResultReceiver.write(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.MediaMetadataCompat;
        if (drawable != null) {
            return serializer(drawable);
        }
        int i = this.PlaybackStateCompatCustomAction;
        if (i == 0) {
            return null;
        }
        Drawable drawableWrite = coil3.util.IntPair.write(this.ResultReceiver.write, i);
        this.PlaybackStateCompatCustomAction = 0;
        this.MediaMetadataCompat = drawableWrite;
        return serializer(drawableWrite);
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == c && this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == i) {
            return this;
        }
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = Character.toLowerCase(c);
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = android.view.KeyEvent.normalizeMetaState(i);
        this.ResultReceiver.write(false);
        return this;
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == c && this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == i) {
            return this;
        }
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = c;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = android.view.KeyEvent.normalizeMetaState(i);
        this.ResultReceiver.write(false);
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public Keep(AlertControllerButtonHandler alertControllerButtonHandler, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.ResultReceiver = alertControllerButtonHandler;
        this.MediaSessionCompatToken = i2;
        this.MediaSessionCompatQueueItem = i;
        this.RemoteActionCompatParcelizer = i3;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = charSequence;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i5;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.serializer;
        if (view != null) {
            return view;
        }
        attachBaseContext attachbasecontext = this.IconCompatParcelizer;
        if (attachbasecontext == null) {
            return null;
        }
        View viewOnCreateActionView = attachbasecontext.RemoteActionCompatParcelizer.onCreateActionView(this);
        this.serializer = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        return charSequence != null ? charSequence : this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.RatingCompat;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.RatingCompat = i2;
        if (i != i2) {
            this.ResultReceiver.write(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.RatingCompat;
        AlertControllerButtonHandler alertControllerButtonHandler = this.ResultReceiver;
        if ((i & 4) == 0) {
            int i2 = (i & (-3)) | (z ? 2 : 0);
            this.RatingCompat = i2;
            if (i != i2) {
                alertControllerButtonHandler.write(false);
            }
            return this;
        }
        ArrayList arrayList = alertControllerButtonHandler.ParcelableVolumeInfo;
        int size = arrayList.size();
        alertControllerButtonHandler.MediaDescriptionCompat();
        for (int i3 = 0; i3 < size; i3++) {
            Keep keep = (Keep) arrayList.get(i3);
            if (keep.MediaSessionCompatQueueItem == this.MediaSessionCompatQueueItem && (keep.RatingCompat & 4) != 0 && keep.isCheckable()) {
                boolean z2 = keep == this;
                int i4 = keep.RatingCompat;
                int i5 = (z2 ? 2 : 0) | (i4 & (-3));
                keep.RatingCompat = i5;
                if (i4 != i5) {
                    keep.ResultReceiver.write(false);
                }
            }
        }
        alertControllerButtonHandler.MediaBrowserCompatMediaItem();
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        attachBaseContext attachbasecontext = this.IconCompatParcelizer;
        if (attachbasecontext == null || !attachbasecontext.RemoteActionCompatParcelizer.overridesItemVisibility()) {
            return (this.RatingCompat & 8) == 0;
        }
        return (this.RatingCompat & 8) == 0 && this.IconCompatParcelizer.RemoteActionCompatParcelizer.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i = this.RatingCompat;
        if (z) {
            this.RatingCompat = i | 16;
        } else {
            this.RatingCompat = i & (-17);
        }
        this.ResultReceiver.write(false);
        return this;
    }

    public final void write(boolean z) {
        int i = this.RatingCompat;
        if (z) {
            this.RatingCompat = i | 32;
        } else {
            this.RatingCompat = i & (-33);
        }
    }

    public final boolean IconCompatParcelizer() {
        attachBaseContext attachbasecontext;
        if ((this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM & 8) == 0) {
            return false;
        }
        if (this.serializer == null && (attachbasecontext = this.IconCompatParcelizer) != null) {
            this.serializer = attachbasecontext.RemoteActionCompatParcelizer.onCreateActionView(this);
        }
        return this.serializer != null;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM & 8) == 0) {
            return false;
        }
        if (this.serializer == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.ResultReceiver.write(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!IconCompatParcelizer()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.ResultReceiver.IconCompatParcelizer(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        write(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        serializer(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.RatingCompat;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.RatingCompat = i2;
        if (i != i2) {
            AlertControllerButtonHandler alertControllerButtonHandler = this.ResultReceiver;
            alertControllerButtonHandler.PlaybackStateCompatCustomAction = true;
            alertControllerButtonHandler.write(true);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i;
        AlertControllerButtonHandler alertControllerButtonHandler = this.ResultReceiver;
        alertControllerButtonHandler.PlaybackStateCompat = true;
        alertControllerButtonHandler.write(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.PlaybackStateCompatCustomAction = 0;
        this.MediaMetadataCompat = drawable;
        this.ComponentActivity = true;
        this.ResultReceiver.write(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        int i2 = 2 % 2;
        int i3 = _init_lambda1 + 111;
        _init_lambda4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String string = this.ResultReceiver.write.getString(i);
        if (string.startsWith("%('")) {
            int i5 = _init_lambda4 + 51;
            _init_lambda1 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            String strSubstring = string.substring(3);
            Object[] objArr = new Object[1];
            if (i6 != 0) {
                a(strSubstring, objArr);
                string = ((String) objArr[0]).intern();
                int i7 = 39 / 0;
            } else {
                a(strSubstring, objArr);
                string = ((String) objArr[0]).intern();
            }
        }
        setTitle(string);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == c) {
            return this;
        }
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = c;
        this.ResultReceiver.write(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = c;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = Character.toLowerCase(c2);
        this.ResultReceiver.write(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == c) {
            return this;
        }
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = Character.toLowerCase(c);
        this.ResultReceiver.write(false);
        return this;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.serializer = view;
        this.IconCompatParcelizer = null;
        if (view != null && view.getId() == -1 && (i = this.MediaSessionCompatToken) > 0) {
            view.setId(i);
        }
        AlertControllerButtonHandler alertControllerButtonHandler = this.ResultReceiver;
        alertControllerButtonHandler.PlaybackStateCompat = true;
        alertControllerButtonHandler.write(true);
        return this;
    }
}
