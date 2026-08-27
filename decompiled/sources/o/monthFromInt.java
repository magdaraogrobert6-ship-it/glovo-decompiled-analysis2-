package o;

import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class monthFromInt {
    public static final ThreadLocal serializer = new ThreadLocal();
    public final getElevation IconCompatParcelizer;
    public final component23 read;
    public final int write;

    public monthFromInt(getElevation getelevation) {
        TextStreamsKt.serializer(getelevation, "defaultInstance cannot be null");
        this.IconCompatParcelizer = getelevation;
        this.read = getelevation.getParserForType();
        this.write = -1;
    }
}
