package o;

import com.google.zxing.common.CharacterSetECI;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getFontFamily {
    public static final ArrayList serializer = new ArrayList();
    public final CharsetEncoder[] RemoteActionCompatParcelizer;
    public final int write;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i = 0; i < 20; i++) {
            String str = strArr[i];
            if (CharacterSetECI.getCharacterSetECIByName(str) != null) {
                try {
                    serializer.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public getFontFamily(String str, Charset charset) {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        int i2 = 0;
        boolean z2 = charset != null && charset.name().startsWith("UTF");
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= str.length()) {
                break;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                CharsetEncoder charsetEncoder = (CharsetEncoder) it.next();
                char cCharAt = str.charAt(i3);
                if (cCharAt == -1 || charsetEncoder.canEncode(cCharAt)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                Iterator it2 = serializer.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        CharsetEncoder charsetEncoder2 = (CharsetEncoder) it2.next();
                        if (charsetEncoder2.canEncode(str.charAt(i3))) {
                            arrayList.add(charsetEncoder2);
                        }
                    } else if (!z) {
                        z2 = true;
                    }
                }
            } else if (!z) {
                z2 = true;
            }
            i3++;
        }
        if (arrayList.size() != 1 || z2) {
            this.RemoteActionCompatParcelizer = new CharsetEncoder[arrayList.size() + 2];
            Iterator it3 = arrayList.iterator();
            int i4 = 0;
            while (it3.hasNext()) {
                this.RemoteActionCompatParcelizer[i4] = (CharsetEncoder) it3.next();
                i4++;
            }
            this.RemoteActionCompatParcelizer[i4] = StandardCharsets.UTF_8.newEncoder();
            this.RemoteActionCompatParcelizer[i4 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        } else {
            this.RemoteActionCompatParcelizer = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        }
        if (charset != null) {
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.RemoteActionCompatParcelizer;
                if (i2 < charsetEncoderArr.length) {
                    if (charsetEncoderArr[i2] != null && charset.name().equals(this.RemoteActionCompatParcelizer[i2].charset().name())) {
                        i = i2;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        this.write = i;
    }
}
