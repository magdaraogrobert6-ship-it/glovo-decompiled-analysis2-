package io.sentry.util.network;

import o.r8lambdadeOzq815xUUwmlLYYvm_QV79QY;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteActionCompatParcelizer {
    public static int MediaBrowserCompatMediaItem;
    public static int MediaMetadataCompat;
    public Long IconCompatParcelizer;
    public Integer MediaSessionCompatQueueItem;
    public r8lambdadeOzq815xUUwmlLYYvm_QV79QY RemoteActionCompatParcelizer;
    public final String read;
    public r8lambdadeOzq815xUUwmlLYYvm_QV79QY serializer;
    public Long write;

    public RemoteActionCompatParcelizer(String str) {
        this.read = str;
    }

    public final String toString() {
        return "NetworkRequestData{method='" + this.read + "', statusCode=" + this.MediaSessionCompatQueueItem + ", requestBodySize=" + this.IconCompatParcelizer + ", responseBodySize=" + this.write + ", request=" + this.serializer + ", response=" + this.RemoteActionCompatParcelizer + '}';
    }

    public static int RemoteActionCompatParcelizer() {
        int i = MediaMetadataCompat;
        int i2 = i % 9210592;
        MediaMetadataCompat = i + 1;
        if (i2 != 0) {
            return MediaBrowserCompatMediaItem;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        MediaBrowserCompatMediaItem = iMaxMemory;
        return iMaxMemory;
    }
}
