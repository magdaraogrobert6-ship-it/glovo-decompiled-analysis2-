package o;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes4.dex */
public final class PhoneCallTypeCompanion extends ProvidernetworkModule1 {
    public byte[] IconCompatParcelizer;

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.IconCompatParcelizer;
        }
        return bArr != null ? UserAgentHeaderInterceptorKt.write(bArr.length, z) : super.MediaSessionCompatQueueItem().RemoteActionCompatParcelizer(z);
    }

    @Override // o.ProvidernetworkModule1
    public final Enumeration RemoteActionCompatParcelizer() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.IconCompatParcelizer;
        }
        if (bArr == null) {
            return new ProvidernetworkModule11(this);
        }
        accessgetcachedSerializerdelegatecp accessgetcachedserializerdelegatecp = new accessgetcachedSerializerdelegatecp();
        accessgetcachedserializerdelegatecp.read = new tryRefreshToken(bArr);
        accessgetcachedserializerdelegatecp.RemoteActionCompatParcelizer = accessgetcachedserializerdelegatecp.IconCompatParcelizer();
        return accessgetcachedserializerdelegatecp;
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.IconCompatParcelizer;
        }
        if (bArr != null) {
            userAgentHeaderInterceptorKt.read(z, 48, bArr);
        } else {
            super.MediaSessionCompatQueueItem().read(userAgentHeaderInterceptorKt, z);
        }
    }

    public final void PlaybackStateCompat() {
        extractTokenFromHeader extracttokenfromheader;
        synchronized (this) {
            if (this.IconCompatParcelizer != null) {
                tryRefreshToken tryrefreshtoken = new tryRefreshToken(this.IconCompatParcelizer);
                try {
                    provideRequest providerequestSerializer = tryrefreshtoken.serializer();
                    if (providerequestSerializer == null) {
                        extracttokenfromheader = new extractTokenFromHeader(0);
                    } else {
                        extractTokenFromHeader extracttokenfromheader2 = new extractTokenFromHeader();
                        do {
                            extracttokenfromheader2.write(providerequestSerializer);
                            providerequestSerializer = tryrefreshtoken.serializer();
                        } while (providerequestSerializer != null);
                        extracttokenfromheader = extracttokenfromheader2;
                    }
                    tryrefreshtoken.close();
                    this.RemoteActionCompatParcelizer = extracttokenfromheader.IconCompatParcelizer();
                    this.IconCompatParcelizer = null;
                } catch (IOException e) {
                    throw new ASN1ParsingException("malformed ASN.1: " + e, e);
                }
            }
        }
    }

    @Override // o.ProvidernetworkModule1
    public final logErrordefault IconCompatParcelizer(int i) {
        PlaybackStateCompat();
        return this.RemoteActionCompatParcelizer[i];
    }

    @Override // o.ProvidernetworkModule1, o.provideRequest
    public final provideRequest MediaSessionCompatQueueItem() {
        PlaybackStateCompat();
        return super.MediaSessionCompatQueueItem();
    }

    @Override // o.ProvidernetworkModule1, o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        PlaybackStateCompat();
        return super.hashCode();
    }

    @Override // o.ProvidernetworkModule1, java.lang.Iterable
    public final Iterator iterator() {
        PlaybackStateCompat();
        return super.iterator();
    }

    @Override // o.ProvidernetworkModule1, o.provideRequest
    public final provideRequest toDERObject() {
        PlaybackStateCompat();
        return super.toDERObject();
    }

    @Override // o.ProvidernetworkModule1
    public final int write() {
        PlaybackStateCompat();
        return this.RemoteActionCompatParcelizer.length;
    }

    @Override // o.ProvidernetworkModule1
    public final TokenRefreshAuthenticator MediaDescriptionCompat() {
        return ((ProvidernetworkModule1) MediaSessionCompatQueueItem()).MediaDescriptionCompat();
    }

    @Override // o.ProvidernetworkModule1
    public final ASN1OctetString MediaSessionCompatToken() {
        return ((ProvidernetworkModule1) MediaSessionCompatQueueItem()).MediaSessionCompatToken();
    }

    @Override // o.ProvidernetworkModule1
    public final provideMoshi PlaybackStateCompatCustomAction() {
        return ((ProvidernetworkModule1) MediaSessionCompatQueueItem()).PlaybackStateCompatCustomAction();
    }
}
