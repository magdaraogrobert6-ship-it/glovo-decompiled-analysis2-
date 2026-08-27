package com.roadrunner.delivery.accept.declinebutton.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.delivery.state.Trigger;
import com.roadrunner.home.nest.NestLoadingServiceImpl$special$$inlined$map$1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import o.AndroidView_androidKtcreateAndroidViewNodeFactory11;
import o.accessrequireViewFactoryHolder;
import o.accesstoNestedScrollSource;
import o.copyp1EtxEg;
import o.getFocusTargetOfEmbeddedViewWrapper;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onMove;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class DeclineButtonClickEventRetriever {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final accessrequireViewFactoryHolder write;

    public DeclineButtonClickEventRetriever(accessrequireViewFactoryHolder accessrequireviewfactoryholder) {
        accessrequireviewfactoryholder.getClass();
        this.write = accessrequireviewfactoryholder;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:90:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[LOOP:2: B:51:0x00ca->B:91:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[LOOP:3: B:56:0x00f2->B:94:?, LOOP_END, SYNTHETIC] */
    public final Object invoke(ContinuationImpl continuationImpl) {
        copyp1EtxEg copyp1etxeg;
        Object next;
        List list;
        String str;
        String str2;
        Object next2;
        String str3;
        int i = 2 % 2;
        if (continuationImpl instanceof copyp1EtxEg) {
            copyp1etxeg = (copyp1EtxEg) continuationImpl;
            int i2 = copyp1etxeg.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                copyp1etxeg.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                copyp1etxeg = new copyp1EtxEg(this, continuationImpl);
            }
        } else {
            copyp1etxeg = new copyp1EtxEg(this, continuationImpl);
        }
        Object objFirst = copyp1etxeg.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = copyp1etxeg.RemoteActionCompatParcelizer;
        Object obj = null;
        if (i3 != 0) {
            int i4 = IconCompatParcelizer + 1;
            int i5 = i4 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i5;
            if (i4 % 2 != 0 ? i3 != 1 : i3 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = i5 + 89;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            NestLoadingServiceImpl$special$$inlined$map$1 nestLoadingServiceImpl$special$$inlined$map$1 = new NestLoadingServiceImpl$special$$inlined$map$1(((StateProviderImpl) ((accesstoNestedScrollSource) this.write)).MediaBrowserCompatMediaItem, 5);
            copyp1etxeg.RemoteActionCompatParcelizer = 1;
            objFirst = FlowKt.first(nestLoadingServiceImpl$special$$inlined$map$1, copyp1etxeg);
            if (objFirst == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Object obj2 = ((onItemDismiss) objFirst).IconCompatParcelizer;
        if (obj2 instanceof isItemDismissable) {
            int i8 = IconCompatParcelizer + 77;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            obj2 = null;
        }
        AndroidView_androidKtcreateAndroidViewNodeFactory11 androidView_androidKtcreateAndroidViewNodeFactory11 = (AndroidView_androidKtcreateAndroidViewNodeFactory11) obj2;
        if (androidView_androidKtcreateAndroidViewNodeFactory11 != null) {
            int i10 = RemoteActionCompatParcelizer + 89;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                List list2 = androidView_androidKtcreateAndroidViewNodeFactory11.headerComponents;
                throw null;
            }
            List list3 = androidView_androidKtcreateAndroidViewNodeFactory11.headerComponents;
            if (list3 != null) {
                Iterator it = list3.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next instanceof getFocusTargetOfEmbeddedViewWrapper));
                getFocusTargetOfEmbeddedViewWrapper getfocustargetofembeddedviewwrapper = (getFocusTargetOfEmbeddedViewWrapper) next;
                if (getfocustargetofembeddedviewwrapper != null && (list = getfocustargetofembeddedviewwrapper.events) != null) {
                    List<TrackingEvent> list4 = list;
                    if (list4 instanceof Collection) {
                        int i11 = IconCompatParcelizer + 81;
                        RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                        if (i11 % 2 == 0) {
                            list4.isEmpty();
                            obj.hashCode();
                            throw null;
                        }
                        if (!list4.isEmpty()) {
                            for (TrackingEvent trackingEvent : list4) {
                                Trigger.Companion companion = Trigger.Companion;
                                str = trackingEvent.trigger;
                                companion.getClass();
                                if (Trigger.Companion.write(str) == Trigger.DIALOG_BUTTON_CLICK) {
                                    int i12 = RemoteActionCompatParcelizer + 13;
                                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                                    int i13 = i12 % 2;
                                    for (Object obj3 : list4) {
                                        Trigger.Companion companion2 = Trigger.Companion;
                                        str2 = ((TrackingEvent) obj3).trigger;
                                        companion2.getClass();
                                        if (Trigger.Companion.write(str2) == Trigger.DIALOG_BUTTON_CLICK) {
                                            obj = obj3;
                                            break;
                                        }
                                    }
                                    return (TrackingEvent) obj;
                                }
                            }
                        }
                    } else {
                        while (r1.hasNext()) {
                            Trigger.Companion companion3 = Trigger.Companion;
                            str = trackingEvent.trigger;
                            companion3.getClass();
                            if (Trigger.Companion.write(str) == Trigger.DIALOG_BUTTON_CLICK) {
                                int i14 = RemoteActionCompatParcelizer + 13;
                                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                                int i15 = i14 % 2;
                                while (r8.hasNext()) {
                                    Trigger.Companion companion4 = Trigger.Companion;
                                    str2 = ((TrackingEvent) obj3).trigger;
                                    companion4.getClass();
                                    if (Trigger.Companion.write(str2) == Trigger.DIALOG_BUTTON_CLICK) {
                                        obj = obj3;
                                        break;
                                    }
                                }
                                return (TrackingEvent) obj;
                            }
                        }
                    }
                    Iterator it2 = list4.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        Trigger.Companion companion5 = Trigger.Companion;
                        str3 = ((TrackingEvent) next2).trigger;
                        companion5.getClass();
                    } while (Trigger.Companion.write(str3) != Trigger.DIALOG_DECLINE_BUTTON_CLICK);
                    TrackingEvent trackingEvent2 = (TrackingEvent) next2;
                    if (trackingEvent2 != null) {
                        int i16 = RemoteActionCompatParcelizer + 53;
                        IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                        Map map = trackingEvent2.parameters;
                        TrackingEvent trackingEventIconCompatParcelizer = TrackingEvent.IconCompatParcelizer(trackingEvent2, Trigger.DIALOG_BUTTON_CLICK.getSerialName(), map != null ? onMove.serializer(map, new onViewAttachedToWindowlambda0("ResponseSource", "accept screen")) : null, 2);
                        int i18 = RemoteActionCompatParcelizer + 57;
                        IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                        if (i18 % 2 == 0) {
                            return trackingEventIconCompatParcelizer;
                        }
                        throw null;
                    }
                }
            }
        }
        return null;
    }
}
