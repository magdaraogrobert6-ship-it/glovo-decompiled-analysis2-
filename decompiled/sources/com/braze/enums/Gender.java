package com.braze.enums;

import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.braze.BrazeUser$$ExternalSyntheticLambda1;
import com.braze.Constants;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public enum Gender implements IPutIntoJson<String> {
    MALE("m"),
    FEMALE("f"),
    OTHER("o"),
    UNKNOWN("u"),
    NOT_APPLICABLE(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID),
    PREFER_NOT_TO_SAY(Constants.BRAZE_PUSH_PRIORITY_KEY);

    private final String value;
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
    public static final Companion Companion = new Companion(null);

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Gender getGender(String str) {
            String lowerCase;
            Object obj = null;
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            Iterator<E> it = Gender.getEntries().iterator();
            boolean z = false;
            Object obj2 = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        break;
                    }
                    obj = obj2;
                    break;
                }
                Object next = it.next();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((Gender) next).getValue(), lowerCase}, getCieXyz.write())).booleanValue()) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            }
            Gender gender = (Gender) obj;
            if (gender == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 25), 6, (Object) null);
            }
            return gender;
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGender$lambda$1(String str) {
            return ff$$ExternalSyntheticOutline0.m("No gender with value ", str, ".");
        }
    }

    public static final Gender getGender(String str) {
        return Companion.getGender(str);
    }

    Gender(String str) {
        this.value = str;
    }

    @Override // com.braze.models.IPutIntoJson
    public String forJsonPut() {
        return this.value;
    }
}
