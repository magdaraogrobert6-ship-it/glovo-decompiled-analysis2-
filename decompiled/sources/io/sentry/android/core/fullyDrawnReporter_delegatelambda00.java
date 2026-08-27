package io.sentry.android.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import o.accessgetDismissSubscriberp;
import o.executelambda4;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.getOnDismissCallback;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class fullyDrawnReporter_delegatelambda00 extends ConnectivityManager.NetworkCallback {
    public final getOnDismissCallback RemoteActionCompatParcelizer;
    public final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ write;
    public NetworkCapabilities read = null;
    public long IconCompatParcelizer = 0;
    public final accessgetDismissSubscriberp serializer = accessgetDismissSubscriberp.IconCompatParcelizer;

    public static getIntentArrayWithConfiguredBackStacklambda1 write(String str) {
        getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = new getIntentArrayWithConfiguredBackStacklambda1();
        getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem = "system";
        getintentarraywithconfiguredbackstacklambda1.write = "network.event";
        getintentarraywithconfiguredbackstacklambda1.read(str, "action");
        getintentarraywithconfiguredbackstacklambda1.read = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO;
        return getintentarraywithconfiguredbackstacklambda1;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.serializer.read(write("NETWORK_AVAILABLE"));
        this.read = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.serializer.read(write("NETWORK_LOST"));
        this.read = null;
    }

    public fullyDrawnReporter_delegatelambda00(r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, getOnDismissCallback getondismisscallback) {
        setNativeShader.read(r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, "BuildInfoProvider is required");
        this.write = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
        setNativeShader.read(getondismisscallback, "SentryDateProvider is required");
        this.RemoteActionCompatParcelizer = getondismisscallback;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        menuHostHelperlambda0 menuhosthelperlambda0;
        long j = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().read();
        NetworkCapabilities networkCapabilities2 = this.read;
        long j2 = this.IconCompatParcelizer;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = this.write;
        if (networkCapabilities2 == null) {
            menuhosthelperlambda0 = new menuHostHelperlambda0(networkCapabilities, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, j);
        } else {
            menuHostHelperlambda0 menuhosthelperlambda1 = new menuHostHelperlambda0(networkCapabilities2, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, j2);
            menuhosthelperlambda0 = new menuHostHelperlambda0(networkCapabilities, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, j);
            int iAbs = Math.abs(menuhosthelperlambda1.serializer - menuhosthelperlambda0.serializer);
            int i = menuhosthelperlambda0.RemoteActionCompatParcelizer;
            int i2 = menuhosthelperlambda1.RemoteActionCompatParcelizer;
            int iAbs2 = Math.abs(i2 - i);
            int i3 = menuhosthelperlambda0.MediaDescriptionCompat;
            int i4 = menuhosthelperlambda1.MediaDescriptionCompat;
            int iAbs3 = Math.abs(i4 - i3);
            boolean z = ((double) Math.abs(menuhosthelperlambda1.IconCompatParcelizer - menuhosthelperlambda0.IconCompatParcelizer)) / 1000000.0d < 5000.0d;
            boolean z2 = z || iAbs <= 5;
            boolean z3 = z || ((double) iAbs2) <= Math.max(1000.0d, ((double) Math.abs(i2)) * 0.1d);
            boolean z4 = z || ((double) iAbs3) <= Math.max(1000.0d, ((double) Math.abs(i4)) * 0.1d);
            if (menuhosthelperlambda1.write == menuhosthelperlambda0.write && menuhosthelperlambda1.read.equals(menuhosthelperlambda0.read) && z2 && z3 && z4) {
                menuhosthelperlambda0 = null;
            }
        }
        if (menuhosthelperlambda0 == null) {
            return;
        }
        this.read = networkCapabilities;
        this.IconCompatParcelizer = j;
        getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1Write = write("NETWORK_CAPABILITIES_CHANGED");
        getintentarraywithconfiguredbackstacklambda1Write.read(Integer.valueOf(menuhosthelperlambda0.RemoteActionCompatParcelizer), "download_bandwidth");
        getintentarraywithconfiguredbackstacklambda1Write.read(Integer.valueOf(menuhosthelperlambda0.MediaDescriptionCompat), "upload_bandwidth");
        getintentarraywithconfiguredbackstacklambda1Write.read(Boolean.valueOf(menuhosthelperlambda0.write), "vpn_active");
        getintentarraywithconfiguredbackstacklambda1Write.read(menuhosthelperlambda0.read, "network_type");
        int i5 = menuhosthelperlambda0.serializer;
        if (i5 != 0) {
            getintentarraywithconfiguredbackstacklambda1Write.read(Integer.valueOf(i5), "signal_strength");
        }
        executelambda4 executelambda4Var = new executelambda4();
        executelambda4Var.RemoteActionCompatParcelizer("android:networkCapabilities", menuhosthelperlambda0);
        this.serializer.IconCompatParcelizer(getintentarraywithconfiguredbackstacklambda1Write, executelambda4Var);
    }
}
