package o;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class accessdrawArcjd extends Service {
    public int write;
    public final LinkedHashMap read = new LinkedHashMap();
    public final accessskewRadjd RemoteActionCompatParcelizer = new accessskewRadjd(this);
    public final accessdrawRectjd IconCompatParcelizer = new accessdrawRectjd(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.IconCompatParcelizer;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
