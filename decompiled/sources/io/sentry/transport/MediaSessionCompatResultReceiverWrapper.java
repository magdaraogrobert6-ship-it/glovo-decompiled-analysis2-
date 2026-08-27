package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompatResultReceiverWrapper extends Authenticator {
    public final String RemoteActionCompatParcelizer;
    public final String serializer;

    public MediaSessionCompatResultReceiverWrapper(String str, String str2) {
        this.RemoteActionCompatParcelizer = str;
        this.serializer = str2;
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() != Authenticator.RequestorType.PROXY) {
            return null;
        }
        return new PasswordAuthentication(this.RemoteActionCompatParcelizer, this.serializer.toCharArray());
    }
}
