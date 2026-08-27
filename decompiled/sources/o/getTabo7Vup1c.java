package o;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;

/* JADX INFO: loaded from: classes5.dex */
public final class getTabo7Vup1c extends IntentService {
    public getTabo7Vup1c() {
        super("PhoenixService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        Intent intent2;
        if (intent == null) {
            return;
        }
        Process.killProcess(intent.getIntExtra("phoenix_main_process_pid", -1));
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            intent2 = (Intent) intent.getParcelableExtra("phoenix_restart_intent", Intent.class);
        } else {
            intent2 = (Intent) intent.getParcelableExtra("phoenix_restart_intent");
        }
        if (i > 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).permitUnsafeIntentLaunch().build());
        }
        startForegroundService(intent2);
        Runtime.getRuntime().exit(0);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
