package androidx.camera.camera2.internal.compat.quirk;

import java.util.Arrays;
import java.util.List;
import o.CameraUpdateException;
import o.getThumbTintList;

/* JADX INFO: loaded from: classes.dex */
public class TorchFlashRequiredFor3aUpdateQuirk implements CameraUpdateException {
    public static final List serializer = Arrays.asList("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");
    public final getThumbTintList IconCompatParcelizer;

    public TorchFlashRequiredFor3aUpdateQuirk(getThumbTintList getthumbtintlist) {
        this.IconCompatParcelizer = getthumbtintlist;
    }
}
