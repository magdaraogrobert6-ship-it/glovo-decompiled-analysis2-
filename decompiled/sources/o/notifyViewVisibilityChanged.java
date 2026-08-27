package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class notifyViewVisibilityChanged implements isText, r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ {
    public final /* synthetic */ applyUnregisterDisplayedMessageResult read;

    @Override // o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
    public final isInvalidIndex getFunctionDelegate() {
        return this.read;
    }

    @Override // o.isText
    public final float IconCompatParcelizer() {
        return ((Number) this.read.get()).floatValue();
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public notifyViewVisibilityChanged(applyUnregisterDisplayedMessageResult applyunregisterdisplayedmessageresult) {
        this.read = applyunregisterdisplayedmessageresult;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof isText) || !(obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ)) {
            return false;
        }
        return this.read.equals(((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate());
    }
}
