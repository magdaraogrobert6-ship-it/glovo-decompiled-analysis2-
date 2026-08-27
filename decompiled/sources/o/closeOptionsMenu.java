package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class closeOptionsMenu extends androidx.appcompat.view.menu.BaseMenuWrapper implements MenuItem {
    public final dispatchIndirectPointerEvent RemoteActionCompatParcelizer;
    public Method serializer;

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.RemoteActionCompatParcelizer.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.RemoteActionCompatParcelizer.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        attachBaseContext attachbasecontextSerializer = this.RemoteActionCompatParcelizer.serializer();
        if (attachbasecontextSerializer instanceof attachBaseContext) {
            return attachbasecontextSerializer.RemoteActionCompatParcelizer;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.RemoteActionCompatParcelizer.getActionView();
        return actionView instanceof dispatchKeyEvent ? (View) ((dispatchKeyEvent) actionView).write : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.RemoteActionCompatParcelizer.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.RemoteActionCompatParcelizer.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.RemoteActionCompatParcelizer.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.RemoteActionCompatParcelizer.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.RemoteActionCompatParcelizer.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.RemoteActionCompatParcelizer.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.RemoteActionCompatParcelizer.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.RemoteActionCompatParcelizer.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.RemoteActionCompatParcelizer.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.RemoteActionCompatParcelizer.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.RemoteActionCompatParcelizer.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.RemoteActionCompatParcelizer.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.RemoteActionCompatParcelizer.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.RemoteActionCompatParcelizer.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.RemoteActionCompatParcelizer.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.RemoteActionCompatParcelizer.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.RemoteActionCompatParcelizer.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.RemoteActionCompatParcelizer.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.RemoteActionCompatParcelizer.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.RemoteActionCompatParcelizer.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.RemoteActionCompatParcelizer.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.RemoteActionCompatParcelizer.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.RemoteActionCompatParcelizer.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        attachBaseContext attachbasecontext = new attachBaseContext(this, actionProvider);
        if (actionProvider == null) {
            attachbasecontext = null;
        }
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(attachbasecontext);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        dispatchIndirectPointerEvent dispatchindirectpointerevent = this.RemoteActionCompatParcelizer;
        dispatchindirectpointerevent.setActionView(i);
        View actionView = dispatchindirectpointerevent.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            dispatchindirectpointerevent.setActionView(new dispatchKeyEvent(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.RemoteActionCompatParcelizer.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.RemoteActionCompatParcelizer.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.RemoteActionCompatParcelizer.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.RemoteActionCompatParcelizer.write(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.RemoteActionCompatParcelizer.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.RemoteActionCompatParcelizer.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.RemoteActionCompatParcelizer.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.RemoteActionCompatParcelizer.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.RemoteActionCompatParcelizer.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.RemoteActionCompatParcelizer.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.RemoteActionCompatParcelizer.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.RemoteActionCompatParcelizer.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.RemoteActionCompatParcelizer.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.RemoteActionCompatParcelizer.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.RemoteActionCompatParcelizer.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.RemoteActionCompatParcelizer.serializer(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.RemoteActionCompatParcelizer.setVisible(z);
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.RemoteActionCompatParcelizer.setOnActionExpandListener(onActionExpandListener != null ? new performMenuItemShortcut(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.RemoteActionCompatParcelizer.setOnMenuItemClickListener(onMenuItemClickListener != null ? new initDelegate(this, onMenuItemClickListener) : null);
        return this;
    }

    public closeOptionsMenu(Context context, dispatchIndirectPointerEvent dispatchindirectpointerevent) {
        super(context);
        if (dispatchindirectpointerevent != null) {
            this.RemoteActionCompatParcelizer = dispatchindirectpointerevent;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.RemoteActionCompatParcelizer.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.RemoteActionCompatParcelizer.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.RemoteActionCompatParcelizer.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.RemoteActionCompatParcelizer.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.RemoteActionCompatParcelizer.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new dispatchKeyEvent(view);
        }
        this.RemoteActionCompatParcelizer.setActionView(view);
        return this;
    }
}
