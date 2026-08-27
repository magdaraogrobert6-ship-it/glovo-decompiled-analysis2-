package o;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class DragAndDropNodeKt implements updateBuffersOnDisappeared {
    public final onCreateVirtualViewTranslationRequests RemoteActionCompatParcelizer = new onCreateVirtualViewTranslationRequests(new createFromAutofillValue[16]);
    public final Set serializer;

    public final onCreateVirtualViewTranslationRequests RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onAbandoned() {
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onForgotten() {
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onRemembered() {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.RemoteActionCompatParcelizer;
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            updateBuffersOnDisappeared updatebuffersondisappeared = ((createFromAutofillValue) objArr[i2]).read;
            this.serializer.remove(updatebuffersondisappeared);
            updatebuffersondisappeared.onRemembered();
        }
    }

    public DragAndDropNodeKt(Set set) {
        this.serializer = set;
    }
}
