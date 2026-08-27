package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class requestDisplayInAppMessagelambda7 implements resumeWebviewIfNecessarylambda0 {
    public final boolean read;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final resumeWebviewIfNecessarylambda0 write;

    @Override // o.resumeWebviewIfNecessarylambda0
    public final Iterator iterator() {
        return new resetAfterInAppMessageClosedefault(this);
    }

    public requestDisplayInAppMessagelambda7(resumeWebviewIfNecessarylambda0 resumewebviewifnecessarylambda0, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.write = resumewebviewifnecessarylambda0;
        this.read = z;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }
}
