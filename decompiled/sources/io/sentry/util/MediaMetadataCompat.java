package io.sentry.util;

import o.UriActionExternalSyntheticLambda4;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaMetadataCompat {
    public final MediaSessionCompatQueueItem serializer;
    public volatile Object write = null;
    public final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer();

    public final void IconCompatParcelizer(Object obj) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.IconCompatParcelizer.serializer();
        try {
            this.write = obj;
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.IconCompatParcelizer.serializer();
        try {
            this.write = null;
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public MediaMetadataCompat(MediaSessionCompatQueueItem mediaSessionCompatQueueItem) {
        this.serializer = mediaSessionCompatQueueItem;
    }

    public final Object IconCompatParcelizer() {
        if (this.write == null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.IconCompatParcelizer.serializer();
            try {
                if (this.write == null) {
                    this.write = this.serializer.evaluate();
                }
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this.write;
    }
}
