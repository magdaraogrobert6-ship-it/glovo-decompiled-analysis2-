package o;

/* JADX INFO: loaded from: classes4.dex */
public final class onCreatelambda1 {
    public setResourcePackageNamelambda0 IconCompatParcelizer;
    public final JsonUtilsExternalSyntheticLambda1 read;
    public final BrazeWebViewActivity serializer;
    public boolean write = false;

    public static void read(onCreatelambda1 oncreatelambda1, setResourcePackageNamelambda0 setresourcepackagenamelambda0) {
        oncreatelambda1.IconCompatParcelizer = setresourcepackagenamelambda0;
        if (setresourcepackagenamelambda0 == setResourcePackageNamelambda0.READY || setresourcepackagenamelambda0 == setResourcePackageNamelambda0.TRANSIENT_FAILURE) {
            oncreatelambda1.write = true;
        } else if (setresourcepackagenamelambda0 == setResourcePackageNamelambda0.IDLE) {
            oncreatelambda1.write = false;
        }
    }

    public onCreatelambda1(JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1, setResourcePackageNamelambda0 setresourcepackagenamelambda0, BrazeWebViewActivity brazeWebViewActivity) {
        this.read = jsonUtilsExternalSyntheticLambda1;
        this.IconCompatParcelizer = setresourcepackagenamelambda0;
        this.serializer = brazeWebViewActivity;
    }
}
