package com.roadrunner.user.properties.data;

/* JADX INFO: loaded from: classes3.dex */
public final class UserPropertiesDataStoreException extends RuntimeException {
    public UserPropertiesDataStoreException(Throwable th) {
        super("Failed to fetch datastore", th);
    }
}
