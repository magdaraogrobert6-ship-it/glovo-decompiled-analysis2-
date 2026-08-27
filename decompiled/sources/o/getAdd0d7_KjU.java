package o;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import bo.app.ah$$ExternalSyntheticLambda0;
import com.google.android.gms.net.zza;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class getAdd0d7_KjU extends Service implements accessisRenderNodeCompatiblecp {
    public static final String IconCompatParcelizer = setRotationX.IconCompatParcelizer("SystemFgService");
    public final androidx.navigation.NavArgsLazy RemoteActionCompatParcelizer = new androidx.navigation.NavArgsLazy(this);
    public IntervalTreeKt read;
    public boolean serializer;
    public NotificationManager write;

    public final void IconCompatParcelizer() {
        androidx.navigation.NavArgsLazy navArgsLazy = this.RemoteActionCompatParcelizer;
        navArgsLazy.getClass();
        navArgsLazy.RemoteActionCompatParcelizer(AndroidColorSpace_androidKt.ON_STOP);
        navArgsLazy.RemoteActionCompatParcelizer(AndroidColorSpace_androidKt.ON_DESTROY);
        super.onDestroy();
    }

    public final void RemoteActionCompatParcelizer() {
        androidx.navigation.NavArgsLazy navArgsLazy = this.RemoteActionCompatParcelizer;
        navArgsLazy.getClass();
        navArgsLazy.RemoteActionCompatParcelizer(AndroidColorSpace_androidKt.ON_CREATE);
        super.onCreate();
    }

    @Override // o.accessisRenderNodeCompatiblecp
    public final supportsColorMatrixQuery getLifecycle() {
        return (accessregisterComponentCallback) this.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem;
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        androidx.navigation.NavArgsLazy navArgsLazy = this.RemoteActionCompatParcelizer;
        navArgsLazy.getClass();
        navArgsLazy.RemoteActionCompatParcelizer(AndroidColorSpace_androidKt.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        androidx.navigation.NavArgsLazy navArgsLazy = this.RemoteActionCompatParcelizer;
        navArgsLazy.getClass();
        navArgsLazy.RemoteActionCompatParcelizer(AndroidColorSpace_androidKt.ON_START);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        RemoteActionCompatParcelizer();
        read();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        IconCompatParcelizer();
        this.read.RemoteActionCompatParcelizer();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = false;
        if (this.serializer) {
            setRotationX.read().getClass();
            this.read.RemoteActionCompatParcelizer();
            read();
            this.serializer = false;
        }
        if (intent == null) {
            return 3;
        }
        IntervalTreeKt intervalTreeKt = this.read;
        intervalTreeKt.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            setRotationX setrotationx = setRotationX.read();
            Objects.toString(intent);
            setrotationx.getClass();
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            accessgetStrokecp accessgetstrokecp = intervalTreeKt.MediaMetadataCompat;
            zza zzaVar = new zza(intervalTreeKt, stringExtra, z, 7);
            accessgetstrokecp.getClass();
            accessgetstrokecp.RemoteActionCompatParcelizer.execute(zzaVar);
            intervalTreeKt.write(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            intervalTreeKt.write(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            setRotationX.read().getClass();
            getAdd0d7_KjU getadd0d7_kju = intervalTreeKt.IconCompatParcelizer;
            if (getadd0d7_kju == null) {
                return 3;
            }
            getadd0d7_kju.serializer = true;
            setRotationX.read().getClass();
            getadd0d7_kju.stopForeground(true);
            getadd0d7_kju.stopSelf(i2);
            return 3;
        }
        setRotationX setrotationx2 = setRotationX.read();
        Objects.toString(intent);
        setrotationx2.getClass();
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        androidx.work.impl.WorkManagerImpl workManagerImpl = intervalTreeKt.MediaBrowserCompatMediaItem;
        UUID uuidFromString = UUID.fromString(stringExtra2);
        workManagerImpl.getClass();
        uuidFromString.getClass();
        getClipannotations getclipannotations = workManagerImpl.write.PlaybackStateCompatCustomAction;
        getDifferencertfAjoo getdifferencertfajoo = workManagerImpl.MediaSessionCompatToken.RemoteActionCompatParcelizer;
        getdifferencertfajoo.getClass();
        setNativeShader.RemoteActionCompatParcelizer(getclipannotations, "CancelWorkById", getdifferencertfajoo, new ah$$ExternalSyntheticLambda0(workManagerImpl, 23, uuidFromString));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.read.RemoteActionCompatParcelizer(i, androidx.compose.ui.graphics.Fields.CameraDistance);
    }

    public final void read() {
        this.write = (NotificationManager) getApplicationContext().getSystemService(RemoteMessageConst.NOTIFICATION);
        IntervalTreeKt intervalTreeKt = new IntervalTreeKt(getApplicationContext());
        this.read = intervalTreeKt;
        if (intervalTreeKt.IconCompatParcelizer != null) {
            setRotationX.read().serializer(IntervalTreeKt.write, "A callback already exists.");
        } else {
            intervalTreeKt.IconCompatParcelizer = this;
        }
    }

    public final void onTimeout(int i, int i2) {
        this.read.RemoteActionCompatParcelizer(i, i2);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
