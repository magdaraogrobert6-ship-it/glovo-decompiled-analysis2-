package com.roadrunner.rider.state.polling;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderStatusPollingException extends RuntimeException {
    public RiderStatusPollingException(Throwable th) {
        super("Failed to update state from RiderStatusPollingWorker", th);
    }
}
