package com.deliveryhero.fwf_tracking.model;

import com.deliveryhero.fwf_http.PlatformKt;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import o.DrawableTransformation;
import o.accessgetInstancedelegatecp;
import o.displayInAppMessagelambda6;
import o.displayInAppMessagelambda9;
import o.ensureSubscribedToInAppMessageEventslambda4;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getInAppMessageStackannotations;
import o.onContentCardDismissed;
import o.setShouldNextUnregisterBeSkipped;

/* JADX INFO: loaded from: classes2.dex */
public final class PerseusHelperKt {
    public static final String generateRandomTimeNumericAlphanumeric() {
        int iRemoteActionCompatParcelizer;
        ArrayList arrayListIconCompatParcelizer;
        setShouldNextUnregisterBeSkipped.Companion.getClass();
        Instant instant = Clock.systemUTC().instant();
        instant.getClass();
        long jRemoteActionCompatParcelizer = new setShouldNextUnregisterBeSkipped(instant).RemoteActionCompatParcelizer();
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = new ensureSubscribedToInAppMessageEventslambda7(1, 10, 1);
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(ensuresubscribedtoinappmessageeventslambda7, 10));
        getInAppMessageStackannotations it = ensuresubscribedtoinappmessageeventslambda7.iterator();
        while (true) {
            iRemoteActionCompatParcelizer = 0;
            if (!it.RemoteActionCompatParcelizer) {
                break;
            }
            it.RemoteActionCompatParcelizer();
            ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda8 = new ensureSubscribedToInAppMessageEventslambda7(0, 9, 1);
            displayInAppMessagelambda6 displayinappmessagelambda6 = displayInAppMessagelambda9.write;
            try {
                displayInAppMessagelambda6 displayinappmessagelambda7 = displayInAppMessagelambda9.write;
                if (ensuresubscribedtoinappmessageeventslambda8.write()) {
                    Gson$$ExternalSyntheticBUOutline0.m(ensuresubscribedtoinappmessageeventslambda8, "Cannot get random in empty range: ");
                } else {
                    int i = ensuresubscribedtoinappmessageeventslambda8.read;
                    int i2 = ensuresubscribedtoinappmessageeventslambda8.write;
                    if (i < Integer.MAX_VALUE) {
                        iRemoteActionCompatParcelizer = displayInAppMessagelambda9.serializer.RemoteActionCompatParcelizer(i2, i + 1);
                    } else {
                        iRemoteActionCompatParcelizer = i2 > Integer.MIN_VALUE ? displayInAppMessagelambda9.serializer.RemoteActionCompatParcelizer(i2 - 1, i) + 1 : displayInAppMessagelambda9.serializer.serializer();
                    }
                }
                arrayList.add(Integer.valueOf(iRemoteActionCompatParcelizer));
            } catch (IllegalArgumentException e) {
                DrawableTransformation.write(e.getMessage());
                return null;
            }
        }
        String strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList, "", null, null, null, 62);
        ArrayList arrayList2 = new ArrayList(10);
        while (iRemoteActionCompatParcelizer < 10) {
            Iterable ensuresubscribedtoinappmessageeventslambda4 = new ensureSubscribedToInAppMessageEventslambda4('a', 'z');
            ensureSubscribedToInAppMessageEventslambda4 ensuresubscribedtoinappmessageeventslambda5 = new ensureSubscribedToInAppMessageEventslambda4('A', 'Z');
            if (ensuresubscribedtoinappmessageeventslambda4 instanceof Collection) {
                arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(ensuresubscribedtoinappmessageeventslambda5, (Collection) ensuresubscribedtoinappmessageeventslambda4);
            } else {
                ArrayList arrayList3 = new ArrayList();
                onContentCardDismissed.RemoteActionCompatParcelizer(ensuresubscribedtoinappmessageeventslambda4, (Collection) arrayList3);
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ensuresubscribedtoinappmessageeventslambda5, (Collection) arrayList3);
                arrayListIconCompatParcelizer = arrayList3;
            }
            ArrayList arrayListIconCompatParcelizer2 = onContentCardDismissed.IconCompatParcelizer(new ensureSubscribedToInAppMessageEventslambda4('0', '9'), arrayListIconCompatParcelizer);
            displayInAppMessagelambda6 displayinappmessagelambda8 = displayInAppMessagelambda9.write;
            if (arrayListIconCompatParcelizer2.isEmpty()) {
                DrawableTransformation.write("Collection is empty.");
                return null;
            }
            Character ch = (Character) arrayListIconCompatParcelizer2.get(displayInAppMessagelambda9.serializer.RemoteActionCompatParcelizer(arrayListIconCompatParcelizer2.size()));
            ch.getClass();
            arrayList2.add(ch);
            iRemoteActionCompatParcelizer++;
        }
        return jRemoteActionCompatParcelizer + "." + strIconCompatParcelizer + "." + onContentCardDismissed.IconCompatParcelizer(arrayList2, "", null, null, null, 62);
    }

    public static final String getPerseusDataSource() {
        return PlatformKt.getPlatform().isServer() ? "backend" : "client";
    }
}
