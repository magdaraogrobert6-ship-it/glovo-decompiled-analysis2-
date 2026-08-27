package androidx.compose.ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidUriHandler implements UriHandler {
    public static final int $stable = 8;
    private final Context context;

    @Override // androidx.compose.ui.platform.UriHandler
    public void openUri(String str) {
        try {
            this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            throw new IllegalArgumentException(m1$$ExternalSyntheticOutline0.m('.', "Can't open ", str), e);
        }
    }

    public AndroidUriHandler(Context context) {
        this.context = context;
    }
}
