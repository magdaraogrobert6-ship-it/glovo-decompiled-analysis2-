package androidx.compose.ui.viewinterop;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 INSTANCE = new AndroidViewHolder$Companion$OnCommitAffectingUpdate$1();

    public AndroidViewHolder$Companion$OnCommitAffectingUpdate$1() {
        super(1);
    }

    public final void invoke(AndroidViewHolder androidViewHolder) {
        androidViewHolder.getHandler().post(new AndroidViewHolder$$ExternalSyntheticLambda0(1, androidViewHolder.runUpdate));
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AndroidViewHolder) obj);
        return createFromParcel.INSTANCE;
    }
}
