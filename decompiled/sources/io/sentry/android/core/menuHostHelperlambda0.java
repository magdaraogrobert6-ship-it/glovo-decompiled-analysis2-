package io.sentry.android.core;

import android.net.NetworkCapabilities;
import android.os.Build;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class menuHostHelperlambda0 {
    public final long IconCompatParcelizer;
    public final int MediaDescriptionCompat;
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final int serializer;
    public final boolean write;

    public menuHostHelperlambda0(NetworkCapabilities networkCapabilities, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, long j) {
        setNativeShader.read(networkCapabilities, "NetworkCapabilities is required");
        setNativeShader.read(r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, "BuildInfoProvider is required");
        this.RemoteActionCompatParcelizer = networkCapabilities.getLinkDownstreamBandwidthKbps();
        this.MediaDescriptionCompat = networkCapabilities.getLinkUpstreamBandwidthKbps();
        int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities.getSignalStrength() : 0;
        this.serializer = signalStrength > -100 ? signalStrength : 0;
        this.write = networkCapabilities.hasTransport(4);
        String strWrite = io.sentry.android.core.internal.util.read.write(networkCapabilities);
        this.read = strWrite == null ? "" : strWrite;
        this.IconCompatParcelizer = j;
    }
}
