package o;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.incognia.internal.fFk$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public class truncslo4al4 {
    public final Object IconCompatParcelizer;
    public boolean read;

    public void IconCompatParcelizer() {
    }

    public void RemoteActionCompatParcelizer() {
        this.read = false;
    }

    public void read() {
    }

    public void read(generateOetf generateoetf, boolean z) {
        synchronized (this) {
            if (this.read || z) {
                ((Handler) this.IconCompatParcelizer).obtainMessage(1, generateoetf).sendToTarget();
            } else {
                this.read = true;
                generateoetf.MediaBrowserCompatMediaItem();
                this.read = false;
            }
        }
    }

    public void serializer() {
        this.read = true;
    }

    public void write() {
        this.read = false;
    }

    public void IconCompatParcelizer(char c) {
        CSSParseException cSSParseException = (CSSParseException) this.IconCompatParcelizer;
        cSSParseException.IconCompatParcelizer(cSSParseException.IconCompatParcelizer, 1);
        char[] cArr = (char[]) cSSParseException.RemoteActionCompatParcelizer;
        int i = cSSParseException.IconCompatParcelizer;
        cSSParseException.IconCompatParcelizer = i + 1;
        cArr[i] = c;
    }

    public void write(String str) {
        byte b;
        str.getClass();
        CSSParseException cSSParseException = (CSSParseException) this.IconCompatParcelizer;
        cSSParseException.IconCompatParcelizer(cSSParseException.IconCompatParcelizer, str.length() + 2);
        char[] cArr = (char[]) cSSParseException.RemoteActionCompatParcelizer;
        int i = cSSParseException.IconCompatParcelizer;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = prepareInAppMessageWithBitmapDownloadlambda5.RemoteActionCompatParcelizer;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    cSSParseException.IconCompatParcelizer(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = prepareInAppMessageWithBitmapDownloadlambda5.RemoteActionCompatParcelizer;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) cSSParseException.RemoteActionCompatParcelizer)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = prepareInAppMessageWithBitmapDownloadlambda5.read[cCharAt];
                        str2.getClass();
                        cSSParseException.IconCompatParcelizer(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) cSSParseException.RemoteActionCompatParcelizer, i4);
                        int length3 = str2.length() + i4;
                        cSSParseException.IconCompatParcelizer = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) cSSParseException.RemoteActionCompatParcelizer;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        cSSParseException.IconCompatParcelizer = i4;
                    }
                }
                cSSParseException.IconCompatParcelizer(i4, 1);
                ((char[]) cSSParseException.RemoteActionCompatParcelizer)[i4] = '\"';
                cSSParseException.IconCompatParcelizer = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        cSSParseException.IconCompatParcelizer = i3 + 1;
    }

    public isAltPressedZmokQxo IconCompatParcelizer(long j, String str) {
        Object obj = isAltPressedZmokQxo.RemoteActionCompatParcelizer;
        return new isAltPressedZmokQxo(this, str, Long.valueOf(j), 0);
    }

    public isAltPressedZmokQxo serializer(String str, boolean z) {
        Object obj = isAltPressedZmokQxo.RemoteActionCompatParcelizer;
        return new isAltPressedZmokQxo(this, str, Boolean.valueOf(z), 1);
    }

    public truncslo4al4() {
        this.IconCompatParcelizer = new Handler(Looper.getMainLooper(), new xyPrimaries());
    }

    public isAltPressedZmokQxo serializer(String str, String str2) {
        Object obj = isAltPressedZmokQxo.RemoteActionCompatParcelizer;
        return new isAltPressedZmokQxo(this, str, str2, 3);
    }

    public /* synthetic */ truncslo4al4(Object obj) {
        this.IconCompatParcelizer = obj;
        this.read = true;
    }

    public truncslo4al4(Uri uri, boolean z, boolean z2) {
        this.IconCompatParcelizer = uri;
        this.read = z;
    }

    public truncslo4al4(fFk$$ExternalSyntheticLambda0 ffk__externalsyntheticlambda0, boolean z) {
        this.IconCompatParcelizer = ffk__externalsyntheticlambda0;
        this.read = z;
    }

    public void read(byte b) {
        ((CSSParseException) this.IconCompatParcelizer).read(String.valueOf(b));
    }

    public truncslo4al4(boolean z, String[] strArr) {
        this.read = z;
        this.IconCompatParcelizer = strArr;
    }

    public void serializer(short s) {
        ((CSSParseException) this.IconCompatParcelizer).read(String.valueOf(s));
    }

    public void write(int i) {
        ((CSSParseException) this.IconCompatParcelizer).read(String.valueOf(i));
    }

    public void serializer(long j) {
        ((CSSParseException) this.IconCompatParcelizer).read(String.valueOf(j));
    }
}
