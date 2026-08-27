package o;

import com.roadrunner.rider.state.quests.data.QuestStatus;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class buildInfoPackage {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    static {
        int[] iArr = new int[QuestStatus.values().length];
        try {
            iArr[QuestStatus.ONGOING.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 15;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QuestStatus.FAILING.ordinal()] = 2;
            int i4 = serializer + 69;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[QuestStatus.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
        int i7 = serializer + 37;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }
}
