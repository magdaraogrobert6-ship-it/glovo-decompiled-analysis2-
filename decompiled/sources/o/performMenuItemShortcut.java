package o;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes4.dex */
public final class performMenuItemShortcut implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener IconCompatParcelizer;
    public final /* synthetic */ closeOptionsMenu read;

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.IconCompatParcelizer.onMenuItemActionCollapse(this.read.serializer(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.IconCompatParcelizer.onMenuItemActionExpand(this.read.serializer(menuItem));
    }

    public performMenuItemShortcut(closeOptionsMenu closeoptionsmenu, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.read = closeoptionsmenu;
        this.IconCompatParcelizer = onActionExpandListener;
    }
}
