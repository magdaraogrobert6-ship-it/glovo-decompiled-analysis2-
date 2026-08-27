package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes2.dex */
public class ApiException extends Exception {

    @Deprecated
    protected final Status read;

    public Status getStatus() {
        return this.read;
    }

    public ApiException(Status status) {
        int i = status.MediaBrowserCompatMediaItem;
        String str = status.RatingCompat;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.read = status;
    }

    public int getStatusCode() {
        return this.read.MediaBrowserCompatMediaItem;
    }

    @Deprecated
    public String getStatusMessage() {
        return this.read.RatingCompat;
    }
}
