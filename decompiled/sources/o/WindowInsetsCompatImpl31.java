package o;

import com.roadrunner.freelancing.presentation.tab.ShouldShowTabs;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class WindowInsetsCompatImpl31 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ ShouldShowTabs RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsCompatImpl31(ShouldShowTabs shouldShowTabs, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = shouldShowTabs;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.read |= Integer.MIN_VALUE;
            return this.RemoteActionCompatParcelizer.invoke(this);
        }
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        int i3 = 60 / 0;
        return this.RemoteActionCompatParcelizer.invoke(this);
    }
}
