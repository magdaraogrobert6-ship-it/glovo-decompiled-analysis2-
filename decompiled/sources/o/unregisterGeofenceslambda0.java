package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.drivinginsights.harsheventdetection.HarshEventType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "HarshEventModelExecutor")
public class unregisterGeofenceslambda0 extends r8lambdazngtjGUALdWCjicZYAUVKxmro {
    private r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA IconCompatParcelizer;
    private boolean MediaBrowserCompatMediaItem;
    private boolean MediaDescriptionCompat;
    private boolean MediaSessionCompatQueueItem;
    private Long RatingCompat;
    private final getBrazeGeofenceForGeofenceId RemoteActionCompatParcelizer;
    private r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA read;
    private final float[][] serializer;
    private final parseLonglambda0 write;

    @Override // o.r8lambdazngtjGUALdWCjicZYAUVKxmro
    public final long read() {
        return 9000L;
    }

    @Override // o.r8lambdazngtjGUALdWCjicZYAUVKxmro
    public final long serializer() {
        Long l = this.RatingCompat;
        l.getClass();
        return l.longValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unregisterGeofenceslambda0(parseLonglambda0 parselonglambda0, getBrazeGeofenceForGeofenceId getbrazegeofenceforgeofenceid, initializeGeofenceslambda1 initializegeofenceslambda1, ConfigurationManager configurationManager) {
        super(initializegeofenceslambda1, configurationManager);
        parselonglambda0.getClass();
        getbrazegeofenceforgeofenceid.getClass();
        initializegeofenceslambda1.getClass();
        configurationManager.getClass();
        this.write = parselonglambda0;
        this.RemoteActionCompatParcelizer = getbrazegeofenceforgeofenceid;
        float[][] fArr = new float[9][];
        for (int i = 0; i < 9; i++) {
            fArr[i] = new float[5];
        }
        this.serializer = fArr;
        this.read = new r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA(0);
        this.IconCompatParcelizer = new r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA(0);
    }

    public final List RemoteActionCompatParcelizer(float[] fArr, float[] fArr2, float[] fArr3, long[] jArr) {
        jArr.getClass();
        fArr.getClass();
        fArr2.getClass();
        fArr3.getClass();
        return !this.MediaBrowserCompatMediaItem ? instance_delegatelambda0.write : serializer(this.IconCompatParcelizer, jArr, fArr, fArr2, fArr3);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:53:0x016f  */
    /* JADX WARN: Multi-variable type inference failed */
    private final List<setUpGeofenceslambda2> serializer(r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da, long[] jArr, float[] fArr, float[] fArr2, float[] fArr3) {
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        ArrayList arrayList;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1;
        int i;
        tearDownGeofenceslambda1 teardowngeofenceslambda1;
        configureFromServerConfig configurefromserverconfigSerializer;
        HarshEventType harshEventType;
        if (!this.MediaSessionCompatQueueItem) {
            return instance_delegatelambda0.write;
        }
        int i2 = 0;
        if (this.RatingCompat == null) {
            this.RatingCompat = Long.valueOf(jArr[0]);
        }
        ArrayList arrayList2 = new ArrayList();
        int length = jArr.length;
        int i3 = 0;
        while (i3 < length) {
            r8lambdacuje9gyuh58gabwrad8wwadt7da.IconCompatParcelizer(jArr[i3], fArr[i3], fArr2[i3], fArr3[i3]);
            if (!this.MediaDescriptionCompat) {
                this.MediaDescriptionCompat = IconCompatParcelizer(this.read, this.IconCompatParcelizer);
            }
            Object setupgeofenceslambda2 = null;
            if (this.read.IconCompatParcelizer() == -1 || (this.MediaBrowserCompatMediaItem && this.IconCompatParcelizer.IconCompatParcelizer() == -1)) {
                i = i2;
                arrayList = arrayList2;
            } else {
                int i4 = read(this.read.IconCompatParcelizer());
                int i5 = read(this.read.serializer());
                if (!this.MediaBrowserCompatMediaItem) {
                    onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(Integer.valueOf(i4), Integer.valueOf(i5));
                } else {
                    onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(Integer.valueOf(read(this.IconCompatParcelizer.IconCompatParcelizer())), Integer.valueOf(read(this.IconCompatParcelizer.serializer())));
                }
                int iIntValue = ((Number) onviewattachedtowindowlambda0.serializer).intValue();
                int iIntValue2 = ((Number) onviewattachedtowindowlambda0.write).intValue();
                if (i4 != iIntValue || i4 == i5 || iIntValue == iIntValue2) {
                    i = i2;
                    arrayList = arrayList2;
                } else {
                    int i6 = read(this.read.IconCompatParcelizer());
                    Long l = this.RatingCompat;
                    l.getClass();
                    Long l2 = this.RatingCompat;
                    l2.getClass();
                    arrayList = arrayList2;
                    r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0 r8lambdaaig5zvykrh73tepxo0st1uppjw0 = new r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0((((long) i6) * 9000) + l.longValue(), (((long) (i6 + 1)) * 9000) + l2.longValue());
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0IconCompatParcelizer = IconCompatParcelizer(this.read, r8lambdaaig5zvykrh73tepxo0st1uppjw0.IconCompatParcelizer(), r8lambdaaig5zvykrh73tepxo0st1uppjw0.serializer());
                    if (this.MediaBrowserCompatMediaItem) {
                        onviewattachedtowindowlambda1 = IconCompatParcelizer(this.IconCompatParcelizer, r8lambdaaig5zvykrh73tepxo0st1uppjw0.IconCompatParcelizer(), r8lambdaaig5zvykrh73tepxo0st1uppjw0.serializer());
                    } else {
                        float[][] fArr4 = new float[900][];
                        for (int i7 = 0; i7 < 900; i7++) {
                            fArr4[i7] = new float[4];
                        }
                        onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0(0, fArr4);
                    }
                    if (onviewattachedtowindowlambda0IconCompatParcelizer != null) {
                        Object obj = onviewattachedtowindowlambda0IconCompatParcelizer.write;
                        if (onviewattachedtowindowlambda1 == null) {
                            i = 0;
                            teardowngeofenceslambda1 = null;
                        } else {
                            float[][] fArr5 = (float[][]) obj;
                            float[][] fArr6 = (float[][]) onviewattachedtowindowlambda1.write;
                            if (fArr5.length == 900) {
                                i = 0;
                                if (fArr5[0].length == 4 && fArr6.length == 900 && fArr6[0].length == 4) {
                                    this.read.IconCompatParcelizer(((Number) onviewattachedtowindowlambda0IconCompatParcelizer.serializer).intValue());
                                    if (this.MediaBrowserCompatMediaItem) {
                                        this.IconCompatParcelizer.IconCompatParcelizer(((Number) onviewattachedtowindowlambda1.serializer).intValue());
                                    }
                                    teardowngeofenceslambda1 = new tearDownGeofenceslambda1(fArr5, fArr6, this.serializer);
                                }
                            } else {
                                i = 0;
                            }
                            teardowngeofenceslambda1 = null;
                        }
                    } else {
                        i = 0;
                        teardowngeofenceslambda1 = null;
                    }
                    if (teardowngeofenceslambda1 != null && (configurefromserverconfigSerializer = this.RemoteActionCompatParcelizer.serializer(teardowngeofenceslambda1)) != null && configurefromserverconfigSerializer.RemoteActionCompatParcelizer() != -1 && configurefromserverconfigSerializer.IconCompatParcelizer() != -1) {
                        if (this.MediaBrowserCompatMediaItem) {
                            HarshEventType.read readVar = HarshEventType.Companion;
                            int iRemoteActionCompatParcelizer = configurefromserverconfigSerializer.RemoteActionCompatParcelizer();
                            readVar.getClass();
                            HarshEventType[] harshEventTypeArrValues = HarshEventType.values();
                            int length2 = harshEventTypeArrValues.length;
                            int i8 = i;
                            while (true) {
                                if (i8 < length2) {
                                    HarshEventType harshEventType2 = harshEventTypeArrValues[i8];
                                    if (harshEventType2.getModelOutputValue() == iRemoteActionCompatParcelizer) {
                                        harshEventType = harshEventType2;
                                        break;
                                    }
                                    i8++;
                                } else {
                                    DrawableTransformation.write("Array contains no element matching the predicate.");
                                    return null;
                                }
                            }
                        } else {
                            harshEventType = null;
                        }
                        HarshEventType.read readVar2 = HarshEventType.Companion;
                        int iIconCompatParcelizer = configurefromserverconfigSerializer.IconCompatParcelizer();
                        readVar2.getClass();
                        HarshEventType[] harshEventTypeArrValues2 = HarshEventType.values();
                        int length3 = harshEventTypeArrValues2.length;
                        int i9 = i;
                        while (true) {
                            if (i9 < length3) {
                                HarshEventType harshEventType3 = harshEventTypeArrValues2[i9];
                                if (harshEventType3.getModelOutputValue() == iIconCompatParcelizer) {
                                    Float fValueOf = (harshEventType == null || !harshEventType.isHarshEvent()) ? null : Float.valueOf(configurefromserverconfigSerializer.read());
                                    Float fValueOf2 = !harshEventType3.isHarshEvent() ? null : Float.valueOf(configurefromserverconfigSerializer.write());
                                    int i10 = ((harshEventType == null || !harshEventType.isHarshEvent()) && !harshEventType3.isHarshEvent()) ? i : 1;
                                    setupgeofenceslambda2 = new setUpGeofenceslambda2(((harshEventType == null || !harshEventType.isHarshEvent()) && !harshEventType3.isHarshEvent()) ? i : 1, harshEventType, fValueOf, harshEventType3, fValueOf2, i10 != 0 ? Float.valueOf(configurefromserverconfigSerializer.serializer()) : null, i10 != 0 ? Long.valueOf((long) (r8lambdaaig5zvykrh73tepxo0st1uppjw0.IconCompatParcelizer() + ((double) configurefromserverconfigSerializer.MediaMetadataCompat()))) : null, r8lambdaaig5zvykrh73tepxo0st1uppjw0.IconCompatParcelizer());
                                    break;
                                }
                                i9++;
                            } else {
                                DrawableTransformation.write("Array contains no element matching the predicate.");
                                return null;
                            }
                        }
                    }
                }
            }
            ArrayList arrayList3 = arrayList;
            if (setupgeofenceslambda2 != null) {
                arrayList3.add(setupgeofenceslambda2);
            }
            i3++;
            arrayList2 = arrayList3;
            i2 = i;
        }
        return arrayList2;
    }

    public final void IconCompatParcelizer() {
        if (this.MediaSessionCompatQueueItem) {
            this.MediaSessionCompatQueueItem = false;
            this.RemoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            this.read.MediaSessionCompatQueueItem();
            this.IconCompatParcelizer.MediaSessionCompatQueueItem();
            this.RatingCompat = null;
        }
    }

    public final boolean write() {
        if (!this.MediaSessionCompatQueueItem) {
            this.write.IconCompatParcelizer("Starting HarshEventModelExecutor", new Object[0]);
            if (!this.RemoteActionCompatParcelizer.RatingCompat()) {
                return false;
            }
            this.read = new r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA(RatingCompat());
            this.IconCompatParcelizer = new r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA(RatingCompat());
            this.read.MediaBrowserCompatMediaItem();
            this.IconCompatParcelizer.MediaBrowserCompatMediaItem();
            this.MediaSessionCompatQueueItem = true;
            this.MediaDescriptionCompat = false;
            boolean zMediaMetadataCompat = MediaMetadataCompat();
            this.MediaBrowserCompatMediaItem = zMediaMetadataCompat;
            if (!zMediaMetadataCompat) {
                this.IconCompatParcelizer.read();
            }
        }
        return true;
    }

    public final List IconCompatParcelizer(float[] fArr, float[] fArr2, float[] fArr3, long[] jArr) {
        jArr.getClass();
        fArr.getClass();
        fArr2.getClass();
        fArr3.getClass();
        return serializer(this.read, jArr, fArr, fArr2, fArr3);
    }

    private final onViewAttachedToWindowlambda0 IconCompatParcelizer(r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da, long j, long j2) {
        int iRemoteActionCompatParcelizer = r8lambdacuje9gyuh58gabwrad8wwadt7da.RemoteActionCompatParcelizer(j2);
        if (iRemoteActionCompatParcelizer <= 0) {
            this.write.IconCompatParcelizer("Failed to prepare sensor data input numOfValuesToInclude = %d", Integer.valueOf(iRemoteActionCompatParcelizer));
            return null;
        }
        return new onViewAttachedToWindowlambda0(Integer.valueOf(iRemoteActionCompatParcelizer), r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY.IconCompatParcelizer(r8lambdacuje9gyuh58gabwrad8wwadt7da, 900, iRemoteActionCompatParcelizer, j, j2));
    }
}
