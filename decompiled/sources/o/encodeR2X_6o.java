package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class encodeR2X_6o {
    public static HitPathTrackeraddHitPath1 serializer;

    public static String IconCompatParcelizer(getClipMetadata getclipmetadata) {
        StringBuilder sb = new StringBuilder(getclipmetadata.RatingCompat());
        for (int i = 0; i < getclipmetadata.RatingCompat(); i++) {
            byte bRemoteActionCompatParcelizer = getclipmetadata.RemoteActionCompatParcelizer(i);
            if (bRemoteActionCompatParcelizer == 34) {
                sb.append("\\\"");
            } else if (bRemoteActionCompatParcelizer == 39) {
                sb.append("\\'");
            } else if (bRemoteActionCompatParcelizer != 92) {
                switch (bRemoteActionCompatParcelizer) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
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
                        if (bRemoteActionCompatParcelizer < 32 || bRemoteActionCompatParcelizer > 126) {
                            sb.append('\\');
                            sb.append((char) (((bRemoteActionCompatParcelizer >>> 6) & 3) + 48));
                            sb.append((char) (((bRemoteActionCompatParcelizer >>> 3) & 7) + 48));
                            sb.append((char) ((bRemoteActionCompatParcelizer & 7) + 48));
                        } else {
                            sb.append((char) bRemoteActionCompatParcelizer);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String RemoteActionCompatParcelizer(String str) {
        return IconCompatParcelizer(getClipMetadata.RemoteActionCompatParcelizer(str));
    }
}
