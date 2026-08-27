package o;

import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class setRootAutofillId {
    public final CancellableContinuationImpl serializer;
    public final requestAutofillForNode write;

    public final int hashCode() {
        return this.serializer.hashCode() + (this.write.hashCode() * 31);
    }

    public final void write() {
        CancellableContinuationImpl cancellableContinuationImpl = this.serializer;
        if (cancellableContinuationImpl.RemoteActionCompatParcelizer() instanceof onTouchEnded) {
            cancellableContinuationImpl.resumeWith(performAutofill.Dismissed);
        }
    }

    public setRootAutofillId(requestAutofillForNode requestautofillfornode, CancellableContinuationImpl cancellableContinuationImpl) {
        this.write = requestautofillfornode;
        this.serializer = cancellableContinuationImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && setRootAutofillId.class == obj.getClass()) {
            setRootAutofillId setrootautofillid = (setRootAutofillId) obj;
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, setrootautofillid.write}, getCieXyz.write())).booleanValue() && this.serializer == setrootautofillid.serializer;
        }
        return false;
    }
}
