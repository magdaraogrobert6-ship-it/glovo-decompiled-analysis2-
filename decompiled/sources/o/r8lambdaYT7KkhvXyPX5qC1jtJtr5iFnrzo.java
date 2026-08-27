package o;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import com.huawei.hmf.tasks.a.d$a;
import io.sentry.SentryClient;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaYT7KkhvXyPX5qC1jtJtr5iFnrzo extends wouldPushPermissionPromptDisplaylambda2 {
    public final Object IconCompatParcelizer = new Object();
    public final ConnectivityManager RemoteActionCompatParcelizer;
    public final wouldPushPermissionPromptDisplaylambda2 read;
    public final Context serializer;
    public Runnable write;

    @Override // o.wouldPushPermissionPromptDisplaylambda2
    public final setResourcePackageNamelambda0 IconCompatParcelizer() {
        return this.read.IconCompatParcelizer();
    }

    @Override // o.wouldPushPermissionPromptDisplaylambda2
    public final void IconCompatParcelizer(setResourcePackageNamelambda0 setresourcepackagenamelambda0, getFontLoaderannotations getfontloaderannotations) {
        this.read.IconCompatParcelizer(setresourcepackagenamelambda0, getfontloaderannotations);
    }

    @Override // o.wouldPushPermissionPromptDisplaylambda2
    public final wouldPushPermissionPromptDisplaylambda2 RemoteActionCompatParcelizer() {
        synchronized (this.IconCompatParcelizer) {
            Runnable runnable = this.write;
            if (runnable != null) {
                runnable.run();
                this.write = null;
            }
        }
        return this.read.RemoteActionCompatParcelizer();
    }

    @Override // o.parseJsonObjectIntoBundlelambda0
    public final JsonUtilsa read(SentryClient sentryClient, mergeJsonObjectslambda10 mergejsonobjectslambda10) {
        return this.read.read(sentryClient, mergejsonobjectslambda10);
    }

    @Override // o.wouldPushPermissionPromptDisplaylambda2
    public final void serializer() {
        this.read.serializer();
    }

    @Override // o.parseJsonObjectIntoBundlelambda0
    public final String write() {
        return this.read.write();
    }

    public r8lambdaYT7KkhvXyPX5qC1jtJtr5iFnrzo(wouldPushPermissionPromptDisplaylambda2 wouldpushpermissionpromptdisplaylambda2, Context context) {
        this.read = wouldpushpermissionpromptdisplaylambda2;
        this.serializer = context;
        if (context == null) {
            this.RemoteActionCompatParcelizer = null;
            return;
        }
        this.RemoteActionCompatParcelizer = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            read();
        } catch (SecurityException e) {
            SentryLogcatAdapter.write("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e);
        }
    }

    public final void read() {
        ConnectivityManager connectivityManager = this.RemoteActionCompatParcelizer;
        if (connectivityManager != null) {
            int i = 4;
            findOverlaps findoverlaps = new findOverlaps(i, this);
            connectivityManager.registerDefaultNetworkCallback(findoverlaps);
            this.write = new d$a(this, i, findoverlaps);
            return;
        }
        countOccurrences countoccurrences = new countOccurrences(0, this);
        this.serializer.registerReceiver(countoccurrences, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.write = new d$a(this, 5, countoccurrences);
    }
}
