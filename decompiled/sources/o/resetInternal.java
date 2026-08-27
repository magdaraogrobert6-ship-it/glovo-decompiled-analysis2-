package o;

import com.roadrunner.instant.shifts.presentation.GetInstantShiftUiState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class resetInternal extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int serializer;
    public boolean IconCompatParcelizer;
    public final /* synthetic */ GetInstantShiftUiState RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public resetInternal(GetInstantShiftUiState getInstantShiftUiState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = getInstantShiftUiState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 55;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object instantShiftsUiState = this.RemoteActionCompatParcelizer.getInstantShiftsUiState(false, this);
        int i4 = MediaDescriptionCompat + 95;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return instantShiftsUiState;
    }
}
