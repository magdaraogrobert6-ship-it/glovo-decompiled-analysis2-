package com.huawei.hms.support.api.client;

import android.os.Process;
import com.huawei.hms.common.api.OptionalPendingResult;
import com.huawei.hms.common.api.internal.OptionalPendingResultImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class PendingResultsCreator {

    /* JADX INFO: loaded from: classes4.dex */
    public static class DiscardedPendingResult<R extends Result> extends EmptyPendingResult {
        @Override // com.huawei.hms.support.api.client.EmptyPendingResult, com.huawei.hms.support.api.client.PendingResult
        public boolean isCanceled() {
            return true;
        }

        public DiscardedPendingResult(R r) {
            setResult(r);
        }

        public DiscardedPendingResult() {
        }
    }

    public static class InstantPendingResult<R extends Result> extends EmptyPendingResult {
        public static int read;
        public static int serializer;

        public InstantPendingResult(R r) {
            setResult(r);
        }

        @Override // com.huawei.hms.support.api.client.EmptyPendingResult, com.huawei.hms.support.api.client.PendingResult
        public void cancel() {
            throw new IllegalStateException("cancel() is not available.");
        }

        @Override // com.huawei.hms.support.api.client.EmptyPendingResult, com.huawei.hms.support.api.client.PendingResult
        public void setResultCallback(ResultCallback resultCallback) {
            resultCallback.onResult(getResult());
        }

        public static int serializer() {
            int i = serializer;
            int i2 = i % 7547401;
            serializer = i + 1;
            if (i2 != 0) {
                return read;
            }
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            read = startUptimeMillis;
            return startUptimeMillis;
        }
    }

    public static PendingResult<Status> discardedPendingResult() {
        return new DiscardedPendingResult();
    }

    public static <R extends Result> OptionalPendingResult<R> instantPendingResult(R r) {
        return new OptionalPendingResultImpl(new InstantPendingResult(r));
    }

    public static <R extends Result> PendingResult<R> discardedPendingResult(R r) {
        return new DiscardedPendingResult(r);
    }

    public static PendingResult<Status> instantPendingResult(Status status) {
        return new InstantPendingResult(status);
    }
}
