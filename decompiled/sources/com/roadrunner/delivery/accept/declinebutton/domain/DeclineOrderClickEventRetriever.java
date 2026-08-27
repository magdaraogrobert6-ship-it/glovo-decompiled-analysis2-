package com.roadrunner.delivery.accept.declinebutton.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.delivery.state.Trigger;
import com.roadrunner.home.nest.NestLoadingServiceImpl$special$$inlined$map$1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import o.AndroidView_androidKtcreateAndroidViewNodeFactory11;
import o.accessrequireViewFactoryHolder;
import o.accesstoNestedScrollSource;
import o.copyv2rsoow;
import o.getFocusTargetOfEmbeddedViewWrapper;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onMove;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class DeclineOrderClickEventRetriever {
    private static int read = 0;
    private static int serializer = 1;
    public final accessrequireViewFactoryHolder IconCompatParcelizer;

    public DeclineOrderClickEventRetriever(accessrequireViewFactoryHolder accessrequireviewfactoryholder) {
        accessrequireviewfactoryholder.getClass();
        this.IconCompatParcelizer = accessrequireviewfactoryholder;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        copyv2rsoow copyv2rsoowVar;
        getFocusTargetOfEmbeddedViewWrapper getfocustargetofembeddedviewwrapper;
        TrackingEvent trackingEvent;
        List list;
        Object next;
        String str;
        List list2;
        Object next2;
        int i = 2 % 2;
        if (continuationImpl instanceof copyv2rsoow) {
            int i2 = read + 9;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            copyv2rsoowVar = (copyv2rsoow) continuationImpl;
            int i4 = copyv2rsoowVar.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = serializer + 3;
                read = i5 % Fields.SpotShadowColor;
                copyv2rsoowVar.serializer = i5 % 2 != 0 ? i4 * Integer.MIN_VALUE : i4 - Integer.MIN_VALUE;
            } else {
                copyv2rsoowVar = new copyv2rsoow(this, continuationImpl);
            }
        } else {
            copyv2rsoowVar = new copyv2rsoow(this, continuationImpl);
        }
        Object objFirst = copyv2rsoowVar.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = copyv2rsoowVar.serializer;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            NestLoadingServiceImpl$special$$inlined$map$1 nestLoadingServiceImpl$special$$inlined$map$1 = new NestLoadingServiceImpl$special$$inlined$map$1(((StateProviderImpl) ((accesstoNestedScrollSource) this.IconCompatParcelizer)).MediaBrowserCompatMediaItem, 6);
            copyv2rsoowVar.serializer = 1;
            objFirst = FlowKt.first(nestLoadingServiceImpl$special$$inlined$map$1, copyv2rsoowVar);
            if (objFirst == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
        }
        Object obj = ((onItemDismiss) objFirst).IconCompatParcelizer;
        if (obj instanceof isItemDismissable) {
            obj = null;
        }
        AndroidView_androidKtcreateAndroidViewNodeFactory11 androidView_androidKtcreateAndroidViewNodeFactory11 = (AndroidView_androidKtcreateAndroidViewNodeFactory11) obj;
        if (androidView_androidKtcreateAndroidViewNodeFactory11 == null || (list2 = androidView_androidKtcreateAndroidViewNodeFactory11.headerComponents) == null) {
            getfocustargetofembeddedviewwrapper = null;
        } else {
            int i7 = read + 13;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                int i9 = serializer + 125;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                next2 = it.next();
            } while (!(next2 instanceof getFocusTargetOfEmbeddedViewWrapper));
            getfocustargetofembeddedviewwrapper = (getFocusTargetOfEmbeddedViewWrapper) next2;
        }
        if (getfocustargetofembeddedviewwrapper == null || (list = getfocustargetofembeddedviewwrapper.events) == null) {
            trackingEvent = null;
        } else {
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                Trigger.Companion companion = Trigger.Companion;
                str = ((TrackingEvent) next).trigger;
                companion.getClass();
            } while (Trigger.Companion.write(str) != Trigger.DIALOG_DECLINE_BUTTON_CLICK);
            trackingEvent = (TrackingEvent) next;
        }
        if (trackingEvent == null) {
            return null;
        }
        Map map = trackingEvent.parameters;
        return TrackingEvent.IconCompatParcelizer(trackingEvent, null, map != null ? onMove.serializer(map, new onViewAttachedToWindowlambda0("ResponseSource", "dialog")) : null, 3);
    }
}
