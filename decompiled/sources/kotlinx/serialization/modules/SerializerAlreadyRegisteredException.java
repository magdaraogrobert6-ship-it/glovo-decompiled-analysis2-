package kotlinx.serialization.modules;

import o.getUnregisteredInAppMessageannotations;

/* JADX INFO: loaded from: classes4.dex */
public final class SerializerAlreadyRegisteredException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations, getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations2) {
        super("Serializer for " + getunregisteredinappmessageannotations2 + " already registered in the scope of " + getunregisteredinappmessageannotations);
        getunregisteredinappmessageannotations2.getClass();
    }

    public SerializerAlreadyRegisteredException(String str) {
        super(str);
    }
}
