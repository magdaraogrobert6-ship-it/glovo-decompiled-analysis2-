package androidx.compose.foundation.text.contextmenu.internal;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class FloatingTextActionModeCallback extends ActionMode.Callback2 implements ActionMode.Callback {
    public final AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl IconCompatParcelizer;

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.IconCompatParcelizer.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.IconCompatParcelizer.updateMenuItems(menu);
        return menu.size() > 0;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.IconCompatParcelizer.serializer.read();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        androidx.compose.ui.geometry.Rect rect2 = (androidx.compose.ui.geometry.Rect) this.IconCompatParcelizer.RemoteActionCompatParcelizer.invoke();
        rect.set(Math.round(rect2.getLeft()), Math.round(rect2.getTop()), Math.round(rect2.getRight()), Math.round(rect2.getBottom()));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.IconCompatParcelizer.updateMenuItems(menu);
    }

    public FloatingTextActionModeCallback(AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl textActionModeCallbackImpl) {
        this.IconCompatParcelizer = textActionModeCallbackImpl;
    }
}
