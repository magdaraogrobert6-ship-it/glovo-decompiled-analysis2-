package o;

import com.google.android.gms.oss.licenses.zzm;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativePaintannotations {
    public abstract zzm serializer(int i, getNativeAlpha getnativealpha);

    public static getNativeAntiAlias serializer(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        return new getNativeAntiAlias(accessisrendernodecompatiblecp, ((asFrameworkPaint) accessisrendernodecompatiblecp).getViewModelStore());
    }
}
