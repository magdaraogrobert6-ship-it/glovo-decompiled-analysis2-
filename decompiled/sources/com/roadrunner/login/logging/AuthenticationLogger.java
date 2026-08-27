package com.roadrunner.login.logging;

import android.app.Application;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.common.data.api.CloudflareErrorClassifier;
import com.roadrunner.experience_tools.braze.BrazeManagerImpl;
import o.SqlDriverDefaultImpls;
import o.decode;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.setConstraintSet;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationLogger {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final setConstraintSet IconCompatParcelizer;
    public final Path$Companion RemoteActionCompatParcelizer;
    public final CloudflareErrorClassifier read;
    public final decode serializer;
    public final Application write;

    public AuthenticationLogger(decode decodeVar, setConstraintSet setconstraintset, Application application, Path$Companion path$Companion, CloudflareErrorClassifier cloudflareErrorClassifier) {
        decodeVar.getClass();
        setconstraintset.getClass();
        application.getClass();
        path$Companion.getClass();
        cloudflareErrorClassifier.getClass();
        this.serializer = decodeVar;
        this.IconCompatParcelizer = setconstraintset;
        this.write = application;
        this.RemoteActionCompatParcelizer = path$Companion;
        this.read = cloudflareErrorClassifier;
    }

    public final void serializer(SqlDriverDefaultImpls sqlDriverDefaultImpls, boolean z, boolean z2) {
        int i = 2 % 2;
        sqlDriverDefaultImpls.getClass();
        this.serializer.logEvent("login_succeeded", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("role", sqlDriverDefaultImpls.name()), new onViewAttachedToWindowlambda0("with_biometric", String.valueOf(z)), new onViewAttachedToWindowlambda0("app_directory", this.write.getFilesDir().getAbsolutePath()), new onViewAttachedToWindowlambda0("with2fa", String.valueOf(z2))));
        BrazeManagerImpl brazeManagerImpl = (BrazeManagerImpl) this.IconCompatParcelizer;
        brazeManagerImpl.getClass();
        brazeManagerImpl.read().logCustomEvent("login_succeeded");
        int i2 = RatingCompat + 7;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
