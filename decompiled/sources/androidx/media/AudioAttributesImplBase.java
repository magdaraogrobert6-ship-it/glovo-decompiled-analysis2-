package androidx.media;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public int write;

    public final String toString() {
        String strM;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.read != -1) {
            sb.append(" stream=");
            sb.append(this.read);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.RemoteActionCompatParcelizer;
        int i2 = AudioAttributesCompat.serializer;
        switch (i) {
            case 0:
                strM = "USAGE_UNKNOWN";
                break;
            case 1:
                strM = "USAGE_MEDIA";
                break;
            case 2:
                strM = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strM = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM = "USAGE_ALARM";
                break;
            case 5:
                strM = "USAGE_NOTIFICATION";
                break;
            case 6:
                strM = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strM = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strM = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strM = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strM = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM = "USAGE_GAME";
                break;
            case 15:
            default:
                strM = c8$$ExternalSyntheticOutline0.m(i, "unknown usage ");
                break;
            case 16:
                strM = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strM);
        sb.append(" content=");
        sb.append(this.write);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.serializer).toUpperCase());
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.write == audioAttributesImplBase.write) {
            int i2 = this.serializer;
            int i3 = audioAttributesImplBase.serializer;
            int i4 = audioAttributesImplBase.read;
            if (i4 == -1) {
                int i5 = audioAttributesImplBase.RemoteActionCompatParcelizer;
                int i6 = AudioAttributesCompat.serializer;
                if ((i3 & 1) != 1) {
                    i = 4;
                    if ((i3 & 4) != 4) {
                        switch (i5) {
                            case 2:
                                i = 0;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i = 5;
                                break;
                            case 6:
                                i = 2;
                                break;
                            case 11:
                                i = 10;
                                break;
                            case 12:
                            default:
                                i = 3;
                                break;
                            case 13:
                                i = 1;
                                break;
                        }
                    } else {
                        i = 6;
                    }
                } else {
                    i = 7;
                }
            } else {
                i = i4;
            }
            if (i == 6) {
                i3 |= 4;
            } else if (i == 7) {
                i3 |= 1;
            }
            if (i2 == (i3 & 273) && this.RemoteActionCompatParcelizer == audioAttributesImplBase.RemoteActionCompatParcelizer && this.read == i4) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.write), Integer.valueOf(this.serializer), Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.read)});
    }
}
