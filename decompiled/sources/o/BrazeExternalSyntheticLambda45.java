package o;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeExternalSyntheticLambda45 implements r8lambdaLZjsjPSXWRendXZH98LKrH6PSs {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final setTransactionSuccessful RemoteActionCompatParcelizer;
    public final BrazeExternalSyntheticLambda36 read;
    public final r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo write;

    public BrazeExternalSyntheticLambda45(setTransactionSuccessful settransactionsuccessful, r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo r8lambdawmxperjx66sfuc7bfhywevjhcwo, BrazeExternalSyntheticLambda36 brazeExternalSyntheticLambda36) {
        settransactionsuccessful.getClass();
        r8lambdawmxperjx66sfuc7bfhywevjhcwo.getClass();
        brazeExternalSyntheticLambda36.getClass();
        this.RemoteActionCompatParcelizer = settransactionsuccessful;
        this.write = r8lambdawmxperjx66sfuc7bfhywevjhcwo;
        this.read = brazeExternalSyntheticLambda36;
    }

    public final void IconCompatParcelizer(androidx.fragment.app.FragmentActivity fragmentActivity, div7Ah8Wj8 div7ah8wj8, String str, r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs r8lambdagcpcuhbei3f7gmv4pjjfd18owys) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        r8lambdagcpcuhbei3f7gmv4pjjfd18owys.getClass();
        if (r8lambda4MdKbfiHpQQwW57A4NP6ZCybbFA.write()) {
            ColorKt.read(str, r8lambdagcpcuhbei3f7gmv4pjjfd18owys).RemoteActionCompatParcelizer(div7ah8wj8, "BecomeRider");
            return;
        }
        IconCompatParcelizer(fragmentActivity);
        int i4 = serializer + 111;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
    }

    public final void IconCompatParcelizer(androidx.fragment.app.FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        int i2 = serializer + 29;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        View viewFindViewById = fragmentActivity.findViewById(android.R.id.content);
        if (viewFindViewById == null) {
            int i4 = serializer + 59;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            viewFindViewById = FocusModifierKt.IconCompatParcelizer(fragmentActivity);
        }
        String strIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(com.logistics.rider.glovo.R.string.state_api_error_dialog_message);
        ddefault ddefaultVar = ddefault.IconCompatParcelizer;
        r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(this.write, viewFindViewById, strIconCompatParcelizer, ddefaultVar, 0, null, null, 56);
    }

    public static void serializer(androidx.fragment.app.FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        io.sentry.hints.MediaSessionCompatQueueItem.IconCompatParcelizer(fragmentActivity.getString(com.logistics.rider.glovo.R.string.no_browsers_found_message_title), fragmentActivity.getString(com.logistics.rider.glovo.R.string.no_browsers_found_message_description), fragmentActivity.getString(com.logistics.rider.glovo.R.string.got_it), null, null, false, false, true, 376).RemoteActionCompatParcelizer(fragmentActivity.getSupportFragmentManager(), "open_url_error_dialog");
        int i4 = serializer + 23;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final void RemoteActionCompatParcelizer(Uri uri, androidx.fragment.app.FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        uri.getClass();
        fragmentActivity.getClass();
        try {
            fragmentActivity.startActivity(new Intent("android.intent.action.VIEW", uri));
            int i2 = IconCompatParcelizer + 57;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } catch (ActivityNotFoundException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "No browser activity found!", new Object[0]);
            serializer(fragmentActivity);
        } catch (NullPointerException e2) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "Exception occurred while attempting to launch URL \"" + uri + "\"", new Object[0]);
            int i4 = serializer + 77;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } catch (SecurityException e3) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e3, "Browser activity is not exported", new Object[0]);
            serializer(fragmentActivity);
        }
    }
}
