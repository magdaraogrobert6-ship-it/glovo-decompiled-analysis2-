package com.roadrunner.auth.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentDescription;
import o.getContentType;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;

/* JADX INFO: loaded from: classes3.dex */
public final class SaveSignInDataUseCaseImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final getContentDescription read;

    public SaveSignInDataUseCaseImpl(getContentDescription getcontentdescription) {
        getcontentdescription.getClass();
        this.read = getcontentdescription;
    }

    public final Object invoke(String str, String str2, ContinuationImpl continuationImpl) {
        int i = 2 % 2;
        getContentType getcontenttype = new getContentType(str, str2);
        SignInDataStore signInDataStore = this.read.RemoteActionCompatParcelizer;
        Object objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) signInDataStore.serializer, new SignInDataStore$set$2(signInDataStore, getcontenttype, (ShortNewsContentCardView) null, 0), continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (objSerializer == coroutineSingletons) {
            int i2 = IconCompatParcelizer + 119;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            objSerializer = createfromparcel;
        }
        if (objSerializer != coroutineSingletons) {
            objSerializer = createfromparcel;
        }
        if (objSerializer != coroutineSingletons) {
            return createfromparcel;
        }
        int i4 = IconCompatParcelizer + 69;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return objSerializer;
    }
}
