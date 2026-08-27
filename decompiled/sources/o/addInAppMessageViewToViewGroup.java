package o;

/* JADX INFO: loaded from: classes4.dex */
public final class addInAppMessageViewToViewGroup implements createClickListener {
    public final createButtonClickListenerslambda00[] write;

    @Override // o.createClickListener
    public final void RemoteActionCompatParcelizer(Throwable th) {
        read();
    }

    public final void read() {
        for (createButtonClickListenerslambda00 createbuttonclicklistenerslambda00 : this.write) {
            setAndStartAnimation setandstartanimation = createbuttonclicklistenerslambda00.serializer;
            if (setandstartanimation == null) {
                removeNodeAtDepth.serializer("handle");
                throw null;
            }
            setandstartanimation.RemoteActionCompatParcelizer();
        }
    }

    public addInAppMessageViewToViewGroup(createButtonClickListenerslambda00[] createbuttonclicklistenerslambda00Arr) {
        this.write = createbuttonclicklistenerslambda00Arr;
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.write + ']';
    }
}
