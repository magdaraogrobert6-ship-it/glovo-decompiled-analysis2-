package o;

import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.InjectUsing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "TransportPostProcessor")
public final class getByteSize {
    private final getVerticalAccuracy IconCompatParcelizer;
    private final removeProperty RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;
    private final component4android_sdk_base_release serializer;
    private final getCooldownEnterSeconds write;

    public final List<cleandefault> serializer(final long j, final long j2, boolean z) {
        Long l;
        final List listSingletonList = Collections.singletonList(r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs.class);
        List list = Collections.EMPTY_LIST;
        final getCooldownEnterSeconds getcooldownenterseconds = this.write;
        List list2 = (List) getcooldownenterseconds.serializer(list, (r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk<List>) new r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk() { // from class: o.getCooldownExitSeconds
            @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
            public final Object serializer(SQLiteDatabase sQLiteDatabase) {
                return getCooldownEnterSeconds.read(getcooldownenterseconds, j, j2, listSingletonList, sQLiteDatabase);
            }
        });
        list2.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = ((getCooldownEnterSeconds.read) it.next()).RemoteActionCompatParcelizer(this.serializer);
            getLongitudeannotations getlongitudeannotationsSerializer = null;
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && (l = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.MediaSessionCompatQueueItem) != null) {
                getlongitudeannotationsSerializer = getLongitudeannotations.serializer(this.IconCompatParcelizer, r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer, l.longValue(), null);
            }
            if (getlongitudeannotationsSerializer != null) {
                arrayList.add(getlongitudeannotationsSerializer);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        parseLonglambda0 parselonglambda0 = this.read;
        if (zIsEmpty) {
            parselonglambda0.IconCompatParcelizer("No transport classifications found to post-process", new Object[0]);
            return instance_delegatelambda0.write;
        }
        parselonglambda0.IconCompatParcelizer("Found " + arrayList.size() + " transport classifications to post-process", new Object[0]);
        removeProperty removeproperty = this.RemoteActionCompatParcelizer;
        if (!removeproperty.write()) {
            parselonglambda0.IconCompatParcelizer("Failed to start PostProcessorModelExecutor", new Object[0]);
            return containsProperty.IconCompatParcelizer(getFlushMaxMinutesannotations.serializer(arrayList), z);
        }
        ArrayList arrayListWrite = removeproperty.write(arrayList);
        parselonglambda0.IconCompatParcelizer("Post-processed transports size: " + arrayListWrite.size(), new Object[0]);
        removeproperty.serializer();
        List<cleandefault> listIconCompatParcelizer = containsProperty.IconCompatParcelizer(arrayListWrite, z);
        parselonglambda0.IconCompatParcelizer("Merged transports size: " + listIconCompatParcelizer.size(), new Object[0]);
        return listIconCompatParcelizer;
    }

    public getByteSize(getCooldownEnterSeconds getcooldownenterseconds, component4android_sdk_base_release component4android_sdk_base_releaseVar, getVerticalAccuracy getverticalaccuracy, containsProperty containsproperty, removeProperty removeproperty, parseLonglambda0 parselonglambda0) {
        getcooldownenterseconds.getClass();
        component4android_sdk_base_releaseVar.getClass();
        getverticalaccuracy.getClass();
        containsproperty.getClass();
        removeproperty.getClass();
        parselonglambda0.getClass();
        this.write = getcooldownenterseconds;
        this.serializer = component4android_sdk_base_releaseVar;
        this.IconCompatParcelizer = getverticalaccuracy;
        this.RemoteActionCompatParcelizer = removeproperty;
        this.read = parselonglambda0;
    }
}
