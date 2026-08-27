package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.foodora.courier.main.presentation.MainActivity;
import okio.Options;

/* JADX INFO: loaded from: classes3.dex */
public final class q3 implements q4ExternalSyntheticLambda9 {
    private static int read = 1;
    private static int write;
    public final getAllSemanticsNodesToMap IconCompatParcelizer;
    public final getToggleableState RemoteActionCompatParcelizer;

    public q3(accessgetVcp accessgetvcp, enclosingTransactionruntime enclosingtransactionruntime, getToggleableState gettoggleablestate, getAllSemanticsNodesToMap getallsemanticsnodestomap) {
        this.RemoteActionCompatParcelizer = gettoggleablestate;
        this.IconCompatParcelizer = getallsemanticsnodestomap;
    }

    public final Intent serializer(Context context, q7 q7Var, Boolean bool, Uri uri, boolean z) {
        int i = 2 % 2;
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) Options.Companion.read(displayInAppMessagelambda1.serializer(MainActivity.class)));
        intent.setFlags(872415232);
        if (z) {
            int i2 = read + 5;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            intent.putExtra("dispatcher_chat_channel", true);
        }
        if (q7Var != null) {
            intent.putExtra("customer_chat_channel", q7Var.write);
            int i4 = read + 109;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        if (bool != null) {
            intent.putExtra("syncState", bool.booleanValue());
        }
        if (uri != null) {
            intent.putExtra("deeplinkUri", uri);
        }
        return intent;
    }
}
