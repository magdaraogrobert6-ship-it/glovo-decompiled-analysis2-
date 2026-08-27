package io.sentry.android.replay.capture;

import io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import java.util.Date;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class read extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ RemoteActionCompatParcelizer serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ read(Object obj, Object obj2, RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        super(0);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
        this.serializer = remoteActionCompatParcelizer;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.IconCompatParcelizer;
        Object obj = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
        Object obj2 = this.write;
        if (i == 0) {
            io.sentry.android.replay.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = remoteActionCompatParcelizer.write;
            if (mediaBrowserCompatMediaItem != null) {
                mediaBrowserCompatMediaItem.read("replay.id", String.valueOf(obj2));
            }
            return createfromparcel;
        }
        if (i == 1) {
            io.sentry.android.replay.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem2 = remoteActionCompatParcelizer.write;
            if (mediaBrowserCompatMediaItem2 != null) {
                mediaBrowserCompatMediaItem2.read("segment.id", String.valueOf(obj2));
            }
            return createfromparcel;
        }
        if (i == 2) {
            io.sentry.android.replay.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem3 = remoteActionCompatParcelizer.write;
            if (mediaBrowserCompatMediaItem3 != null) {
                mediaBrowserCompatMediaItem3.read("replay.type", String.valueOf(obj2));
            }
            return createfromparcel;
        }
        if (i != 3) {
            if (i != 4) {
                io.sentry.android.replay.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem4 = remoteActionCompatParcelizer.write;
                if (mediaBrowserCompatMediaItem4 != null) {
                    mediaBrowserCompatMediaItem4.read("replay.screen-at-start", String.valueOf(obj2));
                }
                return createfromparcel;
            }
            Date date = (Date) obj2;
            io.sentry.android.replay.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem5 = remoteActionCompatParcelizer.write;
            if (mediaBrowserCompatMediaItem5 != null) {
                mediaBrowserCompatMediaItem5.read("segment.timestamp", date == null ? null : setNativeShader.serializer(date));
            }
            return createfromparcel;
        }
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = (r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) obj2;
        if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg != null) {
            io.sentry.android.replay.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem6 = remoteActionCompatParcelizer.write;
            if (mediaBrowserCompatMediaItem6 != null) {
                mediaBrowserCompatMediaItem6.read("config.height", String.valueOf(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.RemoteActionCompatParcelizer));
            }
            io.sentry.android.replay.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem7 = remoteActionCompatParcelizer.write;
            if (mediaBrowserCompatMediaItem7 != null) {
                mediaBrowserCompatMediaItem7.read("config.width", String.valueOf(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.serializer));
            }
            io.sentry.android.replay.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem8 = remoteActionCompatParcelizer.write;
            if (mediaBrowserCompatMediaItem8 != null) {
                mediaBrowserCompatMediaItem8.read("config.frame-rate", String.valueOf(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.IconCompatParcelizer));
            }
            io.sentry.android.replay.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem9 = remoteActionCompatParcelizer.write;
            if (mediaBrowserCompatMediaItem9 != null) {
                mediaBrowserCompatMediaItem9.read("config.bit-rate", String.valueOf(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.read));
            }
        }
        return createfromparcel;
    }
}
