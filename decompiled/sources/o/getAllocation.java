package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class getAllocation extends accessgetInitialDelayp {
    @Override // o.accessgetInitialDelayp
    public final FwFClientKt RemoteActionCompatParcelizer(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, getHoldoutVariation getholdoutvariation) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return getProject.RemoteActionCompatParcelizer;
        }
        return null;
    }

    @Override // o.accessgetInitialDelayp
    public final FwFClientKt read(Type type, Annotation[] annotationArr, getHoldoutVariation getholdoutvariation) {
        if (type == String.class) {
            return ProtoFeatureOrErrorMsgCompanion.MediaSessionCompatQueueItem;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return ProtoFeatureOrErrorMsgCompanion.serializer;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return ProtoFeatureOrErrorMsgCompanion.read;
        }
        if (type == Character.class || type == Character.TYPE) {
            return ProtoFeatureOrErrorMsgCompanion.RemoteActionCompatParcelizer;
        }
        if (type == Double.class || type == Double.TYPE) {
            return ProtoFeatureOrErrorMsgCompanion.write;
        }
        if (type == Float.class || type == Float.TYPE) {
            return ProtoFeatureOrErrorMsgCompanion.IconCompatParcelizer;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return ProtoFeatureOrErrorMsgCompanion.MediaMetadataCompat;
        }
        if (type == Long.class || type == Long.TYPE) {
            return ProtoFeatureOrErrorMsgCompanion.MediaBrowserCompatMediaItem;
        }
        if (type == Short.class || type == Short.TYPE) {
            return ProtoFeatureOrErrorMsgCompanion.MediaDescriptionCompat;
        }
        return null;
    }
}
