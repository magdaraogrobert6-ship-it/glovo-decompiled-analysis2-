package o;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zap;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetNumPadPageDowncp extends zap {
    public final GoogleApiManager IconCompatParcelizer;
    public final createnHHXs2Y serializer;

    @Override // com.google.android.gms.common.api.internal.zap, o.accessgetNumPadMoveEndcp
    public final void read() {
        this.write = false;
        GoogleApiManager googleApiManager = this.IconCompatParcelizer;
        googleApiManager.getClass();
        synchronized (GoogleApiManager.write) {
            if (googleApiManager.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == this) {
                googleApiManager.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
                googleApiManager.ResultReceiver.clear();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, o.accessgetNumPadMoveEndcp
    public final void serializer() {
        this.write = true;
        if (this.serializer.isEmpty()) {
            return;
        }
        this.IconCompatParcelizer.write(this);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void MediaBrowserCompatMediaItem() {
        getBackEK5gGoQ getbackek5ggoq = this.IconCompatParcelizer.ComponentActivity;
        getbackek5ggoq.sendMessage(getbackek5ggoq.obtainMessage(3));
    }

    @Override // o.accessgetNumPadMoveEndcp
    public final void RemoteActionCompatParcelizer() {
        if (this.serializer.isEmpty()) {
            return;
        }
        this.IconCompatParcelizer.write(this);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void read(ConnectionResult connectionResult, int i) {
        this.IconCompatParcelizer.IconCompatParcelizer(connectionResult, i);
    }

    public accessgetNumPadPageDowncp(accessgetNumPadLeftParenthesiscp accessgetnumpadleftparenthesiscp, GoogleApiManager googleApiManager, GoogleApiAvailability googleApiAvailability) {
        super(accessgetnumpadleftparenthesiscp, googleApiAvailability);
        this.serializer = new createnHHXs2Y(0);
        this.IconCompatParcelizer = googleApiManager;
        accessgetnumpadleftparenthesiscp.serializer("ConnectionlessLifecycleHelper", this);
    }
}
