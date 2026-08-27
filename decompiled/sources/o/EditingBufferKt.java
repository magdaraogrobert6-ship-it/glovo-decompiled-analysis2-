package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider;
import com.roadrunner.remoteconfig.helper.RemoteConfigHelperV2;
import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.MutableStateFlow;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class EditingBufferKt {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final cancelCompositionui_text read;

    public EditingBufferKt(cancelCompositionui_text cancelcompositionui_text) {
        cancelcompositionui_text.getClass();
        this.read = cancelcompositionui_text;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01df  */
    /* JADX WARN: Code duplicated, block: B:42:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:43:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:45:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x0200  */
    /* JADX WARN: Code duplicated, block: B:48:0x0209  */
    /* JADX WARN: Code duplicated, block: B:50:0x020d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0218  */
    /* JADX WARN: Code duplicated, block: B:55:0x0236  */
    /* JADX WARN: Code duplicated, block: B:59:0x0240 A[LOOP:0: B:57:0x023a->B:59:0x0240, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x026c  */
    /* JADX WARN: Code duplicated, block: B:65:0x028f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0291  */
    /* JADX WARN: Code duplicated, block: B:69:0x0295  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public final void IconCompatParcelizer(setCompositingStrategyWpw9cng setcompositingstrategywpw9cng) {
        Object deleteui_textVar;
        Object next;
        Object commitcompositionui_text;
        boolean z;
        setPathOutline setpathoutline;
        int i;
        Long lValueOf;
        Iterator it;
        int i2;
        int size;
        safeSetClipToOutline safesetcliptooutline;
        int i3 = 2 % 2;
        cancelCompositionui_text cancelcompositionui_text = this.read;
        cancelcompositionui_text.getClass();
        String strWrite = setcompositingstrategywpw9cng.write();
        setSelectionStart setselectionstart = new setSelectionStart(setcompositingstrategywpw9cng.RemoteActionCompatParcelizer(), Instant.now().toEpochMilli());
        MutableStateFlow mutableStateFlow = cancelcompositionui_text.read;
        getMBufferStateui_text getmbufferstateui_text = (getMBufferStateui_text) ((Map) mutableStateFlow.read()).get(strWrite);
        Clock clock = cancelcompositionui_text.MediaDescriptionCompat;
        if (getmbufferstateui_text != null) {
            if (getmbufferstateui_text instanceof commitCompositionui_text) {
                commitCompositionui_text commitcompositionui_text2 = (commitCompositionui_text) getmbufferstateui_text;
                ArrayList arrayListRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) commitcompositionui_text2.RemoteActionCompatParcelizer, (Object) setselectionstart);
                long epochMilli = Instant.now(clock).toEpochMilli();
                String str = commitcompositionui_text2.read;
                long j = commitcompositionui_text2.IconCompatParcelizer;
                String str2 = commitcompositionui_text2.write;
                String str3 = commitcompositionui_text2.MediaDescriptionCompat;
                String str4 = commitcompositionui_text2.MediaSessionCompatQueueItem;
                List list = commitcompositionui_text2.MediaBrowserCompatMediaItem;
                str.getClass();
                str3.getClass();
                deleteui_textVar = new commitCompositionui_text(str, j, arrayListRemoteActionCompatParcelizer, epochMilli, str2, str3, str4, list);
            } else {
                if (!(getmbufferstateui_text instanceof deleteui_text)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                deleteui_text deleteui_textVar2 = (deleteui_text) getmbufferstateui_text;
                ArrayList arrayListRemoteActionCompatParcelizer2 = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) deleteui_textVar2.RemoteActionCompatParcelizer, (Object) setselectionstart);
                long epochMilli2 = Instant.now(clock).toEpochMilli();
                String str5 = deleteui_textVar2.serializer;
                str5.getClass();
                deleteui_textVar = new deleteui_text(str5, arrayListRemoteActionCompatParcelizer2, epochMilli2);
            }
            commitcompositionui_text = deleteui_textVar;
            if (commitcompositionui_text != null) {
                mutableStateFlow.IconCompatParcelizer(onMove.serializer((Map) mutableStateFlow.read(), new onViewAttachedToWindowlambda0(strWrite, commitcompositionui_text)));
                z = commitcompositionui_text instanceof commitCompositionui_text;
                if (z) {
                    setpathoutline = setPathOutline.CUSTOMER;
                } else {
                    if (!(commitcompositionui_text instanceof deleteui_text)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                    setpathoutline = setPathOutline.DISPATCHER;
                }
                if (z) {
                    lValueOf = Long.valueOf(((commitCompositionui_text) commitcompositionui_text).IconCompatParcelizer);
                } else {
                    if (!(commitcompositionui_text instanceof deleteui_text)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                    i = IconCompatParcelizer + 31;
                    write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        throw null;
                    }
                    lValueOf = null;
                }
                toStringForLog tostringforlog = cancelcompositionui_text.IconCompatParcelizer;
                it = ((Map) mutableStateFlow.read()).values().iterator();
                i2 = IconCompatParcelizer + 61;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i4 = 5 % 3;
                }
                size = 0;
                while (it.hasNext()) {
                    size += ((getMBufferStateui_text) it.next()).RemoteActionCompatParcelizer().size();
                }
                setpathoutline.getClass();
                safesetcliptooutline = new safeSetClipToOutline();
                safesetcliptooutline.put("chat_type", setpathoutline.getRawValue());
                safesetcliptooutline.put("chat_notifications_shown", String.valueOf(size));
                if (lValueOf != null) {
                    safesetcliptooutline.put("delivery_id", String.valueOf(lValueOf.longValue()));
                }
                tostringforlog.IconCompatParcelizer.logEvent("chat_notification_shown", onMove.RemoteActionCompatParcelizer(tostringforlog.serializer.write(), safesetcliptooutline.IconCompatParcelizer()));
            }
        }
        if (setcompositingstrategywpw9cng instanceof GraphicsLayerclipDrawBlock1) {
            int i5 = write + 5;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            GraphicsLayerclipDrawBlock1 graphicsLayerclipDrawBlock1 = (GraphicsLayerclipDrawBlock1) setcompositingstrategywpw9cng;
            String str6 = graphicsLayerclipDrawBlock1.read;
            Iterator it2 = ((ChatDeliveryRepositoryImpl) cancelcompositionui_text.RemoteActionCompatParcelizer).read().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                int i7 = IconCompatParcelizer + 117;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                next = it2.next();
            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((TextUnitTypeCompanion) next).IconCompatParcelizer, str6}, getCieXyz.write())).booleanValue());
            TextUnitTypeCompanion textUnitTypeCompanion = (TextUnitTypeCompanion) next;
            if (textUnitTypeCompanion == null) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Delivery with confirmation number " + str6 + " doesn't exists, but push was received: " + setcompositingstrategywpw9cng, new Object[0]);
                int i9 = IconCompatParcelizer + 97;
                write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                commitcompositionui_text = null;
            } else {
                String str7 = graphicsLayerclipDrawBlock1.read;
                String str8 = textUnitTypeCompanion.serializer;
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = str8;
                String str10 = textUnitTypeCompanion.IconCompatParcelizer;
                String str11 = textUnitTypeCompanion.MediaBrowserCompatMediaItem;
                long j2 = textUnitTypeCompanion.MediaDescriptionCompat;
                int iSerializer = getQueryParameterslambda2.serializer();
                List list2 = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{setselectionstart}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
                long epochMilli3 = Instant.now(clock).toEpochMilli();
                setSelectionEnd setselectionend = cancelcompositionui_text.serializer;
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) setselectionend.serializer;
                String strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
                List listIconCompatParcelizer = instance_delegatelambda0.write;
                if (strSerializer != null) {
                    FirebaseRemoteConfigProvider firebaseRemoteConfigProvider = firebaseRemoteConfigImpl.IconCompatParcelizer;
                    r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = RemoteConfigHelperV2.RemoteActionCompatParcelizer;
                    listIconCompatParcelizer = RemoteConfigHelperV2.IconCompatParcelizer(firebaseRemoteConfigProvider.read("actionable_customer_chat_quick_replies"), strSerializer, listIconCompatParcelizer);
                }
                commitcompositionui_text = new commitCompositionui_text(str7, j2, list2, epochMilli3, str9, str10, str11, setselectionend.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(listIconCompatParcelizer));
            }
        } else {
            if (!(setcompositingstrategywpw9cng instanceof toImageBitmap)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            String str12 = ((toImageBitmap) setcompositingstrategywpw9cng).write;
            int iSerializer2 = getQueryParameterslambda2.serializer();
            deleteui_textVar = new deleteui_text(str12, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{setselectionstart}, getQueryParameterslambda2.serializer(), -516583649, iSerializer2), Instant.now(clock).toEpochMilli());
        }
        if (commitcompositionui_text != null) {
            mutableStateFlow.IconCompatParcelizer(onMove.serializer((Map) mutableStateFlow.read(), new onViewAttachedToWindowlambda0(strWrite, commitcompositionui_text)));
            z = commitcompositionui_text instanceof commitCompositionui_text;
            if (z) {
                setpathoutline = setPathOutline.CUSTOMER;
            } else {
                if (!(commitcompositionui_text instanceof deleteui_text)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                setpathoutline = setPathOutline.DISPATCHER;
            }
            if (z) {
                lValueOf = Long.valueOf(((commitCompositionui_text) commitcompositionui_text).IconCompatParcelizer);
            } else {
                if (!(commitcompositionui_text instanceof deleteui_text)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                i = IconCompatParcelizer + 31;
                write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    throw null;
                }
                lValueOf = null;
            }
            toStringForLog tostringforlog2 = cancelcompositionui_text.IconCompatParcelizer;
            it = ((Map) mutableStateFlow.read()).values().iterator();
            i2 = IconCompatParcelizer + 61;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i11 = 5 % 3;
            }
            size = 0;
            while (it.hasNext()) {
                size += ((getMBufferStateui_text) it.next()).RemoteActionCompatParcelizer().size();
            }
            setpathoutline.getClass();
            safesetcliptooutline = new safeSetClipToOutline();
            safesetcliptooutline.put("chat_type", setpathoutline.getRawValue());
            safesetcliptooutline.put("chat_notifications_shown", String.valueOf(size));
            if (lValueOf != null) {
                safesetcliptooutline.put("delivery_id", String.valueOf(lValueOf.longValue()));
            }
            tostringforlog2.IconCompatParcelizer.logEvent("chat_notification_shown", onMove.RemoteActionCompatParcelizer(tostringforlog2.serializer.write(), safesetcliptooutline.IconCompatParcelizer()));
        }
        int i12 = IconCompatParcelizer + 51;
        write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i12 % 2 == 0) {
            int i13 = 3 / 4;
        }
        commitcompositionui_text = deleteui_textVar;
        if (commitcompositionui_text != null) {
            mutableStateFlow.IconCompatParcelizer(onMove.serializer((Map) mutableStateFlow.read(), new onViewAttachedToWindowlambda0(strWrite, commitcompositionui_text)));
            z = commitcompositionui_text instanceof commitCompositionui_text;
            if (z) {
                setpathoutline = setPathOutline.CUSTOMER;
            } else {
                if (!(commitcompositionui_text instanceof deleteui_text)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                setpathoutline = setPathOutline.DISPATCHER;
            }
            if (z) {
                lValueOf = Long.valueOf(((commitCompositionui_text) commitcompositionui_text).IconCompatParcelizer);
            } else {
                if (!(commitcompositionui_text instanceof deleteui_text)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                i = IconCompatParcelizer + 31;
                write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    throw null;
                }
                lValueOf = null;
            }
            toStringForLog tostringforlog3 = cancelcompositionui_text.IconCompatParcelizer;
            it = ((Map) mutableStateFlow.read()).values().iterator();
            i2 = IconCompatParcelizer + 61;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i14 = 5 % 3;
            }
            size = 0;
            while (it.hasNext()) {
                size += ((getMBufferStateui_text) it.next()).RemoteActionCompatParcelizer().size();
            }
            setpathoutline.getClass();
            safesetcliptooutline = new safeSetClipToOutline();
            safesetcliptooutline.put("chat_type", setpathoutline.getRawValue());
            safesetcliptooutline.put("chat_notifications_shown", String.valueOf(size));
            if (lValueOf != null) {
                safesetcliptooutline.put("delivery_id", String.valueOf(lValueOf.longValue()));
            }
            tostringforlog3.IconCompatParcelizer.logEvent("chat_notification_shown", onMove.RemoteActionCompatParcelizer(tostringforlog3.serializer.write(), safesetcliptooutline.IconCompatParcelizer()));
        }
    }
}
