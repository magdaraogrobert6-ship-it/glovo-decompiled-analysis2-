package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getParentui extends ContinuationImpl {
    public final /* synthetic */ androidx.compose.foundation.text.selection.TextFieldSelectionManager IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public androidx.compose.foundation.text.selection.TextFieldSelectionManager read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getParentui(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.updateClipboardEntry$foundation(this);
    }
}
