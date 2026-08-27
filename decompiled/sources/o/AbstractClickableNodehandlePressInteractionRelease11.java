package o;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlinx.coroutines.channels.ProducerCoroutine;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AbstractClickableNodehandlePressInteractionRelease11 implements unregisterComponentCallback {
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ AbstractClickableNodehandlePressInteractionRelease11(int i, Object obj) {
        this.serializer = i;
        this.read = obj;
    }

    @Override // o.unregisterComponentCallback
    public final void RemoteActionCompatParcelizer(Object obj) {
        HashMap map;
        int i = this.serializer;
        Object obj2 = this.read;
        if (i == 0) {
            ((androidx.lifecycle.CoroutineLiveData) obj2).RemoteActionCompatParcelizer(obj);
            return;
        }
        int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                ((InlineChildren) obj2).invoke(obj);
                return;
            } else if (i != 3) {
                ((ProducerCoroutine) ((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj2)).b_(obj);
                return;
            } else {
                ((PopulateViewStructure_androidKtpopulate7) obj2).setValue(obj);
                return;
            }
        }
        androidx.navigation.NavArgsLazy navArgsLazy = (androidx.navigation.NavArgsLazy) obj2;
        toString tostring = (toString) obj;
        synchronized (((HashMap) navArgsLazy.read)) {
            map = new HashMap((HashMap) navArgsLazy.read);
        }
        for (Map.Entry entry : map.entrySet()) {
            ((Executor) entry.getValue()).execute(new Crossfade(entry, i2, tostring));
        }
    }
}
