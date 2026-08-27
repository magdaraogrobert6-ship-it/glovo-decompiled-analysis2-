package o;

import com.google.firebase.firestore.FirebaseFirestoreException;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class setFrameRateFromParent {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[FirebaseFirestoreException.IconCompatParcelizer.values().length];
        write = iArr;
        try {
            iArr[FirebaseFirestoreException.IconCompatParcelizer.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[FirebaseFirestoreException.IconCompatParcelizer.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            write[FirebaseFirestoreException.IconCompatParcelizer.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            write[FirebaseFirestoreException.IconCompatParcelizer.DEADLINE_EXCEEDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            write[FirebaseFirestoreException.IconCompatParcelizer.RESOURCE_EXHAUSTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            write[FirebaseFirestoreException.IconCompatParcelizer.INTERNAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            write[FirebaseFirestoreException.IconCompatParcelizer.UNAVAILABLE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            write[FirebaseFirestoreException.IconCompatParcelizer.UNAUTHENTICATED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            write[FirebaseFirestoreException.IconCompatParcelizer.INVALID_ARGUMENT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            write[FirebaseFirestoreException.IconCompatParcelizer.NOT_FOUND.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            write[FirebaseFirestoreException.IconCompatParcelizer.ALREADY_EXISTS.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            write[FirebaseFirestoreException.IconCompatParcelizer.PERMISSION_DENIED.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            write[FirebaseFirestoreException.IconCompatParcelizer.FAILED_PRECONDITION.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            write[FirebaseFirestoreException.IconCompatParcelizer.ABORTED.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            write[FirebaseFirestoreException.IconCompatParcelizer.OUT_OF_RANGE.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            write[FirebaseFirestoreException.IconCompatParcelizer.UNIMPLEMENTED.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            write[FirebaseFirestoreException.IconCompatParcelizer.DATA_LOSS.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
    }
}
