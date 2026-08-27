package io.sentry.util.thread;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer implements IconCompatParcelizer {
    public static final long RemoteActionCompatParcelizer = Thread.currentThread().getId();
    public static final serializer write = new serializer();

    public static serializer RemoteActionCompatParcelizer() {
        return write;
    }

    @Override // io.sentry.util.thread.IconCompatParcelizer
    public final boolean IconCompatParcelizer() {
        return RemoteActionCompatParcelizer == Thread.currentThread().getId();
    }

    @Override // io.sentry.util.thread.IconCompatParcelizer
    public final long read() {
        return Thread.currentThread().getId();
    }

    @Override // io.sentry.util.thread.IconCompatParcelizer
    public final String serializer() {
        return Thread.currentThread().getName();
    }
}
