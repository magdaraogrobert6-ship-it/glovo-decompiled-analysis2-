package o;

import com.sentiance.protobuf.ByteString;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ContentCardsUpdatedEvent {
    public static String RemoteActionCompatParcelizer(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.serializer());
        for (int i = 0; i < byteString.serializer(); i++) {
            byte bSerializer = byteString.serializer(i);
            if (bSerializer == 34) {
                sb.append("\\\"");
            } else if (bSerializer == 39) {
                sb.append("\\'");
            } else if (bSerializer != 92) {
                switch (bSerializer) {
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
                        if (bSerializer < 32 || bSerializer > 126) {
                            sb.append('\\');
                            sb.append((char) (((bSerializer >>> 6) & 3) + 48));
                            sb.append((char) (((bSerializer >>> 3) & 7) + 48));
                            sb.append((char) ((bSerializer & 7) + 48));
                        } else {
                            sb.append((char) bSerializer);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final void read(String str, Throwable th) {
        SentryLogcatAdapter.read("ComposeInternal", str, th);
    }
}
