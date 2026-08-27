package o;

import coil3.ImageLoader$Builder;
import com.google.firebase.FirebaseApp;

/* JADX INFO: loaded from: classes2.dex */
public final class getRootannotations implements getColorIntegerOrNulllambda0 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final ImageLoader$Builder write;

    public /* synthetic */ getRootannotations(ImageLoader$Builder imageLoader$Builder, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = imageLoader$Builder;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.RemoteActionCompatParcelizer;
        ImageLoader$Builder imageLoader$Builder = this.write;
        if (i == 0) {
            FirebaseApp firebaseApp = (FirebaseApp) imageLoader$Builder.RemoteActionCompatParcelizer;
            setNativeShader.IconCompatParcelizer(firebaseApp);
            return firebaseApp;
        }
        if (i == 1) {
            accesssetInstancecp accesssetinstancecp = (accesssetInstancecp) imageLoader$Builder.IconCompatParcelizer;
            setNativeShader.IconCompatParcelizer(accesssetinstancecp);
            return accesssetinstancecp;
        }
        if (i != 2) {
            AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0 = (AbstractComposeViewExternalSyntheticLambda0) imageLoader$Builder.serializer;
            setNativeShader.IconCompatParcelizer(abstractComposeViewExternalSyntheticLambda0);
            return abstractComposeViewExternalSyntheticLambda0;
        }
        AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda1 = (AbstractComposeViewExternalSyntheticLambda0) imageLoader$Builder.read;
        setNativeShader.IconCompatParcelizer(abstractComposeViewExternalSyntheticLambda1);
        return abstractComposeViewExternalSyntheticLambda1;
    }
}
