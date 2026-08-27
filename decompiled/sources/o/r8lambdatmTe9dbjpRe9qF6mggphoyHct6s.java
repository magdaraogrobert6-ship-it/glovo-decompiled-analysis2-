package o;

/* JADX INFO: loaded from: classes4.dex */
public enum r8lambdatmTe9dbjpRe9qF6mggphoyHct6s {
    NO_ERROR(0, -1, 0),
    PROTOCOL_ERROR(1, 1, 1),
    INVALID_STREAM(1, 2, -1),
    UNSUPPORTED_VERSION(1, 4, -1),
    STREAM_IN_USE(1, 8, -1),
    STREAM_ALREADY_CLOSED(1, 9, -1),
    INTERNAL_ERROR(2, 6, 2),
    FLOW_CONTROL_ERROR(3, 7, -1),
    STREAM_CLOSED(5, -1, -1),
    FRAME_TOO_LARGE(6, 11, -1),
    REFUSED_STREAM(7, 3, -1),
    CANCEL(8, 5, -1),
    COMPRESSION_ERROR(9, -1, -1),
    CONNECT_ERROR(10, -1, -1),
    ENHANCE_YOUR_CALM(11, -1, -1),
    INADEQUATE_SECURITY(12, -1, -1),
    HTTP_1_1_REQUIRED(13, -1, -1),
    INVALID_CREDENTIALS(-1, 10, -1);

    public final int httpCode;
    public final int spdyGoAwayCode;
    public final int spdyRstCode;

    r8lambdatmTe9dbjpRe9qF6mggphoyHct6s(int i, int i2, int i3) {
        this.httpCode = i;
        this.spdyRstCode = i2;
        this.spdyGoAwayCode = i3;
    }

    public static r8lambdatmTe9dbjpRe9qF6mggphoyHct6s fromHttp2(int i) {
        for (r8lambdatmTe9dbjpRe9qF6mggphoyHct6s r8lambdatmte9dbjpre9qf6mggphoyhct6s : values()) {
            if (r8lambdatmte9dbjpre9qf6mggphoyhct6s.httpCode == i) {
                return r8lambdatmte9dbjpre9qf6mggphoyhct6s;
            }
        }
        return null;
    }

    public static r8lambdatmTe9dbjpRe9qF6mggphoyHct6s fromSpdy3Rst(int i) {
        for (r8lambdatmTe9dbjpRe9qF6mggphoyHct6s r8lambdatmte9dbjpre9qf6mggphoyhct6s : values()) {
            if (r8lambdatmte9dbjpre9qf6mggphoyhct6s.spdyRstCode == i) {
                return r8lambdatmte9dbjpre9qf6mggphoyhct6s;
            }
        }
        return null;
    }

    public static r8lambdatmTe9dbjpRe9qF6mggphoyHct6s fromSpdyGoAway(int i) {
        for (r8lambdatmTe9dbjpRe9qF6mggphoyHct6s r8lambdatmte9dbjpre9qf6mggphoyhct6s : values()) {
            if (r8lambdatmte9dbjpre9qf6mggphoyhct6s.spdyGoAwayCode == i) {
                return r8lambdatmte9dbjpre9qf6mggphoyhct6s;
            }
        }
        return null;
    }
}
