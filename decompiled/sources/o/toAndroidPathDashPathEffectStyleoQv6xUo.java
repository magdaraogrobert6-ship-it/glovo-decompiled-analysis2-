package o;

import android.os.Bundle;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class toAndroidPathDashPathEffectStyleoQv6xUo {
    public boolean RemoteActionCompatParcelizer;
    public addRoundRect write;

    public boolean IconCompatParcelizer() {
        return true;
    }

    public void RemoteActionCompatParcelizer(Bundle bundle) {
    }

    public Bundle read() {
        return null;
    }

    public opN5in7k0 serializer(opN5in7k0 opn5in7k0, Bundle bundle, transform58bKbWc transform58bkbwc) {
        return opn5in7k0;
    }

    public abstract opN5in7k0 write();

    public void write(addRoundRect addroundrect) {
        this.write = addroundrect;
        this.RemoteActionCompatParcelizer = true;
    }

    public void write(cubicTo cubicto, boolean z) {
        List list = (List) serializer().serializer.read();
        if (!list.contains(cubicto)) {
            seekAnimationsanimation_core.IconCompatParcelizer("popBackStack was called with ", cubicto, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        cubicTo cubicto2 = null;
        while (IconCompatParcelizer()) {
            cubicto2 = (cubicTo) listIterator.previous();
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{cubicto2, cubicto}, iWrite3)).booleanValue()) {
                break;
            }
        }
        if (cubicto2 != null) {
            serializer().RemoteActionCompatParcelizer(cubicto2, z);
        }
    }

    public void RemoteActionCompatParcelizer(List list, transform58bKbWc transform58bkbwc) {
        resetAfterInAppMessageClosedefault resetafterinappmessageclosedefault = new resetAfterInAppMessageClosedefault(new requestDisplayInAppMessagelambda7(new verifyOrientationStatuslambda3(new r8lambdaN7z0Ea2bnxePLVipqp_gDhWww(1, list), new Navigator$$ExternalSyntheticLambda1(this, 0, transform58bkbwc)), false, new r8lambdahiM_4JAoe8VoNLZ8t21EAnaoFaA(2)));
        while (resetafterinappmessageclosedefault.hasNext()) {
            serializer().RemoteActionCompatParcelizer((cubicTo) resetafterinappmessageclosedefault.next());
        }
    }

    public final addRoundRect serializer() {
        addRoundRect addroundrect = this.write;
        if (addroundrect != null) {
            return addroundrect;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void write(cubicTo cubicto) {
        opN5in7k0 opn5in7k0 = cubicto.IconCompatParcelizer;
        if (opn5in7k0 == null) {
            opn5in7k0 = null;
        }
        if (opn5in7k0 == null) {
            return;
        }
        AndroidPathEffect_androidKt androidPathEffect_androidKt = new AndroidPathEffect_androidKt();
        androidPathEffect_androidKt.MediaDescriptionCompat = true;
        androidPathEffect_androidKt.MediaBrowserCompatMediaItem = false;
        androidPathEffect_androidKt.serializer = -1;
        androidPathEffect_androidKt.RemoteActionCompatParcelizer = null;
        androidPathEffect_androidKt.write = false;
        androidPathEffect_androidKt.RatingCompat = false;
        serializer(opn5in7k0, null, androidPathEffect_androidKt.IconCompatParcelizer());
        serializer().write(cubicto);
    }
}
