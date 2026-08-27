package o;

import com.roadrunner.liveness.recording.presentation.RecordingViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setProgressBackgroundColorSchemeResource extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final /* synthetic */ RecordingViewModel serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setProgressBackgroundColorSchemeResource(RecordingViewModel recordingViewModel, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = recordingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objTakeImage = this.serializer.takeImage(this, null);
        int i4 = MediaDescriptionCompat + 7;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objTakeImage;
        }
        obj2.hashCode();
        throw null;
    }
}
