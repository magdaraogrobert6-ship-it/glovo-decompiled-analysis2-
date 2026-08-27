package o;

import com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesLocalRepositoryImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getTextForegroundStyleui_text extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int serializer;
    public final /* synthetic */ AutoAcceptPreferencesLocalRepositoryImpl IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getTextForegroundStyleui_text(AutoAcceptPreferencesLocalRepositoryImpl autoAcceptPreferencesLocalRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = autoAcceptPreferencesLocalRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 3;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object autoAcceptOpted = this.IconCompatParcelizer.setAutoAcceptOpted(false, this);
        int i4 = serializer + 69;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return autoAcceptOpted;
    }
}
