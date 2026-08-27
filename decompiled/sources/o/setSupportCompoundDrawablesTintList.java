package o;

import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class setSupportCompoundDrawablesTintList {
    public Object IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public boolean serializer;
    public Object write;

    public setSupportCompoundDrawablesTintList() {
    }

    public void write() {
        this.write = null;
        this.RemoteActionCompatParcelizer = false;
        this.IconCompatParcelizer = null;
        this.serializer = false;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    public addArcRad read() {
        asAndroidPathEffect tocomposepatheffect;
        Class<?> componentType;
        asAndroidPathEffect asandroidpatheffect = (asAndroidPathEffect) this.write;
        if (asandroidpatheffect == null) {
            Object obj = this.IconCompatParcelizer;
            if (obj instanceof Integer) {
                tocomposepatheffect = asAndroidPathEffect.MediaSessionCompatQueueItem;
            } else if (obj instanceof int[]) {
                tocomposepatheffect = asAndroidPathEffect.MediaDescriptionCompat;
            } else if (obj instanceof Long) {
                tocomposepatheffect = asAndroidPathEffect.MediaSessionCompatResultReceiverWrapper;
            } else if (obj instanceof long[]) {
                tocomposepatheffect = asAndroidPathEffect.PlaybackStateCompatCustomAction;
            } else if (obj instanceof Float) {
                tocomposepatheffect = asAndroidPathEffect.RatingCompat;
            } else if (obj instanceof float[]) {
                tocomposepatheffect = asAndroidPathEffect.serializer;
            } else if (obj instanceof Boolean) {
                tocomposepatheffect = asAndroidPathEffect.RemoteActionCompatParcelizer;
            } else if (obj instanceof boolean[]) {
                tocomposepatheffect = asAndroidPathEffect.write;
            } else {
                tocomposepatheffect = ((obj instanceof String) || obj == null) ? asAndroidPathEffect.r8lambda54BeH8ZsBru0CXI2CCSP2syNys : null;
            }
            if (tocomposepatheffect != null) {
                asandroidpatheffect = tocomposepatheffect;
            } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                asandroidpatheffect = asAndroidPathEffect.ParcelableVolumeInfo;
            } else {
                obj.getClass();
                if (obj.getClass().isArray()) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    componentType2.getClass();
                    if (Parcelable.class.isAssignableFrom(componentType2)) {
                        Class<?> componentType3 = obj.getClass().getComponentType();
                        componentType3.getClass();
                        tocomposepatheffect = new actualDashPathEffect(componentType3);
                    } else if (obj.getClass().isArray()) {
                        componentType = obj.getClass().getComponentType();
                        componentType.getClass();
                        if (Serializable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType4 = obj.getClass().getComponentType();
                            componentType4.getClass();
                            tocomposepatheffect = new actualStampedPathEffect7aD1DOk(componentType4);
                        } else if (obj instanceof Parcelable) {
                            tocomposepatheffect = new actualCornerPathEffect(obj.getClass());
                        } else if (obj instanceof Enum) {
                            tocomposepatheffect = new actualChainPathEffect(obj.getClass());
                        } else {
                            if (obj instanceof Serializable) {
                                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("Object of type ", obj.getClass().getName(), " is not supported for navigation arguments.");
                                return null;
                            }
                            tocomposepatheffect = new toComposePathEffect(obj.getClass());
                        }
                    } else if (obj instanceof Parcelable) {
                        tocomposepatheffect = new actualCornerPathEffect(obj.getClass());
                    } else if (obj instanceof Enum) {
                        tocomposepatheffect = new actualChainPathEffect(obj.getClass());
                    } else {
                        if (obj instanceof Serializable) {
                            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("Object of type ", obj.getClass().getName(), " is not supported for navigation arguments.");
                            return null;
                        }
                        tocomposepatheffect = new toComposePathEffect(obj.getClass());
                    }
                } else if (obj.getClass().isArray()) {
                    componentType = obj.getClass().getComponentType();
                    componentType.getClass();
                    if (Serializable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType5 = obj.getClass().getComponentType();
                        componentType5.getClass();
                        tocomposepatheffect = new actualStampedPathEffect7aD1DOk(componentType5);
                    } else if (obj instanceof Parcelable) {
                        tocomposepatheffect = new actualCornerPathEffect(obj.getClass());
                    } else if (obj instanceof Enum) {
                        tocomposepatheffect = new actualChainPathEffect(obj.getClass());
                    } else {
                        if (obj instanceof Serializable) {
                            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("Object of type ", obj.getClass().getName(), " is not supported for navigation arguments.");
                            return null;
                        }
                        tocomposepatheffect = new toComposePathEffect(obj.getClass());
                    }
                } else if (obj instanceof Parcelable) {
                    tocomposepatheffect = new actualCornerPathEffect(obj.getClass());
                } else if (obj instanceof Enum) {
                    tocomposepatheffect = new actualChainPathEffect(obj.getClass());
                } else {
                    if (obj instanceof Serializable) {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("Object of type ", obj.getClass().getName(), " is not supported for navigation arguments.");
                        return null;
                    }
                    tocomposepatheffect = new toComposePathEffect(obj.getClass());
                }
                asandroidpatheffect = tocomposepatheffect;
            }
        }
        return new addArcRad(asandroidpatheffect, this.serializer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
    }

    public void RemoteActionCompatParcelizer(Object obj) {
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = true;
    }

    public setSupportCompoundDrawablesTintList(int i) {
    }
}
