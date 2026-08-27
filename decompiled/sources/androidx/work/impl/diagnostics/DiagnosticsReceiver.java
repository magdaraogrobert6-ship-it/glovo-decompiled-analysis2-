package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.workers.DiagnosticsWorker;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.setRotationX;

/* JADX INFO: loaded from: classes4.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String IconCompatParcelizer = setRotationX.IconCompatParcelizer("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        setRotationX.read().getClass();
        try {
            context.getClass();
            WorkManagerImpl.RemoteActionCompatParcelizer(context).RemoteActionCompatParcelizer(new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(DiagnosticsWorker.class).RemoteActionCompatParcelizer());
        } catch (IllegalStateException e) {
            setRotationX.read().IconCompatParcelizer(IconCompatParcelizer, "WorkManager is not initialized", e);
        }
    }
}
