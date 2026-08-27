package com.mapbox.maps.exception;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkerThreadException extends RuntimeException {
    public WorkerThreadException() {
        super("The exception that is thrown when an application attempts to \nperform a map operation on a worker thread.");
    }
}
