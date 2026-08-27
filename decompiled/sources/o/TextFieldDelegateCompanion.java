package o;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldDelegateCompanion implements getStringId9Hzcbyc {
    @Override // o.getStringId9Hzcbyc
    public final float serializer(float f, float f2, float f3) {
        float fAbs = Math.abs((f2 + f) - f);
        float f4 = (0.3f * f3) - (0.0f * fAbs);
        if ((fAbs <= f3) && f3 - f4 < fAbs) {
            f4 = f3 - fAbs;
        }
        return f - f4;
    }
}
