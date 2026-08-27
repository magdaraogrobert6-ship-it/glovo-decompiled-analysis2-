package o;

import com.google.firestore.v1.Value;
import com.google.protobuf.DescriptorProtos$FileOptions;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getKeyInputOLwlOKw {
    public static final getSemanticsOLwlOKwannotations ComponentActivity;
    public static final observeReads IconCompatParcelizer;
    public static final getOnPlacedOLwlOKwannotations MediaBrowserCompatMediaItem;
    public static final getLocalsOLwlOKw MediaDescriptionCompat;
    public static final dispatch MediaMetadataCompat;
    public static final getParentDataOLwlOKw MediaSessionCompatQueueItem;
    public static final dispatch MediaSessionCompatResultReceiverWrapper;
    public static final getRotaryInputOLwlOKw MediaSessionCompatToken;
    public static final dispatch ParcelableVolumeInfo;
    public static final ObserverModifierNodeKt PlaybackStateCompat;
    public static final dispatch PlaybackStateCompatCustomAction;
    public static final getPointerInputOLwlOKwannotations RatingCompat;
    public static final getUnplacedOLwlOKwannotations RemoteActionCompatParcelizer;
    public static final dispatch ResultReceiver;
    public static final dispatch r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public static final dispatch r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public static final accessgetOnObserveReadsChangedcp r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public static final ObserverModifierNodeKt r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public static final getUnplacedOLwlOKw read;
    public static final getParentDataOLwlOKwannotations serializer;
    public static final dispatch write;

    public static final String read(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        while (length > 0) {
            length = str.offsetByCodePoints(length, -1);
            sb.append(Character.toChars(str.codePointAt(length)));
        }
        return sb.toString();
    }

    public static final String write(String str) throws Exception {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (z) {
                if (cCharAt == '\\') {
                    sb.append("\\");
                } else {
                    sb.append(cCharAt);
                }
                z = false;
            } else if (cCharAt == '$') {
                sb.append("\\$");
            } else if (cCharAt == '%') {
                sb.append(".*");
            } else if (cCharAt == '.') {
                sb.append("\\.");
            } else if (cCharAt != '?') {
                switch (cCharAt) {
                    case '(':
                        sb.append("\\(");
                        break;
                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        sb.append("\\)");
                        break;
                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        sb.append("\\*");
                        break;
                    case '+':
                        sb.append("\\+");
                        break;
                    default:
                        switch (cCharAt) {
                            case '[':
                                sb.append("\\[");
                                break;
                            case '\\':
                                z = true;
                                break;
                            case ']':
                                sb.append("\\]");
                                break;
                            case '^':
                                sb.append("\\^");
                                break;
                            case '_':
                                sb.append('.');
                                break;
                            default:
                                switch (cCharAt) {
                                    case '{':
                                        sb.append("\\{");
                                        break;
                                    case '|':
                                        sb.append("\\|");
                                        break;
                                    case '}':
                                        sb.append("\\}");
                                        break;
                                    default:
                                        sb.append(cCharAt);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                sb.append("\\?");
            }
        }
        if (z) {
            throw new Exception("LIKE pattern ends in backslash");
        }
        return sb.toString();
    }

    static {
        Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer = Value.RemoteActionCompatParcelizer.STRING_VALUE;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new accessgetOnObserveReadsChangedcp(remoteActionCompatParcelizer);
        ComponentActivity = new getSemanticsOLwlOKwannotations(remoteActionCompatParcelizer, remoteActionCompatParcelizer);
        MediaSessionCompatToken = new getRotaryInputOLwlOKw(remoteActionCompatParcelizer, remoteActionCompatParcelizer);
        read = new getUnplacedOLwlOKw(remoteActionCompatParcelizer, remoteActionCompatParcelizer);
        RemoteActionCompatParcelizer = new getUnplacedOLwlOKwannotations(Value.RemoteActionCompatParcelizer.BYTES_VALUE, remoteActionCompatParcelizer);
        int i = 0;
        IconCompatParcelizer = new observeReads(remoteActionCompatParcelizer, i);
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new dispatch(28);
        ResultReceiver = new dispatch(29);
        PlaybackStateCompat = new ObserverModifierNodeKt(i);
        dispatch dispatchVar = dispatch.write;
        PlaybackStateCompatCustomAction = dispatchVar;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new dispatch(27);
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new ObserverModifierNodeKt(1);
        write = dispatchVar;
        MediaMetadataCompat = dispatchVar;
        ParcelableVolumeInfo = dispatchVar;
        MediaSessionCompatResultReceiverWrapper = dispatchVar;
        MediaBrowserCompatMediaItem = new getOnPlacedOLwlOKwannotations(remoteActionCompatParcelizer, remoteActionCompatParcelizer);
        MediaDescriptionCompat = new getLocalsOLwlOKw(remoteActionCompatParcelizer, remoteActionCompatParcelizer);
        MediaSessionCompatQueueItem = new getParentDataOLwlOKw(remoteActionCompatParcelizer, remoteActionCompatParcelizer);
        RatingCompat = new getPointerInputOLwlOKwannotations(remoteActionCompatParcelizer, remoteActionCompatParcelizer);
        serializer = new getParentDataOLwlOKwannotations(remoteActionCompatParcelizer, remoteActionCompatParcelizer);
    }

    public static final byte[] serializer(getClipMetadata getclipmetadata) {
        byte[] bArrMediaDescriptionCompat = getclipmetadata.MediaDescriptionCompat();
        int length = bArrMediaDescriptionCompat.length / 2;
        for (int i = 0; i < length; i++) {
            byte b = bArrMediaDescriptionCompat[i];
            bArrMediaDescriptionCompat[i] = bArrMediaDescriptionCompat[(bArrMediaDescriptionCompat.length - i) - 1];
            bArrMediaDescriptionCompat[(bArrMediaDescriptionCompat.length - i) - 1] = b;
        }
        return bArrMediaDescriptionCompat;
    }

    public static final Long IconCompatParcelizer(getBringIntoViewOLwlOKw getbringintoviewolwlokw) {
        Value valueIconCompatParcelizer;
        if (getbringintoviewolwlokw.read()) {
            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw.IconCompatParcelizer();
            if ((valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null) == Value.RemoteActionCompatParcelizer.INTEGER_VALUE && (valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer()) != null) {
                return Long.valueOf(valueIconCompatParcelizer.getIntegerValue());
            }
        }
        return null;
    }
}
