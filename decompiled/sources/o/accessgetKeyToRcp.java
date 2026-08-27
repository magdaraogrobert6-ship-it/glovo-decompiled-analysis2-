package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetKeyToRcp implements dispatchIndirectPointerEvent {
    private static byte ComponentActivity = -112;
    private static int ResultReceiver = 1;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public CharSequence IconCompatParcelizer;
    public char MediaBrowserCompatMediaItem;
    public Drawable MediaDescriptionCompat;
    public ColorStateList MediaMetadataCompat;
    public Intent MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public CharSequence MediaSessionCompatToken;
    public CharSequence ParcelableVolumeInfo;
    public char PlaybackStateCompat;
    public int PlaybackStateCompatCustomAction;
    public PorterDuff.Mode RatingCompat;
    public int RemoteActionCompatParcelizer;
    public CharSequence r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public Context read;
    public boolean serializer;
    public boolean write;

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.IconCompatParcelizer;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.MediaDescriptionCompat;
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.MediaMetadataCompat;
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.RatingCompat;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.MediaSessionCompatQueueItem;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return android.R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.PlaybackStateCompatCustomAction;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.PlaybackStateCompat;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.ParcelableVolumeInfo;
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.RemoteActionCompatParcelizer & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.RemoteActionCompatParcelizer & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.RemoteActionCompatParcelizer & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.RemoteActionCompatParcelizer & 8) == 0;
    }

    @Override // o.dispatchIndirectPointerEvent
    public final attachBaseContext serializer() {
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.IconCompatParcelizer = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.MediaSessionCompatQueueItem = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.MediaSessionCompatToken = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = charSequence;
        return this;
    }

    @Override // o.dispatchIndirectPointerEvent
    public final dispatchIndirectPointerEvent RemoteActionCompatParcelizer(attachBaseContext attachbasecontext) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.MediaDescriptionCompat = this.read.getDrawable(i);
        read();
        return this;
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.PlaybackStateCompat = c;
        this.PlaybackStateCompatCustomAction = android.view.KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.PlaybackStateCompat = c;
        this.PlaybackStateCompatCustomAction = android.view.KeyEvent.normalizeMetaState(i);
        this.MediaBrowserCompatMediaItem = Character.toLowerCase(c2);
        this.MediaSessionCompatResultReceiverWrapper = android.view.KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // o.dispatchIndirectPointerEvent
    public final dispatchIndirectPointerEvent serializer(CharSequence charSequence) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = charSequence;
        return this;
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.MediaMetadataCompat = colorStateList;
        this.write = true;
        read();
        return this;
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.RatingCompat = mode;
        this.serializer = true;
        read();
        return this;
    }

    @Override // o.dispatchIndirectPointerEvent
    public final dispatchIndirectPointerEvent write(CharSequence charSequence) {
        this.IconCompatParcelizer = charSequence;
        return this;
    }

    public final void read() {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            if (this.write || this.serializer) {
                this.MediaDescriptionCompat = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.MediaDescriptionCompat = drawableMutate;
                if (this.write) {
                    drawableMutate.setTintList(this.MediaMetadataCompat);
                }
                if (this.serializer) {
                    this.MediaDescriptionCompat.setTintMode(this.RatingCompat);
                }
            }
        }
    }

    @Override // o.dispatchIndirectPointerEvent, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.MediaBrowserCompatMediaItem = Character.toLowerCase(c);
        this.MediaSessionCompatResultReceiverWrapper = android.view.KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.MediaSessionCompatToken;
        return charSequence != null ? charSequence : this.ParcelableVolumeInfo;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.RemoteActionCompatParcelizer = (z ? 1 : 0) | (this.RemoteActionCompatParcelizer & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.PlaybackStateCompat = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.RemoteActionCompatParcelizer = (z ? 2 : 0) | (this.RemoteActionCompatParcelizer & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.RemoteActionCompatParcelizer = (z ? 0 : 8) | (this.RemoteActionCompatParcelizer & 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.RemoteActionCompatParcelizer = (z ? 16 : 0) | (this.RemoteActionCompatParcelizer & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.MediaDescriptionCompat = drawable;
        read();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        int i2 = 2 % 2;
        int i3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 109;
        ResultReceiver = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            this.read.getResources().getString(i).startsWith("%('");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String string = this.read.getResources().getString(i);
        if (!(!string.startsWith("%('"))) {
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            string = ((String) objArr[0]).intern();
            int i4 = ResultReceiver + 113;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        this.ParcelableVolumeInfo = string;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.MediaBrowserCompatMediaItem = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.ParcelableVolumeInfo = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.PlaybackStateCompat = c;
        this.MediaBrowserCompatMediaItem = Character.toLowerCase(c2);
        return this;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ ComponentActivity);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
