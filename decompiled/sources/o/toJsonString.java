package o;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class toJsonString extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final toJsonString RemoteActionCompatParcelizer = new toJsonString(1);

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        viewGroup.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        layoutInflaterFrom.getClass();
        return layoutInflaterFrom;
    }

    public toJsonString(int i) {
        super(i);
    }
}
