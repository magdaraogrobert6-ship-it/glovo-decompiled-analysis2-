package androidx.camera.camera2.internal.compat.quirk;

import androidx.navigation.NavArgsLazy;
import java.util.List;
import o.CameraUpdateException;
import o.getThumbTintList;

/* JADX INFO: loaded from: classes.dex */
public class CamcorderProfileResolutionQuirk implements CameraUpdateException {
    public List IconCompatParcelizer = null;
    public final NavArgsLazy read;

    public CamcorderProfileResolutionQuirk(getThumbTintList getthumbtintlist) {
        this.read = getthumbtintlist.serializer();
    }
}
