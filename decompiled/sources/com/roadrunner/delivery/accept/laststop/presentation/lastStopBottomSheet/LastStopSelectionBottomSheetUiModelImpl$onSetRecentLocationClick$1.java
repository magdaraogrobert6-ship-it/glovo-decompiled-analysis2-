package com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.delivery.state.Trigger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isOpaque;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class LastStopSelectionBottomSheetUiModelImpl$onSetRecentLocationClick$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ isOpaque IconCompatParcelizer;
    public final /* synthetic */ LastStopSelectionBottomSheetUiModelImpl RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LastStopSelectionBottomSheetUiModelImpl$onSetRecentLocationClick$1(int i, isOpaque isopaque, LastStopSelectionBottomSheetUiModelImpl lastStopSelectionBottomSheetUiModelImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.IconCompatParcelizer = isopaque;
        this.RemoteActionCompatParcelizer = lastStopSelectionBottomSheetUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        LastStopSelectionBottomSheetUiModelImpl$onSetRecentLocationClick$1 lastStopSelectionBottomSheetUiModelImpl$onSetRecentLocationClick$1 = new LastStopSelectionBottomSheetUiModelImpl$onSetRecentLocationClick$1(this.read, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        int i2 = write + 113;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 51 / 0;
        }
        return lastStopSelectionBottomSheetUiModelImpl$onSetRecentLocationClick$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 85;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        LastStopSelectionBottomSheetUiModelImpl$onSetRecentLocationClick$1 lastStopSelectionBottomSheetUiModelImpl$onSetRecentLocationClick$1 = (LastStopSelectionBottomSheetUiModelImpl$onSetRecentLocationClick$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        lastStopSelectionBottomSheetUiModelImpl$onSetRecentLocationClick$1.invokeSuspend(createfromparcel);
        int i4 = serializer + 35;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        int i = 2 % 2;
        int i2 = write + 27;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        int i4 = this.read;
        isOpaque isopaque = this.IconCompatParcelizer;
        if (isopaque != null && (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = isopaque.MediaMetadataCompat) != null) {
            ArrayList<TrackingEvent> arrayList = new ArrayList();
            int i5 = serializer + 11;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 5 / 2;
            }
            for (Object obj2 : r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
                Trigger.Companion companion = Trigger.Companion;
                String str = ((TrackingEvent) obj2).trigger;
                companion.getClass();
                if (Trigger.Companion.write(str) == Trigger.LAST_STOP_SELECT_RECENT_LOCATION) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
            for (TrackingEvent trackingEvent : arrayList) {
                int i7 = serializer + 57;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                Map map = trackingEvent.parameters;
                if (map == null) {
                    map = SimpleItemTouchHelperCallback.serializer;
                }
                arrayList2.add(TrackingEvent.IconCompatParcelizer(trackingEvent, null, onMove.serializer(map, new onViewAttachedToWindowlambda0("rank", new Integer(i4 + 1))), 3));
            }
            DeliveryAcceptanceLogger deliveryAcceptanceLogger = this.RemoteActionCompatParcelizer.read;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                deliveryAcceptanceLogger.serializer((TrackingEvent) it.next());
            }
        }
        return createFromParcel.INSTANCE;
    }
}
