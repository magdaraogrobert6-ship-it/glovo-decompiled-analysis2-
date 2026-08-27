package com.data.util.sharedPreferences;

import android.content.SharedPreferences;
import androidx.compose.ui.graphics.Fields;
import com.google.gson.JsonSyntaxException;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.isOpenInternalroom_runtime;
import o.onDependencyAdded;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class SharedPreferencesManagerImpl {
    private static int read = 0;
    private static int serializer = 1;
    public final SharedPreferences RemoteActionCompatParcelizer;

    public SharedPreferencesManagerImpl(SharedPreferences sharedPreferences, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.RemoteActionCompatParcelizer = sharedPreferences;
    }

    public final Object write(String str, Class cls, ContinuationImpl continuationImpl) throws Throwable {
        int i = 2 % 2;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new SignInDataStore$set$2(this, str, cls, null, 4), continuationImpl);
        int i2 = serializer + 5;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objWithContext;
    }

    public final Object store(String str, Object obj, ContinuationImpl continuationImpl) throws Throwable {
        int i = 2 % 2;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new SignInDataStore$set$2(this, str, obj, (ShortNewsContentCardView) null), continuationImpl);
        if (objWithContext == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = serializer + 125;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 1 / 0;
            }
            return objWithContext;
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = serializer + 63;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    public final Object RemoteActionCompatParcelizer(Class cls, String str) {
        int i = 2 % 2;
        int i2 = serializer + 19;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        cls.getClass();
        Object obj = null;
        String string = this.RemoteActionCompatParcelizer.getString(str, null);
        if (string == null) {
            Timber.RemoteActionCompatParcelizer.getClass();
            return null;
        }
        try {
            Object objFromJson = onDependencyAdded.IconCompatParcelizer().fromJson(string, (Class<Object>) cls);
            int i4 = serializer + 49;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return objFromJson;
            }
            obj.hashCode();
            throw null;
        } catch (JsonSyntaxException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to convert json with exception: ", e.getMessage()), new Object[0]);
            return null;
        }
    }
}
