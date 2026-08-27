package o;

/* JADX INFO: loaded from: classes.dex */
public final class getPhoneCountryCode implements updateBuffersOnDisappeared {
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public getPersonMiddleInitial write;

    @Override // o.updateBuffersOnDisappeared
    public final void onAbandoned() {
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onRemembered() {
        this.write = (getPersonMiddleInitial) this.serializer.invoke(getPhoneNumberNational.RemoteActionCompatParcelizer);
    }

    public getPhoneCountryCode(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onForgotten() {
        getPersonMiddleInitial getpersonmiddleinitial = this.write;
        if (getpersonmiddleinitial != null) {
            getpersonmiddleinitial.dispose();
        }
        this.write = null;
    }
}
