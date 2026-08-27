package o;

import android.os.Build;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.gtm.zzbv;
import io.grpc.LoadBalancer$Helper;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class getDirectionDownLeftEK5gGoQ implements getDirectionDownEK5gGoQ {
    public static getButtonZEK5gGoQ serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getDirectionDownLeftEK5gGoQ(int i) {
        this.write = i;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0142 A[LOOP:0: B:92:0x012a->B:100:0x0142, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:221:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:? A[SYNTHETIC] */
    @Override // o.getDirectionDownEK5gGoQ
    public final getFunctionEK5gGoQ RemoteActionCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        getHelpEK5gGoQ gethelpek5ggoqSerializer;
        int i = this.write;
        getHelpEK5gGoQ gethelpek5ggoq = getHelpEK5gGoQ.IconCompatParcelizer;
        getHelpEK5gGoQ gethelpek5ggoq2 = getHelpEK5gGoQ.serializer;
        getHelpEK5gGoQ gethelpek5ggoq3 = getHelpEK5gGoQ.read;
        int i2 = 0;
        switch (i) {
            case 0:
                return new getGEK5gGoQ(Double.valueOf(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[0]).compareTo(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[1]))));
            case 1:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                getFunctionEK5gGoQ getfunctionek5ggoqRemoteActionCompatParcelizer = androidx.room.Room.RemoteActionCompatParcelizer(zzbvVar, getfunctionek5ggoqArr[0]);
                return !LoadBalancer$Helper.serializer(getfunctionek5ggoqRemoteActionCompatParcelizer) ? getfunctionek5ggoqRemoteActionCompatParcelizer : androidx.room.Room.RemoteActionCompatParcelizer(zzbvVar, getfunctionek5ggoqArr[1]);
            case 2:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                getFunctionEK5gGoQ getfunctionek5ggoqRemoteActionCompatParcelizer2 = androidx.room.Room.RemoteActionCompatParcelizer(zzbvVar, getfunctionek5ggoqArr[0]);
                return LoadBalancer$Helper.serializer(getfunctionek5ggoqRemoteActionCompatParcelizer2) ? getfunctionek5ggoqRemoteActionCompatParcelizer2 : androidx.room.Room.RemoteActionCompatParcelizer(zzbvVar, getfunctionek5ggoqArr[1]);
            case 3:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 3);
                getFunctionEK5gGoQ getfunctionek5ggoqRemoteActionCompatParcelizer3 = LoadBalancer$Helper.serializer(androidx.room.Room.RemoteActionCompatParcelizer(zzbvVar, getfunctionek5ggoqArr[0])) ? androidx.room.Room.RemoteActionCompatParcelizer(zzbvVar, getfunctionek5ggoqArr[1]) : androidx.room.Room.RemoteActionCompatParcelizer(zzbvVar, getfunctionek5ggoqArr[2]);
                if (!(getfunctionek5ggoqRemoteActionCompatParcelizer3 instanceof getHelpEK5gGoQ) || getfunctionek5ggoqRemoteActionCompatParcelizer3 == gethelpek5ggoq3 || getfunctionek5ggoqRemoteActionCompatParcelizer3 == gethelpek5ggoq2) {
                    return getfunctionek5ggoqRemoteActionCompatParcelizer3;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Illegal InternalType passed to Ternary.");
                return null;
            case 4:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                return gethelpek5ggoq;
            case 5:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                return getHelpEK5gGoQ.RemoteActionCompatParcelizer;
            case 6:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 1);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getInfoEK5gGoQ);
                getButtonZEK5gGoQ getbuttonzek5ggoq = serializer;
                String str = ((getInfoEK5gGoQ) getfunctionek5ggoqArr[0]).RemoteActionCompatParcelizer;
                HashSet hashSet = getbuttonzek5ggoq.RatingCompat;
                if (hashSet.contains(str)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write(af$$ExternalSyntheticOutline0.m("Macro cycle detected.  Current macro reference: ", str, ". Previous macro references: ", hashSet.toString()));
                    return null;
                }
                getbuttonzek5ggoq.MediaBrowserCompatMediaItem = 0;
                return getbuttonzek5ggoq.read(str);
            case 7:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                return gethelpek5ggoq2;
            case 8:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                int length = getfunctionek5ggoqArr.length;
                ArrayList arrayList = new ArrayList(length);
                while (i2 < length) {
                    arrayList.add(getfunctionek5ggoqArr[i2]);
                    i2++;
                }
                return new getHenkanEK5gGoQ(arrayList);
            case 9:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                return gethelpek5ggoq3;
            case 10:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                int length2 = getfunctionek5ggoqArr.length;
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(length2 > 0);
                while (i2 < length2) {
                    getFunctionEK5gGoQ getfunctionek5ggoq = getfunctionek5ggoqArr[i2];
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(getfunctionek5ggoq);
                    accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq instanceof getInfoEK5gGoQ);
                    zzbvVar.serializer((getFunctionEK5gGoQ) gethelpek5ggoq3, ((getInfoEK5gGoQ) getfunctionek5ggoq).RemoteActionCompatParcelizer);
                    i2++;
                }
                return gethelpek5ggoq3;
            case 11:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 4);
                getFunctionEK5gGoQ getfunctionek5ggoqRemoteActionCompatParcelizer4 = androidx.room.Room.RemoteActionCompatParcelizer(zzbvVar, getfunctionek5ggoqArr[3]);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqRemoteActionCompatParcelizer4 instanceof getHenkanEK5gGoQ);
                ArrayList arrayList2 = ((getHenkanEK5gGoQ) getfunctionek5ggoqRemoteActionCompatParcelizer4).serializer;
                getFunctionEK5gGoQ getfunctionek5ggoq2 = getfunctionek5ggoqArr[2];
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq2 instanceof getGuideEK5gGoQ);
                if (!((getGuideEK5gGoQ) getfunctionek5ggoq2).RemoteActionCompatParcelizer.booleanValue()) {
                    while (LoadBalancer$Helper.serializer(androidx.room.Room.RemoteActionCompatParcelizer(zzbvVar, getfunctionek5ggoqArr[0]))) {
                        if (gethelpek5ggoqSerializer.MediaBrowserCompatMediaItem) {
                            androidx.room.Room.RemoteActionCompatParcelizer(zzbvVar, getfunctionek5ggoqArr[1]);
                        }
                    }
                    return gethelpek5ggoq3;
                }
                gethelpek5ggoqSerializer = androidx.room.Room.serializer(zzbvVar, arrayList2);
                if (gethelpek5ggoqSerializer == gethelpek5ggoq) {
                    return gethelpek5ggoq3;
                }
                if (!gethelpek5ggoqSerializer.MediaBrowserCompatMediaItem) {
                    while (LoadBalancer$Helper.serializer(androidx.room.Room.RemoteActionCompatParcelizer(zzbvVar, getfunctionek5ggoqArr[0])) && (gethelpek5ggoqSerializer = androidx.room.Room.serializer(zzbvVar, arrayList2)) != gethelpek5ggoq) {
                        if (gethelpek5ggoqSerializer.MediaBrowserCompatMediaItem) {
                            androidx.room.Room.RemoteActionCompatParcelizer(zzbvVar, getfunctionek5ggoqArr[1]);
                        }
                    }
                    return gethelpek5ggoq3;
                }
                return gethelpek5ggoqSerializer;
            case 12:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                return zzbvVar.serializer("gtm.globals.eventName") ? zzbvVar.read("gtm.globals.eventName") : gethelpek5ggoq2;
            case 13:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                return new getInfoEK5gGoQ("5.06");
            case 14:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                java.util.Locale locale = java.util.Locale.getDefault();
                if (locale == null) {
                    return new getInfoEK5gGoQ("");
                }
                String language = locale.getLanguage();
                return language == null ? new getInfoEK5gGoQ("") : new getInfoEK5gGoQ(language.toLowerCase());
            case 15:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                return new getInfoEK5gGoQ(java.util.Locale.getDefault().getCountry());
            case 16:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                return new getInfoEK5gGoQ(Build.VERSION.RELEASE);
            case 17:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                return new getInfoEK5gGoQ("Android");
            case 18:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                return new getInfoEK5gGoQ(c8$$ExternalSyntheticOutline0.m(Build.VERSION.SDK_INT, "5.06-"));
            default:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                return new getGEK5gGoQ(Double.valueOf(Build.VERSION.SDK_INT));
        }
    }
}
