package androidx.camera.core.internal.compat.quirk;

import java.util.Arrays;
import java.util.HashSet;
import o.CameraUpdateException;

/* JADX INFO: loaded from: classes.dex */
public class LowMemoryQuirk implements CameraUpdateException {
    public static final HashSet write = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));
}
