package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ColorSpace extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ accessgetXyzcp IconCompatParcelizer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ColorSpace(accessgetXyzcp accessgetxyzcp, int i) {
        super(0);
        this.write = i;
        this.IconCompatParcelizer = accessgetxyzcp;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.write;
        accessgetXyzcp accessgetxyzcp = this.IconCompatParcelizer;
        boolean z = true;
        if (i == 0) {
            return Boolean.valueOf(((Throwable) ((onShowTranslationui) accessgetxyzcp.serializer).getValue()) != null);
        }
        if (i != 1) {
            if (i != 2) {
                return Boolean.valueOf(((StrokeJoinCompanion) ((onShowTranslationui) accessgetxyzcp.MediaDescriptionCompat).getValue()) != null);
            }
            return Boolean.valueOf(((StrokeJoinCompanion) ((onShowTranslationui) accessgetxyzcp.MediaDescriptionCompat).getValue()) == null && ((Throwable) ((onShowTranslationui) accessgetxyzcp.serializer).getValue()) == null);
        }
        if (((StrokeJoinCompanion) ((onShowTranslationui) accessgetxyzcp.MediaDescriptionCompat).getValue()) == null && ((Throwable) ((onShowTranslationui) accessgetxyzcp.serializer).getValue()) == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
