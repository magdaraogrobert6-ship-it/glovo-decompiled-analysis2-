package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.Iterator;
import kotlin.sequences.DropSequence$iterator$1;

/* JADX INFO: loaded from: classes4.dex */
public final class requestDisplayInAppMessagelambda10 implements requestDisplayInAppMessagelambda6 {
    public final int read;
    public final resumeWebviewIfNecessarylambda0 serializer;
    public final /* synthetic */ int write;

    @Override // o.requestDisplayInAppMessagelambda6
    public final resumeWebviewIfNecessarylambda0 read(int i) {
        int i2 = this.write;
        resumeWebviewIfNecessarylambda0 resumewebviewifnecessarylambda0 = this.serializer;
        int i3 = this.read;
        if (i2 != 0) {
            return i >= i3 ? requestDisplayInAppMessagelambda8.IconCompatParcelizer : new unregisterInAppMessageManagerlambda0(resumewebviewifnecessarylambda0, i, i3);
        }
        int i4 = i3 + i;
        return i4 < 0 ? new requestDisplayInAppMessagelambda10(this, i, 0) : new requestDisplayInAppMessagelambda10(resumewebviewifnecessarylambda0, i4, 0);
    }

    @Override // o.requestDisplayInAppMessagelambda6
    public final resumeWebviewIfNecessarylambda0 serializer(int i) {
        int i2 = this.write;
        resumeWebviewIfNecessarylambda0 resumewebviewifnecessarylambda0 = this.serializer;
        int i3 = this.read;
        if (i2 != 0) {
            return i >= i3 ? this : new requestDisplayInAppMessagelambda10(resumewebviewifnecessarylambda0, i, 1);
        }
        int i4 = i3 + i;
        return i4 < 0 ? new requestDisplayInAppMessagelambda10(this, i, 1) : new unregisterInAppMessageManagerlambda0(resumewebviewifnecessarylambda0, i3, i4);
    }

    public requestDisplayInAppMessagelambda10(resumeWebviewIfNecessarylambda0 resumewebviewifnecessarylambda0, int i, int i2) {
        this.write = i2;
        if (i2 == 1) {
            this.serializer = resumewebviewifnecessarylambda0;
            this.read = i;
            if (i >= 0) {
                return;
            }
            DrawableTransformation.serializer((Object) m1$$ExternalSyntheticOutline0.m("count must be non-negative, but was ", i, '.'));
            throw null;
        }
        resumewebviewifnecessarylambda0.getClass();
        this.serializer = resumewebviewifnecessarylambda0;
        this.read = i;
        if (i >= 0) {
            return;
        }
        DrawableTransformation.serializer((Object) m1$$ExternalSyntheticOutline0.m("count must be non-negative, but was ", i, '.'));
        throw null;
    }

    @Override // o.resumeWebviewIfNecessarylambda0
    public final Iterator iterator() {
        return this.write != 0 ? new DropSequence$iterator$1(this, (byte) 0) : new DropSequence$iterator$1(this);
    }
}
