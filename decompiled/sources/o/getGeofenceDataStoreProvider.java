package o;

import com.deliveryhero.fwf_http.ConstantKt;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "PhoneUsageModelExecutor")
public final class getGeofenceDataStoreProvider extends r8lambdazngtjGUALdWCjicZYAUVKxmro {
    private r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA IconCompatParcelizer;
    private Long MediaDescriptionCompat;
    private final float[][] MediaSessionCompatQueueItem;
    private boolean RatingCompat;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private boolean read;
    private r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA serializer;
    private final getGeofenceRequestLocation write;

    @Override // o.r8lambdazngtjGUALdWCjicZYAUVKxmro
    public final long read() {
        return ConstantKt.DEFAULT_REQUEST_TIMEOUT;
    }

    @Override // o.r8lambdazngtjGUALdWCjicZYAUVKxmro
    public final long serializer() {
        Long l = this.MediaDescriptionCompat;
        l.getClass();
        return l.longValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getGeofenceDataStoreProvider(parseLonglambda0 parselonglambda0, getGeofenceRequestLocation getgeofencerequestlocation, ConfigurationManager configurationManager, initializeGeofenceslambda1 initializegeofenceslambda1) {
        super(initializegeofenceslambda1, configurationManager);
        parselonglambda0.getClass();
        getgeofencerequestlocation.getClass();
        configurationManager.getClass();
        initializegeofenceslambda1.getClass();
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.write = getgeofencerequestlocation;
        float[][] fArr = new float[2][];
        for (int i = 0; i < 2; i++) {
            fArr[i] = new float[5];
        }
        this.MediaSessionCompatQueueItem = fArr;
    }

    public final List read(float[] fArr, float[] fArr2, float[] fArr3, long[] jArr) {
        jArr.getClass();
        fArr.getClass();
        fArr2.getClass();
        fArr3.getClass();
        r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da = this.serializer;
        if (r8lambdacuje9gyuh58gabwrad8wwadt7da != null) {
            return serializer(r8lambdacuje9gyuh58gabwrad8wwadt7da, jArr, fArr, fArr2, fArr3);
        }
        removeNodeAtDepth.serializer("gyroBuffer");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0140  */
    /* JADX WARN: Code duplicated, block: B:93:0x017c  */
    private final List<getBrazeGeofences> serializer(r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da, long[] jArr, float[] fArr, float[] fArr2, float[] fArr3) {
        boolean z;
        ArrayList arrayList;
        initializeGeofences initializegeofences;
        getBrazeLocationApi getbrazelocationapiSerializer;
        if (!this.read) {
            return instance_delegatelambda0.write;
        }
        boolean z2 = false;
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = Long.valueOf(jArr[0]);
        }
        ArrayList arrayList2 = new ArrayList();
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            r8lambdacuje9gyuh58gabwrad8wwadt7da.IconCompatParcelizer(jArr[i], fArr[i], fArr2[i], fArr3[i]);
            getBrazeGeofences getbrazegeofences = null;
            if (!this.RatingCompat) {
                r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da2 = this.IconCompatParcelizer;
                if (r8lambdacuje9gyuh58gabwrad8wwadt7da2 != null) {
                    r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da3 = this.serializer;
                    if (r8lambdacuje9gyuh58gabwrad8wwadt7da3 != null) {
                        this.RatingCompat = IconCompatParcelizer(r8lambdacuje9gyuh58gabwrad8wwadt7da2, r8lambdacuje9gyuh58gabwrad8wwadt7da3);
                    } else {
                        removeNodeAtDepth.serializer("gyroBuffer");
                        throw null;
                    }
                } else {
                    removeNodeAtDepth.serializer("accelBuffer");
                    throw null;
                }
            }
            r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da4 = this.IconCompatParcelizer;
            if (r8lambdacuje9gyuh58gabwrad8wwadt7da4 != null) {
                if (r8lambdacuje9gyuh58gabwrad8wwadt7da4.RatingCompat()) {
                    z = z2;
                    arrayList = arrayList2;
                } else {
                    r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da5 = this.serializer;
                    if (r8lambdacuje9gyuh58gabwrad8wwadt7da5 != null) {
                        if (r8lambdacuje9gyuh58gabwrad8wwadt7da5.RatingCompat()) {
                            z = z2;
                            arrayList = arrayList2;
                        } else {
                            r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da6 = this.IconCompatParcelizer;
                            if (r8lambdacuje9gyuh58gabwrad8wwadt7da6 != null) {
                                int i2 = read(r8lambdacuje9gyuh58gabwrad8wwadt7da6.IconCompatParcelizer());
                                r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da7 = this.IconCompatParcelizer;
                                if (r8lambdacuje9gyuh58gabwrad8wwadt7da7 != null) {
                                    int i3 = read(r8lambdacuje9gyuh58gabwrad8wwadt7da7.serializer());
                                    r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da8 = this.serializer;
                                    if (r8lambdacuje9gyuh58gabwrad8wwadt7da8 != null) {
                                        int i4 = read(r8lambdacuje9gyuh58gabwrad8wwadt7da8.IconCompatParcelizer());
                                        r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da9 = this.serializer;
                                        if (r8lambdacuje9gyuh58gabwrad8wwadt7da9 != null) {
                                            int i5 = read(r8lambdacuje9gyuh58gabwrad8wwadt7da9.serializer());
                                            if (i2 != i4 || i2 == i3 || i4 == i5) {
                                                z = z2;
                                                arrayList = arrayList2;
                                            } else {
                                                r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da10 = this.IconCompatParcelizer;
                                                if (r8lambdacuje9gyuh58gabwrad8wwadt7da10 != null) {
                                                    int i6 = read(r8lambdacuje9gyuh58gabwrad8wwadt7da10.IconCompatParcelizer());
                                                    Long l = this.MediaDescriptionCompat;
                                                    l.getClass();
                                                    Long l2 = this.MediaDescriptionCompat;
                                                    l2.getClass();
                                                    arrayList = arrayList2;
                                                    r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0 r8lambdaaig5zvykrh73tepxo0st1uppjw0 = new r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0((((long) i6) * ConstantKt.DEFAULT_REQUEST_TIMEOUT) + l.longValue(), (((long) (i6 + 1)) * ConstantKt.DEFAULT_REQUEST_TIMEOUT) + l2.longValue());
                                                    r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da11 = this.IconCompatParcelizer;
                                                    if (r8lambdacuje9gyuh58gabwrad8wwadt7da11 != null) {
                                                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = read(r8lambdacuje9gyuh58gabwrad8wwadt7da11, r8lambdaaig5zvykrh73tepxo0st1uppjw0.IconCompatParcelizer(), r8lambdaaig5zvykrh73tepxo0st1uppjw0.serializer());
                                                        r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da12 = this.serializer;
                                                        if (r8lambdacuje9gyuh58gabwrad8wwadt7da12 != null) {
                                                            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = read(r8lambdacuje9gyuh58gabwrad8wwadt7da12, r8lambdaaig5zvykrh73tepxo0st1uppjw0.IconCompatParcelizer(), r8lambdaaig5zvykrh73tepxo0st1uppjw0.serializer());
                                                            if (onviewattachedtowindowlambda0 != null) {
                                                                Object obj = onviewattachedtowindowlambda0.write;
                                                                if (onviewattachedtowindowlambda1 == null) {
                                                                    z = false;
                                                                    initializegeofences = null;
                                                                } else {
                                                                    float[][] fArr4 = (float[][]) obj;
                                                                    float[][] fArr5 = (float[][]) onviewattachedtowindowlambda1.write;
                                                                    if (fArr4.length == 200) {
                                                                        z = false;
                                                                        if (fArr4[0].length == 4 && fArr5.length == 200 && fArr5[0].length == 4) {
                                                                            r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da13 = this.IconCompatParcelizer;
                                                                            if (r8lambdacuje9gyuh58gabwrad8wwadt7da13 != null) {
                                                                                r8lambdacuje9gyuh58gabwrad8wwadt7da13.IconCompatParcelizer(((Number) onviewattachedtowindowlambda0.serializer).intValue());
                                                                                r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da14 = this.serializer;
                                                                                if (r8lambdacuje9gyuh58gabwrad8wwadt7da14 != null) {
                                                                                    r8lambdacuje9gyuh58gabwrad8wwadt7da14.IconCompatParcelizer(((Number) onviewattachedtowindowlambda1.serializer).intValue());
                                                                                    initializegeofences = new initializeGeofences(fArr4, fArr5, this.MediaSessionCompatQueueItem);
                                                                                } else {
                                                                                    removeNodeAtDepth.serializer("gyroBuffer");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                removeNodeAtDepth.serializer("accelBuffer");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        z = false;
                                                                    }
                                                                    initializegeofences = null;
                                                                }
                                                            } else {
                                                                z = false;
                                                                initializegeofences = null;
                                                            }
                                                            if (initializegeofences != null && (getbrazelocationapiSerializer = this.write.serializer(initializegeofences)) != null) {
                                                                getbrazegeofences = new getBrazeGeofences(getbrazelocationapiSerializer.write(), r8lambdaaig5zvykrh73tepxo0st1uppjw0.IconCompatParcelizer());
                                                            }
                                                        } else {
                                                            removeNodeAtDepth.serializer("gyroBuffer");
                                                            throw null;
                                                        }
                                                    } else {
                                                        removeNodeAtDepth.serializer("accelBuffer");
                                                        throw null;
                                                    }
                                                } else {
                                                    removeNodeAtDepth.serializer("accelBuffer");
                                                    throw null;
                                                }
                                            }
                                        } else {
                                            removeNodeAtDepth.serializer("gyroBuffer");
                                            throw null;
                                        }
                                    } else {
                                        removeNodeAtDepth.serializer("gyroBuffer");
                                        throw null;
                                    }
                                } else {
                                    removeNodeAtDepth.serializer("accelBuffer");
                                    throw null;
                                }
                            } else {
                                removeNodeAtDepth.serializer("accelBuffer");
                                throw null;
                            }
                        }
                    } else {
                        removeNodeAtDepth.serializer("gyroBuffer");
                        throw null;
                    }
                }
                ArrayList arrayList3 = arrayList;
                if (getbrazegeofences != null) {
                    arrayList3.add(getbrazegeofences);
                }
                i++;
                arrayList2 = arrayList3;
                z2 = z;
            } else {
                removeNodeAtDepth.serializer("accelBuffer");
                throw null;
            }
        }
        return arrayList2;
    }

    public final void IconCompatParcelizer() {
        if (this.read) {
            this.read = false;
            this.write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da = this.IconCompatParcelizer;
            if (r8lambdacuje9gyuh58gabwrad8wwadt7da == null) {
                removeNodeAtDepth.serializer("accelBuffer");
                throw null;
            }
            r8lambdacuje9gyuh58gabwrad8wwadt7da.MediaSessionCompatQueueItem();
            r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da2 = this.serializer;
            if (r8lambdacuje9gyuh58gabwrad8wwadt7da2 == null) {
                removeNodeAtDepth.serializer("gyroBuffer");
                throw null;
            }
            r8lambdacuje9gyuh58gabwrad8wwadt7da2.MediaSessionCompatQueueItem();
            this.MediaDescriptionCompat = null;
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        if (this.read) {
            return true;
        }
        this.RemoteActionCompatParcelizer.IconCompatParcelizer("Starting PhoneUsageModelExecutor", new Object[0]);
        if (!this.write.RatingCompat()) {
            return false;
        }
        this.IconCompatParcelizer = new r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA(RatingCompat());
        this.serializer = new r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA(RatingCompat());
        r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da = this.IconCompatParcelizer;
        if (r8lambdacuje9gyuh58gabwrad8wwadt7da == null) {
            removeNodeAtDepth.serializer("accelBuffer");
            throw null;
        }
        r8lambdacuje9gyuh58gabwrad8wwadt7da.MediaBrowserCompatMediaItem();
        r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da2 = this.serializer;
        if (r8lambdacuje9gyuh58gabwrad8wwadt7da2 == null) {
            removeNodeAtDepth.serializer("gyroBuffer");
            throw null;
        }
        r8lambdacuje9gyuh58gabwrad8wwadt7da2.MediaBrowserCompatMediaItem();
        this.read = true;
        this.RatingCompat = false;
        return true;
    }

    public final List RemoteActionCompatParcelizer(float[] fArr, float[] fArr2, float[] fArr3, long[] jArr) {
        jArr.getClass();
        fArr.getClass();
        fArr2.getClass();
        fArr3.getClass();
        r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da = this.IconCompatParcelizer;
        if (r8lambdacuje9gyuh58gabwrad8wwadt7da != null) {
            return serializer(r8lambdacuje9gyuh58gabwrad8wwadt7da, jArr, fArr, fArr2, fArr3);
        }
        removeNodeAtDepth.serializer("accelBuffer");
        throw null;
    }

    private final onViewAttachedToWindowlambda0 read(r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da, long j, long j2) {
        int iRemoteActionCompatParcelizer = r8lambdacuje9gyuh58gabwrad8wwadt7da.RemoteActionCompatParcelizer(j2);
        if (iRemoteActionCompatParcelizer <= 0) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer("Failed to prepare sensor data input numOfValuesToInclude = %d", Integer.valueOf(iRemoteActionCompatParcelizer));
            return null;
        }
        return new onViewAttachedToWindowlambda0(Integer.valueOf(iRemoteActionCompatParcelizer), r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY.IconCompatParcelizer(r8lambdacuje9gyuh58gabwrad8wwadt7da, 200, iRemoteActionCompatParcelizer, j, j2));
    }
}
