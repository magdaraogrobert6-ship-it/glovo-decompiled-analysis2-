package o;

import io.grpc.Status;

/* JADX INFO: loaded from: classes4.dex */
public enum invokeMethodQuietly {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);

    private final int value;
    private final byte[] valueAscii;

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] valueAscii() {
        return this.valueAscii;
    }

    public int value() {
        return this.value;
    }

    public Status toStatus() {
        return (Status) Status.MediaDescriptionCompat.get(this.value);
    }

    invokeMethodQuietly(int i) {
        this.value = i;
        this.valueAscii = Integer.toString(i).getBytes(visitSelfAndChildrenYYKmhodefault.read);
    }
}
