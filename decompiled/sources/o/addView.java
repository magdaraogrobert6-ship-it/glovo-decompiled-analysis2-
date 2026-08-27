package o;

import android.app.Application;
import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.proto.ProtobufEncoder;

/* JADX INFO: loaded from: classes4.dex */
public final class addView implements forceAccessibilityForTesting {
    public final getTextInputServiceannotations IconCompatParcelizer;
    public final resolveComposeViewContext RemoteActionCompatParcelizer;
    public final resolveComposeViewContext serializer;
    public final ProtobufEncoder write;

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        Application application = (Application) this.serializer.write();
        WeakReference weakReference = (WeakReference) this.RemoteActionCompatParcelizer.write();
        ProtobufEncoder protobufEncoder = this.write;
        return new DpTouchBoundsExpansiona9UjIt4default(this.IconCompatParcelizer, (FirebaseApp) protobufEncoder.write, application, (disposeComposition) protobufEncoder.RemoteActionCompatParcelizer, weakReference);
    }

    public addView(ProtobufEncoder protobufEncoder, getTextInputServiceannotations gettextinputserviceannotations, resolveComposeViewContext resolvecomposeviewcontext, resolveComposeViewContext resolvecomposeviewcontext2) {
        this.write = protobufEncoder;
        this.IconCompatParcelizer = gettextinputserviceannotations;
        this.serializer = resolvecomposeviewcontext;
        this.RemoteActionCompatParcelizer = resolvecomposeviewcontext2;
    }
}
