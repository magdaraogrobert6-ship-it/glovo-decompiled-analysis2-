package io.sentry.android.replay.gestures;

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
import io.sentry.SentryOptions;
import io.sentry.android.replay.PlaybackStateCompat;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.RemoteActionCompatParcelizer;
import io.sentry.android.replay.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
import java.util.List;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class GestureRecorder$SentryReplayGestureRecorder implements Window.Callback {
    public final Window.Callback IconCompatParcelizer;
    public final ReplayIntegration read;
    public final SentryOptions serializer;

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        if (motionEvent != null) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            motionEventObtainNoHistory.getClass();
            try {
                ReplayIntegration replayIntegration = this.read;
                if (replayIntegration.RatingCompat.get()) {
                    PlaybackStateCompat playbackStateCompat = replayIntegration.MediaBrowserCompatMediaItem;
                    if ((playbackStateCompat.serializer == r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.STARTED || playbackStateCompat.serializer == r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RESUMED) && (remoteActionCompatParcelizer = replayIntegration.serializer) != null) {
                        remoteActionCompatParcelizer.IconCompatParcelizer(motionEventObtainNoHistory);
                    }
                }
            } catch (Throwable th) {
                try {
                    this.serializer.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error dispatching touch event", th);
                } finally {
                    motionEventObtainNoHistory.recycle();
                }
            }
        }
        return write(motionEvent);
    }

    public GestureRecorder$SentryReplayGestureRecorder(SentryOptions sentryOptions, ReplayIntegration replayIntegration, Window.Callback callback) {
        this.IconCompatParcelizer = callback;
        this.serializer = sentryOptions;
        this.read = replayIntegration;
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return;
        }
        callback.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return;
        }
        callback.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return;
        }
        callback.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return;
        }
        callback.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return;
        }
        callback.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return;
        }
        callback.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return;
        }
        callback.onPointerCaptureChanged(z);
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return;
        }
        callback.onProvideKeyboardShortcuts(list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return;
        }
        callback.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return;
        }
        callback.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return false;
        }
        return callback.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return false;
        }
        return callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return false;
        }
        return callback.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return false;
        }
        return callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return false;
        }
        return callback.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return false;
        }
        return callback.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return null;
        }
        return callback.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return false;
        }
        return callback.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return false;
        }
        return callback.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return false;
        }
        return callback.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return false;
        }
        return callback.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Window.Callback callback2 = this.IconCompatParcelizer;
        if (callback2 == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback);
    }

    public final boolean write(MotionEvent motionEvent) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return false;
        }
        return callback.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        Window.Callback callback = this.IconCompatParcelizer;
        if (callback == null) {
            return false;
        }
        return callback.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        Window.Callback callback2 = this.IconCompatParcelizer;
        if (callback2 == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback, i);
    }
}
