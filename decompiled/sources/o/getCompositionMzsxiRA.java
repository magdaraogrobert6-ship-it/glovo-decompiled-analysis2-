package o;

import com.roadrunner.auth.data.LocalAuthDataSource;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getCompositionMzsxiRA {
    private static int serializer = 1;
    private static int write;
    public final isOpenInternalroom_runtime RemoteActionCompatParcelizer;

    public getCompositionMzsxiRA(isOpenInternalroom_runtime isopeninternalroom_runtime) {
        isopeninternalroom_runtime.getClass();
        this.RemoteActionCompatParcelizer = isopeninternalroom_runtime;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    public final Object IconCompatParcelizer(r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k, TextFieldValueCompanion textFieldValueCompanion, TextFieldValue textFieldValue) throws Throwable {
        SetSelectionCommand setSelectionCommand;
        int i = 2 % 2;
        int i2 = serializer + 59;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j = textFieldValueCompanion.capturedAt;
        Double d = textFieldValueCompanion.longitude;
        Double d2 = textFieldValueCompanion.latitude;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (d2 != null) {
            int i4 = write + 55;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (d != null) {
                setSelectionCommand = new SetSelectionCommand(d2.doubleValue(), d.doubleValue());
            } else {
                setSelectionCommand = null;
            }
        } else {
            setSelectionCommand = null;
        }
        SetComposingRegionCommand setComposingRegionCommand = new SetComposingRegionCommand(j, setSelectionCommand);
        ((inCompatibilityMode) this.RemoteActionCompatParcelizer).getClass();
        Object objWithContext = BuildersKt.withContext(prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, new LocalAuthDataSource.AnonymousClass2(setComposingRegionCommand, r8lambdaerwhggzq_gqgn8cultnvrcshm8k, shortNewsContentCardView, 28), textFieldValue);
        int i5 = write + 29;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return objWithContext;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
