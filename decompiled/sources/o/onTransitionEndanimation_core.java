package o;

import android.media.MediaFormat;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class onTransitionEndanimation_core implements Runnable {
    public final /* synthetic */ animateDecay read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ onTransitionEndanimation_core(animateDecay animatedecay, MediaFormat mediaFormat) {
        this.serializer = 1;
        this.read = animatedecay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        if (i == 0) {
            this.read.getClass();
        } else if (i != 1) {
            this.read.MediaSessionCompatResultReceiverWrapper();
        } else {
            this.read.IconCompatParcelizer(new seekAnimationsanimation_core(0));
        }
    }

    public /* synthetic */ onTransitionEndanimation_core(animateDecay animatedecay, int i) {
        this.serializer = i;
        this.read = animatedecay;
    }
}
