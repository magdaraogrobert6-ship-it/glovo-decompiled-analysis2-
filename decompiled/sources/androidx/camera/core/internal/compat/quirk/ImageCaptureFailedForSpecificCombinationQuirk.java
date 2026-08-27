package androidx.camera.core.internal.compat.quirk;

import androidx.camera.core.UseCase;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.AuthenticatorUtils;
import o.CameraUpdateException;
import o.ImageUtilCodecFailedException;
import o.VideoCapture;
import o.setNavigationOnClickListener;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements CameraUpdateException {
    public static final HashSet serializer = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean RemoteActionCompatParcelizer(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() == 3) {
            Iterator it = linkedHashSet.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (it.hasNext()) {
                UseCase useCase = (UseCase) it.next();
                if (useCase instanceof AuthenticatorUtils) {
                    z = true;
                } else if (useCase instanceof setNavigationOnClickListener) {
                    z3 = true;
                } else if (useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(ImageUtilCodecFailedException.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus)) {
                    z2 = useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write() == VideoCapture.VIDEO_CAPTURE;
                }
            }
            if (z && z2 && z3) {
                return true;
            }
        }
        return false;
    }
}
