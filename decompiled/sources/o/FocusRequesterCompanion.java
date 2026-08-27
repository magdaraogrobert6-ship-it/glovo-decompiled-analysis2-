package o;

import android.view.ViewParent;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FocusRequesterCompanion extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final FocusRequesterCompanion RemoteActionCompatParcelizer = new FocusRequesterCompanion(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        return ((ViewParent) obj).getParent();
    }

    public FocusRequesterCompanion(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
