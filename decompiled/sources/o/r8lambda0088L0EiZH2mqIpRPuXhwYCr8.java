package o;

import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import okhttp3.EventListener;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda0088L0EiZH2mqIpRPuXhwYCr8 {
    public final clipCanvasToPath call;
    public final setMessageHeaderTextColor codec;
    public final EventListener eventListener;
    public final getRectf finder;
    public boolean hasFailure;
    public boolean isDuplex;

    public final void read(IOException iOException) {
        this.hasFailure = true;
        this.codec.RemoteActionCompatParcelizer().serializer(this.call, iOException);
    }

    public final InAppMessageImmersiveBaseView RemoteActionCompatParcelizer() {
        r8lambdaR1c7Uo5jLAILQWouHjeywopEQ4c r8lambdar1c7uo5jlailqwouhjeywopeq4cRemoteActionCompatParcelizer = this.codec.RemoteActionCompatParcelizer();
        InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView = r8lambdar1c7uo5jlailqwouhjeywopeq4cRemoteActionCompatParcelizer instanceof InAppMessageImmersiveBaseView ? (InAppMessageImmersiveBaseView) r8lambdar1c7uo5jlailqwouhjeywopeq4cRemoteActionCompatParcelizer : null;
        if (inAppMessageImmersiveBaseView != null) {
            return inAppMessageImmersiveBaseView;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("no connection for CONNECT tunnels");
        return null;
    }

    public final r8lambdarYwWjKRktijBy60CMMjcRC1Oqk RemoteActionCompatParcelizer(boolean z) throws IOException {
        try {
            r8lambdarYwWjKRktijBy60CMMjcRC1Oqk r8lambdarywwjkrktijby60cmmjcrc1oqkIconCompatParcelizer = this.codec.IconCompatParcelizer(z);
            if (r8lambdarywwjkrktijby60cmmjcrc1oqkIconCompatParcelizer != null) {
                r8lambdarywwjkrktijby60cmmjcrc1oqkIconCompatParcelizer.RemoteActionCompatParcelizer = this;
            }
            return r8lambdarywwjkrktijby60cmmjcrc1oqkIconCompatParcelizer;
        } catch (IOException e) {
            this.eventListener.responseFailed(this.call, e);
            read(e);
            throw e;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final IOException write(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            read(iOException);
        }
        EventListener eventListener = this.eventListener;
        clipCanvasToPath clipcanvastopath = this.call;
        if (z2) {
            if (iOException != null) {
                eventListener.requestFailed(clipcanvastopath, iOException);
            } else {
                eventListener.requestBodyEnd(clipcanvastopath, j);
            }
        }
        if (z) {
            if (iOException != null) {
                eventListener.responseFailed(clipcanvastopath, iOException);
            } else {
                eventListener.responseBodyEnd(clipcanvastopath, j);
            }
        }
        return clipcanvastopath.RemoteActionCompatParcelizer(this, z2, z, iOException);
    }

    public r8lambda0088L0EiZH2mqIpRPuXhwYCr8(clipCanvasToPath clipcanvastopath, EventListener eventListener, getRectf getrectf, setMessageHeaderTextColor setmessageheadertextcolor) {
        eventListener.getClass();
        getrectf.getClass();
        this.call = clipcanvastopath;
        this.eventListener = eventListener;
        this.finder = getrectf;
        this.codec = setmessageheadertextcolor;
    }

    public final clipCanvasToPathlambda1 read(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60, boolean z) {
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        this.isDuplex = z;
        RequestBody requestBody = r8lambday113fdftsr5e4pzj6xssxltpl60.body;
        requestBody.getClass();
        long jContentLength = requestBody.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new clipCanvasToPathlambda1(this, this.codec.write(r8lambday113fdftsr5e4pzj6xssxltpl60, jContentLength), jContentLength);
    }

    public final r8lambdaBwuvjAiGH2v7c3MZWG0e3UE_aVk IconCompatParcelizer(_get_messageWebView_lambda1 _get_messagewebview_lambda1) throws IOException {
        setMessageHeaderTextColor setmessageheadertextcolor = this.codec;
        try {
            String strRemoteActionCompatParcelizer = _get_messageWebView_lambda1.RemoteActionCompatParcelizer(_get_messagewebview_lambda1, ConstantKt.CONTENT_TYPE_HEADER);
            long j = setmessageheadertextcolor.read(_get_messagewebview_lambda1);
            return new r8lambdaBwuvjAiGH2v7c3MZWG0e3UE_aVk(strRemoteActionCompatParcelizer, j, new GifDrawableTransformation(new clipCanvasToPathlambda0(this, setmessageheadertextcolor.IconCompatParcelizer(_get_messagewebview_lambda1), j)));
        } catch (IOException e) {
            this.eventListener.responseFailed(this.call, e);
            read(e);
            throw e;
        }
    }

    public static /* synthetic */ IOException serializer(r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr8, long j, IOException iOException, int i) {
        if ((i & 1) != 0) {
            j = -1;
        }
        return r8lambda0088l0eizh2mqiprpuxhwycr8.write(j, (i & 2) == 0, (i & 4) == 0, iOException);
    }
}
