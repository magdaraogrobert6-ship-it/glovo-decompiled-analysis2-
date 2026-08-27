package com.mapbox.base.common.logger.model;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes5.dex */
public final class Message {
    public final String message;

    public final int hashCode() {
        return this.message.hashCode();
    }

    public Message(String str) {
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Message) && this.message.equals(((Message) obj).message);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("Message(message="), this.message, ')');
    }
}
