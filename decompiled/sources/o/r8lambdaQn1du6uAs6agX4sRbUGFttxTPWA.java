package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.common.io.BaseEncoding$Base64Encoding;
import com.google.common.io.BaseEncoding$StandardBaseEncoding;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA {
    public static final BaseEncoding$Base64Encoding serializer;
    public int RemoteActionCompatParcelizer;
    public Object[] write;
    public static final java.util.logging.Logger read = java.util.logging.Logger.getLogger(r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA.class.getName());
    public static final r8lambdakcTilwmporjFCAWe8ASdQv1Ks IconCompatParcelizer = new r8lambdakcTilwmporjFCAWe8ASdQv1Ks(8);

    static {
        BaseEncoding$Base64Encoding baseEncoding$Base64Encoding = BaseEncoding$StandardBaseEncoding.IconCompatParcelizer;
        if (baseEncoding$Base64Encoding.write != null) {
            baseEncoding$Base64Encoding = new BaseEncoding$Base64Encoding(baseEncoding$Base64Encoding.serializer, (Character) null);
        }
        serializer = baseEncoding$Base64Encoding;
    }

    public final void IconCompatParcelizer(int i) {
        Object[] objArr = new Object[i];
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 != 0) {
            System.arraycopy(this.write, 0, objArr, 0, i2 * 2);
        }
        this.write = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public final void read(r8lambdazzuqe02XBR43ox0o_9r6taqg r8lambdazzuqe02xbr43ox0o_9r6taqg, Object obj) {
        TextStreamsKt.serializer(r8lambdazzuqe02xbr43ox0o_9r6taqg, "key");
        TextStreamsKt.serializer(obj, "value");
        int i = this.RemoteActionCompatParcelizer;
        int i2 = i * 2;
        if (i2 == 0) {
            IconCompatParcelizer(Math.max(i * 4, 8));
        } else {
            Object[] objArr = this.write;
            if (i2 == (objArr != null ? objArr.length : 0)) {
                IconCompatParcelizer(Math.max(i * 4, 8));
            }
        }
        int i3 = this.RemoteActionCompatParcelizer * 2;
        this.write[i3] = r8lambdazzuqe02xbr43ox0o_9r6taqg.read;
        this.write[i3 + 1] = r8lambdazzuqe02xbr43ox0o_9r6taqg.RemoteActionCompatParcelizer(obj);
        this.RemoteActionCompatParcelizer++;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.RemoteActionCompatParcelizer; i++) {
            if (i != 0) {
                sb.append(',');
            }
            byte[] bArrWrite = write(i);
            Charset charset = visitSelfAndChildrenYYKmhodefault.read;
            String str = new String(bArrWrite, charset);
            sb.append(str);
            sb.append('=');
            boolean zEndsWith = str.endsWith("-bin");
            Object[] objArr = this.write;
            if (zEndsWith) {
                Object obj = objArr[(i * 2) + 1];
                if (obj instanceof byte[]) {
                    sb.append(serializer.serializer((byte[]) obj));
                } else {
                    m1$$ExternalSyntheticOutline0.m(obj);
                    throw null;
                }
            } else {
                Object obj2 = objArr[(i * 2) + 1];
                if (obj2 instanceof byte[]) {
                    sb.append(new String((byte[]) obj2, charset));
                } else {
                    m1$$ExternalSyntheticOutline0.m(obj2);
                    throw null;
                }
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final byte[] write(int i) {
        return (byte[]) this.write[i * 2];
    }

    public final void write(r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        int i = r8lambdaqn1du6uas6agx4srbugfttxtpwa.RemoteActionCompatParcelizer;
        if (i == 0) {
            return;
        }
        Object[] objArr = this.write;
        int length = objArr != null ? objArr.length : 0;
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 == 0 || length - (i2 * 2) < i * 2) {
            IconCompatParcelizer((i * 2) + (i2 * 2));
        }
        System.arraycopy(r8lambdaqn1du6uas6agx4srbugfttxtpwa.write, 0, this.write, this.RemoteActionCompatParcelizer * 2, r8lambdaqn1du6uas6agx4srbugfttxtpwa.RemoteActionCompatParcelizer * 2);
        this.RemoteActionCompatParcelizer += r8lambdaqn1du6uas6agx4srbugfttxtpwa.RemoteActionCompatParcelizer;
    }

    public final Object read(r8lambdazzuqe02XBR43ox0o_9r6taqg r8lambdazzuqe02xbr43ox0o_9r6taqg) {
        int i = this.RemoteActionCompatParcelizer;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(r8lambdazzuqe02xbr43ox0o_9r6taqg.read, write(i)));
        Object obj = this.write[(i * 2) + 1];
        if (obj instanceof byte[]) {
            return r8lambdazzuqe02xbr43ox0o_9r6taqg.write((byte[]) obj);
        }
        throw c8$$ExternalSyntheticOutline0.m(obj);
    }

    public final void serializer(r8lambdazzuqe02XBR43ox0o_9r6taqg r8lambdazzuqe02xbr43ox0o_9r6taqg) {
        if (this.RemoteActionCompatParcelizer == 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.RemoteActionCompatParcelizer;
            if (i >= i3) {
                Arrays.fill(this.write, i2 * 2, i3 * 2, (Object) null);
                this.RemoteActionCompatParcelizer = i2;
                return;
            }
            if (!Arrays.equals(r8lambdazzuqe02xbr43ox0o_9r6taqg.read, write(i))) {
                byte[] bArrWrite = write(i);
                Object[] objArr = this.write;
                int i4 = i2 * 2;
                objArr[i4] = bArrWrite;
                Object obj = objArr[(i * 2) + 1];
                if (objArr instanceof byte[][]) {
                    IconCompatParcelizer(objArr.length);
                }
                this.write[i4 + 1] = obj;
                i2++;
            }
            i++;
        }
    }
}
