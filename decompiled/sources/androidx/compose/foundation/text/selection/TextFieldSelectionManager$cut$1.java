package androidx.compose.foundation.text.selection;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldSelectionManager$cut$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ TextFieldSelectionManager read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldSelectionManager$cut$1(TextFieldSelectionManager textFieldSelectionManager, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.read = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.IconCompatParcelizer;
        TextFieldSelectionManager textFieldSelectionManager = this.read;
        return i != 0 ? new TextFieldSelectionManager$cut$1(textFieldSelectionManager, shortNewsContentCardView, 1) : new TextFieldSelectionManager$cut$1(textFieldSelectionManager, shortNewsContentCardView, 0);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((TextFieldSelectionManager$cut$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((TextFieldSelectionManager$cut$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0377  */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x030e, code lost:
    
        if (r3 == r1) goto L135;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r52) {
        /*
            Method dump skipped, instruction units count: 1049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cut$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
