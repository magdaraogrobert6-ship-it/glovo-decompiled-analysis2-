package io.sentry.android.replay;

import io.sentry.SentryOptions;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final class RatingCompat extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ MediaBrowserCompatMediaItem RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RatingCompat(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, int i) {
        super(0);
        this.read = i;
        this.RemoteActionCompatParcelizer = mediaBrowserCompatMediaItem;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws IOException {
        int i = this.read;
        MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = this.RemoteActionCompatParcelizer;
        File file = null;
        if (i != 0) {
            if (mediaBrowserCompatMediaItem.IconCompatParcelizer() != null) {
                file = new File(mediaBrowserCompatMediaItem.IconCompatParcelizer(), ".ongoing_segment");
                if (!file.exists()) {
                    file.createNewFile();
                }
            }
            return file;
        }
        SentryOptions sentryOptions = mediaBrowserCompatMediaItem.RatingCompat;
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = mediaBrowserCompatMediaItem.PlaybackStateCompatCustomAction;
        sentryOptions.getClass();
        r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.getClass();
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath == null || cacheDirPath.length() == 0) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
            return null;
        }
        String cacheDirPath2 = sentryOptions.getCacheDirPath();
        cacheDirPath2.getClass();
        File file2 = new File(cacheDirPath2, "replay_" + r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
        file2.mkdirs();
        return file2;
    }
}
