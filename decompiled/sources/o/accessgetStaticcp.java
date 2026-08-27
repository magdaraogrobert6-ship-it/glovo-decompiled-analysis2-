package o;

import android.database.ContentObserver;
import com.roadrunner.login.logging.RouterLogger;
import kotlinx.coroutines.channels.ProducerCoroutine;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetStaticcp extends ContentObserver {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 RemoteActionCompatParcelizer;
    public final /* synthetic */ RouterLogger serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetStaticcp(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, RouterLogger routerLogger) {
        super(null);
        this.RemoteActionCompatParcelizer = inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
        this.serializer = routerLogger;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        int i = 2 % 2;
        int i2 = read + 67;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((ProducerCoroutine) this.RemoteActionCompatParcelizer).b_(Boolean.valueOf(((TextIndentKt) this.serializer.serializer).serializer()));
        } else {
            ((ProducerCoroutine) this.RemoteActionCompatParcelizer).b_(Boolean.valueOf(((TextIndentKt) this.serializer.serializer).serializer()));
            throw null;
        }
    }
}
