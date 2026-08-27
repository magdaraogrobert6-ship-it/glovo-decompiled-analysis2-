package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public class onContentChanged extends androidx.appcompat.view.menu.BaseMenuWrapper implements Menu {
    public final AlertControllerButtonHandler read;

    @Override // android.view.Menu
    public final void clear() {
        processDragGesture processdraggesture = (processDragGesture) this.IconCompatParcelizer;
        if (processdraggesture != null) {
            processdraggesture.clear();
        }
        this.read.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.read.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return serializer(this.read.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return serializer(this.read.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.read.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, android.view.KeyEvent keyEvent) {
        return this.read.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.read.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, android.view.KeyEvent keyEvent, int i2) {
        return this.read.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((processDragGesture) this.IconCompatParcelizer) != null) {
            int i2 = 0;
            while (true) {
                processDragGesture processdraggesture = (processDragGesture) this.IconCompatParcelizer;
                if (i2 >= processdraggesture.MediaMetadataCompat) {
                    break;
                }
                if (((dispatchIndirectPointerEvent) processdraggesture.IconCompatParcelizer(i2)).getGroupId() == i) {
                    ((processDragGesture) this.IconCompatParcelizer).RemoteActionCompatParcelizer(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.read.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((processDragGesture) this.IconCompatParcelizer) != null) {
            int i2 = 0;
            while (true) {
                processDragGesture processdraggesture = (processDragGesture) this.IconCompatParcelizer;
                if (i2 >= processdraggesture.MediaMetadataCompat) {
                    break;
                }
                if (((dispatchIndirectPointerEvent) processdraggesture.IconCompatParcelizer(i2)).getItemId() == i) {
                    ((processDragGesture) this.IconCompatParcelizer).RemoteActionCompatParcelizer(i2);
                    break;
                }
                i2++;
            }
        }
        this.read.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.read.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.read.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.read.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.read.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.read.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return serializer(this.read.IconCompatParcelizer(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.read.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.read.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = serializer(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    public onContentChanged(Context context, AlertControllerButtonHandler alertControllerButtonHandler) {
        super(context);
        if (alertControllerButtonHandler != null) {
            this.read = alertControllerButtonHandler;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.read.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.read.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.read.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return serializer(this.read.add(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return serializer(this.read.IconCompatParcelizer(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return serializer(this.read.add(i, i2, i3, i4));
    }
}
