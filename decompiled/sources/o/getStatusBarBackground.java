package o;

import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;

/* JADX INFO: loaded from: classes3.dex */
public final class getStatusBarBackground {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ SendTestPushUseCase serializer;

    public getStatusBarBackground(SendTestPushUseCase sendTestPushUseCase) {
        this.serializer = sendTestPushUseCase;
    }

    public final void read(NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$1) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 87;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer.serializer = nestScreenKt$NestScreen$1$1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.serializer.serializer = nestScreenKt$NestScreen$1$1;
        int i3 = RemoteActionCompatParcelizer + 39;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}
