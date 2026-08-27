package o;

import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class addPathoIyEayMdefault {
    public final String RemoteActionCompatParcelizer;

    public final String toString() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0055  */
    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    public addPathoIyEayMdefault(String str) {
        String str2;
        int length;
        int i;
        char cCharAt;
        if (str == null) {
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            CaptionedImageContentCardView captionedImageContentCardView = asVectorGroup.IconCompatParcelizer;
            long jPow = (long) Math.pow(10.0d, 17.0d);
            long jNextLong = ThreadLocalRandom.current().nextLong(jPow, 10 * jPow);
            byte[] bArr = new byte[androidx.compose.ui.graphics.Fields.RotationX];
            new Random().nextBytes(bArr);
            Charset charsetForName = Charset.forName(com.adjust.sdk.Constants.ENCODING);
            charsetForName.getClass();
            str2 = new String(bArr, charsetForName);
            StringBuffer stringBuffer = new StringBuffer();
            length = str2.length();
            int i2 = 10;
            for (i = 0; i < length; i++) {
                cCharAt = str2.charAt(i);
                if (!asVectorGroup.IconCompatParcelizer.read.containsKey(Character.valueOf(cCharAt)) && i2 > 0) {
                    stringBuffer.append(cCharAt);
                    i2--;
                }
            }
            String string = stringBuffer.toString();
            string.getClass();
            str = onContentCardDismissed.IconCompatParcelizer(androidx.sqlite.SQLite.read(String.valueOf(timeInMillis), Long.valueOf(jNextLong), string), ".", null, null, null, 62);
        } else {
            str = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) ? null : str;
            if (str == null) {
                long timeInMillis2 = Calendar.getInstance().getTimeInMillis();
                CaptionedImageContentCardView captionedImageContentCardView2 = asVectorGroup.IconCompatParcelizer;
                long jPow2 = (long) Math.pow(10.0d, 17.0d);
                long jNextLong2 = ThreadLocalRandom.current().nextLong(jPow2, 10 * jPow2);
                byte[] bArr2 = new byte[androidx.compose.ui.graphics.Fields.RotationX];
                new Random().nextBytes(bArr2);
                Charset charsetForName2 = Charset.forName(com.adjust.sdk.Constants.ENCODING);
                charsetForName2.getClass();
                str2 = new String(bArr2, charsetForName2);
                StringBuffer stringBuffer2 = new StringBuffer();
                length = str2.length();
                int i3 = 10;
                while (i < length) {
                    cCharAt = str2.charAt(i);
                    if (!asVectorGroup.IconCompatParcelizer.read.containsKey(Character.valueOf(cCharAt))) {
                    }
                }
                String string2 = stringBuffer2.toString();
                string2.getClass();
                str = onContentCardDismissed.IconCompatParcelizer(androidx.sqlite.SQLite.read(String.valueOf(timeInMillis2), Long.valueOf(jNextLong2), string2), ".", null, null, null, 62);
            }
        }
        this.RemoteActionCompatParcelizer = str;
    }
}
