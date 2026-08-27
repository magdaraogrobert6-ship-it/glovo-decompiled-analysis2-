package com.roadrunner.logger.logger.firebase;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.google.firebase.perf.FirebasePerformance;
import com.roadrunner.logger.api.data.AppInfoChangedListener;
import dagger.Lazy;
import java.util.Map;
import o.ExecutableQueryexecuteAsOneOrNull1;
import o.executeAsOneOrNull;
import o.hideCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebasePerformanceUserAttributes implements AppInfoChangedListener {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final Lazy write;

    public FirebasePerformanceUserAttributes(Lazy lazy) {
        this.write = lazy;
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateUserProperty(String str, String str2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 77;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str.getClass();
            str2.getClass();
            Object objWrite = this.write.write();
            objWrite.getClass();
            ((FirebasePerformance) objWrite).write(str, str2);
            int i3 = 31 / 0;
        } else {
            str.getClass();
            str2.getClass();
            Object objWrite2 = this.write.write();
            objWrite2.getClass();
            ((FirebasePerformance) objWrite2).write(str, str2);
        }
        int i4 = RemoteActionCompatParcelizer + 123;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void onInfoUpdated(executeAsOneOrNull executeasoneornull) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            executeasoneornull.getClass();
            updateUserProperties(executeasoneornull.MediaMetadataCompat);
            Object objWrite = this.write.write();
            objWrite.getClass();
            ((FirebasePerformance) objWrite).write("brand", executeasoneornull.IconCompatParcelizer);
            return;
        }
        executeasoneornull.getClass();
        updateUserProperties(executeasoneornull.MediaMetadataCompat);
        Object objWrite2 = this.write.write();
        objWrite2.getClass();
        ((FirebasePerformance) objWrite2).write("brand", executeasoneornull.IconCompatParcelizer);
        int i3 = 45 / 0;
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateUserProperties(ExecutableQueryexecuteAsOneOrNull1 executableQueryexecuteAsOneOrNull1) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            executableQueryexecuteAsOneOrNull1.getClass();
            Object objWrite = this.write.write();
            objWrite.getClass();
            hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) executableQueryexecuteAsOneOrNull1.read);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        executableQueryexecuteAsOneOrNull1.getClass();
        Object objWrite2 = this.write.write();
        objWrite2.getClass();
        FirebasePerformance firebasePerformance = (FirebasePerformance) objWrite2;
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) executableQueryexecuteAsOneOrNull1.read)) {
            firebasePerformance.write("user_id", "");
            int i3 = RemoteActionCompatParcelizer + 33;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            firebasePerformance.write("user_id", executableQueryexecuteAsOneOrNull1.read());
        }
        firebasePerformance.write(PushNotificationParserObj.COUNTRY_KEY, executableQueryexecuteAsOneOrNull1.serializer);
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateProperties(Map map) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            Object objWrite = this.write.write();
            objWrite.getClass();
            ((FirebasePerformance) objWrite).write(str, value.toString());
            int i4 = serializer + 29;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }
}
