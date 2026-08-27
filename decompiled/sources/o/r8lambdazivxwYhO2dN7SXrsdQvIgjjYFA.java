package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdazivxwYhO2dN7SXrsdQvIgjjYFA implements Runnable {
    public final setResourcePackageName MediaDescriptionCompat;

    public abstract void RemoteActionCompatParcelizer();

    @Override // java.lang.Runnable
    public final void run() {
        setResourcePackageName setresourcepackagename = this.MediaDescriptionCompat;
        setResourcePackageName setresourcepackagenameIconCompatParcelizer = setresourcepackagename.IconCompatParcelizer();
        try {
            RemoteActionCompatParcelizer();
        } finally {
            setresourcepackagename.IconCompatParcelizer(setresourcepackagenameIconCompatParcelizer);
        }
    }

    public r8lambdazivxwYhO2dN7SXrsdQvIgjjYFA(setResourcePackageName setresourcepackagename) {
        this.MediaDescriptionCompat = setresourcepackagename;
    }
}
