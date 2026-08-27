package androidx.compose.ui.platform;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.resumeWebviewIfNecessarylambda0;

/* JADX INFO: loaded from: classes.dex */
public final class ValueElementSequence implements resumeWebviewIfNecessarylambda0 {
    public static final int $stable = 8;
    private final List<ValueElement> elements = new ArrayList();

    @Override // o.resumeWebviewIfNecessarylambda0
    public Iterator<ValueElement> iterator() {
        return this.elements.iterator();
    }

    public final void set(String str, Object obj) {
        this.elements.add(new ValueElement(str, obj));
    }
}
