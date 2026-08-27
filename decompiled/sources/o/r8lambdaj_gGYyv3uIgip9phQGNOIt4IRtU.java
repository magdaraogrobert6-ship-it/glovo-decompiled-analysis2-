package o;

import com.sentiance.sdk.authentication.UserCreationType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r8lambdaj_gGYyv3uIgip9phQGNOIt4IRtU {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[UserCreationType.values().length];
        IconCompatParcelizer = iArr;
        try {
            iArr[UserCreationType.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IconCompatParcelizer[UserCreationType.HARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
