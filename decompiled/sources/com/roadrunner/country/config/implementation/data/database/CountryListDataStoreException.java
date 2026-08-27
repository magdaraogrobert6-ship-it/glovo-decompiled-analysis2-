package com.roadrunner.country.config.implementation.data.database;

/* JADX INFO: loaded from: classes3.dex */
public final class CountryListDataStoreException extends RuntimeException {
    public CountryListDataStoreException(Throwable th) {
        super("Failed to fetch datastore for country list", th);
    }
}
