package androidx.biometric;

import o.getPrompt;
import o.setPrompt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BiometricFragment$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ BiometricFragment read;
    public final /* synthetic */ CharSequence write;

    public /* synthetic */ BiometricFragment$$ExternalSyntheticLambda7(BiometricFragment biometricFragment, int i, CharSequence charSequence, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.read = biometricFragment;
        this.IconCompatParcelizer = i;
        this.write = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RemoteActionCompatParcelizer;
        CharSequence charSequence = this.write;
        int i2 = this.IconCompatParcelizer;
        BiometricFragment biometricFragment = this.read;
        if (i != 0) {
            biometricFragment.IconCompatParcelizer(i2, charSequence);
            return;
        }
        getPrompt getprompt = biometricFragment.write;
        if (getprompt.RatingCompat == null) {
            getprompt.RatingCompat = new setPrompt();
        }
        getprompt.RatingCompat.RemoteActionCompatParcelizer(i2, charSequence);
    }
}
