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
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import o.AndroidView_androidKtcreateAndroidViewNodeFactory11;
import o.accessrequireViewFactoryHolder;
import o.accesstoNestedScrollSource;
import o.getFocusTargetOfEmbeddedViewWrapper;
import o.isItemDismissable;
import o.mergedA7vx0odefault;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class AcceptOrderClickEventRetriever {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final accessrequireViewFactoryHolder write;

    public AcceptOrderClickEventRetriever(accessrequireViewFactoryHolder accessrequireviewfactoryholder) {
        accessrequireviewfactoryholder.getClass();
        this.write = accessrequireviewfactoryholder;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        mergedA7vx0odefault mergeda7vx0odefault;
        getFocusTargetOfEmbeddedViewWrapper getfocustargetofembeddedviewwrapper;
        List list;
        Object next;
        int i = 2 % 2;
        if (continuationImpl instanceof mergedA7vx0odefault) {
            mergeda7vx0odefault = (mergedA7vx0odefault) continuationImpl;
            int i2 = mergeda7vx0odefault.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mergeda7vx0odefault.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                mergeda7vx0odefault = new mergedA7vx0odefault(this, continuationImpl);
            }
        } else {
            mergeda7vx0odefault = new mergedA7vx0odefault(this, continuationImpl);
        }
        Object objFirst = mergeda7vx0odefault.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = mergeda7vx0odefault.RemoteActionCompatParcelizer;
        Object obj = null;
        if (i3 != 0) {
            int i4 = IconCompatParcelizer + 55;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            NestLoadingServiceImpl$special$$inlined$map$1 nestLoadingServiceImpl$special$$inlined$map$1 = new NestLoadingServiceImpl$special$$inlined$map$1(((StateProviderImpl) ((accesstoNestedScrollSource) this.write)).MediaBrowserCompatMediaItem, 4);
            mergeda7vx0odefault.RemoteActionCompatParcelizer = 1;
            objFirst = FlowKt.first(nestLoadingServiceImpl$special$$inlined$map$1, mergeda7vx0odefault);
            if (objFirst == coroutineSingletons) {
                int i6 = serializer + 51;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 44 / 0;
                }
                return coroutineSingletons;
            }
        }
        Object obj2 = ((onItemDismiss) objFirst).IconCompatParcelizer;
        if (obj2 instanceof isItemDismissable) {
            obj2 = null;
        }
        AndroidView_androidKtcreateAndroidViewNodeFactory11 androidView_androidKtcreateAndroidViewNodeFactory11 = (AndroidView_androidKtcreateAndroidViewNodeFactory11) obj2;
        if (androidView_androidKtcreateAndroidViewNodeFactory11 != null) {
            int i8 = serializer + 79;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            List list2 = androidView_androidKtcreateAndroidViewNodeFactory11.headerComponents;
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    int i10 = serializer + 113;
                    IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 != 0) {
                        next = it.next();
                        if (next instanceof getFocusTargetOfEmbeddedViewWrapper) {
                            break;
                        }
                    } else {
                        next = it.next();
                        int i11 = 72 / 0;
                        if (next instanceof getFocusTargetOfEmbeddedViewWrapper) {
                            break;
                        }
                    }
                }
                getfocustargetofembeddedviewwrapper = (getFocusTargetOfEmbeddedViewWrapper) next;
            } else {
                getfocustargetofembeddedviewwrapper = null;
            }
        } else {
            getfocustargetofembeddedviewwrapper = null;
        }
        if (getfocustargetofembeddedviewwrapper == null || (list = getfocustargetofembeddedviewwrapper.events) == null) {
            return null;
        }
        for (Object obj3 : list) {
            int i12 = serializer + 119;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            Trigger.Companion companion = Trigger.Companion;
            String str = ((TrackingEvent) obj3).trigger;
            companion.getClass();
            if (Trigger.Companion.write(str) == Trigger.DIALOG_ACCEPT_BUTTON_CLICK) {
                obj = obj3;
                break;
            }
        }
        return (TrackingEvent) obj;
    }
}
