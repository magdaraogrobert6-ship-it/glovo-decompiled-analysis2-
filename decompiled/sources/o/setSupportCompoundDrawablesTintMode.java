package o;

import android.view.MenuItem;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class setSupportCompoundDrawablesTintMode implements setSupportProgressBarVisibility, IntentSenderRequest {
    public final /* synthetic */ androidx.appcompat.widget.Toolbar RemoteActionCompatParcelizer;

    @Override // o.IntentSenderRequest
    public boolean read(AlertControllerButtonHandler alertControllerButtonHandler, MenuItem menuItem) {
        return false;
    }

    public /* synthetic */ setSupportCompoundDrawablesTintMode(androidx.appcompat.widget.Toolbar toolbar) {
        this.RemoteActionCompatParcelizer = toolbar;
    }

    @Override // o.IntentSenderRequest
    public void write(AlertControllerButtonHandler alertControllerButtonHandler) {
        androidx.appcompat.widget.Toolbar toolbar = this.RemoteActionCompatParcelizer;
        onSupportActionModeStarted onsupportactionmodestarted = toolbar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.PlaybackStateCompatCustomAction;
        if (onsupportactionmodestarted == null || !onsupportactionmodestarted.write()) {
            Iterator it = toolbar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.write.iterator();
            while (it.hasNext()) {
                ((getMinDimensionannotations) ((getUnsetFocusRect) it.next())).write.RemoteActionCompatParcelizer(alertControllerButtonHandler);
            }
        }
        addCloseableactivity addcloseableactivity = toolbar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (addcloseableactivity != null) {
            addcloseableactivity.write(alertControllerButtonHandler);
        }
    }
}
