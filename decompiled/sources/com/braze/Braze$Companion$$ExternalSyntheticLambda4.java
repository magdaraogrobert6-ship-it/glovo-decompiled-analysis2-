package com.braze;

import android.net.Uri;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mapbox.common.movement.GoogleActivityRecognition;
import io.sentry.android.navigation.SentryNavigationListener;
import o.BrazeActionUtils;
import o.PausedPrecompositionImpl;
import o.r8lambdaGBNkvgSHmmv9lTp9Y9dUExj6Ic;
import o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$Companion$$ExternalSyntheticLambda4 implements IBrazeEndpointProvider, PausedPrecompositionImpl, OnFailureListener, r8lambdaaCm2JcMru73kJeywi54SW2Mni8U {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ Braze$Companion$$ExternalSyntheticLambda4(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // com.braze.IBrazeEndpointProvider
    public Uri getApiEndpoint(Uri uri) {
        return Braze.Companion.setConfiguredCustomEndpoint$lambda$0$0(this.f$0, uri);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        GoogleActivityRecognition.Companion.withLogs$lambda$7(this.f$0, exc);
    }

    @Override // o.PausedPrecompositionImpl
    public Task then(Object obj) {
        int i = this.$r8$classId;
        String str = this.f$0;
        r8lambdaGBNkvgSHmmv9lTp9Y9dUExj6Ic r8lambdagbnkvgshmmv9ltp9y9duexj6ic = (r8lambdaGBNkvgSHmmv9lTp9Y9dUExj6Ic) obj;
        return i != 1 ? FirebaseMessaging.lambda$unsubscribeFromTopic$11(str, r8lambdagbnkvgshmmv9ltp9y9duexj6ic) : FirebaseMessaging.lambda$subscribeToTopic$10(str, r8lambdagbnkvgshmmv9ltp9y9duexj6ic);
    }

    @Override // o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U
    public void write(BrazeActionUtils brazeActionUtils) {
        int i = SentryNavigationListener.serializer;
        brazeActionUtils.getClass();
        brazeActionUtils.IconCompatParcelizer(this.f$0);
    }
}
