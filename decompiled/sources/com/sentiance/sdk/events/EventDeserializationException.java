package com.sentiance.sdk.events;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.SdkException;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class EventDeserializationException extends SdkException {
    public EventDeserializationException(String str) {
        super(str);
    }

    public EventDeserializationException(String str, Throwable th) {
        super(str, th);
    }
}
