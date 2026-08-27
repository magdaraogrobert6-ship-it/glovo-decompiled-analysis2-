package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class onNightModeChanged extends AlertControllerButtonHandler implements SubMenu {
    public final AlertControllerButtonHandler r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final Keep r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    }

    @Override // o.AlertControllerButtonHandler
    public final void write(IntentSenderRequest intentSenderRequest) {
        throw null;
    }

    @Override // o.AlertControllerButtonHandler
    public final AlertControllerButtonHandler IconCompatParcelizer() {
        return this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer();
    }

    @Override // o.AlertControllerButtonHandler
    public final boolean IconCompatParcelizer(Keep keep) {
        return this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer(keep);
    }

    @Override // o.AlertControllerButtonHandler
    public final boolean MediaMetadataCompat() {
        return this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.MediaMetadataCompat();
    }

    @Override // o.AlertControllerButtonHandler
    public final boolean RatingCompat() {
        return this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.RatingCompat();
    }

    @Override // o.AlertControllerButtonHandler
    public final boolean read() {
        return this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.read();
    }

    @Override // o.AlertControllerButtonHandler, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.setIcon(drawable);
        return this;
    }

    @Override // o.AlertControllerButtonHandler, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.setQwertyMode(z);
    }

    @Override // o.AlertControllerButtonHandler
    public final boolean write(Keep keep) {
        return this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.write(keep);
    }

    public onNightModeChanged(Context context, AlertControllerButtonHandler alertControllerButtonHandler, Keep keep) {
        super(context);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = alertControllerButtonHandler;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = keep;
    }

    @Override // o.AlertControllerButtonHandler
    public final String write() {
        Keep keep = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        int i = keep != null ? keep.MediaSessionCompatToken : 0;
        if (i == 0) {
            return null;
        }
        return c8$$ExternalSyntheticOutline0.m(i, "android:menu:actionviewstates:");
    }

    @Override // o.AlertControllerButtonHandler
    public final boolean serializer(AlertControllerButtonHandler alertControllerButtonHandler, MenuItem menuItem) {
        return super.serializer(alertControllerButtonHandler, menuItem) || this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.serializer(alertControllerButtonHandler, menuItem);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        IconCompatParcelizer(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        IconCompatParcelizer(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        IconCompatParcelizer(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        IconCompatParcelizer(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        IconCompatParcelizer(i, null, 0, null, null);
        return this;
    }
}
