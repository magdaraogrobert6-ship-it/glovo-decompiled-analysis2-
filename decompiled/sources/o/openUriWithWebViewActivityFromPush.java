package o;

/* JADX INFO: loaded from: classes4.dex */
public final class openUriWithWebViewActivityFromPush implements getAllUris {
    public static final ThreadLocal RemoteActionCompatParcelizer = new ThreadLocal();

    @Override // o.getAllUris
    public final void RemoteActionCompatParcelizer() {
        RemoteActionCompatParcelizer.remove();
    }

    @Override // o.getAllUris
    public final AddToCustomAttributeArrayStep serializer() {
        return (AddToCustomAttributeArrayStep) RemoteActionCompatParcelizer.get();
    }

    @Override // o.getAllUris
    public final BaseBrazeActionStepCompanionrunOnUser1 write(AddToCustomAttributeArrayStep addToCustomAttributeArrayStep) {
        AddToCustomAttributeArrayStep addToCustomAttributeArrayStepSerializer = serializer();
        RemoteActionCompatParcelizer.set(addToCustomAttributeArrayStep);
        return new UriActionExternalSyntheticLambda4(0, addToCustomAttributeArrayStepSerializer);
    }
}
