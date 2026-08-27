package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes4.dex */
public final class getIntentArrayWithConfiguredBackStack extends TimerTask {
    public final /* synthetic */ getWebViewActivityIntent serializer;
    public final /* synthetic */ ArrayList write;

    public getIntentArrayWithConfiguredBackStack(getWebViewActivityIntent getwebviewactivityintent, ArrayList arrayList) {
        this.serializer = getwebviewactivityintent;
        this.write = arrayList;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis();
        getWebViewActivityIntent getwebviewactivityintent = this.serializer;
        if (jCurrentTimeMillis - getwebviewactivityintent.RemoteActionCompatParcelizer <= 10) {
            return;
        }
        ArrayList arrayList = this.write;
        arrayList.clear();
        getwebviewactivityintent.RemoteActionCompatParcelizer = jCurrentTimeMillis;
        getSrcJson getsrcjson = new getSrcJson(getwebviewactivityintent.MediaMetadataCompat.getDateProvider().RemoteActionCompatParcelizer().read());
        Iterator it = getwebviewactivityintent.MediaSessionCompatQueueItem.iterator();
        while (it.hasNext()) {
            ((containsAnyPushPermissionBrazeActions) it.next()).serializer(getsrcjson);
        }
        for (openUriWithWebViewActivity openuriwithwebviewactivity : getwebviewactivityintent.IconCompatParcelizer.values()) {
            ArrayList arrayList2 = openuriwithwebviewactivity.write;
            getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release = openuriwithwebviewactivity.RemoteActionCompatParcelizer;
            arrayList2.add(getsrcjson);
            if (getchildstepiteratorandroid_sdk_ui_release != null && openuriwithwebviewactivity.IconCompatParcelizer.MediaMetadataCompat.getDateProvider().RemoteActionCompatParcelizer().read() > openuriwithwebviewactivity.read + 30000000000L) {
                arrayList.add(getchildstepiteratorandroid_sdk_ui_release);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            getwebviewactivityintent.RemoteActionCompatParcelizer((getChildStepIteratorandroid_sdk_ui_release) it2.next());
        }
    }
}
