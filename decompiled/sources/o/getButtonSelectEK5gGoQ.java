package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class getButtonSelectEK5gGoQ implements DialogInterface.OnClickListener {
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final Object write;

    public getButtonSelectEK5gGoQ(getPrompt getprompt) {
        this.write = new java.lang.ref.WeakReference(getprompt);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.IconCompatParcelizer;
        Object obj = this.write;
        if (i2 != 0) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj;
            if (weakReference.get() != null) {
                ((getPrompt) weakReference.get()).write(true);
                return;
            }
            return;
        }
        Context context = (Context) ((androidx.transition.TransitionValuesMaps) obj).MediaBrowserCompatMediaItem;
        String packageName = context.getPackageName();
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage == null) {
            getButtonThumbLeftEK5gGoQ.serializer("No launch activity found for package name: ".concat(String.valueOf(packageName)));
            return;
        }
        "Invoke the launch activity for package name: ".concat(String.valueOf(packageName));
        int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        ((Boolean) Options.Companion.read(iWrite, 1921293490, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{4}, iWrite3, -1921293486)).booleanValue();
        context.startActivity(launchIntentForPackage);
    }

    public getButtonSelectEK5gGoQ(androidx.transition.TransitionValuesMaps transitionValuesMaps) {
        this.write = transitionValuesMaps;
    }
}
