package com.roadrunner.logger.api.critical;

import androidx.compose.ui.graphics.Fields;
import java.util.Map;
import o.executeAsList;

/* JADX INFO: loaded from: classes3.dex */
public final class CriticalObservabilityException extends Exception {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final String IconCompatParcelizer;
    public final executeAsList RemoteActionCompatParcelizer;
    public final Map read;
    public final Exception serializer;
    public final String write;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 97;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Exception exc = this.serializer;
        int i4 = i2 + 69;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return exc;
        }
        obj.hashCode();
        throw null;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 1;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.IconCompatParcelizer;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CriticalObservabilityException(String str, executeAsList executeaslist, Map map, String str2, Exception exc) {
        super(str2, exc);
        executeaslist.getClass();
        this.write = str;
        this.RemoteActionCompatParcelizer = executeaslist;
        this.read = map;
        this.IconCompatParcelizer = str2;
        this.serializer = exc;
    }
}
