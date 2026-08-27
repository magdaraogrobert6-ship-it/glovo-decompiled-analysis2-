package com.braze.ui.inappmessage;

import androidx.annotation.Keep;
import coil3.util.UtilsKt;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public enum InAppMessageOperation {
    DISPLAY_NOW,
    DISPLAY_LATER,
    DISCARD,
    REENQUEUE;

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
    public static final Companion Companion = new Companion(null);

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public static final InAppMessageOperation fromValue(String str) {
        return Companion.fromValue(str);
    }

    @Keep
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InAppMessageOperation fromValue(String str) {
            Object upperCase;
            Object next;
            String strName;
            int iWrite;
            int iWrite2;
            int iWrite3;
            Iterator<E> it = InAppMessageOperation.getEntries().iterator();
            do {
                upperCase = null;
                if (it.hasNext()) {
                    next = it.next();
                    strName = ((InAppMessageOperation) next).name();
                    if (str != null) {
                        Locale locale = Locale.US;
                        locale.getClass();
                        upperCase = str.toUpperCase(locale);
                        upperCase.getClass();
                    }
                    iWrite = getCieXyz.write();
                    iWrite2 = getCieXyz.write();
                    iWrite3 = getCieXyz.write();
                }
                return (InAppMessageOperation) upperCase;
            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{strName, upperCase}, iWrite3)).booleanValue());
            upperCase = next;
            return (InAppMessageOperation) upperCase;
        }
    }
}
