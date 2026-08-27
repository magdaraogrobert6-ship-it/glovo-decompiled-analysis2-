package o;

import io.grpc.Status;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdakcTilwmporjFCAWe8ASdQv1Ks implements r8lambdam0pROBQI4dUHq1bB07KqFqyReTo, r8lambda_OcJ7olE86bsKzOqyJLgcCCvo {
    public static final r8lambdakcTilwmporjFCAWe8ASdQv1Ks IconCompatParcelizer = new r8lambdakcTilwmporjFCAWe8ASdQv1Ks(1);
    public static final byte[] read = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public r8lambdakcTilwmporjFCAWe8ASdQv1Ks(SSLSession sSLSession) {
        this.RemoteActionCompatParcelizer = 4;
        sSLSession.getCipherSuite();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            Certificate certificate = localCertificates[0];
        }
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null) {
                Certificate certificate2 = peerCertificates[0];
            }
        } catch (SSLPeerUnverifiedException e) {
            r8lambdau5EmWqwr5N5wkL4k3k2Ai1wBwnU.RemoteActionCompatParcelizer.log(Level.FINE, "Peer cert not available for peerHost=" + sSLSession.getPeerHost(), (Throwable) e);
        }
    }

    @Override // o.r8lambda_OcJ7olE86bsKzOqyJLgcCCvo
    public Object IconCompatParcelizer(String str) {
        return str;
    }

    public int IconCompatParcelizer(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 6) {
            ((wouldPushPermissionPromptDisplaylambda3) obj).getClass();
            return 5;
        }
        if (i != 7) {
            ((getDeclaredMethodQuietlylambda0) obj).getClass();
            return 5;
        }
        ((r8lambda1h84ZU_cAR0h79mqUcr2O580IzE) ((wouldPushPermissionPromptDisplaylambda5) obj)).getClass();
        try {
            Class.forName("android.app.Application", false, r8lambda1h84ZU_cAR0h79mqUcr2O580IzE.class.getClassLoader());
            return 8;
        } catch (Exception unused) {
            return 3;
        }
    }

    @Override // o.r8lambdam0pROBQI4dUHq1bB07KqFqyReTo
    public byte[] serializer(Object obj) {
        if (this.RemoteActionCompatParcelizer != 2) {
            return ((Status) obj).PlaybackStateCompat.valueAscii();
        }
        byte[] bytes = ((String) obj).getBytes(visitSelfAndChildrenYYKmhodefault.write);
        int i = 0;
        while (i < bytes.length) {
            byte b = bytes[i];
            if (b < 32 || b >= 126 || b == 37) {
                byte[] bArr = new byte[((bytes.length - i) * 3) + i];
                if (i != 0) {
                    System.arraycopy(bytes, 0, bArr, 0, i);
                }
                int i2 = i;
                while (i < bytes.length) {
                    byte b2 = bytes[i];
                    if (b2 < 32 || b2 >= 126 || b2 == 37) {
                        bArr[i2] = 37;
                        byte[] bArr2 = read;
                        bArr[i2 + 1] = bArr2[(b2 >> 4) & 15];
                        bArr[i2 + 2] = bArr2[b2 & 15];
                        i2 += 3;
                    } else {
                        bArr[i2] = b2;
                        i2++;
                    }
                    i++;
                }
                return Arrays.copyOf(bArr, i2);
            }
            i++;
        }
        return bytes;
    }

    public String toString() {
        return this.RemoteActionCompatParcelizer != 5 ? super.toString() : "internal:health-check-consumer-listener";
    }

    public String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer != 0 ? "identity" : "gzip";
    }

    @Override // o.r8lambdam0pROBQI4dUHq1bB07KqFqyReTo
    public Object write(byte[] bArr) {
        int i;
        byte b;
        char c = 0;
        if (this.RemoteActionCompatParcelizer != 2) {
            if (bArr.length == 1 && bArr[0] == 48) {
                return Status.RatingCompat;
            }
            int length = bArr.length;
            if (length != 1) {
                if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                    i = (b - 48) * 10;
                    c = 1;
                }
                return Status.ParcelableVolumeInfo.IconCompatParcelizer("Unknown code ".concat(new String(bArr, visitSelfAndChildrenYYKmhodefault.read)));
            }
            i = 0;
            byte b2 = bArr[c];
            if (b2 >= 48 && b2 <= 57) {
                int i2 = (b2 - 48) + i;
                List list = Status.MediaDescriptionCompat;
                if (i2 < list.size()) {
                    return (Status) list.get(i2);
                }
            }
            return Status.ParcelableVolumeInfo.IconCompatParcelizer("Unknown code ".concat(new String(bArr, visitSelfAndChildrenYYKmhodefault.read)));
        }
        for (int i3 = 0; i3 < bArr.length; i3++) {
            byte b3 = bArr[i3];
            if (b3 < 32 || b3 >= 126 || (b3 == 37 && i3 + 2 < bArr.length)) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
                int i4 = 0;
                while (i4 < bArr.length) {
                    if (bArr[i4] == 37 && i4 + 2 < bArr.length) {
                        try {
                            byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i4 + 1, 2, visitSelfAndChildrenYYKmhodefault.read), 16));
                            i4 += 3;
                        } catch (NumberFormatException unused) {
                            byteBufferAllocate.put(bArr[i4]);
                            i4++;
                        }
                    }
                    byteBufferAllocate.put(bArr[i4]);
                    i4++;
                }
                return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), visitSelfAndChildrenYYKmhodefault.write);
            }
        }
        return new String(bArr, 0);
    }

    public /* synthetic */ r8lambdakcTilwmporjFCAWe8ASdQv1Ks(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambda_OcJ7olE86bsKzOqyJLgcCCvo
    public String read(Object obj) {
        return (String) obj;
    }
}
