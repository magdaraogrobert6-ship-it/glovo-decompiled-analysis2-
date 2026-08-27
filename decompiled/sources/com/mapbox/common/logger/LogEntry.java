package com.mapbox.common.logger;

import bo.app.af$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
public final class LogEntry {
    private final String message;
    private final String tag;
    private final Throwable throwable;

    public final String component1() {
        return this.tag;
    }

    public final String component2() {
        return this.message;
    }

    public final Throwable component3() {
        return this.throwable;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTag() {
        return this.tag;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public LogEntry(String str, String str2, Throwable th) {
        str2.getClass();
        this.tag = str;
        this.message = str2;
        this.throwable = th;
    }

    public static /* synthetic */ LogEntry copy$default(LogEntry logEntry, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = logEntry.tag;
        }
        if ((i & 2) != 0) {
            str2 = logEntry.message;
        }
        if ((i & 4) != 0) {
            th = logEntry.throwable;
        }
        return logEntry.copy(str, str2, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogEntry)) {
            return false;
        }
        LogEntry logEntry = (LogEntry) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tag, logEntry.tag}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, logEntry.message}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.throwable, logEntry.throwable}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "LogEntry(tag=" + this.tag + ", message=" + this.message + ", throwable=" + this.throwable + ')';
    }

    public final LogEntry copy(String str, String str2, Throwable th) {
        str2.getClass();
        return new LogEntry(str, str2, th);
    }

    public int hashCode() {
        String str = this.tag;
        int iM = af$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.message);
        Throwable th = this.throwable;
        return iM + (th != null ? th.hashCode() : 0);
    }
}
