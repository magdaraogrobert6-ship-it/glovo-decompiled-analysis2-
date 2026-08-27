package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;
import kotlin.TuplesKt;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.containsAnyPushPermissionBrazeActions;
import o.getSrcJson;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class IconCompatParcelizer implements containsAnyPushPermissionBrazeActions {
    public final BrazeActionParserExternalSyntheticLambda0 write;
    public long IconCompatParcelizer = 0;
    public long serializer = 0;
    public long RemoteActionCompatParcelizer = 1;
    public long MediaBrowserCompatMediaItem = 1;
    public double MediaDescriptionCompat = 1.0E9d;
    public final File MediaSessionCompatQueueItem = new File("/proc/self/stat");
    public boolean read = false;
    public final Pattern RatingCompat = Pattern.compile("[\n\t\r ]");

    @Override // o.containsAnyPushPermissionBrazeActions
    public final void read() {
        this.read = true;
        this.RemoteActionCompatParcelizer = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.MediaBrowserCompatMediaItem = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.MediaDescriptionCompat = 1.0E9d / this.RemoteActionCompatParcelizer;
        this.serializer = serializer();
    }

    public final long serializer() {
        String strRemoteActionCompatParcelizer;
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = this.write;
        try {
            strRemoteActionCompatParcelizer = TuplesKt.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem);
        } catch (IOException e) {
            this.read = false;
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e);
            strRemoteActionCompatParcelizer = null;
        }
        if (strRemoteActionCompatParcelizer == null) {
            return 0L;
        }
        String[] strArrSplit = this.RatingCompat.split(strRemoteActionCompatParcelizer.trim());
        try {
            return (long) ((Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.MediaDescriptionCompat);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e2) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error parsing /proc/self/stat file.", e2);
            return 0L;
        }
    }

    public IconCompatParcelizer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        setNativeShader.read(brazeActionParserExternalSyntheticLambda0, "Logger is required.");
        this.write = brazeActionParserExternalSyntheticLambda0;
    }

    @Override // o.containsAnyPushPermissionBrazeActions
    public final void serializer(getSrcJson getsrcjson) {
        if (this.read) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = this.IconCompatParcelizer;
            this.IconCompatParcelizer = jElapsedRealtimeNanos;
            long jSerializer = serializer();
            long j2 = this.serializer;
            this.serializer = jSerializer;
            getsrcjson.serializer = Double.valueOf((((jSerializer - j2) / (jElapsedRealtimeNanos - j)) / this.MediaBrowserCompatMediaItem) * 100.0d);
        }
    }
}
