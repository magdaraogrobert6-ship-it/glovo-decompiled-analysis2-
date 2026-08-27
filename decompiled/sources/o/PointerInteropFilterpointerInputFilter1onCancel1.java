package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PointerInteropFilterpointerInputFilter1onCancel1 {
    private static int read = 0;
    private static int write = 1;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final s8 write(String str) {
        int i = 2 % 2;
        int i2 = write + 43;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        switch (str.hashCode()) {
            case -1360733992:
                if (str.equals("RUSH_BONUS")) {
                    int i4 = write + 13;
                    read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        return s8.RUSH_BONUS;
                    }
                    int i5 = 1 / 0;
                    return s8.RUSH_BONUS;
                }
                break;
            case 499791160:
                if (str.equals("HOLIDAY_BONUS")) {
                    return s8.HOLIDAY_BONUS;
                }
                break;
            case 1583226104:
                if (str.equals("NIGHT_BONUS")) {
                    return s8.NIGHT_BONUS;
                }
                int i6 = read + 75;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                break;
            case 1646665684:
                if (str.equals("WEATHER_BONUS")) {
                    return s8.BAD_WEATHER;
                }
                break;
        }
        return s8.UNKNOWN;
    }

    public static String RemoteActionCompatParcelizer(moveFocusInChildren3ESFkO8 movefocusinchildren3esfko8) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder(movefocusinchildren3esfko8.write());
        int i2 = read + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < movefocusinchildren3esfko8.write(); i4++) {
            byte b = movefocusinchildren3esfko8.serializer[i4];
            if (b == 34) {
                sb.append("\\\"");
            } else if (b != 39) {
                int i5 = read + 121;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (b != 92) {
                    switch (b) {
                        case 7:
                            sb.append("\\a");
                            int i7 = read + 107;
                            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i7 % 2 == 0) {
                                int i8 = 5 / 5;
                            }
                            break;
                        case 8:
                            sb.append("\\b");
                            break;
                        case 9:
                            sb.append("\\t");
                            int i9 = write + 35;
                            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i9 % 2 != 0) {
                                int i10 = 3 % 3;
                            }
                            break;
                        case 10:
                            sb.append("\\n");
                            break;
                        case 11:
                            sb.append("\\v");
                            break;
                        case 12:
                            sb.append("\\f");
                            break;
                        case 13:
                            sb.append("\\r");
                            break;
                        default:
                            if (b < 32 || b > 126) {
                                sb.append('\\');
                                sb.append((char) (((b >>> 6) & 3) + 48));
                                sb.append((char) (((b >>> 3) & 7) + 48));
                                sb.append((char) ((b & 7) + 48));
                            } else {
                                sb.append((char) b);
                            }
                            break;
                    }
                } else {
                    sb.append("\\\\");
                }
            } else {
                sb.append("\\'");
            }
        }
        return sb.toString();
    }
}
