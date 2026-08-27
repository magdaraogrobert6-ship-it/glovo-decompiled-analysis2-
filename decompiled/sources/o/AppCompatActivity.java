package o;

import android.content.DialogInterface;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class AppCompatActivity implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, getDrawerToggleDelegate {
    public register RemoteActionCompatParcelizer;
    public onNightModeChanged read;
    public removeOnContextAvailableListener write;

    @Override // o.getDrawerToggleDelegate
    public final boolean read(AlertControllerButtonHandler alertControllerButtonHandler) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.read.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer().getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer((AlertControllerButtonHandler) this.read, true);
    }

    @Override // o.getDrawerToggleDelegate
    public final void read(AlertControllerButtonHandler alertControllerButtonHandler, boolean z) {
        removeOnContextAvailableListener removeoncontextavailablelistener;
        if ((z || alertControllerButtonHandler == this.read) && (removeoncontextavailablelistener = this.write) != null) {
            removeoncontextavailablelistener.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
        Window window;
        View decorView;
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        android.view.KeyEvent.DispatcherState keyDispatcherState2;
        onNightModeChanged onnightmodechanged = this.read;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.write.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.write.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                onnightmodechanged.RemoteActionCompatParcelizer(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return onnightmodechanged.performShortcut(i, keyEvent, 0);
    }
}
