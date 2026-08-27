package com.foodora.courier.app.application;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.ui.graphics.Fields;
import java.util.List;
import o.setContentIfPresent;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCrashGuardWindowCallback implements Window.Callback {
    public static boolean IconCompatParcelizer = false;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final Window.Callback write;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = (~(i7 | i6)) | (~(i7 | i8));
        int i10 = ~i6;
        int i11 = (~(i3 | i10 | i)) | i9;
        int i12 = ~(i8 | i10);
        int i13 = i6 + i + i2 + ((-1228711472) * i4) + ((-141981132) * i5);
        int i14 = i13 * i13;
        int i15 = (((-639131287) * i6) - 2072313856) + (1118068377 * i) + (i11 * (-1268883816)) + ((-1757199664) * i9) + ((-1268883816) * i12) + ((-1908015104) * i2) + ((-287309824) * i4) + ((-1573388288) * i5) + ((-2138374144) * i14);
        int i16 = ((i6 * (-646461497)) - 273503129) + (i * (-646460521)) + (i11 * 488) + (i9 * (-976)) + (i12 * 488) + (i2 * (-646461009)) + (i4 * 1623110960) + (i5 * (-2035004020)) + (i14 * 33882112);
        int i17 = i15 + (i16 * i16 * (-1051394048));
        if (i17 == 1) {
            return serializer(objArr);
        }
        if (i17 == 2) {
            return read(objArr);
        }
        if (i17 == 3) {
            return IconCompatParcelizer(objArr);
        }
        if (i17 == 4) {
            return RemoteActionCompatParcelizer(objArr);
        }
        MediaSessionCrashGuardWindowCallback mediaSessionCrashGuardWindowCallback = (MediaSessionCrashGuardWindowCallback) objArr[0];
        ActionMode actionMode = (ActionMode) objArr[1];
        int i18 = 2 % 2;
        int i19 = RemoteActionCompatParcelizer + 7;
        serializer = i19 % Fields.SpotShadowColor;
        int i20 = i19 % 2;
        mediaSessionCrashGuardWindowCallback.write.onActionModeFinished(actionMode);
        int i21 = RemoteActionCompatParcelizer + 99;
        serializer = i21 % Fields.SpotShadowColor;
        int i22 = i21 % 2;
        return null;
    }

    public MediaSessionCrashGuardWindowCallback(Window.Callback callback) {
        this.write = callback;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        MediaSessionCrashGuardWindowCallback mediaSessionCrashGuardWindowCallback = (MediaSessionCrashGuardWindowCallback) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 77;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            mediaSessionCrashGuardWindowCallback.write.onWindowFocusChanged(zBooleanValue);
            obj.hashCode();
            throw null;
        }
        mediaSessionCrashGuardWindowCallback.write.onWindowFocusChanged(zBooleanValue);
        int i3 = serializer + 79;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 85;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.write.onActionModeStarted(actionMode);
            int i3 = 85 / 0;
        } else {
            this.write.onActionModeStarted(actionMode);
        }
        int i4 = RemoteActionCompatParcelizer + 1;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = serializer + 23;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write.onAttachedToWindow();
            throw null;
        }
        this.write.onAttachedToWindow();
        int i3 = serializer + 39;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        int i = 2 % 2;
        int i2 = serializer + 123;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write.onContentChanged();
        int i4 = RemoteActionCompatParcelizer + 119;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write.onDetachedFromWindow();
        int i4 = RemoteActionCompatParcelizer + 83;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write.onPointerCaptureChanged(z);
        int i4 = serializer + 75;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write.onWindowAttributesChanged(layoutParams);
        int i4 = serializer + 27;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        MediaSessionCrashGuardWindowCallback mediaSessionCrashGuardWindowCallback = (MediaSessionCrashGuardWindowCallback) objArr[0];
        MotionEvent motionEvent = (MotionEvent) objArr[1];
        int i = 2 % 2;
        int i2 = serializer + 37;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zDispatchTouchEvent = mediaSessionCrashGuardWindowCallback.write.dispatchTouchEvent(motionEvent);
        int i4 = RemoteActionCompatParcelizer + 83;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zDispatchTouchEvent);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        MediaSessionCrashGuardWindowCallback mediaSessionCrashGuardWindowCallback = (MediaSessionCrashGuardWindowCallback) objArr[0];
        AccessibilityEvent accessibilityEvent = (AccessibilityEvent) objArr[1];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            mediaSessionCrashGuardWindowCallback.write.dispatchPopulateAccessibilityEvent(accessibilityEvent);
            throw null;
        }
        boolean zDispatchPopulateAccessibilityEvent = mediaSessionCrashGuardWindowCallback.write.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        int i3 = serializer + 57;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return Boolean.valueOf(zDispatchPopulateAccessibilityEvent);
        }
        int i4 = 30 / 0;
        return Boolean.valueOf(zDispatchPopulateAccessibilityEvent);
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        MediaSessionCrashGuardWindowCallback mediaSessionCrashGuardWindowCallback = (MediaSessionCrashGuardWindowCallback) objArr[0];
        KeyEvent keyEvent = (KeyEvent) objArr[1];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 77;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zDispatchKeyShortcutEvent = mediaSessionCrashGuardWindowCallback.write.dispatchKeyShortcutEvent(keyEvent);
        int i4 = serializer + 63;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return Boolean.valueOf(zDispatchKeyShortcutEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        int i = 2 % 2;
        int i2 = serializer + 29;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            zDispatchGenericMotionEvent = this.write.dispatchGenericMotionEvent(motionEvent);
            int i3 = 99 / 0;
        } else {
            zDispatchGenericMotionEvent = this.write.dispatchGenericMotionEvent(motionEvent);
        }
        int i4 = serializer + 101;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return zDispatchGenericMotionEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        boolean zDispatchTrackballEvent;
        int i = 2 % 2;
        int i2 = serializer + 37;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            zDispatchTrackballEvent = this.write.dispatchTrackballEvent(motionEvent);
            int i3 = 49 / 0;
        } else {
            zDispatchTrackballEvent = this.write.dispatchTrackballEvent(motionEvent);
        }
        int i4 = serializer + 37;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zDispatchTrackballEvent;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 21;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        View viewOnCreatePanelView = this.write.onCreatePanelView(i);
        int i5 = serializer + 1;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return viewOnCreatePanelView;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        int i = 2 % 2;
        int i2 = serializer + 123;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zOnSearchRequested = this.write.onSearchRequested();
        int i4 = RemoteActionCompatParcelizer + 103;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zOnSearchRequested;
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        int i = 2 % 2;
        int i2 = serializer + 19;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ActionMode actionModeOnWindowStartingActionMode = this.write.onWindowStartingActionMode(callback);
        int i4 = serializer + 75;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return actionModeOnWindowStartingActionMode;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        int i = 2 % 2;
        int i2 = serializer + 13;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.write.onSearchRequested(searchEvent);
            throw null;
        }
        boolean zOnSearchRequested = this.write.onSearchRequested(searchEvent);
        int i3 = RemoteActionCompatParcelizer + 75;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return zOnSearchRequested;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 61;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ActionMode actionModeOnWindowStartingActionMode = this.write.onWindowStartingActionMode(callback, i);
        int i5 = serializer + 21;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return actionModeOnWindowStartingActionMode;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        int i2 = 2 % 2;
        int i3 = serializer + 107;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            menu.getClass();
            this.write.onPanelClosed(i, menu);
        } else {
            menu.getClass();
            this.write.onPanelClosed(i, menu);
            throw null;
        }
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 75;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        list.getClass();
        this.write.onProvideKeyboardShortcuts(list, menu, i);
        int i5 = RemoteActionCompatParcelizer + 109;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        int i2 = 2 % 2;
        int i3 = serializer + 49;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            menu.getClass();
            this.write.onCreatePanelMenu(i, menu);
            obj.hashCode();
            throw null;
        }
        menu.getClass();
        boolean zOnCreatePanelMenu = this.write.onCreatePanelMenu(i, menu);
        int i4 = RemoteActionCompatParcelizer + 3;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return zOnCreatePanelMenu;
        }
        throw null;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 47;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        menuItem.getClass();
        boolean zOnMenuItemSelected = this.write.onMenuItemSelected(i, menuItem);
        int i5 = serializer + 79;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return zOnMenuItemSelected;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        int i2 = 2 % 2;
        int i3 = serializer + 25;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            menu.getClass();
            return this.write.onMenuOpened(i, menu);
        }
        menu.getClass();
        this.write.onMenuOpened(i, menu);
        throw null;
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 21;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        menu.getClass();
        boolean zOnPreparePanel = this.write.onPreparePanel(i, view, menu);
        int i5 = serializer + 71;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return zOnPreparePanel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = serializer + 71;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        keyEvent.getClass();
        try {
            boolean zDispatchKeyEvent = this.write.dispatchKeyEvent(keyEvent);
            int i4 = RemoteActionCompatParcelizer + 9;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 62 / 0;
            }
            return zDispatchKeyEvent;
        } catch (UnsupportedOperationException e) {
            if (!IconCompatParcelizer) {
                IconCompatParcelizer = true;
                Timber.RemoteActionCompatParcelizer.write(new MediaSessionManagerDispatchException("OEM PhoneWindow.onKeyDown crashed resolving MediaSessionManager on pre-S Android", e));
            }
            return true;
        }
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        RemoteActionCompatParcelizer(2003550353, setContentIfPresent.read(), setContentIfPresent.read(), setContentIfPresent.read(), objArr, setContentIfPresent.read(), -2003550352);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        int i = setContentIfPresent.read();
        RemoteActionCompatParcelizer(795523049, setContentIfPresent.read(), i, setContentIfPresent.read(), new Object[]{this, actionMode}, setContentIfPresent.read(), -795523049);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i = setContentIfPresent.read();
        return ((Boolean) RemoteActionCompatParcelizer(1415146965, setContentIfPresent.read(), i, setContentIfPresent.read(), new Object[]{this, motionEvent}, setContentIfPresent.read(), -1415146962)).booleanValue();
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i = setContentIfPresent.read();
        return ((Boolean) RemoteActionCompatParcelizer(1303218498, setContentIfPresent.read(), i, setContentIfPresent.read(), new Object[]{this, accessibilityEvent}, setContentIfPresent.read(), -1303218494)).booleanValue();
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        int i = setContentIfPresent.read();
        return ((Boolean) RemoteActionCompatParcelizer(-1086442126, setContentIfPresent.read(), i, setContentIfPresent.read(), new Object[]{this, keyEvent}, setContentIfPresent.read(), 1086442128)).booleanValue();
    }
}
