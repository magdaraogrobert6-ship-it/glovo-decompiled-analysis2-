package o;

import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class startIntentSenderForResult extends androidx.appcompat.view.WindowCallbackWrapper {
    public boolean IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public boolean read;
    public final /* synthetic */ startActivityForResult serializer;
    public addCloseableactivity write;

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public startIntentSenderForResult(startActivityForResult startactivityforresult, Window.Callback callback) {
        super(callback);
        this.serializer = startactivityforresult;
    }

    public final void IconCompatParcelizer(Window.Callback callback) {
        try {
            this.RemoteActionCompatParcelizer = true;
            callback.onContentChanged();
        } finally {
            this.RemoteActionCompatParcelizer = false;
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof AlertControllerButtonHandler)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        startActivityForResult startactivityforresult = this.serializer;
        androidx.transition.TransitionValuesMaps transitionValuesMaps = new androidx.transition.TransitionValuesMaps(startactivityforresult.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, callback);
        handleOnBackPressed handleonbackpressedIconCompatParcelizer = startactivityforresult.IconCompatParcelizer(transitionValuesMaps);
        if (handleonbackpressedIconCompatParcelizer != null) {
            return transitionValuesMaps.RemoteActionCompatParcelizer(handleonbackpressedIconCompatParcelizer);
        }
        return null;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        AlertControllerButtonHandler alertControllerButtonHandler = this.serializer.write(0).ParcelableVolumeInfo;
        if (alertControllerButtonHandler != null) {
            super.onProvideKeyboardShortcuts(list, alertControllerButtonHandler, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (this.IconCompatParcelizer) {
            return IconCompatParcelizer().dispatchKeyEvent(keyEvent);
        }
        return this.serializer.write(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.RemoteActionCompatParcelizer) {
            IconCompatParcelizer().onContentChanged();
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        View view;
        addCloseableactivity addcloseableactivity = this.write;
        return (addcloseableactivity == null || (view = addcloseableactivity.read(i)) == null) ? super.onCreatePanelView(i) : view;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.read) {
            IconCompatParcelizer().onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        startActivityForResult startactivityforresult = this.serializer;
        if (i == 108) {
            startactivityforresult.serializer();
            onTrimMemory ontrimmemory = startactivityforresult.PlaybackStateCompatCustomAction;
            if (ontrimmemory != null) {
                ontrimmemory.RemoteActionCompatParcelizer(false);
                return;
            }
            return;
        }
        if (i == 0) {
            ComponentDialog componentDialogWrite = startactivityforresult.write(i);
            if (componentDialogWrite.MediaSessionCompatQueueItem) {
                startactivityforresult.IconCompatParcelizer(componentDialogWrite, false);
            }
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        AlertControllerButtonHandler alertControllerButtonHandler = menu instanceof AlertControllerButtonHandler ? (AlertControllerButtonHandler) menu : null;
        if (i == 0 && alertControllerButtonHandler == null) {
            return false;
        }
        if (alertControllerButtonHandler != null) {
            alertControllerButtonHandler.read(true);
        }
        addCloseableactivity addcloseableactivity = this.write;
        if (addcloseableactivity != null) {
            addcloseableactivity.IconCompatParcelizer(i);
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (alertControllerButtonHandler != null) {
            alertControllerButtonHandler.read(false);
        }
        return zOnPreparePanel;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            startActivityForResult startactivityforresult = this.serializer;
            startactivityforresult.serializer();
            onTrimMemory ontrimmemory = startactivityforresult.PlaybackStateCompatCustomAction;
            if (ontrimmemory == null || !ontrimmemory.read(keyCode, keyEvent)) {
                ComponentDialog componentDialog = startactivityforresult.addOnContextAvailableListener;
                if (componentDialog == null || !startactivityforresult.read(componentDialog, keyEvent.getKeyCode(), keyEvent)) {
                    if (startactivityforresult.addOnContextAvailableListener == null) {
                        ComponentDialog componentDialogWrite = startactivityforresult.write(0);
                        startactivityforresult.serializer(componentDialogWrite, keyEvent);
                        boolean z = startactivityforresult.read(componentDialogWrite, keyEvent.getKeyCode(), keyEvent);
                        componentDialogWrite.MediaBrowserCompatMediaItem = false;
                        if (z) {
                        }
                    }
                    return false;
                }
                ComponentDialog componentDialog2 = startactivityforresult.addOnContextAvailableListener;
                if (componentDialog2 != null) {
                    componentDialog2.RatingCompat = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        if (i == 108) {
            startActivityForResult startactivityforresult = this.serializer;
            startactivityforresult.serializer();
            onTrimMemory ontrimmemory = startactivityforresult.PlaybackStateCompatCustomAction;
            if (ontrimmemory != null) {
                ontrimmemory.RemoteActionCompatParcelizer(true);
            }
        }
        return true;
    }
}
