package o;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetGuidecp implements accessgetFivecp {
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object serializer;

    public /* synthetic */ accessgetGuidecp(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.IconCompatParcelizer;
        Object obj = this.serializer;
        return i != 0 ? new androidx.emoji2.text.EmojiProcessor((Context) ((accessgetGuidecp) obj).serializer, new getIntentArrayWithConfiguredBackStacklambda4(8), new accessgetWcp(9), 18) : obj;
    }
}
