package o;

import com.roadrunner.instant.shifts.presentation.InstantShiftsUiModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class EmptyResultSetException {
    private static int RemoteActionCompatParcelizer = 0;
    public static final /* synthetic */ int[] read;
    private static int serializer = 1;

    static {
        int[] iArr = new int[InstantShiftsUiModel.read.values().length];
        try {
            iArr[InstantShiftsUiModel.read.BOOK_SHIFT.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 13;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        read = iArr;
        int i4 = serializer + 79;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
