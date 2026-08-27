package o;

import android.util.Pair;
import com.sentiance.sdk.InjectUsing;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "CallEventsForTransportProvider")
public final class setClickBehavior {
    private final setTestSend IconCompatParcelizer;
    private final setAnimateOut MediaSessionCompatQueueItem;
    private final setAltImageText RemoteActionCompatParcelizer;
    private final setHeaderTextColor read;
    private final parseLonglambda0 serializer;
    private final migrateTriggersStorageToJsonlambda1 write;

    public setClickBehavior(parseLonglambda0 parselonglambda0, setHeaderTextColor setheadertextcolor, migrateTriggersStorageToJsonlambda1 migratetriggersstoragetojsonlambda1, setAltImageText setaltimagetext, setTestSend settestsend, setAnimateOut setanimateout) {
        parselonglambda0.getClass();
        setheadertextcolor.getClass();
        migratetriggersstoragetojsonlambda1.getClass();
        setaltimagetext.getClass();
        settestsend.getClass();
        setanimateout.getClass();
        this.serializer = parselonglambda0;
        this.read = setheadertextcolor;
        this.write = migratetriggersstoragetojsonlambda1;
        this.RemoteActionCompatParcelizer = setaltimagetext;
        this.IconCompatParcelizer = settestsend;
        this.MediaSessionCompatQueueItem = setanimateout;
    }

    public final List<r8lambdaSfG0H956DzQ3kMqujvKuyGX6Fc> IconCompatParcelizer(String str) {
        str.getClass();
        this.serializer.IconCompatParcelizer("Retrieving call while moving events for transport with ID: %s", str);
        Pair<Long, Long> pairSerializer = this.write.serializer(str);
        InAppMessageHtml inAppMessageHtmlMediaBrowserCompatMediaItem = InAppMessageHtml.MediaBrowserCompatMediaItem();
        setHeaderTextColor setheadertextcolor = this.read;
        List listIconCompatParcelizer = setheadertextcolor.IconCompatParcelizer(inAppMessageHtmlMediaBrowserCompatMediaItem, str);
        listIconCompatParcelizer.getClass();
        handleLogClick handlelogclick = (handleLogClick) onContentCardDismissed.MediaMetadataCompat(listIconCompatParcelizer);
        List<handleLogClickdefault> listMediaSessionCompatResultReceiverWrapper = handlelogclick != null ? handlelogclick.MediaSessionCompatResultReceiverWrapper() : null;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (listMediaSessionCompatResultReceiverWrapper == null) {
            listMediaSessionCompatResultReceiverWrapper = instance_delegatelambda0Var;
        }
        List listIconCompatParcelizer2 = setheadertextcolor.IconCompatParcelizer(InAppMessageHtml.MediaBrowserCompatMediaItem(), str);
        listIconCompatParcelizer2.getClass();
        handleLogClick handlelogclick2 = (handleLogClick) onContentCardDismissed.MediaMetadataCompat(listIconCompatParcelizer2);
        Boolean bool = handlelogclick2 != null ? handlelogclick2.read() : null;
        if (pairSerializer != null) {
            Long l = (Long) pairSerializer.first;
            Long l2 = (Long) pairSerializer.second;
            if (l2 != null) {
                l.getClass();
                ArrayList<r8lambdaF43WjDaaNoL1Ga_eezyHY_7dOps> arrayListRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(l.longValue(), l2.longValue(), listMediaSessionCompatResultReceiverWrapper);
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayListRemoteActionCompatParcelizer, 10));
                for (r8lambdaF43WjDaaNoL1Ga_eezyHY_7dOps r8lambdaf43wjdaanol1ga_eezyhy_7dops : arrayListRemoteActionCompatParcelizer) {
                    arrayList.add(new r8lambdaSfG0H956DzQ3kMqujvKuyGX6Fc(r8lambdaf43wjdaanol1ga_eezyhy_7dops.serializer(), r8lambdaf43wjdaanol1ga_eezyhy_7dops.write(), r8lambdaf43wjdaanol1ga_eezyhy_7dops.IconCompatParcelizer(), r8lambdaf43wjdaanol1ga_eezyhy_7dops.RemoteActionCompatParcelizer(), this.IconCompatParcelizer.read(r8lambdaf43wjdaanol1ga_eezyhy_7dops.serializer(), r8lambdaf43wjdaanol1ga_eezyhy_7dops.write(), listMediaSessionCompatResultReceiverWrapper), this.MediaSessionCompatQueueItem.serializer(r8lambdaf43wjdaanol1ga_eezyhy_7dops.serializer(), r8lambdaf43wjdaanol1ga_eezyhy_7dops.write(), bool)));
                }
                return arrayList;
            }
        }
        return instance_delegatelambda0Var;
    }
}
