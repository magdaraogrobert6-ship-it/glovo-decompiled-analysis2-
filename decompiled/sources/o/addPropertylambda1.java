package o;

import android.location.Location;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "TransportClassifierModelExecutor")
public class addPropertylambda1 extends r8lambdagzL4jp4oDuRXXeRCE9jPe7Cswjw {
    private static final getlambda0 IconCompatParcelizer = new getlambda0(serializer(18, 5, 0), serializer(18, 8, -1), serializer(1800, 4, 0), serializer(1800, 4, 0));
    private final DataStoreProviderCompanionExternalSyntheticLambda2 MediaBrowserCompatMediaItem;
    private boolean MediaSessionCompatToken;
    private boolean PlaybackStateCompat;
    private int PlaybackStateCompatCustomAction;
    private final storeRegisteredGeofencesToLocalStoragelambda0 RatingCompat;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI read;
    private final ConfigurationManager serializer;
    private final isValidKey write;
    private ArrayList ParcelableVolumeInfo = new ArrayList();
    private final r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA MediaDescriptionCompat = new r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA(DateTimeConstants.SECONDS_PER_HOUR);
    private final ArrayList MediaSessionCompatQueueItem = new ArrayList();
    private final LinkedList MediaMetadataCompat = new LinkedList();
    private long MediaSessionCompatResultReceiverWrapper = -1;

    public static class RemoteActionCompatParcelizer {
        private final r8lambdax7jFbnuaviBhW8Q6CXBAdQQk_KQ IconCompatParcelizer;
        private final r8lambdabuq0kpt9xWGgh2Z3gBfct3eoBM read;
        private final boolean write;

        public final r8lambdabuq0kpt9xWGgh2Z3gBfct3eoBM IconCompatParcelizer() {
            return this.read;
        }

        public final r8lambdax7jFbnuaviBhW8Q6CXBAdQQk_KQ read() {
            return this.IconCompatParcelizer;
        }

        public RemoteActionCompatParcelizer(boolean z, r8lambdax7jFbnuaviBhW8Q6CXBAdQQk_KQ r8lambdax7jfbnuavibhw8q6cxbadqqk_kq, r8lambdabuq0kpt9xWGgh2Z3gBfct3eoBM r8lambdabuq0kpt9xwggh2z3gbfct3eobm) {
            this.write = z;
            this.IconCompatParcelizer = r8lambdax7jfbnuavibhw8q6cxbadqqk_kq;
            this.read = r8lambdabuq0kpt9xwggh2z3gbfct3eobm;
        }

        public final String toString() {
            return "TransportClassificationResult{mIsTransportModeChanged=" + this.write + ", mClassification=" + this.IconCompatParcelizer + ", mClassificationData=" + this.read + '}';
        }
    }

    public final ArrayList IconCompatParcelizer() {
        BrazeLocation brazeLocation;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            clonelambda0 clonelambda0VarSerializer = this.write.serializer(IconCompatParcelizer);
            if (clonelambda0VarSerializer != null && clonelambda0VarSerializer.RemoteActionCompatParcelizer() != -1.0f && (brazeLocation = (BrazeLocation) this.MediaMetadataCompat.poll()) != null && this.PlaybackStateCompatCustomAction >= 3) {
                arrayList.add(IconCompatParcelizer(clonelambda0VarSerializer, brazeLocation));
            }
        }
        return arrayList;
    }

    public addPropertylambda1(parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, isValidKey isvalidkey, ConfigurationManager configurationManager, DataStoreProviderCompanionExternalSyntheticLambda2 dataStoreProviderCompanionExternalSyntheticLambda2, storeRegisteredGeofencesToLocalStoragelambda0 storeregisteredgeofencestolocalstoragelambda0) {
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.read = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.serializer = configurationManager;
        this.write = isvalidkey;
        this.MediaBrowserCompatMediaItem = dataStoreProviderCompanionExternalSyntheticLambda2;
        this.RatingCompat = storeregisteredgeofencestolocalstoragelambda0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:60:0x0167  */
    /* JADX WARN: Code duplicated, block: B:62:0x017c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0184  */
    /* JADX WARN: Code duplicated, block: B:65:0x0186  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a0  */
    public final List write(float[] fArr, float[] fArr2, float[] fArr3, long[] jArr) {
        List listSubList;
        getlambda0 getlambda0Var;
        getlambda0 getlambda0Var2;
        LinkedList linkedList;
        clonelambda0 clonelambda0VarSerializer;
        boolean z;
        BrazeLocation brazeLocation;
        RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer;
        long[] jArr2 = jArr;
        if (!this.MediaSessionCompatToken) {
            return Collections.EMPTY_LIST;
        }
        char c = 0;
        if (this.MediaSessionCompatResultReceiverWrapper == -1) {
            this.MediaSessionCompatResultReceiverWrapper = jArr2[0];
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jArr2.length) {
            this.MediaDescriptionCompat.IconCompatParcelizer(jArr2[i], fArr[i], fArr2[i], fArr3[i]);
            r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da = this.MediaDescriptionCompat;
            if (r8lambdacuje9gyuh58gabwrad8wwadt7da.RatingCompat()) {
                i = i;
                getlambda0Var2 = getlambda0Var;
            } else {
                long jIconCompatParcelizer = r8lambdacuje9gyuh58gabwrad8wwadt7da.IconCompatParcelizer();
                long j = this.MediaSessionCompatResultReceiverWrapper;
                int i2 = isValidKey.IconCompatParcelizer;
                if (((int) ((jIconCompatParcelizer - j) / 18000)) != ((int) ((r8lambdacuje9gyuh58gabwrad8wwadt7da.serializer() - this.MediaSessionCompatResultReceiverWrapper) / 18000))) {
                    long jIconCompatParcelizer2 = r8lambdacuje9gyuh58gabwrad8wwadt7da.IconCompatParcelizer();
                    long j2 = this.MediaSessionCompatResultReceiverWrapper;
                    int i3 = (int) ((jIconCompatParcelizer2 - j2) / 18000);
                    BrazeLocation brazeLocation2 = new BrazeLocation((((long) i3) * 18000) + j2, (((long) (i3 + 1)) * 18000) + j2);
                    int iRemoteActionCompatParcelizer = r8lambdacuje9gyuh58gabwrad8wwadt7da.RemoteActionCompatParcelizer(brazeLocation2.serializer());
                    if (iRemoteActionCompatParcelizer <= 0) {
                        this.RemoteActionCompatParcelizer.IconCompatParcelizer("Failed to prepare sensor data input numOfAccelValuesToInclude = %d", Integer.valueOf(iRemoteActionCompatParcelizer));
                    } else {
                        float[][] fArrIconCompatParcelizer = r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY.IconCompatParcelizer(this.MediaDescriptionCompat, 1800, iRemoteActionCompatParcelizer, brazeLocation2.IconCompatParcelizer(), brazeLocation2.serializer());
                        ArrayList arrayListSerializer = r8lambdajyieMEPHfDZ0H9VbS9ICj8_yOE.serializer(this.ParcelableVolumeInfo, brazeLocation2);
                        if (arrayListSerializer.size() > 18) {
                            listSubList = arrayListSerializer;
                            listSubList = arrayListSerializer.subList(arrayListSerializer.size() - 18, arrayListSerializer.size());
                        }
                        listSubList = arrayListSerializer;
                        List list = listSubList;
                        float[][] fArrRemoteActionCompatParcelizer = r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY.RemoteActionCompatParcelizer(18, list, brazeLocation2);
                        DataStoreProviderCompanionExternalSyntheticLambda2 dataStoreProviderCompanionExternalSyntheticLambda2 = this.MediaBrowserCompatMediaItem;
                        dataStoreProviderCompanionExternalSyntheticLambda2.getClass();
                        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(dataStoreProviderCompanionExternalSyntheticLambda2.read((Location) it.next()));
                        }
                        getlambda0Var = new getlambda0(fArrRemoteActionCompatParcelizer, setBorderColor.read(arrayList2), fArrIconCompatParcelizer, IconCompatParcelizer.IconCompatParcelizer);
                        float[][] fArr4 = getlambda0Var.write;
                        char c2 = (fArr4.length == 18 && fArr4[c].length == 5) ? (char) 1 : c;
                        float[][] fArr5 = getlambda0Var.RemoteActionCompatParcelizer;
                        char c3 = (fArr5.length == 18 && fArr5[c].length == 8) ? (char) 1 : c;
                        float[][] fArr6 = getlambda0Var.serializer;
                        char c4 = (fArr6.length == 1800 && fArr6[c].length == 4) ? (char) 1 : c;
                        float[][] fArr7 = getlambda0Var.IconCompatParcelizer;
                        char c5 = (fArr7.length == 1800 && fArr7[c].length == 4) ? (char) 1 : c;
                        if (c2 != 0 && c3 != 0 && c4 != 0 && c5 != 0) {
                            float[] fArr8 = new float[iRemoteActionCompatParcelizer];
                            float[] fArr9 = new float[iRemoteActionCompatParcelizer];
                            float[] fArr10 = new float[iRemoteActionCompatParcelizer];
                            long[] jArr3 = new long[iRemoteActionCompatParcelizer];
                            this.MediaDescriptionCompat.write(fArr8, fArr9, fArr10, jArr3, iRemoteActionCompatParcelizer);
                            brazeLocation2.IconCompatParcelizer(new r8lambdabuq0kpt9xWGgh2Z3gBfct3eoBM(new setTitleGravity(fArr8, fArr9, fArr10, jArr3), list, arrayList2));
                            r8lambdacuje9gyuh58gabwrad8wwadt7da.IconCompatParcelizer(iRemoteActionCompatParcelizer);
                        }
                        if (getlambda0Var2 != null) {
                            getlambda0Var2 = getlambda0Var;
                            this.PlaybackStateCompatCustomAction++;
                            linkedList = this.MediaMetadataCompat;
                            linkedList.add(brazeLocation2);
                            clonelambda0VarSerializer = this.write.serializer(getlambda0Var2);
                            if (clonelambda0VarSerializer != null) {
                                if (this.RatingCompat.IconCompatParcelizer() != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                remoteActionCompatParcelizerIconCompatParcelizer = ((clonelambda0VarSerializer.RemoteActionCompatParcelizer() == -1.0f || z) && (brazeLocation = (BrazeLocation) linkedList.poll()) != null) ? IconCompatParcelizer(clonelambda0VarSerializer, brazeLocation) : null;
                            } else {
                                linkedList.clear();
                            }
                        }
                    }
                    getlambda0Var2 = null;
                    if (getlambda0Var2 != null) {
                        getlambda0Var2 = getlambda0Var;
                        this.PlaybackStateCompatCustomAction++;
                        linkedList = this.MediaMetadataCompat;
                        linkedList.add(brazeLocation2);
                        clonelambda0VarSerializer = this.write.serializer(getlambda0Var2);
                        if (clonelambda0VarSerializer != null) {
                            if (this.RatingCompat.IconCompatParcelizer() != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (clonelambda0VarSerializer.RemoteActionCompatParcelizer() == -1.0f) {
                            }
                        } else {
                            linkedList.clear();
                        }
                    }
                } else {
                    i = i;
                }
                getlambda0Var2 = getlambda0Var;
            }
            if (remoteActionCompatParcelizerIconCompatParcelizer != null) {
                arrayList.add(remoteActionCompatParcelizerIconCompatParcelizer);
            }
            i++;
            jArr2 = jArr;
            c = 0;
        }
        return arrayList;
    }

    public final void read() {
        if (this.MediaSessionCompatToken) {
            this.MediaSessionCompatToken = false;
            this.PlaybackStateCompat = false;
            this.ParcelableVolumeInfo = new ArrayList();
            isValidKey isvalidkey = this.write;
            isvalidkey.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            isvalidkey.MediaSessionCompatResultReceiverWrapper();
            this.MediaDescriptionCompat.MediaSessionCompatQueueItem();
            this.MediaSessionCompatQueueItem.clear();
            this.MediaMetadataCompat.clear();
            this.MediaSessionCompatResultReceiverWrapper = -1L;
        }
    }

    public final boolean write() {
        if (!this.MediaSessionCompatToken) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer("Starting TransportClassifierExecutor", new Object[0]);
            ArrayList arrayList = this.MediaSessionCompatQueueItem;
            arrayList.clear();
            isValidKey isvalidkey = this.write;
            if (!isvalidkey.RatingCompat()) {
                return false;
            }
            arrayList.add(isvalidkey.ParcelableVolumeInfo());
            this.MediaDescriptionCompat.MediaBrowserCompatMediaItem();
            this.MediaSessionCompatToken = true;
            this.PlaybackStateCompatCustomAction = 0;
            this.PlaybackStateCompat = this.serializer.addOnContextAvailableListener();
            for (int i = 0; i < 10; i++) {
                isvalidkey.serializer(IconCompatParcelizer);
            }
        }
        return true;
    }

    public final void IconCompatParcelizer(long j) {
        if (this.MediaSessionCompatResultReceiverWrapper == -1) {
            this.MediaSessionCompatResultReceiverWrapper = j;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        this.MediaDescriptionCompat.read();
    }

    public final void serializer(Location location) {
        if (this.MediaSessionCompatToken) {
            this.ParcelableVolumeInfo.add(location);
            long jIconCompatParcelizer = this.MediaDescriptionCompat.IconCompatParcelizer();
            if (jIconCompatParcelizer == -1) {
                this.read.getClass();
                jIconCompatParcelizer = System.currentTimeMillis() - 60000;
            }
            r8lambdajyieMEPHfDZ0H9VbS9ICj8_yOE.IconCompatParcelizer(jIconCompatParcelizer, this.ParcelableVolumeInfo);
        }
    }

    private static float[][] serializer(int i, int i2, int i3) {
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, i, i2);
        for (int i4 = 0; i4 < i; i4++) {
            Arrays.fill(fArr[i4], i3);
        }
        return fArr;
    }

    private RemoteActionCompatParcelizer IconCompatParcelizer(clonelambda0 clonelambda0Var, BrazeLocation brazeLocation) {
        Byte bMediaSessionCompatQueueItem;
        float fWrite = this.PlaybackStateCompat ? clonelambda0Var.write() : clonelambda0Var.RemoteActionCompatParcelizer();
        float[] fArrSerializer = this.PlaybackStateCompat ? clonelambda0Var.serializer() : clonelambda0Var.IconCompatParcelizer();
        ClassifiedTransportMode classifiedTransportModeFromModelOutput = ClassifiedTransportMode.fromModelOutput((int) fWrite, this.PlaybackStateCompat);
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        if (classifiedTransportModeFromModelOutput != null) {
            Byte thriftSchemaMode = classifiedTransportModeFromModelOutput.toThriftSchemaMode();
            ClassifiedTransportMode classifiedTransportModeFromThriftSchemaMode = (thriftSchemaMode == null || (bMediaSessionCompatQueueItem = this.serializer.MediaSessionCompatQueueItem(thriftSchemaMode.byteValue())) == null) ? null : ClassifiedTransportMode.fromThriftSchemaMode(bMediaSessionCompatQueueItem.byteValue());
            if (classifiedTransportModeFromThriftSchemaMode != null) {
                parselonglambda0.IconCompatParcelizer("Classified transport mode %s was replaced with %s", classifiedTransportModeFromModelOutput, classifiedTransportModeFromThriftSchemaMode);
                classifiedTransportModeFromModelOutput = classifiedTransportModeFromThriftSchemaMode;
            }
        }
        String strIconCompatParcelizer = this.RatingCompat.IconCompatParcelizer();
        if (strIconCompatParcelizer != null) {
            ClassifiedTransportMode classifiedTransportModeFromTestMode = ClassifiedTransportMode.fromTestMode(strIconCompatParcelizer);
            parselonglambda0.IconCompatParcelizer("Classified transport mode %s was replaced with test override mode %s", classifiedTransportModeFromModelOutput, classifiedTransportModeFromTestMode);
            classifiedTransportModeFromModelOutput = classifiedTransportModeFromTestMode;
        }
        clean cleanVar = new clean(brazeLocation.IconCompatParcelizer(), brazeLocation.serializer());
        for (int i = 0; i < fArrSerializer.length; i++) {
            ClassifiedTransportMode classifiedTransportModeFromModelOutput2 = ClassifiedTransportMode.fromModelOutput(i, this.PlaybackStateCompat);
            if (classifiedTransportModeFromModelOutput2 != null) {
                cleanVar.IconCompatParcelizer(classifiedTransportModeFromModelOutput2, fArrSerializer[i]);
            }
        }
        cleanVar.serializer(classifiedTransportModeFromModelOutput);
        return new RemoteActionCompatParcelizer(clonelambda0Var.read() >= 1.0f, new r8lambdax7jFbnuaviBhW8Q6CXBAdQQk_KQ(cleanVar), brazeLocation.RemoteActionCompatParcelizer());
    }
}
