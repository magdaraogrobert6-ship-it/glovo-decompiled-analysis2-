package o;

import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class setNextTransition {
    private static int MediaSessionCompatQueueItem = 1;
    private static int read;
    public final setPopDirection IconCompatParcelizer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU RemoteActionCompatParcelizer;
    public final getContentViewGroupParentLayout serializer;
    public final setHasOptionsMenu write;

    public setNextTransition(setHasOptionsMenu sethasoptionsmenu, setPopDirection setpopdirection, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.write = sethasoptionsmenu;
        this.IconCompatParcelizer = setpopdirection;
        this.serializer = getcontentviewgroupparentlayout;
    }

    public final void IconCompatParcelizer(setArguments setarguments) {
        int i = 2 % 2;
        String str = setarguments.RemoteActionCompatParcelizer;
        str.getClass();
        if (!this.IconCompatParcelizer.read.containsKey(str)) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Cannot bind expandedBubbleContentComposableFactory. Invalid bubble contentKey found: ".concat(str), new Object[0]);
            return;
        }
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 121;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i5 = i2 + 125;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.write.serializer.IconCompatParcelizer.write(setarguments);
        this.RemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(this.serializer, null, null, new PushEventPublisherImpl$emit$1(setarguments, this, shortNewsContentCardView, 6), 3);
    }
}
