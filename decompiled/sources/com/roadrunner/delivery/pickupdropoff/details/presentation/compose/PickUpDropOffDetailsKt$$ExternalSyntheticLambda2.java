package com.roadrunner.delivery.pickupdropoff.details.presentation.compose;

import androidx.compose.animation.core.TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl;
import com.roadrunner.delivery.pickupdropoff.details.api.PickUpDropOffDetailsUiModel;
import com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl;
import com.roadrunner.delivery.state.TrackingEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.ComposeViewAdapter;
import o.FontMuC2MFsdefault;
import o.createFromParcel;
import o.getCieXyz;
import o.getPersonNamePrefix;
import o.initui_toolingdefault;
import o.onMove;
import o.r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class PickUpDropOffDetailsKt$$ExternalSyntheticLambda2 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ PickUpDropOffDetailsUiModel RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ PickUpDropOffDetailsKt$$ExternalSyntheticLambda2(PickUpDropOffDetailsUiModel pickUpDropOffDetailsUiModel, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = pickUpDropOffDetailsUiModel;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        String str;
        int i = 2 % 2;
        int i2 = this.serializer;
        PickUpDropOffDetailsUiModel pickUpDropOffDetailsUiModel = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw r8lambdaaiqcq78tsty9mg_yjfdvtlmfw = (r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw) obj;
            r8lambdaaiqcq78tsty9mg_yjfdvtlmfw.getClass();
            PickUpDropOffDetailsUiModelImpl pickUpDropOffDetailsUiModelImpl = (PickUpDropOffDetailsUiModelImpl) pickUpDropOffDetailsUiModel;
            pickUpDropOffDetailsUiModelImpl.getClass();
            initui_toolingdefault initui_toolingdefaultVar = pickUpDropOffDetailsUiModelImpl.MediaMetadataCompat;
            initui_toolingdefaultVar.read.logEvent("button_click", initui_toolingdefaultVar.write.write());
            pickUpDropOffDetailsUiModelImpl.IconCompatParcelizer.serializer(new ComposeViewAdapter(r8lambdaaiqcq78tsty9mg_yjfdvtlmfw));
            return createFromParcel.INSTANCE;
        }
        ((getPersonNamePrefix) obj).getClass();
        initui_toolingdefault initui_toolingdefaultVar2 = ((PickUpDropOffDetailsUiModelImpl) pickUpDropOffDetailsUiModel).MediaMetadataCompat;
        List list = (List) ((StateV3AnalyticsProviderImpl) initui_toolingdefaultVar2.write.read).write.read();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                Iterator it2 = arrayList.iterator();
                while (!(!it2.hasNext())) {
                    int i3 = IconCompatParcelizer + 85;
                    read = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    TrackingEvent trackingEvent = (TrackingEvent) it2.next();
                    Map mapRemoteActionCompatParcelizer = FontMuC2MFsdefault.RemoteActionCompatParcelizer(trackingEvent.parameters);
                    if (mapRemoteActionCompatParcelizer.containsKey("screenName")) {
                        int i5 = IconCompatParcelizer + 3;
                        read = i5 % Fields.SpotShadowColor;
                        if (i5 % 2 != 0) {
                            throw null;
                        }
                        str = (String) onMove.read(mapRemoteActionCompatParcelizer, "screenName");
                    } else {
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new IllegalStateException(), "No Screen name found in tracking params from BE, params " + mapRemoteActionCompatParcelizer + ", event " + trackingEvent, new Object[0]);
                        str = trackingEvent.name;
                    }
                    initui_toolingdefaultVar2.read.IconCompatParcelizer(str, mapRemoteActionCompatParcelizer);
                }
                return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(13, pickUpDropOffDetailsUiModel);
            }
            Object next = it.next();
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((TrackingEvent) next).trigger, "screen_opened"}, getCieXyz.write())).booleanValue())) {
                int i6 = read + 97;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    arrayList.add(next);
                    obj2.hashCode();
                    throw null;
                }
                arrayList.add(next);
            }
        }
    }
}
