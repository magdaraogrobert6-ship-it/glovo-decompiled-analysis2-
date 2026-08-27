package com.google.firebase.firestore;

import android.util.SparseArray;
import com.google.firebase.FirebaseException;
import com.huawei.hms.framework.common.ContainerUtils;
import o.seekAnimationsanimation_core;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseFirestoreException extends FirebaseException {

    public enum IconCompatParcelizer {
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

        private static final SparseArray<IconCompatParcelizer> STATUS_LIST = buildStatusList();
        private final int value;

        public int value() {
            return this.value;
        }

        private static SparseArray<IconCompatParcelizer> buildStatusList() {
            SparseArray<IconCompatParcelizer> sparseArray = new SparseArray<>();
            for (IconCompatParcelizer iconCompatParcelizer : values()) {
                IconCompatParcelizer iconCompatParcelizer2 = sparseArray.get(iconCompatParcelizer.value());
                if (iconCompatParcelizer2 != null) {
                    StringBuilder sb = new StringBuilder("Code value duplication between ");
                    sb.append(iconCompatParcelizer2);
                    seekAnimationsanimation_core.IconCompatParcelizer(sb, ContainerUtils.FIELD_DELIMITER, iconCompatParcelizer.name());
                    return null;
                }
                sparseArray.put(iconCompatParcelizer.value(), iconCompatParcelizer);
            }
            return sparseArray;
        }

        public static IconCompatParcelizer fromValue(int i) {
            return STATUS_LIST.get(i, UNKNOWN);
        }

        IconCompatParcelizer(int i) {
            this.value = i;
        }
    }

    public FirebaseFirestoreException(String str, Throwable th) {
        super(str, th);
    }

    public FirebaseFirestoreException(String str) {
        super(str);
    }
}
