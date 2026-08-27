package androidx.camera.core.internal.compat.quirk;

import android.util.Pair;
import java.util.Collections;
import java.util.HashSet;
import o.CameraUpdateException;

/* JADX INFO: loaded from: classes.dex */
public class CaptureFailedRetryQuirk implements CameraUpdateException {
    public static final HashSet RemoteActionCompatParcelizer = new HashSet(Collections.singletonList(Pair.create("SAMSUNG", "SM-G981U1")));
}
