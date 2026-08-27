package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import coil3.Extras$Key;
import java.io.File;
import o.accessgetColorcp;
import o.accessgetDstIncp;
import o.renderUrlIntoViewlambda1;
import o.setSupportButtonTintList;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            accessgetDstIncp.read(context, new setSupportButtonTintList(1), new Extras$Key(8, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    Extras$Key extras$Key = new Extras$Key(8, this);
                    try {
                        accessgetDstIncp.read(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        new renderUrlIntoViewlambda1(10, 7, extras$Key, null).run();
                        return;
                    } catch (PackageManager.NameNotFoundException e) {
                        new renderUrlIntoViewlambda1(7, 7, extras$Key, e).run();
                        return;
                    }
                }
                if ("DELETE_SKIP_FILE".equals(string)) {
                    Extras$Key extras$Key2 = new Extras$Key(8, this);
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    new renderUrlIntoViewlambda1(11, 7, extras$Key2, null).run();
                    return;
                }
                return;
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            setResultCode(12);
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        Extras$Key extras$Key3 = new Extras$Key(8, this);
        if ("DROP_SHADER_CACHE".equals(string2)) {
            accessgetColorcp.write(context, extras$Key3);
        } else if ("SAVE_PROFILE".equals(string2)) {
            Process.sendSignal(extras.getInt("EXTRA_PID", Process.myPid()), 10);
            extras$Key3.IconCompatParcelizer(12, (Object) null);
        } else {
            extras$Key3.IconCompatParcelizer(16, (Object) null);
        }
    }
}
