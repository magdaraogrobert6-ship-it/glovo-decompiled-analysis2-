package o;

import android.util.Pair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.thrift.O$b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getCardType<T extends r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE> extends logBaiduNotificationClicklambda1 {
    private final setSoundIfPresentAndSupportedlambda1 RemoteActionCompatParcelizer;
    private final List<T> write;

    public abstract getDefaultNotificationAccentColorandroid_sdk_base_release IconCompatParcelizer(T t);

    public abstract short IconCompatParcelizer();

    public final getCustomLocationProviderNamesandroid_sdk_base_release read() {
        List<T> list = this.write;
        if (!list.isEmpty()) {
            byte b = 0;
            long jPlaybackStateCompatCustomAction = list.get(0).PlaybackStateCompatCustomAction();
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                int iPlaybackStateCompatCustomAction = (int) (t.PlaybackStateCompatCustomAction() - jPlaybackStateCompatCustomAction);
                getDefaultNotificationAccentColorandroid_sdk_base_release getdefaultnotificationaccentcolorandroid_sdk_base_releaseIconCompatParcelizer = IconCompatParcelizer(t);
                if (getdefaultnotificationaccentcolorandroid_sdk_base_releaseIconCompatParcelizer != null) {
                    r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY(b, 7);
                    String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = t.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                    if (strR8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'id' cannot be null");
                        return null;
                    }
                    r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer = strR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    r8lambdadeozq815xuuwmllyyvm_qv79qy.write = Integer.valueOf(iPlaybackStateCompatCustomAction);
                    r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer = getdefaultnotificationaccentcolorandroid_sdk_base_releaseIconCompatParcelizer;
                    arrayList.add(r8lambdadeozq815xuuwmllyyvm_qv79qy.IconCompatParcelizer());
                }
            }
            if (!arrayList.isEmpty()) {
                short sIconCompatParcelizer = IconCompatParcelizer();
                setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = this.RemoteActionCompatParcelizer;
                setsoundifpresentandsupportedlambda1.getClass();
                O$b o$b = new O$b(15);
                o$b.RemoteActionCompatParcelizer = Short.valueOf(sIconCompatParcelizer);
                o$b.write = 0L;
                o$b.read = arrayList;
                o$b.IconCompatParcelizer = (byte) 0;
                o$b.serializer = Long.valueOf(jPlaybackStateCompatCustomAction);
                return setsoundifpresentandsupportedlambda1.write(o$b.MediaSessionCompatQueueItem(), Long.valueOf(jPlaybackStateCompatCustomAction));
            }
        }
        return null;
    }

    @Override // o.logBaiduNotificationClicklambda1
    public final Iterator<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> write() {
        return new getDomain(this);
    }

    public getCardType(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, List<T> list) {
        this.RemoteActionCompatParcelizer = setsoundifpresentandsupportedlambda1;
        this.write = list;
    }
}
