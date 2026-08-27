package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseRemoteConfigException extends FirebaseException {

    public enum write {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        private final int value;

        public int value() {
            return this.value;
        }

        write(int i) {
            this.value = i;
        }
    }

    public FirebaseRemoteConfigException(String str) {
        super(str);
        write writeVar = write.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Throwable th) {
        super(str, th);
        write writeVar = write.UNKNOWN;
    }
}
