package o;

import android.content.Context;
import android.location.Location;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;
import com.sentiance.sdk.ondevice.api.SensorDataChunk;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "TransportSessionLogger")
public class parsePayloadFieldsFromBundle {
    private final parseLonglambda0 read;
    private final Context serializer;
    private final HashMap IconCompatParcelizer = new HashMap();
    private final ByteBuffer write = ByteBuffer.allocate(4);

    public final getCampaignIdannotations read(String str) {
        return RemoteActionCompatParcelizer(str);
    }

    private getCampaignIdannotations RemoteActionCompatParcelizer(String str) {
        HashMap map = this.IconCompatParcelizer;
        getCampaignIdannotations getcampaignidannotations = (getCampaignIdannotations) map.get(str);
        if (getcampaignidannotations != null) {
            return getcampaignidannotations;
        }
        getCampaignIdannotations getcampaignidannotations2 = new getCampaignIdannotations();
        try {
            File file = new File(write(), str);
            file.mkdirs();
            isSdkAuthenticationEnabled issdkauthenticationenabledIconCompatParcelizer = getResourceIdentifier.IconCompatParcelizer(new File(file, "metadata"));
            r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
            try {
                r8lambdabeyrnr8p6809bwlboro_stans.IconCompatParcelizer(issdkauthenticationenabledIconCompatParcelizer);
                getcampaignidannotations2.RemoteActionCompatParcelizer(r8lambdabeyrnr8p6809bwlboro_stans.RemoteActionCompatParcelizer());
                map.put(str, getcampaignidannotations2);
                issdkauthenticationenabledIconCompatParcelizer.close();
                r8lambdabeyrnr8p6809bwlboro_stans.serializer();
                return getcampaignidannotations2;
            } catch (Throwable th) {
                try {
                    issdkauthenticationenabledIconCompatParcelizer.close();
                    r8lambdabeyrnr8p6809bwlboro_stans.serializer();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            this.read.IconCompatParcelizer(false, e, "Error reading metadata file for session %s", str);
            return null;
        }
    }

    public final ArrayList serializer(int i, String str) {
        Location locationSerializer;
        ArrayList arrayList = new ArrayList();
        int iMin = Math.min(1000, read(i, str));
        File fileRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str, true);
        File fileRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(str, false);
        boolean zExists = fileRemoteActionCompatParcelizer.exists();
        parseLonglambda0 parselonglambda0 = this.read;
        try {
            readResourceValuelambda1 readresourcevaluelambda1 = new readResourceValuelambda1(zExists ? new getFallbackConfigKey(getResourceIdentifier.IconCompatParcelizer(fileRemoteActionCompatParcelizer)) : getResourceIdentifier.IconCompatParcelizer(fileRemoteActionCompatParcelizer2));
            while (i > 0) {
                try {
                    readresourcevaluelambda1.serializer();
                    i--;
                } catch (Throwable th) {
                    try {
                        readresourcevaluelambda1.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            for (int i2 = 0; i2 < iMin; i2++) {
                String strSerializer = readresourcevaluelambda1.serializer();
                if (strSerializer != null) {
                    try {
                        migrateMetadataToJsonlambda1 migratemetadatatojsonlambda1 = new migrateMetadataToJsonlambda1();
                        migratemetadatatojsonlambda1.RemoteActionCompatParcelizer(strSerializer);
                        locationSerializer = migratemetadatatojsonlambda1.serializer();
                    } catch (JSONException unused) {
                        parselonglambda0.RemoteActionCompatParcelizer("Failed to deserialize json location: " + strSerializer, new Object[0]);
                        locationSerializer = null;
                    }
                    if (locationSerializer != null) {
                        arrayList.add(locationSerializer);
                    }
                }
            }
            readresourcevaluelambda1.close();
        } catch (IOException e) {
            parselonglambda0.IconCompatParcelizer(false, e, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Error reading location data for session ", str), new Object[0]);
        }
        return arrayList;
    }

    public parsePayloadFieldsFromBundle(Context context, parseLonglambda0 parselonglambda0) {
        this.serializer = context;
        this.read = parselonglambda0;
    }

    public final void write(String str, ArrayList arrayList) {
        ByteBuffer byteBuffer = this.write;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            setTitleGravity settitlegravity = (setTitleGravity) it.next();
            try {
                readResourceValuelambda2 readresourcevaluelambda2 = new readResourceValuelambda2(getResourceIdentifier.write(serializer(str, false)));
                for (int i = 0; i < settitlegravity.serializer().length; i++) {
                    try {
                        float f = settitlegravity.RemoteActionCompatParcelizer()[i];
                        byteBuffer.rewind();
                        byteBuffer.putFloat(f);
                        readresourcevaluelambda2.write(byteBuffer.array());
                        float f2 = settitlegravity.IconCompatParcelizer()[i];
                        byteBuffer.rewind();
                        byteBuffer.putFloat(f2);
                        readresourcevaluelambda2.write(byteBuffer.array());
                        float f3 = settitlegravity.write()[i];
                        byteBuffer.rewind();
                        byteBuffer.putFloat(f3);
                        readresourcevaluelambda2.write(byteBuffer.array());
                        long j = settitlegravity.serializer()[i];
                        if (!readresourcevaluelambda2.RemoteActionCompatParcelizer) {
                            r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = readresourcevaluelambda2.read;
                            resetCachelambda0 resetcachelambda0IconCompatParcelizer = r8lambdabeyrnr8p6809bwlboro_stans.IconCompatParcelizer(8);
                            byte[] bArr = resetcachelambda0IconCompatParcelizer.serializer;
                            int i2 = resetcachelambda0IconCompatParcelizer.read;
                            bArr[i2] = (byte) ((j >>> 56) & 255);
                            bArr[i2 + 1] = (byte) ((j >>> 48) & 255);
                            bArr[i2 + 2] = (byte) ((j >>> 40) & 255);
                            bArr[i2 + 3] = (byte) ((j >>> 32) & 255);
                            bArr[i2 + 4] = (byte) ((j >>> 24) & 255);
                            bArr[i2 + 5] = (byte) ((j >>> 16) & 255);
                            bArr[i2 + 6] = (byte) ((j >>> 8) & 255);
                            bArr[i2 + 7] = (byte) (j & 255);
                            resetcachelambda0IconCompatParcelizer.read = i2 + 8;
                            r8lambdabeyrnr8p6809bwlboro_stans.serializer += 8;
                            readresourcevaluelambda2.serializer();
                        } else {
                            throw new IllegalStateException("closed");
                        }
                    } catch (Throwable th) {
                        try {
                            readresourcevaluelambda2.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                    this.read.IconCompatParcelizer(false, e, "Error logging transport session accel data", new Object[0]);
                }
                int length = settitlegravity.serializer().length;
                getCampaignIdannotations getcampaignidannotationsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
                if (getcampaignidannotationsRemoteActionCompatParcelizer != null) {
                    getcampaignidannotationsRemoteActionCompatParcelizer.serializer(length);
                    read(str, getcampaignidannotationsRemoteActionCompatParcelizer);
                }
                readresourcevaluelambda2.close();
            } catch (IOException e) {
                this.read.IconCompatParcelizer(false, e, "Error logging transport session accel data", new Object[0]);
            }
        }
    }

    public final void IconCompatParcelizer(String str) {
        getCampaignIdannotations getcampaignidannotationsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (getcampaignidannotationsRemoteActionCompatParcelizer != null) {
            int i = getcampaignidannotationsRemoteActionCompatParcelizer.read();
            File fileSerializer = serializer(str, false);
            if (fileSerializer.exists()) {
                try {
                    FileChannel channel = new FileOutputStream(fileSerializer, true).getChannel();
                    try {
                        channel.truncate(((long) i) * 20);
                        channel.close();
                    } catch (Throwable th) {
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    this.read.RemoteActionCompatParcelizer("Failed to truncate accel data for session ".concat(str), e);
                }
            }
        }
    }

    public final int read(int i, String str) {
        getCampaignIdannotations getcampaignidannotationsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (getcampaignidannotationsRemoteActionCompatParcelizer == null) {
            return 0;
        }
        return Math.max(0, getcampaignidannotationsRemoteActionCompatParcelizer.MediaSessionCompatQueueItem() - i);
    }

    public final File write() {
        File file = new File(this.serializer.getNoBackupFilesDir(), "sentiance/TransportSessions/");
        file.mkdirs();
        return file;
    }

    public final void serializer(String str) {
        File file = new File(write(), str);
        file.mkdirs();
        migrateSealedSessionsMapToJsonlambda0.read(file);
        this.IconCompatParcelizer.remove(str);
    }

    public final int RemoteActionCompatParcelizer(int i, String str) {
        getCampaignIdannotations getcampaignidannotationsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (getcampaignidannotationsRemoteActionCompatParcelizer == null) {
            return 0;
        }
        return Math.max(0, getcampaignidannotationsRemoteActionCompatParcelizer.read() - i);
    }

    public final void serializer(String str, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Location location = (Location) it.next();
            try {
                readResourceValuelambda2 readresourcevaluelambda2 = new readResourceValuelambda2(getResourceIdentifier.write(RemoteActionCompatParcelizer(str, false)));
                try {
                    location.setLatitude((float) location.getLatitude());
                    location.setLongitude((float) location.getLongitude());
                    readresourcevaluelambda2.serializer(new migrateMetadataToJsonlambda1(location).write());
                    readresourcevaluelambda2.serializer("\n");
                    getCampaignIdannotations getcampaignidannotationsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
                    if (getcampaignidannotationsRemoteActionCompatParcelizer != null) {
                        getcampaignidannotationsRemoteActionCompatParcelizer.serializer();
                        read(str, getcampaignidannotationsRemoteActionCompatParcelizer);
                    }
                    readresourcevaluelambda2.close();
                } catch (Throwable th) {
                    try {
                        readresourcevaluelambda2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                this.read.IconCompatParcelizer(false, e, "Error logging transport session accel data", new Object[0]);
            }
        }
    }

    private File RemoteActionCompatParcelizer(String str, boolean z) {
        File file = new File(write(), str);
        file.mkdirs();
        return new File(file, "location".concat(z ? ".gz" : ""));
    }

    public final boolean RemoteActionCompatParcelizer(long j, String str) {
        getCampaignIdannotations getcampaignidannotationsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (getcampaignidannotationsRemoteActionCompatParcelizer == null) {
            return false;
        }
        getcampaignidannotationsRemoteActionCompatParcelizer.read(com.sentiance.sdk.util.x.write(j), j, Calendar.getInstance().getTimeZone().getID());
        File fileSerializer = serializer(str, false);
        File fileSerializer2 = serializer(str, true);
        boolean zExists = fileSerializer2.exists();
        parseLonglambda0 parselonglambda0 = this.read;
        if (!zExists) {
            fileSerializer2 = migrateSealedSessionsMapToJsonlambda0.read(fileSerializer, "", parselonglambda0);
        }
        File fileRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str, false);
        File fileRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(str, true);
        if (!fileRemoteActionCompatParcelizer2.exists()) {
            fileRemoteActionCompatParcelizer2 = migrateSealedSessionsMapToJsonlambda0.read(fileRemoteActionCompatParcelizer, "", parselonglambda0);
        }
        getcampaignidannotationsRemoteActionCompatParcelizer.IconCompatParcelizer("gzip");
        boolean z = read(str, getcampaignidannotationsRemoteActionCompatParcelizer);
        if (z) {
            fileSerializer.delete();
            fileRemoteActionCompatParcelizer.delete();
            return z;
        }
        if (fileSerializer2 != null) {
            fileSerializer2.delete();
        }
        if (fileRemoteActionCompatParcelizer2 != null) {
            fileRemoteActionCompatParcelizer2.delete();
        }
        return z;
    }

    private boolean read(String str, getCampaignIdannotations getcampaignidannotations) {
        try {
            File file = new File(write(), str);
            file.mkdirs();
            readResourceValuelambda2 readresourcevaluelambda2 = new readResourceValuelambda2(getResourceIdentifier.serializer(new File(file, "metadata")));
            try {
                readresourcevaluelambda2.serializer(getcampaignidannotations.write());
                readresourcevaluelambda2.close();
                return true;
            } catch (Throwable th) {
                try {
                    readresourcevaluelambda2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            this.read.IconCompatParcelizer(false, e, "Error writing metadata file for session %s", str);
            return false;
        }
    }

    public final void serializer(String str, ClassifiedTransportMode classifiedTransportMode, long j) {
        read(str, new getCampaignIdannotations(str, j, com.sentiance.sdk.util.x.write(j), Calendar.getInstance().getTimeZone().getID(), classifiedTransportMode, null, null));
    }

    public final SensorDataChunk IconCompatParcelizer(int i, String str) {
        getResourceConfigurationValue getresourceconfigurationvalueIconCompatParcelizer;
        int iMin = Math.min(4000, RemoteActionCompatParcelizer(i, str));
        float[] fArrCopyOf = new float[iMin];
        float[] fArrCopyOf2 = new float[iMin];
        float[] fArrCopyOf3 = new float[iMin];
        long[] jArrCopyOf = new long[iMin];
        File fileSerializer = serializer(str, true);
        File fileSerializer2 = serializer(str, false);
        try {
            if (fileSerializer.exists()) {
                getresourceconfigurationvalueIconCompatParcelizer = new getFallbackConfigKey(getResourceIdentifier.IconCompatParcelizer(fileSerializer));
            } else {
                getresourceconfigurationvalueIconCompatParcelizer = getResourceIdentifier.IconCompatParcelizer(fileSerializer2);
            }
            readResourceValuelambda1 readresourcevaluelambda1 = new readResourceValuelambda1(getresourceconfigurationvalueIconCompatParcelizer);
            try {
                readresourcevaluelambda1.IconCompatParcelizer(((long) i) * 20);
                int i2 = 0;
                while (i2 < iMin && !readresourcevaluelambda1.RemoteActionCompatParcelizer()) {
                    fArrCopyOf[i2] = write(readresourcevaluelambda1);
                    fArrCopyOf2[i2] = write(readresourcevaluelambda1);
                    fArrCopyOf3[i2] = write(readresourcevaluelambda1);
                    readresourcevaluelambda1.MediaDescriptionCompat(8L);
                    jArrCopyOf[i2] = readresourcevaluelambda1.IconCompatParcelizer.PlaybackStateCompatCustomAction();
                    i2++;
                }
                if (i2 != iMin) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, i2);
                    fArrCopyOf2 = Arrays.copyOf(fArrCopyOf2, i2);
                    fArrCopyOf3 = Arrays.copyOf(fArrCopyOf3, i2);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                }
                SensorDataChunk sensorDataChunk = new SensorDataChunk(fArrCopyOf, fArrCopyOf2, fArrCopyOf3, jArrCopyOf);
                readresourcevaluelambda1.close();
                return sensorDataChunk;
            } catch (Throwable th) {
                try {
                    readresourcevaluelambda1.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            this.read.IconCompatParcelizer(false, e, "Error reading accel data samples", new Object[0]);
            return new SensorDataChunk(new float[0], new float[0], new float[0], new long[0]);
        }
    }

    private float write(readResourceValuelambda1 readresourcevaluelambda1) throws IOException {
        byte[] bArrWrite = readresourcevaluelambda1.write(4L);
        ByteBuffer byteBuffer = this.write;
        byteBuffer.rewind();
        byteBuffer.put(bArrWrite);
        byteBuffer.rewind();
        return byteBuffer.getFloat();
    }

    private File serializer(String str, boolean z) {
        File file = new File(write(), str);
        file.mkdirs();
        return new File(file, "accelerometer".concat(z ? ".gz" : ""));
    }
}
