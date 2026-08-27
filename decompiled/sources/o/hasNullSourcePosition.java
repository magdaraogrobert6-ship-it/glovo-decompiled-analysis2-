package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.logger.logger.sentry.SentryCriticalIssueLogger;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class hasNullSourcePosition {
    private static int read = 1;
    private static int serializer;
    public final init IconCompatParcelizer;
    public final Clock RemoteActionCompatParcelizer;
    public final initlambda2020 write;

    public hasNullSourcePosition(Clock clock, init initVar, initlambda2020 initlambda2020Var) {
        this.RemoteActionCompatParcelizer = clock;
        this.IconCompatParcelizer = initVar;
        this.write = initlambda2020Var;
    }

    public final Object IconCompatParcelizer(List list) {
        Object next;
        Object isitemdismissable;
        isItemDismissable isitemdismissable2;
        int i = 2 % 2;
        int i2 = serializer + 67;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ZonedDateTime zonedDateTime = null;
        if (i2 % 2 == 0) {
            list.getClass();
            ZonedDateTime.now(this.RemoteActionCompatParcelizer);
            list.iterator();
            zonedDateTime.hashCode();
            throw null;
        }
        list.getClass();
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(this.RemoteActionCompatParcelizer);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i3 = serializer + 57;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            next = it.next();
            PopupLayoutupdatePosition1 popupLayoutupdatePosition1 = (PopupLayoutupdatePosition1) next;
            try {
                ZonedDateTime zonedDateTime2 = ZonedDateTime.parse(popupLayoutupdatePosition1.serializer().serializer());
                int i5 = initlambda0.write[popupLayoutupdatePosition1.serializer().write().ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        Timber.RemoteActionCompatParcelizer.write(new IllegalArgumentException("OrderStatusCountdownMapper: Illegal validation type: " + popupLayoutupdatePosition1.serializer()));
                    } else if (zonedDateTimeNow.compareTo((ChronoZonedDateTime<?>) zonedDateTime2) > 0) {
                        break;
                    }
                } else if (zonedDateTimeNow.compareTo((ChronoZonedDateTime<?>) zonedDateTime2) < 0) {
                    break;
                }
            } catch (Exception e) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("OrderStatusCountdownMapper: Error parsing date: ", popupLayoutupdatePosition1.serializer().serializer()), new Object[0]);
            }
        }
        PopupLayoutupdatePosition1 popupLayoutupdatePosition2 = (PopupLayoutupdatePosition1) next;
        if (popupLayoutupdatePosition2 != null) {
            try {
                Instant instant = ZonedDateTime.parse(popupLayoutupdatePosition2.serializer().serializer()).toInstant();
                init initVar = this.IconCompatParcelizer;
                PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0 popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0IconCompatParcelizer = popupLayoutupdatePosition2.IconCompatParcelizer();
                popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0IconCompatParcelizer.getClass();
                try {
                    String strSerializer = popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0IconCompatParcelizer.serializer();
                    if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strSerializer, (CharSequence) "%", false)) {
                        String strIconCompatParcelizer = popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0IconCompatParcelizer.IconCompatParcelizer();
                        if (strIconCompatParcelizer != null) {
                            try {
                                zonedDateTime = ZonedDateTime.parse(strIconCompatParcelizer);
                            } catch (Exception e2) {
                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "Invalid date format: ".concat(strIconCompatParcelizer), new Object[0]);
                            }
                            if (zonedDateTime == null) {
                                isItemDismissable isitemdismissable3 = new isItemDismissable(new IllegalArgumentException("Date not valid for the status formation " + popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0IconCompatParcelizer));
                                int i6 = serializer + 123;
                                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i7 = i6 % 2;
                                isitemdismissable = isitemdismissable3;
                            } else {
                                ZonedDateTime zonedDateTimeNow2 = ZonedDateTime.now(initVar.write);
                                zonedDateTimeNow2.getClass();
                                WrapPreview wrapPreview = new WrapPreview(popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0IconCompatParcelizer.read(), setCarryoverInAppMessage.write(strSerializer, "%", String.valueOf((long) Math.ceil(Math.abs(Duration.between(zonedDateTimeNow2, zonedDateTime).getSeconds()) / 60.0d))));
                                int i8 = read + 99;
                                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i9 = i8 % 2;
                                isitemdismissable = wrapPreview;
                            }
                        } else {
                            isItemDismissable isitemdismissable4 = new isItemDismissable(new IllegalArgumentException("Date not valid for the status formation " + popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0IconCompatParcelizer));
                            int i10 = serializer + 123;
                            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                            isitemdismissable = isitemdismissable4;
                        }
                    } else {
                        isitemdismissable = new WrapPreview(popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0IconCompatParcelizer.read(), strSerializer);
                    }
                } catch (Exception e3) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e3, "Error evaluating order status", new Object[0]);
                    isitemdismissable = new isItemDismissable(e3);
                }
                Throwable thSerializer = onItemDismiss.serializer(isitemdismissable);
                if (thSerializer == null) {
                    instant.getClass();
                    return new lambda_558638247lambda0((WrapPreview) isitemdismissable, instant);
                }
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "OrderStatusCountdownMapper: Error evaluating order status " + popupLayoutupdatePosition2, new Object[0]);
                isitemdismissable2 = new isItemDismissable(thSerializer);
            } catch (Exception e4) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e4, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("OrderStatusCountdownMapper: Error parsing date: ", popupLayoutupdatePosition2.serializer().serializer()), new Object[0]);
                return new isItemDismissable(e4);
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException(c8$$ExternalSyntheticOutline0.m("OrderStatusCountdownMapper: No valid condition matched ", list));
            Timber.RemoteActionCompatParcelizer.write(illegalStateException);
            String strM = c8$$ExternalSyntheticOutline0.m("OrderStatusCountdownMapper: Invalid conditions set for model type: ", list);
            Map mapSingletonMap = Collections.singletonMap("root_error_class", "OrderStatusCountdownMapper");
            mapSingletonMap.getClass();
            ((SentryCriticalIssueLogger) this.write.RemoteActionCompatParcelizer).write("delivery_flow_component_error", executeAsList.PUDO, strM, mapSingletonMap);
            isitemdismissable2 = new isItemDismissable(illegalStateException);
        }
        return isitemdismissable2;
    }
}
