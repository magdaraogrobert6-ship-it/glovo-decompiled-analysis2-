package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class debugInspectorInfo {
    public static final int[] write = new int[0];

    public static boolean read(int i) {
        if (65 <= i && i <= 90) {
            return true;
        }
        if (97 > i || i > 122) {
            return (48 <= i && i <= 57) || i == 95;
        }
        return true;
    }

    public static int serializer(int i) {
        if (48 <= i && i <= 57) {
            return i - 48;
        }
        if (97 <= i && i <= 102) {
            return i - 87;
        }
        if (65 > i || i > 70) {
            return -1;
        }
        return i - 55;
    }

    public static boolean write(int i) {
        if (48 <= i && i <= 57) {
            return true;
        }
        if (65 > i || i > 90) {
            return 97 <= i && i <= 122;
        }
        return true;
    }

    public static int write(int i, int i2) {
        int i3 = i < 0 ? 5 : 0;
        if (i == 10) {
            i3 |= 1;
        }
        if (i2 < 0) {
            i3 |= 10;
        }
        if (i2 == 10) {
            i3 |= 2;
        }
        return read(i) != read(i2) ? i3 | 16 : i3 | 32;
    }

    public static void IconCompatParcelizer(int i, StringBuilder sb) {
        if (i > 255 ? InspectableValue.read(InspectableValueKt.addOnUserLeaveHintListener, i) || InspectableValue.read(InspectableValueKt.invalidateMenu, i) || InspectableValue.read(InspectableValueKt.onMenuItemSelected, i) || InspectableValue.read(InspectableValueKt.removeMenuProvider, i) || InspectableValue.read(InspectableValueKt.getLifecycleRegistry1, i) : (i >= 32 && i < 127) || (i >= 161 && i != 173)) {
            if ("\\.+*?()|[]{}^$".indexOf((char) i) >= 0) {
                sb.append('\\');
            }
            sb.appendCodePoint(i);
            return;
        }
        if (i == 12) {
            sb.append("\\f");
            return;
        }
        if (i == 13) {
            sb.append("\\r");
            return;
        }
        if (i == 34) {
            sb.append("\\\"");
            return;
        }
        if (i != 92) {
            switch (i) {
                case 8:
                    sb.append("\\b");
                    break;
                case 9:
                    sb.append("\\t");
                    break;
                case 10:
                    sb.append("\\n");
                    break;
                default:
                    String hexString = Integer.toHexString(i);
                    if (i < 256) {
                        sb.append("\\x");
                        if (hexString.length() == 1) {
                            sb.append('0');
                        }
                        sb.append(hexString);
                    } else {
                        sb.append("\\x{");
                        sb.append(hexString);
                        sb.append('}');
                    }
                    break;
            }
            return;
        }
        sb.append("\\\\");
    }
}
