package com.roadrunner.logger.logger.perseus;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.perseus.Perseus;
import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import com.roadrunner.logger.api.data.AppInfoChangedListener;
import dagger.Lazy;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import o.ExecutableQueryexecuteAsOneOrNull1;
import o.executeAsOneOrNull;
import o.getContentViewGroupParentLayout;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isOpenInternalroom_runtime;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.transactionWithResult;
import o.visitLocalDescendantsdefault;

/* JADX INFO: loaded from: classes3.dex */
public final class PerseusUserAttributesChangedListener implements AppInfoChangedListener {
    private static int IconCompatParcelizer = 0;
    private static int MediaMetadataCompat = 1;
    public final Lazy RemoteActionCompatParcelizer;
    public final getContentViewGroupParentLayout read;
    public final Lazy serializer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU write;

    public PerseusUserAttributesChangedListener(Lazy lazy, Lazy lazy2, isOpenInternalroom_runtime isopeninternalroom_runtime, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.RemoteActionCompatParcelizer = lazy;
        this.serializer = lazy2;
        this.read = getcontentviewgroupparentlayout;
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateUserProperty(String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 115;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        str2.getClass();
        Map mapSingletonMap = Collections.singletonMap(str, str2);
        mapSingletonMap.getClass();
        updateProperties(mapSingletonMap);
        int i4 = IconCompatParcelizer + 95;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateUserProperties(ExecutableQueryexecuteAsOneOrNull1 executableQueryexecuteAsOneOrNull1) {
        String str;
        int i = 2 % 2;
        executableQueryexecuteAsOneOrNull1.getClass();
        Object objWrite = this.RemoteActionCompatParcelizer.write();
        objWrite.getClass();
        int i2 = 7167;
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) executableQueryexecuteAsOneOrNull1.read)) {
            Perseus.serializer(null, 7167, null, null, "");
        } else {
            int i3 = MediaMetadataCompat + 91;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                str = executableQueryexecuteAsOneOrNull1.read();
                i2 = 18576;
            } else {
                str = executableQueryexecuteAsOneOrNull1.read();
            }
            Perseus.serializer(null, i2, null, null, str);
            int i4 = MediaMetadataCompat + 67;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 3 % 5;
            }
        }
        String str2 = executableQueryexecuteAsOneOrNull1.RemoteActionCompatParcelizer;
        str2.getClass();
        Perseus.serializer(str2, 8189, null, null, null);
        String str3 = executableQueryexecuteAsOneOrNull1.serializer;
        str3.getClass();
        Perseus.serializer(null, 8159, str3, null, null);
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void onInfoUpdated(executeAsOneOrNull executeasoneornull) {
        int i = 2 % 2;
        executeasoneornull.getClass();
        ExecutableQueryexecuteAsOneOrNull1 executableQueryexecuteAsOneOrNull1 = executeasoneornull.MediaMetadataCompat;
        updateUserProperties(executableQueryexecuteAsOneOrNull1);
        Object objWrite = this.RemoteActionCompatParcelizer.write();
        objWrite.getClass();
        transactionWithResult transactionwithresult = (transactionWithResult) objWrite;
        Object obj = null;
        Perseus.serializer(null, 7935, null, executeasoneornull.write, null);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("riderId", executableQueryexecuteAsOneOrNull1.read);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0(PushNotificationParserObj.COUNTRY_KEY, executableQueryexecuteAsOneOrNull1.serializer);
        String str = executeasoneornull.read;
        if (str == null) {
            int i2 = MediaMetadataCompat + 9;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str = "";
        }
        transactionWithResult.read(onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, onviewattachedtowindowlambda1, new onViewAttachedToWindowlambda0("shiftId", str), new onViewAttachedToWindowlambda0("deviceId", executableQueryexecuteAsOneOrNull1.RemoteActionCompatParcelizer)));
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.write;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i3 = MediaMetadataCompat + 25;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                throw null;
            }
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.write = BuildersKt.RemoteActionCompatParcelizer(this.read, null, null, new HeatmapMapLayerUiModelImpl$1(this, transactionwithresult, null, 28), 3);
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateProperties(Map map) {
        int i = 2 % 2;
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(map.size()));
        Iterator it = map.entrySet().iterator();
        while (!(!it.hasNext())) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(visitLocalDescendantsdefault.LOWER_UNDERSCORE.to(visitLocalDescendantsdefault.LOWER_CAMEL, (String) entry.getKey()), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(linkedHashMap.size()));
        int i2 = MediaMetadataCompat + 79;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            int i4 = IconCompatParcelizer + 73;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            linkedHashMap2.put(entry2.getKey(), entry2.getValue().toString());
        }
        Object objWrite = this.RemoteActionCompatParcelizer.write();
        objWrite.getClass();
        transactionWithResult.read(linkedHashMap2);
    }
}
