package com.roadrunner.logger.logger.firebase;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.perseus.Perseus;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import com.roadrunner.logger.api.data.AppInfoChangedListener;
import dagger.Lazy;
import java.util.HashMap;
import java.util.Map;
import o.ExecutableQueryexecuteAsOneOrNull1;
import o.executeAsOneOrNull;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isMainThread;
import o.set_measureResult;
import o.transactionsuspendImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseCrashlyticsUserAttributesChangedListener implements AppInfoChangedListener {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final Lazy IconCompatParcelizer;

    public FirebaseCrashlyticsUserAttributesChangedListener(Lazy lazy, transactionsuspendImpl transactionsuspendimpl, isMainThread ismainthread) {
        this.IconCompatParcelizer = lazy;
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateUserProperty(String str, String str2) {
        int i = 2 % 2;
        int i2 = write + 71;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        str2.getClass();
        Object objWrite = this.IconCompatParcelizer.write();
        objWrite.getClass();
        ((set_measureResult) objWrite).RemoteActionCompatParcelizer(str, str2);
        int i4 = write + 29;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void onInfoUpdated(executeAsOneOrNull executeasoneornull) {
        int i = 2 % 2;
        int i2 = write + 57;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        executeasoneornull.getClass();
        updateUserProperties(executeasoneornull.MediaMetadataCompat);
        Object objWrite = this.IconCompatParcelizer.write();
        objWrite.getClass();
        set_measureResult set_measureresult = (set_measureResult) objWrite;
        set_measureresult.RemoteActionCompatParcelizer("brand", executeasoneornull.IconCompatParcelizer);
        set_measureresult.RemoteActionCompatParcelizer("city", executeasoneornull.RemoteActionCompatParcelizer);
        set_measureresult.RemoteActionCompatParcelizer("contract_type", executeasoneornull.serializer);
        String str = executeasoneornull.read;
        if (str == null) {
            int i4 = RemoteActionCompatParcelizer + 79;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            str = "";
        }
        set_measureresult.RemoteActionCompatParcelizer("shift_id", str);
        set_measureresult.RemoteActionCompatParcelizer("perseusSessionId", Perseus.serializer());
        set_measureresult.RemoteActionCompatParcelizer("perseusClientId", Perseus.RemoteActionCompatParcelizer());
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateUserProperties(ExecutableQueryexecuteAsOneOrNull1 executableQueryexecuteAsOneOrNull1) {
        int i = 2 % 2;
        int i2 = write + 99;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        executableQueryexecuteAsOneOrNull1.getClass();
        Object objWrite = this.IconCompatParcelizer.write();
        objWrite.getClass();
        set_measureResult set_measureresult = (set_measureResult) objWrite;
        CrashlyticsCore crashlyticsCore = set_measureresult.serializer;
        String str = executableQueryexecuteAsOneOrNull1.read;
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            crashlyticsCore.RatingCompat.read.serializer(new ND$$ExternalSyntheticLambda0(crashlyticsCore, 14, ""));
        } else {
            crashlyticsCore.RatingCompat.read.serializer(new ND$$ExternalSyntheticLambda0(crashlyticsCore, 14, executableQueryexecuteAsOneOrNull1.read()));
            int i4 = write + 111;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        set_measureresult.RemoteActionCompatParcelizer("employee_id", str);
        set_measureresult.RemoteActionCompatParcelizer(PushNotificationParserObj.COUNTRY_KEY, executableQueryexecuteAsOneOrNull1.serializer);
        set_measureresult.RemoteActionCompatParcelizer("device_id", executableQueryexecuteAsOneOrNull1.RemoteActionCompatParcelizer);
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateProperties(Map map) {
        int i = 2 % 2;
        map.getClass();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            int i2 = write + 11;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            map2.put((String) entry.getKey(), entry.getValue().toString());
            int i4 = write + 99;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 / 2;
            }
        }
        Object objWrite = this.IconCompatParcelizer.write();
        objWrite.getClass();
        CrashlyticsCore crashlyticsCore = ((set_measureResult) objWrite).serializer;
        if (map2.isEmpty()) {
            return;
        }
        crashlyticsCore.RatingCompat.read.serializer(new ND$$ExternalSyntheticLambda0(crashlyticsCore, 15, map2));
    }
}
