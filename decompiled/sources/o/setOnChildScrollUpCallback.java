package o;

import com.roadrunner.liveness.recording.presentation.RecordingViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setOnChildScrollUpCallback extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ RecordingViewModel serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setOnChildScrollUpCallback(RecordingViewModel recordingViewModel, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = recordingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objAccess$showCorrectMovementMade = RecordingViewModel.access$showCorrectMovementMade(this.serializer, this);
        int i4 = write + 53;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$showCorrectMovementMade;
    }
}
