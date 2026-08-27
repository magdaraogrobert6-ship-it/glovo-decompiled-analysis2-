package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.BvF$$ExternalSyntheticLambda0;
import com.uber.h3core.H3Core$$ExternalSyntheticLambda1;
import com.uber.h3core.H3Core$$ExternalSyntheticLambda2;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.Channels;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class FwFClientDB implements Closeable {
    public static final byte[] RemoteActionCompatParcelizer = {55, 122, -68, -81, 39, 28};
    public final FoodoraPermissionDeniedException IconCompatParcelizer;
    public final ArrayList MediaBrowserCompatMediaItem;
    public byte[] MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public InputStream RatingCompat;
    public int read;
    public int serializer;
    public SeekableByteChannel write;

    public static BitSet serializer(int i, ByteBuffer byteBuffer) throws EOFException {
        BitSet bitSet = new BitSet(i);
        int i2 = 0;
        int iWrite = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (i2 == 0) {
                iWrite = write(byteBuffer);
                i2 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            bitSet.set(i3, (iWrite & i2) != 0);
            i2 >>>= 1;
        }
        return bitSet;
    }

    public final PushDataType serializer() throws IOException {
        long j;
        int i = this.read;
        FoodoraPermissionDeniedException foodoraPermissionDeniedException = this.IconCompatParcelizer;
        PushDataType[] pushDataTypeArr = foodoraPermissionDeniedException.IconCompatParcelizer;
        if (i >= pushDataTypeArr.length - 1) {
            return null;
        }
        int i2 = i + 1;
        this.read = i2;
        PushDataType pushDataType = pushDataTypeArr[i2];
        String str = pushDataType.MediaSessionCompatResultReceiverWrapper;
        isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = foodoraPermissionDeniedException.MediaMetadataCompat;
        if (iscontentcardsunreadvisualindicatorenabled == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Archive doesn't contain stream information to read entries");
            return null;
        }
        int i3 = ((int[]) iscontentcardsunreadvisualindicatorenabled.read)[i2];
        ArrayList arrayList = this.MediaBrowserCompatMediaItem;
        if (i3 < 0) {
            arrayList.clear();
        } else {
            if (this.serializer != i3) {
                this.serializer = i3;
                arrayList.clear();
                InputStream inputStream = this.RatingCompat;
                if (inputStream != null) {
                    inputStream.close();
                    this.RatingCompat = null;
                }
                SharedPreferencesManagerImpl sharedPreferencesManagerImpl = foodoraPermissionDeniedException.read[i3];
                isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled2 = foodoraPermissionDeniedException.MediaMetadataCompat;
                int i4 = ((int[]) iscontentcardsunreadvisualindicatorenabled2.IconCompatParcelizer)[i3];
                long j2 = foodoraPermissionDeniedException.serializer;
                this.write.position(j2 + 32 + ((long[]) iscontentcardsunreadvisualindicatorenabled2.write)[i4]);
                getChannelID getchannelid = new getChannelID(this, new BufferedInputStream(new FoodoraNullException(this.write, foodoraPermissionDeniedException.MediaDescriptionCompat[i4])));
                LinkedList linkedList = new LinkedList();
                InputStream getunreadmessagecount = getchannelid;
                for (FoodoraSwitchWrongException foodoraSwitchWrongException : sharedPreferencesManagerImpl.serializer()) {
                    if (foodoraSwitchWrongException.write != 1 || foodoraSwitchWrongException.read != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Multi input/output stream coders are not yet supported");
                        return null;
                    }
                    getChatID getchatidById = getChatID.byId(foodoraSwitchWrongException.RemoteActionCompatParcelizer);
                    if (sharedPreferencesManagerImpl.RemoteActionCompatParcelizer == null) {
                        j = 0;
                        break;
                        break;
                    }
                    int i5 = 0;
                    while (true) {
                        FoodoraSwitchWrongException[] foodoraSwitchWrongExceptionArr = sharedPreferencesManagerImpl.RemoteActionCompatParcelizer;
                        if (i5 >= foodoraSwitchWrongExceptionArr.length) {
                            j = 0;
                            break;
                        }
                        if (foodoraSwitchWrongExceptionArr[i5] == foodoraSwitchWrongException) {
                            j = sharedPreferencesManagerImpl.MediaBrowserCompatMediaItem[i5];
                            break;
                        }
                        i5++;
                    }
                    getunreadmessagecount = getVariantName.IconCompatParcelizer(this.MediaSessionCompatQueueItem, getunreadmessagecount, j, foodoraSwitchWrongException, this.MediaDescriptionCompat, this.MediaMetadataCompat);
                    linkedList.addFirst(new getChannelType(getchatidById, ((FoodoraCodReasonCompanion) getVariantName.write.get(getchatidById)).serializer(foodoraSwitchWrongException)));
                }
                pushDataType.getClass();
                LinkedList linkedList2 = new LinkedList();
                linkedList.forEach(new BvF$$ExternalSyntheticLambda0(1, linkedList2));
                pushDataType.read = Collections.unmodifiableList(linkedList2);
                if (sharedPreferencesManagerImpl.serializer) {
                    getunreadmessagecount = new getUnreadMessageCount(getunreadmessagecount, sharedPreferencesManagerImpl.RemoteActionCompatParcelizer(), sharedPreferencesManagerImpl.write);
                }
                this.RatingCompat = getunreadmessagecount;
            } else if (i2 > 0) {
                List list = pushDataTypeArr[i].read;
                if (list != null) {
                    pushDataType.getClass();
                    LinkedList linkedList3 = new LinkedList();
                    list.forEach(new BvF$$ExternalSyntheticLambda0(1, linkedList3));
                    pushDataType.read = Collections.unmodifiableList(linkedList3);
                } else {
                    pushDataType.read = null;
                }
            }
            UnreadCountDetails_ChatJsonAdapter unreadCountDetails_ChatJsonAdapter = new UnreadCountDetails_ChatJsonAdapter(this.RatingCompat, pushDataType.ResultReceiver);
            unreadCountDetails_ChatJsonAdapter.RemoteActionCompatParcelizer = false;
            Object getunreadmessagecount2 = unreadCountDetails_ChatJsonAdapter;
            if (pushDataType.MediaSessionCompatQueueItem) {
                getunreadmessagecount2 = new getUnreadMessageCount(unreadCountDetails_ChatJsonAdapter, pushDataType.ResultReceiver, pushDataType.write);
            }
            arrayList.add(getunreadmessagecount2);
        }
        return pushDataType;
    }

    public final String toString() {
        return this.IconCompatParcelizer.toString();
    }

    public final void read(ByteBuffer byteBuffer) throws EOFException {
        byteBuffer.rewind();
        SeekableByteChannel seekableByteChannel = this.write;
        int iRemaining = byteBuffer.remaining();
        ThreadLocal threadLocal = UnreadCountDetailsJsonAdapter.RemoteActionCompatParcelizer;
        int iRemaining2 = byteBuffer.remaining();
        while (byteBuffer.remaining() > 0 && -1 != seekableByteChannel.read(byteBuffer)) {
        }
        if (iRemaining2 - byteBuffer.remaining() >= iRemaining) {
            byteBuffer.flip();
        } else {
            DrawableTransformation.IconCompatParcelizer();
        }
    }

    public FwFClientDB(File file) throws IOException {
        SeekableByteChannel seekableByteChannelNewByteChannel = Files.newByteChannel(file.toPath(), EnumSet.of(StandardOpenOption.READ), new FileAttribute[0]);
        String absolutePath = file.getAbsolutePath();
        this.read = -1;
        this.serializer = -1;
        this.MediaBrowserCompatMediaItem = new ArrayList();
        this.write = seekableByteChannelNewByteChannel;
        this.MediaSessionCompatQueueItem = absolutePath;
        this.MediaMetadataCompat = Integer.MAX_VALUE;
        try {
            this.IconCompatParcelizer = read((byte[]) null);
            this.MediaDescriptionCompat = null;
        } catch (Throwable th) {
            this.write.close();
            throw th;
        }
    }

    public static void RemoteActionCompatParcelizer(ByteBuffer byteBuffer, FoodoraPermissionDeniedException foodoraPermissionDeniedException) throws IOException {
        int i;
        long j;
        long j2;
        long jRemoteActionCompatParcelizer;
        byte[] bArr;
        int iWrite = write(byteBuffer);
        if (iWrite == 6) {
            foodoraPermissionDeniedException.serializer = RemoteActionCompatParcelizer(byteBuffer);
            int iRemoteActionCompatParcelizer = (int) RemoteActionCompatParcelizer(byteBuffer);
            int iWrite2 = write(byteBuffer);
            if (iWrite2 == 9) {
                foodoraPermissionDeniedException.MediaDescriptionCompat = new long[iRemoteActionCompatParcelizer];
                int i2 = 0;
                while (true) {
                    long[] jArr = foodoraPermissionDeniedException.MediaDescriptionCompat;
                    if (i2 >= jArr.length) {
                        break;
                    }
                    jArr[i2] = RemoteActionCompatParcelizer(byteBuffer);
                    i2++;
                }
                iWrite2 = write(byteBuffer);
            }
            if (iWrite2 == 10) {
                foodoraPermissionDeniedException.RemoteActionCompatParcelizer = write(iRemoteActionCompatParcelizer, byteBuffer);
                foodoraPermissionDeniedException.write = new long[iRemoteActionCompatParcelizer];
                for (int i3 = 0; i3 < iRemoteActionCompatParcelizer; i3++) {
                    if (foodoraPermissionDeniedException.RemoteActionCompatParcelizer.get(i3)) {
                        long[] jArr2 = foodoraPermissionDeniedException.write;
                        RemoteActionCompatParcelizer(4, byteBuffer);
                        jArr2[i3] = ((long) byteBuffer.getInt()) & 4294967295L;
                    }
                }
                write(byteBuffer);
            }
            iWrite = write(byteBuffer);
        }
        if (iWrite == 7) {
            write(byteBuffer);
            int iRemoteActionCompatParcelizer2 = (int) RemoteActionCompatParcelizer(byteBuffer);
            SharedPreferencesManagerImpl[] sharedPreferencesManagerImplArr = new SharedPreferencesManagerImpl[iRemoteActionCompatParcelizer2];
            foodoraPermissionDeniedException.read = sharedPreferencesManagerImplArr;
            write(byteBuffer);
            for (int i4 = 0; i4 < iRemoteActionCompatParcelizer2; i4++) {
                SharedPreferencesManagerImpl sharedPreferencesManagerImpl = new SharedPreferencesManagerImpl();
                int iRemoteActionCompatParcelizer3 = (int) RemoteActionCompatParcelizer(byteBuffer);
                FoodoraSwitchWrongException[] foodoraSwitchWrongExceptionArr = new FoodoraSwitchWrongException[iRemoteActionCompatParcelizer3];
                long j3 = 0;
                long j4 = 0;
                int i5 = 0;
                while (true) {
                    long jRemoteActionCompatParcelizer2 = 1;
                    if (i5 < iRemoteActionCompatParcelizer3) {
                        int iWrite3 = write(byteBuffer);
                        int i6 = iWrite3 & 15;
                        boolean z = (iWrite3 & 16) == 0;
                        boolean z2 = (iWrite3 & 32) != 0;
                        boolean z3 = (iWrite3 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0;
                        byte[] bArr2 = new byte[i6];
                        RemoteActionCompatParcelizer(i6, byteBuffer);
                        byteBuffer.get(bArr2);
                        if (z) {
                            jRemoteActionCompatParcelizer = 1;
                        } else {
                            jRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(byteBuffer);
                            jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(byteBuffer);
                        }
                        long j5 = j3 + jRemoteActionCompatParcelizer;
                        if (z2) {
                            int iRemoteActionCompatParcelizer4 = (int) RemoteActionCompatParcelizer(byteBuffer);
                            byte[] bArr3 = new byte[iRemoteActionCompatParcelizer4];
                            RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer4, byteBuffer);
                            byteBuffer.get(bArr3);
                            bArr = bArr3;
                        } else {
                            bArr = null;
                        }
                        if (!z3) {
                            foodoraSwitchWrongExceptionArr[i5] = new FoodoraSwitchWrongException(bArr2, jRemoteActionCompatParcelizer2, jRemoteActionCompatParcelizer, bArr);
                            i5++;
                            j4 += jRemoteActionCompatParcelizer2;
                            j3 = j5;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Alternative methods are unsupported, please report. The reference implementation doesn't support them either.");
                            return;
                        }
                    }
                }
                sharedPreferencesManagerImpl.RemoteActionCompatParcelizer = foodoraSwitchWrongExceptionArr;
                sharedPreferencesManagerImpl.MediaMetadataCompat = j4;
                sharedPreferencesManagerImpl.MediaSessionCompatQueueItem = j3;
                long j6 = j3 - 1;
                int i7 = (int) j6;
                ApiExceptionSessionExpiredForbidden[] apiExceptionSessionExpiredForbiddenArr = new ApiExceptionSessionExpiredForbidden[i7];
                for (int i8 = 0; i8 < i7; i8++) {
                    apiExceptionSessionExpiredForbiddenArr[i8] = new ApiExceptionSessionExpiredForbidden(RemoteActionCompatParcelizer(byteBuffer), RemoteActionCompatParcelizer(byteBuffer), 3, (byte) 0);
                }
                sharedPreferencesManagerImpl.IconCompatParcelizer = apiExceptionSessionExpiredForbiddenArr;
                long j7 = j4 - j6;
                int i9 = (int) j7;
                long[] jArr3 = new long[i9];
                if (j7 == 1) {
                    int i10 = 0;
                    while (i10 < ((int) j4) && sharedPreferencesManagerImpl.IconCompatParcelizer != null) {
                        int i11 = 0;
                        while (true) {
                            ApiExceptionSessionExpiredForbidden[] apiExceptionSessionExpiredForbiddenArr2 = sharedPreferencesManagerImpl.IconCompatParcelizer;
                            if (i11 >= apiExceptionSessionExpiredForbiddenArr2.length) {
                                break;
                            }
                            j2 = j4;
                            if (apiExceptionSessionExpiredForbiddenArr2[i11].read == i10) {
                                break;
                            }
                            i11++;
                            j4 = j2;
                        }
                        if (i11 < 0) {
                            break;
                        }
                        i10++;
                        j4 = j2;
                    }
                    jArr3[0] = i10;
                } else {
                    for (int i12 = 0; i12 < i9; i12++) {
                        jArr3[i12] = RemoteActionCompatParcelizer(byteBuffer);
                    }
                }
                sharedPreferencesManagerImpl.RatingCompat = jArr3;
                sharedPreferencesManagerImplArr[i4] = sharedPreferencesManagerImpl;
            }
            write(byteBuffer);
            for (int i13 = 0; i13 < iRemoteActionCompatParcelizer2; i13++) {
                SharedPreferencesManagerImpl sharedPreferencesManagerImpl2 = sharedPreferencesManagerImplArr[i13];
                RemoteActionCompatParcelizer(sharedPreferencesManagerImpl2.MediaSessionCompatQueueItem, "totalOutputStreams");
                sharedPreferencesManagerImpl2.MediaBrowserCompatMediaItem = new long[(int) sharedPreferencesManagerImpl2.MediaSessionCompatQueueItem];
                for (int i14 = 0; i14 < sharedPreferencesManagerImpl2.MediaSessionCompatQueueItem; i14++) {
                    sharedPreferencesManagerImpl2.MediaBrowserCompatMediaItem[i14] = RemoteActionCompatParcelizer(byteBuffer);
                }
            }
            if (write(byteBuffer) == 10) {
                BitSet bitSetWrite = write(iRemoteActionCompatParcelizer2, byteBuffer);
                for (int i15 = 0; i15 < iRemoteActionCompatParcelizer2; i15++) {
                    if (bitSetWrite.get(i15)) {
                        SharedPreferencesManagerImpl sharedPreferencesManagerImpl3 = sharedPreferencesManagerImplArr[i15];
                        sharedPreferencesManagerImpl3.serializer = true;
                        RemoteActionCompatParcelizer(4, byteBuffer);
                        sharedPreferencesManagerImpl3.write = ((long) byteBuffer.getInt()) & 4294967295L;
                    } else {
                        sharedPreferencesManagerImplArr[i15].serializer = false;
                    }
                }
                i = 0;
                write(byteBuffer);
            } else {
                i = 0;
            }
            iWrite = write(byteBuffer);
        } else {
            i = 0;
            foodoraPermissionDeniedException.read = SharedPreferencesManagerImpl.read;
        }
        if (iWrite == 8) {
            SharedPreferencesManagerImpl[] sharedPreferencesManagerImplArr2 = foodoraPermissionDeniedException.read;
            int length = sharedPreferencesManagerImplArr2.length;
            for (int i16 = i; i16 < length; i16++) {
                sharedPreferencesManagerImplArr2[i16].MediaDescriptionCompat = 1;
            }
            long length2 = foodoraPermissionDeniedException.read.length;
            int iWrite4 = write(byteBuffer);
            if (iWrite4 == 13) {
                SharedPreferencesManagerImpl[] sharedPreferencesManagerImplArr3 = foodoraPermissionDeniedException.read;
                int length3 = sharedPreferencesManagerImplArr3.length;
                long j8 = 0;
                for (int i17 = i; i17 < length3; i17++) {
                    SharedPreferencesManagerImpl sharedPreferencesManagerImpl4 = sharedPreferencesManagerImplArr3[i17];
                    long jRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(byteBuffer);
                    sharedPreferencesManagerImpl4.MediaDescriptionCompat = (int) jRemoteActionCompatParcelizer3;
                    j8 += jRemoteActionCompatParcelizer3;
                }
                long j9 = j8;
                iWrite4 = write(byteBuffer);
                length2 = j9;
            }
            r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY((int) length2);
            long[] jArr4 = (long[]) r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer;
            BitSet bitSet = (BitSet) r8lambdadeozq815xuuwmllyyvm_qv79qy.write;
            long[] jArr5 = (long[]) r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer;
            SharedPreferencesManagerImpl[] sharedPreferencesManagerImplArr4 = foodoraPermissionDeniedException.read;
            int length4 = sharedPreferencesManagerImplArr4.length;
            int i18 = i;
            int i19 = i18;
            while (i18 < length4) {
                SharedPreferencesManagerImpl sharedPreferencesManagerImpl5 = sharedPreferencesManagerImplArr4[i18];
                if (sharedPreferencesManagerImpl5.MediaDescriptionCompat != 0) {
                    if (iWrite4 == 9) {
                        int i20 = i19;
                        j = 0;
                        int i21 = i;
                        while (i21 < sharedPreferencesManagerImpl5.MediaDescriptionCompat - 1) {
                            long jRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(byteBuffer);
                            jArr5[i20] = jRemoteActionCompatParcelizer4;
                            j += jRemoteActionCompatParcelizer4;
                            i21++;
                            i20++;
                        }
                        i19 = i20;
                    } else {
                        j = 0;
                    }
                    if (j <= sharedPreferencesManagerImpl5.RemoteActionCompatParcelizer()) {
                        jArr5[i19] = sharedPreferencesManagerImpl5.RemoteActionCompatParcelizer() - j;
                        i19++;
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("sum of unpack sizes of folder exceeds total unpack size");
                        return;
                    }
                }
                i18++;
                i = 0;
            }
            if (iWrite4 == 9) {
                iWrite4 = write(byteBuffer);
            }
            int i22 = 0;
            for (SharedPreferencesManagerImpl sharedPreferencesManagerImpl6 : foodoraPermissionDeniedException.read) {
                int i23 = sharedPreferencesManagerImpl6.MediaDescriptionCompat;
                if (i23 != 1 || !sharedPreferencesManagerImpl6.serializer) {
                    i22 += i23;
                }
            }
            if (iWrite4 == 10) {
                BitSet bitSetWrite2 = write(i22, byteBuffer);
                long[] jArr6 = new long[i22];
                for (int i24 = 0; i24 < i22; i24++) {
                    if (bitSetWrite2.get(i24)) {
                        RemoteActionCompatParcelizer(4, byteBuffer);
                        jArr6[i24] = ((long) byteBuffer.getInt()) & 4294967295L;
                    }
                }
                int i25 = 0;
                int i26 = 0;
                for (SharedPreferencesManagerImpl sharedPreferencesManagerImpl7 : foodoraPermissionDeniedException.read) {
                    if (sharedPreferencesManagerImpl7.MediaDescriptionCompat == 1 && sharedPreferencesManagerImpl7.serializer) {
                        bitSet.set(i25, true);
                        jArr4[i25] = sharedPreferencesManagerImpl7.write;
                        i25++;
                    } else {
                        int i27 = i26;
                        int i28 = i25;
                        for (int i29 = 0; i29 < sharedPreferencesManagerImpl7.MediaDescriptionCompat; i29++) {
                            bitSet.set(i28, bitSetWrite2.get(i27));
                            jArr4[i28] = jArr6[i27];
                            i28++;
                            i27++;
                        }
                        i25 = i28;
                        i26 = i27;
                    }
                }
                write(byteBuffer);
            }
            foodoraPermissionDeniedException.MediaBrowserCompatMediaItem = r8lambdadeozq815xuuwmllyyvm_qv79qy;
            write(byteBuffer);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0294  */
    /* JADX WARN: Code duplicated, block: B:104:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:106:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:109:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:114:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:121:0x030c  */
    /* JADX WARN: Code duplicated, block: B:123:0x031c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0334  */
    /* JADX WARN: Code duplicated, block: B:130:0x0344  */
    /* JADX WARN: Code duplicated, block: B:135:0x035c  */
    /* JADX WARN: Code duplicated, block: B:137:0x036c  */
    /* JADX WARN: Code duplicated, block: B:142:0x0384  */
    /* JADX WARN: Code duplicated, block: B:144:0x038a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0398  */
    /* JADX WARN: Code duplicated, block: B:148:0x039c  */
    /* JADX WARN: Code duplicated, block: B:150:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:158:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:160:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:162:0x03de  */
    /* JADX WARN: Code duplicated, block: B:164:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:166:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:169:0x0406 A[PHI: r4 r6
  0x0406: PHI (r4v4 int) = (r4v3 int), (r4v22 int) binds: [B:99:0x0292, B:103:0x02a7] A[DONT_GENERATE, DONT_INLINE]
  0x0406: PHI (r6v11 int) = (r6v10 int), (r6v26 int) binds: [B:99:0x0292, B:103:0x02a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:171:0x040a  */
    /* JADX WARN: Code duplicated, block: B:173:0x0418  */
    /* JADX WARN: Code duplicated, block: B:175:0x041e A[LOOP:7: B:174:0x041c->B:175:0x041e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x0436 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x0438  */
    /* JADX WARN: Code duplicated, block: B:181:0x0441  */
    /* JADX WARN: Code duplicated, block: B:186:0x0459  */
    /* JADX WARN: Code duplicated, block: B:189:0x0466  */
    /* JADX WARN: Code duplicated, block: B:190:0x0468  */
    /* JADX WARN: Code duplicated, block: B:194:0x0471  */
    /* JADX WARN: Code duplicated, block: B:197:0x0476  */
    /* JADX WARN: Code duplicated, block: B:199:0x047a  */
    /* JADX WARN: Code duplicated, block: B:201:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:202:0x04a3 A[PHI: r10
  0x04a3: PHI (r10v16 int) = (r10v6 int), (r10v18 int) binds: [B:187:0x0463, B:201:0x04a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:205:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:206:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:210:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:213:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:216:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:221:0x0507 A[LOOP:15: B:220:0x0505->B:221:0x0507, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:224:0x051c A[LOOP:16: B:223:0x051a->B:224:0x051c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:228:0x0535  */
    /* JADX WARN: Code duplicated, block: B:230:0x053b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:232:0x0541  */
    /* JADX WARN: Code duplicated, block: B:234:0x0544 A[LOOP:18: B:234:0x0544->B:239:0x0552, LOOP_START, PHI: r4
  0x0544: PHI (r4v17 int) = (r4v13 int), (r4v18 int) binds: [B:233:0x0542, B:239:0x0552] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:236:0x0549  */
    /* JADX WARN: Code duplicated, block: B:239:0x0552 A[LOOP:18: B:234:0x0544->B:239:0x0552, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:247:0x056b  */
    /* JADX WARN: Code duplicated, block: B:252:0x058a  */
    /* JADX WARN: Code duplicated, block: B:254:0x0595  */
    /* JADX WARN: Code duplicated, block: B:255:0x0598  */
    /* JADX WARN: Code duplicated, block: B:256:0x059f  */
    /* JADX WARN: Code duplicated, block: B:258:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:260:0x05be  */
    /* JADX WARN: Code duplicated, block: B:262:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:264:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:266:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:268:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:270:0x0603  */
    /* JADX WARN: Code duplicated, block: B:272:0x0618  */
    /* JADX WARN: Code duplicated, block: B:274:0x0628  */
    /* JADX WARN: Code duplicated, block: B:276:0x0632  */
    /* JADX WARN: Code duplicated, block: B:278:0x0647  */
    /* JADX WARN: Code duplicated, block: B:281:0x065b  */
    /* JADX WARN: Code duplicated, block: B:283:0x0670  */
    /* JADX WARN: Code duplicated, block: B:285:0x0674  */
    /* JADX WARN: Code duplicated, block: B:290:0x06a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:293:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:294:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:295:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:296:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:299:0x06da  */
    /* JADX WARN: Code duplicated, block: B:300:0x06de  */
    /* JADX WARN: Code duplicated, block: B:301:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:302:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:340:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x0357 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x0350 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x037f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x03cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x03c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x03af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x03d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x03e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x02dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x03fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x02d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x032f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x03f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x03f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x03f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x03f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x03f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x03f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x03f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x03a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x06a3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x0454 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x05c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x05f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x0625 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x0654 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x0697 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x04ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x04a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x057b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x0559 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x0578 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x0555 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0555 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0247  */
    /* JADX WARN: Code duplicated, block: B:86:0x0257  */
    /* JADX WARN: Code duplicated, block: B:88:0x025d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0270 A[LOOP:4: B:87:0x025b->B:90:0x0270, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0280 A[PHI: r6
  0x0280: PHI (r6v9 int) = (r6v8 int), (r6v32 int) binds: [B:85:0x0255, B:92:0x027c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0285  */
    /* JADX WARN: Code duplicated, block: B:97:0x0288  */
    /* JADX WARN: Type inference failed for: r5v3, types: [int[], java.io.Serializable] */
    public final FoodoraPermissionDeniedException read(byte[] bArr) throws IOException {
        int iPosition;
        getOrderID getorderid;
        int iWrite;
        int i;
        int i2;
        int i3;
        int iWrite2;
        int iRemoteActionCompatParcelizer;
        LinkedHashMap linkedHashMap;
        BitSet bitSetSerializer;
        BitSet bitSetSerializer2;
        BitSet bitSetSerializer3;
        int iWrite3;
        int i4;
        int i5;
        int i6;
        long j;
        int length;
        ?? r5;
        int length2;
        int i7;
        int length3;
        long[] jArr;
        int i8;
        int[] iArr;
        int[] iArr2;
        int i9;
        int i10;
        int i11;
        PushDataType[] pushDataTypeArr;
        SharedPreferencesManagerImpl[] sharedPreferencesManagerImplArr;
        PushDataType pushDataType;
        boolean z;
        boolean z2;
        boolean z3;
        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy;
        long j2;
        long jRemoteActionCompatParcelizer;
        int i12;
        byte[] bArr2;
        int i13;
        int i14;
        BitSet bitSetWrite;
        int i15;
        PushDataType pushDataType2;
        boolean z4;
        BitSet bitSetWrite2;
        int i16;
        PushDataType pushDataType3;
        boolean z5;
        BitSet bitSetWrite3;
        int i17;
        PushDataType pushDataType4;
        boolean z6;
        BitSet bitSetWrite4;
        int i18;
        PushDataType pushDataType5;
        boolean z7;
        int iWrite4;
        int iCardinality;
        int iWrite5;
        int i19;
        long jRemoteActionCompatParcelizer2;
        int iRemoteActionCompatParcelizer2;
        int i20;
        int i21;
        int iCardinality2;
        long j3;
        int iCardinality3;
        long j4;
        int iCardinality4;
        long j5;
        int iCardinality5;
        long j6;
        int iWrite6;
        long jRemoteActionCompatParcelizer3;
        long j7;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
        read(byteBufferOrder);
        byte[] bArr3 = new byte[6];
        byteBufferOrder.get(bArr3);
        if (Arrays.equals(bArr3, RemoteActionCompatParcelizer)) {
            byte b = byteBufferOrder.get();
            byte b2 = byteBufferOrder.get();
            if (b == 0) {
                long j8 = ((long) byteBufferOrder.getInt()) & 4294967295L;
                if (j8 == 0) {
                    long jPosition = this.write.position();
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
                    read(byteBufferAllocate);
                    this.write.position(jPosition);
                    do {
                        if (!byteBufferAllocate.hasRemaining()) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("archive seems to be invalid.\nYou may want to retry and enable the tryToRecoverBrokenArchives if the archive could be a multi volume archive that has been closed prematurely.");
                            return null;
                        }
                    } while (byteBufferAllocate.get() == 0);
                }
                DataInputStream dataInputStream = new DataInputStream(new getUnreadMessageCount(new FoodoraNullException(this.write, 20L), 20L, j8));
                try {
                    long jReverseBytes = Long.reverseBytes(dataInputStream.readLong());
                    if (jReverseBytes >= 0 && jReverseBytes + 32 <= this.write.size()) {
                        long jReverseBytes2 = Long.reverseBytes(dataInputStream.readLong());
                        long j9 = jReverseBytes + jReverseBytes2;
                        if (j9 >= jReverseBytes && j9 + 32 <= this.write.size()) {
                            getPushAlert getpushalert = new getPushAlert(jReverseBytes, jReverseBytes2, ((long) Integer.reverseBytes(dataInputStream.readInt())) & 4294967295L);
                            dataInputStream.close();
                            long j10 = getpushalert.IconCompatParcelizer;
                            RemoteActionCompatParcelizer(j10, "nextHeaderSize");
                            int i22 = (int) j10;
                            this.write.position(getpushalert.read + 32);
                            long jPosition2 = this.write.position();
                            CheckedInputStream checkedInputStream = new CheckedInputStream(Channels.newInputStream(this.write), new CRC32());
                            long j11 = i22;
                            if (checkedInputStream.skip(j11) != j11) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Problem computing NextHeader CRC-32");
                            } else if (getpushalert.serializer == checkedInputStream.getChecksum().getValue()) {
                                this.write.position(jPosition2);
                                FoodoraPermissionDeniedException foodoraPermissionDeniedException = new FoodoraPermissionDeniedException();
                                ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(i22).order(ByteOrder.LITTLE_ENDIAN);
                                read(byteBufferOrder2);
                                int iWrite7 = write(byteBufferOrder2);
                                int i23 = this.MediaMetadataCompat;
                                int i24 = -1;
                                int i25 = 0;
                                if (iWrite7 == 23) {
                                    int iPosition2 = byteBufferOrder2.position();
                                    getOrderID getorderid2 = new getOrderID();
                                    write(byteBufferOrder2, getorderid2);
                                    getorderid2.write(i23);
                                    byteBufferOrder2.position(iPosition2);
                                    RemoteActionCompatParcelizer(byteBufferOrder2, foodoraPermissionDeniedException);
                                    SharedPreferencesManagerImpl[] sharedPreferencesManagerImplArr2 = foodoraPermissionDeniedException.read;
                                    if (sharedPreferencesManagerImplArr2.length != 0) {
                                        if (foodoraPermissionDeniedException.MediaDescriptionCompat.length != 0) {
                                            SharedPreferencesManagerImpl sharedPreferencesManagerImpl = sharedPreferencesManagerImplArr2[0];
                                            this.write.position(foodoraPermissionDeniedException.serializer + 32);
                                            FoodoraNullException foodoraNullException = new FoodoraNullException(this.write, foodoraPermissionDeniedException.MediaDescriptionCompat[0]);
                                            InputStream getunreadmessagecount = foodoraNullException;
                                            for (FoodoraSwitchWrongException foodoraSwitchWrongException : sharedPreferencesManagerImpl.serializer()) {
                                                if (foodoraSwitchWrongException.write == 1 && foodoraSwitchWrongException.read == 1) {
                                                    if (sharedPreferencesManagerImpl.RemoteActionCompatParcelizer == null) {
                                                        j7 = 0;
                                                        break;
                                                        break;
                                                    }
                                                    int i26 = 0;
                                                    while (true) {
                                                        FoodoraSwitchWrongException[] foodoraSwitchWrongExceptionArr = sharedPreferencesManagerImpl.RemoteActionCompatParcelizer;
                                                        if (i26 >= foodoraSwitchWrongExceptionArr.length) {
                                                            j7 = 0;
                                                            break;
                                                        }
                                                        if (foodoraSwitchWrongExceptionArr[i26] == foodoraSwitchWrongException) {
                                                            j7 = sharedPreferencesManagerImpl.MediaBrowserCompatMediaItem[i26];
                                                            break;
                                                        }
                                                        i26++;
                                                    }
                                                    getunreadmessagecount = getVariantName.IconCompatParcelizer(this.MediaSessionCompatQueueItem, getunreadmessagecount, j7, foodoraSwitchWrongException, bArr, this.MediaMetadataCompat);
                                                } else {
                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Multi input/output stream coders are not yet supported");
                                                }
                                            }
                                            if (sharedPreferencesManagerImpl.serializer) {
                                                getunreadmessagecount = new getUnreadMessageCount(getunreadmessagecount, sharedPreferencesManagerImpl.RemoteActionCompatParcelizer(), sharedPreferencesManagerImpl.write);
                                            }
                                            int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(sharedPreferencesManagerImpl.RemoteActionCompatParcelizer(), "unpackSize");
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            long j12 = iRemoteActionCompatParcelizer3;
                                            byte[] bArr4 = (byte[]) UnreadCountDetailsJsonAdapter.RemoteActionCompatParcelizer.get();
                                            Arrays.fill(bArr4, (byte) 0);
                                            int i27 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                                            if (i27 != 0) {
                                                int length4 = bArr4.length;
                                                int iMin = (i27 <= 0 || j12 >= ((long) length4)) ? length4 : (int) j12;
                                                long j13 = 0;
                                                while (iMin > 0) {
                                                    int i28 = getunreadmessagecount.read(bArr4, i25, iMin);
                                                    if (i24 == i28) {
                                                        break;
                                                    }
                                                    byteArrayOutputStream.write(bArr4, i25, i28);
                                                    j13 += (long) i28;
                                                    if (i27 > 0) {
                                                        iMin = (int) Math.min(j12 - j13, length4);
                                                    }
                                                    bArr4 = bArr4;
                                                    i27 = i27;
                                                    i24 = -1;
                                                    i25 = 0;
                                                }
                                            }
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            if (byteArray.length >= iRemoteActionCompatParcelizer3) {
                                                getunreadmessagecount.close();
                                                byteBufferOrder2 = ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN);
                                                foodoraPermissionDeniedException = new FoodoraPermissionDeniedException();
                                                iWrite7 = write(byteBufferOrder2);
                                                if (iWrite7 == 1) {
                                                    iPosition = byteBufferOrder2.position();
                                                    getorderid = new getOrderID();
                                                    iWrite = write(byteBufferOrder2);
                                                    if (iWrite == 2) {
                                                        for (iWrite6 = write(byteBufferOrder2); iWrite6 != 0; iWrite6 = write(byteBufferOrder2)) {
                                                            jRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(byteBufferOrder2), "propertySize");
                                                            if (serializer(jRemoteActionCompatParcelizer3, byteBufferOrder2) >= jRemoteActionCompatParcelizer3) {
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid property size");
                                                            }
                                                        }
                                                        iWrite = write(byteBufferOrder2);
                                                        if (iWrite != 3) {
                                                            i = 4;
                                                            if (iWrite == 4) {
                                                                write(byteBufferOrder2, getorderid);
                                                                iWrite = write(byteBufferOrder2);
                                                            }
                                                            i2 = 8;
                                                            if (iWrite == 5) {
                                                                getorderid.serializer = RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(byteBufferOrder2), "numFiles");
                                                                iCardinality = -1;
                                                                while (true) {
                                                                    iWrite5 = write(byteBufferOrder2);
                                                                    if (iWrite5 == 0) {
                                                                        getorderid.write = getorderid.serializer - Math.max(iCardinality, 0);
                                                                        iWrite = write(byteBufferOrder2);
                                                                    } else {
                                                                        i19 = iPosition;
                                                                        jRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(byteBufferOrder2);
                                                                        switch (iWrite5) {
                                                                            case 14:
                                                                                iCardinality = serializer(getorderid.serializer, byteBufferOrder2).cardinality();
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                iPosition = i19;
                                                                                break;
                                                                            case 15:
                                                                                if (iCardinality != -1) {
                                                                                    serializer(iCardinality, byteBufferOrder2);
                                                                                    iPosition = i19;
                                                                                } else {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Header format error: kEmptyStream must appear before kEmptyFile");
                                                                                }
                                                                                break;
                                                                            case 16:
                                                                                if (iCardinality != -1) {
                                                                                    serializer(iCardinality, byteBufferOrder2);
                                                                                    iPosition = i19;
                                                                                } else {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Header format error: kEmptyStream must appear before kAnti");
                                                                                }
                                                                                break;
                                                                            case 17:
                                                                                if (write(byteBufferOrder2) == 0) {
                                                                                    iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer2 - 1, "file names length");
                                                                                    if ((iRemoteActionCompatParcelizer2 & 1) == 0) {
                                                                                        i21 = 0;
                                                                                        for (i20 = 0; i20 < iRemoteActionCompatParcelizer2; i20 += 2) {
                                                                                            RemoteActionCompatParcelizer(2, byteBufferOrder2);
                                                                                            if (byteBufferOrder2.getChar() == 0) {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (i21 == getorderid.serializer) {
                                                                                            iPosition = i19;
                                                                                        } else {
                                                                                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(af$$ExternalSyntheticOutline0.m(getorderid.serializer, ")", ff$$ExternalSyntheticOutline0.m(i21, "Invalid number of file names (", " instead of ")));
                                                                                        }
                                                                                    } else {
                                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("File names length invalid");
                                                                                    }
                                                                                } else {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                                                }
                                                                                break;
                                                                            case 18:
                                                                                iCardinality2 = write(getorderid.serializer, byteBufferOrder2).cardinality();
                                                                                if (write(byteBufferOrder2) == 0) {
                                                                                    j3 = iCardinality2 * 8;
                                                                                    if (serializer(j3, byteBufferOrder2) >= j3) {
                                                                                        iPosition = i19;
                                                                                    } else {
                                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid creation dates size");
                                                                                    }
                                                                                } else {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                                                }
                                                                                break;
                                                                            case 19:
                                                                                iCardinality3 = write(getorderid.serializer, byteBufferOrder2).cardinality();
                                                                                if (write(byteBufferOrder2) == 0) {
                                                                                    j4 = iCardinality3 * 8;
                                                                                    if (serializer(j4, byteBufferOrder2) >= j4) {
                                                                                        iPosition = i19;
                                                                                    } else {
                                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid access dates size");
                                                                                    }
                                                                                } else {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                                                }
                                                                                break;
                                                                            case 20:
                                                                                iCardinality4 = write(getorderid.serializer, byteBufferOrder2).cardinality();
                                                                                if (write(byteBufferOrder2) == 0) {
                                                                                    j5 = iCardinality4 * 8;
                                                                                    if (serializer(j5, byteBufferOrder2) >= j5) {
                                                                                        iPosition = i19;
                                                                                    } else {
                                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid modification dates size");
                                                                                    }
                                                                                } else {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                                                }
                                                                                break;
                                                                            case 21:
                                                                                iCardinality5 = write(getorderid.serializer, byteBufferOrder2).cardinality();
                                                                                if (write(byteBufferOrder2) == 0) {
                                                                                    j6 = iCardinality5 * 4;
                                                                                    if (serializer(j6, byteBufferOrder2) >= j6) {
                                                                                        iPosition = i19;
                                                                                    } else {
                                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid windows attributes size");
                                                                                    }
                                                                                } else {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                                                }
                                                                                break;
                                                                            case 22:
                                                                            case 23:
                                                                            default:
                                                                                if (serializer(jRemoteActionCompatParcelizer2, byteBufferOrder2) >= jRemoteActionCompatParcelizer2) {
                                                                                    iPosition = i19;
                                                                                } else {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite5, "Incomplete property of type "));
                                                                                }
                                                                                break;
                                                                            case 24:
                                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("kStartPos is unsupported, please report");
                                                                                break;
                                                                            case 25:
                                                                                if (serializer(jRemoteActionCompatParcelizer2, byteBufferOrder2) >= jRemoteActionCompatParcelizer2) {
                                                                                    iPosition = i19;
                                                                                } else {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Incomplete kDummy property");
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                i3 = iPosition;
                                                                if (iWrite == 0) {
                                                                    getorderid.write(i23);
                                                                    byteBufferOrder2.position(i3);
                                                                    iWrite2 = write(byteBufferOrder2);
                                                                    if (iWrite2 == 2) {
                                                                        for (iWrite4 = write(byteBufferOrder2); iWrite4 != 0; iWrite4 = write(byteBufferOrder2)) {
                                                                            int iRemoteActionCompatParcelizer4 = (int) RemoteActionCompatParcelizer(byteBufferOrder2);
                                                                            RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer4, byteBufferOrder2);
                                                                            byteBufferOrder2.get(new byte[iRemoteActionCompatParcelizer4]);
                                                                        }
                                                                        iWrite2 = write(byteBufferOrder2);
                                                                    }
                                                                    if (iWrite2 != 3) {
                                                                        if (iWrite2 == 4) {
                                                                            RemoteActionCompatParcelizer(byteBufferOrder2, foodoraPermissionDeniedException);
                                                                            iWrite2 = write(byteBufferOrder2);
                                                                        }
                                                                        if (iWrite2 == 5) {
                                                                            iRemoteActionCompatParcelizer = (int) RemoteActionCompatParcelizer(byteBufferOrder2);
                                                                            linkedHashMap = new LinkedHashMap();
                                                                            bitSetSerializer = null;
                                                                            bitSetSerializer2 = null;
                                                                            bitSetSerializer3 = null;
                                                                            while (true) {
                                                                                iWrite3 = write(byteBufferOrder2);
                                                                                if (iWrite3 == 0) {
                                                                                    i5 = 0;
                                                                                    i6 = 0;
                                                                                    for (i4 = 0; i4 < iRemoteActionCompatParcelizer; i4++) {
                                                                                        pushDataType = (PushDataType) linkedHashMap.get(Integer.valueOf(i4));
                                                                                        if (pushDataType != null) {
                                                                                            if (bitSetSerializer2 == null && bitSetSerializer2.get(i4)) {
                                                                                                z = false;
                                                                                            } else {
                                                                                                z = true;
                                                                                            }
                                                                                            pushDataType.MediaDescriptionCompat = z;
                                                                                            if (z) {
                                                                                                r8lambdadeozq815xuuwmllyyvm_qv79qy = foodoraPermissionDeniedException.MediaBrowserCompatMediaItem;
                                                                                                if (r8lambdadeozq815xuuwmllyyvm_qv79qy != null) {
                                                                                                    pushDataType.MediaSessionCompatToken = false;
                                                                                                    pushDataType.PlaybackStateCompat = false;
                                                                                                    pushDataType.MediaSessionCompatQueueItem = ((BitSet) r8lambdadeozq815xuuwmllyyvm_qv79qy.write).get(i6);
                                                                                                    r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy2 = foodoraPermissionDeniedException.MediaBrowserCompatMediaItem;
                                                                                                    pushDataType.write = ((long[]) r8lambdadeozq815xuuwmllyyvm_qv79qy2.serializer)[i6];
                                                                                                    j2 = ((long[]) r8lambdadeozq815xuuwmllyyvm_qv79qy2.RemoteActionCompatParcelizer)[i6];
                                                                                                    pushDataType.ResultReceiver = j2;
                                                                                                    if (j2 >= 0) {
                                                                                                        i6++;
                                                                                                    } else {
                                                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("broken archive, entry with negative size");
                                                                                                    }
                                                                                                } else {
                                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Archive contains file with streams but no subStreamsInfo");
                                                                                                }
                                                                                            } else {
                                                                                                if (bitSetSerializer == null && bitSetSerializer.get(i5)) {
                                                                                                    z2 = false;
                                                                                                } else {
                                                                                                    z2 = true;
                                                                                                }
                                                                                                pushDataType.MediaSessionCompatToken = z2;
                                                                                                if (bitSetSerializer3 == null && bitSetSerializer3.get(i5)) {
                                                                                                    z3 = true;
                                                                                                } else {
                                                                                                    z3 = false;
                                                                                                }
                                                                                                pushDataType.PlaybackStateCompat = z3;
                                                                                                pushDataType.MediaSessionCompatQueueItem = false;
                                                                                                pushDataType.ResultReceiver = 0L;
                                                                                                i5++;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    j = 0;
                                                                                    foodoraPermissionDeniedException.IconCompatParcelizer = (PushDataType[]) linkedHashMap.values().stream().filter(new Predicate() { // from class: o.PushNotificationData
                                                                                        @Override // java.util.function.Predicate
                                                                                        public final boolean test(Object obj) {
                                                                                            return Objects.nonNull((PushDataType) obj);
                                                                                        }
                                                                                    }).toArray(new IntFunction() { // from class: o.getFwFDataQueries
                                                                                        @Override // java.util.function.IntFunction
                                                                                        public final Object apply(int i29) {
                                                                                            return new PushDataType[i29];
                                                                                        }
                                                                                    });
                                                                                    length = foodoraPermissionDeniedException.read.length;
                                                                                    r5 = new int[length];
                                                                                    length2 = 0;
                                                                                    for (i7 = 0; i7 < length; i7++) {
                                                                                        r5[i7] = length2;
                                                                                        length2 += foodoraPermissionDeniedException.read[i7].RatingCompat.length;
                                                                                    }
                                                                                    length3 = foodoraPermissionDeniedException.MediaDescriptionCompat.length;
                                                                                    jArr = new long[length3];
                                                                                    for (i8 = 0; i8 < length3; i8++) {
                                                                                        jArr[i8] = j;
                                                                                        j += foodoraPermissionDeniedException.MediaDescriptionCompat[i8];
                                                                                    }
                                                                                    iArr = new int[length];
                                                                                    iArr2 = new int[foodoraPermissionDeniedException.IconCompatParcelizer.length];
                                                                                    i9 = 0;
                                                                                    i10 = 0;
                                                                                    i11 = 0;
                                                                                    while (true) {
                                                                                        pushDataTypeArr = foodoraPermissionDeniedException.IconCompatParcelizer;
                                                                                        if (i11 < pushDataTypeArr.length) {
                                                                                            if (pushDataTypeArr[i11].MediaDescriptionCompat && i9 == 0) {
                                                                                                iArr2[i11] = -1;
                                                                                            } else {
                                                                                                if (i9 == 0) {
                                                                                                    while (true) {
                                                                                                        sharedPreferencesManagerImplArr = foodoraPermissionDeniedException.read;
                                                                                                        if (i10 < sharedPreferencesManagerImplArr.length) {
                                                                                                            iArr[i10] = i11;
                                                                                                            if (sharedPreferencesManagerImplArr[i10].MediaDescriptionCompat <= 0) {
                                                                                                                i10++;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    if (i10 >= sharedPreferencesManagerImplArr.length) {
                                                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Too few folders in archive");
                                                                                                    }
                                                                                                }
                                                                                                iArr2[i11] = i10;
                                                                                                if (!foodoraPermissionDeniedException.IconCompatParcelizer[i11].MediaDescriptionCompat && (i9 = i9 + 1) >= foodoraPermissionDeniedException.read[i10].MediaDescriptionCompat) {
                                                                                                    i10++;
                                                                                                    i9 = 0;
                                                                                                }
                                                                                            }
                                                                                            i11++;
                                                                                        } else {
                                                                                            foodoraPermissionDeniedException.MediaMetadataCompat = new isContentCardsUnreadVisualIndicatorEnabled(r5, jArr, iArr, iArr2, 20);
                                                                                            write(byteBufferOrder2);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(byteBufferOrder2);
                                                                                    if (iWrite3 != 25) {
                                                                                        switch (iWrite3) {
                                                                                            case 14:
                                                                                                bitSetSerializer2 = serializer(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                                break;
                                                                                            case 15:
                                                                                                bitSetSerializer = serializer(bitSetSerializer2.cardinality(), byteBufferOrder2);
                                                                                                break;
                                                                                            case 16:
                                                                                                bitSetSerializer3 = serializer(bitSetSerializer2.cardinality(), byteBufferOrder2);
                                                                                                break;
                                                                                            case 17:
                                                                                                write(byteBufferOrder2);
                                                                                                i12 = (int) (jRemoteActionCompatParcelizer - 1);
                                                                                                bArr2 = new byte[i12];
                                                                                                RemoteActionCompatParcelizer(i12, byteBufferOrder2);
                                                                                                byteBufferOrder2.get(bArr2);
                                                                                                int i29 = 0;
                                                                                                i14 = 0;
                                                                                                for (i13 = 0; i13 < i12; i13 += 2) {
                                                                                                    if (bArr2[i13] != 0 && bArr2[i13 + 1] == 0) {
                                                                                                        RemoteActionCompatParcelizer(linkedHashMap, i29);
                                                                                                        ((PushDataType) linkedHashMap.get(Integer.valueOf(i29))).MediaSessionCompatResultReceiverWrapper = new String(bArr2, i14, i13 - i14, StandardCharsets.UTF_16LE);
                                                                                                        i29++;
                                                                                                        i14 = i13 + 2;
                                                                                                    }
                                                                                                }
                                                                                                if (i14 == i12 || i29 != iRemoteActionCompatParcelizer) {
                                                                                                }
                                                                                                break;
                                                                                            case 18:
                                                                                                bitSetWrite = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                                write(byteBufferOrder2);
                                                                                                for (i15 = 0; i15 < iRemoteActionCompatParcelizer; i15++) {
                                                                                                    RemoteActionCompatParcelizer(linkedHashMap, i15);
                                                                                                    pushDataType2 = (PushDataType) linkedHashMap.get(Integer.valueOf(i15));
                                                                                                    z4 = bitSetWrite.get(i15);
                                                                                                    pushDataType2.RatingCompat = z4;
                                                                                                    if (z4) {
                                                                                                        RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                                        pushDataType2.RemoteActionCompatParcelizer = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 19:
                                                                                                bitSetWrite2 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                                write(byteBufferOrder2);
                                                                                                for (i16 = 0; i16 < iRemoteActionCompatParcelizer; i16++) {
                                                                                                    RemoteActionCompatParcelizer(linkedHashMap, i16);
                                                                                                    pushDataType3 = (PushDataType) linkedHashMap.get(Integer.valueOf(i16));
                                                                                                    z5 = bitSetWrite2.get(i16);
                                                                                                    pushDataType3.MediaMetadataCompat = z5;
                                                                                                    if (z5) {
                                                                                                        RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                                        pushDataType3.IconCompatParcelizer = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 20:
                                                                                                bitSetWrite3 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                                write(byteBufferOrder2);
                                                                                                for (i17 = 0; i17 < iRemoteActionCompatParcelizer; i17++) {
                                                                                                    RemoteActionCompatParcelizer(linkedHashMap, i17);
                                                                                                    pushDataType4 = (PushDataType) linkedHashMap.get(Integer.valueOf(i17));
                                                                                                    z6 = bitSetWrite3.get(i17);
                                                                                                    pushDataType4.MediaBrowserCompatMediaItem = z6;
                                                                                                    if (z6) {
                                                                                                        RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                                        pushDataType4.ParcelableVolumeInfo = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 21:
                                                                                                bitSetWrite4 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                                write(byteBufferOrder2);
                                                                                                for (i18 = 0; i18 < iRemoteActionCompatParcelizer; i18++) {
                                                                                                    RemoteActionCompatParcelizer(linkedHashMap, i18);
                                                                                                    pushDataType5 = (PushDataType) linkedHashMap.get(Integer.valueOf(i18));
                                                                                                    z7 = bitSetWrite4.get(i18);
                                                                                                    pushDataType5.PlaybackStateCompatCustomAction = z7;
                                                                                                    if (z7) {
                                                                                                        RemoteActionCompatParcelizer(i, byteBufferOrder2);
                                                                                                        pushDataType5.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = byteBufferOrder2.getInt();
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                serializer(jRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                                break;
                                                                                        }
                                                                                    } else {
                                                                                        serializer(jRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                    }
                                                                                    i = 4;
                                                                                    i2 = 8;
                                                                                }
                                                                            }
                                                                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Error parsing file names");
                                                                        }
                                                                        foodoraPermissionDeniedException.MediaBrowserCompatMediaItem = null;
                                                                        return foodoraPermissionDeniedException;
                                                                    }
                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Additional streams unsupported");
                                                                } else {
                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite, "Badly terminated header, found "));
                                                                }
                                                            } else {
                                                                i3 = iPosition;
                                                                if (iWrite == 0) {
                                                                    getorderid.write(i23);
                                                                    byteBufferOrder2.position(i3);
                                                                    iWrite2 = write(byteBufferOrder2);
                                                                    if (iWrite2 == 2) {
                                                                        while (iWrite4 != 0) {
                                                                            int iRemoteActionCompatParcelizer5 = (int) RemoteActionCompatParcelizer(byteBufferOrder2);
                                                                            RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer5, byteBufferOrder2);
                                                                            byteBufferOrder2.get(new byte[iRemoteActionCompatParcelizer5]);
                                                                        }
                                                                        iWrite2 = write(byteBufferOrder2);
                                                                    }
                                                                    if (iWrite2 != 3) {
                                                                        if (iWrite2 == 4) {
                                                                            RemoteActionCompatParcelizer(byteBufferOrder2, foodoraPermissionDeniedException);
                                                                            iWrite2 = write(byteBufferOrder2);
                                                                        }
                                                                        if (iWrite2 == 5) {
                                                                            iRemoteActionCompatParcelizer = (int) RemoteActionCompatParcelizer(byteBufferOrder2);
                                                                            linkedHashMap = new LinkedHashMap();
                                                                            bitSetSerializer = null;
                                                                            bitSetSerializer2 = null;
                                                                            bitSetSerializer3 = null;
                                                                            while (true) {
                                                                                iWrite3 = write(byteBufferOrder2);
                                                                                if (iWrite3 == 0) {
                                                                                    i5 = 0;
                                                                                    i6 = 0;
                                                                                    while (i4 < iRemoteActionCompatParcelizer) {
                                                                                        pushDataType = (PushDataType) linkedHashMap.get(Integer.valueOf(i4));
                                                                                        if (pushDataType != null) {
                                                                                            if (bitSetSerializer2 == null) {
                                                                                                z = true;
                                                                                            } else {
                                                                                                z = true;
                                                                                            }
                                                                                            pushDataType.MediaDescriptionCompat = z;
                                                                                            if (z) {
                                                                                                r8lambdadeozq815xuuwmllyyvm_qv79qy = foodoraPermissionDeniedException.MediaBrowserCompatMediaItem;
                                                                                                if (r8lambdadeozq815xuuwmllyyvm_qv79qy != null) {
                                                                                                    pushDataType.MediaSessionCompatToken = false;
                                                                                                    pushDataType.PlaybackStateCompat = false;
                                                                                                    pushDataType.MediaSessionCompatQueueItem = ((BitSet) r8lambdadeozq815xuuwmllyyvm_qv79qy.write).get(i6);
                                                                                                    r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy3 = foodoraPermissionDeniedException.MediaBrowserCompatMediaItem;
                                                                                                    pushDataType.write = ((long[]) r8lambdadeozq815xuuwmllyyvm_qv79qy3.serializer)[i6];
                                                                                                    j2 = ((long[]) r8lambdadeozq815xuuwmllyyvm_qv79qy3.RemoteActionCompatParcelizer)[i6];
                                                                                                    pushDataType.ResultReceiver = j2;
                                                                                                    if (j2 >= 0) {
                                                                                                        i6++;
                                                                                                    } else {
                                                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("broken archive, entry with negative size");
                                                                                                    }
                                                                                                } else {
                                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Archive contains file with streams but no subStreamsInfo");
                                                                                                }
                                                                                            } else {
                                                                                                if (bitSetSerializer == null) {
                                                                                                    z2 = true;
                                                                                                } else {
                                                                                                    z2 = true;
                                                                                                }
                                                                                                pushDataType.MediaSessionCompatToken = z2;
                                                                                                if (bitSetSerializer3 == null) {
                                                                                                    z3 = false;
                                                                                                } else {
                                                                                                    z3 = false;
                                                                                                }
                                                                                                pushDataType.PlaybackStateCompat = z3;
                                                                                                pushDataType.MediaSessionCompatQueueItem = false;
                                                                                                pushDataType.ResultReceiver = 0L;
                                                                                                i5++;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    j = 0;
                                                                                    foodoraPermissionDeniedException.IconCompatParcelizer = (PushDataType[]) linkedHashMap.values().stream().filter(new Predicate() { // from class: o.PushNotificationData
                                                                                        @Override // java.util.function.Predicate
                                                                                        public final boolean test(Object obj) {
                                                                                            return Objects.nonNull((PushDataType) obj);
                                                                                        }
                                                                                    }).toArray(new IntFunction() { // from class: o.getFwFDataQueries
                                                                                        @Override // java.util.function.IntFunction
                                                                                        public final Object apply(int i210) {
                                                                                            return new PushDataType[i210];
                                                                                        }
                                                                                    });
                                                                                    length = foodoraPermissionDeniedException.read.length;
                                                                                    r5 = new int[length];
                                                                                    length2 = 0;
                                                                                    while (i7 < length) {
                                                                                        r5[i7] = length2;
                                                                                        length2 += foodoraPermissionDeniedException.read[i7].RatingCompat.length;
                                                                                    }
                                                                                    length3 = foodoraPermissionDeniedException.MediaDescriptionCompat.length;
                                                                                    jArr = new long[length3];
                                                                                    while (i8 < length3) {
                                                                                        jArr[i8] = j;
                                                                                        j += foodoraPermissionDeniedException.MediaDescriptionCompat[i8];
                                                                                    }
                                                                                    iArr = new int[length];
                                                                                    iArr2 = new int[foodoraPermissionDeniedException.IconCompatParcelizer.length];
                                                                                    i9 = 0;
                                                                                    i10 = 0;
                                                                                    i11 = 0;
                                                                                    while (true) {
                                                                                        pushDataTypeArr = foodoraPermissionDeniedException.IconCompatParcelizer;
                                                                                        if (i11 < pushDataTypeArr.length) {
                                                                                            if (pushDataTypeArr[i11].MediaDescriptionCompat) {
                                                                                                if (i9 == 0) {
                                                                                                    while (true) {
                                                                                                        sharedPreferencesManagerImplArr = foodoraPermissionDeniedException.read;
                                                                                                        if (i10 < sharedPreferencesManagerImplArr.length) {
                                                                                                            iArr[i10] = i11;
                                                                                                            if (sharedPreferencesManagerImplArr[i10].MediaDescriptionCompat <= 0) {
                                                                                                                i10++;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    if (i10 >= sharedPreferencesManagerImplArr.length) {
                                                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Too few folders in archive");
                                                                                                    }
                                                                                                }
                                                                                                iArr2[i11] = i10;
                                                                                                if (!foodoraPermissionDeniedException.IconCompatParcelizer[i11].MediaDescriptionCompat) {
                                                                                                    i10++;
                                                                                                    i9 = 0;
                                                                                                }
                                                                                            } else {
                                                                                                if (i9 == 0) {
                                                                                                    while (true) {
                                                                                                        sharedPreferencesManagerImplArr = foodoraPermissionDeniedException.read;
                                                                                                        if (i10 < sharedPreferencesManagerImplArr.length) {
                                                                                                            iArr[i10] = i11;
                                                                                                            if (sharedPreferencesManagerImplArr[i10].MediaDescriptionCompat <= 0) {
                                                                                                                i10++;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    if (i10 >= sharedPreferencesManagerImplArr.length) {
                                                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Too few folders in archive");
                                                                                                    }
                                                                                                }
                                                                                                iArr2[i11] = i10;
                                                                                                if (!foodoraPermissionDeniedException.IconCompatParcelizer[i11].MediaDescriptionCompat) {
                                                                                                    i10++;
                                                                                                    i9 = 0;
                                                                                                }
                                                                                            }
                                                                                            i11++;
                                                                                        } else {
                                                                                            foodoraPermissionDeniedException.MediaMetadataCompat = new isContentCardsUnreadVisualIndicatorEnabled(r5, jArr, iArr, iArr2, 20);
                                                                                            write(byteBufferOrder2);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(byteBufferOrder2);
                                                                                    if (iWrite3 != 25) {
                                                                                        switch (iWrite3) {
                                                                                            case 14:
                                                                                                bitSetSerializer2 = serializer(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                                break;
                                                                                            case 15:
                                                                                                bitSetSerializer = serializer(bitSetSerializer2.cardinality(), byteBufferOrder2);
                                                                                                break;
                                                                                            case 16:
                                                                                                bitSetSerializer3 = serializer(bitSetSerializer2.cardinality(), byteBufferOrder2);
                                                                                                break;
                                                                                            case 17:
                                                                                                write(byteBufferOrder2);
                                                                                                i12 = (int) (jRemoteActionCompatParcelizer - 1);
                                                                                                bArr2 = new byte[i12];
                                                                                                RemoteActionCompatParcelizer(i12, byteBufferOrder2);
                                                                                                byteBufferOrder2.get(bArr2);
                                                                                                int i210 = 0;
                                                                                                i14 = 0;
                                                                                                while (i13 < i12) {
                                                                                                    if (bArr2[i13] != 0) {
                                                                                                    }
                                                                                                }
                                                                                                if (i14 == i12) {
                                                                                                }
                                                                                                break;
                                                                                            case 18:
                                                                                                bitSetWrite = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                                write(byteBufferOrder2);
                                                                                                while (i15 < iRemoteActionCompatParcelizer) {
                                                                                                    RemoteActionCompatParcelizer(linkedHashMap, i15);
                                                                                                    pushDataType2 = (PushDataType) linkedHashMap.get(Integer.valueOf(i15));
                                                                                                    z4 = bitSetWrite.get(i15);
                                                                                                    pushDataType2.RatingCompat = z4;
                                                                                                    if (z4) {
                                                                                                        RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                                        pushDataType2.RemoteActionCompatParcelizer = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 19:
                                                                                                bitSetWrite2 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                                write(byteBufferOrder2);
                                                                                                while (i16 < iRemoteActionCompatParcelizer) {
                                                                                                    RemoteActionCompatParcelizer(linkedHashMap, i16);
                                                                                                    pushDataType3 = (PushDataType) linkedHashMap.get(Integer.valueOf(i16));
                                                                                                    z5 = bitSetWrite2.get(i16);
                                                                                                    pushDataType3.MediaMetadataCompat = z5;
                                                                                                    if (z5) {
                                                                                                        RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                                        pushDataType3.IconCompatParcelizer = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 20:
                                                                                                bitSetWrite3 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                                write(byteBufferOrder2);
                                                                                                while (i17 < iRemoteActionCompatParcelizer) {
                                                                                                    RemoteActionCompatParcelizer(linkedHashMap, i17);
                                                                                                    pushDataType4 = (PushDataType) linkedHashMap.get(Integer.valueOf(i17));
                                                                                                    z6 = bitSetWrite3.get(i17);
                                                                                                    pushDataType4.MediaBrowserCompatMediaItem = z6;
                                                                                                    if (z6) {
                                                                                                        RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                                        pushDataType4.ParcelableVolumeInfo = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 21:
                                                                                                bitSetWrite4 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                                write(byteBufferOrder2);
                                                                                                while (i18 < iRemoteActionCompatParcelizer) {
                                                                                                    RemoteActionCompatParcelizer(linkedHashMap, i18);
                                                                                                    pushDataType5 = (PushDataType) linkedHashMap.get(Integer.valueOf(i18));
                                                                                                    z7 = bitSetWrite4.get(i18);
                                                                                                    pushDataType5.PlaybackStateCompatCustomAction = z7;
                                                                                                    if (z7) {
                                                                                                        RemoteActionCompatParcelizer(i, byteBufferOrder2);
                                                                                                        pushDataType5.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = byteBufferOrder2.getInt();
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                serializer(jRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                                break;
                                                                                        }
                                                                                    } else {
                                                                                        serializer(jRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                    }
                                                                                    i = 4;
                                                                                    i2 = 8;
                                                                                }
                                                                            }
                                                                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Error parsing file names");
                                                                        }
                                                                        foodoraPermissionDeniedException.MediaBrowserCompatMediaItem = null;
                                                                        return foodoraPermissionDeniedException;
                                                                    }
                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Additional streams unsupported");
                                                                } else {
                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite, "Badly terminated header, found "));
                                                                }
                                                            }
                                                        } else {
                                                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Additional streams unsupported");
                                                        }
                                                    } else if (iWrite != 3) {
                                                        i = 4;
                                                        if (iWrite == 4) {
                                                            write(byteBufferOrder2, getorderid);
                                                            iWrite = write(byteBufferOrder2);
                                                        }
                                                        i2 = 8;
                                                        if (iWrite == 5) {
                                                            getorderid.serializer = RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(byteBufferOrder2), "numFiles");
                                                            iCardinality = -1;
                                                            while (true) {
                                                                iWrite5 = write(byteBufferOrder2);
                                                                if (iWrite5 == 0) {
                                                                    getorderid.write = getorderid.serializer - Math.max(iCardinality, 0);
                                                                    iWrite = write(byteBufferOrder2);
                                                                } else {
                                                                    i19 = iPosition;
                                                                    jRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(byteBufferOrder2);
                                                                    switch (iWrite5) {
                                                                        case 14:
                                                                            iCardinality = serializer(getorderid.serializer, byteBufferOrder2).cardinality();
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            iPosition = i19;
                                                                            break;
                                                                        case 15:
                                                                            if (iCardinality != -1) {
                                                                                serializer(iCardinality, byteBufferOrder2);
                                                                                iPosition = i19;
                                                                            } else {
                                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Header format error: kEmptyStream must appear before kEmptyFile");
                                                                            }
                                                                            break;
                                                                        case 16:
                                                                            if (iCardinality != -1) {
                                                                                serializer(iCardinality, byteBufferOrder2);
                                                                                iPosition = i19;
                                                                            } else {
                                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Header format error: kEmptyStream must appear before kAnti");
                                                                            }
                                                                            break;
                                                                        case 17:
                                                                            if (write(byteBufferOrder2) == 0) {
                                                                                iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer2 - 1, "file names length");
                                                                                if ((iRemoteActionCompatParcelizer2 & 1) == 0) {
                                                                                    i21 = 0;
                                                                                    while (i20 < iRemoteActionCompatParcelizer2) {
                                                                                        RemoteActionCompatParcelizer(2, byteBufferOrder2);
                                                                                        if (byteBufferOrder2.getChar() == 0) {
                                                                                            i21++;
                                                                                        }
                                                                                    }
                                                                                    if (i21 == getorderid.serializer) {
                                                                                        iPosition = i19;
                                                                                    } else {
                                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(af$$ExternalSyntheticOutline0.m(getorderid.serializer, ")", ff$$ExternalSyntheticOutline0.m(i21, "Invalid number of file names (", " instead of ")));
                                                                                    }
                                                                                } else {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("File names length invalid");
                                                                                }
                                                                            } else {
                                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                                            }
                                                                            break;
                                                                        case 18:
                                                                            iCardinality2 = write(getorderid.serializer, byteBufferOrder2).cardinality();
                                                                            if (write(byteBufferOrder2) == 0) {
                                                                                j3 = iCardinality2 * 8;
                                                                                if (serializer(j3, byteBufferOrder2) >= j3) {
                                                                                    iPosition = i19;
                                                                                } else {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid creation dates size");
                                                                                }
                                                                            } else {
                                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                                            }
                                                                            break;
                                                                        case 19:
                                                                            iCardinality3 = write(getorderid.serializer, byteBufferOrder2).cardinality();
                                                                            if (write(byteBufferOrder2) == 0) {
                                                                                j4 = iCardinality3 * 8;
                                                                                if (serializer(j4, byteBufferOrder2) >= j4) {
                                                                                    iPosition = i19;
                                                                                } else {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid access dates size");
                                                                                }
                                                                            } else {
                                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                                            }
                                                                            break;
                                                                        case 20:
                                                                            iCardinality4 = write(getorderid.serializer, byteBufferOrder2).cardinality();
                                                                            if (write(byteBufferOrder2) == 0) {
                                                                                j5 = iCardinality4 * 8;
                                                                                if (serializer(j5, byteBufferOrder2) >= j5) {
                                                                                    iPosition = i19;
                                                                                } else {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid modification dates size");
                                                                                }
                                                                            } else {
                                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                                            }
                                                                            break;
                                                                        case 21:
                                                                            iCardinality5 = write(getorderid.serializer, byteBufferOrder2).cardinality();
                                                                            if (write(byteBufferOrder2) == 0) {
                                                                                j6 = iCardinality5 * 4;
                                                                                if (serializer(j6, byteBufferOrder2) >= j6) {
                                                                                    iPosition = i19;
                                                                                } else {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid windows attributes size");
                                                                                }
                                                                            } else {
                                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                                            }
                                                                            break;
                                                                        case 22:
                                                                        case 23:
                                                                        default:
                                                                            if (serializer(jRemoteActionCompatParcelizer2, byteBufferOrder2) >= jRemoteActionCompatParcelizer2) {
                                                                                iPosition = i19;
                                                                            } else {
                                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite5, "Incomplete property of type "));
                                                                            }
                                                                            break;
                                                                        case 24:
                                                                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("kStartPos is unsupported, please report");
                                                                            break;
                                                                        case 25:
                                                                            if (serializer(jRemoteActionCompatParcelizer2, byteBufferOrder2) >= jRemoteActionCompatParcelizer2) {
                                                                                iPosition = i19;
                                                                            } else {
                                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Incomplete kDummy property");
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                            i3 = iPosition;
                                                            if (iWrite == 0) {
                                                                getorderid.write(i23);
                                                                byteBufferOrder2.position(i3);
                                                                iWrite2 = write(byteBufferOrder2);
                                                                if (iWrite2 == 2) {
                                                                    while (iWrite4 != 0) {
                                                                        int iRemoteActionCompatParcelizer6 = (int) RemoteActionCompatParcelizer(byteBufferOrder2);
                                                                        RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer6, byteBufferOrder2);
                                                                        byteBufferOrder2.get(new byte[iRemoteActionCompatParcelizer6]);
                                                                    }
                                                                    iWrite2 = write(byteBufferOrder2);
                                                                }
                                                                if (iWrite2 != 3) {
                                                                    if (iWrite2 == 4) {
                                                                        RemoteActionCompatParcelizer(byteBufferOrder2, foodoraPermissionDeniedException);
                                                                        iWrite2 = write(byteBufferOrder2);
                                                                    }
                                                                    if (iWrite2 == 5) {
                                                                        iRemoteActionCompatParcelizer = (int) RemoteActionCompatParcelizer(byteBufferOrder2);
                                                                        linkedHashMap = new LinkedHashMap();
                                                                        bitSetSerializer = null;
                                                                        bitSetSerializer2 = null;
                                                                        bitSetSerializer3 = null;
                                                                        while (true) {
                                                                            iWrite3 = write(byteBufferOrder2);
                                                                            if (iWrite3 == 0) {
                                                                                i5 = 0;
                                                                                i6 = 0;
                                                                                while (i4 < iRemoteActionCompatParcelizer) {
                                                                                    pushDataType = (PushDataType) linkedHashMap.get(Integer.valueOf(i4));
                                                                                    if (pushDataType != null) {
                                                                                        if (bitSetSerializer2 == null) {
                                                                                            z = true;
                                                                                        } else {
                                                                                            z = true;
                                                                                        }
                                                                                        pushDataType.MediaDescriptionCompat = z;
                                                                                        if (z) {
                                                                                            r8lambdadeozq815xuuwmllyyvm_qv79qy = foodoraPermissionDeniedException.MediaBrowserCompatMediaItem;
                                                                                            if (r8lambdadeozq815xuuwmllyyvm_qv79qy != null) {
                                                                                                pushDataType.MediaSessionCompatToken = false;
                                                                                                pushDataType.PlaybackStateCompat = false;
                                                                                                pushDataType.MediaSessionCompatQueueItem = ((BitSet) r8lambdadeozq815xuuwmllyyvm_qv79qy.write).get(i6);
                                                                                                r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy4 = foodoraPermissionDeniedException.MediaBrowserCompatMediaItem;
                                                                                                pushDataType.write = ((long[]) r8lambdadeozq815xuuwmllyyvm_qv79qy4.serializer)[i6];
                                                                                                j2 = ((long[]) r8lambdadeozq815xuuwmllyyvm_qv79qy4.RemoteActionCompatParcelizer)[i6];
                                                                                                pushDataType.ResultReceiver = j2;
                                                                                                if (j2 >= 0) {
                                                                                                    i6++;
                                                                                                } else {
                                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("broken archive, entry with negative size");
                                                                                                }
                                                                                            } else {
                                                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Archive contains file with streams but no subStreamsInfo");
                                                                                            }
                                                                                        } else {
                                                                                            if (bitSetSerializer == null) {
                                                                                                z2 = true;
                                                                                            } else {
                                                                                                z2 = true;
                                                                                            }
                                                                                            pushDataType.MediaSessionCompatToken = z2;
                                                                                            if (bitSetSerializer3 == null) {
                                                                                                z3 = false;
                                                                                            } else {
                                                                                                z3 = false;
                                                                                            }
                                                                                            pushDataType.PlaybackStateCompat = z3;
                                                                                            pushDataType.MediaSessionCompatQueueItem = false;
                                                                                            pushDataType.ResultReceiver = 0L;
                                                                                            i5++;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                j = 0;
                                                                                foodoraPermissionDeniedException.IconCompatParcelizer = (PushDataType[]) linkedHashMap.values().stream().filter(new Predicate() { // from class: o.PushNotificationData
                                                                                    @Override // java.util.function.Predicate
                                                                                    public final boolean test(Object obj) {
                                                                                        return Objects.nonNull((PushDataType) obj);
                                                                                    }
                                                                                }).toArray(new IntFunction() { // from class: o.getFwFDataQueries
                                                                                    @Override // java.util.function.IntFunction
                                                                                    public final Object apply(int i211) {
                                                                                        return new PushDataType[i211];
                                                                                    }
                                                                                });
                                                                                length = foodoraPermissionDeniedException.read.length;
                                                                                r5 = new int[length];
                                                                                length2 = 0;
                                                                                while (i7 < length) {
                                                                                    r5[i7] = length2;
                                                                                    length2 += foodoraPermissionDeniedException.read[i7].RatingCompat.length;
                                                                                }
                                                                                length3 = foodoraPermissionDeniedException.MediaDescriptionCompat.length;
                                                                                jArr = new long[length3];
                                                                                while (i8 < length3) {
                                                                                    jArr[i8] = j;
                                                                                    j += foodoraPermissionDeniedException.MediaDescriptionCompat[i8];
                                                                                }
                                                                                iArr = new int[length];
                                                                                iArr2 = new int[foodoraPermissionDeniedException.IconCompatParcelizer.length];
                                                                                i9 = 0;
                                                                                i10 = 0;
                                                                                i11 = 0;
                                                                                while (true) {
                                                                                    pushDataTypeArr = foodoraPermissionDeniedException.IconCompatParcelizer;
                                                                                    if (i11 < pushDataTypeArr.length) {
                                                                                        if (pushDataTypeArr[i11].MediaDescriptionCompat) {
                                                                                            if (i9 == 0) {
                                                                                                while (true) {
                                                                                                    sharedPreferencesManagerImplArr = foodoraPermissionDeniedException.read;
                                                                                                    if (i10 < sharedPreferencesManagerImplArr.length) {
                                                                                                        iArr[i10] = i11;
                                                                                                        if (sharedPreferencesManagerImplArr[i10].MediaDescriptionCompat <= 0) {
                                                                                                            i10++;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (i10 >= sharedPreferencesManagerImplArr.length) {
                                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Too few folders in archive");
                                                                                                }
                                                                                            }
                                                                                            iArr2[i11] = i10;
                                                                                            if (!foodoraPermissionDeniedException.IconCompatParcelizer[i11].MediaDescriptionCompat) {
                                                                                                i10++;
                                                                                                i9 = 0;
                                                                                            }
                                                                                        } else {
                                                                                            if (i9 == 0) {
                                                                                                while (true) {
                                                                                                    sharedPreferencesManagerImplArr = foodoraPermissionDeniedException.read;
                                                                                                    if (i10 < sharedPreferencesManagerImplArr.length) {
                                                                                                        iArr[i10] = i11;
                                                                                                        if (sharedPreferencesManagerImplArr[i10].MediaDescriptionCompat <= 0) {
                                                                                                            i10++;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (i10 >= sharedPreferencesManagerImplArr.length) {
                                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Too few folders in archive");
                                                                                                }
                                                                                            }
                                                                                            iArr2[i11] = i10;
                                                                                            if (!foodoraPermissionDeniedException.IconCompatParcelizer[i11].MediaDescriptionCompat) {
                                                                                                i10++;
                                                                                                i9 = 0;
                                                                                            }
                                                                                        }
                                                                                        i11++;
                                                                                    } else {
                                                                                        foodoraPermissionDeniedException.MediaMetadataCompat = new isContentCardsUnreadVisualIndicatorEnabled(r5, jArr, iArr, iArr2, 20);
                                                                                        write(byteBufferOrder2);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(byteBufferOrder2);
                                                                                if (iWrite3 != 25) {
                                                                                    switch (iWrite3) {
                                                                                        case 14:
                                                                                            bitSetSerializer2 = serializer(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                            break;
                                                                                        case 15:
                                                                                            bitSetSerializer = serializer(bitSetSerializer2.cardinality(), byteBufferOrder2);
                                                                                            break;
                                                                                        case 16:
                                                                                            bitSetSerializer3 = serializer(bitSetSerializer2.cardinality(), byteBufferOrder2);
                                                                                            break;
                                                                                        case 17:
                                                                                            write(byteBufferOrder2);
                                                                                            i12 = (int) (jRemoteActionCompatParcelizer - 1);
                                                                                            bArr2 = new byte[i12];
                                                                                            RemoteActionCompatParcelizer(i12, byteBufferOrder2);
                                                                                            byteBufferOrder2.get(bArr2);
                                                                                            int i211 = 0;
                                                                                            i14 = 0;
                                                                                            while (i13 < i12) {
                                                                                                if (bArr2[i13] != 0) {
                                                                                                }
                                                                                            }
                                                                                            if (i14 == i12) {
                                                                                            }
                                                                                            break;
                                                                                        case 18:
                                                                                            bitSetWrite = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                            write(byteBufferOrder2);
                                                                                            while (i15 < iRemoteActionCompatParcelizer) {
                                                                                                RemoteActionCompatParcelizer(linkedHashMap, i15);
                                                                                                pushDataType2 = (PushDataType) linkedHashMap.get(Integer.valueOf(i15));
                                                                                                z4 = bitSetWrite.get(i15);
                                                                                                pushDataType2.RatingCompat = z4;
                                                                                                if (z4) {
                                                                                                    RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                                    pushDataType2.RemoteActionCompatParcelizer = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 19:
                                                                                            bitSetWrite2 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                            write(byteBufferOrder2);
                                                                                            while (i16 < iRemoteActionCompatParcelizer) {
                                                                                                RemoteActionCompatParcelizer(linkedHashMap, i16);
                                                                                                pushDataType3 = (PushDataType) linkedHashMap.get(Integer.valueOf(i16));
                                                                                                z5 = bitSetWrite2.get(i16);
                                                                                                pushDataType3.MediaMetadataCompat = z5;
                                                                                                if (z5) {
                                                                                                    RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                                    pushDataType3.IconCompatParcelizer = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 20:
                                                                                            bitSetWrite3 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                            write(byteBufferOrder2);
                                                                                            while (i17 < iRemoteActionCompatParcelizer) {
                                                                                                RemoteActionCompatParcelizer(linkedHashMap, i17);
                                                                                                pushDataType4 = (PushDataType) linkedHashMap.get(Integer.valueOf(i17));
                                                                                                z6 = bitSetWrite3.get(i17);
                                                                                                pushDataType4.MediaBrowserCompatMediaItem = z6;
                                                                                                if (z6) {
                                                                                                    RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                                    pushDataType4.ParcelableVolumeInfo = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 21:
                                                                                            bitSetWrite4 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                            write(byteBufferOrder2);
                                                                                            while (i18 < iRemoteActionCompatParcelizer) {
                                                                                                RemoteActionCompatParcelizer(linkedHashMap, i18);
                                                                                                pushDataType5 = (PushDataType) linkedHashMap.get(Integer.valueOf(i18));
                                                                                                z7 = bitSetWrite4.get(i18);
                                                                                                pushDataType5.PlaybackStateCompatCustomAction = z7;
                                                                                                if (z7) {
                                                                                                    RemoteActionCompatParcelizer(i, byteBufferOrder2);
                                                                                                    pushDataType5.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = byteBufferOrder2.getInt();
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            serializer(jRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    serializer(jRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                }
                                                                                i = 4;
                                                                                i2 = 8;
                                                                            }
                                                                        }
                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Error parsing file names");
                                                                    }
                                                                    foodoraPermissionDeniedException.MediaBrowserCompatMediaItem = null;
                                                                    return foodoraPermissionDeniedException;
                                                                }
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Additional streams unsupported");
                                                            } else {
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite, "Badly terminated header, found "));
                                                            }
                                                        } else {
                                                            i3 = iPosition;
                                                            if (iWrite == 0) {
                                                                getorderid.write(i23);
                                                                byteBufferOrder2.position(i3);
                                                                iWrite2 = write(byteBufferOrder2);
                                                                if (iWrite2 == 2) {
                                                                    while (iWrite4 != 0) {
                                                                        int iRemoteActionCompatParcelizer7 = (int) RemoteActionCompatParcelizer(byteBufferOrder2);
                                                                        RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer7, byteBufferOrder2);
                                                                        byteBufferOrder2.get(new byte[iRemoteActionCompatParcelizer7]);
                                                                    }
                                                                    iWrite2 = write(byteBufferOrder2);
                                                                }
                                                                if (iWrite2 != 3) {
                                                                    if (iWrite2 == 4) {
                                                                        RemoteActionCompatParcelizer(byteBufferOrder2, foodoraPermissionDeniedException);
                                                                        iWrite2 = write(byteBufferOrder2);
                                                                    }
                                                                    if (iWrite2 == 5) {
                                                                        iRemoteActionCompatParcelizer = (int) RemoteActionCompatParcelizer(byteBufferOrder2);
                                                                        linkedHashMap = new LinkedHashMap();
                                                                        bitSetSerializer = null;
                                                                        bitSetSerializer2 = null;
                                                                        bitSetSerializer3 = null;
                                                                        while (true) {
                                                                            iWrite3 = write(byteBufferOrder2);
                                                                            if (iWrite3 == 0) {
                                                                                i5 = 0;
                                                                                i6 = 0;
                                                                                while (i4 < iRemoteActionCompatParcelizer) {
                                                                                    pushDataType = (PushDataType) linkedHashMap.get(Integer.valueOf(i4));
                                                                                    if (pushDataType != null) {
                                                                                        if (bitSetSerializer2 == null) {
                                                                                            z = true;
                                                                                        } else {
                                                                                            z = true;
                                                                                        }
                                                                                        pushDataType.MediaDescriptionCompat = z;
                                                                                        if (z) {
                                                                                            r8lambdadeozq815xuuwmllyyvm_qv79qy = foodoraPermissionDeniedException.MediaBrowserCompatMediaItem;
                                                                                            if (r8lambdadeozq815xuuwmllyyvm_qv79qy != null) {
                                                                                                pushDataType.MediaSessionCompatToken = false;
                                                                                                pushDataType.PlaybackStateCompat = false;
                                                                                                pushDataType.MediaSessionCompatQueueItem = ((BitSet) r8lambdadeozq815xuuwmllyyvm_qv79qy.write).get(i6);
                                                                                                r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy5 = foodoraPermissionDeniedException.MediaBrowserCompatMediaItem;
                                                                                                pushDataType.write = ((long[]) r8lambdadeozq815xuuwmllyyvm_qv79qy5.serializer)[i6];
                                                                                                j2 = ((long[]) r8lambdadeozq815xuuwmllyyvm_qv79qy5.RemoteActionCompatParcelizer)[i6];
                                                                                                pushDataType.ResultReceiver = j2;
                                                                                                if (j2 >= 0) {
                                                                                                    i6++;
                                                                                                } else {
                                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("broken archive, entry with negative size");
                                                                                                }
                                                                                            } else {
                                                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Archive contains file with streams but no subStreamsInfo");
                                                                                            }
                                                                                        } else {
                                                                                            if (bitSetSerializer == null) {
                                                                                                z2 = true;
                                                                                            } else {
                                                                                                z2 = true;
                                                                                            }
                                                                                            pushDataType.MediaSessionCompatToken = z2;
                                                                                            if (bitSetSerializer3 == null) {
                                                                                                z3 = false;
                                                                                            } else {
                                                                                                z3 = false;
                                                                                            }
                                                                                            pushDataType.PlaybackStateCompat = z3;
                                                                                            pushDataType.MediaSessionCompatQueueItem = false;
                                                                                            pushDataType.ResultReceiver = 0L;
                                                                                            i5++;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                j = 0;
                                                                                foodoraPermissionDeniedException.IconCompatParcelizer = (PushDataType[]) linkedHashMap.values().stream().filter(new Predicate() { // from class: o.PushNotificationData
                                                                                    @Override // java.util.function.Predicate
                                                                                    public final boolean test(Object obj) {
                                                                                        return Objects.nonNull((PushDataType) obj);
                                                                                    }
                                                                                }).toArray(new IntFunction() { // from class: o.getFwFDataQueries
                                                                                    @Override // java.util.function.IntFunction
                                                                                    public final Object apply(int i212) {
                                                                                        return new PushDataType[i212];
                                                                                    }
                                                                                });
                                                                                length = foodoraPermissionDeniedException.read.length;
                                                                                r5 = new int[length];
                                                                                length2 = 0;
                                                                                while (i7 < length) {
                                                                                    r5[i7] = length2;
                                                                                    length2 += foodoraPermissionDeniedException.read[i7].RatingCompat.length;
                                                                                }
                                                                                length3 = foodoraPermissionDeniedException.MediaDescriptionCompat.length;
                                                                                jArr = new long[length3];
                                                                                while (i8 < length3) {
                                                                                    jArr[i8] = j;
                                                                                    j += foodoraPermissionDeniedException.MediaDescriptionCompat[i8];
                                                                                }
                                                                                iArr = new int[length];
                                                                                iArr2 = new int[foodoraPermissionDeniedException.IconCompatParcelizer.length];
                                                                                i9 = 0;
                                                                                i10 = 0;
                                                                                i11 = 0;
                                                                                while (true) {
                                                                                    pushDataTypeArr = foodoraPermissionDeniedException.IconCompatParcelizer;
                                                                                    if (i11 < pushDataTypeArr.length) {
                                                                                        if (pushDataTypeArr[i11].MediaDescriptionCompat) {
                                                                                            if (i9 == 0) {
                                                                                                while (true) {
                                                                                                    sharedPreferencesManagerImplArr = foodoraPermissionDeniedException.read;
                                                                                                    if (i10 < sharedPreferencesManagerImplArr.length) {
                                                                                                        iArr[i10] = i11;
                                                                                                        if (sharedPreferencesManagerImplArr[i10].MediaDescriptionCompat <= 0) {
                                                                                                            i10++;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (i10 >= sharedPreferencesManagerImplArr.length) {
                                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Too few folders in archive");
                                                                                                }
                                                                                            }
                                                                                            iArr2[i11] = i10;
                                                                                            if (!foodoraPermissionDeniedException.IconCompatParcelizer[i11].MediaDescriptionCompat) {
                                                                                                i10++;
                                                                                                i9 = 0;
                                                                                            }
                                                                                        } else {
                                                                                            if (i9 == 0) {
                                                                                                while (true) {
                                                                                                    sharedPreferencesManagerImplArr = foodoraPermissionDeniedException.read;
                                                                                                    if (i10 < sharedPreferencesManagerImplArr.length) {
                                                                                                        iArr[i10] = i11;
                                                                                                        if (sharedPreferencesManagerImplArr[i10].MediaDescriptionCompat <= 0) {
                                                                                                            i10++;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (i10 >= sharedPreferencesManagerImplArr.length) {
                                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Too few folders in archive");
                                                                                                }
                                                                                            }
                                                                                            iArr2[i11] = i10;
                                                                                            if (!foodoraPermissionDeniedException.IconCompatParcelizer[i11].MediaDescriptionCompat) {
                                                                                                i10++;
                                                                                                i9 = 0;
                                                                                            }
                                                                                        }
                                                                                        i11++;
                                                                                    } else {
                                                                                        foodoraPermissionDeniedException.MediaMetadataCompat = new isContentCardsUnreadVisualIndicatorEnabled(r5, jArr, iArr, iArr2, 20);
                                                                                        write(byteBufferOrder2);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(byteBufferOrder2);
                                                                                if (iWrite3 != 25) {
                                                                                    switch (iWrite3) {
                                                                                        case 14:
                                                                                            bitSetSerializer2 = serializer(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                            break;
                                                                                        case 15:
                                                                                            bitSetSerializer = serializer(bitSetSerializer2.cardinality(), byteBufferOrder2);
                                                                                            break;
                                                                                        case 16:
                                                                                            bitSetSerializer3 = serializer(bitSetSerializer2.cardinality(), byteBufferOrder2);
                                                                                            break;
                                                                                        case 17:
                                                                                            write(byteBufferOrder2);
                                                                                            i12 = (int) (jRemoteActionCompatParcelizer - 1);
                                                                                            bArr2 = new byte[i12];
                                                                                            RemoteActionCompatParcelizer(i12, byteBufferOrder2);
                                                                                            byteBufferOrder2.get(bArr2);
                                                                                            int i212 = 0;
                                                                                            i14 = 0;
                                                                                            while (i13 < i12) {
                                                                                                if (bArr2[i13] != 0) {
                                                                                                }
                                                                                            }
                                                                                            if (i14 == i12) {
                                                                                            }
                                                                                            break;
                                                                                        case 18:
                                                                                            bitSetWrite = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                            write(byteBufferOrder2);
                                                                                            while (i15 < iRemoteActionCompatParcelizer) {
                                                                                                RemoteActionCompatParcelizer(linkedHashMap, i15);
                                                                                                pushDataType2 = (PushDataType) linkedHashMap.get(Integer.valueOf(i15));
                                                                                                z4 = bitSetWrite.get(i15);
                                                                                                pushDataType2.RatingCompat = z4;
                                                                                                if (z4) {
                                                                                                    RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                                    pushDataType2.RemoteActionCompatParcelizer = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 19:
                                                                                            bitSetWrite2 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                            write(byteBufferOrder2);
                                                                                            while (i16 < iRemoteActionCompatParcelizer) {
                                                                                                RemoteActionCompatParcelizer(linkedHashMap, i16);
                                                                                                pushDataType3 = (PushDataType) linkedHashMap.get(Integer.valueOf(i16));
                                                                                                z5 = bitSetWrite2.get(i16);
                                                                                                pushDataType3.MediaMetadataCompat = z5;
                                                                                                if (z5) {
                                                                                                    RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                                    pushDataType3.IconCompatParcelizer = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 20:
                                                                                            bitSetWrite3 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                            write(byteBufferOrder2);
                                                                                            while (i17 < iRemoteActionCompatParcelizer) {
                                                                                                RemoteActionCompatParcelizer(linkedHashMap, i17);
                                                                                                pushDataType4 = (PushDataType) linkedHashMap.get(Integer.valueOf(i17));
                                                                                                z6 = bitSetWrite3.get(i17);
                                                                                                pushDataType4.MediaBrowserCompatMediaItem = z6;
                                                                                                if (z6) {
                                                                                                    RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                                    pushDataType4.ParcelableVolumeInfo = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 21:
                                                                                            bitSetWrite4 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                            write(byteBufferOrder2);
                                                                                            while (i18 < iRemoteActionCompatParcelizer) {
                                                                                                RemoteActionCompatParcelizer(linkedHashMap, i18);
                                                                                                pushDataType5 = (PushDataType) linkedHashMap.get(Integer.valueOf(i18));
                                                                                                z7 = bitSetWrite4.get(i18);
                                                                                                pushDataType5.PlaybackStateCompatCustomAction = z7;
                                                                                                if (z7) {
                                                                                                    RemoteActionCompatParcelizer(i, byteBufferOrder2);
                                                                                                    pushDataType5.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = byteBufferOrder2.getInt();
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            serializer(jRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    serializer(jRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                }
                                                                                i = 4;
                                                                                i2 = 8;
                                                                            }
                                                                        }
                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Error parsing file names");
                                                                    }
                                                                    foodoraPermissionDeniedException.MediaBrowserCompatMediaItem = null;
                                                                    return foodoraPermissionDeniedException;
                                                                }
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Additional streams unsupported");
                                                            } else {
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite, "Badly terminated header, found "));
                                                            }
                                                        }
                                                    } else {
                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Additional streams unsupported");
                                                    }
                                                } else {
                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Broken or unsupported archive: no Header");
                                                }
                                            } else {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("premature end of stream");
                                            }
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("no packed streams, can't read encoded header");
                                        }
                                    } else {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("no folders, can't read encoded header");
                                    }
                                } else if (iWrite7 == 1) {
                                    iPosition = byteBufferOrder2.position();
                                    getorderid = new getOrderID();
                                    iWrite = write(byteBufferOrder2);
                                    if (iWrite == 2) {
                                        while (iWrite6 != 0) {
                                            jRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(byteBufferOrder2), "propertySize");
                                            if (serializer(jRemoteActionCompatParcelizer3, byteBufferOrder2) >= jRemoteActionCompatParcelizer3) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid property size");
                                            }
                                        }
                                        iWrite = write(byteBufferOrder2);
                                        if (iWrite != 3) {
                                            i = 4;
                                            if (iWrite == 4) {
                                                write(byteBufferOrder2, getorderid);
                                                iWrite = write(byteBufferOrder2);
                                            }
                                            i2 = 8;
                                            if (iWrite == 5) {
                                                getorderid.serializer = RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(byteBufferOrder2), "numFiles");
                                                iCardinality = -1;
                                                while (true) {
                                                    iWrite5 = write(byteBufferOrder2);
                                                    if (iWrite5 == 0) {
                                                        getorderid.write = getorderid.serializer - Math.max(iCardinality, 0);
                                                        iWrite = write(byteBufferOrder2);
                                                    } else {
                                                        i19 = iPosition;
                                                        jRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(byteBufferOrder2);
                                                        switch (iWrite5) {
                                                            case 14:
                                                                iCardinality = serializer(getorderid.serializer, byteBufferOrder2).cardinality();
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                iPosition = i19;
                                                                break;
                                                            case 15:
                                                                if (iCardinality != -1) {
                                                                    serializer(iCardinality, byteBufferOrder2);
                                                                    iPosition = i19;
                                                                } else {
                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Header format error: kEmptyStream must appear before kEmptyFile");
                                                                }
                                                                break;
                                                            case 16:
                                                                if (iCardinality != -1) {
                                                                    serializer(iCardinality, byteBufferOrder2);
                                                                    iPosition = i19;
                                                                } else {
                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Header format error: kEmptyStream must appear before kAnti");
                                                                }
                                                                break;
                                                            case 17:
                                                                if (write(byteBufferOrder2) == 0) {
                                                                    iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer2 - 1, "file names length");
                                                                    if ((iRemoteActionCompatParcelizer2 & 1) == 0) {
                                                                        i21 = 0;
                                                                        while (i20 < iRemoteActionCompatParcelizer2) {
                                                                            RemoteActionCompatParcelizer(2, byteBufferOrder2);
                                                                            if (byteBufferOrder2.getChar() == 0) {
                                                                                i21++;
                                                                            }
                                                                        }
                                                                        if (i21 == getorderid.serializer) {
                                                                            iPosition = i19;
                                                                        } else {
                                                                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(af$$ExternalSyntheticOutline0.m(getorderid.serializer, ")", ff$$ExternalSyntheticOutline0.m(i21, "Invalid number of file names (", " instead of ")));
                                                                        }
                                                                    } else {
                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("File names length invalid");
                                                                    }
                                                                } else {
                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                                }
                                                                break;
                                                            case 18:
                                                                iCardinality2 = write(getorderid.serializer, byteBufferOrder2).cardinality();
                                                                if (write(byteBufferOrder2) == 0) {
                                                                    j3 = iCardinality2 * 8;
                                                                    if (serializer(j3, byteBufferOrder2) >= j3) {
                                                                        iPosition = i19;
                                                                    } else {
                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid creation dates size");
                                                                    }
                                                                } else {
                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                                }
                                                                break;
                                                            case 19:
                                                                iCardinality3 = write(getorderid.serializer, byteBufferOrder2).cardinality();
                                                                if (write(byteBufferOrder2) == 0) {
                                                                    j4 = iCardinality3 * 8;
                                                                    if (serializer(j4, byteBufferOrder2) >= j4) {
                                                                        iPosition = i19;
                                                                    } else {
                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid access dates size");
                                                                    }
                                                                } else {
                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                                }
                                                                break;
                                                            case 20:
                                                                iCardinality4 = write(getorderid.serializer, byteBufferOrder2).cardinality();
                                                                if (write(byteBufferOrder2) == 0) {
                                                                    j5 = iCardinality4 * 8;
                                                                    if (serializer(j5, byteBufferOrder2) >= j5) {
                                                                        iPosition = i19;
                                                                    } else {
                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid modification dates size");
                                                                    }
                                                                } else {
                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                                }
                                                                break;
                                                            case 21:
                                                                iCardinality5 = write(getorderid.serializer, byteBufferOrder2).cardinality();
                                                                if (write(byteBufferOrder2) == 0) {
                                                                    j6 = iCardinality5 * 4;
                                                                    if (serializer(j6, byteBufferOrder2) >= j6) {
                                                                        iPosition = i19;
                                                                    } else {
                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid windows attributes size");
                                                                    }
                                                                } else {
                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                                }
                                                                break;
                                                            case 22:
                                                            case 23:
                                                            default:
                                                                if (serializer(jRemoteActionCompatParcelizer2, byteBufferOrder2) >= jRemoteActionCompatParcelizer2) {
                                                                    iPosition = i19;
                                                                } else {
                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite5, "Incomplete property of type "));
                                                                }
                                                                break;
                                                            case 24:
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("kStartPos is unsupported, please report");
                                                                break;
                                                            case 25:
                                                                if (serializer(jRemoteActionCompatParcelizer2, byteBufferOrder2) >= jRemoteActionCompatParcelizer2) {
                                                                    iPosition = i19;
                                                                } else {
                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Incomplete kDummy property");
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }
                                                i3 = iPosition;
                                                if (iWrite == 0) {
                                                    getorderid.write(i23);
                                                    byteBufferOrder2.position(i3);
                                                    iWrite2 = write(byteBufferOrder2);
                                                    if (iWrite2 == 2) {
                                                        while (iWrite4 != 0) {
                                                            int iRemoteActionCompatParcelizer8 = (int) RemoteActionCompatParcelizer(byteBufferOrder2);
                                                            RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer8, byteBufferOrder2);
                                                            byteBufferOrder2.get(new byte[iRemoteActionCompatParcelizer8]);
                                                        }
                                                        iWrite2 = write(byteBufferOrder2);
                                                    }
                                                    if (iWrite2 != 3) {
                                                        if (iWrite2 == 4) {
                                                            RemoteActionCompatParcelizer(byteBufferOrder2, foodoraPermissionDeniedException);
                                                            iWrite2 = write(byteBufferOrder2);
                                                        }
                                                        if (iWrite2 == 5) {
                                                            iRemoteActionCompatParcelizer = (int) RemoteActionCompatParcelizer(byteBufferOrder2);
                                                            linkedHashMap = new LinkedHashMap();
                                                            bitSetSerializer = null;
                                                            bitSetSerializer2 = null;
                                                            bitSetSerializer3 = null;
                                                            while (true) {
                                                                iWrite3 = write(byteBufferOrder2);
                                                                if (iWrite3 == 0) {
                                                                    i5 = 0;
                                                                    i6 = 0;
                                                                    while (i4 < iRemoteActionCompatParcelizer) {
                                                                        pushDataType = (PushDataType) linkedHashMap.get(Integer.valueOf(i4));
                                                                        if (pushDataType != null) {
                                                                            if (bitSetSerializer2 == null) {
                                                                                z = true;
                                                                            } else {
                                                                                z = true;
                                                                            }
                                                                            pushDataType.MediaDescriptionCompat = z;
                                                                            if (z) {
                                                                                r8lambdadeozq815xuuwmllyyvm_qv79qy = foodoraPermissionDeniedException.MediaBrowserCompatMediaItem;
                                                                                if (r8lambdadeozq815xuuwmllyyvm_qv79qy != null) {
                                                                                    pushDataType.MediaSessionCompatToken = false;
                                                                                    pushDataType.PlaybackStateCompat = false;
                                                                                    pushDataType.MediaSessionCompatQueueItem = ((BitSet) r8lambdadeozq815xuuwmllyyvm_qv79qy.write).get(i6);
                                                                                    r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy6 = foodoraPermissionDeniedException.MediaBrowserCompatMediaItem;
                                                                                    pushDataType.write = ((long[]) r8lambdadeozq815xuuwmllyyvm_qv79qy6.serializer)[i6];
                                                                                    j2 = ((long[]) r8lambdadeozq815xuuwmllyyvm_qv79qy6.RemoteActionCompatParcelizer)[i6];
                                                                                    pushDataType.ResultReceiver = j2;
                                                                                    if (j2 >= 0) {
                                                                                        i6++;
                                                                                    } else {
                                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("broken archive, entry with negative size");
                                                                                    }
                                                                                } else {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Archive contains file with streams but no subStreamsInfo");
                                                                                }
                                                                            } else {
                                                                                if (bitSetSerializer == null) {
                                                                                    z2 = true;
                                                                                } else {
                                                                                    z2 = true;
                                                                                }
                                                                                pushDataType.MediaSessionCompatToken = z2;
                                                                                if (bitSetSerializer3 == null) {
                                                                                    z3 = false;
                                                                                } else {
                                                                                    z3 = false;
                                                                                }
                                                                                pushDataType.PlaybackStateCompat = z3;
                                                                                pushDataType.MediaSessionCompatQueueItem = false;
                                                                                pushDataType.ResultReceiver = 0L;
                                                                                i5++;
                                                                            }
                                                                        }
                                                                    }
                                                                    j = 0;
                                                                    foodoraPermissionDeniedException.IconCompatParcelizer = (PushDataType[]) linkedHashMap.values().stream().filter(new Predicate() { // from class: o.PushNotificationData
                                                                        @Override // java.util.function.Predicate
                                                                        public final boolean test(Object obj) {
                                                                            return Objects.nonNull((PushDataType) obj);
                                                                        }
                                                                    }).toArray(new IntFunction() { // from class: o.getFwFDataQueries
                                                                        @Override // java.util.function.IntFunction
                                                                        public final Object apply(int i213) {
                                                                            return new PushDataType[i213];
                                                                        }
                                                                    });
                                                                    length = foodoraPermissionDeniedException.read.length;
                                                                    r5 = new int[length];
                                                                    length2 = 0;
                                                                    while (i7 < length) {
                                                                        r5[i7] = length2;
                                                                        length2 += foodoraPermissionDeniedException.read[i7].RatingCompat.length;
                                                                    }
                                                                    length3 = foodoraPermissionDeniedException.MediaDescriptionCompat.length;
                                                                    jArr = new long[length3];
                                                                    while (i8 < length3) {
                                                                        jArr[i8] = j;
                                                                        j += foodoraPermissionDeniedException.MediaDescriptionCompat[i8];
                                                                    }
                                                                    iArr = new int[length];
                                                                    iArr2 = new int[foodoraPermissionDeniedException.IconCompatParcelizer.length];
                                                                    i9 = 0;
                                                                    i10 = 0;
                                                                    i11 = 0;
                                                                    while (true) {
                                                                        pushDataTypeArr = foodoraPermissionDeniedException.IconCompatParcelizer;
                                                                        if (i11 < pushDataTypeArr.length) {
                                                                            if (pushDataTypeArr[i11].MediaDescriptionCompat) {
                                                                                if (i9 == 0) {
                                                                                    while (true) {
                                                                                        sharedPreferencesManagerImplArr = foodoraPermissionDeniedException.read;
                                                                                        if (i10 < sharedPreferencesManagerImplArr.length) {
                                                                                            iArr[i10] = i11;
                                                                                            if (sharedPreferencesManagerImplArr[i10].MediaDescriptionCompat <= 0) {
                                                                                                i10++;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (i10 >= sharedPreferencesManagerImplArr.length) {
                                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Too few folders in archive");
                                                                                    }
                                                                                }
                                                                                iArr2[i11] = i10;
                                                                                if (!foodoraPermissionDeniedException.IconCompatParcelizer[i11].MediaDescriptionCompat) {
                                                                                    i10++;
                                                                                    i9 = 0;
                                                                                }
                                                                            } else {
                                                                                if (i9 == 0) {
                                                                                    while (true) {
                                                                                        sharedPreferencesManagerImplArr = foodoraPermissionDeniedException.read;
                                                                                        if (i10 < sharedPreferencesManagerImplArr.length) {
                                                                                            iArr[i10] = i11;
                                                                                            if (sharedPreferencesManagerImplArr[i10].MediaDescriptionCompat <= 0) {
                                                                                                i10++;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (i10 >= sharedPreferencesManagerImplArr.length) {
                                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Too few folders in archive");
                                                                                    }
                                                                                }
                                                                                iArr2[i11] = i10;
                                                                                if (!foodoraPermissionDeniedException.IconCompatParcelizer[i11].MediaDescriptionCompat) {
                                                                                    i10++;
                                                                                    i9 = 0;
                                                                                }
                                                                            }
                                                                            i11++;
                                                                        } else {
                                                                            foodoraPermissionDeniedException.MediaMetadataCompat = new isContentCardsUnreadVisualIndicatorEnabled(r5, jArr, iArr, iArr2, 20);
                                                                            write(byteBufferOrder2);
                                                                        }
                                                                    }
                                                                } else {
                                                                    jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(byteBufferOrder2);
                                                                    if (iWrite3 != 25) {
                                                                        switch (iWrite3) {
                                                                            case 14:
                                                                                bitSetSerializer2 = serializer(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                break;
                                                                            case 15:
                                                                                bitSetSerializer = serializer(bitSetSerializer2.cardinality(), byteBufferOrder2);
                                                                                break;
                                                                            case 16:
                                                                                bitSetSerializer3 = serializer(bitSetSerializer2.cardinality(), byteBufferOrder2);
                                                                                break;
                                                                            case 17:
                                                                                write(byteBufferOrder2);
                                                                                i12 = (int) (jRemoteActionCompatParcelizer - 1);
                                                                                bArr2 = new byte[i12];
                                                                                RemoteActionCompatParcelizer(i12, byteBufferOrder2);
                                                                                byteBufferOrder2.get(bArr2);
                                                                                int i213 = 0;
                                                                                i14 = 0;
                                                                                while (i13 < i12) {
                                                                                    if (bArr2[i13] != 0) {
                                                                                    }
                                                                                }
                                                                                if (i14 == i12) {
                                                                                }
                                                                                break;
                                                                            case 18:
                                                                                bitSetWrite = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                write(byteBufferOrder2);
                                                                                while (i15 < iRemoteActionCompatParcelizer) {
                                                                                    RemoteActionCompatParcelizer(linkedHashMap, i15);
                                                                                    pushDataType2 = (PushDataType) linkedHashMap.get(Integer.valueOf(i15));
                                                                                    z4 = bitSetWrite.get(i15);
                                                                                    pushDataType2.RatingCompat = z4;
                                                                                    if (z4) {
                                                                                        RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                        pushDataType2.RemoteActionCompatParcelizer = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 19:
                                                                                bitSetWrite2 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                write(byteBufferOrder2);
                                                                                while (i16 < iRemoteActionCompatParcelizer) {
                                                                                    RemoteActionCompatParcelizer(linkedHashMap, i16);
                                                                                    pushDataType3 = (PushDataType) linkedHashMap.get(Integer.valueOf(i16));
                                                                                    z5 = bitSetWrite2.get(i16);
                                                                                    pushDataType3.MediaMetadataCompat = z5;
                                                                                    if (z5) {
                                                                                        RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                        pushDataType3.IconCompatParcelizer = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 20:
                                                                                bitSetWrite3 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                write(byteBufferOrder2);
                                                                                while (i17 < iRemoteActionCompatParcelizer) {
                                                                                    RemoteActionCompatParcelizer(linkedHashMap, i17);
                                                                                    pushDataType4 = (PushDataType) linkedHashMap.get(Integer.valueOf(i17));
                                                                                    z6 = bitSetWrite3.get(i17);
                                                                                    pushDataType4.MediaBrowserCompatMediaItem = z6;
                                                                                    if (z6) {
                                                                                        RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                        pushDataType4.ParcelableVolumeInfo = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 21:
                                                                                bitSetWrite4 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                write(byteBufferOrder2);
                                                                                while (i18 < iRemoteActionCompatParcelizer) {
                                                                                    RemoteActionCompatParcelizer(linkedHashMap, i18);
                                                                                    pushDataType5 = (PushDataType) linkedHashMap.get(Integer.valueOf(i18));
                                                                                    z7 = bitSetWrite4.get(i18);
                                                                                    pushDataType5.PlaybackStateCompatCustomAction = z7;
                                                                                    if (z7) {
                                                                                        RemoteActionCompatParcelizer(i, byteBufferOrder2);
                                                                                        pushDataType5.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = byteBufferOrder2.getInt();
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                serializer(jRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        serializer(jRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                    }
                                                                    i = 4;
                                                                    i2 = 8;
                                                                }
                                                            }
                                                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Error parsing file names");
                                                        }
                                                        foodoraPermissionDeniedException.MediaBrowserCompatMediaItem = null;
                                                        return foodoraPermissionDeniedException;
                                                    }
                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Additional streams unsupported");
                                                } else {
                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite, "Badly terminated header, found "));
                                                }
                                            } else {
                                                i3 = iPosition;
                                                if (iWrite == 0) {
                                                    getorderid.write(i23);
                                                    byteBufferOrder2.position(i3);
                                                    iWrite2 = write(byteBufferOrder2);
                                                    if (iWrite2 == 2) {
                                                        while (iWrite4 != 0) {
                                                            int iRemoteActionCompatParcelizer9 = (int) RemoteActionCompatParcelizer(byteBufferOrder2);
                                                            RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer9, byteBufferOrder2);
                                                            byteBufferOrder2.get(new byte[iRemoteActionCompatParcelizer9]);
                                                        }
                                                        iWrite2 = write(byteBufferOrder2);
                                                    }
                                                    if (iWrite2 != 3) {
                                                        if (iWrite2 == 4) {
                                                            RemoteActionCompatParcelizer(byteBufferOrder2, foodoraPermissionDeniedException);
                                                            iWrite2 = write(byteBufferOrder2);
                                                        }
                                                        if (iWrite2 == 5) {
                                                            iRemoteActionCompatParcelizer = (int) RemoteActionCompatParcelizer(byteBufferOrder2);
                                                            linkedHashMap = new LinkedHashMap();
                                                            bitSetSerializer = null;
                                                            bitSetSerializer2 = null;
                                                            bitSetSerializer3 = null;
                                                            while (true) {
                                                                iWrite3 = write(byteBufferOrder2);
                                                                if (iWrite3 == 0) {
                                                                    i5 = 0;
                                                                    i6 = 0;
                                                                    while (i4 < iRemoteActionCompatParcelizer) {
                                                                        pushDataType = (PushDataType) linkedHashMap.get(Integer.valueOf(i4));
                                                                        if (pushDataType != null) {
                                                                            if (bitSetSerializer2 == null) {
                                                                                z = true;
                                                                            } else {
                                                                                z = true;
                                                                            }
                                                                            pushDataType.MediaDescriptionCompat = z;
                                                                            if (z) {
                                                                                r8lambdadeozq815xuuwmllyyvm_qv79qy = foodoraPermissionDeniedException.MediaBrowserCompatMediaItem;
                                                                                if (r8lambdadeozq815xuuwmllyyvm_qv79qy != null) {
                                                                                    pushDataType.MediaSessionCompatToken = false;
                                                                                    pushDataType.PlaybackStateCompat = false;
                                                                                    pushDataType.MediaSessionCompatQueueItem = ((BitSet) r8lambdadeozq815xuuwmllyyvm_qv79qy.write).get(i6);
                                                                                    r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy7 = foodoraPermissionDeniedException.MediaBrowserCompatMediaItem;
                                                                                    pushDataType.write = ((long[]) r8lambdadeozq815xuuwmllyyvm_qv79qy7.serializer)[i6];
                                                                                    j2 = ((long[]) r8lambdadeozq815xuuwmllyyvm_qv79qy7.RemoteActionCompatParcelizer)[i6];
                                                                                    pushDataType.ResultReceiver = j2;
                                                                                    if (j2 >= 0) {
                                                                                        i6++;
                                                                                    } else {
                                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("broken archive, entry with negative size");
                                                                                    }
                                                                                } else {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Archive contains file with streams but no subStreamsInfo");
                                                                                }
                                                                            } else {
                                                                                if (bitSetSerializer == null) {
                                                                                    z2 = true;
                                                                                } else {
                                                                                    z2 = true;
                                                                                }
                                                                                pushDataType.MediaSessionCompatToken = z2;
                                                                                if (bitSetSerializer3 == null) {
                                                                                    z3 = false;
                                                                                } else {
                                                                                    z3 = false;
                                                                                }
                                                                                pushDataType.PlaybackStateCompat = z3;
                                                                                pushDataType.MediaSessionCompatQueueItem = false;
                                                                                pushDataType.ResultReceiver = 0L;
                                                                                i5++;
                                                                            }
                                                                        }
                                                                    }
                                                                    j = 0;
                                                                    foodoraPermissionDeniedException.IconCompatParcelizer = (PushDataType[]) linkedHashMap.values().stream().filter(new Predicate() { // from class: o.PushNotificationData
                                                                        @Override // java.util.function.Predicate
                                                                        public final boolean test(Object obj) {
                                                                            return Objects.nonNull((PushDataType) obj);
                                                                        }
                                                                    }).toArray(new IntFunction() { // from class: o.getFwFDataQueries
                                                                        @Override // java.util.function.IntFunction
                                                                        public final Object apply(int i214) {
                                                                            return new PushDataType[i214];
                                                                        }
                                                                    });
                                                                    length = foodoraPermissionDeniedException.read.length;
                                                                    r5 = new int[length];
                                                                    length2 = 0;
                                                                    while (i7 < length) {
                                                                        r5[i7] = length2;
                                                                        length2 += foodoraPermissionDeniedException.read[i7].RatingCompat.length;
                                                                    }
                                                                    length3 = foodoraPermissionDeniedException.MediaDescriptionCompat.length;
                                                                    jArr = new long[length3];
                                                                    while (i8 < length3) {
                                                                        jArr[i8] = j;
                                                                        j += foodoraPermissionDeniedException.MediaDescriptionCompat[i8];
                                                                    }
                                                                    iArr = new int[length];
                                                                    iArr2 = new int[foodoraPermissionDeniedException.IconCompatParcelizer.length];
                                                                    i9 = 0;
                                                                    i10 = 0;
                                                                    i11 = 0;
                                                                    while (true) {
                                                                        pushDataTypeArr = foodoraPermissionDeniedException.IconCompatParcelizer;
                                                                        if (i11 < pushDataTypeArr.length) {
                                                                            if (pushDataTypeArr[i11].MediaDescriptionCompat) {
                                                                                if (i9 == 0) {
                                                                                    while (true) {
                                                                                        sharedPreferencesManagerImplArr = foodoraPermissionDeniedException.read;
                                                                                        if (i10 < sharedPreferencesManagerImplArr.length) {
                                                                                            iArr[i10] = i11;
                                                                                            if (sharedPreferencesManagerImplArr[i10].MediaDescriptionCompat <= 0) {
                                                                                                i10++;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (i10 >= sharedPreferencesManagerImplArr.length) {
                                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Too few folders in archive");
                                                                                    }
                                                                                }
                                                                                iArr2[i11] = i10;
                                                                                if (!foodoraPermissionDeniedException.IconCompatParcelizer[i11].MediaDescriptionCompat) {
                                                                                    i10++;
                                                                                    i9 = 0;
                                                                                }
                                                                            } else {
                                                                                if (i9 == 0) {
                                                                                    while (true) {
                                                                                        sharedPreferencesManagerImplArr = foodoraPermissionDeniedException.read;
                                                                                        if (i10 < sharedPreferencesManagerImplArr.length) {
                                                                                            iArr[i10] = i11;
                                                                                            if (sharedPreferencesManagerImplArr[i10].MediaDescriptionCompat <= 0) {
                                                                                                i10++;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (i10 >= sharedPreferencesManagerImplArr.length) {
                                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Too few folders in archive");
                                                                                    }
                                                                                }
                                                                                iArr2[i11] = i10;
                                                                                if (!foodoraPermissionDeniedException.IconCompatParcelizer[i11].MediaDescriptionCompat) {
                                                                                    i10++;
                                                                                    i9 = 0;
                                                                                }
                                                                            }
                                                                            i11++;
                                                                        } else {
                                                                            foodoraPermissionDeniedException.MediaMetadataCompat = new isContentCardsUnreadVisualIndicatorEnabled(r5, jArr, iArr, iArr2, 20);
                                                                            write(byteBufferOrder2);
                                                                        }
                                                                    }
                                                                } else {
                                                                    jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(byteBufferOrder2);
                                                                    if (iWrite3 != 25) {
                                                                        switch (iWrite3) {
                                                                            case 14:
                                                                                bitSetSerializer2 = serializer(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                break;
                                                                            case 15:
                                                                                bitSetSerializer = serializer(bitSetSerializer2.cardinality(), byteBufferOrder2);
                                                                                break;
                                                                            case 16:
                                                                                bitSetSerializer3 = serializer(bitSetSerializer2.cardinality(), byteBufferOrder2);
                                                                                break;
                                                                            case 17:
                                                                                write(byteBufferOrder2);
                                                                                i12 = (int) (jRemoteActionCompatParcelizer - 1);
                                                                                bArr2 = new byte[i12];
                                                                                RemoteActionCompatParcelizer(i12, byteBufferOrder2);
                                                                                byteBufferOrder2.get(bArr2);
                                                                                int i214 = 0;
                                                                                i14 = 0;
                                                                                while (i13 < i12) {
                                                                                    if (bArr2[i13] != 0) {
                                                                                    }
                                                                                }
                                                                                if (i14 == i12) {
                                                                                }
                                                                                break;
                                                                            case 18:
                                                                                bitSetWrite = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                write(byteBufferOrder2);
                                                                                while (i15 < iRemoteActionCompatParcelizer) {
                                                                                    RemoteActionCompatParcelizer(linkedHashMap, i15);
                                                                                    pushDataType2 = (PushDataType) linkedHashMap.get(Integer.valueOf(i15));
                                                                                    z4 = bitSetWrite.get(i15);
                                                                                    pushDataType2.RatingCompat = z4;
                                                                                    if (z4) {
                                                                                        RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                        pushDataType2.RemoteActionCompatParcelizer = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 19:
                                                                                bitSetWrite2 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                write(byteBufferOrder2);
                                                                                while (i16 < iRemoteActionCompatParcelizer) {
                                                                                    RemoteActionCompatParcelizer(linkedHashMap, i16);
                                                                                    pushDataType3 = (PushDataType) linkedHashMap.get(Integer.valueOf(i16));
                                                                                    z5 = bitSetWrite2.get(i16);
                                                                                    pushDataType3.MediaMetadataCompat = z5;
                                                                                    if (z5) {
                                                                                        RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                        pushDataType3.IconCompatParcelizer = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 20:
                                                                                bitSetWrite3 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                write(byteBufferOrder2);
                                                                                while (i17 < iRemoteActionCompatParcelizer) {
                                                                                    RemoteActionCompatParcelizer(linkedHashMap, i17);
                                                                                    pushDataType4 = (PushDataType) linkedHashMap.get(Integer.valueOf(i17));
                                                                                    z6 = bitSetWrite3.get(i17);
                                                                                    pushDataType4.MediaBrowserCompatMediaItem = z6;
                                                                                    if (z6) {
                                                                                        RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                        pushDataType4.ParcelableVolumeInfo = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 21:
                                                                                bitSetWrite4 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                write(byteBufferOrder2);
                                                                                while (i18 < iRemoteActionCompatParcelizer) {
                                                                                    RemoteActionCompatParcelizer(linkedHashMap, i18);
                                                                                    pushDataType5 = (PushDataType) linkedHashMap.get(Integer.valueOf(i18));
                                                                                    z7 = bitSetWrite4.get(i18);
                                                                                    pushDataType5.PlaybackStateCompatCustomAction = z7;
                                                                                    if (z7) {
                                                                                        RemoteActionCompatParcelizer(i, byteBufferOrder2);
                                                                                        pushDataType5.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = byteBufferOrder2.getInt();
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                serializer(jRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        serializer(jRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                    }
                                                                    i = 4;
                                                                    i2 = 8;
                                                                }
                                                            }
                                                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Error parsing file names");
                                                        }
                                                        foodoraPermissionDeniedException.MediaBrowserCompatMediaItem = null;
                                                        return foodoraPermissionDeniedException;
                                                    }
                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Additional streams unsupported");
                                                } else {
                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite, "Badly terminated header, found "));
                                                }
                                            }
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Additional streams unsupported");
                                        }
                                    } else if (iWrite != 3) {
                                        i = 4;
                                        if (iWrite == 4) {
                                            write(byteBufferOrder2, getorderid);
                                            iWrite = write(byteBufferOrder2);
                                        }
                                        i2 = 8;
                                        if (iWrite == 5) {
                                            getorderid.serializer = RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(byteBufferOrder2), "numFiles");
                                            iCardinality = -1;
                                            while (true) {
                                                iWrite5 = write(byteBufferOrder2);
                                                if (iWrite5 == 0) {
                                                    getorderid.write = getorderid.serializer - Math.max(iCardinality, 0);
                                                    iWrite = write(byteBufferOrder2);
                                                } else {
                                                    i19 = iPosition;
                                                    jRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(byteBufferOrder2);
                                                    switch (iWrite5) {
                                                        case 14:
                                                            iCardinality = serializer(getorderid.serializer, byteBufferOrder2).cardinality();
                                                            continue;
                                                            continue;
                                                            continue;
                                                            continue;
                                                            iPosition = i19;
                                                            break;
                                                        case 15:
                                                            if (iCardinality != -1) {
                                                                serializer(iCardinality, byteBufferOrder2);
                                                                iPosition = i19;
                                                            } else {
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Header format error: kEmptyStream must appear before kEmptyFile");
                                                            }
                                                            break;
                                                        case 16:
                                                            if (iCardinality != -1) {
                                                                serializer(iCardinality, byteBufferOrder2);
                                                                iPosition = i19;
                                                            } else {
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Header format error: kEmptyStream must appear before kAnti");
                                                            }
                                                            break;
                                                        case 17:
                                                            if (write(byteBufferOrder2) == 0) {
                                                                iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer2 - 1, "file names length");
                                                                if ((iRemoteActionCompatParcelizer2 & 1) == 0) {
                                                                    i21 = 0;
                                                                    while (i20 < iRemoteActionCompatParcelizer2) {
                                                                        RemoteActionCompatParcelizer(2, byteBufferOrder2);
                                                                        if (byteBufferOrder2.getChar() == 0) {
                                                                            i21++;
                                                                        }
                                                                    }
                                                                    if (i21 == getorderid.serializer) {
                                                                        iPosition = i19;
                                                                    } else {
                                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(af$$ExternalSyntheticOutline0.m(getorderid.serializer, ")", ff$$ExternalSyntheticOutline0.m(i21, "Invalid number of file names (", " instead of ")));
                                                                    }
                                                                } else {
                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("File names length invalid");
                                                                }
                                                            } else {
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                            }
                                                            break;
                                                        case 18:
                                                            iCardinality2 = write(getorderid.serializer, byteBufferOrder2).cardinality();
                                                            if (write(byteBufferOrder2) == 0) {
                                                                j3 = iCardinality2 * 8;
                                                                if (serializer(j3, byteBufferOrder2) >= j3) {
                                                                    iPosition = i19;
                                                                } else {
                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid creation dates size");
                                                                }
                                                            } else {
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                            }
                                                            break;
                                                        case 19:
                                                            iCardinality3 = write(getorderid.serializer, byteBufferOrder2).cardinality();
                                                            if (write(byteBufferOrder2) == 0) {
                                                                j4 = iCardinality3 * 8;
                                                                if (serializer(j4, byteBufferOrder2) >= j4) {
                                                                    iPosition = i19;
                                                                } else {
                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid access dates size");
                                                                }
                                                            } else {
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                            }
                                                            break;
                                                        case 20:
                                                            iCardinality4 = write(getorderid.serializer, byteBufferOrder2).cardinality();
                                                            if (write(byteBufferOrder2) == 0) {
                                                                j5 = iCardinality4 * 8;
                                                                if (serializer(j5, byteBufferOrder2) >= j5) {
                                                                    iPosition = i19;
                                                                } else {
                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid modification dates size");
                                                                }
                                                            } else {
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                            }
                                                            break;
                                                        case 21:
                                                            iCardinality5 = write(getorderid.serializer, byteBufferOrder2).cardinality();
                                                            if (write(byteBufferOrder2) == 0) {
                                                                j6 = iCardinality5 * 4;
                                                                if (serializer(j6, byteBufferOrder2) >= j6) {
                                                                    iPosition = i19;
                                                                } else {
                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid windows attributes size");
                                                                }
                                                            } else {
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not implemented");
                                                            }
                                                            break;
                                                        case 22:
                                                        case 23:
                                                        default:
                                                            if (serializer(jRemoteActionCompatParcelizer2, byteBufferOrder2) >= jRemoteActionCompatParcelizer2) {
                                                                iPosition = i19;
                                                            } else {
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite5, "Incomplete property of type "));
                                                            }
                                                            break;
                                                        case 24:
                                                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("kStartPos is unsupported, please report");
                                                            break;
                                                        case 25:
                                                            if (serializer(jRemoteActionCompatParcelizer2, byteBufferOrder2) >= jRemoteActionCompatParcelizer2) {
                                                                iPosition = i19;
                                                            } else {
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Incomplete kDummy property");
                                                            }
                                                            break;
                                                    }
                                                }
                                            }
                                            i3 = iPosition;
                                            if (iWrite == 0) {
                                                getorderid.write(i23);
                                                byteBufferOrder2.position(i3);
                                                iWrite2 = write(byteBufferOrder2);
                                                if (iWrite2 == 2) {
                                                    while (iWrite4 != 0) {
                                                        int iRemoteActionCompatParcelizer10 = (int) RemoteActionCompatParcelizer(byteBufferOrder2);
                                                        RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer10, byteBufferOrder2);
                                                        byteBufferOrder2.get(new byte[iRemoteActionCompatParcelizer10]);
                                                    }
                                                    iWrite2 = write(byteBufferOrder2);
                                                }
                                                if (iWrite2 != 3) {
                                                    if (iWrite2 == 4) {
                                                        RemoteActionCompatParcelizer(byteBufferOrder2, foodoraPermissionDeniedException);
                                                        iWrite2 = write(byteBufferOrder2);
                                                    }
                                                    if (iWrite2 == 5) {
                                                        iRemoteActionCompatParcelizer = (int) RemoteActionCompatParcelizer(byteBufferOrder2);
                                                        linkedHashMap = new LinkedHashMap();
                                                        bitSetSerializer = null;
                                                        bitSetSerializer2 = null;
                                                        bitSetSerializer3 = null;
                                                        while (true) {
                                                            iWrite3 = write(byteBufferOrder2);
                                                            if (iWrite3 == 0) {
                                                                i5 = 0;
                                                                i6 = 0;
                                                                while (i4 < iRemoteActionCompatParcelizer) {
                                                                    pushDataType = (PushDataType) linkedHashMap.get(Integer.valueOf(i4));
                                                                    if (pushDataType != null) {
                                                                        if (bitSetSerializer2 == null) {
                                                                            z = true;
                                                                        } else {
                                                                            z = true;
                                                                        }
                                                                        pushDataType.MediaDescriptionCompat = z;
                                                                        if (z) {
                                                                            r8lambdadeozq815xuuwmllyyvm_qv79qy = foodoraPermissionDeniedException.MediaBrowserCompatMediaItem;
                                                                            if (r8lambdadeozq815xuuwmllyyvm_qv79qy != null) {
                                                                                pushDataType.MediaSessionCompatToken = false;
                                                                                pushDataType.PlaybackStateCompat = false;
                                                                                pushDataType.MediaSessionCompatQueueItem = ((BitSet) r8lambdadeozq815xuuwmllyyvm_qv79qy.write).get(i6);
                                                                                r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy8 = foodoraPermissionDeniedException.MediaBrowserCompatMediaItem;
                                                                                pushDataType.write = ((long[]) r8lambdadeozq815xuuwmllyyvm_qv79qy8.serializer)[i6];
                                                                                j2 = ((long[]) r8lambdadeozq815xuuwmllyyvm_qv79qy8.RemoteActionCompatParcelizer)[i6];
                                                                                pushDataType.ResultReceiver = j2;
                                                                                if (j2 >= 0) {
                                                                                    i6++;
                                                                                } else {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("broken archive, entry with negative size");
                                                                                }
                                                                            } else {
                                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Archive contains file with streams but no subStreamsInfo");
                                                                            }
                                                                        } else {
                                                                            if (bitSetSerializer == null) {
                                                                                z2 = true;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            pushDataType.MediaSessionCompatToken = z2;
                                                                            if (bitSetSerializer3 == null) {
                                                                                z3 = false;
                                                                            } else {
                                                                                z3 = false;
                                                                            }
                                                                            pushDataType.PlaybackStateCompat = z3;
                                                                            pushDataType.MediaSessionCompatQueueItem = false;
                                                                            pushDataType.ResultReceiver = 0L;
                                                                            i5++;
                                                                        }
                                                                    }
                                                                }
                                                                j = 0;
                                                                foodoraPermissionDeniedException.IconCompatParcelizer = (PushDataType[]) linkedHashMap.values().stream().filter(new Predicate() { // from class: o.PushNotificationData
                                                                    @Override // java.util.function.Predicate
                                                                    public final boolean test(Object obj) {
                                                                        return Objects.nonNull((PushDataType) obj);
                                                                    }
                                                                }).toArray(new IntFunction() { // from class: o.getFwFDataQueries
                                                                    @Override // java.util.function.IntFunction
                                                                    public final Object apply(int i215) {
                                                                        return new PushDataType[i215];
                                                                    }
                                                                });
                                                                length = foodoraPermissionDeniedException.read.length;
                                                                r5 = new int[length];
                                                                length2 = 0;
                                                                while (i7 < length) {
                                                                    r5[i7] = length2;
                                                                    length2 += foodoraPermissionDeniedException.read[i7].RatingCompat.length;
                                                                }
                                                                length3 = foodoraPermissionDeniedException.MediaDescriptionCompat.length;
                                                                jArr = new long[length3];
                                                                while (i8 < length3) {
                                                                    jArr[i8] = j;
                                                                    j += foodoraPermissionDeniedException.MediaDescriptionCompat[i8];
                                                                }
                                                                iArr = new int[length];
                                                                iArr2 = new int[foodoraPermissionDeniedException.IconCompatParcelizer.length];
                                                                i9 = 0;
                                                                i10 = 0;
                                                                i11 = 0;
                                                                while (true) {
                                                                    pushDataTypeArr = foodoraPermissionDeniedException.IconCompatParcelizer;
                                                                    if (i11 < pushDataTypeArr.length) {
                                                                        if (pushDataTypeArr[i11].MediaDescriptionCompat) {
                                                                            if (i9 == 0) {
                                                                                while (true) {
                                                                                    sharedPreferencesManagerImplArr = foodoraPermissionDeniedException.read;
                                                                                    if (i10 < sharedPreferencesManagerImplArr.length) {
                                                                                        iArr[i10] = i11;
                                                                                        if (sharedPreferencesManagerImplArr[i10].MediaDescriptionCompat <= 0) {
                                                                                            i10++;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (i10 >= sharedPreferencesManagerImplArr.length) {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Too few folders in archive");
                                                                                }
                                                                            }
                                                                            iArr2[i11] = i10;
                                                                            if (!foodoraPermissionDeniedException.IconCompatParcelizer[i11].MediaDescriptionCompat) {
                                                                                i10++;
                                                                                i9 = 0;
                                                                            }
                                                                        } else {
                                                                            if (i9 == 0) {
                                                                                while (true) {
                                                                                    sharedPreferencesManagerImplArr = foodoraPermissionDeniedException.read;
                                                                                    if (i10 < sharedPreferencesManagerImplArr.length) {
                                                                                        iArr[i10] = i11;
                                                                                        if (sharedPreferencesManagerImplArr[i10].MediaDescriptionCompat <= 0) {
                                                                                            i10++;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (i10 >= sharedPreferencesManagerImplArr.length) {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Too few folders in archive");
                                                                                }
                                                                            }
                                                                            iArr2[i11] = i10;
                                                                            if (!foodoraPermissionDeniedException.IconCompatParcelizer[i11].MediaDescriptionCompat) {
                                                                                i10++;
                                                                                i9 = 0;
                                                                            }
                                                                        }
                                                                        i11++;
                                                                    } else {
                                                                        foodoraPermissionDeniedException.MediaMetadataCompat = new isContentCardsUnreadVisualIndicatorEnabled(r5, jArr, iArr, iArr2, 20);
                                                                        write(byteBufferOrder2);
                                                                    }
                                                                }
                                                            } else {
                                                                jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(byteBufferOrder2);
                                                                if (iWrite3 != 25) {
                                                                    switch (iWrite3) {
                                                                        case 14:
                                                                            bitSetSerializer2 = serializer(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                            break;
                                                                        case 15:
                                                                            bitSetSerializer = serializer(bitSetSerializer2.cardinality(), byteBufferOrder2);
                                                                            break;
                                                                        case 16:
                                                                            bitSetSerializer3 = serializer(bitSetSerializer2.cardinality(), byteBufferOrder2);
                                                                            break;
                                                                        case 17:
                                                                            write(byteBufferOrder2);
                                                                            i12 = (int) (jRemoteActionCompatParcelizer - 1);
                                                                            bArr2 = new byte[i12];
                                                                            RemoteActionCompatParcelizer(i12, byteBufferOrder2);
                                                                            byteBufferOrder2.get(bArr2);
                                                                            int i215 = 0;
                                                                            i14 = 0;
                                                                            while (i13 < i12) {
                                                                                if (bArr2[i13] != 0) {
                                                                                }
                                                                            }
                                                                            if (i14 == i12) {
                                                                            }
                                                                            break;
                                                                        case 18:
                                                                            bitSetWrite = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                            write(byteBufferOrder2);
                                                                            while (i15 < iRemoteActionCompatParcelizer) {
                                                                                RemoteActionCompatParcelizer(linkedHashMap, i15);
                                                                                pushDataType2 = (PushDataType) linkedHashMap.get(Integer.valueOf(i15));
                                                                                z4 = bitSetWrite.get(i15);
                                                                                pushDataType2.RatingCompat = z4;
                                                                                if (z4) {
                                                                                    RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                    pushDataType2.RemoteActionCompatParcelizer = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 19:
                                                                            bitSetWrite2 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                            write(byteBufferOrder2);
                                                                            while (i16 < iRemoteActionCompatParcelizer) {
                                                                                RemoteActionCompatParcelizer(linkedHashMap, i16);
                                                                                pushDataType3 = (PushDataType) linkedHashMap.get(Integer.valueOf(i16));
                                                                                z5 = bitSetWrite2.get(i16);
                                                                                pushDataType3.MediaMetadataCompat = z5;
                                                                                if (z5) {
                                                                                    RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                    pushDataType3.IconCompatParcelizer = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 20:
                                                                            bitSetWrite3 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                            write(byteBufferOrder2);
                                                                            while (i17 < iRemoteActionCompatParcelizer) {
                                                                                RemoteActionCompatParcelizer(linkedHashMap, i17);
                                                                                pushDataType4 = (PushDataType) linkedHashMap.get(Integer.valueOf(i17));
                                                                                z6 = bitSetWrite3.get(i17);
                                                                                pushDataType4.MediaBrowserCompatMediaItem = z6;
                                                                                if (z6) {
                                                                                    RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                    pushDataType4.ParcelableVolumeInfo = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 21:
                                                                            bitSetWrite4 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                            write(byteBufferOrder2);
                                                                            while (i18 < iRemoteActionCompatParcelizer) {
                                                                                RemoteActionCompatParcelizer(linkedHashMap, i18);
                                                                                pushDataType5 = (PushDataType) linkedHashMap.get(Integer.valueOf(i18));
                                                                                z7 = bitSetWrite4.get(i18);
                                                                                pushDataType5.PlaybackStateCompatCustomAction = z7;
                                                                                if (z7) {
                                                                                    RemoteActionCompatParcelizer(i, byteBufferOrder2);
                                                                                    pushDataType5.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = byteBufferOrder2.getInt();
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            serializer(jRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                            break;
                                                                    }
                                                                } else {
                                                                    serializer(jRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                }
                                                                i = 4;
                                                                i2 = 8;
                                                            }
                                                        }
                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Error parsing file names");
                                                    }
                                                    foodoraPermissionDeniedException.MediaBrowserCompatMediaItem = null;
                                                    return foodoraPermissionDeniedException;
                                                }
                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Additional streams unsupported");
                                            } else {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite, "Badly terminated header, found "));
                                            }
                                        } else {
                                            i3 = iPosition;
                                            if (iWrite == 0) {
                                                getorderid.write(i23);
                                                byteBufferOrder2.position(i3);
                                                iWrite2 = write(byteBufferOrder2);
                                                if (iWrite2 == 2) {
                                                    while (iWrite4 != 0) {
                                                        int iRemoteActionCompatParcelizer11 = (int) RemoteActionCompatParcelizer(byteBufferOrder2);
                                                        RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer11, byteBufferOrder2);
                                                        byteBufferOrder2.get(new byte[iRemoteActionCompatParcelizer11]);
                                                    }
                                                    iWrite2 = write(byteBufferOrder2);
                                                }
                                                if (iWrite2 != 3) {
                                                    if (iWrite2 == 4) {
                                                        RemoteActionCompatParcelizer(byteBufferOrder2, foodoraPermissionDeniedException);
                                                        iWrite2 = write(byteBufferOrder2);
                                                    }
                                                    if (iWrite2 == 5) {
                                                        iRemoteActionCompatParcelizer = (int) RemoteActionCompatParcelizer(byteBufferOrder2);
                                                        linkedHashMap = new LinkedHashMap();
                                                        bitSetSerializer = null;
                                                        bitSetSerializer2 = null;
                                                        bitSetSerializer3 = null;
                                                        while (true) {
                                                            iWrite3 = write(byteBufferOrder2);
                                                            if (iWrite3 == 0) {
                                                                i5 = 0;
                                                                i6 = 0;
                                                                while (i4 < iRemoteActionCompatParcelizer) {
                                                                    pushDataType = (PushDataType) linkedHashMap.get(Integer.valueOf(i4));
                                                                    if (pushDataType != null) {
                                                                        if (bitSetSerializer2 == null) {
                                                                            z = true;
                                                                        } else {
                                                                            z = true;
                                                                        }
                                                                        pushDataType.MediaDescriptionCompat = z;
                                                                        if (z) {
                                                                            r8lambdadeozq815xuuwmllyyvm_qv79qy = foodoraPermissionDeniedException.MediaBrowserCompatMediaItem;
                                                                            if (r8lambdadeozq815xuuwmllyyvm_qv79qy != null) {
                                                                                pushDataType.MediaSessionCompatToken = false;
                                                                                pushDataType.PlaybackStateCompat = false;
                                                                                pushDataType.MediaSessionCompatQueueItem = ((BitSet) r8lambdadeozq815xuuwmllyyvm_qv79qy.write).get(i6);
                                                                                r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy9 = foodoraPermissionDeniedException.MediaBrowserCompatMediaItem;
                                                                                pushDataType.write = ((long[]) r8lambdadeozq815xuuwmllyyvm_qv79qy9.serializer)[i6];
                                                                                j2 = ((long[]) r8lambdadeozq815xuuwmllyyvm_qv79qy9.RemoteActionCompatParcelizer)[i6];
                                                                                pushDataType.ResultReceiver = j2;
                                                                                if (j2 >= 0) {
                                                                                    i6++;
                                                                                } else {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("broken archive, entry with negative size");
                                                                                }
                                                                            } else {
                                                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Archive contains file with streams but no subStreamsInfo");
                                                                            }
                                                                        } else {
                                                                            if (bitSetSerializer == null) {
                                                                                z2 = true;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            pushDataType.MediaSessionCompatToken = z2;
                                                                            if (bitSetSerializer3 == null) {
                                                                                z3 = false;
                                                                            } else {
                                                                                z3 = false;
                                                                            }
                                                                            pushDataType.PlaybackStateCompat = z3;
                                                                            pushDataType.MediaSessionCompatQueueItem = false;
                                                                            pushDataType.ResultReceiver = 0L;
                                                                            i5++;
                                                                        }
                                                                    }
                                                                }
                                                                j = 0;
                                                                foodoraPermissionDeniedException.IconCompatParcelizer = (PushDataType[]) linkedHashMap.values().stream().filter(new Predicate() { // from class: o.PushNotificationData
                                                                    @Override // java.util.function.Predicate
                                                                    public final boolean test(Object obj) {
                                                                        return Objects.nonNull((PushDataType) obj);
                                                                    }
                                                                }).toArray(new IntFunction() { // from class: o.getFwFDataQueries
                                                                    @Override // java.util.function.IntFunction
                                                                    public final Object apply(int i216) {
                                                                        return new PushDataType[i216];
                                                                    }
                                                                });
                                                                length = foodoraPermissionDeniedException.read.length;
                                                                r5 = new int[length];
                                                                length2 = 0;
                                                                while (i7 < length) {
                                                                    r5[i7] = length2;
                                                                    length2 += foodoraPermissionDeniedException.read[i7].RatingCompat.length;
                                                                }
                                                                length3 = foodoraPermissionDeniedException.MediaDescriptionCompat.length;
                                                                jArr = new long[length3];
                                                                while (i8 < length3) {
                                                                    jArr[i8] = j;
                                                                    j += foodoraPermissionDeniedException.MediaDescriptionCompat[i8];
                                                                }
                                                                iArr = new int[length];
                                                                iArr2 = new int[foodoraPermissionDeniedException.IconCompatParcelizer.length];
                                                                i9 = 0;
                                                                i10 = 0;
                                                                i11 = 0;
                                                                while (true) {
                                                                    pushDataTypeArr = foodoraPermissionDeniedException.IconCompatParcelizer;
                                                                    if (i11 < pushDataTypeArr.length) {
                                                                        if (pushDataTypeArr[i11].MediaDescriptionCompat) {
                                                                            if (i9 == 0) {
                                                                                while (true) {
                                                                                    sharedPreferencesManagerImplArr = foodoraPermissionDeniedException.read;
                                                                                    if (i10 < sharedPreferencesManagerImplArr.length) {
                                                                                        iArr[i10] = i11;
                                                                                        if (sharedPreferencesManagerImplArr[i10].MediaDescriptionCompat <= 0) {
                                                                                            i10++;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (i10 >= sharedPreferencesManagerImplArr.length) {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Too few folders in archive");
                                                                                }
                                                                            }
                                                                            iArr2[i11] = i10;
                                                                            if (!foodoraPermissionDeniedException.IconCompatParcelizer[i11].MediaDescriptionCompat) {
                                                                                i10++;
                                                                                i9 = 0;
                                                                            }
                                                                        } else {
                                                                            if (i9 == 0) {
                                                                                while (true) {
                                                                                    sharedPreferencesManagerImplArr = foodoraPermissionDeniedException.read;
                                                                                    if (i10 < sharedPreferencesManagerImplArr.length) {
                                                                                        iArr[i10] = i11;
                                                                                        if (sharedPreferencesManagerImplArr[i10].MediaDescriptionCompat <= 0) {
                                                                                            i10++;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (i10 >= sharedPreferencesManagerImplArr.length) {
                                                                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Too few folders in archive");
                                                                                }
                                                                            }
                                                                            iArr2[i11] = i10;
                                                                            if (!foodoraPermissionDeniedException.IconCompatParcelizer[i11].MediaDescriptionCompat) {
                                                                                i10++;
                                                                                i9 = 0;
                                                                            }
                                                                        }
                                                                        i11++;
                                                                    } else {
                                                                        foodoraPermissionDeniedException.MediaMetadataCompat = new isContentCardsUnreadVisualIndicatorEnabled(r5, jArr, iArr, iArr2, 20);
                                                                        write(byteBufferOrder2);
                                                                    }
                                                                }
                                                            } else {
                                                                jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(byteBufferOrder2);
                                                                if (iWrite3 != 25) {
                                                                    switch (iWrite3) {
                                                                        case 14:
                                                                            bitSetSerializer2 = serializer(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                            break;
                                                                        case 15:
                                                                            bitSetSerializer = serializer(bitSetSerializer2.cardinality(), byteBufferOrder2);
                                                                            break;
                                                                        case 16:
                                                                            bitSetSerializer3 = serializer(bitSetSerializer2.cardinality(), byteBufferOrder2);
                                                                            break;
                                                                        case 17:
                                                                            write(byteBufferOrder2);
                                                                            i12 = (int) (jRemoteActionCompatParcelizer - 1);
                                                                            bArr2 = new byte[i12];
                                                                            RemoteActionCompatParcelizer(i12, byteBufferOrder2);
                                                                            byteBufferOrder2.get(bArr2);
                                                                            int i216 = 0;
                                                                            i14 = 0;
                                                                            while (i13 < i12) {
                                                                                if (bArr2[i13] != 0) {
                                                                                }
                                                                            }
                                                                            if (i14 == i12) {
                                                                            }
                                                                            break;
                                                                        case 18:
                                                                            bitSetWrite = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                            write(byteBufferOrder2);
                                                                            while (i15 < iRemoteActionCompatParcelizer) {
                                                                                RemoteActionCompatParcelizer(linkedHashMap, i15);
                                                                                pushDataType2 = (PushDataType) linkedHashMap.get(Integer.valueOf(i15));
                                                                                z4 = bitSetWrite.get(i15);
                                                                                pushDataType2.RatingCompat = z4;
                                                                                if (z4) {
                                                                                    RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                    pushDataType2.RemoteActionCompatParcelizer = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 19:
                                                                            bitSetWrite2 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                            write(byteBufferOrder2);
                                                                            while (i16 < iRemoteActionCompatParcelizer) {
                                                                                RemoteActionCompatParcelizer(linkedHashMap, i16);
                                                                                pushDataType3 = (PushDataType) linkedHashMap.get(Integer.valueOf(i16));
                                                                                z5 = bitSetWrite2.get(i16);
                                                                                pushDataType3.MediaMetadataCompat = z5;
                                                                                if (z5) {
                                                                                    RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                    pushDataType3.IconCompatParcelizer = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 20:
                                                                            bitSetWrite3 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                            write(byteBufferOrder2);
                                                                            while (i17 < iRemoteActionCompatParcelizer) {
                                                                                RemoteActionCompatParcelizer(linkedHashMap, i17);
                                                                                pushDataType4 = (PushDataType) linkedHashMap.get(Integer.valueOf(i17));
                                                                                z6 = bitSetWrite3.get(i17);
                                                                                pushDataType4.MediaBrowserCompatMediaItem = z6;
                                                                                if (z6) {
                                                                                    RemoteActionCompatParcelizer(i2, byteBufferOrder2);
                                                                                    pushDataType4.ParcelableVolumeInfo = getAuthToken.IconCompatParcelizer(byteBufferOrder2.getLong());
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 21:
                                                                            bitSetWrite4 = write(iRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                            write(byteBufferOrder2);
                                                                            while (i18 < iRemoteActionCompatParcelizer) {
                                                                                RemoteActionCompatParcelizer(linkedHashMap, i18);
                                                                                pushDataType5 = (PushDataType) linkedHashMap.get(Integer.valueOf(i18));
                                                                                z7 = bitSetWrite4.get(i18);
                                                                                pushDataType5.PlaybackStateCompatCustomAction = z7;
                                                                                if (z7) {
                                                                                    RemoteActionCompatParcelizer(i, byteBufferOrder2);
                                                                                    pushDataType5.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = byteBufferOrder2.getInt();
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            serializer(jRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                            break;
                                                                    }
                                                                } else {
                                                                    serializer(jRemoteActionCompatParcelizer, byteBufferOrder2);
                                                                }
                                                                i = 4;
                                                                i2 = 8;
                                                            }
                                                        }
                                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Error parsing file names");
                                                    }
                                                    foodoraPermissionDeniedException.MediaBrowserCompatMediaItem = null;
                                                    return foodoraPermissionDeniedException;
                                                }
                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Additional streams unsupported");
                                            } else {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite, "Badly terminated header, found "));
                                            }
                                        }
                                    } else {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Additional streams unsupported");
                                    }
                                } else {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Broken or unsupported archive: no Header");
                                }
                            } else {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("NextHeader CRC-32 mismatch");
                            }
                            return null;
                        }
                        throw new IOException("nextHeaderSize is out of bounds");
                    }
                    throw new IOException("nextHeaderOffset is out of bounds");
                } catch (Throwable th) {
                    try {
                        dataInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            throw new IOException(String.format("Unsupported 7z version (%d,%d)", Byte.valueOf(b), Byte.valueOf(b2)));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Bad 7z signature");
        return null;
    }

    public final int write(byte[] bArr) throws IOException {
        InputStream byteArrayInputStream;
        int length = bArr.length;
        if (length == 0) {
            return 0;
        }
        if (this.IconCompatParcelizer.IconCompatParcelizer[this.read].ResultReceiver == 0) {
            byteArrayInputStream = new ByteArrayInputStream(toJson.IconCompatParcelizer);
        } else {
            ArrayList arrayList = this.MediaBrowserCompatMediaItem;
            if (arrayList.isEmpty()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("No current 7z entry (call getNextEntry() first).");
                return 0;
            }
            while (arrayList.size() > 1) {
                InputStream inputStream = (InputStream) arrayList.remove(0);
                try {
                    ThreadLocal threadLocal = UnreadCountDetailsJsonAdapter.RemoteActionCompatParcelizer;
                    long j = Long.MAX_VALUE;
                    while (j > 0) {
                        byte[] bArr2 = UnreadCountDetailsJsonAdapter.serializer;
                        Arrays.fill(bArr2, (byte) 0);
                        long j2 = inputStream.read(bArr2, 0, (int) Math.min(j, bArr2.length));
                        if (j2 < 0) {
                            break;
                        }
                        j -= j2;
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            byteArrayInputStream = (InputStream) arrayList.get(0);
        }
        return byteArrayInputStream.read(bArr, 0, length);
    }

    public static int write(ByteBuffer byteBuffer) throws EOFException {
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        DrawableTransformation.IconCompatParcelizer();
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SeekableByteChannel seekableByteChannel = this.write;
        if (seekableByteChannel != null) {
            try {
                seekableByteChannel.close();
            } finally {
                this.write = null;
                byte[] bArr = this.MediaDescriptionCompat;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                this.MediaDescriptionCompat = null;
            }
        }
    }

    public final void write(ByteBuffer byteBuffer, getOrderID getorderid) throws IOException {
        ByteBuffer byteBuffer2;
        String str;
        int i;
        int iCardinality;
        BitSet bitSet;
        ByteBuffer byteBuffer3 = byteBuffer;
        int iWrite = write(byteBuffer);
        long j = 0;
        if (iWrite == 6) {
            long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(byteBuffer);
            if (jRemoteActionCompatParcelizer >= 0) {
                long j2 = 32 + jRemoteActionCompatParcelizer;
                if (j2 <= this.write.size() && j2 >= 0) {
                    getorderid.MediaSessionCompatQueueItem = RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(byteBuffer), "numPackStreams");
                    int iWrite2 = write(byteBuffer);
                    if (iWrite2 == 9) {
                        long j3 = 0;
                        int i2 = 0;
                        while (i2 < getorderid.MediaSessionCompatQueueItem) {
                            int i3 = i2;
                            long jRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(byteBuffer);
                            j3 += jRemoteActionCompatParcelizer2;
                            long j4 = j2 + j3;
                            if (jRemoteActionCompatParcelizer2 < 0 || j4 > this.write.size() || j4 < jRemoteActionCompatParcelizer) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(m1$$ExternalSyntheticOutline0.m(jRemoteActionCompatParcelizer2, "packSize (", ") is out of range"));
                                return;
                            }
                            i2 = i3 + 1;
                        }
                        iWrite2 = write(byteBuffer);
                    }
                    if (iWrite2 == 10) {
                        long jCardinality = write(getorderid.MediaSessionCompatQueueItem, byteBuffer3).cardinality() * 4;
                        if (serializer(jCardinality, byteBuffer3) >= jCardinality) {
                            iWrite2 = write(byteBuffer);
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid number of CRCs in PackInfo");
                            return;
                        }
                    }
                    if (iWrite2 == 0) {
                        iWrite = write(byteBuffer);
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(d$$ExternalSyntheticOutline0.m(iWrite2, "Badly terminated PackInfo (", ")"));
                        return;
                    }
                }
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(m1$$ExternalSyntheticOutline0.m(jRemoteActionCompatParcelizer, "packPos (", ") is out of range"));
            return;
        }
        String str2 = "negative unpackSize";
        if (iWrite != 7) {
            byteBuffer2 = byteBuffer3;
            str = "negative unpackSize";
            i = 0;
        } else {
            int iWrite3 = write(byteBuffer);
            if (iWrite3 == 11) {
                getorderid.IconCompatParcelizer = RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(byteBuffer), "numFolders");
                if (write(byteBuffer) == 0) {
                    LinkedList linkedList = new LinkedList();
                    int i4 = 0;
                    while (true) {
                        int i5 = getorderid.IconCompatParcelizer;
                        if (i4 >= i5) {
                            str = str2;
                            i = 0;
                            if (getorderid.MediaDescriptionCompat - (getorderid.MediaBrowserCompatMediaItem - ((long) i5)) >= getorderid.MediaSessionCompatQueueItem) {
                                int iWrite4 = write(byteBuffer);
                                if (iWrite4 == 12) {
                                    Iterator it = linkedList.iterator();
                                    while (it.hasNext()) {
                                        int iIntValue = ((Integer) it.next()).intValue();
                                        for (int i6 = 0; i6 < iIntValue; i6++) {
                                            if (RemoteActionCompatParcelizer(byteBuffer) < 0) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str);
                                                return;
                                            }
                                        }
                                    }
                                    int iWrite5 = write(byteBuffer);
                                    if (iWrite5 == 10) {
                                        byteBuffer2 = byteBuffer;
                                        BitSet bitSetWrite = write(getorderid.IconCompatParcelizer, byteBuffer2);
                                        getorderid.read = bitSetWrite;
                                        long jCardinality2 = bitSetWrite.cardinality() * 4;
                                        if (serializer(jCardinality2, byteBuffer2) >= jCardinality2) {
                                            iWrite5 = write(byteBuffer);
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid number of CRCs in UnpackInfo");
                                            return;
                                        }
                                    } else {
                                        byteBuffer2 = byteBuffer;
                                    }
                                    if (iWrite5 == 0) {
                                        iWrite = write(byteBuffer);
                                        break;
                                    } else {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Badly terminated UnpackInfo");
                                        return;
                                    }
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite4, "Expected kCodersUnpackSize, got "));
                                return;
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("archive doesn't contain enough packed streams");
                            return;
                        }
                        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(byteBuffer), "numCoders");
                        if (iRemoteActionCompatParcelizer != 0) {
                            getorderid.RemoteActionCompatParcelizer += (long) iRemoteActionCompatParcelizer;
                            long jRemoteActionCompatParcelizer3 = j;
                            long jRemoteActionCompatParcelizer4 = jRemoteActionCompatParcelizer3;
                            for (int i7 = 0; i7 < iRemoteActionCompatParcelizer; i7++) {
                                int iWrite6 = write(byteBuffer);
                                int i8 = iWrite6 & 15;
                                RemoteActionCompatParcelizer(i8, byteBuffer3);
                                byteBuffer3.get(new byte[i8]);
                                boolean z = (iWrite6 & 16) == 0;
                                boolean z2 = (iWrite6 & 32) != 0;
                                if ((iWrite6 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Alternative methods are unsupported, please report. The reference implementation doesn't support them either.");
                                    return;
                                }
                                if (z) {
                                    jRemoteActionCompatParcelizer3++;
                                    jRemoteActionCompatParcelizer4++;
                                } else {
                                    jRemoteActionCompatParcelizer3 += (long) RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(byteBuffer), "numInStreams");
                                    jRemoteActionCompatParcelizer4 += (long) RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(byteBuffer), "numOutStreams");
                                }
                                if (z2) {
                                    long jRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(byteBuffer), "propertiesSize");
                                    if (serializer(jRemoteActionCompatParcelizer5, byteBuffer3) < jRemoteActionCompatParcelizer5) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid propertiesSize in folder");
                                        return;
                                    }
                                }
                            }
                            RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer3, "totalInStreams");
                            RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer4, "totalOutStreams");
                            getorderid.MediaBrowserCompatMediaItem += jRemoteActionCompatParcelizer4;
                            getorderid.MediaDescriptionCompat += jRemoteActionCompatParcelizer3;
                            if (jRemoteActionCompatParcelizer4 != 0) {
                                int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer4 - 1, "numBindPairs");
                                long j5 = iRemoteActionCompatParcelizer2;
                                if (jRemoteActionCompatParcelizer3 >= j5) {
                                    BitSet bitSet2 = new BitSet((int) jRemoteActionCompatParcelizer3);
                                    int i9 = 0;
                                    while (i9 < iRemoteActionCompatParcelizer2) {
                                        int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(byteBuffer), "inIndex");
                                        String str3 = str2;
                                        int i10 = iRemoteActionCompatParcelizer2;
                                        if (jRemoteActionCompatParcelizer3 > iRemoteActionCompatParcelizer3) {
                                            bitSet2.set(iRemoteActionCompatParcelizer3);
                                            if (jRemoteActionCompatParcelizer4 <= RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(byteBuffer), "outIndex")) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("outIndex is bigger than number of outStreams");
                                                return;
                                            } else {
                                                i9++;
                                                str2 = str3;
                                                iRemoteActionCompatParcelizer2 = i10;
                                            }
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("inIndex is bigger than number of inStreams");
                                            return;
                                        }
                                    }
                                    String str4 = str2;
                                    int iRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer3 - j5, "numPackedStreams");
                                    if (iRemoteActionCompatParcelizer4 != 1) {
                                        for (int i11 = 0; i11 < iRemoteActionCompatParcelizer4; i11++) {
                                            if (RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(byteBuffer), "packedStreamIndex") >= jRemoteActionCompatParcelizer3) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("packedStreamIndex is bigger than number of totalInStreams");
                                                return;
                                            }
                                        }
                                    } else if (bitSet2.nextClearBit(0) == -1) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Couldn't find stream's bind pair index");
                                        return;
                                    }
                                    linkedList.add(Integer.valueOf((int) jRemoteActionCompatParcelizer4));
                                    i4++;
                                    str2 = str4;
                                    j = 0;
                                    byteBuffer3 = byteBuffer;
                                } else {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Total input streams can't be less than the number of bind pairs");
                                    return;
                                }
                            } else {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Total output streams can't be 0");
                                return;
                            }
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Folder without coders");
                            return;
                        }
                    }
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("External unsupported");
                    return;
                }
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite3, "Expected kFolder, got "));
                return;
            }
        }
        if (iWrite == 8) {
            int iWrite7 = write(byteBuffer);
            LinkedList linkedList2 = new LinkedList();
            if (iWrite7 == 13) {
                for (int i12 = i; i12 < getorderid.IconCompatParcelizer; i12++) {
                    linkedList2.add(Integer.valueOf(RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(byteBuffer), "numStreams")));
                }
                getorderid.MediaMetadataCompat = linkedList2.stream().mapToLong(new H3Core$$ExternalSyntheticLambda1(2)).sum();
                iWrite7 = write(byteBuffer);
            } else {
                getorderid.MediaMetadataCompat = getorderid.IconCompatParcelizer;
            }
            RemoteActionCompatParcelizer(getorderid.MediaMetadataCompat, "totalUnpackStreams");
            if (iWrite7 == 9) {
                Iterator it2 = linkedList2.iterator();
                while (it2.hasNext()) {
                    int iIntValue2 = ((Integer) it2.next()).intValue();
                    if (iIntValue2 != 0) {
                        for (int i13 = i; i13 < iIntValue2 - 1; i13++) {
                            if (RemoteActionCompatParcelizer(byteBuffer) < 0) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(str);
                                return;
                            }
                        }
                    }
                }
                iWrite7 = write(byteBuffer);
            }
            if (linkedList2.isEmpty()) {
                BitSet bitSet3 = getorderid.read;
                iCardinality = getorderid.IconCompatParcelizer;
                if (bitSet3 != null) {
                    iCardinality -= bitSet3.cardinality();
                }
            } else {
                Iterator it3 = linkedList2.iterator();
                int i14 = i;
                while (it3.hasNext()) {
                    int iIntValue3 = ((Integer) it3.next()).intValue();
                    if (iIntValue3 == 1 && (bitSet = getorderid.read) != null) {
                        int i15 = i14 + 1;
                        if (bitSet.get(i14)) {
                            i14 = i15;
                        } else {
                            i14 = i15;
                        }
                    }
                    i += iIntValue3;
                }
                iCardinality = i;
            }
            if (iWrite7 == 10) {
                RemoteActionCompatParcelizer(iCardinality, "numDigests");
                long jCardinality3 = write(iCardinality, byteBuffer2).cardinality() * 4;
                if (serializer(jCardinality3, byteBuffer2) >= jCardinality3) {
                    iWrite7 = write(byteBuffer);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid number of missing CRCs in SubStreamInfo");
                    return;
                }
            }
            if (iWrite7 == 0) {
                iWrite = write(byteBuffer);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Badly terminated SubStreamsInfo");
                return;
            }
        }
        if (iWrite == 0) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Badly terminated StreamsInfo");
    }

    public static void RemoteActionCompatParcelizer(LinkedHashMap linkedHashMap, int i) {
        linkedHashMap.computeIfAbsent(Integer.valueOf(i), new H3Core$$ExternalSyntheticLambda2(12));
    }

    public static BitSet write(int i, ByteBuffer byteBuffer) {
        if (write(byteBuffer) == 0) {
            return serializer(i, byteBuffer);
        }
        BitSet bitSet = new BitSet(i);
        for (int i2 = 0; i2 < i; i2++) {
            bitSet.set(i2, true);
        }
        return bitSet;
    }

    public static long serializer(long j, ByteBuffer byteBuffer) {
        if (j < 1) {
            return 0L;
        }
        int iPosition = byteBuffer.position();
        long jRemaining = byteBuffer.remaining();
        if (jRemaining < j) {
            j = jRemaining;
        }
        byteBuffer.position(iPosition + ((int) j));
        return j;
    }

    public static void RemoteActionCompatParcelizer(int i, ByteBuffer byteBuffer) throws EOFException {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining < i) {
            throw new EOFException(String.format("remaining %,d < expectRemaining %,d", Integer.valueOf(iRemaining), Integer.valueOf(i)));
        }
    }

    public static int RemoteActionCompatParcelizer(long j, String str) throws IOException {
        if (j > 2147483647L || j < 0) {
            throw new IOException(String.format("Cannot handle % %,d", str, Long.valueOf(j)));
        }
        return (int) j;
    }

    public static long RemoteActionCompatParcelizer(ByteBuffer byteBuffer) {
        long jWrite = write(byteBuffer);
        int i = androidx.compose.ui.graphics.Fields.SpotShadowColor;
        long jWrite2 = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            if ((((long) i) & jWrite) == 0) {
                return ((jWrite & ((long) (i - 1))) << (i2 * 8)) | jWrite2;
            }
            jWrite2 |= ((long) write(byteBuffer)) << (i2 * 8);
            i >>>= 1;
        }
        return jWrite2;
    }
}
