package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class unregisterInAppMessageManagerlambda0 implements requestDisplayInAppMessagelambda6 {
    public final int RemoteActionCompatParcelizer;
    public final int serializer;
    public final resumeWebviewIfNecessarylambda0 write;

    @Override // o.resumeWebviewIfNecessarylambda0
    public final Iterator iterator() {
        return new verifyOrientationStatuslambda0(this);
    }

    @Override // o.requestDisplayInAppMessagelambda6
    public final resumeWebviewIfNecessarylambda0 read(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = this.serializer;
        return i >= i2 - i3 ? requestDisplayInAppMessagelambda8.IconCompatParcelizer : new unregisterInAppMessageManagerlambda0(this.write, i3 + i, i2);
    }

    @Override // o.requestDisplayInAppMessagelambda6
    public final resumeWebviewIfNecessarylambda0 serializer(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = this.serializer;
        return i >= i2 - i3 ? this : new unregisterInAppMessageManagerlambda0(this.write, i3, i + i3);
    }

    public unregisterInAppMessageManagerlambda0(resumeWebviewIfNecessarylambda0 resumewebviewifnecessarylambda0, int i, int i2) {
        resumewebviewifnecessarylambda0.getClass();
        this.write = resumewebviewifnecessarylambda0;
        this.serializer = i;
        this.RemoteActionCompatParcelizer = i2;
        if (i < 0) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "startIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 < 0) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(i2, "endIndex should be not less than startIndex, but was ", i, " < "));
        throw null;
    }
}
