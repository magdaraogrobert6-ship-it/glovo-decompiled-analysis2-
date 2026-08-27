package o;

import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class getPopupContext {
    public final Signature IconCompatParcelizer;
    public final IdentityCredential RemoteActionCompatParcelizer;
    public final PresentationSession read;
    public final Cipher serializer;
    public final Mac write;

    public getPopupContext(Signature signature) {
        this.IconCompatParcelizer = signature;
        this.serializer = null;
        this.write = null;
        this.RemoteActionCompatParcelizer = null;
        this.read = null;
    }

    public getPopupContext(Cipher cipher) {
        this.IconCompatParcelizer = null;
        this.serializer = cipher;
        this.write = null;
        this.RemoteActionCompatParcelizer = null;
        this.read = null;
    }

    public getPopupContext(Mac mac) {
        this.IconCompatParcelizer = null;
        this.serializer = null;
        this.write = mac;
        this.RemoteActionCompatParcelizer = null;
        this.read = null;
    }

    public getPopupContext(IdentityCredential identityCredential) {
        this.IconCompatParcelizer = null;
        this.serializer = null;
        this.write = null;
        this.RemoteActionCompatParcelizer = identityCredential;
        this.read = null;
    }

    public getPopupContext(PresentationSession presentationSession) {
        this.IconCompatParcelizer = null;
        this.serializer = null;
        this.write = null;
        this.RemoteActionCompatParcelizer = null;
        this.read = presentationSession;
    }
}
