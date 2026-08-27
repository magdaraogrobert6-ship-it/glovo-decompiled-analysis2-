package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdajlMT1F20UZPc4QzYtuHQ8199M8 {
    private final int IconCompatParcelizer;
    private final long serializer;

    public final long read() {
        return this.serializer;
    }

    private static Integer read(String str) {
        String strGroup;
        if (str.endsWith("Z")) {
            return 0;
        }
        Matcher matcher = Pattern.compile("([+-]\\d{2}:\\d{2})$").matcher(str);
        if (!matcher.find() || (strGroup = matcher.group(1)) == null) {
            return null;
        }
        String[] strArrSplit = strGroup.split(":");
        if (strArrSplit.length != 2) {
            return null;
        }
        try {
            int i = Integer.parseInt(strArrSplit[0]);
            int i2 = Integer.parseInt(strArrSplit[1]);
            if (i < 0) {
                i2 = -i2;
            }
            return Integer.valueOf((i * 60) + i2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static r8lambdajlMT1F20UZPc4QzYtuHQ8199M8 serializer(String str) {
        Integer num;
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", java.util.Locale.ENGLISH).parse(str);
            if (date != null && (num = read(str)) != null) {
                return new r8lambdajlMT1F20UZPc4QzYtuHQ8199M8(date.getTime(), num.intValue());
            }
            return null;
        } catch (java.text.ParseException unused) {
            return null;
        }
    }

    public r8lambdajlMT1F20UZPc4QzYtuHQ8199M8(long j, int i) {
        this.serializer = j;
        this.IconCompatParcelizer = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalDateTime{mEpochTime=");
        sb.append(this.serializer);
        sb.append(", mTimezoneOffsetInMinutes=");
        return af$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, '}');
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.serializer), Integer.valueOf(this.IconCompatParcelizer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r8lambdajlMT1F20UZPc4QzYtuHQ8199M8 r8lambdajlmt1f20uzpc4qzytuhq8199m8 = (r8lambdajlMT1F20UZPc4QzYtuHQ8199M8) obj;
        return this.serializer == r8lambdajlmt1f20uzpc4qzytuhq8199m8.serializer && this.IconCompatParcelizer == r8lambdajlmt1f20uzpc4qzytuhq8199m8.IconCompatParcelizer;
    }
}
