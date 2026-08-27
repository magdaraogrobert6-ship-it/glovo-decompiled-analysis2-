package o;

/* JADX INFO: loaded from: classes.dex */
public final class getDropDownWidth implements Runnable {
    public final /* synthetic */ int serializer;
    public final java.lang.ref.WeakReference write;

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        java.lang.ref.WeakReference weakReference = this.write;
        if (i == 0) {
            if (weakReference.get() != null) {
                ((getPrompt) weakReference.get()).MediaSessionCompatResultReceiverWrapper = false;
            }
        } else if (i != 1) {
            if (weakReference.get() != null) {
                ((getPrompt) weakReference.get()).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = false;
            }
        } else if (weakReference.get() != null) {
            ((androidx.biometric.BiometricFragment) weakReference.get()).MediaMetadataCompat();
        }
    }

    public getDropDownWidth(getPrompt getprompt, int i) {
        this.serializer = i;
        if (i != 2) {
            this.write = new java.lang.ref.WeakReference(getprompt);
        } else {
            this.write = new java.lang.ref.WeakReference(getprompt);
        }
    }

    public getDropDownWidth(androidx.biometric.BiometricFragment biometricFragment) {
        this.serializer = 1;
        this.write = new java.lang.ref.WeakReference(biometricFragment);
    }
}
