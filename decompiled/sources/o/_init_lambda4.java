package o;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.activity.EdgeToEdge$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class _init_lambda4 extends View {
    public final /* synthetic */ EdgeToEdge$$ExternalSyntheticLambda0 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public _init_lambda4(EdgeToEdge$$ExternalSyntheticLambda0 edgeToEdge$$ExternalSyntheticLambda0, Context context) {
        super(context);
        this.serializer = edgeToEdge$$ExternalSyntheticLambda0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.serializer.run();
    }
}
