package o;

import bo.app.w4$$ExternalSyntheticLambda0;
import com.roadrunner.home.CreateHomeScope;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class WrappedComposition implements Callable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ WrappedComposition(Object obj, Object obj2, Object obj3, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer = obj2;
        this.write = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        Object obj2 = this.serializer;
        Object obj3 = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return onChange.write((String) obj3, (String) obj2, (String) obj);
        }
        return ((setCoordinatesAccessed) obj3).write.submit(new w4$$ExternalSyntheticLambda0((Callable) obj2, 14, (CreateHomeScope) obj));
    }
}
