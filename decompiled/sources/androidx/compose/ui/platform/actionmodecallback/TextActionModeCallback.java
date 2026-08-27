package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.geometry.Rect;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class TextActionModeCallback {
    public static final int $stable = 8;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 onActionModeDestroy;
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 onAutofillRequested;
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 onCopyRequested;
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 onCutRequested;
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 onPasteRequested;
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 onSelectAllRequested;
    private Rect rect;

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getOnAutofillRequested() {
        return this.onAutofillRequested;
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getOnCopyRequested() {
        return this.onCopyRequested;
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getOnCutRequested() {
        return this.onCutRequested;
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getOnPasteRequested() {
        return this.onPasteRequested;
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    public final Rect getRect() {
        return this.rect;
    }

    public final void setOnAutofillRequested(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.onAutofillRequested = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public final void setOnCopyRequested(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.onCopyRequested = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public final void setOnCutRequested(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.onCutRequested = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public final void setOnPasteRequested(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.onPasteRequested = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public final void setOnSelectAllRequested(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.onSelectAllRequested = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public final void setRect(Rect rect) {
        this.rect = rect;
    }

    private final void addOrRemoveMenuItem(Menu menu, MenuItemOption menuItemOption, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null && menu.findItem(menuItemOption.getId()) == null) {
            addMenuItem$ui(menu, menuItemOption);
        } else {
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null || menu.findItem(menuItemOption.getId()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getId());
        }
    }

    public final void updateMenuItems$ui(Menu menu) {
        addOrRemoveMenuItem(menu, MenuItemOption.Copy, this.onCopyRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Paste, this.onPasteRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Cut, this.onCutRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.SelectAll, this.onSelectAllRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Autofill, this.onAutofillRequested);
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.onCopyRequested;
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = this.onPasteRequested;
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k1 != null) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = this.onCutRequested;
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k2 != null) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k2.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.getId()) {
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = this.onSelectAllRequested;
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k3 != null) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k3.invoke();
            }
        } else {
            if (itemId != MenuItemOption.Autofill.getId()) {
                return false;
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = this.onAutofillRequested;
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k4 != null) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k4.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final void addMenuItem$ui(Menu menu, MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    public final void onDestroyActionMode() {
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.onActionModeDestroy;
        if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        }
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("onCreateActionMode requires a non-null menu");
            return false;
        }
        if (actionMode != null) {
            if (this.onCopyRequested != null) {
                addMenuItem$ui(menu, MenuItemOption.Copy);
            }
            if (this.onPasteRequested != null) {
                addMenuItem$ui(menu, MenuItemOption.Paste);
            }
            if (this.onCutRequested != null) {
                addMenuItem$ui(menu, MenuItemOption.Cut);
            }
            if (this.onSelectAllRequested != null) {
                addMenuItem$ui(menu, MenuItemOption.SelectAll);
            }
            if (this.onAutofillRequested == null) {
                return true;
            }
            addMenuItem$ui(menu, MenuItemOption.Autofill);
            return true;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("onCreateActionMode requires a non-null mode");
        return false;
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui(menu);
        return true;
    }

    public /* synthetic */ TextActionModeCallback(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Rect rect, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (i & 2) != 0 ? Rect.Companion.getZero() : rect, (i & 4) != 0 ? null : r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (i & 8) != 0 ? null : r8lambdardpfsr94j4iebcwx_kpqzpm8k2, (i & 16) != 0 ? null : r8lambdardpfsr94j4iebcwx_kpqzpm8k3, (i & 32) != 0 ? null : r8lambdardpfsr94j4iebcwx_kpqzpm8k4, (i & 64) != 0 ? null : r8lambdardpfsr94j4iebcwx_kpqzpm8k5);
    }

    public TextActionModeCallback(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Rect rect, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5) {
        this.onActionModeDestroy = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.rect = rect;
        this.onCopyRequested = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.onPasteRequested = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.onCutRequested = r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
        this.onSelectAllRequested = r8lambdardpfsr94j4iebcwx_kpqzpm8k4;
        this.onAutofillRequested = r8lambdardpfsr94j4iebcwx_kpqzpm8k5;
    }

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
