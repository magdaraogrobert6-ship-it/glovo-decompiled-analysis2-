package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import io.grpc.Status;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NO_ERROR' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 {
    private static final /* synthetic */ r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4[] $VALUES;
    public static final r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 CANCEL;
    public static final r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 COMPRESSION_ERROR;
    public static final r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 CONNECT_ERROR;
    public static final r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 ENHANCE_YOUR_CALM;
    public static final r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 FLOW_CONTROL_ERROR;
    public static final r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 FRAME_SIZE_ERROR;
    public static final r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 HTTP_1_1_REQUIRED;
    public static final r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 INADEQUATE_SECURITY;
    public static final r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 INTERNAL_ERROR;
    public static final r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 NO_ERROR;
    public static final r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 PROTOCOL_ERROR;
    public static final r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 REFUSED_STREAM;
    public static final r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 SETTINGS_TIMEOUT;
    public static final r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 STREAM_CLOSED;
    private static final r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4[] codeMap;
    private final int code;
    private final Status status;

    public long code() {
        return this.code;
    }

    public Status status() {
        return this.status;
    }

    static {
        Status status = Status.MediaSessionCompatResultReceiverWrapper;
        r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 r8lambdat4klphjxssfgt768chpjuqqgnh4 = new r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4("NO_ERROR", 0, 0, status);
        NO_ERROR = r8lambdat4klphjxssfgt768chpjuqqgnh4;
        Status status2 = Status.write;
        r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 r8lambdat4klphjxssfgt768chpjuqqgnh5 = new r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4("PROTOCOL_ERROR", 1, 1, status2);
        PROTOCOL_ERROR = r8lambdat4klphjxssfgt768chpjuqqgnh5;
        r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 r8lambdat4klphjxssfgt768chpjuqqgnh6 = new r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4("INTERNAL_ERROR", 2, 2, status2);
        INTERNAL_ERROR = r8lambdat4klphjxssfgt768chpjuqqgnh6;
        r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 r8lambdat4klphjxssfgt768chpjuqqgnh7 = new r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4("FLOW_CONTROL_ERROR", 3, 3, status2);
        FLOW_CONTROL_ERROR = r8lambdat4klphjxssfgt768chpjuqqgnh7;
        r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 r8lambdat4klphjxssfgt768chpjuqqgnh8 = new r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4("SETTINGS_TIMEOUT", 4, 4, status2);
        SETTINGS_TIMEOUT = r8lambdat4klphjxssfgt768chpjuqqgnh8;
        r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 r8lambdat4klphjxssfgt768chpjuqqgnh9 = new r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4("STREAM_CLOSED", 5, 5, status2);
        STREAM_CLOSED = r8lambdat4klphjxssfgt768chpjuqqgnh9;
        r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 r8lambdat4klphjxssfgt768chpjuqqgnh10 = new r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4("FRAME_SIZE_ERROR", 6, 6, status2);
        FRAME_SIZE_ERROR = r8lambdat4klphjxssfgt768chpjuqqgnh10;
        r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 r8lambdat4klphjxssfgt768chpjuqqgnh11 = new r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4("REFUSED_STREAM", 7, 7, status);
        REFUSED_STREAM = r8lambdat4klphjxssfgt768chpjuqqgnh11;
        r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 r8lambdat4klphjxssfgt768chpjuqqgnh12 = new r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4("CANCEL", 8, 8, Status.RemoteActionCompatParcelizer);
        CANCEL = r8lambdat4klphjxssfgt768chpjuqqgnh12;
        r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 r8lambdat4klphjxssfgt768chpjuqqgnh13 = new r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4("COMPRESSION_ERROR", 9, 9, status2);
        COMPRESSION_ERROR = r8lambdat4klphjxssfgt768chpjuqqgnh13;
        r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 r8lambdat4klphjxssfgt768chpjuqqgnh14 = new r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4("CONNECT_ERROR", 10, 10, status2);
        CONNECT_ERROR = r8lambdat4klphjxssfgt768chpjuqqgnh14;
        r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 r8lambdat4klphjxssfgt768chpjuqqgnh15 = new r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4("ENHANCE_YOUR_CALM", 11, 11, Status.MediaSessionCompatQueueItem.IconCompatParcelizer("Bandwidth exhausted"));
        ENHANCE_YOUR_CALM = r8lambdat4klphjxssfgt768chpjuqqgnh15;
        r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 r8lambdat4klphjxssfgt768chpjuqqgnh16 = new r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4("INADEQUATE_SECURITY", 12, 12, Status.MediaMetadataCompat.IconCompatParcelizer("Permission denied as protocol is not secure enough to call"));
        INADEQUATE_SECURITY = r8lambdat4klphjxssfgt768chpjuqqgnh16;
        r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 r8lambdat4klphjxssfgt768chpjuqqgnh17 = new r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4("HTTP_1_1_REQUIRED", 13, 13, Status.ParcelableVolumeInfo);
        HTTP_1_1_REQUIRED = r8lambdat4klphjxssfgt768chpjuqqgnh17;
        $VALUES = new r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4[]{r8lambdat4klphjxssfgt768chpjuqqgnh4, r8lambdat4klphjxssfgt768chpjuqqgnh5, r8lambdat4klphjxssfgt768chpjuqqgnh6, r8lambdat4klphjxssfgt768chpjuqqgnh7, r8lambdat4klphjxssfgt768chpjuqqgnh8, r8lambdat4klphjxssfgt768chpjuqqgnh9, r8lambdat4klphjxssfgt768chpjuqqgnh10, r8lambdat4klphjxssfgt768chpjuqqgnh11, r8lambdat4klphjxssfgt768chpjuqqgnh12, r8lambdat4klphjxssfgt768chpjuqqgnh13, r8lambdat4klphjxssfgt768chpjuqqgnh14, r8lambdat4klphjxssfgt768chpjuqqgnh15, r8lambdat4klphjxssfgt768chpjuqqgnh16, r8lambdat4klphjxssfgt768chpjuqqgnh17};
        codeMap = buildHttp2CodeMap();
    }

    public static r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 forCode(long j) {
        r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4[] r8lambdat4klphjxssfgt768chpjuqqgnh4Arr = codeMap;
        if (j >= r8lambdat4klphjxssfgt768chpjuqqgnh4Arr.length || j < 0) {
            return null;
        }
        return r8lambdat4klphjxssfgt768chpjuqqgnh4Arr[(int) j];
    }

    public static r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 valueOf(String str) {
        return (r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4) Enum.valueOf(r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4.class, str);
    }

    public static r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4[] values() {
        return (r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4[]) $VALUES.clone();
    }

    private r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4(String str, int i, int i2, Status status) {
        super(str, i);
        this.code = i2;
        String str2 = "HTTP/2 error code: " + name();
        this.status = status.IconCompatParcelizer(status.ComponentActivity != null ? ff$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(str2, " ("), status.ComponentActivity, ")") : str2);
    }

    private static r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4[] buildHttp2CodeMap() {
        r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4[] r8lambdat4klphjxssfgt768chpjuqqgnh4ArrValues = values();
        r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4[] r8lambdat4klphjxssfgt768chpjuqqgnh4Arr = new r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4[((int) r8lambdat4klphjxssfgt768chpjuqqgnh4ArrValues[r8lambdat4klphjxssfgt768chpjuqqgnh4ArrValues.length - 1].code()) + 1];
        for (r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 r8lambdat4klphjxssfgt768chpjuqqgnh4 : r8lambdat4klphjxssfgt768chpjuqqgnh4ArrValues) {
            r8lambdat4klphjxssfgt768chpjuqqgnh4Arr[(int) r8lambdat4klphjxssfgt768chpjuqqgnh4.code()] = r8lambdat4klphjxssfgt768chpjuqqgnh4;
        }
        return r8lambdat4klphjxssfgt768chpjuqqgnh4Arr;
    }

    public static Status statusForCode(long j) {
        r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4 r8lambdat4klphjxssfgt768chpjuqqgnh4ForCode = forCode(j);
        if (r8lambdat4klphjxssfgt768chpjuqqgnh4ForCode != null) {
            return r8lambdat4klphjxssfgt768chpjuqqgnh4ForCode.status();
        }
        return Status.serializer(INTERNAL_ERROR.status().PlaybackStateCompat.value()).IconCompatParcelizer("Unrecognized HTTP/2 error code: " + j);
    }
}
