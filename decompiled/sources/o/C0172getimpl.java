package o;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;

/* JADX INFO: renamed from: o.getimpl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0172getimpl implements tintxETnrds {
    public final UncheckedColor read;

    @Override // o.tintxETnrds
    public final boolean IconCompatParcelizer() {
        return this.read.MediaDescriptionCompat();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.read.close();
    }

    public C0172getimpl(UncheckedColor uncheckedColor) {
        uncheckedColor.getClass();
        this.read = uncheckedColor;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.tintxETnrds
    public final UncheckedColordefault RemoteActionCompatParcelizer(String str) {
        int iWrite;
        rotateInternalimpl rotateinternalimpl;
        str.getClass();
        UncheckedColor uncheckedColor = this.read;
        setjHGOpc setjhgopc = null;
        if (!uncheckedColor.RatingCompat()) {
            androidx.sqlite.SQLite.read(21, "connection is closed");
            throw null;
        }
        String upperCase = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString().toUpperCase(java.util.Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        if (length < 0) {
            iWrite = -1;
            break;
        }
        iWrite = 0;
        loop0: while (true) {
            if (iWrite < length) {
                char cCharAt = upperCase.charAt(iWrite);
                if (removeNodeAtDepth.serializer(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt != '/') {
                            break;
                        }
                        int iWrite2 = iWrite + 1;
                        if (upperCase.charAt(iWrite2) != '*') {
                            break;
                        }
                        while (true) {
                            iWrite2 = hideCurrentlyDisplayingInAppMessage.write((CharSequence) upperCase, '*', iWrite2 + 1, false, 4);
                            if (iWrite2 >= 0) {
                                int i = iWrite2 + 1;
                                if (i >= length || upperCase.charAt(i) == '/') {
                                    iWrite = iWrite2 + 2;
                                }
                            }
                        }
                    } else {
                        if (upperCase.charAt(iWrite + 1) != '-') {
                            break;
                        }
                        iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) upperCase, '\n', iWrite + 2, false, 4);
                        if (iWrite < 0) {
                        }
                    }
                }
                iWrite++;
            }
            iWrite = -1;
            break;
        }
        String strSubstring = (iWrite < 0 || iWrite > upperCase.length()) ? null : upperCase.substring(iWrite, Math.min(iWrite + 3, upperCase.length()));
        if (strSubstring == null) {
            return new resetimpl(uncheckedColor, str);
        }
        switch (strSubstring.hashCode()) {
            case 65636:
                if (!strSubstring.equals("BEG")) {
                    rotateinternalimpl = null;
                } else if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) upperCase, (CharSequence) "EXCLUSIVE", false)) {
                    rotateinternalimpl = !hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) upperCase, (CharSequence) "IMMEDIATE", false) ? rotateInternalimpl.BEGIN_DEFERRED : rotateInternalimpl.BEGIN_IMMEDIATE;
                } else {
                    rotateinternalimpl = rotateInternalimpl.BEGIN_EXCLUSIVE;
                }
                break;
            case 66913:
                if (!strSubstring.equals("COM")) {
                    rotateinternalimpl = null;
                } else {
                    rotateinternalimpl = rotateInternalimpl.END;
                }
                break;
            case 68795:
                if (!strSubstring.equals("END")) {
                    rotateinternalimpl = null;
                } else {
                    rotateinternalimpl = rotateInternalimpl.END;
                }
                break;
            case 81327:
                rotateinternalimpl = (!strSubstring.equals("ROL") || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) upperCase, (CharSequence) " TO ", false)) ? null : rotateInternalimpl.ROLLBACK;
                break;
            default:
                rotateinternalimpl = null;
                break;
        }
        if (rotateinternalimpl != null) {
            return new resetimpl(uncheckedColor, str, rotateinternalimpl);
        }
        if (strSubstring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(java.util.Locale.ROOT);
            lowerCase.getClass();
            if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(lowerCase, "journal_mode", ""), (CharSequence) ContainerUtils.KEY_VALUE_DELIMITER, false)) {
                setjhgopc = setjHGOpc.write;
            }
        }
        if (setjhgopc != null) {
            return new resetimpl(uncheckedColor, str, new setToRotateBlueimpl(uncheckedColor, str));
        }
        int iHashCode = strSubstring.hashCode();
        return (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) ? new resetimpl(uncheckedColor, str) : new setToRotateBlueimpl(uncheckedColor, str);
    }
}
