package o;

import com.roadrunner.liveness.recording.presentation.RecordingViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setSize extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ RecordingViewModel RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setSize(RecordingViewModel recordingViewModel, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = recordingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objAccess$showWrongMovementMade = RecordingViewModel.access$showWrongMovementMade(this.RemoteActionCompatParcelizer, null, this);
        int i4 = IconCompatParcelizer + 87;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objAccess$showWrongMovementMade;
        }
        obj2.hashCode();
        throw null;
    }
}
