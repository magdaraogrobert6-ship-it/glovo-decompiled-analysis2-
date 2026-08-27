package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class FutureScheduler {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ FutureScheduler[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public static final FutureScheduler ContentEdge = new FutureScheduler("ContentEdge", 0);
    public static final FutureScheduler NotZoomed = new FutureScheduler("NotZoomed", 1);

    private FutureScheduler(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        int i = 2 % 2;
        int i2 = write + 121;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i4 = 54 / 0;
        } else {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        }
        int i5 = i3 + 9;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        FutureScheduler[] futureSchedulerArr$values = $values();
        $VALUES = futureSchedulerArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) futureSchedulerArr$values);
        int i = IconCompatParcelizer + 13;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ FutureScheduler[] $values() {
        FutureScheduler[] futureSchedulerArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 121;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            FutureScheduler futureScheduler = ContentEdge;
            FutureScheduler futureScheduler2 = NotZoomed;
            futureSchedulerArr = new FutureScheduler[3];
            futureSchedulerArr[0] = futureScheduler;
            futureSchedulerArr[0] = futureScheduler2;
        } else {
            futureSchedulerArr = new FutureScheduler[]{ContentEdge, NotZoomed};
        }
        int i4 = i2 + 47;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return futureSchedulerArr;
    }

    public static FutureScheduler valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        FutureScheduler futureScheduler = (FutureScheduler) Enum.valueOf(FutureScheduler.class, str);
        int i3 = RemoteActionCompatParcelizer + 43;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 8 / 0;
        }
        return futureScheduler;
    }

    public static FutureScheduler[] values() {
        int i = 2 % 2;
        int i2 = write + 29;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        FutureScheduler[] futureSchedulerArr = (FutureScheduler[]) $VALUES.clone();
        int i3 = RemoteActionCompatParcelizer + 13;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return futureSchedulerArr;
    }
}
