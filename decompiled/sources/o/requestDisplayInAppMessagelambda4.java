package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class requestDisplayInAppMessagelambda4 implements resumeWebviewIfNecessarylambda0 {
    public final AtomicReference serializer;

    @Override // o.resumeWebviewIfNecessarylambda0
    public final Iterator iterator() {
        resumeWebviewIfNecessarylambda0 resumewebviewifnecessarylambda0 = (resumeWebviewIfNecessarylambda0) this.serializer.getAndSet(null);
        if (resumewebviewifnecessarylambda0 != null) {
            return resumewebviewifnecessarylambda0.iterator();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("This sequence can be consumed only once.");
        return null;
    }

    public requestDisplayInAppMessagelambda4(resumeWebviewIfNecessarylambda0 resumewebviewifnecessarylambda0) {
        this.serializer = new AtomicReference(resumewebviewifnecessarylambda0);
    }
}
