package o;

import kotlinx.coroutines.channels.ProducerCoroutine;

/* JADX INFO: loaded from: classes.dex */
public final class getParent {
    public final /* synthetic */ InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 RemoteActionCompatParcelizer;
    public final /* synthetic */ getMax write;

    public final void write(Object obj) {
        Object rebalanceVar;
        getMax getmax = this.write;
        int i = getmax.read;
        boolean zBooleanValue = (i == 0 || i != 1) ? ((Boolean) obj).booleanValue() : ((Boolean) obj).booleanValue();
        if (!zBooleanValue) {
            int i2 = getmax.read;
            int i3 = (i2 == 0 || i2 != 1) ? getmax.IconCompatParcelizer : getmax.IconCompatParcelizer;
            rebalanceVar = new rebalance(i3);
        } else {
            rebalanceVar = rotateRight.read;
        }
        ProducerCoroutine producerCoroutine = (ProducerCoroutine) this.RemoteActionCompatParcelizer;
        producerCoroutine.getClass();
        producerCoroutine.b_(rebalanceVar);
    }

    public getParent(getMax getmax, InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) {
        this.write = getmax;
        this.RemoteActionCompatParcelizer = inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
    }
}
