package o;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class ProcessingException {
    public static final Set IconCompatParcelizer;
    public static final Set read;
    public static final Set write = Collections.unmodifiableSet(EnumSet.of(Camera2CameraControlExternalSyntheticLambda1.PASSIVE_FOCUSED, Camera2CameraControlExternalSyntheticLambda1.PASSIVE_NOT_FOCUSED, Camera2CameraControlExternalSyntheticLambda1.LOCKED_FOCUSED, Camera2CameraControlExternalSyntheticLambda1.LOCKED_NOT_FOCUSED));
    public static final Set RemoteActionCompatParcelizer = Collections.unmodifiableSet(EnumSet.of(CaptureRequestOptionsBuilderExternalSyntheticLambda0.CONVERGED, CaptureRequestOptionsBuilderExternalSyntheticLambda0.UNKNOWN));

    static {
        TorchIsClosedAfterImageCapturingQuirk torchIsClosedAfterImageCapturingQuirk = TorchIsClosedAfterImageCapturingQuirk.CONVERGED;
        TorchIsClosedAfterImageCapturingQuirk torchIsClosedAfterImageCapturingQuirk2 = TorchIsClosedAfterImageCapturingQuirk.FLASH_REQUIRED;
        TorchIsClosedAfterImageCapturingQuirk torchIsClosedAfterImageCapturingQuirk3 = TorchIsClosedAfterImageCapturingQuirk.UNKNOWN;
        Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(torchIsClosedAfterImageCapturingQuirk, torchIsClosedAfterImageCapturingQuirk2, torchIsClosedAfterImageCapturingQuirk3));
        read = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(torchIsClosedAfterImageCapturingQuirk2);
        enumSetCopyOf.remove(torchIsClosedAfterImageCapturingQuirk3);
        IconCompatParcelizer = Collections.unmodifiableSet(enumSetCopyOf);
    }
}
