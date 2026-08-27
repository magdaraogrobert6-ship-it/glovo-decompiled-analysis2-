package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.node.WeakReference;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper_androidKt;
import o.createFromParcel;
import o.getCieXyz;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
final class InputMethodSession {
    private boolean disposed;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 onAllConnectionsClosed;
    private final PlatformTextInputMethodRequest request;
    private final Object lock = new Object();
    private onCreateVirtualViewTranslationRequests connections = new onCreateVirtualViewTranslationRequests(new WeakReference[16]);

    public final boolean isActive() {
        return !this.disposed;
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        synchronized (this.lock) {
            if (this.disposed) {
                return null;
            }
            NullableInputConnectionWrapper NullableInputConnectionWrapper = NullableInputConnectionWrapper_androidKt.NullableInputConnectionWrapper(this.request.createInputConnection(editorInfo), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1
                {
                    super(1);
                }

                public final void invoke(NullableInputConnectionWrapper nullableInputConnectionWrapper) {
                    nullableInputConnectionWrapper.disposeDelegate();
                    onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.this$0.connections;
                    Object[] objArr = oncreatevirtualviewtranslationrequests.write;
                    int i = oncreatevirtualviewtranslationrequests.read;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= i) {
                            i2 = -1;
                            break;
                        }
                        Object[] objArr2 = {(WeakReference) objArr[i2], nullableInputConnectionWrapper};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 >= 0) {
                        this.this$0.connections.write(i2);
                    }
                    if (this.this$0.connections.read == 0) {
                        this.this$0.onAllConnectionsClosed.invoke();
                    }
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((NullableInputConnectionWrapper) obj);
                    return createFromParcel.INSTANCE;
                }
            });
            this.connections.IconCompatParcelizer(new WeakReference(NullableInputConnectionWrapper));
            return NullableInputConnectionWrapper;
        }
    }

    public final void dispose() {
        synchronized (this.lock) {
            this.disposed = true;
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.connections;
            Object[] objArr = oncreatevirtualviewtranslationrequests.write;
            int i = oncreatevirtualviewtranslationrequests.read;
            for (int i2 = 0; i2 < i; i2++) {
                NullableInputConnectionWrapper nullableInputConnectionWrapper = (NullableInputConnectionWrapper) ((WeakReference) objArr[i2]).get();
                if (nullableInputConnectionWrapper != null) {
                    nullableInputConnectionWrapper.disposeDelegate();
                }
            }
            this.connections.RemoteActionCompatParcelizer();
        }
    }

    public InputMethodSession(PlatformTextInputMethodRequest platformTextInputMethodRequest, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.request = platformTextInputMethodRequest;
        this.onAllConnectionsClosed = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }
}
