package o;

import android.os.Bundle;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@calculateSize(RemoteActionCompatParcelizer = "navigation")
public class rewind extends toAndroidPathDashPathEffectStyleoQv6xUo {
    public final AndroidPathIterator IconCompatParcelizer;

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public relativeQuadraticTo write() {
        return new relativeQuadraticTo(this);
    }

    public rewind(AndroidPathIterator androidPathIterator) {
        androidPathIterator.getClass();
        this.IconCompatParcelizer = androidPathIterator;
    }

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final void RemoteActionCompatParcelizer(List list, transform58bKbWc transform58bkbwc) {
        opN5in7k0 opn5in7k0RemoteActionCompatParcelizer;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cubicTo cubicto = (cubicTo) it.next();
            opN5in7k0 opn5in7k0 = cubicto.IconCompatParcelizer;
            opn5in7k0.getClass();
            relativeQuadraticTo relativequadraticto = (relativeQuadraticTo) opn5in7k0;
            createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
            createinappmessageeventsubscriber.IconCompatParcelizer = cubicto.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
            androidx.recyclerview.widget.ChildHelper childHelper = relativequadraticto.IconCompatParcelizer;
            int i = childHelper.IconCompatParcelizer;
            String str = (String) childHelper.MediaSessionCompatQueueItem;
            if (i == 0 && str == null) {
                r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg = relativequadraticto.serializer;
                String strValueOf = (String) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.serializer;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.RemoteActionCompatParcelizer);
                }
                strValueOf.getClass();
                if (((relativeQuadraticTo) childHelper.serializer).serializer.RemoteActionCompatParcelizer == 0) {
                    strValueOf = "the root navigation";
                }
                DrawableTransformation.read((Object) "no start destination defined via app:startDestination for ".concat(strValueOf));
                return;
            }
            int i2 = 0;
            if (str != null) {
                opn5in7k0RemoteActionCompatParcelizer = childHelper.RemoteActionCompatParcelizer(str, false);
            } else {
                accessprocessDragStart accessprocessdragstart = (accessprocessDragStart) childHelper.write;
                accessprocessdragstart.getClass();
                opn5in7k0RemoteActionCompatParcelizer = (opN5in7k0) isInterested.RemoteActionCompatParcelizer(accessprocessdragstart, i);
            }
            if (opn5in7k0RemoteActionCompatParcelizer == null) {
                if (((String) childHelper.read) == null) {
                    String strValueOf2 = (String) childHelper.MediaSessionCompatQueueItem;
                    if (strValueOf2 == null) {
                        strValueOf2 = String.valueOf(childHelper.IconCompatParcelizer);
                    }
                    childHelper.read = strValueOf2;
                }
                String str2 = (String) childHelper.read;
                str2.getClass();
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("navigation destination ", str2, " is not a direct child of this NavGraph"));
                return;
            }
            r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg2 = opn5in7k0RemoteActionCompatParcelizer.serializer;
            if (str != null) {
                if (!str.equals((String) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg2.read)) {
                    relativeCubicTo relativecubictoSerializer = r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg2.serializer(str);
                    Bundle bundle = relativecubictoSerializer != null ? relativecubictoSerializer.write : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundle2 = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                        bundle2.putAll(bundle);
                        Bundle bundle3 = (Bundle) createinappmessageeventsubscriber.IconCompatParcelizer;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        createinappmessageeventsubscriber.IconCompatParcelizer = bundle2;
                    }
                }
                if (opn5in7k0RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListRemoteActionCompatParcelizer = close.RemoteActionCompatParcelizer(opn5in7k0RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), new relativeQuadraticBezierTo(createinappmessageeventsubscriber, i2));
                    if (!arrayListRemoteActionCompatParcelizer.isEmpty()) {
                        DrawableTransformation.IconCompatParcelizer("Cannot navigate to startDestination ", opn5in7k0RemoteActionCompatParcelizer, ". Missing required arguments [", arrayListRemoteActionCompatParcelizer, 93);
                        return;
                    }
                }
            }
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(opn5in7k0RemoteActionCompatParcelizer.MediaMetadataCompat).RemoteActionCompatParcelizer((List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{serializer().read(opn5in7k0RemoteActionCompatParcelizer, opn5in7k0RemoteActionCompatParcelizer.serializer((Bundle) createinappmessageeventsubscriber.IconCompatParcelizer))}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), transform58bkbwc);
        }
    }
}
