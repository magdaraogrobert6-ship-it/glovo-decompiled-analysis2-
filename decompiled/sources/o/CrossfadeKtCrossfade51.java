package o;

import com.sentiance.sdk.api.requests.SdkInitConfigRequestReason;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CrossfadeKtCrossfade51 implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ int write = 1;

    public /* synthetic */ CrossfadeKtCrossfade51(AnimatedVisibilityKtAnimatedVisibilityImpl11 animatedVisibilityKtAnimatedVisibilityImpl11, androidx.camera.core.SurfaceRequest surfaceRequest, PreviewGreenTintQuirk previewGreenTintQuirk, boolean z) {
        this.RemoteActionCompatParcelizer = animatedVisibilityKtAnimatedVisibilityImpl11;
        this.read = surfaceRequest;
        this.IconCompatParcelizer = previewGreenTintQuirk;
        this.serializer = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        Object obj = this.IconCompatParcelizer;
        boolean z = this.serializer;
        Object obj2 = this.read;
        Object obj3 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q.RemoteActionCompatParcelizer((SdkInitConfigRequestReason) obj2, (r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj, z);
            return;
        }
        AnimatedVisibilityKtAnimatedVisibilityImpl11 animatedVisibilityKtAnimatedVisibilityImpl11 = (AnimatedVisibilityKtAnimatedVisibilityImpl11) obj3;
        androidx.camera.core.SurfaceRequest surfaceRequest = (androidx.camera.core.SurfaceRequest) obj2;
        PreviewGreenTintQuirk previewGreenTintQuirk = (PreviewGreenTintQuirk) obj;
        androidx.camera.core.SurfaceRequest surfaceRequest2 = animatedVisibilityKtAnimatedVisibilityImpl11.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (surfaceRequest2 != null && !surfaceRequest2.write()) {
            animatedVisibilityKtAnimatedVisibilityImpl11.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer();
        }
        animatedVisibilityKtAnimatedVisibilityImpl11.PlaybackStateCompat = z;
        animatedVisibilityKtAnimatedVisibilityImpl11.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = surfaceRequest;
        animatedVisibilityKtAnimatedVisibilityImpl11.ensureViewModelStore = previewGreenTintQuirk;
        animatedVisibilityKtAnimatedVisibilityImpl11.write(surfaceRequest, previewGreenTintQuirk, true);
    }

    public /* synthetic */ CrossfadeKtCrossfade51(SdkInitConfigRequestReason sdkInitConfigRequestReason, r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q r8lambdazxt1df5niyc198h8rswq6bap4q, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z) {
        this.RemoteActionCompatParcelizer = r8lambdazxt1df5niyc198h8rswq6bap4q;
        this.read = sdkInitConfigRequestReason;
        this.serializer = z;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }
}
