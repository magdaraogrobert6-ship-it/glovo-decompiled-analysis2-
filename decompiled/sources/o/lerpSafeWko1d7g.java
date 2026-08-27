package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class lerpSafeWko1d7g implements ServiceConnection {
    public final /* synthetic */ androidx.room.MultiInstanceInvalidationClient serializer;

    public lerpSafeWko1d7g(androidx.room.MultiInstanceInvalidationClient multiInstanceInvalidationClient) {
        this.serializer = multiInstanceInvalidationClient;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        toShaderBrush toshaderbrush;
        componentName.getClass();
        iBinder.getClass();
        int i = accessdrawRectjd.read;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(toShaderBrush.write);
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof toShaderBrush)) {
            accessclipRectmtrdDEjd accesscliprectmtrddejd = new accessclipRectmtrdDEjd();
            accesscliprectmtrddejd.RemoteActionCompatParcelizer = iBinder;
            toshaderbrush = accesscliprectmtrddejd;
        } else {
            toshaderbrush = (toShaderBrush) iInterfaceQueryLocalInterface;
        }
        androidx.room.MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.serializer;
        multiInstanceInvalidationClient.RatingCompat = toshaderbrush;
        try {
            multiInstanceInvalidationClient.write = toshaderbrush.serializer(multiInstanceInvalidationClient.IconCompatParcelizer, multiInstanceInvalidationClient.MediaBrowserCompatMediaItem);
        } catch (RemoteException e) {
            SentryLogcatAdapter.write("ROOM", "Cannot register multi-instance invalidation callback", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        this.serializer.RatingCompat = null;
    }
}
