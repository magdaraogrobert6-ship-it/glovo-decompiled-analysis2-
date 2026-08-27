package o;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class FocusOwnerImpl {
    public static final String IconCompatParcelizer;
    public static final FocusOwnerImpl RemoteActionCompatParcelizer;
    public static final String serializer;
    public static final FocusOwnerImpl write;
    public final boolean read;

    public FocusOwnerImpl(boolean z) {
        setDropDownVerticalOffset setdropdownverticaloffset = traverseAncestorsIncludingSelfQFhIj7k.serializer;
        this.read = z;
    }

    public static int IconCompatParcelizer(CharSequence charSequence) {
        takeFocusaToIllA takefocusatoilla = new takeFocusaToIllA(charSequence);
        takefocusatoilla.serializer = takefocusatoilla.IconCompatParcelizer;
        int i = 0;
        while (true) {
            int i2 = i;
            while (takefocusatoilla.serializer > 0) {
                byte bRemoteActionCompatParcelizer = takefocusatoilla.RemoteActionCompatParcelizer();
                if (bRemoteActionCompatParcelizer == 0) {
                    if (i2 == 0) {
                        return -1;
                    }
                    if (i == 0) {
                        i = i2;
                    }
                } else if (bRemoteActionCompatParcelizer == 1 || bRemoteActionCompatParcelizer == 2) {
                    if (i2 == 0) {
                        return 1;
                    }
                    if (i == 0) {
                        i = i2;
                    }
                } else if (bRemoteActionCompatParcelizer != 9) {
                    switch (bRemoteActionCompatParcelizer) {
                        case 14:
                        case 15:
                            if (i == i2) {
                                return -1;
                            }
                            i2--;
                            break;
                        case 16:
                        case 17:
                            if (i == i2) {
                                return 1;
                            }
                            i2--;
                            break;
                        case 18:
                            i2++;
                            break;
                        default:
                            if (i == 0) {
                                i = i2;
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public static int read(CharSequence charSequence) {
        byte directionality;
        takeFocusaToIllA takefocusatoilla = new takeFocusaToIllA(charSequence);
        takefocusatoilla.serializer = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = takefocusatoilla.serializer;
            if (i4 < takefocusatoilla.IconCompatParcelizer && i == 0) {
                CharSequence charSequence2 = takefocusatoilla.write;
                char cCharAt = charSequence2.charAt(i4);
                takefocusatoilla.RemoteActionCompatParcelizer = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i5 = takefocusatoilla.serializer;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(charSequence2, i5);
                    takefocusatoilla.serializer = Character.charCount(iCodePointAt) + takefocusatoilla.serializer;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    takefocusatoilla.serializer = i5 + 1;
                    char c = takefocusatoilla.RemoteActionCompatParcelizer;
                    directionality = c < 1792 ? takeFocusaToIllA.read[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (takefocusatoilla.serializer > 0) {
                    switch (takefocusatoilla.RemoteActionCompatParcelizer()) {
                        case 14:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case 16:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case 18:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    static {
        setDropDownVerticalOffset setdropdownverticaloffset = traverseAncestorsIncludingSelfQFhIj7k.RemoteActionCompatParcelizer;
        IconCompatParcelizer = Character.toString((char) 8206);
        serializer = Character.toString((char) 8207);
        write = new FocusOwnerImpl(false);
        RemoteActionCompatParcelizer = new FocusOwnerImpl(true);
    }

    public final SpannableStringBuilder write(CharSequence charSequence) {
        String str;
        setDropDownVerticalOffset setdropdownverticaloffset = traverseAncestorsIncludingSelfQFhIj7k.RemoteActionCompatParcelizer;
        if (charSequence == null) {
            return null;
        }
        boolean zWrite = setdropdownverticaloffset.write(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zWrite2 = (zWrite ? traverseAncestorsIncludingSelfQFhIj7k.IconCompatParcelizer : traverseAncestorsIncludingSelfQFhIj7k.serializer).write(charSequence.length(), charSequence);
        String str2 = serializer;
        String str3 = IconCompatParcelizer;
        boolean z = this.read;
        if (z || !(zWrite2 || read(charSequence) == 1)) {
            str = (!z || (zWrite2 && read(charSequence) != -1)) ? "" : str2;
        } else {
            str = str3;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zWrite != z) {
            spannableStringBuilder.append(zWrite ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zWrite3 = (zWrite ? traverseAncestorsIncludingSelfQFhIj7k.IconCompatParcelizer : traverseAncestorsIncludingSelfQFhIj7k.serializer).write(charSequence.length(), charSequence);
        if (!z && (zWrite3 || IconCompatParcelizer(charSequence) == 1)) {
            str2 = str3;
        } else if (!z || (zWrite3 && IconCompatParcelizer(charSequence) != -1)) {
            str2 = "";
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
