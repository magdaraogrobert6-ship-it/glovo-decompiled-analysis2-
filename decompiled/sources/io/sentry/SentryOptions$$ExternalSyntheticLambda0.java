package io.sentry;

import io.sentry.util.MediaBrowserCompatMediaItem;
import io.sentry.util.MediaSessionCompatQueueItem;
import o.r8lambdaH5l_ymlFq0FHUQBKDVU4UffieY;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class SentryOptions$$ExternalSyntheticLambda0 implements MediaSessionCompatQueueItem {
    public final /* synthetic */ int read;
    public final /* synthetic */ SentryOptions serializer;

    public /* synthetic */ SentryOptions$$ExternalSyntheticLambda0(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, SentryOptions sentryOptions) {
        this.read = 3;
        this.serializer = sentryOptions;
    }

    @Override // io.sentry.util.MediaSessionCompatQueueItem
    public final Object evaluate() {
        int i = this.read;
        SentryOptions sentryOptions = this.serializer;
        if (i == 0) {
            return SentryOptions.m5139$r8$lambda$pmuKZ2G5LzrlDjCWKqlIVz6G9U(sentryOptions);
        }
        if (i != 1) {
            return i != 2 ? Boolean.valueOf(MediaBrowserCompatMediaItem.IconCompatParcelizer(sentryOptions, "androidx.core.view.ScrollingView")) : SentryOptions.$r8$lambda$qgEBEc4URCRJvlkRDkEMRKtofys(sentryOptions);
        }
        return new r8lambdaH5l_ymlFq0FHUQBKDVU4UffieY(sentryOptions);
    }

    public /* synthetic */ SentryOptions$$ExternalSyntheticLambda0(SentryOptions sentryOptions, int i) {
        this.read = i;
        this.serializer = sentryOptions;
    }
}
