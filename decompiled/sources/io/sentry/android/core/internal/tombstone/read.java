package io.sentry.android.core.internal.tombstone;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.dataAvailable;
import o.decodeByte;
import o.ifDebug;

/* JADX INFO: loaded from: classes4.dex */
public enum read implements ifDebug {
    ARM32(0),
    ARM64(1),
    X86(2),
    X86_64(3),
    RISCV64(4),
    NONE(5),
    UNRECOGNIZED(-1);

    public static final int ARM32_VALUE = 0;
    public static final int ARM64_VALUE = 1;
    public static final int NONE_VALUE = 5;
    public static final int RISCV64_VALUE = 4;
    public static final int X86_64_VALUE = 3;
    public static final int X86_VALUE = 2;
    private static final dataAvailable internalValueMap = new dataAvailable() { // from class: io.sentry.android.core.internal.tombstone.serializer
        @Override // o.dataAvailable
        public final ifDebug IconCompatParcelizer(int i) {
            return read.forNumber(i);
        }
    };
    private final int value;

    public static dataAvailable internalGetValueMap() {
        return internalValueMap;
    }

    public static decodeByte internalGetVerifier() {
        return MediaSessionCompatQueueItem.write;
    }

    read(int i) {
        this.value = i;
    }

    @Override // o.ifDebug
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static read valueOf(int i) {
        return forNumber(i);
    }

    public static read forNumber(int i) {
        if (i == 0) {
            return ARM32;
        }
        if (i == 1) {
            return ARM64;
        }
        if (i == 2) {
            return X86;
        }
        if (i == 3) {
            return X86_64;
        }
        if (i == 4) {
            return RISCV64;
        }
        if (i != 5) {
            return null;
        }
        return NONE;
    }
}
