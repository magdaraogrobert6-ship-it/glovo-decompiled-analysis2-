package o;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class initDelegate implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener read;
    public final /* synthetic */ closeOptionsMenu serializer;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.read.onMenuItemClick(this.serializer.serializer(menuItem));
    }

    public initDelegate(closeOptionsMenu closeoptionsmenu, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.serializer = closeoptionsmenu;
        this.read = onMenuItemClickListener;
    }
}
