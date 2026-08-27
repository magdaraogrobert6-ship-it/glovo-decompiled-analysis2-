package o;

import android.content.SharedPreferences;
import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.SerializationException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdaaddGlobalCallbackParameter21 implements lambdaaddGlobalCallbackParameter20 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final SharedPreferences read;
    public final Clock serializer;

    public lambdaaddGlobalCallbackParameter21(SharedPreferences sharedPreferences, Clock clock) {
        sharedPreferences.getClass();
        this.read = sharedPreferences;
        this.serializer = clock;
    }

    public final void IconCompatParcelizer() {
        SharedPreferences.Editor editorEdit;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        try {
            if (i2 % 2 != 0) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Clear push notification datastore", new Object[0]);
                editorEdit = this.read.edit();
                editorEdit.remove("pref_key_push_notifications_list");
            } else {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Clear push notification datastore", new Object[0]);
                editorEdit = this.read.edit();
                editorEdit.remove("pref_key_push_notifications_list");
            }
            editorEdit.apply();
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "There was an issue clearing the shared preferences for local push", new Object[0]);
        }
    }

    public final List read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String string = this.read.getString("pref_key_push_notifications_list", null);
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (string == null) {
            return instance_delegatelambda0Var;
        }
        try {
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            isverticalswipeinalloweddirection.getClass();
            List list = (List) isverticalswipeinalloweddirection.serializer(string, new setWasCloseMessageCalled(isValidReferrerDetails.Companion.serializer(), 0));
            int i4 = RemoteActionCompatParcelizer + 115;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 % 3;
            }
            return list;
        } catch (SerializationException unused) {
            IconCompatParcelizer();
            return instance_delegatelambda0Var;
        }
    }

    public final void serializer() {
        int i = 2 % 2;
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Clearing expired push notification data", new Object[0]);
        List list = read();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (!(!it.hasNext())) {
            Object next = it.next();
            isValidReferrerDetails isvalidreferrerdetails = (isValidReferrerDetails) next;
            isvalidreferrerdetails.getClass();
            if (Instant.now(this.serializer).toEpochMilli() - isvalidreferrerdetails.acknowledgedTimestamp < 3600000) {
                arrayList.add(next);
            }
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            int i2 = IconCompatParcelizer + 95;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            int i4 = IconCompatParcelizer + 29;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (!arrayList.contains((isValidReferrerDetails) it2.next())) {
                SharedPreferences.Editor editorEdit = this.read.edit();
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                editorEdit.putString("pref_key_push_notifications_list", isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(isValidReferrerDetails.Companion.serializer(), 0), arrayList));
                editorEdit.apply();
                return;
            }
        }
    }
}
