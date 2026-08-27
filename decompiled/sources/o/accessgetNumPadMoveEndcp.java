package o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.api.internal.zza;
import com.google.android.gms.common.api.internal.zzd;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetNumPadMoveEndcp {
    public final accessgetNumPadLeftParenthesiscp read;

    public void IconCompatParcelizer() {
    }

    public void RemoteActionCompatParcelizer() {
    }

    public void RemoteActionCompatParcelizer(Bundle bundle) {
    }

    public abstract void read();

    public void read(int i, int i2, Intent intent) {
    }

    public void serializer() {
    }

    public void write(Bundle bundle) {
    }

    public static accessgetNumPadLeftParenthesiscp read(Activity activity) {
        getExponentimpl getexponentimpl = new getExponentimpl(activity);
        if (((Activity) getexponentimpl.read) instanceof androidx.fragment.app.FragmentActivity) {
            return zzd.serializer((androidx.fragment.app.FragmentActivity) ((Activity) getexponentimpl.read));
        }
        if (((Activity) getexponentimpl.read) != null) {
            return zza.IconCompatParcelizer((Activity) getexponentimpl.read);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Can't get fragment for unexpected activity.");
        return null;
    }

    public final Activity write() {
        Activity activityMediaBrowserCompatMediaItem = this.read.MediaBrowserCompatMediaItem();
        accessgetSystemNavigationDowncp.IconCompatParcelizer(activityMediaBrowserCompatMediaItem);
        return activityMediaBrowserCompatMediaItem;
    }

    public accessgetNumPadMoveEndcp(accessgetNumPadLeftParenthesiscp accessgetnumpadleftparenthesiscp) {
        this.read = accessgetnumpadleftparenthesiscp;
    }
}
