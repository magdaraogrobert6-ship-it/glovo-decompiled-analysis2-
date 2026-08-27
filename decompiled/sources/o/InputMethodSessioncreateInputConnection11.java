package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class InputMethodSessioncreateInputConnection11 {
    public static final InputMethodSessioncreateInputConnection11[] write = new InputMethodSessioncreateInputConnection11[0];
    public int IconCompatParcelizer;
    public InputMethodSessioncreateInputConnection11[] MediaBrowserCompatMediaItem;
    public Map MediaDescriptionCompat;
    public accessgetValueOverridejd MediaMetadataCompat;
    public int[] MediaSessionCompatQueueItem;
    public String RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iDeepHashCode;
        int iHashCode4 = this.MediaMetadataCompat.hashCode();
        int i = accessgetInspectableElementsjd.IconCompatParcelizer[this.MediaMetadataCompat.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            iHashCode = ((this.RemoteActionCompatParcelizer & 32) * 31) + (this.MediaBrowserCompatMediaItem[0].hashCode() * 31);
        } else {
            if (i != 4) {
                if (i == 7 || i == 8) {
                    iDeepHashCode = Arrays.deepHashCode(this.MediaBrowserCompatMediaItem);
                } else if (i == 9) {
                    iDeepHashCode = Arrays.hashCode(this.MediaSessionCompatQueueItem);
                } else if (i == 12) {
                    int i2 = this.read;
                    String str = this.RatingCompat;
                    iHashCode2 = ((str != null ? str.hashCode() : 0) * 31) + (i2 * 31);
                    iHashCode3 = this.MediaBrowserCompatMediaItem[0].hashCode();
                } else if (i != 14) {
                    if (i != 19) {
                        return iHashCode4;
                    }
                    iDeepHashCode = Arrays.hashCode(this.MediaSessionCompatQueueItem);
                } else {
                    iDeepHashCode = this.RemoteActionCompatParcelizer & androidx.compose.ui.graphics.Fields.RotationX;
                }
                iHashCode = iDeepHashCode * 31;
            } else {
                iHashCode2 = (this.IconCompatParcelizer * 31) + (this.serializer * 31);
                iHashCode3 = this.MediaBrowserCompatMediaItem[0].hashCode();
            }
            iHashCode = (iHashCode3 * 31) + iHashCode2;
        }
        return iHashCode + iHashCode4;
    }

    public final int read() {
        int i = this.MediaMetadataCompat == accessgetValueOverridejd.CAPTURE ? this.read : 0;
        InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr = this.MediaBrowserCompatMediaItem;
        if (inputMethodSessioncreateInputConnection11Arr != null) {
            for (InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11 : inputMethodSessioncreateInputConnection11Arr) {
                int i2 = inputMethodSessioncreateInputConnection11.read();
                if (i < i2) {
                    i = i2;
                }
            }
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        write(sb);
        return sb.toString();
    }

    public final void write(StringBuilder sb) {
        int[] iArr = accessgetInspectableElementsjd.IconCompatParcelizer;
        int i = 0;
        switch (iArr[this.MediaMetadataCompat.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11 = this.MediaBrowserCompatMediaItem[0];
                if (inputMethodSessioncreateInputConnection11.MediaMetadataCompat.ordinal() > accessgetValueOverridejd.CAPTURE.ordinal() || (inputMethodSessioncreateInputConnection11.MediaMetadataCompat == accessgetValueOverridejd.LITERAL && inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem.length > 1)) {
                    sb.append("(?:");
                    inputMethodSessioncreateInputConnection11.write(sb);
                    sb.append(')');
                } else {
                    inputMethodSessioncreateInputConnection11.write(sb);
                }
                int i2 = iArr[this.MediaMetadataCompat.ordinal()];
                if (i2 == 1) {
                    sb.append('*');
                } else if (i2 == 2) {
                    sb.append('+');
                } else if (i2 == 3) {
                    sb.append('?');
                } else if (i2 == 4) {
                    sb.append('{');
                    sb.append(this.serializer);
                    if (this.serializer != this.IconCompatParcelizer) {
                        sb.append(',');
                        int i3 = this.IconCompatParcelizer;
                        if (i3 >= 0) {
                            sb.append(i3);
                        }
                    }
                    sb.append('}');
                }
                if ((this.RemoteActionCompatParcelizer & 32) != 0) {
                    sb.append('?');
                }
                break;
            case 5:
                sb.append("[^\\x00-\\x{10FFFF}]");
                break;
            case 6:
                sb.append("(?:)");
                break;
            case 7:
                InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr = this.MediaBrowserCompatMediaItem;
                int length = inputMethodSessioncreateInputConnection11Arr.length;
                while (i < length) {
                    InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection12 = inputMethodSessioncreateInputConnection11Arr[i];
                    if (inputMethodSessioncreateInputConnection12.MediaMetadataCompat == accessgetValueOverridejd.ALTERNATE) {
                        sb.append("(?:");
                        inputMethodSessioncreateInputConnection12.write(sb);
                        sb.append(')');
                    } else {
                        inputMethodSessioncreateInputConnection12.write(sb);
                    }
                    i++;
                }
                break;
            case 8:
                InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr2 = this.MediaBrowserCompatMediaItem;
                int length2 = inputMethodSessioncreateInputConnection11Arr2.length;
                String str = "";
                while (i < length2) {
                    InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection13 = inputMethodSessioncreateInputConnection11Arr2[i];
                    sb.append(str);
                    inputMethodSessioncreateInputConnection13.write(sb);
                    i++;
                    str = HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
                }
                break;
            case 9:
                if ((this.RemoteActionCompatParcelizer & 1) != 0) {
                    sb.append("(?i:");
                }
                int[] iArr2 = this.MediaSessionCompatQueueItem;
                int length3 = iArr2.length;
                while (i < length3) {
                    debugInspectorInfo.IconCompatParcelizer(iArr2[i], sb);
                    i++;
                }
                if ((this.RemoteActionCompatParcelizer & 1) != 0) {
                    sb.append(')');
                }
                break;
            case 10:
                sb.append("(?-s:.)");
                break;
            case 11:
                sb.append("(?s:.)");
                break;
            case 12:
                String str2 = this.RatingCompat;
                if (str2 == null || str2.isEmpty()) {
                    sb.append('(');
                } else {
                    sb.append("(?P<");
                    sb.append(this.RatingCompat);
                    sb.append(">");
                }
                InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection14 = this.MediaBrowserCompatMediaItem[0];
                if (inputMethodSessioncreateInputConnection14.MediaMetadataCompat != accessgetValueOverridejd.EMPTY_MATCH) {
                    inputMethodSessioncreateInputConnection14.write(sb);
                }
                sb.append(')');
                break;
            case 13:
                sb.append("\\A");
                break;
            case 14:
                if ((this.RemoteActionCompatParcelizer & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
                    sb.append("\\z");
                } else {
                    sb.append("(?-m:$)");
                }
                break;
            case 15:
                sb.append('^');
                break;
            case 16:
                sb.append('$');
                break;
            case 17:
                sb.append("\\b");
                break;
            case 18:
                sb.append("\\B");
                break;
            case 19:
                if (this.MediaSessionCompatQueueItem.length % 2 == 0) {
                    sb.append('[');
                    int[] iArr3 = this.MediaSessionCompatQueueItem;
                    if (iArr3.length == 0) {
                        sb.append("^\\x00-\\x{10FFFF}");
                    } else if (iArr3[0] == 0 && iArr3[iArr3.length - 1] == 1114111) {
                        sb.append('^');
                        int i4 = 1;
                        while (true) {
                            int[] iArr4 = this.MediaSessionCompatQueueItem;
                            if (i4 < iArr4.length - 1) {
                                int i5 = iArr4[i4] + 1;
                                int i6 = iArr4[i4 + 1] - 1;
                                if (i5 == 45) {
                                    sb.append('\\');
                                }
                                debugInspectorInfo.IconCompatParcelizer(i5, sb);
                                if (i5 != i6) {
                                    sb.append('-');
                                    if (i6 == 45) {
                                        sb.append('\\');
                                    }
                                    debugInspectorInfo.IconCompatParcelizer(i6, sb);
                                }
                                i4 += 2;
                            }
                        }
                    } else {
                        while (true) {
                            int[] iArr5 = this.MediaSessionCompatQueueItem;
                            if (i < iArr5.length) {
                                int i7 = iArr5[i];
                                int i8 = iArr5[i + 1];
                                if (i7 == 45) {
                                    sb.append('\\');
                                }
                                debugInspectorInfo.IconCompatParcelizer(i7, sb);
                                if (i7 != i8) {
                                    sb.append('-');
                                    if (i8 == 45) {
                                        sb.append('\\');
                                    }
                                    debugInspectorInfo.IconCompatParcelizer(i8, sb);
                                }
                                i += 2;
                            }
                        }
                    }
                    sb.append(']');
                } else {
                    sb.append("[invalid char class]");
                }
                break;
            default:
                sb.append(this.MediaMetadataCompat);
                break;
        }
    }

    public InputMethodSessioncreateInputConnection11(accessgetValueOverridejd accessgetvalueoverridejd) {
        this.MediaMetadataCompat = accessgetvalueoverridejd;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x006b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075 A[RETURN] */
    public final boolean equals(Object obj) {
        if (!(obj instanceof InputMethodSessioncreateInputConnection11)) {
            return false;
        }
        InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11 = (InputMethodSessioncreateInputConnection11) obj;
        accessgetValueOverridejd accessgetvalueoverridejd = this.MediaMetadataCompat;
        if (accessgetvalueoverridejd != inputMethodSessioncreateInputConnection11.MediaMetadataCompat) {
            return false;
        }
        int i = accessgetInspectableElementsjd.IconCompatParcelizer[accessgetvalueoverridejd.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            if ((this.RemoteActionCompatParcelizer & 32) != (inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer & 32) || !this.MediaBrowserCompatMediaItem[0].equals(inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem[0])) {
                return false;
            }
        } else if (i == 4) {
            if ((this.RemoteActionCompatParcelizer & 32) != (inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer & 32) || this.serializer != inputMethodSessioncreateInputConnection11.serializer || this.IconCompatParcelizer != inputMethodSessioncreateInputConnection11.IconCompatParcelizer || !this.MediaBrowserCompatMediaItem[0].equals(inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem[0])) {
                return false;
            }
        } else if (i == 7 || i == 8) {
            if (this.MediaBrowserCompatMediaItem.length == inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem.length) {
                int i2 = 0;
                while (true) {
                    InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr = this.MediaBrowserCompatMediaItem;
                    if (i2 >= inputMethodSessioncreateInputConnection11Arr.length) {
                        break;
                    }
                    if (!inputMethodSessioncreateInputConnection11Arr[i2].equals(inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem[i2])) {
                        return false;
                    }
                    i2++;
                }
            } else {
                return false;
            }
        } else if (i == 9) {
            if (!Arrays.equals(this.MediaSessionCompatQueueItem, inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem)) {
                return false;
            }
        } else {
            if (i == 12) {
                if (this.read == inputMethodSessioncreateInputConnection11.read) {
                    String str = this.RatingCompat;
                    String str2 = inputMethodSessioncreateInputConnection11.RatingCompat;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        if (!this.MediaBrowserCompatMediaItem[0].equals(inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem[0])) {
                        }
                    }
                }
                return false;
            }
            if (i == 14) {
                if ((this.RemoteActionCompatParcelizer & androidx.compose.ui.graphics.Fields.RotationX) != (inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer & androidx.compose.ui.graphics.Fields.RotationX)) {
                    return false;
                }
            } else if (i == 19) {
                if (!Arrays.equals(this.MediaSessionCompatQueueItem, inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem)) {
                    return false;
                }
            }
        }
        return true;
    }

    public InputMethodSessioncreateInputConnection11() {
    }
}
