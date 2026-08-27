package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class closeInAppMessageViewlambda2 implements Iterator, displayInAppMessagelambda121 {
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public Object serializer;
    public final Map write;

    @Override // java.util.Iterator
    public void remove() {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        if (i == 1) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.IconCompatParcelizer;
        Map map = this.write;
        if (i == 0) {
            return this.RemoteActionCompatParcelizer < map.size();
        }
        if (i != 1) {
            return this.RemoteActionCompatParcelizer < map.size();
        }
        return this.RemoteActionCompatParcelizer < map.size();
    }

    public closeInAppMessageViewlambda2(Object obj, Map map, int i) {
        this.IconCompatParcelizer = i;
        if (i == 1) {
            this.serializer = obj;
            this.write = map;
        } else if (i != 2) {
            map.getClass();
            this.serializer = obj;
            this.write = map;
        } else {
            map.getClass();
            this.serializer = obj;
            this.write = map;
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.IconCompatParcelizer;
        Map map = this.write;
        Object obj = null;
        if (i == 0) {
            if (hasNext()) {
                obj = this.serializer;
                this.RemoteActionCompatParcelizer++;
                Object obj2 = map.get(obj);
                if (obj2 == null) {
                    throw new ConcurrentModificationException(af$$ExternalSyntheticOutline0.m(obj, "Hash code of an element (", ") has changed after it was added to the persistent set."));
                }
                this.serializer = ((addInAppMessageViewToViewGrouplambda4) obj2).IconCompatParcelizer;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.read();
            }
            return obj;
        }
        if (i != 1) {
            return read();
        }
        if (hasNext()) {
            obj = this.serializer;
            this.RemoteActionCompatParcelizer++;
            Object obj3 = map.get(obj);
            if (obj3 == null) {
                throw new ConcurrentModificationException(af$$ExternalSyntheticOutline0.m(obj, "Hash code of an element (", ") has changed after it was added to the persistent set."));
            }
            this.serializer = ((invokeUv8p0NA) obj3).RemoteActionCompatParcelizer;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
        }
        return obj;
    }

    public addInAppMessageViewToViewGrouplambda2 read() {
        if (hasNext()) {
            Object obj = this.write.get(this.serializer);
            if (obj != null) {
                addInAppMessageViewToViewGrouplambda2 addinappmessageviewtoviewgrouplambda2 = (addInAppMessageViewToViewGrouplambda2) obj;
                this.RemoteActionCompatParcelizer++;
                this.serializer = addinappmessageviewtoviewgrouplambda2.serializer;
                return addinappmessageviewtoviewgrouplambda2;
            }
            throw new ConcurrentModificationException("Hash code of a key (" + this.serializer + ") has changed after it was added to the persistent map.");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read();
        return null;
    }
}
