package o;

import com.roadrunner.delivery.accept.autoaccept.notification.ShowNotification;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class emojiSupportMatchSaverlambda1 extends ContinuationImpl {
    private static int read = 1;
    private static int serializer;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ ShowNotification write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emojiSupportMatchSaverlambda1(ShowNotification showNotification, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = showNotification;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ShowNotification showNotification;
        boolean z;
        int i = 2 % 2;
        int i2 = read + 111;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            showNotification = this.write;
            z = true;
        } else {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            showNotification = this.write;
            z = false;
        }
        return showNotification.invoke(null, null, this, z);
    }
}
