package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class WorkDatabase_Impl {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ WorkDatabase_Impl[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public static final WorkDatabase_Impl REQUIRED_NOT_WORKING = new WorkDatabase_Impl("REQUIRED_NOT_WORKING", 0);
    public static final WorkDatabase_Impl REQUIRED_PREPARING_TO_WORK = new WorkDatabase_Impl("REQUIRED_PREPARING_TO_WORK", 1);
    public static final WorkDatabase_Impl REQUIRED_ON_BREAK = new WorkDatabase_Impl("REQUIRED_ON_BREAK", 2);
    public static final WorkDatabase_Impl REQUIRED_SUSPENDED = new WorkDatabase_Impl("REQUIRED_SUSPENDED", 3);
    public static final WorkDatabase_Impl NOT_REQUIRED_WORKING = new WorkDatabase_Impl("NOT_REQUIRED_WORKING", 4);
    public static final WorkDatabase_Impl NOT_REQUIRED_FEATURE_DISABLED = new WorkDatabase_Impl("NOT_REQUIRED_FEATURE_DISABLED", 5);

    private WorkDatabase_Impl(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    static {
        WorkDatabase_Impl[] workDatabase_ImplArr$values = $values();
        $VALUES = workDatabase_ImplArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) workDatabase_ImplArr$values);
        int i = read + 79;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static WorkDatabase_Impl valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) Enum.valueOf(WorkDatabase_Impl.class, str);
        int i4 = IconCompatParcelizer + 21;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return workDatabase_Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static WorkDatabase_Impl[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        WorkDatabase_Impl[] workDatabase_ImplArr = (WorkDatabase_Impl[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 53;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return workDatabase_ImplArr;
    }

    private static final /* synthetic */ WorkDatabase_Impl[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        WorkDatabase_Impl[] workDatabase_ImplArr = {REQUIRED_NOT_WORKING, REQUIRED_PREPARING_TO_WORK, REQUIRED_ON_BREAK, REQUIRED_SUSPENDED, NOT_REQUIRED_WORKING, NOT_REQUIRED_FEATURE_DISABLED};
        int i5 = i3 + 117;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return workDatabase_ImplArr;
    }
}
