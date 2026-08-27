package o;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class calculateRecommendedTimeoutMillisdefault {
    public static final Object RemoteActionCompatParcelizer = new Object();
    public static r8lambdasiqLHOlI886CP2DW48WrqJJzyI write;
    public final setSupportButtonTintList read = new setSupportButtonTintList(1);
    public final Context serializer;

    public final Task write(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = this.serializer;
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return write(context, intent, z2);
        }
        BannerViewattachStateListener1 bannerViewattachStateListener1 = new BannerViewattachStateListener1(context, 2, intent);
        setSupportButtonTintList setsupportbuttontintlist = this.read;
        return LazyKt__LazyJVMKt.write(setsupportbuttontintlist, bannerViewattachStateListener1).continueWithTask(setsupportbuttontintlist, new OuterPlacementScope() { // from class: o.AccessibilityManagerDefaultImpls
            @Override // o.OuterPlacementScope
            public final Object then(Task task) {
                return ((Integer) task.getResult()).intValue() != 402 ? task : calculateRecommendedTimeoutMillisdefault.write(context, intent, z2).continueWith(new setSupportButtonTintList(1), new FieldType$$ExternalSyntheticBUOutline0(18));
            }
        });
    }

    public calculateRecommendedTimeoutMillisdefault(Context context) {
        this.serializer = context;
    }

    public static Task write(Context context, Intent intent, boolean z) {
        r8lambdasiqLHOlI886CP2DW48WrqJJzyI r8lambdasiqlholi886cp2dw48wrqjjzyi;
        Log.isLoggable("FirebaseMessaging", 3);
        synchronized (RemoteActionCompatParcelizer) {
            if (write == null) {
                write = new r8lambdasiqLHOlI886CP2DW48WrqJJzyI(context);
            }
            r8lambdasiqlholi886cp2dw48wrqjjzyi = write;
        }
        if (z) {
            if (androidx.transition.TransitionValuesMaps.read().IconCompatParcelizer(context)) {
                synchronized (accessfindNextNonChildView.serializer) {
                    accessfindNextNonChildView.serializer(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        accessfindNextNonChildView.RemoteActionCompatParcelizer.IconCompatParcelizer();
                    }
                    r8lambdasiqlholi886cp2dw48wrqjjzyi.IconCompatParcelizer(intent).addOnCompleteListener(new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(20, intent));
                }
            } else {
                r8lambdasiqlholi886cp2dw48wrqjjzyi.IconCompatParcelizer(intent);
            }
            return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) (-1));
        }
        return r8lambdasiqlholi886cp2dw48wrqjjzyi.IconCompatParcelizer(intent).continueWith(new setSupportButtonTintList(1), new FieldType$$ExternalSyntheticBUOutline0(19));
    }
}
