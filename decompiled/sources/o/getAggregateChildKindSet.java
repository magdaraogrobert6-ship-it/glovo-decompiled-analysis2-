package o;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class getAggregateChildKindSet implements accesspropagateCoordinator {
    public static final SimpleDateFormat read;

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        ((createAndInsertNodeAsChild) obj2).RemoteActionCompatParcelizer(read.format((Date) obj));
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.US);
        read = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
