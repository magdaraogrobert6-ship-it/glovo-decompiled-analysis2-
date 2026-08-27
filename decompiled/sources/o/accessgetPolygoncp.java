package o;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetPolygoncp {
    public final /* synthetic */ int write;

    public /* synthetic */ accessgetPolygoncp(int i) {
        this.write = i;
    }

    public final PathDefaultImpls IconCompatParcelizer(Object obj, getBlurRadiusannotations getblurradiusannotations) {
        int i = this.write;
        if (i == 0) {
            return coil3.UriKt.IconCompatParcelizer(((File) obj).getPath());
        }
        if (i == 1) {
            return xor.IconCompatParcelizer((Uri) obj);
        }
        if (i == 2) {
            return coil3.UriKt.IconCompatParcelizer(((RecyclableBufferedInputStream) obj).bytes.RatingCompat());
        }
        if (i != 3) {
            return coil3.UriKt.write((String) obj);
        }
        int iIntValue = ((Number) obj).intValue();
        Context context = getblurradiusannotations.write;
        try {
            if (context.getResources().getResourceEntryName(iIntValue) != null) {
                return coil3.UriKt.write("android.resource://" + context.getPackageName() + "/" + iIntValue);
            }
        } catch (Resources.NotFoundException unused) {
        }
        return null;
    }
}
