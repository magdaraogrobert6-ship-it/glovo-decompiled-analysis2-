package o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class UserAgentHeaderInterceptorKt {
    public final ByteArrayOutputStream write;

    public static int read(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static int serializer(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static int write(int i, boolean z) {
        return read(i) + (z ? 1 : 0) + i;
    }

    public void read(provideRequest providerequest) {
        providerequest.read(this, true);
    }

    public CustomerChatViewModel IconCompatParcelizer() {
        return new CustomerChatViewModel(this.write);
    }

    public void IconCompatParcelizer(metricProvider metricprovider) {
        try {
            this.write.write(metricprovider.MediaMetadataCompat());
        } catch (Exception e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(e.getMessage(), e);
        }
    }

    public buildHelpCenterRegionServiceUrl read() {
        return new buildHelpCenterRegionServiceUrl(this.write);
    }

    public void write(int i) throws IOException {
        this.write.write(i);
    }

    public void IconCompatParcelizer(int i) {
        ByteArrayOutputStream byteArrayOutputStream = this.write;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
    }

    public void read(boolean z, int i, byte[] bArr) {
        RemoteActionCompatParcelizer(i, z);
        RemoteActionCompatParcelizer(bArr.length);
        IconCompatParcelizer(bArr, 0, bArr.length);
    }

    public void RemoteActionCompatParcelizer(int i) throws IOException {
        if (i < 128) {
            write(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                IconCompatParcelizer(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    public void RemoteActionCompatParcelizer(logErrordefault[] logerrordefaultArr) {
        for (logErrordefault logerrordefault : logerrordefaultArr) {
            logerrordefault.RatingCompat().read(this, true);
        }
    }

    public void serializer(provideRequest[] providerequestArr) {
        for (provideRequest providerequest : providerequestArr) {
            providerequest.read(this, true);
        }
    }

    public UserAgentHeaderInterceptorKt() {
        this.write = new ByteArrayOutputStream();
    }

    public void IconCompatParcelizer(boolean z, int i, logErrordefault[] logerrordefaultArr) throws IOException {
        RemoteActionCompatParcelizer(i, z);
        write(androidx.compose.ui.graphics.Fields.SpotShadowColor);
        RemoteActionCompatParcelizer(logerrordefaultArr);
        write(0);
        write(0);
    }

    public void serializer(int i, int i2) throws IOException {
        if (i2 < 31) {
            write(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & 127);
        while (i2 > 127) {
            i2 >>>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
        }
        int i4 = i3 - 1;
        bArr[i4] = (byte) (i | 31);
        IconCompatParcelizer(bArr, i4, 6 - i4);
    }

    public void IconCompatParcelizer(byte[] bArr, int i, int i2) throws IOException {
        this.write.write(bArr, i, i2);
    }

    public UserAgentHeaderInterceptorKt(ByteArrayOutputStream byteArrayOutputStream) {
        this.write = byteArrayOutputStream;
    }

    public void IconCompatParcelizer(byte[] bArr) {
        try {
            this.write.write(bArr);
        } catch (Exception e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(e.getMessage(), e);
        }
    }

    public void RemoteActionCompatParcelizer(int i, boolean z) throws IOException {
        if (z) {
            write(i);
        }
    }
}
